package com.heshani.hs.controller;

import com.heshani.hs.entity.Hotel;
import com.heshani.hs.service.hotelService;
import com.heshani.hs.utill.ResponceUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/hotel")
public class hotelController {
    @Autowired
    private hotelService hotelService;

    @PostMapping(value = "/add_hotel")
    public ResponceUtill addHotel(@RequestBody Hotel hotel) {
        return new ResponceUtill("Okay", "Done and Added", hotelService.addHotel(hotel));
    }

    @PutMapping(value = "/update_hotel")
    public ResponceUtill updateHotel(@RequestBody Hotel hotel) {
        return new ResponceUtill("Okay", "Done and Added", hotelService.updateHotel(hotel));
    }

    @DeleteMapping(value = "/delete_hotel")
    public ResponceUtill deleteHotel(@RequestParam String hotelId) {
        hotelService.deleteHotel(Integer.valueOf(hotelId));
        return new ResponceUtill("Okay", "Done and Added", null);
    }

    @GetMapping(value = "/view_all")
    public ResponceUtill fetchAllHotel() {
        return new ResponceUtill("Ok", "Done", hotelService.fetchAllHotel());
    }

    @GetMapping
    public ResponceUtill getHotelsByCategory(@RequestParam Integer starRate) {
        return new ResponceUtill("Ok", "Done", hotelService.findAllByStarRate(starRate));
    }
    @GetMapping(value = "/search")
    public ResponceUtill searchHotelById(@RequestParam Integer id){
        return new ResponceUtill("Okay","Done",hotelService.searchHotel(id));
    }
}
