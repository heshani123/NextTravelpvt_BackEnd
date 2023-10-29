package com.heshani.hs.repository;

import com.heshani.hs.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface hotelRepository extends JpaRepository<Hotel,Integer> {

    List<Hotel> findAllByStarRate(Integer starRate);
}
