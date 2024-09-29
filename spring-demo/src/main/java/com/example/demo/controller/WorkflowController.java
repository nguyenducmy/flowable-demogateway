package com.example.demo.controller;

import com.example.demo.model.dto.RegistCardDto;
import com.example.demo.service.FlowService;
import lombok.Data;
import org.flowable.engine.TaskService;
import org.flowable.engine.runtime.ProcessInstance;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController(value = "/api/v1/flow")
@Data
public class WorkflowController {

    private final FlowService flowService;
    private final TaskService taskService;


    @PostMapping(value = "/initialFlow")
    public String create(@RequestBody RegistCardDto registCardDto) {
        ProcessInstance registCardProcess = flowService.initiateFlow(registCardDto);

        return "create";
    }
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/tasks/{id}/complete", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public void completeTask(@PathVariable("id") String id) {

        taskService.complete(id);
    }
}
