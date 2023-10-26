package ch05_array;

public class ArrayEx04 {
	/*
	 * command 라인에서 파라미터 받기
	 *  javac ArrayEx04.java 
	 *  c:\aaa\> java  ArrayEx04  홍길동 김삿갓 aaa bbb
	 *  우클릭  ---> run as  ---> run configurations  --> tab : arguments
	 */
	public static void main(String[] args) {  //String args[]
		System.out.println(args.length);
		if(args.length == 0) {
			System.out.println("커맨드라인에 파라미터를 입력하세요");
			System.out.println("java ch05_array.ArrayEx4 홍길동 김삿갓 aaa bbb");
			return;
		}
		for(int i=0;i<args.length;i++) {
			System.out.println("args["+i+"]="+args[i]);
		}

	}

}
