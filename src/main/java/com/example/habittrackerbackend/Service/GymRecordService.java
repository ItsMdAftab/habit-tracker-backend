package com.example.habittrackerbackend.Service;
import java.util.List;

import org.springframework.stereotype.Service;


import com.example.habittrackerbackend.entity.*;
import com.example.habittrackerbackend.Repository.*;
@Service
public class GymRecordService 
{
	private final GymRepository Repository; 
	public GymRecordService (GymRepository Repository) {
		this.Repository=Repository; 
	}
	public GymRecord saveGymRecord(GymRecord record) {
		return Repository.save(record); 
	}
	public List<GymRecord> getGymRecord() {
		return Repository.findAll();
	}

}
