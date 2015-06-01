package api.uitl.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradeSortMain {
	public static void main(String[] args) {
		List<GradeVO> grades = new ArrayList<GradeVO>();
		
		GradeVO g1 = new GradeVO("2011","ȫ�浿",90,80,70);
		GradeVO g2 = new GradeVO("2012","��浿",20,20,20);
		GradeVO g3 = new GradeVO("2013","��浿",60,60,60);
		GradeVO g4 = new GradeVO("2014","���浿",90,90,90);
		
		grades.add(g1);
		grades.add(g2);
		grades.add(g3);
		grades.add(g4);
		/*
		 * anonymous ������ ó�� : �� �ѹ��� ���� �����ڴ�.
		 */
		grades.add(new GradeVO("2014","���浿",90,90,90));
		
		System.out.println("�̸� �������� ����");
		Collections.sort(grades, new NameAscCompareImpl());
		for(GradeVO grade : grades){
			//System.out.println(grade);
		}
		System.out.println("�̸� �������� ����");
		Collections.sort(grades,new NameDescCompareImpl());
		
		for(GradeVO grade : grades){
			//System.out.println(grade);
		}
		System.out.println("���� �������� ����");
		Collections.sort(grades, new NameAscCompareImpl());
		
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
		System.out.println("���� �������� ����");
		Collections.sort(grades, new NameAscCompareImpl());
		
		for(GradeVO grade : grades){
			//System.out.println(grade);
		}
		
	}
}
