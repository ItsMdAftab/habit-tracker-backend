package com.example.habittrackerbackend.DTO;
/*DTO (Data Transfer Object) is used to transfer data between different layers of an application,
 *  especially between the frontend and backend. It helps expose only the required data instead of
 *   sending entire entities and improves security, maintainability, and separation of concerns.*/
/*🚀 Easy Way To Remember
Entity
Represents Database Table

Example:

PrayerRecord
GymRecord
DTO
Represents Data To Transfer

Example:

OverviewResponse
PrayerRequest
LoginRequest
Example

Database Entity:

public class User {

   private Long id;

   private String username;

   private String password;

}

Would we send this to frontend?

❌ NO

Because:

password should never go to frontend

Instead:

public class UserResponse {

   private Long id;

   private String username;

}

This is a DTO.

🚀 HUGE INTERV*/
public class OverviewResponse {
	
	private int totalPrayers;

	private int currentStreak;

	private int highestStreak;

	private int totalGymDays;

	private int currentGymStreak;

	private int highestGymStreak;
	public int getTotalPrayers() {
		return totalPrayers;
	}

	public void setTotalPrayers(int totalPrayers) {
		this.totalPrayers = totalPrayers;
	}

	public int getCurrentStreak() {
		return currentStreak;
	}

	public void setCurrentStreak(int currentStreak) {
		this.currentStreak = currentStreak;
	}

	public int getHighestStreak() {
		return highestStreak;
	}

	public void setHighestStreak(int highestStreak) {
		this.highestStreak = highestStreak;
	}

	public int getTotalGymDays() {
		return totalGymDays;
	}

	public void setTotalGymDays(int totalGymDays) {
		this.totalGymDays = totalGymDays;
	}

	public int getCurrentGymStreak() {
		return currentGymStreak;
	}

	public void setCurrentGymStreak(int currentGymStreak) {
		this.currentGymStreak = currentGymStreak;
	}

	public int getHighestGymStreak() {
		return highestGymStreak;
	}

	public void setHighestGymStreak(int highestGymStreak) {
		this.highestGymStreak = highestGymStreak;
	}

}
