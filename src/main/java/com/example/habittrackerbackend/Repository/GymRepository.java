package com.example.habittrackerbackend.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.habittrackerbackend.entity.*;

public interface GymRepository extends JpaRepository<
GymRecord,//the entity class 
Long> {//the long here is the type of the primary key (id) of the entity 

}