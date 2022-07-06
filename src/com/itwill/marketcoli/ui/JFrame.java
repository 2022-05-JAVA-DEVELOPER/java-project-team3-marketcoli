package com.itwill.marketcoli.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.javafx.scene.control.SelectedCellsMap;

import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Insets;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.FlowLayout;
import javax.swing.JTextField;

import java.awt.FlowLayout;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

// 사이즈 setBounds(100, 100, 390, 844);  
// Jpanel 로 만들어주세요

public class JFrame extends javax.swing.JFrame {

	private JPanel contentPane;

	private JTabbedPane noticeTabbedPane;
	private JPanel notice2;
	private JTextField notice2Date;
	private JTextField notice2Title;
	private JTextField notice3Date;
	private JTextField notice3Title;
	private JTextField notice1Date;
	private JTextField notice1Title;
	private JTextField orderUserInfoTF;
	private JTextField destinationTF;
	private JTextField detailInfoTF;
	private JTextField orderProductTF;
	private JTextField phoneTF;
	private JLabel orderFinalPriceLB;
	private JLabel orderPriceLB;
	private JLabel p_PriceLB;
	private JLabel discount_FeeLB;
	private JLabel d_FeeLB;
	private JLabel orderTotalPriceLB;
	private JButton orderBtn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 680);
		
		JMenuBar menuBar = new JMenuBar();
		
		menuBar.setBounds(new Rectangle(100, 0, 0, 0));
		menuBar.setSize(new Dimension(100, 0));
		menuBar.setAlignmentY(Component.CENTER_ALIGNMENT);
		menuBar.setAlignmentX(Component.LEFT_ALIGNMENT);
		setJMenuBar(menuBar);
		
		
		JMenu cartMenu = new JMenu("");
		cartMenu.setHorizontalAlignment(SwingConstants.RIGHT);
		cartMenu.setIcon(new ImageIcon(JFrame.class.getResource("/images/simpol/cart.png")));
		menuBar.add(cartMenu);
		
		JMenuItem nothing1 = new JMenuItem("");
		nothing1.setEnabled(false);
		menuBar.add(nothing1);
		
		JMenu titleMenu = new JMenu("Market Coli");
		titleMenu.setForeground(new Color(128, 0, 128));
		titleMenu.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		titleMenu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(titleMenu);
		menuBar.setSize(300, 20);
		
		JMenuItem nothing2 = new JMenuItem("");
		nothing2.setEnabled(false);
		menuBar.add(nothing2);
		
		JMenu userMenu = new JMenu("");
		userMenu.setHorizontalAlignment(SwingConstants.CENTER);
		userMenu.setIcon(new ImageIcon(JFrame.class.getResource("/images/simpol/door.png")));
		menuBar.add(userMenu);
		
		JMenuItem joinMenuItem = new JMenuItem("회원가입");
		userMenu.add(joinMenuItem);
		
		join join_ = new join();
		userMenu.add(join_);
		
		JMenuItem loginMenuItem = new JMenuItem("로그인");
		userMenu.add(loginMenuItem);
		
		JMenuItem mypageMenuItem_4 = new JMenuItem("마이페이지");
		userMenu.add(mypageMenuItem_4);
		
		JMenuItem logoutMenuItem_5 = new JMenuItem("로그아웃");
		userMenu.add(logoutMenuItem_5);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane mainTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(mainTabbedPane);
		
		JPanel productPanel = new JPanel();
		mainTabbedPane.addTab("상품", null, productPanel, null);
		productPanel.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane productTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		productPanel.add(productTabbedPane, BorderLayout.CENTER);
		
		JPanel productMainPanel = new JPanel();
		productTabbedPane.addTab("상품전체보기", null, productMainPanel, null);
		productMainPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane productMainScrollPane = new JScrollPane();
		productMainPanel.add(productMainScrollPane, BorderLayout.CENTER);
		
		JPanel productAllPanel = new JPanel();
		productAllPanel.setPreferredSize(new Dimension(10, 800));
		productMainScrollPane.setViewportView(productAllPanel);
		productAllPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	
		JPanel productItemPanel = new JPanel();
		productItemPanel.setPreferredSize(new Dimension(300, 155));
		productItemPanel.setBackground(new Color(230, 230, 250));
		productAllPanel.add(productItemPanel);
		productItemPanel.setLayout(null);
		
		JLabel productMainLabel1 = new JLabel("");
		productMainLabel1.setIcon(new ImageIcon(JFrame.class.getResource("/images/listProduct/석류.jpg")));
		productMainLabel1.setBounds(12, 10, 135, 135);
		productItemPanel.add(productMainLabel1);
		
		JLabel productMainLabel2 = new JLabel("");
		productMainLabel2.setBounds(159, 21, 140, 15);
		productItemPanel.add(productMainLabel2);
		
		JLabel productMainLabel3 = new JLabel("");
		productMainLabel3.setBounds(159, 46, 140, 15);
		productItemPanel.add(productMainLabel3);
		
		JLabel productMainLabel4 = new JLabel("");
		productMainLabel4.setBounds(159, 65, 140, 51);
		productItemPanel.add(productMainLabel4);
		
		JComboBox productComboBox = new JComboBox();
		productComboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		productComboBox.setBounds(214, 120, 39, 25);
		productItemPanel.add(productComboBox);

		JButton productCartBtn = new JButton("");
		productCartBtn.setIcon(new ImageIcon(JFrame.class.getResource("/images/simpol/cart.png")));
		productCartBtn.setBounds(256, 120, 32, 25);
		productItemPanel.add(productCartBtn);

		JPanel productServePanel = new JPanel();
		productTabbedPane.addTab("상품상세보기", null, productServePanel, null);
		productServePanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane productServelScrollPane = new JScrollPane();
		productServePanel.add(productServelScrollPane, BorderLayout.CENTER);
		
		JPanel productDetailpanel = new JPanel();
		productDetailpanel.setPreferredSize(new Dimension(10, 550));
		productServelScrollPane.setViewportView(productDetailpanel);
		productDetailpanel.setLayout(null);
		
		JLabel productDetailImegeLabel = new JLabel("");
		productDetailImegeLabel.setIcon(new ImageIcon(JFrame.class.getResource("/images/detailProduct/석류.jpg")));
		productDetailImegeLabel.setBounds(12, 10, 310, 310);
		productDetailpanel.add(productDetailImegeLabel);
		
		JComboBox productDetailComboBox = new JComboBox();
		productDetailComboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		productDetailComboBox.setBounds(205, 500, 39, 25);
		productDetailpanel.add(productDetailComboBox);
		
		JButton productDetailCartBtn = new JButton("");
		productDetailCartBtn.setIcon(new ImageIcon(JFrame.class.getResource("/images/simpol/cart.png")));
		productDetailCartBtn.setBounds(255, 500, 67, 25);
		productDetailpanel.add(productDetailCartBtn);
		
		JLabel productDetailTitleLabel = new JLabel("");
		productDetailTitleLabel.setFont(new Font("굴림", Font.BOLD, 15));
		productDetailTitleLabel.setBounds(12, 330, 46, 32);
		productDetailpanel.add(productDetailTitleLabel);
		
		JLabel productDetailExpLabel = new JLabel("");
		productDetailExpLabel.setBounds(12, 372, 311, 76);
		productDetailpanel.add(productDetailExpLabel);
		
		JLabel productDetailPriceLabel = new JLabel("");
		productDetailPriceLabel.setBounds(12, 500, 181, 25);
		productDetailpanel.add(productDetailPriceLabel);
		
		JPanel cartPanel = new JPanel();
		cartPanel.setBackground(new Color(255, 255, 255));
		mainTabbedPane.addTab("\uC7A5\uBC14\uAD6C\uB2C8", null, cartPanel, null);
		cartPanel.setLayout(null);
		
		JCheckBox savingAddressCheckbox = new JCheckBox("기존주소지");
		savingAddressCheckbox.setFont(new Font("굴림", Font.BOLD, 13));
		savingAddressCheckbox.setBounds(8, 31, 115, 23);
		cartPanel.add(savingAddressCheckbox);
		
		JLabel savingAddress = new JLabel("서울특별시 강남구 ");
		savingAddress.setFont(new Font("굴림", Font.PLAIN, 12));
		savingAddress.setBounds(131, 35, 152, 15);
		cartPanel.add(savingAddress);
		
		
		JCheckBox productAllCheckBox = new JCheckBox("상품 전체선택");
		productAllCheckBox.setSelected(true);
		productAllCheckBox.setFont(new Font("굴림", Font.BOLD, 12));
		productAllCheckBox.setBounds(8, 108, 115, 23);
		cartPanel.add(productAllCheckBox);
		boolean setSelected;

		JCheckBox product1CheckBox = new JCheckBox("");
		product1CheckBox.setBounds(36, 187, 21, 23);
		cartPanel.add(product1CheckBox);
		
		JCheckBox product2CheckBox = new JCheckBox("");
		product2CheckBox.setBounds(36, 345, 21, 23);
		cartPanel.add(product2CheckBox);
		
		JLabel productName1 = new JLabel("빨가면 사과,사과는 맛있어! ");
		productName1.setBounds(116, 137, 127, 23);
		productName1.setFont(new Font("굴림", Font.BOLD, 12));
		productName1.setBounds(65, 130, 127, 23);
		cartPanel.add(productName1);
		
		JLabel productName2 = new JLabel("나는 신비복숭아");
		productName2.setBounds(118, 299, 57, 15);
		productName2.setFont(new Font("굴림", Font.BOLD, 12));
		productName2.setBounds(65, 296, 131, 15);
		cartPanel.add(productName2);
		
		JLabel product2Image2 = new JLabel("");
		product2Image2.setIcon(new ImageIcon(JFrame.class.getResource("/images/과일/복숭아7090.jpg")));
		product2Image2.setBounds(116, 332, 70, 90);
		product2Image2.setBounds(65, 321, 70, 90);
		cartPanel.add(product2Image2);
		
		JLabel productPrice1 = new JLabel("금액:");
		productPrice1.setBounds(248, 198, 57, 15);
		productPrice1.setBounds(161, 187, 57, 15);
		cartPanel.add(productPrice1);
		
		JLabel productPrice2 = new JLabel("금액:");
		productPrice2.setBounds(248, 365, 57, 15);
		productPrice2.setBounds(161, 345, 57, 15);
		cartPanel.add(productPrice2);
		JLabel product1Image1 = new JLabel("");
		product1Image1.setIcon(new ImageIcon(JFrame.class.getResource("/images/과일/사과7090.jpg")));
		product1Image1.setBounds(65, 163, 70, 90);
		cartPanel.add(product1Image1);
		
		JButton orderBTn = new JButton("주문하기");
		orderBTn.setForeground(new Color(255, 255, 255));
		orderBTn.setBackground(new Color(204, 0, 255));
		orderBTn.setFont(new Font("굴림", Font.BOLD, 25));
		orderBTn.setBounds(36, 497, 290, 52);
		cartPanel.add(orderBTn);
		
		JButton deleteBtn = new JButton("선택물품 삭제");
		deleteBtn.setBounds(225, 108, 122, 23);
		cartPanel.add(deleteBtn);
		
		JPanel orderPanel = new JPanel();
		mainTabbedPane.addTab("주문하기", null, orderPanel, null);
		orderPanel.setLayout(null);
		
		JLabel text1 = new JLabel("주 문 상 품");
		text1.setHorizontalAlignment(SwingConstants.CENTER);
		text1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		text1.setBounds(43, 35, 88, 15);
		orderPanel.add(text1);
		
		JLabel text2 = new JLabel("주문자 정보");
		text2.setHorizontalAlignment(SwingConstants.CENTER);
		text2.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		text2.setBounds(43, 63, 88, 15);
		orderPanel.add(text2);
		
		JLabel text4 = new JLabel("배 송 지");
		text4.setHorizontalAlignment(SwingConstants.CENTER);
		text4.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		text4.setBounds(43, 122, 88, 15);
		orderPanel.add(text4);
		
		orderUserInfoTF = new JTextField();
		orderUserInfoTF.setColumns(10);
		orderUserInfoTF.setBounds(143, 60, 171, 21);
		orderPanel.add(orderUserInfoTF);
		orderUserInfoTF.setText("안소진");
		
		destinationTF = new JTextField();
		destinationTF.setColumns(10);
		destinationTF.setBounds(143, 119, 171, 21);
		orderPanel.add(destinationTF);
		destinationTF.setText("서울시 강남구 아이티윌");
		
		detailInfoTF = new JTextField();
		detailInfoTF.setColumns(10);
		detailInfoTF.setBounds(143, 150, 171, 21);
		orderPanel.add(detailInfoTF);
		
		JLabel text5 = new JLabel("상세 정보 입력");
		text5.setHorizontalAlignment(SwingConstants.CENTER);
		text5.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		text5.setBounds(43, 153, 88, 15);
		orderPanel.add(text5);
		
		orderProductTF = new JTextField();
		orderProductTF.setForeground(Color.BLACK);
		orderProductTF.setColumns(10);
		orderProductTF.setBounds(143, 32, 171, 21);
		orderPanel.add(orderProductTF);
		orderProductTF.setText("빨가면 사과...외 1종");
		
		orderBtn = new JButton("주  문  하  기");
		orderBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"주문이 완료 되었습니다.");
			}
		});
		orderBtn.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		orderBtn.setBackground(new Color(147, 112, 219));
		orderBtn.setBounds(23, 507, 310, 31);
		orderPanel.add(orderBtn);
		
		JLabel text16 = new JLabel("최종 결제 금액");
		text16.setFont(new Font("Dialog", Font.BOLD, 15));
		text16.setBounds(63, 454, 111, 23);
		orderPanel.add(text16);
		
		JLabel text11 = new JLabel("결 제 금 액");
		text11.setHorizontalAlignment(SwingConstants.CENTER);
		text11.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		text11.setBounds(43, 317, 88, 15);
		orderPanel.add(text11);
		
		JLabel text13 = new JLabel("┖ 상품금액");
		text13.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		text13.setBounds(63, 366, 79, 15);
		orderPanel.add(text13);
		
		JLabel text12 = new JLabel("주 문 금 액");
		text12.setHorizontalAlignment(SwingConstants.CENTER);
		text12.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		text12.setBounds(43, 341, 88, 15);
		orderPanel.add(text12);
		
		JLabel text14 = new JLabel("┖ 할인금액");
		text14.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		text14.setBounds(63, 391, 79, 15);
		orderPanel.add(text14);
		
		JLabel text15 = new JLabel("배  송  비");
		text15.setHorizontalAlignment(SwingConstants.CENTER);
		text15.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		text15.setBounds(43, 416, 88, 15);
		orderPanel.add(text15);
		
		orderFinalPriceLB = new JLabel("0");
		orderFinalPriceLB.setHorizontalAlignment(SwingConstants.RIGHT);
		orderFinalPriceLB.setBounds(227, 319, 57, 15);
		orderPanel.add(orderFinalPriceLB);
		
		orderPriceLB = new JLabel("0");
		orderPriceLB.setHorizontalAlignment(SwingConstants.RIGHT);
		orderPriceLB.setBounds(227, 343, 57, 15);
		orderPanel.add(orderPriceLB);
		
		p_PriceLB = new JLabel("0");
		p_PriceLB.setHorizontalAlignment(SwingConstants.RIGHT);
		p_PriceLB.setBounds(227, 368, 57, 15);
		orderPanel.add(p_PriceLB);
		
		discount_FeeLB = new JLabel("0");
		discount_FeeLB.setHorizontalAlignment(SwingConstants.RIGHT);
		discount_FeeLB.setBounds(227, 393, 57, 15);
		orderPanel.add(discount_FeeLB);
		
		d_FeeLB = new JLabel("0");
		d_FeeLB.setHorizontalAlignment(SwingConstants.RIGHT);
		d_FeeLB.setBounds(227, 418, 57, 15);
		orderPanel.add(d_FeeLB);
		
		JLabel text6 = new JLabel("결 제 수 단");
		text6.setHorizontalAlignment(SwingConstants.CENTER);
		text6.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		text6.setBounds(43, 213, 88, 15);
		orderPanel.add(text6);
		
		JLabel won5 = new JLabel("원");
		won5.setBounds(290, 418, 57, 15);
		orderPanel.add(won5);
		
		JLabel won4 = new JLabel("원");
		won4.setBounds(290, 393, 57, 15);
		orderPanel.add(won4);
		
		JLabel won3 = new JLabel("원");
		won3.setBounds(290, 368, 57, 15);
		orderPanel.add(won3);
		
		JLabel won2 = new JLabel("원");
		won2.setBounds(290, 343, 57, 15);
		orderPanel.add(won2);
		
		JLabel won1 = new JLabel("원");
		won1.setBounds(290, 318, 57, 15);
		orderPanel.add(won1);
		
		JLabel won6 = new JLabel("원");
		won6.setHorizontalAlignment(SwingConstants.LEFT);
		won6.setFont(new Font("Dialog", Font.PLAIN, 15));
		won6.setBounds(290, 453, 57, 24);
		orderPanel.add(won6);
		
		orderTotalPriceLB = new JLabel("0");
		orderTotalPriceLB.setHorizontalAlignment(SwingConstants.RIGHT);
		orderTotalPriceLB.setFont(new Font("Dialog", Font.PLAIN, 15));
		orderTotalPriceLB.setBounds(227, 455, 57, 21);
		orderPanel.add(orderTotalPriceLB);
		orderTotalPriceLB.setText("450000");
		
		JRadioButton text7 = new JRadioButton("신용 카드");
		text7.setBounds(63, 234, 93, 23);
		orderPanel.add(text7);
		
		JRadioButton text9 = new JRadioButton("간편 결제");
		text9.setBounds(63, 259, 93, 23);
		orderPanel.add(text9);
		
		JRadioButton text8 = new JRadioButton("계좌 이체");
		text8.setBounds(223, 234, 93, 23);
		orderPanel.add(text8);
		
		JRadioButton text10 = new JRadioButton("휴대폰 결제");
		text10.setBounds(223, 259, 93, 23);
		orderPanel.add(text10);
		
		phoneTF = new JTextField();
		phoneTF.setColumns(10);
		phoneTF.setBounds(143, 88, 171, 21);
		orderPanel.add(phoneTF);
		phoneTF.setText("01011112222");
		
		JLabel text3 = new JLabel("휴대폰 번호");
		text3.setHorizontalAlignment(SwingConstants.CENTER);
		text3.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		text3.setBounds(43, 91, 88, 15);
		orderPanel.add(text3);
		
		JPanel noticePanel = new JPanel();
		mainTabbedPane.addTab("공지사항", null, noticePanel, null);
		noticePanel.setLayout(new BorderLayout(0, 0));
		
		noticeTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		noticePanel.add(noticeTabbedPane);
		
		JPanel notice1 = new JPanel();
		noticeTabbedPane.addTab("안내문", null, notice1, null);
		notice1.setLayout(null);
		
		notice1Date = new JTextField();
		notice1Date.setText("작성일자");
		notice1Date.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		notice1Date.setBounds(245, 3, 116, 30);
		notice1Date.setColumns(10);
		notice1.add(notice1Date);
		
		JTextPane notice1Content = new JTextPane();
		notice1Content.setEditable(false);
		notice1Content.setText("안녕하세요! 마켓콜리 입니다. 마켓콜리를 사랑해주시고 아껴주신 고객님께 진심으로 감사드립니다. 저희 마켓콜리 상품 구매 시 회원가입이 필요합니다. 회원가입 절차 진행 후 구매 부탁드립니다.");
		notice1Content.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		notice1Content.setBounds(0, 42, 354, 500);
		notice1.add(notice1Content);
		
		notice1Title = new JTextField();
		notice1Title.setText("안내문");
		notice1Title.setBounds(1, 3, 233, 30);
		notice1Title.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		notice1Title.setColumns(10);
		notice1.add(notice1Title);
		
		notice2 = new JPanel();
		noticeTabbedPane.addTab("배송 안내", null, notice2, null);
		notice2.setLayout(null);
		
		notice2Date = new JTextField();
		notice2Date.setText("작성일자");
		notice2Date.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		notice2Date.setBounds(245, 3, 116, 30);
		notice2.add(notice2Date);
		notice2Date.setColumns(10);
		
		JTextPane notice2Content = new JTextPane();
		notice2Content.setEditable(false);
		notice2Content.setText("안녕하세요! 마켓콜리 입니다. 마켓콜리를 사랑해주시고 아껴주신 고객님께 진심으로 감사드립니다. 오전에 주문 시 당일 출고되어 배송됩니다.");
		notice2Content.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		notice2Content.setBounds(0, 42, 354, 500);
		notice2.add(notice2Content);
		
		notice2Title = new JTextField();
		notice2Title.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		notice2Title.setText("배송 안내");
		notice2Title.setBounds(1, 3, 233, 30);
		notice2.add(notice2Title);
		notice2Title.setColumns(10);
		
		JPanel notice3 = new JPanel();
		notice3.setLayout(null);
		noticeTabbedPane.addTab("긴급공지", null, notice3, null);
		
		notice3Date = new JTextField();
		notice3Date.setText("작성일자");
		notice3Date.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		notice3Date.setColumns(10);
		notice3Date.setBounds(245, 3, 116, 30);
		notice3.add(notice3Date);
		
		JTextPane notice3Content = new JTextPane();
		notice3Content.setEditable(false);
		notice3Content.setText("안녕하세요! 마켓콜리 입니다. 마켓콜리를 사랑해주시고 아껴주신 고객님께 진심으로 감사드립니다. 현재 코로나 사태로 인한 배송량이 급증하여 당일출고가 어려운점 안내드립니다. 회원님들의 양해 부탁드립니다. 항상 최선을 다하는 마켓콜리가 되겠습니다. ");
		notice3Content.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		notice3Content.setBounds(0, 42, 354, 500);
		notice3.add(notice3Content);
		
		notice3Title = new JTextField();
		notice3Title.setText("긴급공지");
		notice3Title.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		notice3Title.setColumns(10);
		notice3Title.setBounds(1, 3, 233, 30);
		notice3.add(notice3Title);
	}

}
		/*
		productService= new ProductService();
		try {
			productListDisplay();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
		 */
	/****************productListDisplay 메소드******************/
		/*
	public void productListDisplay() throws Exception{
		productAllPanel.removeAll();
			List<Product> productList=productService.productList();
			for(int i=0;i<productList.size();i++) {
				Product product=productList.get(i);
				
				JPanel productAllPanel = new JPanel();
				productAllPanel.setPreferredSize(new Dimension(10, 800));
				productMainScrollPane.setViewportView(productAllPanel);
				productAllPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
				JPanel productItemPanel = new JPanel();
				productItemPanel.setPreferredSize(new Dimension(300, 155));
				productItemPanel.setBackground(new Color(230, 230, 250));
				productAllPanel.add(productItemPanel);
				productItemPanel.setLayout(null);
				
				JLabel productMainLabel1 = new JLabel("");
				productMainLabel1.setIcon(new ImageIcon(JFrame.class.getResource("/images/listProduct/석류.jpg")));
				productMainLabel1.setBounds(12, 10, 135, 135);
				productItemPanel.add(productMainLabel1);
				
				JLabel productMainLabel2 = new JLabel(product.getP_name());
				productMainLabel2.setBounds(159, 21, 39, 15);
				productItemPanel.add(productMainLabel2);
				
				JLabel productMainLabel3 = new JLabel(product.getP_price()+"");
				productMainLabel3.setBounds(159, 46, 48, 15);
				productItemPanel.add(productMainLabel3);
				
				JLabel productMainLabel4 = new JLabel(product.getP_exp());
				productMainLabel4.setBounds(159, 65, 48, 51);
				productItemPanel.add(productMainLabel4);
				
				JComboBox productComboBox = new JComboBox();
				productComboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
				productComboBox.setBounds(214, 120, 39, 25);
				productItemPanel.add(productComboBox);
	
			}
	
	*/
	
