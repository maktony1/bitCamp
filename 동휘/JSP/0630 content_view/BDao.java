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

public class BDao{
	private DataSource dataSource;
	
	public BDao() {
		try {
			Context context = new InitialContext();
			dataSource=(DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<BDto> list(){
		ArrayList<BDto> dtos = new ArrayList<BDto>();
		
		Connection con 			= null;
		PreparedStatement pstmt = null;
		ResultSet rs 		    = null;
		
		String query = null;
		
		try {
			query = "select * from mvc_board order by bGroup desc, bStep asc";
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int bId = rs.getInt("bId");
				String bName = rs.getString("bName");
				String bTitle = rs.getString("bTitle");
				String bContent = rs.getString("bContent");
				Timestamp bDate = rs.getTimestamp("bDate");
				int bHit = rs.getInt("bHit");
				int bGroup= rs.getInt("bGroup");
				int bStep= rs.getInt("bStep");
				int bindent= rs.getInt("bindent");

				BDto dto= new BDto(bId,bName,bTitle,bContent,bDate,bHit,bGroup,bStep,bindent);
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dtos;
	}

	
	///////////////////////////////////////////////////////////////////////////////////////
	
	public BDto contentView(String strId) {
		ArrayList<BDto> dtos = new ArrayList<BDto>();
		
		BDto dto= null;
		
		Connection con 			= null;
		PreparedStatement pstmt = null;
		ResultSet rs 		    = null;
		
		String query = null;
		
		try {
			con = dataSource.getConnection(); 
			query = "select * from mvc_board where bId = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(strId));
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int bId = rs.getInt("bId");
				String bName = rs.getString("bName");
				String bTitle = rs.getString("bTitle");
				String bContent = rs.getString("bContent");
				Timestamp bDate = rs.getTimestamp("bDate");
				int bHit = rs.getInt("bHit");
				int bGroup= rs.getInt("bGroup");
				int bStep= rs.getInt("bStep");
				int bindent= rs.getInt("bindent");
				
				dto= new BDto(bId,bName,bTitle,bContent,bDate,bHit,bGroup,bStep,bindent);
				
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}

	public void delete(String bId) {
		Connection connect =null;
		PreparedStatement pstmt=null;
		
		String query = null;
		
		try {
			connect=dataSource.getConnection();
			query="delete from mvc_board where bId = ?";
			pstmt = connect.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(bId));
			int rn = pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(connect != null) connect.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}

