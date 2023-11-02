package ch07_oop;

class CastingEx1 {
	public static void main(String args[]) {
		Car car1 = new FireEngine();  //100
		Car car2=null;
		FireEngine fe = null;
 		car1.drive();
 		fe=(FireEngine) car1;  
 		fe.drive();
		car2 = fe;
		car2.water();
 		
 		
 		
	}}
class Car {
	String color;
	int door;
	void drive() { // 운전하는 기능
		System.out.println("drive, Brrrr~");	}
	void stop() { // 멈추는 기능
		System.out.println("stop!!!");	}}

class FireEngine extends Car { // 소방차
	void water() { // 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}