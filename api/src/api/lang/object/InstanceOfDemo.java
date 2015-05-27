package api.lang.object;
/*
 * ���������� �����ϰ� �ִ� �ν��Ͻ��� ���� Ÿ���� 
 * �˾ƺ��� ���� instanceof �����ڸ� ����Ѵ�. 
 * ������ ����δ� true�� false �� �ϳ��� �����Ѵ�.
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
		 * �ҹ����� Car Ÿ������ Ȯ�� �� 
		 * �´ٸ� (FireCar) �� ��ü ĳ������ �϶�.
		 */
		if(c instanceof FireCar){
			FireCar f = (FireCar) c;
			f.driver();
			f.stop();
			f.shootWater();
			/*
			 * �������� Car Ÿ������ Ȯ�� �� 
			 * �´ٸ� (Ambulance) �� ��ü ĳ������ �϶�.
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
		System.out.println("������...");
	}
	void stop(){
		System.out.println("���� !!");
	}
}
class FireCar extends Car{ // Car Ŭ������ ��ӹ��� �ҹ���
	void shootWater(){
		System.out.println("���ѷ� �Ҳ��� ��...");
	}
}
class Ambulance extends Car{ //Car Ŭ������ ��ӹ��� ������
	void siren(){
		System.out.println("���̷��� �︮�� ���� ��...");
	}
}