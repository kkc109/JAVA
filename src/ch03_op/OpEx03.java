package ch03_op;
/*
 * 논리부정 연산자 : ! 
 */
public class OpEx03 {
	public static void main(String[] args) {
		System.out.println(true);
		System.out.println("!true="+!true);
		System.out.println("!false="+!false);
		int x=100;
		System.out.println("(x < 200)=" + (x < 200));
		System.out.println("!(x < 200)=" + !(x < 200));
		System.out.println("!( 5 % 2 ==0)=" + !( 5 % 2 ==0)); 
		//% 나머지연산자
		System.out.println("(5 % 2 !=0)=" + ( 5 % 2 !=0));
	}
}