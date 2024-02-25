package com.GlobalTimeZoneHarbor.GlobalTimeZoneHarbor.service;

import com.GlobalTimeZoneHarbor.GlobalTimeZoneHarbor.model.TimeZone;
import com.GlobalTimeZoneHarbor.GlobalTimeZoneHarbor.repository.TimeZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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

    @Override
    public String saveTimeZonesByFile(MultipartFile file) {
        ArrayList<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] linesArray = lines.toArray(new String[0]);
        for (int i = 0; i < linesArray.length -1 ; i++) {
            TimeZone timeZone = new TimeZone();
            String[] itemZone = linesArray[i].split(",");
            timeZone.setCountryCode(itemZone[0]);
            timeZone.setCountryName(itemZone[1]);
            timeZone.setTimeZone(itemZone[2]);
            timeZone.setGmtOffSet(itemZone[3]);
            timeZoneRepository.save(timeZone);
        }
        return "Time Zones in files are saved successfully";
    }
}
