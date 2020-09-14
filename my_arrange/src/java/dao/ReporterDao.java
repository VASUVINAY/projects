/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import pool.*;
import beans.Reporter;
import  java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author lucy
 */
public class ReporterDao {
    
    public boolean add (Reporter reporter){
         boolean status =false;
         ConnectionPool cp=ConnectionPool.getInstance();
         cp.initialize();
         Connection con=cp.getConnection();
          if(con!=null)
        {
         try{
             String sql="insert into reporter(name,dob,gender,contact,email,image, userid,password,status) values(?,?,?,?,?,?,?,?,?)";    
             PreparedStatement smt=con.prepareStatement(sql);
              smt.setString(1, reporter.getName());
                smt.setString(2, reporter.getDob());
                smt.setString(3, reporter.getGender());
                smt.setString(4, reporter.getContact());
                smt.setString(5, reporter.getEmail());
                smt.setString(6, reporter.getImage());
                smt.setString(7, reporter.getUserid());
                smt.setString(8, reporter.getPassword());
                smt.setString(9, reporter.getStatus());
                  int n=smt.executeUpdate();
                   if(n>0)
                   {
                       status=true;
                       
                   }
                    smt.close();
                     cp.putConnection(con);
                
             
             
         }catch(Exception e){
             
             System.out.println("Error"+e.getMessage());
         }
        }
         
         return status;
        
        
        
    }
    public boolean removeById(int id){
        boolean status= false;
        ConnectionPool cp=ConnectionPool.getInstance();
        cp.initialize();
        Connection con=cp.getConnection();
        if(con!=null){
            try{
                String sql="delete from Reporter where id=?";
                PreparedStatement smt=con.prepareStatement(sql);
                smt.setInt(1, id);
                int n=smt.executeUpdate();
                 if(n>0){
                     status=true;
                 }
                smt.close();
                cp.putConnection(con);
                
                
                
                
            }catch(Exception e){
                System.out.println("Error"+e.getMessage());
            }
            
            
        }
        
        
        
         return status;
         
        
    }
    
