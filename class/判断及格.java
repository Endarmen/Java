package class_demo;

import java.util.Scanner;

public class Experi_1_01 {
	public static void main(String[] args) {
		int i;
		Scanner input = new Scanner(System.in);
		String[] name = new String[100];
		double[] score = new double[100];
		
		System.out.println("Enter the name and score(end with N)");
		for(i = 0; i < name.length; i++) {
			System.out.println("Enter the name and score of the "+ (i+1) +"th student");
			
			name[i] = input.next();
			if(name[i].equals("N")) {		//判断是否输入完毕
				System.out.println("END");	//新的比较方式.equals
				break;
			}
			
			score[i] = input.nextDouble();	//假如放在input后面,会导致输入N还要输入数字
	        if (score[i] >= 60) { 			//判断是否及格
	        	System.out.println(name[i]+"的成绩为及格");
	        }else{
	        	System.out.println(name[i]+"的成绩为不及格");
	        }
		}
	}
	
}
