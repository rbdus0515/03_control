package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {

		// 문제 1
		
		System.out.print("숫자 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		String result;
		
		if(num < 0) {
			result = "양수만 입력해주세요";
		} else if(num % 2 == 0) {
			result = "짝수입니다.";
		} else {
			result = "홀수입니다.";
		}
		
		System.out.println(result);
	}

	public void practice2() {
		 
		// 문제 2
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		String result;
		
		double avg = (kor+math+eng)/3;
		
		if(kor < 40 || math < 40 || eng < 40) {
			if(avg > 0 || avg < 60) {
				result = "불합격입니다.";
		} else {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.printf("합계 : %d\n" , kor+math+eng);
			System.out.printf("평균 : %.1f\n" , avg);
			result = "축하합니다, 합격입니다.";
		}
		
		
		
	}
	
	public void practice3() {
		// 문제 3
		//1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
		//잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문 사용)
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		String result;
		/*
		switch(month) {
		case 1 : result = "1월은 31일까지 있습니다."; break;
		case 2 : result = "2월은 28일까지 있습니다."; break;
		case 3 : result = "3월은 31일까지 있습니다."; break;
		case 4 : result = "4월은 30일까지 있습니다."; break;
		case 5 : result = "5월은 31일까지 있습니다."; break;
		case 6 : result = "6월은 30일까지 있습니다."; break;
		case 7 : result = "7월은 31일까지 있습니다."; break;
		case 8 : result = "8월은 31일까지 있습니다."; break;
		case 9 : result = "9월은 30일까지 있습니다."; break;
		case 10 : result = "10월은 31일까지 있습니다."; break;
		case 11 : result = "11월은 30일까지 있습니다."; break;
		case 12 : result = "12월은 31일까지 있습니다."; break;
		default : result = month + "은(는) 잘못 입력된 달입니다.";
		}
		*/
		
		// 쌤 풀이
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월은 30일까지 있습니다.");
		}
		
		
	}
	
	public void practice4() {
		// 문제4
		//키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		//저체중/정상체중/과체중/비만을 출력하세요.
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double m = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		
		double BMI = kg / (m * m);
		
		String result;
		
		if(BMI > 30) {
			result = "고도 비만";
		} else if(25 <= BMI && BMI< 30) {
			result = "비만";
		} else if(23 <= BMI && BMI< 25) {
			result = "과체중";
		} else if(18.5 <= BMI && BMI< 23) {
			result = "정상 체중";
		} else {
			result = "저체중";
		}
		
		
		System.out.println("BMI 지수 : " + BMI);
		System.out.println(result);
	}
	
	public void practice5() {
		// 문제5
		//중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
		//평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		//이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		//70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		
		System.out.print("중간 고사 점수 : ");
		int MS = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int FS = sc.nextInt();
		System.out.print("과제 점수 : ");
		int HWS = sc.nextInt();
		System.out.print("출석 횟수 : ");
		int tag = sc.nextInt();
		
		String result;
		
		double MSAV = MS * 0.2;
		double FSAV = FS * 0.3;
		double HWSAV = HWS * 0.3;
		double tagAV = tag;
		int tagX = 20-tag;
		double sumscore = MSAV + FSAV + HWSAV + tagAV;
		
		System.out.println("=============== 결과 ================");
		if(tagX >= 6 ) {
			result = "Fail [출석 횟수 부족 (" + (int)tagAV +"/20)]";
		} else if(sumscore < 70) {
			System.out.printf("중간 고사 점수(20) : %.1f\n" , MSAV);
			System.out.printf("기말 고사 점수(30) : %.1f\n" , FSAV);
			System.out.printf("과제 점수     (30) : %.1f\n" , HWSAV);
			System.out.printf("출석 점수     (20) : %.1f\n" , tagAV);
			System.out.printf("총점 : %.1f\n" , MSAV + FSAV + HWSAV + tagAV);
			result = "Fail [점수 미달]";
		} else {
			System.out.printf("중간 고사 점수(20) : %.1f\n" , MSAV);
			System.out.printf("기말 고사 점수(30) : %.1f\n" , FSAV);
			System.out.printf("과제 점수     (30) : %.1f\n" , HWSAV);
			System.out.printf("출석 점수     (20) : %.1f\n" , tagAV);
			System.out.printf("총점 : %.1f\n" , MSAV + FSAV + HWSAV + tagAV);
			result = "PASS";
		}
		
		System.out.println(result);
	}
	
	
	
	
	
	
	
}
