package com.GlobalTimeZoneHarbor.GlobalTimeZoneHarbor.service;

import com.GlobalTimeZoneHarbor.GlobalTimeZoneHarbor.model.TimeZone;
import com.GlobalTimeZoneHarbor.GlobalTimeZoneHarbor.repository.TimeZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TimeZoneServiceImplementation implements TimeZoneService{
    @Autowired
    private TimeZoneRepository timeZoneRepository;

    @Override
    public TimeZone saveTimeZone(TimeZone timeZone) {
        return timeZoneRepository.save(timeZone);
    }

    @Override
    public List<TimeZone> getAllTimeZones() {
        return timeZoneRepository.findAll();
    }

    @Override
    public Optional<TimeZone> getTimeZoneById(int id) {
        return timeZoneRepository.findById(id);
    }

    @Override
    public String deleteTimeZoneById(int id) {
        timeZoneRepository.deleteById(id);
        return "Time Zone Deleted Successfully!";

    }

    @Override
    public String deleteAllTimeZone() {
        timeZoneRepository.deleteAll();
        return "All Time Zones Deleted Successfully";
    }
}
