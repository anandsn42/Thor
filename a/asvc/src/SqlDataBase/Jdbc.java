package SqlDataBase;
import java.sql.*;
//import java.sql.Statement;
import java.util.*;
import java.util.Scanner;

//import com.mysql.cj.xdevapi.Statement;

public class Jdbc
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
		{
		Scanner sc=new Scanner(System.in);
		
		
		String user="root";
		String password="password";
		String url1="jdbc:mysql://localhost:3306/graduates";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection(url1,user,password);
		
	/*	System.out.println("enter the id");
		int id=sc.nextInt();
		
		System.out.println("enter the name");
		String name=sc.next();
		
		System.out.println("enter the salary");
		int salary=sc.nextInt();
		
		String insert ="insert into employees values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(insert);
		
		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setInt(3,salary);
		boolean a=ps.execute();
		
		System.out.println("database got updated :"+a);
		
		String retrieve= "select * from employees";
		 
	    Statement st = con.createStatement();
        ResultSet rs=  st.executeQuery(retrieve);
        
        while(rs.next())
        {
      	  System.out.println("id :"+rs.getInt("id"));
      	  System.out.println("Name :"+rs.getString("name"));
      	  System.out.println("salary :"+rs.getInt("salary"));
        }*/
        
        System.out.println("Enter AccountNumber to delete the account");
        int accNum=sc.nextInt();
        
        String deleteq ="delete from employees where id=?";
        PreparedStatement ps1=con.prepareStatement(deleteq);
        ps1.setLong(1,accNum);
        ps1.execute();
        System.out.println("database got updated ");
        con.close();
		sc.close();
		
		
	}

}
