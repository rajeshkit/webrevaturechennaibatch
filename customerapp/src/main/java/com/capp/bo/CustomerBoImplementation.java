package com.capp.bo;

import com.capp.dao.CustomerDAO;
import com.capp.dao.CustomerDaoImplementation;
import com.capp.model.Customer;

public class CustomerBoImplementation implements CustomerBO {

	@Override
	public int addCustomer(Customer cust) {
		CustomerDAO cdao=new CustomerDaoImplementation();
		int result  = cdao.insertCustomer(cust);
		return result;
	}

}
