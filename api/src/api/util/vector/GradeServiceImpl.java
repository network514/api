package api.util.vector;

import java.util.Arrays;
import java.util.Vector;


public class GradeServiceImpl implements GradeService{
	private Vector<GradeVO> gradevo = new Vector<GradeVO>();
	public GradeServiceImpl() {
	}

	@Override
	public void input(GradeVO vo) {
		gradevo.addElement(vo);
	}
	/*
	 * 성적표를 출력하는 메소드
	 * vo.toString()으로 처리 예상하고 있음.
	 */
	@Override
	public void print() {
		gradevo.toString();
	}
	/*
	 * 학번으로 검색하는 기능을 가진 메소드 // 성적을 리턴하는..
	 */
	@Override
	public String searchGradeByHak(String hak) {
		for(int i=0; i<gradevo.size(); i++){
			GradeVO vo = gradevo.elementAt(i);
			if(vo.getHak().equals(hak))
				return vo.toString();
		}
		return gradevo.toString();
	}
	/*
	 * 이름으로 성적을 검색해서 출력하는 메소드
	 */
	@Override
	public Vector<String> searchGradeByName(String name) {
		Vector<String> theNameOfTheGrade = new Vector<String>();
		for(int i=0; i<gradevo.size(); i++){ //백터는 length가 아니라 size
			GradeVO vo = gradevo.elementAt(i);
			if(vo.getName().equals(name))
				theNameOfTheGrade.addElement(vo.toString());
		}
		return theNameOfTheGrade;
	}
	/*
	 * 종합점수 기준으로 내림차순으로 정렬시키는 메소드
	 */
	@Override
	public void descGradeTotal() {
		int temp = 1;
		for (int j = 0; j < gradevo.size(); j++) {
			if (gradevo.elementAt(i) < gradevo.elementAt(j)) {
				temp++; // 으으음...? <>이거 어케쓰지... 백터 뭔지 잘 모르겠다
			}
		}
	}
	/*
	 * 종합점수 기준으로 오름차순으로 정렬시키는 메소드
	 */
	@Override
	public void ascGradeTotal() {
		for(int i=0; i<gradevo.size(); i++){  
	          for(int j=0; j<(gradevo.size()-i); j++){
	              if(gradevo.elementAt(j) > gradevo.elementAt(j+1)){ 
	                 GradeVO k = gradevo.elementAt(j); // 으음... 뭔가 이상한데... ?? 
	              } 
	          } 
	      } 
	}
}
