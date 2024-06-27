package com.test.beans.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.test.beans.Product;

public class ApplicationDao {

	List<Product> searchProducts(String searchString) throws SQLException {
		Connection connection = DBConnection.getConnectionToDB();
		String sql = "select * from products where productName  like'%'" + searchString + "'%'";
	
		java.sql.Statement statement=connection.createStatement();
		ResultSet set=statement.executeQuery(sql);
		return null;
	}
}
