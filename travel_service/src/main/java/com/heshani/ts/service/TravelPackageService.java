package com.heshani.ts.service;

import com.heshani.ts.entity.TravelPackage;

import java.util.List;

public interface TravelPackageService {
    TravelPackage addTravelPackage(TravelPackage travelPackage);

    TravelPackage updateTravelPackage(TravelPackage travelPackage);

    void deletePackage(Integer id);

    List<TravelPackage> fetchAllPackages();

    TravelPackage fetchPackageDetails(Integer id);
}
