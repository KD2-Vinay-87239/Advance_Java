package com.cdac.dao;

import org.hibernate.*;
import static com.cdac.utils.HibernateUtils.getSessionFactory;

import java.io.Serializable;

import com.cdac.entities.Team;

public class TeamDaoImpl implements TeamDao {

	@Override
	public String registerPlayer(Team team) {
		String msg="Player registration failed!!!!!";
		
		Session session=getSessionFactory().getCurrentSession();
		
		Transaction tx=session.beginTransaction();
		
		try {
			Serializable id=session.save(team);
			tx.commit();
			msg="Player Registered successfully....";
		}catch(Exception e) {
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		
		return msg;
	}

	
}
