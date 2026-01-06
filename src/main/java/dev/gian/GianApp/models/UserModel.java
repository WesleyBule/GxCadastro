package dev.gian.GianApp.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "tb_register")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)
    private  Long id;
    private String name;
    private String email;
    private int age;


    public UserModel(){

    }

    public UserModel(String name, String email , int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }
}