       public Reporter getById(int id) {
        Reporter reporter = null;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "select * from reporter where id=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, id);
                ResultSet rs = smt.executeQuery();
                if (rs.next()) {
                    reporter = new Reporter();
                    reporter.setId(rs.getInt("id"));
                    reporter.setName(rs.getString("name"));
                    reporter.setDob(rs.getString("dob"));
                    reporter.setGender(rs.getString("gender"));
                    reporter.setUserid(rs.getString("userid"));
                    reporter.setPassword(rs.getString("password"));
                    reporter.setImage(rs.getString("image"));
                    reporter.setContact(rs.getString("contact"));
                    reporter.setEmail(rs.getString("email"));
                    reporter.setStatus(rs.getString("status"));
               }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println("Error :" + e.getMessage());
            }
        }

        return reporter;
    }
       
       public Reporter getById(String userid) {
        Reporter reporter = null;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "select * from reporter where userid=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, userid);
                ResultSet rs = smt.executeQuery();
                if (rs.next()) {
                    reporter = new Reporter();
                    reporter.setId(rs.getInt("id"));
                    reporter.setName(rs.getString("name"));
                    reporter.setDob(rs.getString("dob"));
                    reporter.setGender(rs.getString("gender"));
                    reporter.setUserid(rs.getString("userid"));
                    reporter.setPassword(rs.getString("password"));
                    reporter.setImage(rs.getString("image"));
                    reporter.setContact(rs.getString("contact"));
                    reporter.setEmail(rs.getString("email"));
                    reporter.setStatus(rs.getString("status"));
               }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println("Error :" + e.getMessage());
            }
        }

        return reporter;
    }
       public ArrayList<Reporter> getAllRecord(){
           ArrayList<Reporter> ar=new ArrayList<Reporter>();
           ConnectionPool cp=ConnectionPool.getInstance();
      
        cp.initialize();
        Connection con = cp.getConnection();
        
         if(con!=null){
             
             try{
                 String sql="select*from reporter";
                 PreparedStatement smt= con.prepareStatement(sql);
                 ResultSet rs=smt.executeQuery();
                 while(rs.next()){
                     Reporter reporter=new Reporter();
                     reporter.setId(rs.getInt("id"));
                    reporter.setName(rs.getString("name"));
                    reporter.setDob(rs.getString("dob"));
                    reporter.setGender(rs.getString("gender"));
                    reporter.setUserid(rs.getString("userid"));
                    reporter.setPassword(rs.getString("password"));
                    reporter.setImage(rs.getString("image"));
                    reporter.setContact(rs.getString("contact"));
                    reporter.setEmail(rs.getString("email"));
                    reporter.setStatus(rs.getString("status"));
                     ar.add(reporter);
                             
                 }
                 
                 
             }catch(Exception e){
                 System.out.println("Error"+e.getMessage());
             }
         }
          return ar;
             
   }
         public ArrayList<Reporter> getRecordByLimit(int start, int end) {

        ArrayList<Reporter> reporters = new ArrayList<Reporter>();
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "select * from reporter limit ?,?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, start);
                smt.setInt(2, end);
                ResultSet rs = smt.executeQuery();
                while (rs.next()) {
                    Reporter reporter = new Reporter();
                    reporter.setId(rs.getInt("id"));
                    reporter.setName(rs.getString("name"));
                    reporter.setDob(rs.getString("dob"));
                    reporter.setGender(rs.getString("gender"));
                    reporter.setUserid(rs.getString("userid"));
                    reporter.setPassword(rs.getString("password"));
                    reporter.setImage(rs.getString("image"));
                    reporter.setContact(rs.getString("contact"));
                    reporter.setEmail(rs.getString("email"));
                    reporter.setStatus(rs.getString("status"));
                   reporters.add(reporter);
                }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println("Error :" + e.getMessage());
            }
        }

        return reporters;
    }
         
        public int getRecordsCount() {

        int total = 0;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "select count(*) from reporter";
                PreparedStatement smt = con.prepareStatement(sql);
                ResultSet rs = smt.executeQuery();
                if (rs.next()) {
                    total = rs.getInt(1);
                }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println("Error :" + e.getMessage());
            }
        }

        return total;
    }
        public boolean update(Reporter reporter) {
        boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "update Reporter set name=?,dob=?,gender=?,contact=?,email=?,image=?  where id=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, reporter.getName());
                smt.setString(2, reporter.getDob());
                smt.setString(3, reporter.getGender());
                smt.setString(4, reporter.getContact());
                smt.setString(5, reporter.getEmail());
                 smt.setString(6, reporter.getImage());
                smt.setInt(7, reporter.getId());
                if (smt.executeUpdate() > 0) {
                    status = true;
                }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println("Error :" + e.getMessage());
            }
        }

        return status;
    }
        
        
        
        public boolean isUserIdExist(String userid) {
        boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "select * from reporter where userid=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, userid);
                ResultSet rs = smt.executeQuery();
                if (rs.next()) {
                    status = true;
                }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println("Error :" + e.getMessage());
            }
        }

        return status;
    }
//         public Arraylist<NewsCato getById(int id) {
//        Reporter reporter = null;
//        ConnectionPool cp = ConnectionPool.getInstance();
//        cp.initialize();
//        Connection con = cp.getConnection();
//        if (con != null) {
//            try {
//                String sql = "select * from reporter where id=?";
//                PreparedStatement smt = con.prepareStatement(sql);
//                smt.setInt(1, id);
//                ResultSet rs = smt.executeQuery();
//                if (rs.next()) {
//                    reporter = new Reporter();
//                    reporter.setId(rs.getInt("id"));
//                    reporter.setName(rs.getString("name"));
//                    reporter.setDob(rs.getString("dob"));
//                    reporter.setGender(rs.getString("gender"));
//                    reporter.setUserid(rs.getString("userid"));
//                    reporter.setPassword(rs.getString("password"));
//                    reporter.setImage(rs.getString("image"));
//                    reporter.setContact(rs.getString("contact"));
//                    reporter.setEmail(rs.getString("email"));
//                    reporter.setStatus(rs.getString("status"));
//               }
//                smt.close();
//                cp.putConnection(con);
//            } catch (Exception e) {
//                System.out.println("Error :" + e.getMessage());
//            }
//        }
//
//        return reporter;
//    }

     
         
        
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
        
       }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

