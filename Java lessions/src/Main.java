import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ������� ����������
		
		byte num = 23;
		
		int num_int = 12345;
		long num_log = 98764;
		
		float num_float = 123.43f;
		double num_double = 345.23123123123d;
		
		boolean isTrue = true;
		boolean isFalse = false;
		
		char char_R = 'R';
		
		String string_hw = "Hello world!";
		
		// ���������� ��� ������
		String st_1, st_2;
		
		// ��������� ��� �����
		int n_1, n_2, n_r;
		
		// ������� ���������
		Scanner str = new Scanner(System.in);
		
		String[][] array = new String[][] {
			{
				"Pam-pam-pam",
				"Br-br-br"
			},
			{
				"Ku-ku-ku",
				"we-we-we"
			}
		};
		
		// �������
		
		System.out.println("byte : " + num);
		
		System.out.println("num_int : " + num_int);
		System.out.println("num_log : " + num_log);
		
		System.out.println("num_float : " + num_float);
		System.out.println("num_double : " + num_double);
		
		System.out.println("isTrue : " + isTrue);
		System.out.println("isFalse : " + isFalse);
		
		System.out.println("char_R : " + char_R);
		
		System.out.println("Srting : " + string_hw);
		/*
		System.out.print("������� ������ ����� : ");
		st_1 = str.nextLine();
		System.out.print("������� ������ ����� : ");
		st_2 = str.nextLine();
		
		System.out.println("���������� : " + st_1 + " " + st_2);
		
		System.out.print("������� ������ ����� : ");
		n_1 = str.nextInt();
		System.out.print("������� ������ ����� : ");
		n_2 = str.nextInt();
		
		n_r = n_1 + n_2;
		
		System.out.println("���������� ����� ����� " + n_1 + " � " + n_2 + " : " + n_r);
		*/
		System.out.print(array[1][1]);
		
	}

}
