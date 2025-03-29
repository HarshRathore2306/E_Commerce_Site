package com.poc.ecommerce.user.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.ecommerce.user.UserEntity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {
 
}
