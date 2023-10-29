package com.heshani.hs.service.Impl;

import com.heshani.hs.entity.Hotel;
import com.heshani.hs.service.hotelService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class hotelServiceImpl implements hotelService {
    @Autowired
    private hotelRepository hotelRepository;

    @Override
    public Hotel addHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel updateHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public void deleteHotel(Integer hotelId) {
        hotelRepository.deleteById(hotelId);
    }

    @Override
    public List<Hotel> fetchAllHotel() {
        return hotelRepository.findAll();
    }

    @Override
    public List<Hotel> findAllByStarRate(Integer starRate) {
        return hotelRepository.findAllByStarRate(starRate);
    }

    @Override
    public Object searchHotel(Integer id) {
        return hotelRepository.findById(id);
    }
}
