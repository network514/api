package api.lang.system;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * java.lang.Sysoem 에 속한 
 * CurrentTimeMilleis() 은
 * ROM에 내장된 시간을 리턴한다.
 */
public class CurrentTimeDemo {
	public static void main(String[] args) {
		long curTime = System.currentTimeMillis();
		System.out.println("curTime : " + curTime);
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		/*
		 * new Date() 시에 import 제안이 두가지인데
		 * 그중 java.util.Data;를 선택한다.
		 */
		String nowTime = sdf.format(new Date(curTime));
		System.out.println("현재시간 :" + nowTime);
	}
}
