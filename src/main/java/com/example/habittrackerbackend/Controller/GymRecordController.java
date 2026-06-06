package com.example.habittrackerbackend.Controller;
import java.util.List; 
import org.springframework.web.bind.annotation.*;
import com.example.habittrackerbackend.Service.*;
import com.example.habittrackerbackend.entity.*;

@RestController
@RequestMapping("/Gym")
@CrossOrigin(origins = "http://localhost:5173")

public class GymRecordController {
	private final GymRecordService Service; 
	public GymRecordController(GymRecordService Service) {
		this.Service=Service; 
	}
	
	@PostMapping("/saveGymRecord")
	public GymRecord saveGymRecord(@RequestBody GymRecord Record) {
		return Service.saveGymRecord(Record); 
	}
	@GetMapping("/getGymRecord")
	public List<GymRecord> getGymRecord(){
		return Service.getGymRecord();
	}

}
