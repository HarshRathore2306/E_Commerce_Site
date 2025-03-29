package com.poc.ecommerce.user.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.poc.ecommerce.user.Exception.ResourceNotFoundException;
import com.poc.ecommerce.user.Repository.UserRepository;
import com.poc.ecommerce.user.UserEntity.UserEntity;

@Service
@ComponentScan
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

@Override
public UserEntity getUserById(String userId) {
    return userRepository.findById(userId)
        .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + userId));
}
    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();

    }

    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        return userRepository.save(userEntity);

    }

    @Override
    public UserEntity updateUser(UserEntity userEntity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public UserEntity deleteUser(String userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

}
