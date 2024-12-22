package com.blogs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogs.pojos.Team;
import com.blogs.service.TeamService;

@RestController
@RequestMapping("/teams")
@CrossOrigin(origins="http://localhost:3000")
public class TeamController {
	//dependency
	@Autowired
	private TeamService teamService;
	
	public TeamController() {
		System.out.println("inside team controller"+getClass());
	}
	
	//add new teams
	@PostMapping
	public ResponseEntity<?> addNewTeam(@RequestBody Team team){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(teamService.addNewTeam(team));
		
	}
	
	//get all teams
	@GetMapping
	public ResponseEntity<?> getAllTeams(){
		System.out.println("get all teams");
		List<Team> team=teamService.getAllTeams();
		if(team.isEmpty())
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		return ResponseEntity.ok(team);
	}
	
	
}
