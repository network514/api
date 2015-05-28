package api.lang.string;
/*
 * java.lang.String�� �޼ҵ� �� 
 * toUpperCase() �� �ش� ���ڿ��� ���� �빮�ڷ� ��ȯ
 * toLowerCase() �� �ش� ���ڿ��� ���� �ҹ��ڷ� ��ȯ
 * valueOf() �� �ٸ� Ÿ���� ��� ���ڿ��� ��ȯ��
 */
public class ValueOf {
	public static void main(String[] args) {
		String str = "Hello Java";
		String msg;
		System.out.println("�׵彺�� ���� :" + str);
		msg = str.toUpperCase();
		System.out.println(msg);
		msg = str.toLowerCase();
		System.out.println(msg);
		// valueOf() �� �Ķ���� ���� int ���̴�.
		// Integer.parseInt()�� �ݴ� ����. 
		// String �� ����ƽ �޼ҵ��� valueOf()��
		// ȣ���ϸ� �ٷ� ���ڿ��� ��ȯ�ȴ�.
		msg = String.valueOf(str.length());
		System.out.println("valueOf �� ��� : " + msg);
	}
}