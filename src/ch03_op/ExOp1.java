package ch03_op;

import java.util.Scanner;

public class ExOp1 {
	/*
	12345 초가 몇시간 몇분 몇초인지 출력하기

	결과

	3시 25분 45초

	*/ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		//키보드에서 입력받기
		System.out.println("계산할 초를 입력하세요");
		Scanner scan = new Scanner(System.in);
		num =scan.nextInt();
		System.out.print(num/3600+"시   "+(num%3600)/60+"분 ");
		System.out.println(num%60+ "초");
		
	}

}
