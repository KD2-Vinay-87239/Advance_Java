package com.cdac.tester;

import static com.cdac.utils.HibernateUtils.getSessionFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.cdac.dao.TeamDao;
import com.cdac.dao.TeamDaoImpl;

public class TestTeamHibernate {

	public static void main(String[] args) {
		try(SessionFactory sf=getSessionFactory();
				Scanner sc=new Scanner(System.in)){
			
			//create player dao instance
			TeamDao teamDao=new TeamDaoImpl();
			System.out.println("Enter player details - Long team_id, "
					+ "String tName,String email, String owner, "
					+ "Integer player_age,double batting_avg,\r\n"
					+ "Integer wickets_taken");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
