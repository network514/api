package api.lang.object;
/*
 * 참조변수가 참조하고 있는 인스턴스의 실제 타입을 
 * 알아보기 위해 instanceof 연산자를 사용한다. 
 * 연산의 결과로는 true와 false 중 하나를 리턴한다.
 */
public class InstanceOfDemo {
	public static void main(String[] args) {
		FireCar fireCar = new FireCar();
		Ambulance ambulance = new Ambulance();
		
		InstanceOfDemo test = new InstanceOfDemo();
		test.doWork(fireCar);
		test.doWork(ambulance);
	}
	public void doWork(Car c){
		/*
		 * 파라미터로 넘어온 c가 FireCar 타입인지 확인 후 
		 * 맞다면 (FireCar) 로 객체 캐스팅을 하라.
		 */
		if(c instanceof FireCar){
			FireCar f = (FireCar) c;
			f.driver();
			f.stop();
			f.shootWater();
			/*
			 * 파라미터로 넘어온 C가 Ambulance 타입인지 확인 후 
			 * 맞다면 (Ambulance) 로 객체 캐스팅을 하라.
			 */
		}else if(c instanceof Ambulance){
			Ambulance a = (Ambulance) c;
			a.driver();
			a.siren();
			a.stop();
		}
	}
}
class Car{
	String color;
	int door;
	void driver(){
		System.out.println("운전중...");
	}
	void stop(){
		System.out.println("스톱 !!");
	}
}
class FireCar extends Car{ // Car 클래스를 상속받은 소방차
	void shootWater(){
		System.out.println("물뿌려 불끄는 중...");
	}
}
class Ambulance extends Car{ //Car 클래스를 상속받은 구급차
	void siren(){
		System.out.println("사이렌을 울리고 가는 중...");
	}
}