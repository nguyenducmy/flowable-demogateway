package com.example.demo.model.mapper;

import com.example.demo.model.dto.UserDto;
import com.example.demo.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {


    User req2Entity(UserDto user);

    UserDto ent2Dto(User user);
}
