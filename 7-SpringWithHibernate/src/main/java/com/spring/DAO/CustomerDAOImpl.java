package com.spring.DAO;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Customer;

@Repository
public class CustomerDAOImpl  implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void save(Customer cust) {
		getSession().save(cust);
	}

	public List<Customer> fetchAllCustomer() {
		CriteriaQuery<Customer> criteria=getSession().getCriteriaBuilder().createQuery(Customer.class);
		criteria.select(criteria.from(Customer.class));
		
		return getSession().createQuery(criteria).getResultList();
	}

	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	
	
}
