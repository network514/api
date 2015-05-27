package api.lang.string;
/*
 * java.lang.String에서
 * split("구분자")메소드
 * 구분자를 기준으로 String 문자열을 분리하여 
 * 배열들(ArrayList 포함)에 나눠 담는 기능
 * 뒤에 숫자가 붙으면 단어사이 공백을 주고 
 * 없으면 디폴트로 다 공백을 준다.
 */
import java.util.Arrays;

public class SplitDemo {
	public static void main(String[] args) {
		String fruit = "apple,banana,charry,orage";
		String[] fruits = fruit.split(",");
		for(int i=0;i<fruits.length;i++){
			System.out.println("\t"+fruits[i]);
		}
		System.out.println();
		System.out.println("split(String, int) 출력결과 :");
		/*
		 * split(String, int)
		 * int 갯수만큼 공백을 준다.
		 * 단 없으면 디폴트로 전체공백
		 */
		String[] fruits2 = fruit.split(",", 1);
		System.out.println("공백 0"+Arrays.toString(fruits2));
		
		String[] fruits3 = fruit.split(",", 2);
		System.out.println("공백 1"+Arrays.toString(fruits3));
		
		String[] fruits4 = fruit.split(",", 3);
		System.out.println("공백 2"+Arrays.toString(fruits4));
		
		String[] fruits5 = fruit.split(",", 4);
		System.out.println("공백 3"+Arrays.toString(fruits5));
	}
}
