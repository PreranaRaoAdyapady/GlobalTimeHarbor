package com.GlobalTimeZoneHarbor.GlobalTimeZoneHarbor.service;

import com.GlobalTimeZoneHarbor.GlobalTimeZoneHarbor.model.TimeZone;

import java.util.List;
import java.util.Optional;

public interface TimeZoneService {
    public TimeZone saveTimeZone(TimeZone timeZone);
    public List<TimeZone> getAllTimeZones();
    public Optional<TimeZone> getTimeZoneById(int id);
    public String deleteTimeZoneById(int id);
    public String deleteAllTimeZone();


}
