package api.lang.object;
//java.lang.object는 예약어 이므로 파일명으로 안되기 때문에 api.lang.object
/*
 java.lang.object 클래스 - 모든 클래스의 조상
 - 자바에서 모든 클래스는 Object클래스를 상속받는다.
 - 모든 클래스 객체는 이 클래스 타입으로 형변환 한다. 
 - 가장 상위에 있는 공통 데이터 타입이다. 
 - 기본 primitive 데이터 타입을 받지 않고 다양한 모든 타입을 받으려면 
 	파라미터의 타입을 Object로 지정하면 된다. 
 	이 예는 collection 에서 많이 사용된다.
 */
public class ObjectSyntax {
	public void foo(Object obj){ //타입이 불분명할때는 Object라 한다. 그러면 내부적으로 캐스팅 된다.
		
	}
}
