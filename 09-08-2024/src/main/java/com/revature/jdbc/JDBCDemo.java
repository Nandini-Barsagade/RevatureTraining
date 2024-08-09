package com.revature.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
public static void main(String[] args) {
	Connection connection=null;
	Statement statement=null;
	ResultSet resultSet=null;
	String url="jdbc:mysql://localhost:3306/demo";
	String uname="root";
	String pwd="Admin@123";
	
	// STEP -1 : LOAD THE DRIVER -- optional from java 6 onwards
	try {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		// STEP 2 - Create the connection Object
		connection=DriverManager.getConnection(url,uname,pwd);
		
		// STEP 3- Create a Statement/PS /CS Object
		statement=connection.createStatement();
		String sql1="select * from customer";
		
		//Insert the code 
        String sqlInsert = "INSERT INTO customer (customer_id, first_name, email) VALUES (105, 'sam jane', 'sam@example.com')";
		
        // read the code
       String sqlSelect = "SELECT last_name FROM customer WHERE state = 'NY'";
        resultSet = statement.executeQuery(sqlSelect);
        
        String sqlUpdate = "UPDATE customer SET email = 'updated.email@example.com' WHERE customer_id = 101";
		String sqlDelete = "DELETE FROM customer WHERE customer_id = 101";

	    // Execute the delete statement
	    int rowsDeleted = statement.executeUpdate(sqlDelete);
         //Execute the update statement
        int rowsUpdated = statement.executeUpdate(sqlUpdate);
        int rowsInserted = statement.executeUpdate(sqlInsert);
        if (rowsInserted > 0) {
            System.out.println("A new record was inserted successfully!");
        } else {
            System.out.println("Failed to insert a new record.");
        }
        
        // Step 4 - Execute Query and get ResultSet
		resultSet=statement.executeQuery(sql1);
		
		
		
		// Step 5 - Process the result set
		while(resultSet.next()) {
			System.out.println(resultSet.getInt("customer_id")+" , "+
					resultSet.getString(2)+" , "+resultSet.getString("email"));
		}
		
		// step 6 - Close the connection
		connection.close();
	} catch ( SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}