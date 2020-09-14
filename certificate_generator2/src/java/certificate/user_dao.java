/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificate;

/**
 *
 * @author VASUDEV
 */
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
public class user_dao {
    Connection con=null;
public Connection getConnection() throws Exception
    {
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/certificate_generator","root","");
 return conn;

    }
public int certificate_issue(String company_name,String company_email,String company_mobile,int student_id,
        String student_name,String student_email,String course_name,int duration,String certificate_no,String issue_date )throws Exception
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
  i=stmt.executeUpdate("insert into certificate_issue(company_name,company_email,company_mobile,student_id,student_name,student_email,course_name,duration,certificate_no,issue_date) values('"+company_name+"','"+company_email+"','"+company_mobile+"','"+student_id+"','"+student_name+"','"+student_email+"','"+course_name+"','"+duration+"','"+certificate_no+"','"+issue_date+"')");
  }
  return i; 
    
} 

public int add_employee(String emp_name,String mobile,String email,
        String addresses,String qualification,String post,int salary,int u_id,String gender, String date)throws Exception
{
  int i=0;
  con = getConnection();
  Statement stmt=con.createStatement();
  //ResultSet rs=stmt.executeQuery("select count(company_id) from employee");
  //rs.next();
  /*i=rs.getInt(1);
  if(i>0)
  {
      System.out.println("company is already registered!!");
  }
  else*/
  {
  i=stmt.executeUpdate
        ("insert into employee(e_name,mobile,email,address,qualification,post,salary,u_id,gender,dob)"
       + " values('"+emp_name+"','"+mobile+"','"+email+"','"+addresses+"','"+qualification+"','"+post+"',"
               + "'"+salary+"','"+u_id+"','"+gender+"','"+date+"')");
  }
  return i; 
    
} 
public ArrayList<employee_pojo> FetchE() throws Exception
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
     obj.setMobile(rs.getString(3));
     obj.setEmail(rs.getString(4));
     obj.setAddress(rs.getString(5));
     obj.setQualification(rs.getString(6));
     obj.setPost(rs.getString(7));
     obj.setSalary(rs.getInt(8));
     obj.setU_id(rs.getInt(9));
     obj.setGender(rs.getString(10));
     obj.setDob(rs.getString(11));
     data.add(obj);
    }
    return data;
}
public int add_student(String s_name,String email,String contact,
        String c_name,String reg_date,String dob,int duration,int u_id,int e_id)throws Exception
{
  int i=0;
  con = getConnection();
  Statement stmt=con.createStatement();
  //ResultSet rs=stmt.executeQuery("select count(company_id) from student");
  //rs.next();
  /*i=rs.getInt(1);
  if(i>0)
  {
      System.out.println("company is already registered!!");
  }
  else*/
  {
  i=stmt.executeUpdate
        ("insert into student(s_name,email,contact,c_name,reg_date,dob,duration,u_id,e_id)"
       + " values('"+s_name+"','"+email+"','"+contact+"','"+c_name+"','"+reg_date+"','"+dob+"',"
               + "'"+duration+"','"+u_id+"','"+e_id+"')");
  }
  return i; 
    
}
public ArrayList<student_pojo> FetchS() throws Exception
{
    ArrayList<student_pojo> data=new ArrayList<student_pojo>();
    con=getConnection();
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select * from student");
    while(rs.next())
    {
     student_pojo obj=new student_pojo();
     obj.setS_id(rs.getInt(1));
     obj.setS_name(rs.getString(2));
     obj.setEmail(rs.getString(3));
     obj.setContact(rs.getString(4));
     obj.setC_name(rs.getString(5));
     obj.setReg_date(rs.getString(6));
     obj.setDob(rs.getString(7));
     obj.setDuration(rs.getInt(8));
     obj.setU_id(rs.getInt(9));
     obj.setE_id(10);
     data.add(obj);
    }
    return data;
}
}
