/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author Hp
 */
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            //Class.forName(com.mysql.cj.jdbc.Driver);
            c= DriverManager.getConnection("jdbc:mysql:///banking","root","789657896578965");
            s=c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
}
}
