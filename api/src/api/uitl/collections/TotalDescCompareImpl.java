package api.uitl.collections;

import java.util.Comparator;

public class TotalDescCompareImpl implements Comparator<GradeVO>{
	/*
	 * ���� �������� ... 90>80>...
	 */
	@Override
	public int compare(GradeVO first, GradeVO second) {
		// TODO Auto-generated method stub
		return (first.getTotal() > second.getTotal()) ? -1 : (first.getTotal() < second.getTotal()) ? 1 : 0;
	}

}
