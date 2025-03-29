package UserService;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import UserEntity.UserEntity;

public interface UserService {
    UserEntity getUserById(String userId);
    List<UserEntity> getAllUsers();
    UserEntity saveUser(UserEntity userEntity);
    UserEntity updateUser(UserEntity userEntity);
    UserEntity deleteUser(String userId);

}
