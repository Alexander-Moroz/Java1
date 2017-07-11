/**
 * Homework to a lesson 7
 *
 * @author Alexander Moroz
 * @since 2017-03-08
 * @version 1.0
 * 
 * 1. –асширить задачу про котов и тарелки с едой
 *
 * 2. —делать так, чтобы в тарелке с едой не могло получитьс€ отрицательного
 *    количества еды (например, в миске 10 еды, а кот пытаетс€ покушать 15-20)
 *
 * 3.  аждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
 *    ≈сли коту удалось покушать (хватило еды), сытость = true
 *
 * 4. —читаем, что если коту мало еды в тарелке, то он ее просто не трогает,
 *    то есть не может быть наполовину сыт (это сделано дл€ упрощени€ логики программы)
 *
 * 5. —оздать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
 *    и потом вывести информацию о сытости котов в консоль
 *
 * 6. ƒобавить в тарелку метод, с помощью которого можно было бы добавл€ть еду в тарелку
 *
 * 7 **** ѕрочитать 8 главу книги ћайк ћак√рата Java ѕрограммирование дл€ начинающих
 *        и сделать примеры из этой главы.
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
