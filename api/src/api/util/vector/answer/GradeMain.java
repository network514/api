package api.util.vector.answer;

import java.util.Vector;

public class GradeMain {
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		// 일일이 setter 만들기가 귀찮다.
		// 생성자로 한번에 만들어야지...
		// 아래처럼 더미값 생성.. 나중에 없앨 것.
		GradeVO g1 = new GradeVO("1111","홍길동",70,80,90);
		GradeVO g2 = new GradeVO("2222","김길동",75,85,95);
		GradeVO g3 = new GradeVO("3333","김길동",10,10,10);
		service.input(g1);
		service.input(g2);
		service.input(g3);
		service.print();
		/*
		 * 성적표 [학번=, 이름=, 국어=0, 영어=0, 수학=0]
		 * 이 나오더라.
		 * 결과를 보니까 grade를 출력은 하는데, 백터에 들어있는 녀석이 아니라
		 * 그냥 Null 값이 더라.
		 * 그럼 백터에 있는 grade를 가져오는 방법 ?
		 */
		
		String dummy = service.searchGradeByHak("1111");
		System.out.println(dummy);
		Vector<String> temp = new Vector<String>();
		temp = service.searchGradeByName("김길동");
		System.out.println(temp.toString());
		
	}
}
