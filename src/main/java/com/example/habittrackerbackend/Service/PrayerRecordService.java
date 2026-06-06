/*Controller

Handles:

HTTP Requests
HTTP Responses
Repository

Handles:

Database Communication
Repository layer:
The repository is responsible for providing methods to interact with the database. By extending JpaRepository, it automatically exposes CRUD operations (save, findAll, findById, deleteById, etc.). It’s essentially the data access layer.

Service layer:
The service uses those repository methods to handle business logic. Instead of calling the repository directly from controllers, the service acts as a middle layer. It decides when and how to use repository methods, applies validations, transformations, or additional rules, and then passes results to the controller*/
package com.example.habittrackerbackend.Service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.habittrackerbackend.entity.PrayerRecord;
import com.example.habittrackerbackend.Repository.PrayerRepository;
@Service //this annotation tell's this class is a Service  Bean; managed by the spring Ioc Controller 
public class PrayerRecordService 
{
	private final PrayerRepository Repository ; //this stores the repository object this variable 
	//see below here 
	// PrayerRecordSErcice depends on the pryerReposityr 
	//the service need the repository to talk to the databse 
	// insted of creating it manually(new PrayerRepositoyr()),Spring provides the 
	//constuctor injection : public PrayerRecordService(PrayerRepository repository)
	//It says: “Oh, this service needs a PrayerRepository. I already have a bean for that, so I’ll inject it automatically.”

	//That’s Dependency Injection: the framework supplies the dependency.

	//Dependency Injection is when Spring provides the required objects instead of us creating them manually. In my service, the PrayerRepository is injected through the constructor. This is called constructor injection, and it’s preferred because it makes dependencies explicit, ensures immutability, and makes the code easier to test. The repository handles database communication, while the service layer uses those repository methods to implement business logic.”
	public PrayerRecordService (PrayerRepository repository ) {
		this.Repository=repository ; 
	}
	//save PrayerRecord; 
	public PrayerRecord savePrayerRecord(PrayerRecord prayerRecord) {
		return Repository.save(prayerRecord); 
	}
	//get All records 
	public List<PrayerRecord> getAllPrayerRecords(){
		return Repository.findAll(); 
	}
	
	
	

	
}
