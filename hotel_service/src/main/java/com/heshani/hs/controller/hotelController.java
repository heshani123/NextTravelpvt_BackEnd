package com.heshani.hs.controller;

import com.heshani.hs.entity.Hotel;
import com.heshani.hs.service.hotelService;
import com.heshani.hs.utill.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/hotel")
public class hotelController {
    @Autowired
    private hotelService hotelService;

    @PostMapping(value = "/add_hotel")
    public ResponseUtil addHotel(@RequestBody Hotel hotel) {
        return new ResponseUtil("Okay", "Done and Added", hotelService.addHotel(hotel));
    }

    @PutMapping(value = "/update_hotel")
    public ResponseUtil updateHotel(@RequestBody Hotel hotel) {
        return new ResponseUtil("Okay", "Done and Added", hotelService.updateHotel(hotel));
    }

    @DeleteMapping(value = "/delete_hotel")
    public ResponseUtil deleteHotel(@RequestParam String hotelId) {
        hotelService.deleteHotel(Integer.valueOf(hotelId));
        return new ResponseUtil("Okay", "Done and Added", null);
    }

    @GetMapping(value = "/view_all")
    public ResponseUtil fetchAllHotel() {
        return new ResponseUtil("Ok", "Done", hotelService.fetchAllHotel());
    }

    @GetMapping
    public ResponseUtil getHotelsByCategory(@RequestParam Integer starRate) {
        return new ResponseUtil("Ok", "Done", hotelService.findAllByStarRate(starRate));
    }
    @GetMapping(value = "/search")
    public ResponseUtil searchHotelById(@RequestParam Integer id){
        return new ResponseUtil("Okay","Done",hotelService.searchHotel(id));
    }
}
