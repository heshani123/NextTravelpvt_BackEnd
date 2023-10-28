package com.heshani.us.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_details")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String name;
    private String address;
    private String nicOrPassportNum;
    private String userName;
    private String passWord;
    private  String role;
    private String proPicUrl;

}
