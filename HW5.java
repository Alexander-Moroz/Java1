/**
 * Homework to a lesson 5
 *
 * @author Alexander Moroz
 * @since 2017-28-02
 * @version 1.0
 *
 * 1. ������� ����� "���������" � ������: ���, ���������, email, �������,
 *    ��������, �������;
 *
 * 2. ����������� ������ ������ ��������� ��� ���� ��� �������� �������;
 *
 * 3. ������ ������ ���������� �������� �����, ������� ������� ���������� ��
 *    ������� � �������;
 *
 * 4. ������� ������ �� 5 �����������
 *
 * ������:
 * Person[] persArray = new Person[5]; // ������� ��������� ������ ��������
 * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
 *     "892312312", 30000, 30); // ����� ��� ������ ������ ������� ������ ������
 * persArray[1] = new Person(...);
 * ...
 * persArray[4] = new Person(...);
 * � ������� ����� ������� ���������� ������ � ����������� ������ 40 ���;
 */

class Employee {
    String firstname, name, middlename, position, email;
    int salary, age;

    Employee(String firstname,
             String name,
             String middlename,
             String position,
             String email,
             int salary,
             int age) {
        this.firstname = firstname;
        this.name = name;
        this.middlename = middlename;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    void getFullInfo() {
        System.out.println("firstname: " + firstname + " | name: " + name
                + " | middlename: " + middlename + " | position: " + position
                + " | email: " + email + " | salary: " + salary + " | age: "
                + age);
    }

    int getAge() {
        return age;
    }
}

public class HW5 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov", "Ivan", "Ivanovich",
                "Top manager", "ivanovii@mail.me", 150000, 45);
        employees[1] = new Employee("Petrov", "Petr", "Petrovich", "manager",
                "petrovpp@mail.me", 50000, 30);
        employees[2] = new Employee("Sidorov", "Sidor", "Sidorovich",
                "manager", "sidorovss@mail.me", 35000, 25);
        employees[3] = new Employee("Pupkin", "Vasilii", "Ivanovich",
                "manager", "pupkinvi@mail.me", 650000, 41);
        employees[4] = new Employee("Semenov", "Semen", "Semenovich",
                "manager", "semenovss@mail.me", 300000, 23);

        for (Employee e : employees) if (e.getAge() > 40) e.getFullInfo();
    }
}