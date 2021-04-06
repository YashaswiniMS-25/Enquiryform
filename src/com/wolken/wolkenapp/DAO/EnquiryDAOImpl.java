package com.wolken.wolkenapp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wolken.wolkenapp.DTO.EnquiryDTO;

public class EnquiryDAOImpl implements EnquiryDAO{

	@Override
	public void add(EnquiryDTO enquirydto) throws SQLException {
		// TODO Auto-generated method stub

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wolken?user=root&password=Yashu@25101999")){
				
				try (PreparedStatement preparedStatement = con
						.prepareStatement("insert into wolken.enquiry_table values(?,?,?,?,?)");) {
//					PrisonDTO prisonsdto = new PrisonDTO();

					preparedStatement.setString(1, enquirydto.getName());

					preparedStatement.setString(2,enquirydto.getAddress());

					preparedStatement.setString(3, enquirydto.getEmail());

					preparedStatement.setInt(4,enquirydto.getPhn());
					preparedStatement.setInt(5, enquirydto.getPincode());
					preparedStatement.executeUpdate();
					System.out.println("added");
					preparedStatement.close();
				
				
				
				
			}
				con.close();
			}
			
			
			
			
	
}
}

/*
 * @Override public void update(String name, int ph) {
 * 
 * try { Class.forName("com.mysql.cj..jdbc.Driver"); try(Connection
 * con=DriverManager.getConnection(
 * "jdbc:mysql://localhost:3306?user=root&password=Yashu@25101999")){
 * 
 * 
 * 
 * // TODO Auto-generated method stub try(PreparedStatement ps=con.
 * prepareStatement("update table wolken.enquiry_table set name=? where phn_no=?"
 * );){ ps.setString(1, name); ps.setInt(2, ph); ps.executeUpdate(); ps.close();
 * } } }catch(Exception e) { e.printStackTrace(); }
 * 
 * 
 * 
 * }
 * 
 * @Override public void delete(int ph) { // TODO Auto-generated method stub try
 * { Class.forName("com.mysql.cj..jdbc.Driver"); try(Connection
 * con=DriverManager.getConnection(
 * "jdbc:mysql://localhost:3306?user=root&password=Yashu@25101999")){
 * 
 * 
 * try (PreparedStatement ps =
 * con.prepareStatement("delete from wolken.wolken_table where phn_no= ?");) {
 * ps.setInt(1, ph);
 * 
 * ps.executeUpdate(); System.out.println("deleted"); ps.close(); } }
 * 
 * }catch(Exception e) { e.printStackTrace();} }
 * 
 * @Override public void get() { // TODO Auto-generated method stub try {
 * Class.forName("com.mysql.cj..jdbc.Driver"); try(Connection
 * con=DriverManager.getConnection(
 * "jdbc:mysql://localhost:3306?user=root&password=Yashu@25101999")){
 * 
 * 
 * 
 * 
 * 
 * try (PreparedStatement ps =
 * con.prepareStatement("select * from wolken.enquiry_table");) {
 * 
 * try (ResultSet rs = ps.executeQuery()) {
 * 
 * while (rs.next()) {
 * 
 * String id = rs.getString("name"); String add = rs.getString("address");
 * String email = rs.getString("email");
 * 
 * int phn = rs.getInt("phn_no"); // preparedStatement.executeUpdate();
 * System.out.println(id + "" + add + " " + email + " " + phn); } rs.close(); }
 * ps.close();
 * 
 * } //} }
 * 
 * 
 * 
 * 
 * 
 * 
 * }catch(Exception e) { e.printStackTrace(); } } }
 */
