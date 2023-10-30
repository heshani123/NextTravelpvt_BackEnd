package com.heshani.ts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "travel_package_details")
public class TravelPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String packageName;
    private Integer headCount;
}

