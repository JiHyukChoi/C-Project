package cproject;

import java.util.Scanner;

public class inputVar implements inputString,inputNum {
	Scanner sc = new Scanner(System.in);
	String str;
	int num;
	@Override
	public void inputStr() {
		str = sc.nextLine();
		
		
	}

	@Override
	public int inputNumber() {
		num = sc.nextInt();
		// TODO Auto-generated method stub
		return num;
	}

	
}
