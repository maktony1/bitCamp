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
         dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle"); //위치 알기
      }catch(Exception e) {
         e.printStackTrace();
      }   
   }
   
   //테이블 안의 모든 데이터를 가져오는 필수 함수.
   public ArrayList<BDto> list(){
      ArrayList<BDto> dtos = new ArrayList<BDto>();
      
      Connection c = null;
      PreparedStatement ps = null;//Prepared로 !!! 
      ResultSet r = null;
      
      String query = null;
      
      try {
         
         //sql문은 오라클에서 짜고 복사 가져오기.
         //-- 가장 최신 것이 위로 올라가도록 정렬.--
         query = "select * from mvc_board order by bGroup desc, bStep asc";   //끝에 세미콜론 X
         
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