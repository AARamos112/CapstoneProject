package com.Angel;

import java.sql.*;

public class Crud_op {

	final private Connection connection;
    private PreparedStatement ps;
    
    public Crud_op() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hds", "root", "");
        this.ps = null;
    }
    
    public void insertData(Customer item) {
        // declare query
        final String CREATE_ITEM_QUERY = "INSERT INTO items VALUES(?,?,?,?,?,?)";

        int count = 0;

        try{
            if(connection!=null)
                ps=connection.prepareStatement(CREATE_ITEM_QUERY);
            // set all item variables to PreparedStatement
			/*
			 * ps.setInt(1, item.getId()); ps.setString(2, item.getPicture());
			 * ps.setString(3, item.getName()); ps.setDouble(4, item.getPrice());
			 * ps.setString(5, item.getDescription()); ps.setString(6, item.getCategory());
			 */

            // connection and PreparedStatement checks
            if(connection!= null){
                if(ps!=null)
                    count = ps.executeUpdate(); // execute query
                if(count == 0)
                    System.out.println("Record not inserted");
                else
                    System.out.println("Record inserted::" + count);
            } // end connection check
        }catch (SQLException se){
            se.printStackTrace();
        }
    
}
}