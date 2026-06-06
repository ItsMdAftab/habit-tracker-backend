package com.example.habittrackerbackend.entity;

import jakarta.persistence.*;
import java.time.LocalDate; 
@Entity
@Table (name = "gym_record")
public class GymRecord {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ; 
	private boolean completed ; 
	private String workoutTitle; 
	private LocalDate workoutData; 
	
	public GymRecord() {
		
	}
	public GymRecord(Long id , boolean completed , String workoutTitle ,LocalDate workoutData) {
		this.id=id; 
		this.completed=completed; 
		this.workoutTitle=workoutTitle; 
		this.workoutData=workoutData;
	}
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public String getWorkoutTitle() {
		return workoutTitle;
	}
	public void setWorkoutTitle(String workoutTitle) {
		this.workoutTitle = workoutTitle;
	}
	public LocalDate getWorkoutData() {
		return workoutData;
	}
	public void setWorkoutData(LocalDate workoutData) {
		this.workoutData = workoutData;
	}
	
	
	

}
