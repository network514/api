package api.uitl.collections;

import java.util.Comparator;

public class NameDescCompareImpl implements Comparator<GradeVO>{

	/*
	 * �̸����� �������� ����
	 */
	@Override
	public int compare(GradeVO first, GradeVO second) {
		// TODO Auto-generated method stub
		return second.getName().compareTo(first.getName());
	}
	

}
