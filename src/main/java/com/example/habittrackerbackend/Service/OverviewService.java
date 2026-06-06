
// import tow repositoruyes 
/*🚀 WHERE SHOULD THIS LOGIC GO?

Think about our layers:

Controller
Service
Repository

Question:

Should streak logic go inside:

Repository ?

❌ No

Repository only accesses DB.

Should it go inside:

Controller ?

❌ No

Controller handles HTTP requests.

Should it go inside:

Service ?

✅ YES

Because:

Business Logic
=
Service Layer
🚀 NEXT CLASS TO CREATE

Inside:

service

Create:

OverviewService.java
WHY NEW SERVICE?

Because:

PrayerRecordService

handles prayer CRUD.

GymRecordService

handles gym CRUD.

But:

OverviewService

will handle:

Analytics
Statistics
Dashboard Data
Streaks
Reports

Much cleaner architecture.*/
package com.example.habittrackerbackend.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.habittrackerbackend.DTO.OverviewResponse;
import com.example.habittrackerbackend.entity.GymRecord;
import com.example.habittrackerbackend.entity.PrayerRecord;
import com.example.habittrackerbackend.Repository.GymRepository;
import com.example.habittrackerbackend.Repository.PrayerRepository;

@Service
public class OverviewService {

    private final GymRepository gymRepository;
    private final PrayerRepository prayerRepository;

    public OverviewService(
            GymRepository gymRepository,
            PrayerRepository prayerRepository) {

        this.gymRepository = gymRepository;
        this.prayerRepository = prayerRepository;
    }

    public OverviewResponse getOverview() {

        List<PrayerRecord> prayers =
                prayerRepository.findAll();

        List<GymRecord> gyms =
                gymRepository.findAll();

        int totalPrayers = 0;
        int currentStreak = 0;
        int highestStreak = 0;
        int tempStreak = 0;

        int totalGymDays = 0;
        int currentGymStreak = 0;
        int highestGymStreak = 0;
        int tempGymStreak = 0;

        // Prayer Calculations

        for (PrayerRecord record : prayers) {

            int completedCount = 0;

            if (record.isFajr()) {
                completedCount++;
            }

            if (record.isDhuhr()) {
                completedCount++;
            }

            if (record.isAsr()) {
                completedCount++;
            }

            if (record.isMaghrib()) {
                completedCount++;
            }

            if (record.isIsha()) {
                completedCount++;
            }

            totalPrayers += completedCount;

            if (completedCount == 5) {

                tempStreak++;

                if (tempStreak > highestStreak) {
                    highestStreak = tempStreak;
                }

            } else {

                tempStreak = 0;

            }
        }

        // Current Prayer Streak

        for (int i = prayers.size() - 1; i >= 0; i--) {

            PrayerRecord record = prayers.get(i);

            boolean fullDay =
                    record.isFajr()
                    && record.isDhuhr()
                    && record.isAsr()
                    && record.isMaghrib()
                    && record.isIsha();

            if (fullDay) {

                currentStreak++;

            } else {

                break;

            }
        }

        // Gym Calculations

        for (GymRecord record : gyms) {

            if (record.isCompleted()) {

                totalGymDays++;

                tempGymStreak++;

                if (tempGymStreak > highestGymStreak) {

                    highestGymStreak =
                            tempGymStreak;

                }

            } else {

                tempGymStreak = 0;

            }
        }

        // Current Gym Streak

        for (int i = gyms.size() - 1; i >= 0; i--) {

            GymRecord record = gyms.get(i);

            if (record.isCompleted()) {

                currentGymStreak++;

            } else {

                break;

            }
        }

        OverviewResponse response =
                new OverviewResponse();

        response.setTotalPrayers(
                totalPrayers);

        response.setCurrentStreak(
                currentStreak);

        response.setHighestStreak(
                highestStreak);

        response.setTotalGymDays(
                totalGymDays);

        response.setCurrentGymStreak(
                currentGymStreak);

        response.setHighestGymStreak(
                highestGymStreak);

        return response;
    }
}