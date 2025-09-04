package com.hunghv.indentityservice.service;

import com.hunghv.indentityservice.dto.request.UserCreationRequest;
import com.hunghv.indentityservice.dto.request.UserUpdateRequest;
import com.hunghv.indentityservice.dto.response.UserResponse;
import com.hunghv.indentityservice.entity.User;

import java.util.List;

public interface UserService {
    UserResponse createUser(UserCreationRequest request);

    List<User> getUsers();

    User getUserById(String id);

    User updateUser(String userId, UserUpdateRequest request);

    void deleteUser(String userId);
}