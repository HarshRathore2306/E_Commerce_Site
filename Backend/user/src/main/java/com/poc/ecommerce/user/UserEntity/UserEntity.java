package com.poc.ecommerce.user.UserEntity;


import jakarta.persistence.Column;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "user_data")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String user_Id;
    
    private String user_Name;
    
    @Column(name = "user_Email", nullable = false, unique = true)
    private String user_Email;
    
    private String user_Password;
    private String phone_Number;
    private String user_Address;
    private String role;


    @Transient
    private Cart cart;




}
