package edu.bit.ex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import edu.bit.ex.dto.BDto;

public class BDao {

   private DataSource dataSource;
   
   
   public BDao(){
      try {
         Context context = new InitialContext();
         dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle"); //��ġ �˱�
      }catch(Exception e) {
         e.printStackTrace();
      }   
   }
   
   //���̺� ���� ��� �����͸� �������� �ʼ� �Լ�.
   public ArrayList<BDto> list(){
      ArrayList<BDto> dtos = new ArrayList<BDto>();
      
      Connection c = null;
      PreparedStatement ps = null;//Prepared�� !!! 
      ResultSet r = null;
      
      String query = null;
      
      try {
         
         //sql���� ����Ŭ���� ¥�� ���� ��������.
         //-- ���� �ֽ� ���� ���� �ö󰡵��� ����.--
         query = "select * from mvc_board order by bGroup desc, bStep asc";   //���� �����ݷ� X
         
         c = dataSource.getConnection();
         ps = c.prepareStatement(query);
         r = ps.executeQuery();
         
         
         
         while(r.next()){
            
            int bId = r.getInt("bId");
            String bName = r.getString("bName");
            String bTitle = r.getString("bTitle");
            String bContent = r.getString("bContent");
            Timestamp bDate = r.getTimestamp("bDate");
            int bHit = r.getInt("bHit");
            int bGroup = r.getInt("bGroup");
            int bStep = r.getInt("bStep");
            int bIndent = r.getInt("bIndent");
            
            BDto dto = new BDto(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
            dtos.add(dto);
         }
         
         
         
         
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         try {
            if(r != null) r.close();
            if(ps != null) ps.close();
            if(c != null) c.close();
            
         }catch(Exception e ) {
            e.printStackTrace();
         }
      }
      
      return dtos;
   }
   
}