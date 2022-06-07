import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");

        Scanner sc = new Scanner(System.in);

        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");
        int len = sc.nextInt();
        System.out.println("Введите максимальное число в списке");
        int max = sc.nextInt();

        logger.log("Создаём и наполняем список");
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            list.add(random.nextInt(max));
        }
        System.out.println("Вот случайный список: \n" + list);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите минимальное значение числа в списке:");
        int min = sc.nextInt();

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(min);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список:\n" + filter.filterOut(list));

        logger.log("Завершаем программу");
    }
}