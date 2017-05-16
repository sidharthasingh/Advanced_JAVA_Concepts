/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcshit;

import java.util.Scanner;
/**
 *
 * @author SIDHARTHA
 */
public class JdbcShit 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ShitDatabase db=new ShitDatabase();
        int option=0;
        while(option!=6)
        {
            pp.println("1. Connect to Database");
            pp.println("2. Insert ");
            pp.println("3. Delete ");
            pp.println("4. Show Data");
            pp.println("5. Search Data");
            pp.print("6. EXIT : ");
            
            option=sc.nextInt();
            
            switch(option)
            {
                case 1:db.connect();break;
                case 2:db.insert();break;
                case 3:db.delete();break;
                case 4:db.showAll();break;
                case 5:db.search();break;
            }
        }
    }
}
