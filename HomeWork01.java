/* 
*	��������� �����
*	������� � ������� 1
*/ 

public class HomeWork01 {
    public static void main(String[] args) {
        doOne();
        System.out.println("a * (b + (c / d)) = " + doTwo(1,2,3,4));
        System.out.println(doThree(5, 8));
        doFour(-7);
        System.out.println(doFive(-1));
        doSix("�������");
        doSeven(2016);
    }

	//1 - 2. ������� ���������� ���� ���������� ����� ������, � ���������������� �� ��������;
    static void doOne() {
        System.out.println("������� 1.");
        boolean b = false;
        byte bt = 0;
        char c = 'x';
        short s = 123;
        int i = 777;
        long l = 77777L;
        float f = 777.0f;
        double d = 777.777;
        System.out.println("�������� ��� ���� boolean = " + b);
        System.out.println("�������� ��� ���� byte = " + bt);
        System.out.println("�������� ��� ���� char = [" + c + "]");
        System.out.println("�������� ��� ���� short = " + s);
        System.out.println("�������� ��� ���� int = " + i);
        System.out.println("�������� ��� ���� long = " + l);
        System.out.println("�������� ��� ���� float = " + f);
        System.out.println("�������� ��� ���� double = " + d);
    }

	//2 - 3. �������� ����� ����������� ��������� a * (b + (c / d)) � ������������ ���������,
    //��� a, b, c, d � ������� ��������� ����� ������;
    static double doTwo(double a, double b, double c, double d) {
        System.out.println("\n������� 2.");
        return a * (b + (c / d));
    }

	//3 - 4. �������� �����, ����������� �� ���� ��� �����, � ����������� ��� �� ����� �����
	//� �������� �� 10 �� 20(������������), ���� �� � ������� true, � ��������� ������ � false;
    static boolean doThree(int a, int b) {
        System.out.println("\n������� 3.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

	//4 - 5. �������� �����, �������� � �������� ��������� ���������� ����� �����, ����� ������
	//���������� � ������� ������������� �� ����� ��������, ��� �������������; ���������: ����
	//������� ������������� ������.
    static void doFour(int a) {
        System.out.println("\n������� 4.");
        if (a >= 0) System.out.println("����� " + a + "�������������");
        else System.out.println("����� " + a + " �������������");
    }

	//5 - 6. �������� �����, �������� � �������� ��������� ���������� ����� �����, ����� ������
	//������� true, ���� ����� �������������;
    static boolean doFive(int a) {
        System.out.println("\n������� 5.");
        if (a < 0) return true;
        return false;
    }

	//6 - 7. �������� �����, �������� � �������� ��������� ���������� ������, ������������ ���,
	//����� ������ ������� � ������� ��������� �������, ���������_���!�;
    static void doSix(String name) {
        System.out.println("\n������� 6.");
        System.out.println("������, " + name + "!");
    }

	//7 - 8. * �������� �����, ������� ���������� �������� �� ��� ����������, � ������� ���������
	//� �������. ������ 4-� ��� �������� ����������, ����� ������� 100-��, ��� ���� ������ 400-�
	//� ����������.	
    static void doSeven(int year) {
        System.out.println("\n������� 7.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " �. �� ����������");
        else System.out.println(year + " �. ����������");
    }
}