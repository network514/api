package api.util.hashMap;

public interface MemberService {
	
	public void join(String id, String password, String name, int age, String addr);
	
	public void login(String id, String password);
	// ��¹� ����
	// �Է��Ͻ� ID�� �������� �ʰų�, ��ġ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ���.
	// ����� �ٸ��ϴ�. �ٽ� �Է��ϼ���.
	// ȯ���մϴ�.����ÿ� ��� 20�� ȫ�浿��...
}
