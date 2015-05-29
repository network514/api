package api.util.vector.answer;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{
	/* 메소드마다 공유하는 다수의 값 (학생이 여러명이니)이 필요한데,
 	   한군데에 저장할 컬렉션을 필드에 선언해야 겠다.
 	   필드에 선언해야 메소드들이 값을 공유할 수 있으니까... */
	private Vector<GradeVO>vc = new Vector<GradeVO>();
	GradeVO grade = new GradeVO();
	
	/* 학생별로 성적을 입력 받는 것인가... 그럼 입력받아서
 	   저장할 공간이 필요하겠는데... 배열이 다중 변수를 
 	   저장하는 공간인데 한번 생성하면 추가로 늘릴 수 없으니
 	   동적으로 확장하는 컬렉션을 선택해야겠군.
 	   그런데 내가 지금 아는 건 백터 뿐이니 백터에 넣어야지.*/
	@Override
	public void input(GradeVO vo) {
		vc.add(vo);
	}
	
	/*출력 하는 것인가? 그럼 vo 객체의 toString() 가져와야지.*/
	@Override
	public void print() {
		System.out.println(vc.toString());
	}
	
	/* 학번으로 성적을 조회하는 기능이군
 	   학번은 오직 한 학생에게만 존재하므로
 	   리턴값이 String 일테니 백터의 for loop + 내부에 if 를 해봐야겠다.*/
	@Override
	public String searchGradeByHak(String hak) {
		// for 문 안에 지역변수를 선언했더니...
		// 리턴되는 위치와 영역이 달라서 에러가 났다.
		// 따라서 for 문 박으로 지역변수를 떼야겠다.
		String msg = ""; // 지역변수니까 초기화
		for (int i = 0; i < vc.size(); i++) {
			/*
			 * myHak은 백터에서 i 번째 요소에서 학번을 리턴하여 담은 변수.. 타입은 String
			 */
			String myHak = vc.elementAt(i).getHak();
			/*
			 * 파라미터로 받아온 hak과 백터에 담겨있는 myHak이 일치하는지 여부를 체크하는 로직
			 */
			System.out.println("파라미터 학점 :" + hak);
			System.out.println("마이학점 :" + myHak);
			/*
			 * 이렇게 디버깅 해서 보니까...
			 * 파라미터 학점 : 1111
			 * 마이학점 : 김길동 되어있네.
			 * 생성자에서 잘못된 것인듯...
			 */
			if (hak.equalsIgnoreCase(myHak)) {
				msg = hak;
				break;
			} else {
				msg = "조회하는 학번이 없습니다.";
			}
		}
		return msg;
	}
	
	/* 이름으로 성적조회인데 리턴값이 백터인 것을 보니
 	   복수개의 String을 처리하게끔 설계되었군.
 	   리턴값이 하나 든 여래개든 for loop + if 구성밖에는 
 	   백터 요소 출력로직이 없으니 그걸 써야 겠다. */
	@Override
	public Vector<String> searchGradeByName(String name) {
		Vector<String> local = new Vector<String>();
		for (int i = 0; i < vc.size(); i++) {
			/*
			 * myHak은 백터에서 i 번째 요소에서 학번을 리턴하여 담은 변수.. 타입은 String
			 */
			String myName = vc.elementAt(i).getName();
			/*
			 * 파라미터로 받아온 hak과 백터에 담겨있는 myHak이 일치하는지 여부를 체크하는 로직
			 */
			if (name.equalsIgnoreCase(myName)) {
				local.add(name);
			} else {
				local.add("");
			}
		}
		return local;
	}
	
	/* 내림차순인가보다
 	   Collections.sort 쓰면 된다는데 배우면 그때 처리해야겠다. */
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}
	
	/* 오름차순이면 Arrays.sort 를 쓰면 되겠군. */
	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}
}
