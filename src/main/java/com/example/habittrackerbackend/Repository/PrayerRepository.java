package com.example.habittrackerbackend.Repository;
import com.example.habittrackerbackend.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrayerRepository//here we used the interface Because : the jpa supports the atuo-implementation of the reposty mehods , if we used the classes we have to wreit all the crud logic ourselves  but with  interfaces spring generates it for us 

extends JpaRepository<
        PrayerRecord,//the entity class 
        Long> {//the long here is the type of the primary key (id) of the entity 

}//only by wrighting this will creatall the funciton like the save() , find all , findbyId, deleteById() count() etc 
//after this we get the service laayer contains the : bussiness login and the claulation and all 

//after the service layer we get the controller 