/* 
*	Александр Мороз
*	задание к занятию 1
*/ 

public class HomeWork01 {
    public static void main(String[] args) {
        doOne();
        System.out.println("a * (b + (c / d)) = " + doTwo(1,2,3,4));
        System.out.println(doThree(5, 8));
        doFour(-7);
        System.out.println(doFive(-1));
        doSix("учитель");
        doSeven(2016);
    }

	//1 - 2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    static void doOne() {
        System.out.println("Задание 1.");
        boolean b = false;
        byte bt = 0;
        char c = 'x';
        short s = 123;
        int i = 777;
        long l = 77777L;
        float f = 777.0f;
        double d = 777.777;
        System.out.println("Значение для типа boolean = " + b);
        System.out.println("Значение для типа byte = " + bt);
        System.out.println("Значение для типа char = [" + c + "]");
        System.out.println("Значение для типа short = " + s);
        System.out.println("Значение для типа int = " + i);
        System.out.println("Значение для типа long = " + l);
        System.out.println("Значение для типа float = " + f);
        System.out.println("Значение для типа double = " + d);
    }

	//2 - 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – входные параметры этого метода;
    static double doTwo(double a, double b, double c, double d) {
        System.out.println("\nЗадание 2.");
        return a * (b + (c / d));
    }

	//3 - 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
	//в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    static boolean doThree(int a, int b) {
        System.out.println("\nЗадание 3.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

	//4 - 5. Написать метод, которому в качестве параметра передается целое число, метод должен
	//напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль
	//считаем положительным числом.
    static void doFour(int a) {
        System.out.println("\nЗадание 4.");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

	//5 - 6. Написать метод, которому в качестве параметра передается целое число, метод должен
	//вернуть true, если число отрицательное;
    static boolean doFive(int a) {
        System.out.println("\nЗадание 5.");
        if (a < 0) return true;
        return false;
    }

	//6 - 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
	//метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    static void doSix(String name) {
        System.out.println("\nЗадание 6.");
        System.out.println("Привет, " + name + "!");
    }

	//7 - 8. * Написать метод, который определяет является ли год високосным, и выводит сообщение
	//в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й
	//– високосный.	
    static void doSeven(int year) {
        System.out.println("\nЗадание 7.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }
}