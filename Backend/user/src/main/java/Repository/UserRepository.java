package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import UserEntity.UserEntity;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
    UserEntity findByUserEmail(String userEmail);
    UserEntity findByUserId(String userId);
    UserEntity findByUserName(String userName);
    UserEntity findByPhoneNumber(String phoneNumber);
    UserEntity findByUserAddress(String userAddress);
    UserEntity findByUserPassword(String userPassword);

}
