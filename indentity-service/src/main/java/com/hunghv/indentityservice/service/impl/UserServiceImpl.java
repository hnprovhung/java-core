package com.hunghv.indentityservice.service.impl;

import com.hunghv.indentityservice.dto.request.UserCreationRequest;
import com.hunghv.indentityservice.dto.request.UserUpdateRequest;
import com.hunghv.indentityservice.entity.User;
import com.hunghv.indentityservice.exception.AppException;
import com.hunghv.indentityservice.exception.ErrorCode;
import com.hunghv.indentityservice.mapper.UserMapper;
import com.hunghv.indentityservice.repository.UserRepository;
import com.hunghv.indentityservice.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserServiceImpl implements UserService {
    UserRepository userRepository;
    UserMapper userMapper;

    @Override
    public User createUser(UserCreationRequest request) {
        User user = userMapper.toUser(request);
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String id) {
        return userRepository.findById(id).orElseThrow(() -> new AppException(ErrorCode.ENTITY_NOT_FOUND));
    }

    @Override
    public User updateUser(String userId, UserUpdateRequest request) {
        User user = getUserById(userId);
        userMapper.updateUser(user, request);
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }
}