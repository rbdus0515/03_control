package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		// 문제 1
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
		// 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요");
		} else {
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}
		
		
	}

	public void practice2(){
		// 문제 2
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요");
		} else {
			for(int i = num; i >= 1; i--) {
				System.out.print(i + " ");
				
			}
		}
		
	}
	
	public void practice3(){
		
		// 문제 3
		
		System.out.print("정수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " + ");
			
			sum += i;
		}
		System.out.print("= " + sum);
	}
	
	public void practice4(){
		// 문제 4
		
		// 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		// 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		
		if(num1 <= 0 || num2 <= 0) {
			System.out.print("1 이상의 숫자를 입력해주세요");
		} else if(num1 < num2) {
			for(int i = num1; i <= num2; i++ ) {
				System.out.print(i + " ");
			}
		} else {
			for(int i = num2; i <= num1; i++ ) {
				System.out.print(i + " ");
			}
		}
		
		
	}

	public void practice5(){
		// 문제 5
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("=========" + dan +"단==========" );
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n" , dan , i , dan * i);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}













