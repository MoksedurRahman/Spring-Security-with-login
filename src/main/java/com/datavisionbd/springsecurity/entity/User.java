package com.datavisionbd.springsecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User  {

    @Id
    private Long Id;
    private String username;
    private String password;
    private String role;
    private String phone;

}
