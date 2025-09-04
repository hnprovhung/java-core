package com.hunghv.indentityservice.mapper;

import com.hunghv.indentityservice.dto.request.UserCreationRequest;
import com.hunghv.indentityservice.dto.request.UserUpdateRequest;
import com.hunghv.indentityservice.dto.response.UserResponse;
import com.hunghv.indentityservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}