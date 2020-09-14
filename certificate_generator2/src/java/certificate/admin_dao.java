/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificate;

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
    Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/certificate_generator","root","");
 return conn;

    }
public int add_institute(String owner_name,String owner_id,String company_id,String company_name,
        int subscription,String mobile,String email,String address,String pass)throws Exception
{
  int i=0;
  con = getConnection();
  Statement stmt=con.createStatement();
  ResultSet rs=stmt.executeQuery("select count(company_id) from user_info");
  rs.next();
  /*i=rs.getInt(1);
  if(i>0)
  {
      System.out.println("company is already registered!!");
  }
  else*/
  {
  i=stmt.executeUpdate
        ("insert into user_info(owner_name,owner_id,company_id,company_name,subscription,mobile,email,address,pass_word)"
       + " values('"+owner_name+"','"+owner_id+"','"+company_id+"','"+company_name+"','"+subscription+"','"+mobile+"',"
               + "'"+email+"','"+address+"','"+pass+"')");
  }
  return i; 
    
} 
public ArrayList<user_pojo> FetchI() throws Exception
{
    ArrayList<user_pojo> data=new ArrayList<user_pojo>();
    con=getConnection();
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select * from user_info");
    while(rs.next())
    {
     user_pojo obj=new user_pojo();
     obj.setU_id(rs.getInt(1));
     obj.setOwner_name(rs.getString(2));
     obj.setOwner_id(rs.getString(3));
     obj.setCompany_id(rs.getString(4));
     obj.setCompany_name(rs.getString(5));
     obj.setSubscription(rs.getInt(6));
     obj.setMobile(rs.getString(7));
     obj.setEmail(rs.getString(8));
     obj.setAddress(rs.getString(9));
     data.add(obj);
    }
    return data;
}
public ArrayList<cerificate_issue_pojo> FetchCertificate() throws Exception
{
    ArrayList<cerificate_issue_pojo> data=new ArrayList<cerificate_issue_pojo>();
    con=getConnection();
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select * from user_info");
    while(rs.next())
    {
     cerificate_issue_pojo obj=new cerificate_issue_pojo();
     obj.setCertificate_no(rs.getInt(1));
     obj.setU_id(rs.getInt(2));
     obj.setS_id(rs.getInt(3));
     obj.setIssue_date(rs.getString(4));
     data.add(obj);
    }
    return data;
}
public ArrayList<invoice_pojo> Fetchinvoice() throws Exception
{
    ArrayList<invoice_pojo> data=new ArrayList<invoice_pojo>();
    con=getConnection();
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select * from invoice");
    while(rs.next())
    {
     invoice_pojo obj=new invoice_pojo();
     obj.setInvoice_no(rs.getInt(1));
     obj.setName(rs.getString(2));
     obj.setDesignation(rs.getString(3));
     obj.setAmount(rs.getInt(4));
     obj.setFrom_date(rs.getString(5));
     obj.setTo_date(rs.getString(6));
     data.add(obj);
    }
    return data;
}
public int updateinstitute(int u_id,String owner_name,String owner_id,String company_id,String company_name,
        int subscription,String mobile,String email,String address,String pass) throws Exception
{
    int i=0;
    con=getConnection();
    Statement stmt=con.createStatement();
    i=stmt.executeUpdate("update user_info set  owner_name='"+owner_name+"',owner_id='"+owner_id+"',company_id='"+company_id+"',company_name='"+company_name+"',subscription='"+subscription+"',mobile='"+mobile+"',email='"+email+"',address='"+address+"' where u_id='"+u_id+"'");
    return i;
}
public int deleteinstitute(int id) throws Exception
{
    int i=0;
    con=getConnection();
    Statement stmt=con.createStatement();
    i=stmt.executeUpdate("delete from user_info where u_id="+id);
    return i;
}
public int add_msg(String msg_name,String msg_email,String msg_msg )throws Exception
{
 int i=0;
  con = getConnection();
  Statement stmt=con.createStatement();
  ResultSet rs=stmt.executeQuery("select count(msg_id) from message");
  rs.next();
  /*i=rs.getInt(1);
  if(i>0)
  {
      System.out.println("company is already registered!!");
  }
  else*/
  {
  i=stmt.executeUpdate
        ("insert into message(msg_name,msg_email,msg_msg)"
       + " values('"+msg_name+"','"+msg_email+"','"+msg_msg+"')");
  }
  return i;
} 
public int createinvoice(int u_id,String name,String designation,int amount,String from_date,String to_date)throws Exception
{
  int i=0;
  con = getConnection();
  Statement stmt=con.createStatement();
  //ResultSet rs=stmt.executeQuery("select count(u_id) from user_info");
  //rs.next();
  /*i=rs.getInt(1);
  if(i>0)
  {
      System.out.println("company is already registered!!");
  }
  else*/
  {
  i=stmt.executeUpdate
        ("insert into invoice(u_id,name,designation,amount,from_date,to_date)"
       + " values('"+u_id+"','"+name+"','"+designation+"','"+amount+"','"+from_date+"','"+to_date+"')");
  }
  return i; 
    
}
}
