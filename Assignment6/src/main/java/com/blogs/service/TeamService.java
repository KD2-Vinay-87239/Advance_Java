package com.blogs.service;

import java.util.List;

import com.blogs.pojos.Team;

public interface TeamService {
	//add new team
	String addNewTeam(Team team);

	//get all teams
	List<Team> getAllTeams();
	
}
