/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarrange;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author VASUDEV
 */
public class admin_dao {
    Connection con=null;
public Connection getConnection() throws Exception
    {
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/myarrange","root","");
 return conn;

    }
public int add_employee(String e_name,String email,String sex,String dob,
        String prework,String branch,String designation,int experience,String mobile,String e_id,String address)throws Exception
{
  int i=0;
  con = getConnection();
  Statement stmt=con.createStatement();
  ResultSet rs=stmt.executeQuery("select count(e_id) from employee");
  rs.next();
  /*i=rs.getInt(1);
  if(i>0)
  {
      System.out.println("company is already registered!!");
  }
  else*/
  {
  i=stmt.executeUpdate
        ("insert into employee(e_name,email,sex,dob,w_field,branch,designation_name,experience,mobile,employee_id,address)"
       + " values('"+e_name+"','"+email+"','"+sex+"','"+dob+"','"+prework+"','"+branch+"',"
               + "'"+designation+"','"+experience+"','"+mobile+"','"+e_id+"','"+address+"')");
  }
  return i; 
    
} 
public ArrayList<employee_pojo> FetchI() throws Exception
{
    ArrayList<employee_pojo> data=new ArrayList<employee_pojo>();
    con=getConnection();
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select * from employee");
    while(rs.next())
    {
     employee_pojo obj=new employee_pojo();
     obj.setE_id(rs.getInt(1));
     obj.setE_name(rs.getString(2));
     obj.setEmail(rs.getString(3));
     obj.setSex(rs.getString(4));
     obj.setDob(rs.getString(5));
     obj.setW_field(rs.getString(6));
     obj.setBranch(rs.getString(7));
     obj.setDesignation_name(rs.getString(8));
     obj.setExperience(rs.getInt(9));
     obj.setMobile(rs.getString(10));
     obj.setEmployee_id(rs.getString(11));
     obj.setAddress(rs.getString(12));
     data.add(obj);
    }
    return data;
}
public ArrayList<service_provider_pojo> FetchE() throws Exception
{
    ArrayList<service_provider_pojo> data=new ArrayList<service_provider_pojo>();
    con=getConnection();
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select * from service_provider");
    while(rs.next())
    {
     service_provider_pojo obj=new service_provider_pojo();
     obj.setS_id(rs.getInt(1));
     obj.setS_name(rs.getString(2));
     obj.setC_id(rs.getInt(3));
     obj.setContact1(rs.getString(4));
     obj.setContact2(rs.getString(5));
     obj.setEmail(rs.getString(6));
     obj.setVideo_link(rs.getString(7));
     obj.setBanner_id(rs.getInt(8));
     obj.setL_id(rs.getInt(9));
     obj.setAbout(rs.getString(10));
     obj.setWebsite(rs.getString(11));
     obj.setHome_delivery(rs.getString(12));
     obj.setSubscription(rs.getInt(13));
     obj.setE_id(rs.getInt(14));
     data.add(obj);
    }
    return data;
}

public ArrayList<category_pojo> FetchC() throws Exception
{
    ArrayList<category_pojo> data=new ArrayList<category_pojo>();
    con=getConnection();
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select * from category");
    while(rs.next())
    {
     category_pojo obj=new category_pojo();
     obj.setC_id(rs.getInt(1));
     obj.setC_name(rs.getString(2));
     obj.setDescription(rs.getString(3));
     data.add(obj);
    }
    return data;
}
public int updateemployee(int e_id,String e_name,String email,String sex,String dob,
        String w_field,String branch,String designation,int experience,String mobile,String employee_id,String address) throws Exception
{
    int i=0;
    con=getConnection();
    Statement stmt=con.createStatement();
    i=stmt.executeUpdate("update employee set  e_name='"+e_name+"',email='"+email+"',sex='"+sex+"',dob='"+dob+"',w_field='"+w_field+"',branch='"+branch+"',designation_name='"+designation+"',experience='"+experience+"'mobile='"+mobile+"'employee_id='"+employee_id+"'address='"+address+"' where e_id='"+e_id+"'");
    return i;
}
public int deleteemployee(int id) throws Exception
{
    int i=0;
    con=getConnection();
    Statement stmt=con.createStatement();
    i=stmt.executeUpdate("delete from employee where e_id="+id);
    return i;
}
}
