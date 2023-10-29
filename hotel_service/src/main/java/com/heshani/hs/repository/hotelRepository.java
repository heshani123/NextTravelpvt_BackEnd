package com.heshani.hs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface hotelRepository extends JpaRepository<Hotel,Integer> {

    List<Hotel> findAllByStarRate(Integer starRate);
}
