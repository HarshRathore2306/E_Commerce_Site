package UserService;

import java.util.List;

import Exception.ResourceNotFoundException;
import Repository.UserRepository;
import UserEntity.UserEntity;

public class UserServiceImpl implements UserService {

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
