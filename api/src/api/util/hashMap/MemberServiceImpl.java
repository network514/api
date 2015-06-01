package api.util.hashMap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService{
	/*
	 * ȸ������ ����� �ϴ� �޼ҵ�
	 * HashMap�� �ؾ� id ���� ������ password �� ȣ���ϰڱ���
	 */
	MemberVO vo = new MemberVO();
	Map<String,Object> map = new HashMap<String,Object>();
	
	@Override
	public void join(String id, String password, String name, int age,
			String addr) {
		/*
		 * �� ������ DB�� �����ϴ� ���ϰ� ��ġ�Ѵ�.
		 * ��, ���� Ȱ���ϸ鼭 �����ǰų� ������ �� �ֱ⿡ 
		 * ���� ���� �������� DB�� �����ϰ� ����.
		 */
		vo.setAddr(addr);
		vo.setAge(age);
		vo.setId(id);
		vo.setName(name);
		vo.setPassword(password);
		// join�� ������ ��
		/*
		 * 1. ù��° ��������
		 * map.put(vo.getId(),vo.getPassword());
		 */
		
		// join ������ ������ �����ϱ� ���ؼ� map���.
		map.put("id", vo.getId()); //key���� ���ó���ؾ���.(���ϸ� �ȵ�)
		//map.put("1��", vo.getId()); 
		// String type���� id�� �ִ°��� ����ƽ���� �޸� ������ ����.
		map.put("password", vo.getPassword());
		map.put("name", vo.getName());
		map.put("age", String.valueOf(vo.getAge()));
		// Ű�� ��� ���Ͽ��� ������� String���� ���Ͻ�Ű����
		// int Ÿ������ ���� age �� String Ÿ������ ��ȯ�Ͽ���.
		map.put("addr", vo.getAddr());
		/*
		 * 2. �ι�° ���� ���� (���� ���� ����--> ���Ŀ� ������ �߻���Ų��.)
		 * map.put("age",vo.getAge());
		 */
	}
	/*
	 * ȸ������ �� �α��� ����� �ϴ� �޼ҵ�
	 * ���ٸ� ���� �����ϱ�...
	 * �α��� ����, ���� �޽������� ���⿡�� ��������� ��.
	 */
	@Override
	public void login(String id, String password) {
		/*
		 * 3. ����° ��������
		 * map.get(id) => �Ķ���� ������ �ݵ�� String ���� �ؾ���.
		 */
		if(map.get("id").equals(id) && map.get(password).equals(password)){
			System.out.println("ȯ���մϴ�. "+vo.getAddr()+"�� ��� "+vo.getAge()+"�� "+vo.getName()+"��...");
		}else if(!(map.get("id").equals(id)&&map.get(password).equals(password))){
			System.out.println("�Է��Ͻ� ID�� �������� �ʰų�, ��ġ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ���.");
		}else{
			System.out.println("����� �ٸ��ϴ�. �ٽ� �Է��ϼ���.");
		}
	}
}
