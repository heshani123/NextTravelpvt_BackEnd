package com.heshani.ds.service;

import java.util.List;

public interface DriverService {
    Driver addDriver(Driver driver);
    List<Driver> fetchAllDriver();
    boolean checkExistsDriver(Integer driverId,String name);
    void updateDriver(Driver driver);
    Driver searchDriver(Integer id);
    Driver getAvailableDriver();
    void setUnavailableDriver(Integer id);
}
