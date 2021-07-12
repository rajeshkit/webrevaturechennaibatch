package com.capp.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.capp.config.DBConnectionSingleton;
import com.capp.model.Customer;

public class CustomerDaoImplementation implements CustomerDAO {

	@Override
	public int insertCustomer(Customer customer) {
		int status=0;
		try {
			PreparedStatement pstmt=(DBConnectionSingleton.getConnectionInstance())
					.prepareStatement("insert into customerdetails values(?,?,?,?,?,?)");
			pstmt.setString(1, customer.getCustomerName());
			pstmt.setString(2, customer.getCustomerPassword());
			pstmt.setString(3, customer.getCustomerGender());
			pstmt.setString(4, customer.getCustomerQualification());
			pstmt.setString(5, customer.getCustomerState());
			pstmt.setString(6, customer.getCustomerAddress());
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

}
