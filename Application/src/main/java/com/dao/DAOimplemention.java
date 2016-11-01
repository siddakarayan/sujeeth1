package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;
 
@Repository("userdao")
public class DAOimplemention  implements Userdao {
    @Autowired
    private SessionFactory sessionFactory;
    
    public DAOimplemention(){
    	
    }
    public  DAOimplemention(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
    @Transactional
	public void save(User user){
	sessionFactory.getCurrentSession().save(user);
}
    @Transactional
	public void update(User user) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.update(user);
		session.flush();
	}
    @Transactional
   	public void delete(User user) {
   		// TODO Auto-generated method stub
   		Session session=sessionFactory.getCurrentSession();
   		session.delete(user);
   		session.flush();
   		
   	}
       
}