package com.wolken.wolkenapp.Service;

import java.sql.SQLException;

import com.wolken.wolkenapp.DAO.EnquiryDAO;
import com.wolken.wolkenapp.DAO.EnquiryDAOImpl;
import com.wolken.wolkenapp.DTO.EnquiryDTO;

public class EnquiryServiceImpl implements EnquiryService{
	EnquiryDAO enquirydao=new EnquiryDAOImpl();

	@Override
	public void validate(EnquiryDTO enquirydto) {
		// TODO Auto-generated method stub
		
		try {
		if(enquirydto.getName().length()<50) {
			enquirydao.add(enquirydto);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

	/*
	 * @Override public void validateAndUpdate(String name, int ph) { // TODO
	 * Auto-generated method stub if(ph!=0) { enquirydao.update(name,ph); }
	 * 
	 * 
	 * 
	 * }
	 * 
	 * @Override public void valiadteAndDelete(int ph) { // TODO Auto-generated
	 * method stub if(ph!=0) { enquirydao.delete(ph); } }
	 * 
	 * @Override public void getall() { // TODO Auto-generated method stub
	 * enquirydao.get(); }
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 */