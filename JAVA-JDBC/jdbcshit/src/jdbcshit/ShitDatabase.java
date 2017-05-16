/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcshit;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author SIDHARTHA
 */
public class ShitDatabase 
{
    static Scanner sc=new Scanner(System.in);
    Connection con;
    String database="",password="",username="";
    Statement statement;
    ResultSet resultSet;
    String sqlquery;
    ShitDatabase()
    {
        
        //CHANGE THESE LINES BEFORE USING
        database="DATABASE NAME HERE";
        password="DATABASE PASSWORD HERE";
        username="DATABASE USERNAME HERE";
        
        try
        {
            //Class.forName("com.mysql.jdbc.driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database,username,password);
            statement=con.createStatement();
            pp.println("Connected to the database '"+database+"'...");
        }
        catch(Exception e)
        {
            pp.println("Some error occured while connecting to the database - "+database);
        }
    }
    void finalise()
    {
        try
        {
            pp.println("Closing database connection to "+database);
            con.close();
            pp.println("Connection to database '"+database+"' successfully closed.");
        }
        catch(Exception e)
        {
            pp.println("Error closing database connection to "+database);
        }
    }
    void connect()
    {
        try
        {
            pp.print("Enter the name of the Database you want the connection to : ");
            String temp_database=sc.nextLine();
            Connection temp_con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+temp_database,username,password);
            pp.println("Connected to the database '"+temp_database+"'...");
            pp.println("Changing Database from "+database+" to "+temp_database);
            try
            {
                database=temp_database;
                con=temp_con;
                statement=con.createStatement();
            }
            catch(Exception e)
            {
                pp.println("Some unknown error occured while changing the database.");
            }
        }
        catch(Exception e)
        {
            pp.println("Some error occured while connecting to the database - "+database);
        }
    }
    void insert()
    {
        pp.print("Please enter the Insert command : ");
        sqlquery=sc.nextLine();
        try
        {
            statement.executeUpdate(sqlquery);
            pp.println("Data inserted successfully");
        }
        catch(Exception e)
        {
            pp.println("Unable to insert data");
        }
    }
    void delete()
    {
        
    }
    void showAll()
    {
        
    }
    void search()
    {
        
    }
}
