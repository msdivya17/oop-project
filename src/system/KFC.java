package system;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.jar.Attributes.Name;

import javax.swing.*;
import javax.swing.plaf.basic.BasicMenuBarUI;

public class KFC {
	private ArrayList<String> menuName;
	private ArrayList<String> menuDesc;
	private ArrayList<Double> price;
	private ArrayList<ImageIcon> menuPic;

	KFC(){
		ArrayList<String> menuName = new ArrayList<String>();
		menuName.add("Cheezy Wedges");
		menuName.add("3-pc Chicken");
		menuName.add("9-pc nugget");
		menuName.add("Coleslaw");
		menuName.add("Party box");
		menuName.add("Nasi lemak");
		this.menuName = menuName;

		ArrayList<Double> price = new ArrayList<>();
		price.add(6.99);
		price.add(17.49);
		price.add(13.99);
		price.add(7.99);
		price.add(36.99);
		price.add(13.54);
		this.price = price;

		ArrayList<String> menuDesc = new ArrayList<String>();
		menuDesc.add("Potato wedges that drip with cheese sauce and mayonnaise.");
		menuDesc.add("3 pieces of chicken");
		menuDesc.add("9 pieces of chicken nuggets");
		menuDesc.add("Salad that made up of carrot, cabbage and mayonnaise.");
		menuDesc.add("2 burger + 2 pack of fries + 2 wrapper + 10 pcs nugget.");
		menuDesc.add("A famous food that loved by Malaysian.");
		this.menuDesc = menuDesc;

		ArrayList<ImageIcon> menuPic = new ArrayList<>();
		menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/kfc1 resize.jpg")));
		menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/kfc2 resize.jpg")));
		menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/kfc3 resize.jpg")));
		menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/kfc4 resize.jpg")));
		menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/kfc5 resize.jpg")));
		menuPic.add(new ImageIcon(MainPages.class.getResource("/system/resources/kfc6 resize.jpg")));
		this.menuPic = menuPic;
	}

	public double getPrice(int number) {
		return price.get(number-1);
	}

	public String getMenuDesc(int number) {
		return menuDesc.get(number-1);
	}

	public String getMenuName(int number) {
		return menuName.get(number-1);
	}

	public ImageIcon getMenuPic(int number){
		return menuPic.get(number-1);
	}
}
