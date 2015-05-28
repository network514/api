package api.util.vector;

import java.util.Vector;

/*
 * java.util.Vector�� �޼ҵ��� 
 * add()�� ���Ϳ� ���� �Ҵ��ϴ� ����� �Ѵ�.
 */
public class AddDemo {
	public static void main(String[] args) {
		String id = "admin";
		int age = 27; // ���� 
		Boolean male = true; // ����
		
		Vector<String> vec = new Vector<String>();
		//Vector vec = new Vector(); � �ڷ����̵� �� ��. �� warning�� ��.
		String tom = new String("admin");
		Boolean gender = new Boolean(false);
		
		vec.add(new String("admin"));
		vec.add(String.valueOf(23));
		vec.add(String.valueOf(gender));
		vec.add("���ͷ� ���ڷ� ������ ��ü");
		// vec.add(2); int���� �ƿ� ������ �߻�
		
		//����! ���ʹ� length()�� ������� �ʰ� 
		//size()�� ����� ���ڸ� ǥ���ϴµ� ����մϴ�.
		
		// �迭���� for loop ��½� get(arr[i]) ������
		// ���ʹ� elementAt(i) �Դϴ�. �� ����ϼ���...
		for(int i=0;i<vec.size();i++){
			System.out.println("������ "+i+"��° ��Ҵ� : "+vec.elementAt(i));
		}
		/*
		 * ��µ� ����� : 
		 * ������ 0��° ��Ҵ� : admin
		 * ������ 1��° ��Ҵ� : 23 ==> ����ó�� �������� ����� String ���ͷ�
		 * ������ 2��° ��Ҵ� : false ==> boolean Ÿ���� �ƴ϶� String ��
		 * ������ 3��° ��Ҵ� : ���ͷ� ���ڷ� ������ ��ü ==> ���ͷ� ��ü�� ��� ����
		 */
	}
}
