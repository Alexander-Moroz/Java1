/**
 * Homework to a lesson 7
 *
 * @author Alexander Moroz
 * @since 2017-03-08
 * @version 1.0
 * 
 * 1. ��������� ������ ��� ����� � ������� � ����
 *
 * 2. ������� ���, ����� � ������� � ���� �� ����� ���������� ��������������
 *    ���������� ��� (��������, � ����� 10 ���, � ��� �������� �������� 15-20)
 *
 * 3. ������� ���� ����� �������� ���� ������� (����� ������� �����, ��� �������).
 *    ���� ���� ������� �������� (������� ���), ������� = true
 *
 * 4. �������, ��� ���� ���� ���� ��� � �������, �� �� �� ������ �� �������,
 *    �� ���� �� ����� ���� ���������� ��� (��� ������� ��� ��������� ������ ���������)
 *
 * 5. ������� ������ ����� � ������� � ����, ��������� ���� ����� �������� �� ���� �������
 *    � ����� ������� ���������� � ������� ����� � �������
 *
 * 6. �������� � ������� �����, � ������� �������� ����� ���� �� ��������� ��� � �������
 *
 * 7 **** ��������� 8 ����� ����� ���� �������� Java ���������������� ��� ����������
 *        � ������� ������� �� ���� �����.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("List of cats:");
        Cat[] x = {new Cat("Matroskin", 7), new Cat("Tom", 5), new Cat("Ben", 15)};
        Plate plate = new Plate(100);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println("***********************************************");
        System.out.println("increase food by 100");
        plate.increaseFood(100);
        System.out.println(plate);
        System.out.println("***********************************************");
        System.out.println("Cats take food:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }
}
