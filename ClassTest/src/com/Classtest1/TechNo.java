//.  A tech number has even number of digits.If the number is split in
//two equals halves then square of sum of these halves is equal to 
//the number itself.Write a program to generate and print all four digits 
//tech numbers.[2]
//e.g.) number : 3025->(30+25)2=(55)2=3025

package com.Classtest1;

import java.util.Scanner;

public class TechNo {
	int num;
	int origno;
	int lastpart, sum, power = 0;
	boolean tech;

	TechNo() {
		num = 0;
		origno = num;

	}

	TechNo(int num) {

		this.num = num;
		origno = num;
	}

	public int calculateSum() {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		for (int i = 1; i <= count / 2; i++) {
			power = power * 10;
		}
		if (count % 2 == 0) {
			num = origno / power;
			lastpart = origno / power;
			sum = num + lastpart;
			this.checkTechNo();
			this.displayTechNo();
		} else

			System.out.println("invalid number odd number of digit");
		return sum;

	}

	public boolean checkTechNo() {
		if (origno == (sum * sum))
			return tech = true;
		else
			return tech = false;
	}

	public void displayTechNo() {
		if (tech == true)
			System.out.println(origno + "is tech number");
		else
			System.out.println(origno + "is not a tech number");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		TechNo obj = new TechNo(num);
		obj.calculateSum();
	}

}
