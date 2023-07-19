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
	
	public void practice6(){
		
		// 문제 6
		// 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		// 단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
		
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		
		if(input > 10) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {
			for(int dan = input; dan <= input; dan++) {
				for(int i = 1; i <= 9; i++) {
					System.out.printf("%d X %d = %2d\n" , dan , i , dan * i);
				}
				
			}
		}
		
		
		
		
	}

	public void practice7(){
		
		// 문제 7
		
		// *
		// **
		// ***
		// ****
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) { // 줄반복
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		
			
		}
		
	}

	public void practice8(){
		
		// 문제 8
		
		// ****
		// ***
		// **
		// *
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x = input ; x >= 1; x--) { // 줄반복
			for(int j = x; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
	
	public void practice9(){
		
		// 문제 9
		
		//    *
		//   **
		//  ***
		// ****
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = input ; j > 0 ; j--) {
				if( i < j ) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		
		
	}
	
	public void practice10(){
		
		// 문제 10
		
		// 답안 풀이 ㄱ
		
		// *
		// **
		// ***
		// **
		// *
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) { // 줄반복
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int x = input ; x >= 1; x--) { // 줄반복
			for(int j = x; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		}
		
	public void practice11() {
		
		// 문제 11
		// 다음과 같은 실행 예제를 구현하세요.
		
		/*  ex.
			정수 입력 : 4
		 	*
		 	***
		 	*****
		 	*******
		*/
		
	}
	
	public void practice12() {
		
		// 문제 12
		// 다음과 같은 실행 예제를 구현하세요.
		
		/*  ex.
			정수 입력 : 5
		 	*****
		 	*   *
		 	*   *
		 	*   *
		 	*****
		*/
		
	}
	
	public void practice13() {
		
		// 문제 13
		
		// 1부터 사용자에게 입력 받은 수까지 중에서
		// 1) 2와 3의 배수를 모두 출력하고
		// 2) 2와 3의 공배수의 개수를 출력하세요.
		
		// * ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
		//	  모두 나머지가 0이 나오는 수
		/*
			ex.
			자연수 하나를 입력하세요 : 15
			2 3 4 6 8 9 10 12 14 15
			count : 2
		*/
		
		
		
		
		
		
		
	}
		
	
		
		
		
	
	
			
		
	
	
	
	
	
	
	
	
}













