package api.lang.string;
/*
 * java.lang.String에 있는
 * substring() 메소드는 
 * 시작위치 (begin)부터 끝위치 (end) 범위 문자열 리턴
 * begin <= x < end
 */
public class SubstringDemo {
	public static void main(String[] args) {
		// 인덱스는 0부터 시작하며 공백도 1로 처리한다.
		System.out.println("파라미터가 한개일때 :" + "Hello Java".substring(6));
		// 6이지만 7번째 문자인 J부터 9번째 미만 글자인 a
		//그래서 Ja를 리턴
		System.out.println("파라미터가 한개일때 :" + "Hello Java".substring(6,8));
	}
}
