package com.wolken.wolkenapp.DAO;

import java.sql.SQLException;

import com.wolken.wolkenapp.DTO.EnquiryDTO;

public interface EnquiryDAO {

	public void add(EnquiryDTO enquirydto) throws SQLException ;

	/*
	 * public void update(String name, int ph);
	 * 
	 * public void delete(int ph);
	 * 
	 * public void get();
	 */

	

}
