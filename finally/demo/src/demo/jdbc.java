package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class jdbc {
	public static void main(String[] args) throws Exception{
		try {
			String URL="jdbc:mysql://localhost:3306/test";
			String USER="root";
			String PASSWORD="";
			//1.加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			//2.获得数据库链接
			Connection conn=DriverManager.getConnection(URL, USER, PASSWORD);
			conn.close();
			System.out.println("s");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
