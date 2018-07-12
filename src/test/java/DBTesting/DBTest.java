package DBTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import  java.sql.*;

public class DBTest {

    public static void main(String args[]){

        //for test datamail.com

        String email = "test@gmail.com";
        String zipcode = "222";
        String firstname = "firstname";

        WebDriver driver = new ChromeDriver();
        driver.get("give the url");

        driver.findElement(By.id("gmailid")).sendKeys(email);
        driver.findElement(By.id("zipcode")).sendKeys(zipcode);
        driver.findElement(By.name("firatname")).sendKeys(firstname);
        driver.findElement(By.name("click button"));// then above data save in DB



        Connection conn = null;

        String url = "jdbc:mysql://localhost:3306" ; // mysql local host name

        String dbname = "mydatabade"; //give the name of the db

        String username = "root"; // username of db

        String password = "root"; // pw of db

        try{

            Class.forName("com.mysql:jdbc:driver"); // give the jdbc libraby path in external libraby
            conn = DriverManager.getConnection(url+dbname,username,password);

            String sqlQuery = "select * from singuptable";  //  sql pul from db
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery(sqlQuery);
            result.next();  // move pointer to next row mean escape table colums
            System.out.println(result.getString("email adderess")); //coloum name is db
            System.out.println(result.getString("zipcode")); //coloum name is db
            System.out.println(result.getString("firstname")); //coloum name is db

            //DB testing

            if (result.getString("email adderess").equals(email));
            System.out.println("db store name is correct");

            if (result.getString("zipcode").equals(zipcode));
            System.out.println("db store zipcode is correct");

            if (result.getString("firstname").equals(firstname));
            System.out.println("db store firstname is correct");
        }
        catch (Exception e){

            System.out.println(e);
        }
        finally {
            if(conn!=null){
                conn=null; // for close the db connection
            }
        }

    }
}
