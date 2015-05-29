package api.util.vector.answer;

import java.util.Vector;

public class GradeMain {
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		// ������ setter ����Ⱑ ������.
		// �����ڷ� �ѹ��� ��������...
		// �Ʒ�ó�� ���̰� ����.. ���߿� ���� ��.
		GradeVO g1 = new GradeVO("1111","ȫ�浿",70,80,90);
		GradeVO g2 = new GradeVO("2222","��浿",75,85,95);
		GradeVO g3 = new GradeVO("3333","��浿",10,10,10);
		service.input(g1);
		service.input(g2);
		service.input(g3);
		service.print();
		/*
		 * ����ǥ [�й�=, �̸�=, ����=0, ����=0, ����=0]
		 * �� ��������.
		 * ����� ���ϱ� grade�� ����� �ϴµ�, ���Ϳ� ����ִ� �༮�� �ƴ϶�
		 * �׳� Null ���� ����.
		 * �׷� ���Ϳ� �ִ� grade�� �������� ��� ?
		 */
		
		String dummy = service.searchGradeByHak("1111");
		System.out.println(dummy);
		Vector<String> temp = new Vector<String>();
		temp = service.searchGradeByName("��浿");
		System.out.println(temp.toString());
		
	}
}
