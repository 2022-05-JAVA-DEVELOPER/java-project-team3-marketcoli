package com.itwill.marketcoli.임은비;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;



public class ReviewDao {

	private DataSource dataSource;
	public ReviewDao() {
		dataSource = new DataSource();
	}
	
	/*
	 private int r_no;			//후기 번호
	private String r_image;		//후기 이미지
	private String r_content;	//후기 글
	private Date r_wdate;		//후기 작성일자
	private int r_rating;		//후기 평가
	private int p_no;			//상품번호
	private int u_no;			//상품이름
	private String u_name;		//회원이름
	private Date o_date;		//주문일자
	 */
	
	public int insertReview (Review review) throws Exception{
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReviewSql.REVIEW_INSERT);
		
		pstmt.setString(1, review.getR_image());
		pstmt.setString(2, review.getR_content());
		pstmt.setInt(3, review.getR_rating());
		/*
		pstmt.setInt(4, review.getP_no());
		pstmt.setInt(5, review.getU_no());
		pstmt.setString(6, review.getU_name());
		*/
		
		pstmt.setInt(4,review.getProduct().getP_no());
		pstmt.setInt(5, review.getUserInfo().getU_no());
		pstmt.setString(6, review.getUserInfo().getU_name());
		
		/*
		Date odate = review.getOrders().getO_date();
		java.sql.Date utildate = new java.sql.Date(odate.getTime());
		pstmt.setDate(7, utildate);
		*/
		pstmt.setDate(7, new java.sql.Date(review.getOrders().getO_date().getTime()) );
		
		
		int rowCount = pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
		
		return rowCount;
		
		
		
	}
	
	public int upadateReview(Review review) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReviewSql.REVIEW_UPDATE);
		pstmt.setString(1, review.getR_image());
		pstmt.setString(2, review.getR_content());
		pstmt.setInt(3, review.getR_rating());
		pstmt.setInt(4, review.getUserInfo().getU_no());
		
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		
		return rowCount;
		
	}
	
	public int deleteReview(int r_no) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReviewSql.REVIEW_DELETE);
		pstmt.setInt(1, r_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		
		return rowCount;
	}
	

	
	//select - 후기번호로 조회(전체상품조회 후 후기 상세조회)
	
/*	
	
	//list 마이페이지에서 조회 다시하기
	public Review selectIdReview(int u_no) throws Exception{
		Review findReviewId = null;
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReviewSql.REVIEW_SELECT_ID);
		pstmt.setInt(1, u_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			findReviewId = new Review(rs.getInt("r_no"), rs.getString("r_image"), 
									 rs.getString("r_content"), 
									 rs.getDate("r_wdate"), 
									 rs.getInt("r_rating"), 
									 rs.getInt("p_no"), rs.getInt("u_no"), 
									 rs.getString("u_name"), rs.getDate("o_date"));
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return findReviewId;
		
	}
	 
	
	//list 다시하기
	public Review selectProductReview(int p_no) throws Exception{
		Review findReviewProduct = null;
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReviewSql.REVIEW_SELECT_PRODUCT);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			findReviewProduct = new Review(rs.getInt("r_no"), rs.getString("r_image"), 
									 rs.getString("r_content"), 
									 rs.getDate("r_wdate"), 
									 rs.getInt("r_rating"), 
									 rs.getInt("p_no"), rs.getInt("u_no"), 
									 rs.getString("u_name"), rs.getDate("o_date"));
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return findReviewProduct;
		
	}
	
	
*/	
	
}
