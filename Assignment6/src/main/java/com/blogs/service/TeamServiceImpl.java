package com.blogs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogs.dao.TeamDao;
import com.blogs.pojos.Team;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TeamServiceImpl implements TeamService {

	//dependency
	@Autowired
	private TeamDao teamDao;
	
	@Override
	public String addNewTeam(Team team) {
		Team persistentTeam=teamDao.save(team);
		return "Added new Team with Id "+persistentTeam.getId();
	}

	@Override
	public List<Team> getAllTeams() {
		
		return teamDao.findAll();
	}
	
}
