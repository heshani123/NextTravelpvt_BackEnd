package com.heshani.us.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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


}
