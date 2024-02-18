package com.GlobalTimeZoneHarbor.GlobalTimeZoneHarbor.controller;

import com.GlobalTimeZoneHarbor.GlobalTimeZoneHarbor.model.TimeZone;
import com.GlobalTimeZoneHarbor.GlobalTimeZoneHarbor.service.TimeZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/timeZone")
public class TimeZoneController {
    @Autowired
    private TimeZoneService timeZoneService;

    @PostMapping("/add")
    public String add(@RequestBody TimeZone timeZone){
        timeZoneService.saveTimeZone(timeZone);
        return "TimeZone added successfully";
    }

    @GetMapping("/getAll")
    public List<TimeZone> get(){
        return timeZoneService.getAllTimeZones();
    }

    @GetMapping("/getById/{id}")
    public Optional<TimeZone> getById(@PathVariable int id){
        return timeZoneService.getTimeZoneById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable int id){
        return timeZoneService.deleteTimeZoneById(id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll(){
        return timeZoneService.deleteAllTimeZone();
    }
}
