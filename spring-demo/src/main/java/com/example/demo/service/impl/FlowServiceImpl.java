package com.example.demo.service.impl;

import com.example.demo.model.dto.RegistCardDto;
import com.example.demo.service.FlowService;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.repository.Deployment;
import org.flowable.engine.runtime.ProcessInstance;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FlowServiceImpl implements FlowService {

    private final RuntimeService runtimeService;
    private final TaskService taskService;
    private final RepositoryService repositoryService;

    public FlowServiceImpl(RuntimeService runtimeService, TaskService taskService, RepositoryService repositoryService) {
        this.runtimeService = runtimeService;
        this.taskService = taskService;
        this.repositoryService = repositoryService;
    }


    @Override
    public ProcessInstance initiateFlow(RegistCardDto registCardDto){
        Map<String, Object> variables = new HashMap<>();
        variables.put("cif", registCardDto.getCif());
        variables.put("account", registCardDto.getAccount());
        variables.put("fullname", registCardDto.getFullName());
        variables.put("isCheckCIC", false);
        Deployment deployment = repositoryService.createDeployment()
                .addClasspathResource("processes/demogateway.bpmn20.xml")
                .deploy();
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("demogateway", variables);

        return processInstance;
    }

    @Override
    public void complete(String id) {
//        taskService.claim(id, "validator");
        taskService.complete(id);
    }
}
