package api.uitl.collections;

import java.util.Comparator;

public class TotalAscCompareImpl implements Comparator<GradeVO>{

	/*
	 * 총점 오름차순... 숫자값 오름차순
	 */
	@Override
	public int compare(GradeVO first, GradeVO second) {
		// TODO Auto-generated method stub
		return (first.getTotal() > second.getTotal()) ? -1 : (first.getTotal() < second.getTotal()) ? 1 : 0;
	}

}
