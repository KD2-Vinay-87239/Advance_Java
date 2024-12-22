package com.blogs.pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="team_name")
@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
//name varchar(100) unique ,abbreviation varchar(10) unique,owner varchar(20) not null,max_player_age int,
//batting_avg double,wickets_taken int)

public class Team extends BaseEntity{
	@Column(name="team",unique=true,length=100)
	private String name;
	
	@Column(unique=true)
	private String abbrevation;
	
	@Column(length=20,nullable = true)
	private String owner;
	
	@Column()
	private int maxAge;
	
	private Double battingAverage;
	
	private int wicketsTaken;
	

	public Team(String name, String abbrevation, String owner, int maxAge, Double battingAverage, int wicketsTaken) {
		super();
		this.name = name;
		this.abbrevation = abbrevation;
		this.owner = owner;
		this.maxAge = maxAge;
		this.battingAverage = battingAverage;
		this.wicketsTaken = wicketsTaken;
	}
	
	
}
