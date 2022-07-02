package com.itwill.marketcoli.김하림;
/*
이름        널?       유형             
--------- -------- -------------- 
O_NO      NOT NULL NUMBER(10)     
O_DATE             DATE           
O_STATE   NOT NULL VARCHAR2(30)   
U_NAME    NOT NULL VARCHAR2(15)   
U_PHONE   NOT NULL NUMBER(20)     
U_ADDRESS NOT NULL VARCHAR2(100)  
U_NO      NOT NULL NUMBER(10)     
P_NO               NUMBER(10)     
D_FEE              NUMBER(10)     
D_MEMO             VARCHAR2(3000) 
P_PIECE            NUMBER(10)     
P_PRICE            NUMBER(10)     
P_NAME             VARCHAR2(50)   
 */

import java.util.Date;

import com.itwill.marketcoli.dto.Product;
import com.itwill.marketcoli.dto.UserInfo;

/**
 * @author ITWILL
 *
 */
public class Orders {

	private int o_no;			//주문번호
	private Date o_date;		//주문일시
	private String o_state;		//주문상태
	private int d_fee;			//배송비
	private int p_piece;		//상품수량
	private Product product;
	private UserInfo userInfo;
	//private String u_name;		//회원이름
	//private int u_phone;		//휴대폰번호
	//private String u_address;	//주소
	//private int u_no;			//회원번호
	//private int p_no;			//상품번호
	//private String d_memo;		//배송메모
	//private int p_price;		//상품가격
	//private String p_name;			//상품이름
	
	public Orders() {
	}
	public Orders(int o_no, Date o_date, String o_state, int d_fee, int p_piece, Product product, UserInfo userInfo) {
		super();
		this.o_no = o_no;
		this.o_date = o_date;
		this.o_state = o_state;
		this.d_fee = d_fee;
		this.p_piece = p_piece;
		this.product = product;
		this.userInfo = userInfo;
	}
	public int getO_no() {
		return o_no;
	}
	public void setO_no(int o_no) {
		this.o_no = o_no;
	}
	public Date getO_date() {
		return o_date;
	}
	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}
	public String getO_state() {
		return o_state;
	}
	public void setO_state(String o_state) {
		this.o_state = o_state;
	}
	public int getD_fee() {
		return d_fee;
	}
	public void setD_fee(int d_fee) {
		this.d_fee = d_fee;
	}
	public int getP_piece() {
		return p_piece;
	}
	public void setP_piece(int p_piece) {
		this.p_piece = p_piece;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	@Override
	public String toString() {
		return "Orders [o_no=" + o_no + ", o_date=" + o_date + ", o_state=" + o_state + ", d_fee=" + d_fee
				+ ", p_piece=" + p_piece + ", product=" + product + ", userInfo=" + userInfo + "]";
	}
	
	
	
}

	