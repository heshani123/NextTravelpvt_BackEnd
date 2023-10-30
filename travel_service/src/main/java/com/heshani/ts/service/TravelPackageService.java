package com.heshani.ts.service;

import com.heshani.ts.entity.TravelPackage;

public interface TravelPackageService {
    TravelPackage addTravelPackage(TravelPackage travelPackage);

    TravelPackage updateTravelPackage(TravelPackage travelPackage);

    void deletePackage(Integer id);
}
