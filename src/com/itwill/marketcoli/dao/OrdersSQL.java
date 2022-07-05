package com.itwill.marketcoli.dao;

public class OrdersSQL {

	// SQL 문장을 채워서 사용하세요

	public static final String ORDERS_INSERT = "insert into orders(o_no, o_date, o_price, u_id) values (orders_o_no_SEQ.nextval,sysdate, ?, ?)";
	public static final String ORDERITEM_INSERT
	//= "insert into order_item(oi_no, oi_qty, o_no, p_no) values(order_item_oi_no_SEQ.nextval, ? ,?, ?)";
			= "insert into order_item(oi_no, oi_qty, o_no, p_no) values(order_item_oi_no_SEQ.nextval, ? ,orders_o_no_SEQ.currval, ?)";
	/*
	insert into orders(o_no,o_date,o_price,u_id) values (orders_o_no_SEQ.nextval,sysdate,10500,'itwill7');
	insert into order_item(oi_no,oi_qty,o_no,p_no) values(order_item_oi_no_SEQ.nextval,1,orders_o_no_SEQ.currval,3);
	*/
	public static final String ORDERS_UPDATE = " ";

	public static final String ORDERS_DELETE = " ";

	public static final String ORDERS_SELECT_BY_NO = " ";

	public static final String ORDERS_SELECT_ALL = " ";
}
