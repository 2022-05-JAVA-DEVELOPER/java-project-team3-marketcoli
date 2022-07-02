package com.itwill.marketcoli.김봉균;

public class UserInfoSQL {
	
	//SQL 문장을 채워서 사용하세요
	
	public static final String USERINFO_INSERT
	 = "insert into userinfo values(userinfo_u_no_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";

	public static final String USERINFO_UPDATE 
	 = " ";
	
	public static final String USERINFO_DELETE 
	 = "delete from userinfo where u_no = ?";
	
	public static final String USERINFO_SELECT_BY_ID
	 = "select u_id from userinfo where u_email = ?";
	
	public static final String USERINFO_SELECT_BY_PW 
	 = "select u_pw from userinfo where u_id = ? and u_email = ?";
	
	public static final String USERINFO_SELECT_ALL 
	 = "select * from userinfo";

	public static final String USERINFO_SELECT_BY_NO
	 = "select u_id from userinfo where u_no = ?";
}
