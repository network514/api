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
	 * ����ǥ�� ����ϴ� �޼ҵ�
	 * vo.toString()���� ó�� �����ϰ� ����.
	 */
	@Override
	public void print() {
		gradevo.toString();
	}
	/*
	 * �й����� �˻��ϴ� ����� ���� �޼ҵ� // ������ �����ϴ�..
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
	 * �̸����� ������ �˻��ؼ� ����ϴ� �޼ҵ�
	 */
	@Override
	public Vector<String> searchGradeByName(String name) {
		Vector<String> theNameOfTheGrade = new Vector<String>();
		for(int i=0; i<gradevo.size(); i++){ //���ʹ� length�� �ƴ϶� size
			GradeVO vo = gradevo.elementAt(i);
			if(vo.getName().equals(name))
				theNameOfTheGrade.addElement(vo.toString());
		}
		return theNameOfTheGrade;
	}
	/*
	 * �������� �������� ������������ ���Ľ�Ű�� �޼ҵ�
	 */
	@Override
	public void descGradeTotal() {
		int temp = 1;
		for (int j = 0; j < gradevo.size(); j++) {
			if (gradevo.elementAt(i) < gradevo.elementAt(j)) {
				temp++; // ������...? <>�̰� ���ɾ���... ���� ���� �� �𸣰ڴ�
			}
		}
	}
	/*
	 * �������� �������� ������������ ���Ľ�Ű�� �޼ҵ�
	 */
	@Override
	public void ascGradeTotal() {
		for(int i=0; i<gradevo.size(); i++){  
	          for(int j=0; j<(gradevo.size()-i); j++){
	              if(gradevo.elementAt(j) > gradevo.elementAt(j+1)){ 
	                 GradeVO k = gradevo.elementAt(j); // ����... ���� �̻��ѵ�... ?? 
	              } 
	          } 
	      } 
	}
}
