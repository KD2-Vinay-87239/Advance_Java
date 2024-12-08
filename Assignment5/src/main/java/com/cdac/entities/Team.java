package com.cdac.entities;
import javax.persistence.*;

@Entity //to create a table automatically
@Table(name="new_users")	//to customize table name
public class Team {
	
	@Id	//Primary key
	//for auto-generate id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="team_id")  	//assign column name
	private Long team_id;
	
	@Column(length=100,name="name",unique=true)
	private String tName;
	
	@Column(length=25,unique=true,name="email")
	private String email;
	
	@Column( length=10,unique=true,name="abbrv")
	private String abbrevation;
	
	@Column(length=20,nullable = false,name="owner")
	private String owner;
	
	@Column(length=3,name="max_player_age")
	private Integer player_age;
	
	@Column(name="batting_avg")
	private double batting_avg;
	
	@Column(name="wickets_taken")
	private Integer wickets_taken;
	
	
}
