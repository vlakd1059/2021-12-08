import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// ĳ������ ���� ������ ��� Ǯ��
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� >> ");
		int num1 = sc.nextInt();

		System.out.print("�ι�° ���� >> ");
		int num2 = sc.nextInt();

		System.out.print("������ �Է�(+, -, *, /) >> ");
		char op = sc.next().charAt(0);

		System.out.println("����� : " + cal(num1, num2, op));
	}

	// cal �޼ҵ� ����
	public static int cal(int num1, int num2, char op) {
		// ����� ���� �� �ִ� ���� ����
		// int result = 0;
		// ������ ���ϱ�
		// +,-,*,/ �߰�.
		if (op == '-') {
			// ���꿡 ���� �۾� ����.
			return num1 - num2;
		} else if (op == '+') {
			return num1 + num2;
		} else if (op == '*') {
			return num1 * num2;
		} else if (op == '/') {
			return num1 / num2;
		} else {
			return 0;
		}
		// return result
	}
}
