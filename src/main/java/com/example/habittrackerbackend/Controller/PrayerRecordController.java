/*RESPONSIBILITY OF CONTROLLER

Controller should ONLY:

✅ Receive requests

✅ Read request body

✅ Read URL parameters

✅ Call service

✅ Return respons*/
package com.example.habittrackerbackend.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.habittrackerbackend.entity.PrayerRecord;
import com.example.habittrackerbackend.Service.PrayerRecordService;
@RestController
@RequestMapping("/prayers")//this is the base url for the whole controller ; 
@CrossOrigin(
	    origins = {
	        "http://localhost:5173",
	        "https://habit-tracker-frontend-x1li.onrender.com"
	    }
	)
public class PrayerRecordController {
	private final PrayerRecordService service; 
	public PrayerRecordController(PrayerRecordService service) {
		this.service=service; 
	}
	@PostMapping("/savePrayerRecord")//this is the specfic url here ok  
	public PrayerRecord savePrayerRecord(@RequestBody PrayerRecord prayerRecord) {
		return service.savePrayerRecord(prayerRecord);
	}
	@GetMapping("/getAllPrayerRecords")

    public List<PrayerRecord> getAllPrayerRecords() {

        return service.getAllPrayerRecords();

    }

}
