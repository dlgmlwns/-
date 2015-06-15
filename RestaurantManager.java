package restaurant;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class RestaurantManager extends Frame implements ActionListener{
	String selname;
	CardLayout cardLayout = null;
	JComboBox nameCB = new JComboBox();
	JComboBox month = new JComboBox();
	JComboBox day = new JComboBox();
	JComboBox hour = new JComboBox();
	JComboBox month2 = new JComboBox();
	JComboBox day2 = new JComboBox();
	JComboBox hour2 = new JComboBox();
	MenuItem exit, save, Back;
	JButton add = new JButton("추가");
	JButton conti = new JButton("계속");
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btn10 = new JButton("10");
	JButton btn11 = new JButton("11");
	JButton btn12 = new JButton("12");
	JButton btn13 = new JButton("13");
	JButton btn14 = new JButton("14");
	JButton btn15 = new JButton("15");
	JButton btn16 = new JButton("16");
	JButton btn17 = new JButton("17");
	JButton btn18 = new JButton("18");
	JButton btn19 = new JButton("19");
	JButton btn20 = new JButton("20");
	JButton btn21 = new JButton("21");
	JButton btn22 = new JButton("22");
	JButton btn23 = new JButton("23");
	JButton btn24 = new JButton("24");
	JButton btn25 = new JButton("25");
	JButton btn26 = new JButton("26");
	JButton btn27 = new JButton("27");
	JButton btn28 = new JButton("28");
	JButton btn29 = new JButton("29");
	JButton btn30 = new JButton("30");
	JButton btn31 = new JButton("31");
	JButton btn32 = new JButton("32");
	JButton btn33 = new JButton("33");
	JButton btn34 = new JButton("34");
	JButton btn35 = new JButton("35");
	JButton btn36 = new JButton("36");
	JButton btn37 = new JButton("37");
	JButton btn38 = new JButton("38");
	JButton btn39 = new JButton("39");
	JButton btn40 = new JButton("40");
	JButton btn41 = new JButton("41");
	JButton btn42 = new JButton("42");
	JButton btn43 = new JButton("43");
	JButton btn44 = new JButton("44");
	JButton btn45 = new JButton("45");
	JButton btn46 = new JButton("46");
	JButton btn47 = new JButton("47");
	JButton btn48 = new JButton("48");
	JButton btn49 = new JButton("49");
	JButton btn50 = new JButton("50");
	JButton[] button = new JButton[] {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30, btn31, btn32, btn33, btn34, btn35, btn36, btn37, btn38, btn39, btn40, btn41, btn42, btn43, btn44, btn45, btn46, btn47, btn48, btn49, btn50};
	JPanel main = new JPanel();
	JPanel table = new JPanel();
	JPanel menu = new JPanel();
	JPanel receiptmanager = new JPanel();
	Panel loginpanel2;
	Panel login = new Panel();
	JPanel tablereceipt = new JPanel();
	JPanel totalreceipt = new JPanel();
	JPanel amount = new JPanel();
	JPanel find = new JPanel();
	JPanel stats = new JPanel();
	JButton kalb = new JButton("칼국수");
	JButton makb = new JButton("막국수");
	JButton manb = new JButton("만두");
	JButton bob = new JButton("보쌈");
	JButton cancel = new JButton("취소");
	JButton pay = new JButton("걸제");
	JButton editorder = new JButton("주문수정");
	JButton findbtn = new JButton("검색");
	JButton findbtn2 = new JButton("검색");
	JButton statsbtn = new JButton("통계");
	JButton back = new JButton("돌아가기");
	JPanel receipt = new JPanel();
	Panel addorder = new Panel();
	JTextArea tableinfo = new JTextArea();
	JTextArea dateinfo = new JTextArea();
	JTextArea tableinfo2 = new JTextArea();
	JTextArea dateinfo2 = new JTextArea();
	JTextArea kalinfo = new JTextArea();
	JTextArea makinfo = new JTextArea();
	JTextArea maninfo = new JTextArea();
	JTextArea boinfo = new JTextArea();
	JTextArea sum = new JTextArea();
	JCheckBox cb1 = new JCheckBox("오늘");
	JCheckBox findcb1 = new JCheckBox("날짜");
	JCheckBox findcb2 = new JCheckBox("테이블 번호");
	JCheckBox findcb3 = new JCheckBox("가격");
	JCheckBox findcb4 = new JCheckBox("칼국수");
	JCheckBox findcb5 = new JCheckBox("막국수");
	JCheckBox findcb6 = new JCheckBox("만두");
	JCheckBox findcb7 = new JCheckBox("보쌈");
	JButton loginaddbtn = new JButton("매장 추가");
	JButton loginclose = new JButton("종료");
	JButton receiptmanagerbtn = new JButton("영수증 업무");
	JTextField addname = new JTextField();
	JTextField addtable = new JTextField();
	JTextField findta = new JTextField();
	JTextField findsu1 = new JTextField();
	JTextField findsu2 = new JTextField();
	String tablename[] = {"날짜","테이블 번호", "총액"};
	DefaultTableModel tableModel = new DefaultTableModel(tablename,0);
	JTable receipttable = new JTable(tableModel);
	JScrollPane sp = new JScrollPane(receipttable);
	String tablename2[] = {"날짜","테이블 번호","칼국수 ","막국수","만두","보쌈","총액"};
	DefaultTableModel tableModel2 = new DefaultTableModel(tablename2,0);
	JTable findtable = new JTable(tableModel2);
	JScrollPane sp2 = new JScrollPane(findtable);
	ArrayList<Restaurant> restaurant = new ArrayList<Restaurant>();
	ArrayList<receipt> Receipt = new ArrayList<receipt>();
	int tablenum = -1;

	public RestaurantManager(){		
		super("식당 관리 프로그램");
		cardLayout = new CardLayout();
		setLayout(cardLayout);
		MenuBar mb = new MenuBar();
		Menu mm1 = new Menu("File");
		save = new MenuItem("Save");
		mm1.add(save);
		save.addActionListener(this);
		exit = new MenuItem("Exit");
		exit.addActionListener(this);
		mm1.add(exit);
		Back = new MenuItem("Back");
		Back.addActionListener(this);
		mm1.add(Back);
		mb.add(mm1);
		setMenuBar(mb);
		
		FileInputStream fin = null;
		ObjectInputStream ois = null;
		try {
			fin = new FileInputStream("./Restaurant.dat");
			ois = new ObjectInputStream(fin);
			ArrayList Restaurant = (ArrayList)ois.readObject();
			Iterator it = Restaurant.iterator();
			
			while(it.hasNext()){
				Restaurant nb = (Restaurant)it.next();
				restaurant.add(nb);
			}
		}catch(Exception ex){
			System.out.println("파일이 존재하지 않습니다.");
		}finally{
			try{
				ois.close();
				fin.close();
			}catch(IOException ioe){}
		}
		
		Panel loginPanel = new Panel();
		loginPanel.setLayout(new BorderLayout());
		loginPanel.add("North", new Label("                                                                                                                                                                                       관리하실 매장을 선택해주세요."));
		String[] name = new String[restaurant.size()];
		for (int i = 0; i < restaurant.size(); i++){
			name[i] = restaurant.get(i).name;
		}
		for (int i = 0; i < 50; i++){
			button[i].addActionListener(this);
		}
		nameCB.setModel(new DefaultComboBoxModel(name));
		nameCB.addActionListener(this);
		String month[] = new String[12];
		for (int i = 0; i < 12; i++){
			if (i < 9){
				month[i] = "0" + (i+1);
			}
			else {
				month[i] = i+1 + "";
			}
		}
		this.month.setModel(new DefaultComboBoxModel(month));
		this.month.addActionListener(this);
		this.month2.setModel(new DefaultComboBoxModel(month));
		this.month2.addActionListener(this);
		String day[] = new String[31];
		for (int i = 0; i < 31; i++){
			if (i < 9){
				day[i] = "0" + (i+1);
			}
			else {
				day[i] = i+1 + "";
			}
		}
		this.day.setModel(new DefaultComboBoxModel(day));
		this.day.addActionListener(this);
		this.day2.setModel(new DefaultComboBoxModel(day));
		this.day2.addActionListener(this);
		String hour[] = new String[24];
		for (int i = 0; i < 24; i++){
			if (i < 9){
				hour[i] = "0" + (i+1);
			}
			else {
			hour[i] = i+1 + "";
			}
		}
		this.hour.setModel(new DefaultComboBoxModel(hour));
		this.hour.addActionListener(this);
		this.hour2.setModel(new DefaultComboBoxModel(hour));
		this.hour2.addActionListener(this);
		add.addActionListener(this);
		conti.addActionListener(this);
		Panel c = new Panel();
		Panel b = new Panel();
		Panel a = new Panel();
		c.add(nameCB);
		b.add(conti);
		a.add(add);
		loginPanel.add("Center", c);
		loginPanel.add("South", b);
		loginPanel.add("East", a);
		//loginpanel
		
		loginpanel2 = new Panel();
		loginpanel2.setLayout(null);
		addname = new JTextField();
		addname.setBorder(new TitledBorder("이름"));
		addtable = new JTextField();
		addtable.setBorder(new TitledBorder("테이블수"));
		loginaddbtn.addActionListener(this);
		loginpanel2.add(addname);
		loginpanel2.add(addtable);
		loginpanel2.add(loginaddbtn);
		addname.setBounds(600, 30, 300, 50);
		addtable.setBounds(600, 100, 300, 50);
		loginaddbtn.setBounds(600, 170, 300, 50);
		loginpanel2.setVisible(false);
		//loginpanel2
		
		login.setLayout(new GridLayout(2,1,5,5));
		login.add(loginPanel);
		login.add(loginpanel2);
		add("login", login);
		//login
		
		SimpleDateFormat format = new SimpleDateFormat("MM월dd일"); //
		String date = format.format(new Date());
		menu.setLayout(null);
		kalb.addActionListener(this);
		makb.addActionListener(this);
		manb.addActionListener(this);
		bob.addActionListener(this);
		kalb.setBackground(new Color(214,247,250));
		makb.setBackground(new Color(214,247,250));
		manb.setBackground(new Color(214,247,250));
		bob.setBackground(new Color(214,247,250));
		cancel.setBackground(new Color(254,209,217));
		pay.setBackground(new Color(207,211,254));
		editorder.setBackground(new Color(207,211,254));
		menu.add(tableinfo);
		tableinfo.setBorder(new TitledBorder("테이블 번호"));
		tableinfo.setBounds(235, 20, 130, 50);
		menu.add(dateinfo);
		dateinfo.setText(date);
		dateinfo.setBorder(new TitledBorder("날짜"));
		dateinfo.setBounds(10, 20, 200, 50);
		menu.add(kalb);
		kalb.setBounds(10, 80, 200, 100);
		menu.add(makb);
		makb.setBounds(10, 200, 200, 100);
		menu.add(manb);
		manb.setBounds(10, 320, 200, 100);
		menu.add(bob);
		bob.setBounds(10, 440, 200, 100);
		menu.add(cancel);
		cancel.setBounds(190, 800, 170, 50);
		cancel.addActionListener(this);
		menu.add(pay);
		pay.setBounds(190, 870, 170, 50);
		pay.addActionListener(this);
		pay.setVisible(false);
		menu.add(editorder);
		editorder.setBounds(10, 870, 170, 50);
		editorder.addActionListener(this);
		editorder.setVisible(false);
		menu.setBackground(new Color(255,255,255));
		//menu
		
		main.setLayout(null);
		setSize(1500, 1000);
		table.setLayout(new GridLayout(5,5,5,5));
		main.add(table);
		main.add(menu);
		main.add(receipt);
		table.setBounds(5, 5, 1100, 700);
		menu.setBounds(1110, 5, 370, 930);
		receipt.setBounds(5, 710, 1100, 230);
		add("main", main);
		menu.setVisible(false);
		menu.setBorder(new TitledBorder("메뉴"));
		table.setBorder(new TitledBorder("테이블"));
		receipt.setBorder(new TitledBorder("주문 내역"));
		main.setBackground(new Color(255, 255, 255));
		//main
		
		table.setBackground(new Color(255,255,255));
		//table
		
		receipt.setLayout(new GridLayout(1,2,5,5));
		receipt.add(tablereceipt);
		receipt.add(totalreceipt);
		receipt.setBackground(new Color(255,255,255));
		//receipt
		
		tablereceipt.setBorder(new TitledBorder("테이블 주문내역"));
		tablereceipt.setLayout(null);
		tablereceipt.add(dateinfo2);
		dateinfo2.setBorder(new TitledBorder("날짜"));
		dateinfo2.setBounds(10, 20, 200, 50);
		dateinfo2.setText(date);
		tablereceipt.add(tableinfo2);
		tableinfo2.setBorder(new TitledBorder("테이블 번호"));
		tableinfo2.setBounds(235, 20, 130, 50);
		tableinfo2.setText("");
		tablereceipt.add(amount);
		amount.setBorder(new TitledBorder("수량"));
		amount.setBounds(10, 70, 520, 130);
		amount.setLayout(null);
		amount.setBackground(new Color(255,255,255));
		amount.add(kalinfo);
		kalinfo.setBorder(new TitledBorder("칼국수"));
		kalinfo.setBounds(10, 20, 110, 40);
		amount.add(makinfo);
		makinfo.setBorder(new TitledBorder("막국수"));
		makinfo.setBounds(130, 20, 110, 40);
		amount.add(maninfo);
		maninfo.setBorder(new TitledBorder("만두"));
		maninfo.setBounds(250, 20, 110, 40);
		amount.add(boinfo);
		boinfo.setBorder(new TitledBorder("보쌈"));
		boinfo.setBounds(380, 20, 110, 40);
		amount.add(sum);
		sum.setBorder(new TitledBorder("총액"));
		sum.setBounds(350, 80, 150, 40);
		tablereceipt.setBackground(new Color(255,255,255));
		//tablereceipt
		
		totalreceipt.setLayout(null);
		totalreceipt.setBorder(new TitledBorder("결제내역"));
		totalreceipt.setBackground(new Color(255,255,255));
		totalreceipt.add(sp);
		sp.setBounds(5, 20, 425, 180);
		totalreceipt.add(receiptmanagerbtn);
		receiptmanagerbtn.setBounds(430, 150, 105, 50);
		receiptmanagerbtn.setBackground(new Color(248,250,201));
		receiptmanagerbtn.addActionListener(this);
		totalreceipt.add(cb1);
		cb1.setBounds(430, 20, 105, 30);
		cb1.addActionListener(this);
		cb1.setBackground(new Color(255,255,255));
		//totalreceipt
		
		add("receiptmanager", receiptmanager);
		receiptmanager.setBackground(new Color(255,255,255));
		receiptmanager.setLayout(null);
		receiptmanager.add(back);
		back.setBounds(1300, 20, 150, 50);
		back.addActionListener(this);
		back.setBackground(new Color(254,209,217));
		receiptmanager.add(find);
		find.setBorder(new TitledBorder("검색"));
		find.setBounds(20, 100, 1440, 800);
		find.setVisible(false);
		find.setBackground(new Color(255,255,255));
		find.setVisible(true);
		//receiptmanager
		
		find.setLayout(null);
		JPanel condi = new JPanel();
		condi.setLayout(null);
		find.add(condi);
		condi.setBackground(new Color(255,255,255));
		condi.setBorder(new TitledBorder("조건"));
		condi.setBounds(20, 20, 1400, 300);
		find.add(sp2);
		sp2.setBounds(20, 340, 1400, 450);
		condi.add(findbtn2);
		findbtn2.setBounds(1250, 230, 100, 50);
		findbtn2.addActionListener(this);
		findbtn2.setBackground(new Color(207,211,254));
		condi.add(findcb1);
		findcb1.setBounds(20, 20, 100, 30);
		findcb1.setBackground(new Color(255,255,255));
		condi.add(findcb2);
		findcb2.setBounds(20, 80, 100, 30);
		findcb2.setBackground(new Color(255,255,255));
		condi.add(findcb3);
		findcb3.setBounds(20, 140, 100, 30);
		findcb3.setBackground(new Color(255,255,255));
		condi.add(findcb4);
		findcb4.setBounds(20, 200, 100, 30);
		findcb4.setBackground(new Color(255,255,255));
		condi.add(findcb5);
		findcb5.setBounds(150, 200, 100, 30);
		findcb5.setBackground(new Color(255,255,255));
		condi.add(findcb6);
		findcb6.setBounds(280, 200, 100, 30);
		findcb6.setBackground(new Color(255,255,255));
		condi.add(findcb7);
		findcb7.setBounds(410, 200, 100, 30);
		findcb7.setBackground(new Color(255,255,255));
		condi.add(this.month);
		this.month.setBounds(150, 20, 70, 30);
		JLabel mon = new JLabel("월");
		JLabel mon2 = new JLabel("월");
		condi.add(mon);
		mon.setBounds(220, 20, 30, 30);
		condi.add(this.day);
		this.day.setBounds(300, 20, 70, 30);
		JLabel da = new JLabel("일");
		JLabel da2 = new JLabel("일");
		condi.add(da);
		da.setBounds(370, 20, 30, 30);
		condi.add(this.hour);
		this.hour.setBounds(450, 20, 70, 30);
		JLabel ho = new JLabel("시");
		JLabel ho2 = new JLabel("시");
		condi.add(ho);
		ho.setBounds(520, 20, 30, 30);
		JLabel wa = new JLabel("~");
		condi.add(wa);
		wa.setBounds(550, 20, 30, 30);
		condi.add(this.month2);
		this.month2.setBounds(630, 20, 70, 30);
		condi.add(mon2);
		mon2.setBounds(700, 20, 30, 30);
		condi.add(this.day2);
		this.day2.setBounds(780, 20, 70, 30);
		condi.add(da2);
		da2.setBounds(850, 20, 30, 30);
		condi.add(this.hour2);
		this.hour2.setBounds(930, 20, 70, 30);
		condi.add(ho2);
		ho2.setBounds(1000, 20, 30, 30);
		condi.add(findta);
		findta.setBounds(150, 80, 100, 30);
		findta.addActionListener(this);
		condi.add(findsu1);
		findsu1.setBounds(150, 140, 100, 30);
		findsu1.addActionListener(this);
		JLabel su = new JLabel("원");
		JLabel su2 = new JLabel("원");
		condi.add(su);
		su.setBounds(250, 140, 30, 30);
		JLabel wa2 = new JLabel("~");
		condi.add(wa2);
		wa2.setBounds(300, 140, 30, 30);
		condi.add(findsu2);
		findsu2.setBounds(380, 140, 100, 30);
		findsu2.addActionListener(this);
		condi.add(su2);
		su2.setBounds(480, 140, 30, 30);
		//find
		
		cardLayout.show(this, "login");
		addWindowListener(new WindowAdapter(){	
			public void windowClosing(WindowEvent e){	
				try{
				}
				catch(Exception ex){}	
				System.out.println("종료합니다.");	
				System.exit(0);	
			}
		});
		setVisible(true);
	}
	
	public int findnoworder(){
		for (int i = 0; i < restaurant.get(findrestaurant()).receipt.size(); i++){
			if (restaurant.get(findrestaurant()).receipt.get(i).table_num == tablenum+1){
				if (restaurant.get(findrestaurant()).receipt.get(i).pay_ok == 0){
					return i;
				}
			}
		}
		return -1;
	}
	
	public int findrestaurant(){
		for (int i = 0; i < restaurant.size(); i++){
			if (restaurant.get(i).name.equals(selname)){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		new RestaurantManager();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int z = 0;
		int num = -1;
		int x = -1;
		for (int i = 0; i < 50; i++){
			if (e.getSource() == button[i]){
				x = 1;
				tablenum = i;
			}
		}
		if (e.getSource() == save){
			FileOutputStream fout = null;
	        ObjectOutputStream oos = null;
	        try{
	            fout = new FileOutputStream("Restaurant.dat");
	            oos = new ObjectOutputStream(fout);
	            
	            oos.writeObject(restaurant);
	            oos.reset();
	            
	            System.out.println("저장되었습니다");
	            
	        }
	        catch(Exception ex){
	        }
	        finally{
	            try{
	                oos.close();
	                fout.close();
	            }
	            catch(IOException ioe){}
	        } // finally
		}
		else if (e.getSource() == exit){
			System.exit(0);
		}
		else if (e.getSource() == Back){
			cardLayout.show(this, "login");
		}
		if (e.getSource() == add){
			loginpanel2.setVisible(true);
		}
		else if (e.getSource() == loginaddbtn){
			String name = addname.getText();
			String ta = addtable.getText();
			int table = Integer.parseInt(ta);
			restaurant.add(new Restaurant(name, table, new int[4], new int[31], new ArrayList<receipt>()));
			String[] name1 = new String[restaurant.size()];
			for (int i = 0; i < restaurant.size(); i++){
				name1[i] = restaurant.get(i).name;
			}
			nameCB.setModel(new DefaultComboBoxModel(name1));
			addname.setText("");
			addtable.setText("");
			loginpanel2.setVisible(false);
		}
		else if (e.getSource() == conti){
			selname = (String)nameCB.getSelectedItem();
			for (int i = 0; i < restaurant.size(); i++){
				if (selname.equals(restaurant.get(i).name)){
					num = i;
					break;
				}
			}
			if (num == -1){
				JOptionPane.showMessageDialog(this, "매장을 선택해주세요.");
			}
			else {
				for (int i = 0; i < restaurant.get(num).table; i++){
					button[i].setBackground(new Color(223, 253, 227));
					table.add(button[i]);
				}
				cardLayout.show(this, "main");
			}
			for (int i = 0; i < restaurant.get(findrestaurant()).receipt.size(); i++){
				Object[] temp = {restaurant.get(findrestaurant()).receipt.get(i).date, restaurant.get(findrestaurant()).receipt.get(i).table_num, restaurant.get(findrestaurant()).receipt.get(i).sum};
				tableModel.addRow(temp);
			}
		}
		else if (x == 1){
			for (int i = 0; i < restaurant.get(findrestaurant()).table; i++){
				button[i].setBackground(new Color(223, 253, 227));
			}
			button[tablenum].setBackground(new Color(185, 251, 193));
			menu.setVisible(true);
			pay.setVisible(false);
			editorder.setVisible(false);
			for (int i = 0; i < restaurant.get(findrestaurant()).receipt.size(); i++){
				if (restaurant.get(findrestaurant()).receipt.get(i).table_num == tablenum+1){
					if (restaurant.get(findrestaurant()).receipt.get(i).pay_ok == 0){
						z = i;
						break;
					}
				}
			}
			if (button[tablenum].getText().contains("식사중...")){
				pay.setVisible(true);
				editorder.setVisible(true);
				kalinfo.setText(restaurant.get(findrestaurant()).receipt.get(z).menu[0] + "");
				makinfo.setText(restaurant.get(findrestaurant()).receipt.get(z).menu[1] + "");
				maninfo.setText(restaurant.get(findrestaurant()).receipt.get(z).menu[2] + "");
				boinfo.setText(restaurant.get(findrestaurant()).receipt.get(z).menu[3] + "");
				sum.setText(restaurant.get(findrestaurant()).receipt.get(z).sum + "");
			}
			else {
				kalinfo.setText("");
				makinfo.setText("");
				maninfo.setText("");
				boinfo.setText("");
				sum.setText("");
				tableinfo.setText(tablenum+1+"");
				tableinfo2.setText(tablenum+1+"");
			}
		}
		else if (e.getSource() == kalb || e.getSource() == makb || e.getSource() == manb || e.getSource() == bob){
			int y = 0;
			for (int i = 0; i < restaurant.get(findrestaurant()).receipt.size(); i++){
				if (restaurant.get(findrestaurant()).receipt.get(i).table_num == tablenum+1){
					if (restaurant.get(findrestaurant()).receipt.get(i).pay_ok == 0){
						y++;
						z = i;
						break;
					}
				}
			}
			SimpleDateFormat format = new SimpleDateFormat("MM월dd일HH시mm분ss초"); //
			String date = format.format(new Date());
			if (y == 0){
				restaurant.get(findrestaurant()).receipt.add(new receipt(date, tablenum+1, new int[4], 0, 0));
				if (e.getSource() == kalb){
					restaurant.get(findrestaurant()).receipt.get(restaurant.get(findrestaurant()).receipt.size()-1).menu[0]++;
				}
				else if (e.getSource() == makb){
					restaurant.get(findrestaurant()).receipt.get(restaurant.get(findrestaurant()).receipt.size()-1).menu[1]++;
				}
				else if (e.getSource() == manb){
					restaurant.get(findrestaurant()).receipt.get(restaurant.get(findrestaurant()).receipt.size()-1).menu[2]++;
				}
				else if (e.getSource() == bob){
					restaurant.get(findrestaurant()).receipt.get(restaurant.get(findrestaurant()).receipt.size()-1).menu[3]++;
				}
				z = restaurant.get(findrestaurant()).receipt.size() - 1;
				button[tablenum].setText("<html>" + button[tablenum].getText() + "<br> <br> 식사중...</html>");
				pay.setVisible(true);
				editorder.setVisible(true);			
			}
			else{
				if (e.getSource() == kalb){
					restaurant.get(findrestaurant()).receipt.get(z).menu[0]++;
				}
				else if (e.getSource() == makb){
					restaurant.get(findrestaurant()).receipt.get(z).menu[1]++;
				}
				else if (e.getSource() == manb){
					restaurant.get(findrestaurant()).receipt.get(z).menu[2]++;
				}
				else if (e.getSource() == bob){
					restaurant.get(findrestaurant()).receipt.get(z).menu[3]++;
				}
			}
			restaurant.get(findrestaurant()).receipt.get(z).sum = restaurant.get(findrestaurant()).receipt.get(z).menu[0] * 7000 + restaurant.get(findrestaurant()).receipt.get(z).menu[1] * 7000 + restaurant.get(findrestaurant()).receipt.get(z).menu[2] * 3000 + restaurant.get(findrestaurant()).receipt.get(z).menu[3] * 25000;
			kalinfo.setText(restaurant.get(findrestaurant()).receipt.get(z).menu[0] + "");
			makinfo.setText(restaurant.get(findrestaurant()).receipt.get(z).menu[1] + "");
			maninfo.setText(restaurant.get(findrestaurant()).receipt.get(z).menu[2] + "");
			boinfo.setText(restaurant.get(findrestaurant()).receipt.get(z).menu[3] + "");
			sum.setText(restaurant.get(findrestaurant()).receipt.get(z).sum + "");
		}
		else if (e.getSource() == pay){
			kalinfo.setText("");
			makinfo.setText("");
			maninfo.setText("");
			boinfo.setText("");
			sum.setText("");
			pay.setVisible(false);
			editorder.setVisible(false);
			button[tablenum].setText(tablenum+1+"");
			for (int i = 0; i < restaurant.get(findrestaurant()).receipt.size(); i++){
				if (restaurant.get(findrestaurant()).receipt.get(i).table_num == tablenum+1){
					if (restaurant.get(findrestaurant()).receipt.get(i).pay_ok == 0){
						restaurant.get(findrestaurant()).receipt.get(i).pay_ok = 1;
						SimpleDateFormat format = new SimpleDateFormat("dd"); //
						String da = format.format(new Date());
						int date = Integer.parseInt(da);
						restaurant.get(findrestaurant()).sales_date[date] += restaurant.get(findrestaurant()).receipt.get(i).sum;
						restaurant.get(findrestaurant()).sales_menu[0] += restaurant.get(findrestaurant()).receipt.get(i).menu[0];
						restaurant.get(findrestaurant()).sales_menu[1] += restaurant.get(findrestaurant()).receipt.get(i).menu[1];
						restaurant.get(findrestaurant()).sales_menu[2] += restaurant.get(findrestaurant()).receipt.get(i).menu[2];
						restaurant.get(findrestaurant()).sales_menu[3] += restaurant.get(findrestaurant()).receipt.get(i).menu[3];
						Object[] temp = {restaurant.get(findrestaurant()).receipt.get(i).date, restaurant.get(findrestaurant()).receipt.get(i).table_num, restaurant.get(findrestaurant()).receipt.get(i).sum};
						tableModel.addRow(temp);
						break;
					}
				}
			}
			sp.getVerticalScrollBar().setValue(sp.getVerticalScrollBar().getMaximum());
		}
		else if (e.getSource() == cancel){
			for (int i = 0; i < restaurant.get(findrestaurant()).table; i++){
				button[i].setBackground(new Color(223, 253, 227));
			}
			if (button[tablenum].getText().contains("식사중...")){
				restaurant.get(findrestaurant()).receipt.remove(findnoworder());
				menu.setVisible(false);
				button[tablenum].setText(tablenum+1+"");
				kalinfo.setText("");
				makinfo.setText("");
				maninfo.setText("");
				boinfo.setText("");
				sum.setText("");
			}
			else {
				tableinfo2.setText("");
				menu.setVisible(false);
			}
		}
		else if (e.getSource() == editorder){
			restaurant.get(findrestaurant()).receipt.get(findnoworder()).menu[0] = 0;
			restaurant.get(findrestaurant()).receipt.get(findnoworder()).menu[1] = 0;
			restaurant.get(findrestaurant()).receipt.get(findnoworder()).menu[2] = 0;
			restaurant.get(findrestaurant()).receipt.get(findnoworder()).menu[3] = 0;
			restaurant.get(findrestaurant()).receipt.get(findnoworder()).sum = 0;
			kalinfo.setText(restaurant.get(findrestaurant()).receipt.get(findnoworder()).menu[0] + "");
			makinfo.setText(restaurant.get(findrestaurant()).receipt.get(findnoworder()).menu[1] + "");
			maninfo.setText(restaurant.get(findrestaurant()).receipt.get(findnoworder()).menu[2] + "");
			boinfo.setText(restaurant.get(findrestaurant()).receipt.get(findnoworder()).menu[3] + "");
			sum.setText(restaurant.get(findrestaurant()).receipt.get(findnoworder()).sum + "");
		}
		else if (e.getSource() == cb1){
			SimpleDateFormat format = new SimpleDateFormat("dd");
			String da = format.format(new Date());
			if (cb1.isSelected()){
				DefaultTableModel model = (DefaultTableModel)receipttable.getModel();
				model.setNumRows(0);
				for (int i = 0; i < restaurant.get(findrestaurant()).receipt.size(); i++){
					String temp = restaurant.get(findrestaurant()).receipt.get(i).date.substring(3, 5);
					if (temp.equals(da)){
						Object[] temp2 = {restaurant.get(findrestaurant()).receipt.get(i).date, restaurant.get(findrestaurant()).receipt.get(i).table_num, restaurant.get(findrestaurant()).receipt.get(i).sum};
						tableModel.addRow(temp2);
					}
				}
			}
			else {
				DefaultTableModel model = (DefaultTableModel)receipttable.getModel();
				model.setNumRows(0);
				for (int i = 0; i < restaurant.get(findrestaurant()).receipt.size(); i++){
					Object[] temp2 = {restaurant.get(findrestaurant()).receipt.get(i).date, restaurant.get(findrestaurant()).receipt.get(i).table_num, restaurant.get(findrestaurant()).receipt.get(i).sum};
					tableModel.addRow(temp2);
				}
			}
		}
		else if (e.getSource() == receiptmanagerbtn){
			cardLayout.show(this, "receiptmanager");
		}
		else if (e.getSource() == findbtn){
			stats.setVisible(false);
			find.setVisible(true);
		}
		else if (e.getSource() == statsbtn){
			find.setVisible(false);
			stats.setVisible(true);
		}
		else if (e.getSource() == back){
			cardLayout.show(this, "main");
		}
		else if (e.getSource() == findbtn2){
			DefaultTableModel model = (DefaultTableModel)findtable.getModel();
			model.setNumRows(0);
			for (int i = 0; i < restaurant.get(findrestaurant()).receipt.size(); i++){
				if (findcb1.isSelected()){
					String da = restaurant.get(findrestaurant()).receipt.get(i).date;
					String dat = da.substring(0, 2) + da.substring(3, 5) + da.substring(6, 8);
					int date = Integer.parseInt(dat);
					String dates = (String)month.getSelectedItem() + (String)day.getSelectedItem() + (String)hour.getSelectedItem();
					int datestart = Integer.parseInt(dates);
					String datee = (String)month2.getSelectedItem() + (String)day2.getSelectedItem() + (String)hour2.getSelectedItem();
					int dateend = Integer.parseInt(datee);
					if (datestart <= date && date <= dateend){}
					else {
						continue;
					}
				}
				if (findcb2.isSelected()){
					if (restaurant.get(findrestaurant()).receipt.get(i).table_num == Integer.parseInt(findta.getText())){}
					else {
						continue;
					}
				}
				if (findcb3.isSelected()){
					int sumstart = Integer.parseInt(findsu1.getText());
					int sumend = Integer.parseInt(findsu2.getText());
					if (sumstart <= restaurant.get(findrestaurant()).receipt.get(i).sum && restaurant.get(findrestaurant()).receipt.get(i).sum <= sumend){}
					else {
						continue;
					}
				}
				if (findcb4.isSelected()){
					if (restaurant.get(findrestaurant()).receipt.get(i).menu[0] > 0){}
					else {
						continue;
					}
				}
				if (findcb5.isSelected()){
					if (restaurant.get(findrestaurant()).receipt.get(i).menu[1] > 0){}
					else {
						continue;
					}
				}
				if (findcb6.isSelected()){
					if (restaurant.get(findrestaurant()).receipt.get(i).menu[2] > 0){}
					else {
						continue;
					}
				}
				if (findcb7.isSelected()){
					if (restaurant.get(findrestaurant()).receipt.get(i).menu[3] > 0){}
					else {
						continue;
					}
				}
				Object[] temp = {restaurant.get(findrestaurant()).receipt.get(i).date, restaurant.get(findrestaurant()).receipt.get(i).table_num, restaurant.get(findrestaurant()).receipt.get(i).menu[0], restaurant.get(findrestaurant()).receipt.get(i).menu[1], restaurant.get(findrestaurant()).receipt.get(i).menu[2], restaurant.get(findrestaurant()).receipt.get(i).menu[3], restaurant.get(findrestaurant()).receipt.get(i).sum};
				tableModel2.addRow(temp);
			}
		}
	}
}