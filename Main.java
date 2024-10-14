import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // выбор задачи
            System.out.println("\nВыберите задачу (1 - 20):");
            System.out.println("1 Дробная часть");
            System.out.println("2 Букву в число");
            System.out.println("3 Двузначное");
            System.out.println("4 Диапазон");
            System.out.println("5 Равенство");
            System.out.println("6 Модуль числа");
            System.out.println("7 Тридцать пять");
            System.out.println("8 Тройной максимум");
            System.out.println("9 Двойная сумма");
            System.out.println("10 День недели");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();

            // выйти из программы
            if (choice == 0) {
                System.out.println("Выход из программы.");
                break;
            }

            // обработка выбора задачи
            switch (choice) {
                case 1:
                    // дробная часть
                    System.out.print("Введите число для вычисления его дробной части: ");
                    if (scanner.hasNextDouble()) {
                        double x = scanner.nextDouble();
                        fraction(x);
                    } else {
                        System.out.println("Необходимо ввести число");
                        scanner.next(); // Очистка неверного ввода
                    }
                    break;
                case 2:
                    // букву в число (ASCII-код)
                    System.out.print("Введите символ (0-9): ");
                    String input = scanner.next();
                    if (input.length() == 1 && Character.isDigit(input.charAt(0))) {
                        char ch = input.charAt(0);
                        System.out.println("Код символа: " + charToAscii(ch)); // Получаем ASCII-код
                    } else {
                        System.out.println("Необходимо ввести символ от 0 до 9 включительно");
                    }
                    break;
                case 3:
                    // двузначное
                    System.out.print("Введите число для проверки: ");
                    if (scanner.hasNextInt()) {
                        int num = scanner.nextInt();
                        System.out.println("Число двузначное: " + is2Digits(num));
                    } else {
                        System.out.println("Некорректный ввод: введите целое число.");
                        scanner.next(); // Очистка неверного ввода
                    }
                    break;
                case 4:
                    // диапазон
                    System.out.print("Введите левую границу диапазона: ");
                    int a = scanner.nextInt();
                    System.out.print("Введите правую границу диапазона: ");
                    int b = scanner.nextInt();
                    System.out.print("Введите точку для проверки нахождения в диапазоне: ");
                    int checkNum = scanner.nextInt();
                    System.out.println("Точка находится в диапазоне: " + isInRange(a, b, checkNum));
                    break;
                case 5:
                    // равенство
                    System.out.print("Введите три числа (a, b, c): ");
                    int a1 = scanner.nextInt();
                    int b1 = scanner.nextInt();
                    int c1 = scanner.nextInt();
                    System.out.println("Все равны: " + isEqual(a1, b1, c1));
                    break;
                case 6:
                    // модуль числа
                    System.out.print("Введите число для нахождения его модуля: ");
                    int x1 = scanner.nextInt();
                    System.out.println("Модуль: " + abs(x1));
                    break;
                case 7:
                    // тридцать пять
                    System.out.print("Введите число (проверка на делимость 3 или 5): ");
                    int y = scanner.nextInt();
                    System.out.println("Делится на 3 или 5, но не на оба: " + is35(y));
                    break;
                case 8:
                    // тройной максимум
                    System.out.print("Введите три числа: ");
                    int x2 = scanner.nextInt();
                    int y2 = scanner.nextInt();
                    int z2 = scanner.nextInt();
                    System.out.println("Максимум из введенных чисел: " + max3(x2, y2, z2));
                    break;
                case 9:
                    // двойная сумма
                    System.out.print("Введите два числа: ");
                    int d = scanner.nextInt();
                    int e = scanner.nextInt();
                    System.out.println("Сумма чисел: " + sum2(d, e));
                    break;
                case 10:
                    // день недели
                    System.out.print("Введите число от 1 до 7 (день недели): ");
                    int dayNumber = scanner.nextInt();
                    System.out.println("День недели: " + day(dayNumber));
                    break;
                case 11:
                    System.out.print("Введите число (список чисел): ");
                    int x = scanner.nextInt();
                    System.out.println("Числа подряд: " + listNums(x));
                    break;
                // Задача 2: Четные числа
                case 12:
                    System.out.print("Введите число (четные числа): ");
                    int y1 = scanner.nextInt();
                    System.out.println("Четные числа: " + chet(y1));
                    break;
                case 13:
                    // Задача 3: Длина числа
                    System.out.print("Введите длинное число: ");
                    long num = scanner.nextLong();
                    System.out.println("Длина числа: " + numLen(num));
                    break;
                case 14:
                    // Задача 4: Квадрат
                    System.out.print("Введите число (размер квадрата): ");
                    int squareSize = scanner.nextInt();
                    square(squareSize);
                    break;
                case 15:
                    // Задача 5: Правый треугольник
                    System.out.print("Введите число (высота треугольника): ");
                    int triangleHeight = scanner.nextInt();
                    rightTriangle(triangleHeight);
                    break;
                default:
                    System.out.println("Ошибка: введите верный номер задачи");
            }
        }

        scanner.close();
    }

    // метод для возврата дробной части
    public static void fraction(double x) {
        if (x == (int)x) {
            System.out.println("Введенное число - целое");
        } else {
            System.out.println("Дробная часть: " + (x - (int)x));
        }
    }

    // метод для преобразования символа в ASCII-код
    public static int charToAscii(char x) {
        return (int) x;
    }

    // метод для проверки на двузначность
    public static boolean is2Digits(int x) {
        return (x >= 10 && x <= 99) || (x <= -10 && x >= -99);
    }

    // метод для проверки вхождения числа в отрезок
    public static boolean isInRange(int a, int b, int num) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return num >= min && num <= max;
    }

    // метод для проверки равенства трех чисел
    public static boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    // метод для получения модуля числа
    public static int abs(int x) {
        return x < 0 ? -x : x;
    }

    // метод для проверки делимости на 3 или 5, но не 3 и 5
    public static boolean is35(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return false; // делится на оба
        }
        return x % 3 == 0 || x % 5 == 0;
    }

    // метод для нахождения максимума из трех чисел
    public static int max3(int x, int y, int z) {
        int max = x; // Предполагаем, что первое число максимальное
        if (y > max) max = y; // Проверяем второе число
        if (z > max) max = z; // Проверяем третье число
        return max;
    }

    // Метод для вычисления суммы двух чисел с проверкой диапазона
    public static int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }

    // Метод для определения дня недели по числу
    public static String day(int x) {
        switch (x) {
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "это не день недели";
        }
    }

    // Метод для вывода строки с числами от 0 до x
    public static String listNums(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    // Метод для вывода строки с четными числами от 0 до x
    public static String chet(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i += 2) { // Увеличиваем i на 2, чтобы взять только четные
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    // Метод для нахождения длины числа
    public static int numLen(long x) {
        int length = 0;
        do {
            x /= 10;
            length++;
        } while (x != 0);
        return length;
    }

    // Метод для вывода квадрата размером x на x
    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println(); // Переход на новую строку
        }
    }

    // Метод для вывода правого треугольника высотой x
    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" "); // Печатаем пробелы для выравнивания справа
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println(); // Переход на новую строку
        }
    }
}
