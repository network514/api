package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{
	public GradeServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void input(GradeVO vo) {
		// TODO Auto-generated method stub
		
	}
	/*
	 * 성적표를 출력하는 메소드
	 * vo.toString()으로 처리 예상하고 있음.
	 */
	@Override
	public void print() {
		
	}
	/*
	 * 이름으로 성적을 검색해서 출력하는 메소드
	 */
	@Override
	public String searchGradeByHak(String hak) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	 * 이름으로 성적을 검색해서 출력하는 메소드
	 */
	@Override
	public Vector<String> searchGradeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	 * 종합점수 기준으로 내림차순으로 정렬시키는 메소드
	 */
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}
	/*
	 * 종합점수 기준으로 오름차순으로 정렬시키는 메소드
	 */
	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}
}
