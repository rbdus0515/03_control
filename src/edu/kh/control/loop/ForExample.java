package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	
	Scanner sc = new Scanner(System.in);

	/* for문
	 * -끝이 정해져 있는 (횟수가 지정되어 있는) 반복문
	 * 
	 * [작성법]
	 * 
	 * for(초기식 ; 조건식 ; 증감식) {
	 * 		반복 수행할 코드 작성
	 * }
	 * 
	 * 	 - 초기식 : for문을 제어하는 용도의 변수 선언
	 * 
	 *	 - 조건식 : for문의 반복 여부를 지정하는 식.
	 * 				보통 초기식에 사용된 변수를 이용하여 조건식을 작성함.
	 * 
	 *	 - 증감식 : 초기식에 사용된 변수를
	 * 				for문이 끝날 때 마다 증가 또는 감소시켜
	 * 				조건식의 결과를 변하게 하는 식
	 * 
	 */
	
	public void ex1() {
		
		// for문 기초 사용법 1
		// 1~10까지 출력하기
		// 1부터 10까지 1씩 증가하며 출력
		
		// * 반복문은 조건식이 true 일 때만 반복함.
		
		for(int i = 1; i <= 10; i++) {
		//    초기식 ; 조건식 ; 증감식
			
			// 반복 수행 할 코드
			System.out.println(i);
		}
		
		
	}
	
	public void ex2() {
		// 3에서 7까지 1씩 증가하며 출력
		// 3 4 5 6 7
		
		for(int i = 3; i <= 7; i++) {
			System.out.println(i);
		}
	}
	
	public void ex3() {
		// 2부터 15까지 1씩 증가하며 출력
		for(int i = 2; i <= 15; i++) {
			System.out.println(i);
		}
	}
	
	public void ex4() {
		// 1부터 입력받은 수까지 1씩 증가하며 출력
		
		System.out.print("입력 받은 수 : ");
		int input = sc.nextInt();
		
		
		for(int i = 1; i <= input; i++) {
			System.out.println(i);
		}
	}
	
	public void ex5() {
		
		// 1부터 입력받은 수 까지 2씩 증가하며 출력
		
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i+=2) {
			System.out.println(i);
			
		}
	}
	
	public void ex6() {
		
		// 1.0부터 입력 받은 수까지 0.5씩 증가하며 출력
		
		System.out.print("숫자 입력 : ");
		double input = sc.nextInt();
		
		for(double d = 1.0; d <= input; d+=0.5) {
			System.out.println(d);
			
		}
	}
	
	public void ex7() {
		
		// 영어 알파벳 A부터 Z까지 한줄로 출력
		
		// char 자료형은 문자형이지만 실제로는 정수(유니코드)를 저장한다.
		
		
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print( (char)i ); // 강제 형변환
		}
		
		System.out.println("\n-------------------------------------------");
		
		for( char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
		
		
	}

	public void ex8() {
		// 10에서부터 1까지 1씩 감소하면서 출력
		
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
			
		}
	}
	
	public void ex9() {
		
		// for문 응용 1 : 반복문을 이용한 값의 누적
		
		// 1부터 10까지 모든 정수의 합 구하기
		
		int sum = 0; // 반복되어 증가되는 i값의 합계를 저장할 변수
					 // 0으로 시작하는 이유는 : 아무것도 더하지 않음으로 정확히 결과를 도출가능.
		
		for(int i = 1; i <=10; i++) {
			
			//sum = sum + i; 밑 코드와 같음
			sum += i;
		}
		
		System.out.println("합계 : " + sum);
		
	}
	
	public void ex10() {
		
		// for문 응용2 : 정수 5개를 입력 받아서 합계 구하기
		
		
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("입력"+ i + " : ");
			int i1 = sc.nextInt();
			
			sum += i1; // sum 입력받은 i1값 누적
		
		}
		System.out.println("합계 : " + sum);
			
	
			
		
		
	}
	
	public void ex11() {
		
		// 정수를 몇 번 입력 받을지 먼저 입력 받고 입력된 정수의 합계를 출력
		
		
		System.out.print("입력 받을 정수의 개수 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++ ) {
			System.out.print("입력" + i + " : ");
			int input = sc.nextInt();
			
			sum += input;
		}
		
		System.out.println("합계 : " + sum);
		
	}

	public void ex12() {
		
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 5의 배수 () 를 붙여서 출력
		// ex) 1 2 3 4 (5) 6 7 8 9 (10)... (20)
		
		for(int i = 1; i <= 20; i++ ) {
			
			if(i % 5 == 0) {
				System.out.print("(" + i + ") ");
			} else {
				System.out.print(i + " ");
			}
			
		}
		
		
	}
	
	public void ex13() {
		
		// 1부터 20까지 1씩증가하며 출력
		// 단, 입력 받을 수의 배수는 () 표시
		//괄호를 표시할 배수 : 
		
		System.out.print("괄호를 표시할 배수 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 20; i++) {
			
			if( i % num == 0) {
				System.out.print("(" + i + ") ");
			} else {
				System.out.print(i + " ");
			}
		}
		
		
		
	}
	
	public void ex14() {
		// 구구단 출력
		// 2 ~ 9단 사이 수를 하나 입력받아
		// 해당 단을 출력
		// 단, 입력 받은 수가 2 ~ 9 사이 숫자가 아니라면 "잘못 입력하셨습니다" 출력
		
		System.out.println("단 입력 : ");
		int dan = sc.nextInt();
		
		if( dan >= 2 && dan <= 9 ) { // dan이 2 ~ 9
			
			for(int i = 1; i <= 9;  i++) {
				System.out.printf("%d * %d = %d\n" , dan , i , dan * i);
			}
			
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		
		
		
		
		
	}
	
	public void ex15() {
		// 19단 출력기
		
		System.out.println("단 입력 : ");
		int dan = sc.nextInt();
		
		if( dan >= 2 && dan <= 19 ) { // dan이 2 ~19
			
			for(int i = 1; i <= 19;  i++) {
				System.out.printf("%2d * %2d = %3d\n" , dan , i , dan * i);
			}
			
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		
		
	}
	
	// ---------- 중첩 for문 -------------
	public void ex16() {
		
		// 중첩 반복문
		// 구구단 모두 출력하기
		
		for(int dan = 2; dan <= 9; dan++) { // 2 ~ 9단까지 차례대로 증가
			
			for(int num = 1; num <= 9; num++) { // 각 단에 곱해질 수 1 ~ 9까지 차례대로 증가
				
				System.out.printf("%2d X %2d = %2d  " , dan , num , dan * num);
			}
			
			System.out.println(); // 하나의 단 출력이 끝났을때 줄바꿈
			// 아무내용 없는 println은 줄바꿈
			
		}
		
		
		
	}
	
	public void ex17() {
		
		// 구구단 역순 출력
		
		for(int dan = 9; dan >= 2; dan--) {
			
			for(int num = 1; num <= 9; num++) {
				System.out.printf("%d X %d = %2d   " , dan , num , dan * num);
			}
			System.out.println();
		}
		
	}
	
	public void ex18() {
		// 2중 for문 이용해서 다음 모양을 출력하시오
		
		// 12345
		// 12345
		// 12345
		// 12345
		// 12345
		
		for(int i = 1; i <= 5; i++) { // 5바퀴 반복하는 for문
			
			for(int j = 1; j <= 5; j++) { // 12345 한줄 출력하는 for문
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------");
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 5; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
	public void ex19() {
		
		// 1
		// 12
		// 123
		// 1234
		
		for(int i = 1; i <= 4; i++) { // 줄반복
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------");
		
		// 4321
		// 321
		// 21
		// 1
		
		for(int x = 4; x >= 1; x--) { // 줄반복
			for(int j = x; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
	public void ex20() {
		// 중첩 반복문 X
		// 숫자세기 count
		// 1 ~ 20까지 1씩 증가하면서 3의 배수의 총 개수 출력
		// 3의 배수의 합계 출력 
		
		// 3 6 9 12 15 18 : 6개\
		// 3의 배수 합계 : 63
		
		int count = 0; // 3의 배수의 개수를 세기 위한 변수
		int sum = 0; // 3의 배수의 합계를 구하기 위한 변수
		
		for(int i = 1; i <= 20; i++) {
			
			if( i % 3 == 0) {
				System.out.print(i + " ");
				count++;
				sum += i;
			}
			
		}
		
		System.out.println(": " + count + "개");
		System.out.println("3의 배수 합계 : " + sum);
		
		
		
	}

	public void ex21() {
		
		// 2중 for문과 count를 이용해서 아래모양 출력
		
		// 1  2  3  4
		// 5  6  7  8 
		// 9 10 11 12
		
		int count = 1;
		
		for(int x = 1; x <= 3; x++) { // 3줄
			for(int i = 1; i <= 4; i++) { // 4칸
				System.out.printf("%3d" , count);
				count++;
			}
			System.out.println();
		}
		
		
		
		
	}
	
	public void ex22() {
		// 구구단 세로출력
		
		for(int dan = 2; dan <= 9; dan++) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d  " , dan , i , dan * i);
			}
			System.out.println();
		}
	}
	
	public void ex23() {
		
		for(int i = 1; i <= 9; i++) {
			for(int dan = 2; dan <= 9; dan++) {
				System.out.printf("%d X %d = %2d    " , dan , i , dan * i);
			}
			System.out.println();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
















