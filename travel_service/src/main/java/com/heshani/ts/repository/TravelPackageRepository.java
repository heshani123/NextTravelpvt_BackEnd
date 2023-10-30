package com.heshani.ts.repository;


import com.heshani.ts.entity.TravelPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface TravelPackageRepository extends JpaRepository<TravelPackage,Integer> {
    Boolean existsByPackageName(String packageName);
}
