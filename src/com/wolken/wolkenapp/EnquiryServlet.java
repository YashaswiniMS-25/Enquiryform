package com.wolken.wolkenapp;

import java.io.IOException;
import com.wolken.wolkenapp.*;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wolken.wolkenapp.DTO.EnquiryDTO;
import com.wolken.wolkenapp.Service.EnquiryService;
import com.wolken.wolkenapp.Service.EnquiryServiceImpl;

//@WebServlet(urlPatterns = "/enquiry", loadOnStartup = +999)
public class EnquiryServlet extends HttpServlet {

	public EnquiryServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor");
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("nm");
		String phn = req.getParameter("phn");
		int ph = Integer.parseInt(phn);
		String address = req.getParameter("add");
		String pincode = req.getParameter("pc");
		int pc = Integer.parseInt(pincode);
		String email = req.getParameter("email");
		System.out.println(name);

		PrintWriter printwriter = res.getWriter();

		printwriter.print("Welcome  " + name);
		EnquiryDTO enquirydto = new EnquiryDTO();

		enquirydto.setName(name);
		enquirydto.setPhn(ph);
		enquirydto.setAddress(address);
		enquirydto.setPincode(pc);
		enquirydto.setEmail(email);
		EnquiryService enquiryservice = new EnquiryServiceImpl();
		enquiryservice.validate(enquirydto);

		/*
		 * Scanner scan=new Scanner(System.in);
		 * 
		 * System.out.println("enter the name to update"); String name1=scan.next();
		 * System.out.println("enter the phn "); int ph1=scan.nextInt();
		 * enquiryservice.validateAndUpdate(name1,ph1);
		 * 
		 * System.out.println("enter the phn to  delete"); int ph2=scan.nextInt();
		 * enquiryservice.valiadteAndDelete(ph2); enquiryservice.getall();
		 */

		
		
		
		
		printwriter.flush();
		printwriter.close();
	}

	
	/*
	 * @Override public void doPost(HttpServletRequest req, HttpServletResponse res)
	 * throws ServletException, IOException {
	 * 
	 * 
	 * 
	 * }
	 */

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

		System.out.println("closing all the resources");
	}

}
