package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		// if문
		// 조건식이 true 일때만 내부 코드 수행
		
		/*
		 * [작성법]
		 * if(조건식){
		 * 		조건식이 true 일 때 수행 할 코드
		 * }
		 */
		
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 입력된 정수가 양수인지 검사
		if (input > 0) {
			System.out.println("양수입니다.");
		}
		
		if (input <= 0) {
			System.out.println("양수가 아니다.");
		}
		
	}
	
	public void ex2() {
		
		// if - else문
		// 조건식 결과가 true면 if문,
		// false면 else 구문이 수행됨.
		
		/*
		 * if(조건식) {
		 * 		조건식이 ture일 때 수행될 코드
		 * } else {
		 * 		조건식이 false일 때 수행될 코드
		 * }
		 * 
		 */
		
		
		// 홀짝 검사
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if( input % 2 != 0 ) {
			
			System.out.println("홀수입니다.");
			
		} else { // 짝수 또는 0 입력시 수행
		
			// 중첩 if문
			if( input == 0 ) {
				System.out.println("0입니다.");
			} else {
				System.out.println("짝수 입니다.");
			}
		}
	}
	
	public void ex3() {
		
		// 양수 , 음수 , 0 판별
		
		// if - else if - else
		
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0 ) {
			// input이 양수일 경우
			System.out.println("양수 입니다.");
		} else if(input < 0) {
			//input이 음수일 경우
			// 바로 위에 있는 if문이 만족되지 않은 경우 수행
			System.out.println("음수 입니다.");
			
		} else {
			System.out.println("0 입니다.");
		}
		
	}
	
	public void ex4() {
		
		// 달(month)을 입력받아 해당 달에 맞는 계절 출력
		// 단, 겨울일때 온도가 -15도 이하 "한파경보" , -12도 이하 "한파주의보"
		// 	   여름일때 온도가 35도 이상 "폭염경보" , 33도 이상 "폭염주의보"
		// 1~12월 사이가 아닐땐 "해당하는 계절이 없습니다." 출력
		
		
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		System.out.print("기온 입력 : ");
		int temperature = sc.nextInt();
		//int temperature = 34;
		
		String season; // 아래 조건문 수행 결과를 저장할 변수 선언
		
		
		if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
			
			if(temperature <= -15) {
				season += " 한파 경보";
				// season = season + "한파 경보"
			} else if(temperature <= -12) {
				season += " 한파 주의보";
				
			}
			
		} else if( month >= 3 && month <=5) {
			season = "봄";
		} else if( month >= 6 && month <=8) {
			season = "여름";
			
			if(temperature >= 35) {
				season += " 폭염 경보";
			} else if(temperature >= 33) {
				season += " 폭염 주의보";
			}
			
			
			
		}else if( month >= 9 && month <=11) {
			season = "가을";
		} else {
			season = "해당하는 계절이 없습니다.";
		}
			
		System.out.println(season);
		
	}
	
	public void ex5() {
		// 숙제
		
		// 나이를 입력 받아
		// 13세 이하면 "어린이 입니다."
		// 13세 초과 19세 이하면 : "청소년 입니다."
		// 19세 초과 시 : "성인 입니다". 출력
		
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이 입니다.");
		} else if(age > 19) {
			System.out.println("성인 입니다.");
		} else {
			System.out.println("청소년 입니다.");
		}
		
	}
	
	public void ex6() {
		//숙제
		
		//내가 푼 정답
		/*System.out.print("점수 : ");
		int score = sc.nextInt();
		
		if(score > 90 && score < 100) {
			System.out.println("A");
		} else if(score >= 80 && score < 90) {
			System.out.println("B");
		} else if(score >= 70 && score < 80) {
			System.out.println("C");
		} else if(score >= 60 && score < 70) {
			System.out.println("D");
		} else if(score < 60 && score > 0 ) {
			System.out.println("F");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		*/
		
		/*if(score > 90) {
			System.out.println("A");
			if(score >= 80 && score < 90) {
				System.out.println("B");
				if(score >= 70 && score < 80) {
					System.out.println("C");
					if(score >= 60 && score < 70) {
						System.out.println("D");
						if(score < 60 ) {
							System.out.println("F");
						} else if ( (score < 0 ) && (score > 100) ) {
							System.out.println("잘못 입력하셨습니다.");
						}
					}
				}
			}
		}*/
		
		/*if ( (score < 0 ) && (score > 100) ) {
			System.out.println("잘못 입력하셨습니다.");
		} else if(score > 90) {
			System.out.println("A");
		} else if(score >= 80 && score < 90) {
			System.out.println("B");
		} else if(score >= 70 && score < 80) {
			System.out.println("C");
		} else if(score >= 60 && score < 70) {
			System.out.println("D");
		} else if(score < 60 ) {
			System.out.println("F");
		} else {
			System.out.println();
		}*/
		
		// 썜이 푼 정답
		System.out.print("점수 입력 (0~100) : ");
		int score = sc.nextInt();
		
		String result;
		
		if(score < 0 || score > 100) {
			result = "잘못 입력하셨습니다!";
		} else if(score >= 90) {
			result = "A";
		} else if(score >= 80) {
			result = "B";
		} else if(score >= 70) {
			result = "C";
		} else if(score >= 60) {
			result = "D";
		} else {
			result = "F";
		}
		
		System.out.println(result);
	}
	
	public void ex7() {
		//숙제
		
		// 내가 푼 정답
		/*
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("키 입력 : ");
		double cm = sc.nextDouble();
		
		if((age < 12) && (age > 0)) {
			System.out.println("적정 연령이 아닙니다.");
		} else if(cm < 140.0) {
			System.out.println("적정 키가 아닙니다.");
		} else if((age >= 12) && (cm >= 140.0)) {
			System.out.println("탑승 가능");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		*/
		
		// 쌤이 푼 정답
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		if(age < 0 || age > 100) {
			result = "잘못 입력하셨습니다!";
		} else {
			
			System.out.print("키 입력 : ");
			double cm = sc.nextDouble();
			
			if (age < 12) {
				result = "적정 연령이 아닙니다.";
			} else if(cm < 140.0) {
				result = "적정 키가 아닙니다.";
			} else {
				result = "탑승 가능";
			}
		}
		
		System.out.print(result);
	}
	
	public void ex8() {
		//숙제
		// 풀고 정상작동까지 하는데 "입력이 되자마자 검사를 진행하여 잘못된 경우 프로그램 종료" 라는 부분은
		// 모르겠습니다...ㅠㅠ
		
		/*
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("키 : ");
		double cm = sc.nextDouble();
		
		if((age < 12) && (cm < 140.0)) {
			System.out.println("나이와 키 모두 적절치 않음");
		} else if((age < 0) && (age >100)) {
			System.out.println("나이를 잘못 입력 하셨습니다.");
		} else if ((cm < 0) && (cm > 250.0)) {
			System.out.println("키를 잘못 입력 하셨습니다.");
		} else if((age >= 12) && (cm >= 140.0)) {
			System.out.println("탑승 가능");
		} else if(age < 12) {
			System.out.println("키는 적절하나, 나이는 적절치 않음");
		} else if(cm < 140.0) {
			System.out.println("나이는 적절하나, 키가 적절치 않음");
		} else if((age < 0) || (age >100)) {
			System.out.println("나이를 잘못 입력 하셨습니다.");
		}*/ //수정하다 꼬임...ㅜㅠ
		
		/*if((age >= 12) && (cm >= 140.0)) {
			System.out.println("탑승 가능");
		} else if((age >= 12) && (cm < 140.0)) {
			System.out.println("나이는 적절하나, 키가 적절치 않음");
		} else if((age < 12) && (cm >= 140.0)) {
			System.out.println("키는 적절하나, 나이는 적절치 않음");
		} else if((age < 12) && (cm < 140.0)) {
			System.out.println("나이와 키 모두 적절치 않음");
		} else if((age < 0) && (age >100)) {
			System.out.println("나이를 잘못 입력 하셨습니다.");
		} else if((cm < 0) && (cm > 250.0)) {
			System.out.println("키를 잘못 입력 하셨습니다.");
		} else {
			System.out.println("프로그램 종료");
		}*/// 문제점 나이와 키가 범위에 안들어갔을때 빠져나오지 못함
		
		
		//내가 푼 정답
		/*
		if((age < 0) || (age > 100)) {
			System.out.println("나이를 잘못 입력 하셨습니다.");
		} else if((cm < 0) || (cm >250.0)) {
			System.out.println("키를 잘못 입력 하셨습니다.");
		} else if((age >= 12) && (cm >= 140.0)) {
			System.out.println("탑승 가능");
		} else if((age <= 12) && (cm >= 140.0)) {
			System.out.println("키는 적절하나, 나이는 적절치 않음");
		} else if((age >= 12) && (cm < 140.0)) {
			System.out.println("나이는 적절하나, 키가 적절치 않음");
		} else if((age < 12) && (cm < 140.0)) {
			System.out.println("나이와 키 모두 적절치 않음");
		} else {
			System.out.println("프로그램 종료");
		}
		*/
			
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		if(age < 0 || age > 100) {
			result = "나이를 잘못 입력하셨습니다.";
			
		} else {
			
			System.out.print("키 입력 : ");
			double cm = sc.nextDouble();
			
			if(cm < 0 || cm > 250) {
				result = "키를 잘못 입력하셨습니다.";
				
			} else {
				
				if(age < 12 && cm >= 140.0) { // 나이 안됌 , 키 됌
					result = "키는 적절하나, 나이가 적절치 않음";
				} else if(age >= 12 && cm < 140.0 ) { // 나이 됌 , 키 안됌
					result = "나이는 적절하나, 키는 적절치 않음";
				} else if(age < 12 && cm < 140.0) { // 둘다 안됌
					result = "나이와 키 모두 적절치 않음";
				} else {
					result = "탑승 가능";
				}
				
			}
		}
		System.out.print(result);
	}
}






















