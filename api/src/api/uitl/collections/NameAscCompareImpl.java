package api.uitl.collections;

import java.util.Comparator;

public class NameAscCompareImpl implements Comparator<GradeVO>{
	/*
	 * �̸����� �������� ����
	 * ��, ��, ��, ...
	 * A, B, C ...
	 */
	@Override
	public int compare(GradeVO first, GradeVO second) {
		// TODO Auto-generated method stub
		return first.getName().compareTo(second.getName());
		/*
		 * �ڿ� �Ķ���Ϳ� �ִ� �� ���ڿ� ���ؼ� 
		 * �ձ��ڰ� ���� ������ ���ڶ�� �� ���ں��� �����ض�.
		 */
	}
	
}
