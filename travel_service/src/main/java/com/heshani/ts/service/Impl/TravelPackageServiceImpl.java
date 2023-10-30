package com.heshani.ts.service.Impl;

import com.heshani.ts.repository.TravelPackageRepository;
import com.heshani.ts.service.TravelPackageService;
import org.springframework.beans.factory.annotation.Autowired;

public class TravelPackageServiceImpl implements TravelPackageService {
    @Autowired
    private TravelPackageRepository travelPackageRepository;

    @Override
    public TravelPackage addTravelPackage(TravelPackage travelPackage) {
        if (travelPackageRepository.existsByPackageName(travelPackage.getPackageName())) {
            throw new RuntimeException("Package Already Exists");
        }
        return travelPackageRepository.save(travelPackage);
    }

    @Override
    public TravelPackage updateTravelPackage(TravelPackage travelPackage) {
        if (!travelPackageRepository.existsById(travelPackage.getId())) {
            throw new RuntimeException("Package Not Found");
        }
        return travelPackageRepository.save(travelPackage);
    }

    @Override
    public void deletePackage(Integer id) {
        if (!travelPackageRepository.existsById(id)) {
            throw new RuntimeException("Package Not Found");
        }
        travelPackageRepository.deleteById(id);
    }

}
