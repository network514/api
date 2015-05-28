package api.util.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;

/*
 * java.util.Arrays의 메소드인 
 * sort()는 정렬 기능을 한다.
 */
public class SortDemo {
	Vector<Integer> vec = new Vector<Integer>();
	public Vector<Integer>getAscSort1(int[] arr){
		int temp = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					//스왑 알고리즘 순서를 바꾼다.
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//확장된 for문 : for(요소 : 배열){} 형태를 가진다.
		for(int k:arr){
			vec.addElement(k);
		}
		return vec;
	}
	public Vector<Integer>getAscSort2(int[] arr){
		Arrays.sort(arr); // 내부적으로 오름차순 로직이 구현되어있다.
		for(int k : arr){
			vec.addElement(k);
		}
		return vec;
	}
	public static void main(String[] args) {
		SortDemo util = new SortDemo();
		SortDemo util2 = new SortDemo();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		int[] arr = {8,5,9,4,1,0};
		list1 = util.getAscSort1(arr);
		list2 = util2.getAscSort1(arr);
		System.out.println("스왑알고리즘 사용한 오름차순 정렬 :" + list1.toString());
		System.out.println("Arrays.sort() 사용한 오름차순 정렬 : " + list2.toString());
	}
}
