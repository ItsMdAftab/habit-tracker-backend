package com.example.habittrackerbackend.Controller;
import com.example.habittrackerbackend.*;
import com.example.habittrackerbackend.Service.OverviewService;
import org.springframework.web.bind.annotation.*;
import java.util.List; 
import com.example.habittrackerbackend.DTO.*;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/overview")
public class OverviewController 
{
	private final OverviewService Service; 
	public OverviewController(OverviewService Service) {
		this.Service=Service; 
	}
	@GetMapping("/getoverview")
	public OverviewResponse getoverview(){
		return Service.getOverview(); 
	}
	
}
