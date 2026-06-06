package com.example.habittrackerbackend.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "prayer_records")
public class PrayerRecord {

    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    private Long id;

    private boolean fajr;

    private boolean dhuhr;

    private boolean asr;

    private boolean maghrib;

    private boolean isha;

    private LocalDate prayerDate;

    // Default Constructor
    public PrayerRecord() {

    }

    // Parameterized Constructor
    public PrayerRecord(
        Long id,
        boolean fajr,
        boolean dhuhr,
        boolean asr,
        boolean maghrib,
        boolean isha,
        LocalDate prayerDate
    ) {

        this.id = id;
        this.fajr = fajr;
        this.dhuhr = dhuhr;
        this.asr = asr;
        this.maghrib = maghrib;
        this.isha = isha;
        this.prayerDate = prayerDate;

    }

    // Getters and Setters

    public Long getId() {

        return id;

    }

    public void setId(Long id) {

        this.id = id;

    }

    public boolean isFajr() {

        return fajr;

    }

    public void setFajr(boolean fajr) {

        this.fajr = fajr;

    }

    public boolean isDhuhr() {

        return dhuhr;

    }

    public void setDhuhr(boolean dhuhr) {

        this.dhuhr = dhuhr;

    }

    public boolean isAsr() {

        return asr;

    }

    public void setAsr(boolean asr) {

        this.asr = asr;

    }

    public boolean isMaghrib() {

        return maghrib;

    }

    public void setMaghrib(boolean maghrib) {

        this.maghrib = maghrib;

    }

    public boolean isIsha() {

        return isha;

    }

    public void setIsha(boolean isha) {

        this.isha = isha;

    }

    public LocalDate getPrayerDate() {

        return prayerDate;

    }

    public void setPrayerDate(
        LocalDate prayerDate
    ) {

        this.prayerDate = prayerDate;

    }

    @Override
    public String toString() {

        return "PrayerRecord{" +
                "id=" + id +
                ", fajr=" + fajr +
                ", dhuhr=" + dhuhr +
                ", asr=" + asr +
                ", maghrib=" + maghrib +
                ", isha=" + isha +
                ", prayerDate=" + prayerDate +
                '}';

    }

}
/*🚀 WHY PARAMETERIZED CONSTRUCTOR USEFUL?

Instead of:

PrayerRecord p = new PrayerRecord();

p.setFajr(true);
p.setDhuhr(true);

we can do:

new PrayerRecord(...)

More convenient object creation.

🚀 YOUR FIFTH POINT

You said:

“setter and getter important for assigning values”

YESSS 🔥

But let’s refine understanding professionally.

🚀 GETTERS

Used for:

accessing values

Example:

record.getFajr()
🚀 SETTERS

Used for:

modifying values

Example:

record.setFajr(true)
🚀 WHY IMPORTANT FOR HIBERNATE?

Hibernate often:
✅ reads values using getters
✅ updates values using setters

Also:
Spring uses them for:

JSON mapping
serialization
deserialization

VERY important backend concept.

🚀 MOST IMPORTANT BIG PICTURE

Your entity is:

NOT just random Java class

It is:

DATABASE BLUEPRINT
🚀 WHAT THIS ENTITY NOW DEFINES

It defines:

Java	PostgreSQL
PrayerRecord	prayer_records table
id	primary key
boolean fajr	boolean column
LocalDate	date column

BROOO 🔥
this is REAL backend engineering now.

🚀 IMPORTANT INTERVIEW ANSWER

If interviewer asks:

“What is an Entity in Spring Boot?”

You can answer:

“An Entity is a Java class mapped to a database table using JPA annotations like @Entity. Hibernate uses these annotations to automatically create and manage database tables. Each object of the entity represents one row in the database table.”

🔥 THAT is strong answer.

🚀 IMPORTANT INTERVIEW QUESTION
“Why is default constructor required in JPA?”

Answer:

“Hibernate internally creates entity objects using reflection, so a no-argument constructor is required for object instantiation.”

🔥 VERY strong answer.

🚀 IMPORTANT INTERVIEW QUESTION
“Why use getters and setters in entities?”

Answer:

“Getters and setters provide controlled access to private fields and are used by Hibernate and Spring during object mapping, serialization, and database operations.”

🔥 PROFESSIONAL answer.*/