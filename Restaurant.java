package restaurant;

import java.io.Serializable;
import java.util.ArrayList;

public class Restaurant implements Serializable{
	String name;
	int table;
	int[] sales_menu = new int[4];
	int[] sales_date = new int[31];
	ArrayList<receipt> receipt = new ArrayList<receipt>();
	
	public Restaurant(String name, int table, int[] sales_menu, int[] sales_date, ArrayList<receipt> receipt){
		this.name = name;
		this.table = table;
		this.sales_menu = sales_menu;
		this.sales_date = sales_date;
		this.receipt = receipt;
	}
	
	public static void main(String[] args) {
		
	}

}
