package com.junit.scholar2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResearchScholar {
	private String rank;
	public void register(String name, int age, String subject, String guideName) {
		OracleConnection oracle = new OracleConnection();
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
		if(age >= 28) {
			conn =  oracle.getConnection();
			stmt = conn.prepareStatement("INSERT INTO scholar (scholar_name, age, subject, guidename) VALUES (?, ?, ?, ?)");
			stmt.setString(1, name);
			stmt.setInt(2, age);
			stmt.setString(3, subject);
			stmt.setString(4, guideName);
			stmt.executeUpdate();
			
		}
		else {
			throw new RegistrationFailedException("Research scholar name cannot register");
		}
		}catch(SQLException e) {
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			
		}
		
		
		
	}
	public void rank(int marks) {
		if(marks <= 50) {
			this.setRank("D");
		}
		else if(marks > 50 && marks <= 70) {
			this.setRank("C");
		}
		else if(marks > 70 && marks <= 90) {
			this.setRank("B");
		}
		else if(marks > 90) {
			this.setRank("A");
		}
	}
	
	public double awardPrize(double year) {
		double reward = 0;
		
		if(this.rank == "A" && year == 2006) {
			System.out.println("here");
			reward = 1000.0;
			System.out.println(reward);
		}
		else if(this.rank == "B" && year == 2006) {
			reward = 750;
		}
		else if(this.rank == "C" && year == 2006) {
			reward = 500;
		}
		else if(this.rank == "D" && year == 2006) {
			reward = 250;
		}
		else if(this.rank == "A" && year == 2007) {
			reward = 1500;
		}
		else if(this.rank == "B" && year == 2007) {
			reward = 1250;
		}
		else if(this.rank == "C" && year == 2007) {
			reward = 1000;
		}
		else if(this.rank == "D" && year == 2007) {
			reward = 750;
		}
		System.out.println("returning");
		return reward;
	}
	
	public double awardBookAllowance(double year) {
		double reward = 0;
		
		if(this.rank == "A" && year == 2006) {
			System.out.println("here");
			reward = 750.0;
			System.out.println(reward);
		}
		else if(this.rank == "B" && year == 2006) {
			reward = 750;
		}
		else if(this.rank == "C" && year == 2006) {
			reward = 500;
		}
		else if(this.rank == "D" && year == 2006) {
			reward = 500;
		}
		else if(this.rank == "A" && year == 2007) {
			reward = 2000;
		}
		else if(this.rank == "B" && year == 2007) {
			reward = 1000;
		}
		else if(this.rank == "C" && year == 2007) {
			reward = 1000;
		}
		else if(this.rank == "D" && year == 2007) {
			reward = 1000;
		}
		System.out.println("returning");
		return reward;
	}
	public static void main(String[] ars) {
		ResearchScholar o = new ResearchScholar();
		o.register("r", 67, "fff", "tttttttt");
			o.rank(34);
		
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
}
