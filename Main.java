import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);

        while (true) { // выбор задачи
            System.out.println("\nВыберите задачу (1 - 20):");
            System.out.println("1: Дробная часть");
            System.out.println("2: Букву в число");
            System.out.println("3: Двузначное");
            System.out.println("4: Диапазон");
            System.out.println("5: Равенство");
            System.out.println("6: Модуль числа");
            System.out.println("7: Тридцать пять");
            System.out.println("8: Тройной максимум");
            System.out.println("9: Двойная сумма");
            System.out.println("10: День недели");
            System.out.println("11: Числа подряд");
            System.out.println("12: Четные числа");
            System.out.println("13: Длина числа");
            System.out.println("14: Квадрат");
            System.out.println("15: Правый треугольник");
            System.out.println("16: Поиск первого значения");
            System.out.println("17: Поиск максимального по модулю");
            System.out.println("18: Добавление массива в массив");
            System.out.println("19: Возвратный реверс");
            System.out.println("20: Все вхождения");
            System.out.println("0: Выход");
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
                        m.fraction(x);
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
                        System.out.println("Код символа: " + m.charToAscii(ch)); // Получаем ASCII-код
                    } else {
                        System.out.println("Необходимо ввести символ от 0 до 9 включительно");
                    }
                    break;
                case 3:
                    // двузначное
                    System.out.print("Введите число для проверки: ");
                    if (scanner.hasNextInt()) {
                        int num = scanner.nextInt();
                        System.out.println("Число двузначное: " + m.is2Digits(num));
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
                    System.out.println("Точка находится в диапазоне: " + m.isInRange(a, b, checkNum));
                    break;
                case 5:
                    // равенство
                    System.out.print("Введите три числа (a, b, c): ");
                    int a1 = scanner.nextInt();
                    int b1 = scanner.nextInt();
                    int c1 = scanner.nextInt();
                    System.out.println("Все равны: " + m.isEqual(a1, b1, c1));
                    break;
                case 6:
                    // модуль числа
                    System.out.print("Введите число для нахождения его модуля: ");
                    int x1 = scanner.nextInt();
                    System.out.println("Модуль: " + m.abs(x1));
                    break;
                case 7:
                    // тридцать пять
                    System.out.print("Введите число (проверка на делимость 3 или 5): ");
                    int y = scanner.nextInt();
                    System.out.println("Делится на 3 или 5, но не на оба: " + m.is35(y));
                    break;
                case 8:
                    // тройной максимум
                    System.out.print("Введите три числа: ");
                    int x2 = scanner.nextInt();
                    int y2 = scanner.nextInt();
                    int z2 = scanner.nextInt();
                    System.out.println("Максимум из введенных чисел: " + m.max3(x2, y2, z2));
                    break;
                case 9:
                    // двойная сумма
                    System.out.print("Введите два числа: ");
                    int d = scanner.nextInt();
                    int e = scanner.nextInt();
                    System.out.println("Сумма чисел: " + m.sum2(d, e));
                    break;
                case 10:
                    // день недели
                    System.out.print("Введите число от 1 до 7 (день недели): ");
                    int dayNumber = scanner.nextInt();
                    System.out.println("День недели: " + m.day(dayNumber));
                    break;
                // числа подряд
                case 11:
                    System.out.print("Введите число: ");
                    int x = scanner.nextInt();
                    System.out.println("Числа подряд: " + m.listNums(x));
                    break;
                // четные числа
                case 12:
                    System.out.print("Введите число : ");
                    int y1 = scanner.nextInt();
                    System.out.println("Четные числа в строке: " + m.chet(y1));
                    break;
                case 13:
                    // длина числа
                    System.out.print("Введите число: ");
                    long num = scanner.nextLong();
                    System.out.println("Длина числа: " + m.numLen(num));
                    break;
                case 14:
                    // квадрат
                    System.out.print("Введите число (размеры квадрата): ");
                    int squareSize = scanner.nextInt();
                    m.square(squareSize);
                    break;
                case 15:
                    // правый треугольник
                    System.out.print("Введите число (высоту треугольника): ");
                    int triangleHeight = scanner.nextInt();
                    m.rightTriangle(triangleHeight);
                    break;
                case 16: {
                    System.out.println("Введите длину массива:"); // для заполнения массива
                    int n = scanner.nextInt();
                    int[] arr = new int[n];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    // поиск первого значения
                    System.out.print("Введите число для поиска первого вхождения: ");
                    int x3 = scanner.nextInt();
                    System.out.println("Индекс первого вхождения: " + m.findFirst(arr, x3));
                    break;
                }
                case 17: {
                    System.out.println("Введите длину массива:");
                    int n = scanner.nextInt();
                    int[] arr = new int[n];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    // поиск максимального
                    System.out.println("Максимальное по модулю значение: " + m.maxAbs(arr));
                    break;
                }
                case 18: {
                    System.out.println("Введите длину массива:");
                    int n = scanner.nextInt();
                    int[] arr = new int[n];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    // добавление массива в массив
                    System.out.println("Введите длину вставляемого массива:");
                    int l = scanner.nextInt();
                    int[] ins = new int[l];
                    System.out.println("Введите элементы вставляемого массива:");
                    for (int i = 0; i < l; i++) {
                        ins[i] = scanner.nextInt();
                    }
                    System.out.print("Введите позицию для вставки: ");
                    int pos = scanner.nextInt();
                    System.out.println("Новый массив: " + Arrays.toString(m.add(arr, ins, pos)));
                    break;
                }
                case 19: {
                    System.out.println("Введите длину массива:");
                    int n = scanner.nextInt();
                    int[] arr = new int[n];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    // возвратный реверс

                    System.out.println("Новый массив: " + Arrays.toString(m.reverseBack(arr)));

                    break;
                }
                case 20: {
                    System.out.println("Введите длину массива:");
                    int n = scanner.nextInt();
                    int[] arr = new int[n];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    // все вхождения
                    System.out.print("Введите число для поиска всех вхождений: ");
                    int y3 = scanner.nextInt();
                    System.out.println("Все вхождения числа: " + Arrays.toString(m.findAll(arr, y3)));
                }
                default:
                    System.out.println("Ошибка: введите верный номер задачи");
            }
        }

        scanner.close();
    }

    // метод для возврата дробной части
    public void fraction(double x) {
        if (x == (int) x) {
            System.out.println("Введенное число - целое");
        } else {
            System.out.println("Дробная часть: " + (x - (int) x));
        }
    }

    // метод для преобразования символа в ASCII-код
    public int charToAscii(char x) {
        return (int) x;
    }

    // метод для проверки на двузначность
    public boolean is2Digits(int x) {
        return (x >= 10 && x <= 99) || (x <= -10 && x >= -99);
    }

    // метод для проверки вхождения числа в отрезок
    public boolean isInRange(int a, int b, int num) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return num >= min && num <= max;
    }

    // метод для проверки равенства трех чисел
    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    // метод для получения модуля числа
    public int abs(int x) {
        return x < 0 ? -x : x;
    }

    // метод для проверки делимости на 3 или 5, но не 3 и 5
    public boolean is35(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return false; // делится на оба
        }
        return x % 3 == 0 || x % 5 == 0;
    }

    // метод для нахождения максимума из трех чисел
    public int max3(int x, int y, int z) {
        int max = x; // Предполагаем, что первое число максимальное
        if (y > max) max = y; // Проверяем второе число
        if (z > max) max = z; // Проверяем третье число
        return max;
    }

    // Метод для вычисления суммы двух чисел с проверкой диапазона
    public int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }

    // Метод для определения дня недели по числу
    public String day(int x) {
        switch (x) {
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default:
                return "это не день недели";
        }
    }

    // метод для вывода строки с числами от 0 до x
    public String listNums(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    // метод для вывода строки с четными числами от 0 до x
    public String chet(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    // метод для нахождения длины числа
    public int numLen(long x) {
        int length = 0;
        do {
            x /= 10;
            length++;
        } while (x != 0);
        return length;
    }

    // метод для вывода квадрата размером x на x
    public static void square(int x) {
        if (x <= 0) {
            throw new IllegalArgumentException("x должно быть положительным");
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // метод для вывода правого треугольника высотой x
    public void rightTriangle(int x) {
        if (x <= 0) {
            throw new IllegalArgumentException("x должно быть положительным");
        }
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // метод поиска первого вхождения числа x в массиве
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // метод поиска максимального по модулю значения
    public int maxAbs(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(max)) {
                max = arr[i];
            }
        }
        return max;
    }

    // метод добавления массива ins в массив arr на позицию pos
    public int[] add(int[] arr, int[] ins, int pos) {
        if (arr == null || ins == null) {
            throw new IllegalArgumentException("Массивы не должны быть null");
        }
        if (pos < 0 || pos > arr.length) {
            throw new IndexOutOfBoundsException("Некорректная позиция вставки");
        }
        int[] result = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, result, 0, pos);
        System.arraycopy(ins, 0, result, pos, ins.length);
        System.arraycopy(arr, pos, result, pos + ins.length, arr.length - pos);
        return result;
    }

    // метод, который возвращает массив задом наперед
    public int[] reverseBack(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // метод, возвращающий все индексы вхождений числа x
    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int val : arr) {
            if (val == x) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index++] = i;
            }
        }
        return result;
    }
}
