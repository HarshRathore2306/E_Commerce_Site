package com.poc.ecommerce.user.UserService;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.poc.ecommerce.user.UserEntity.UserEntity;

@Service
public interface UserService {
    UserEntity getUserById(String userId);
    List<UserEntity> getAllUsers();
    UserEntity saveUser(UserEntity userEntity);
    UserEntity updateUser(UserEntity userEntity);
    UserEntity deleteUser(String userId);

}
