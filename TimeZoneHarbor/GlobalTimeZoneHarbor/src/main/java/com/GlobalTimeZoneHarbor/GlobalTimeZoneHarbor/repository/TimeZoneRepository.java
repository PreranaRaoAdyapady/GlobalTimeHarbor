package com.GlobalTimeZoneHarbor.GlobalTimeZoneHarbor.repository;


import com.GlobalTimeZoneHarbor.GlobalTimeZoneHarbor.model.TimeZone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeZoneRepository extends JpaRepository<TimeZone,Integer>{
}
