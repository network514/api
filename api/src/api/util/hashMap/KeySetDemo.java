package api.util.hashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// 서울시에서 찾느냐 강남구에서 찾느냐
// 좁은 범위에서 찾는게 속도가 빠르다.

public class KeySetDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		/*
		 * Map에 값을 입력하는 경우 => 한가지만 존재한다.
		 * Null도 넣을 수 있다.
		 */
		map.put("소트니 코바", new Integer(10));
		map.put("아사다 마오", new Integer(66));
		map.put("김연아", new Integer(98));
		
		/*
		 * Gof 의 디자인 패턴 중에서 
		 * Iterator 패턴이라고 불리우는 
		 * Map에서 값을 추출하는 정규화된 패턴이다.
		 */
		/*
		 * 맵에서 키값과 벨류값의 맵핑 현황을 전부 출력할때는
		 * entrySet() 사용
		 * 맵에서 키값만 출력할 경우
		 * keySet() 사용
		 * 단, 어느 경우든지 Set 이용
		 * 이유는.. 컬렉션에서 
		 * 인터페이스는 Set, List, Map 세가지가 대표적인데...
		 * Set과 Map은 인덱스 값이 없어서 상호 호환이 잘되고
		 * Set은 중복값 제거 기능이 있어서 
		 * Map에서 키값으로 중복이 없어야 하는 부분과도 일치해
		 * Set을 통해 키값, 혹은 키+밸류값을 출력하는데 쓰인다.
		 * 참고로 맵은 Iterator가 없어서 
		 * Set 의 Iterator를 사용하기 위함이다.
		 */
		/*
		 * Map에서 값을 출력하는 경우는 3가지 인데...
		 * 첫번째는 키 + 밸류 형태로 함께 출력하는 경우
		 * entrySet() + Iterator 패턴 사용
		 */
		Set set = map.entrySet(); 
		// 키와 밸류의 요소, 맵안에서는 연결되어있지만 별개의 요소
		Iterator it = set.iterator(); // iterator() 순환하는 메소드 
		while(it.hasNext()){ // 다음값이 있으면 true, flase
			Map.Entry e = (Map.Entry)it.next(); 
			// 제네릭을 사용하지 않고 모든 타입을 다 받겠다.
			//Entry는 이너 클래스 요소를 뜻함. Map에 있는 요소중 key, value요소를 뜻함.
			System.out.println("참가자 :" + e.getKey() +", 점수 :" + e.getValue());
		}
		/*
		 * Map에서 값을 출력하는 경우는 3가지 인데...
		 * 두번째는 키 들만 출력하는 경우
		 * keySet() 사용
		 */
		set = map.keySet();
		System.out.println("참가자 명단 :"+set);
		/*
		 * Map에서 값을 출력하는 경우는 3가지 인데...
		 * 세번째는 밸류(값)들만 출력하는 경우
		 * Collection 사용
		 */
		// Collection에서 이클립스 제안 중에서 java.util.Collection 선택
		Collection values = map.values();
		it = values.iterator();
		int total = 0;
		while(it.hasNext()){
			Integer i = (Integer) it.next();
			total += i.intValue();
		}
		System.out.println("총점 :" + total);
		// Set도 List 계열의 클래스처럼 요소의 갯수를 size()로 한다.
		System.out.println("평균 :" + total/set.size());
		//Collections.max는 최대값, Collections.min은 최소값을 리턴한다.
		System.out.println("1등 :" + Collections.max(values));
		System.out.println("꼴등 :" + Collections.min(values));
	}
}
