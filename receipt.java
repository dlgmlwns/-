package restaurant;

import java.io.Serializable;

public class receipt implements Serializable{
	int menu[] = new int[4];
	int table_num;
	int pay_ok;
	String date;
	int sum;
	
	public receipt(String date, int table_num, int[] menu, int sum, int pay_ok){
		this.date = date;
		this.table_num = table_num;
		this.menu = menu;
		this.sum = sum;
		this.pay_ok = pay_ok;
	}
	
	public static void main(String[] args) {
	}

}
