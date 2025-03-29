package UserEntity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_data")
public class UserEntity {
    @Id
    private String user_Id;
    
    private String user_Name;
    
    @Column(name = "user_Email", nullable = false, unique = true)
    private String user_Email;
    private String user_Password;
    private String phone_Number;
    private String user_Address;
    private String role;



}
