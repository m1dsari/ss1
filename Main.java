import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================================================================");
        System.out.println("                            ІНФОРМАЦІЯ ПРО ПРИМІТИВНІ ТИПИ ДАНИХ                         ");
        System.out.println("=========================================================================================");
        System.out.printf("%-10s | %-12s | %-30s | %-30s%n", "Тип", "Розмір (біт)", "Мін. значення", "Макс. значення");
        System.out.println("-----------------------------------------------------------------------------------------");

        // byte
        System.out.printf("%-10s | %-12d | %-30d | %-30d%n",
                "byte", Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);

        // short
        System.out.printf("%-10s | %-12d | %-30d | %-30d%n",
                "short", Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);

        // int
        System.out.printf("%-10s | %-12d | %-30d | %-30d%n",
                "int", Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);

        // long
        System.out.printf("%-10s | %-12d | %-30d | %-30d%n",
                "long", Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);

        // float
        System.out.printf("%-10s | %-12d | %-30s | %-30s%n",
                "float", Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);

        // double
        System.out.printf("%-10s | %-12d | %-30s | %-30s%n",
                "double", Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);

        // char (для краси замініть числові коди або виведіть їх через cast)
        System.out.printf("%-10s | %-12d | %-30d | %-30d%n",
                "char", Character.SIZE, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);

        // boolean (у boolean немає фіксованого розміру в бітах/байтах у JVM та мін/макс значень)
        System.out.printf("%-10s | %-12s | %-30s | %-30s%n",
                "boolean", "N/A", Boolean.FALSE.toString(), Boolean.TRUE.toString());

        System.out.println("=========================================================================================\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("ВВЕДЕННЯ ТА КОНВЕРТАЦІЯ ДАНИХ:");
        System.out.println("Заповніть значення для кожного типу даних.\n");

        try {
            // Byte
            System.out.print("Введіть значення типу byte (від -128 до 127): ");
            String inputByte = scanner.nextLine();
            byte parsedByte = Byte.parseByte(inputByte);
            System.out.println("Успішно перетворено в byte: " + parsedByte + "\n");

            // Short
            System.out.print("Введіть значення типу short: ");
            String inputShort = scanner.nextLine();
            short parsedShort = Short.parseShort(inputShort);
            System.out.println("Успішно перетворено в short: " + parsedShort + "\n");

            // Integer
            System.out.print("Введіть значення типу int: ");
            String inputInt = scanner.nextLine();
            int parsedInt = Integer.parseInt(inputInt);
            System.out.println("Успішно перетворено в int: " + parsedInt + "\n");

            // Long
            System.out.print("Введіть значення типу long: ");
            String inputLong = scanner.nextLine();
            long parsedLong = Long.parseLong(inputLong);
            System.out.println("Успішно перетворено в long: " + parsedLong + "\n");

            // Float
            System.out.print("Введіть значення типу float (наприклад, 3.14): ");
            String inputFloat = scanner.nextLine();
            float parsedFloat = Float.parseFloat(inputFloat);
            System.out.println("Успішно перетворено в float: " + parsedFloat + "\n");

            // Double
            System.out.print("Введіть значення типу double (наприклад, 2.71828): ");
            String inputDouble = scanner.nextLine();
            double parsedDouble = Double.parseDouble(inputDouble);
            System.out.println("Успішно перетворено в double: " + parsedDouble + "\n");

            // Boolean
            System.out.print("Введіть значення типу boolean (true/false): ");
            String inputBoolean = scanner.nextLine();
            boolean parsedBoolean = Boolean.parseBoolean(inputBoolean);
            System.out.println("Успішно перетворено в boolean: " + parsedBoolean + "\n");

            // Character
            System.out.print("Введіть один символ для char: ");
            String inputChar = scanner.nextLine();
            if (!inputChar.isEmpty()) {
                char parsedChar = inputChar.charAt(0);
                System.out.println("Успішно перетворено в char: '" + parsedChar + "'\n");
            } else {
                System.out.println("Ви нічого не ввели для char.\n");
            }

            System.out.println("Усі дані успішно зчитано та парсено!");

        } catch (NumberFormatException e) {
            System.err.println("\nПомилка: Введено некоректне значення або число виходить за межі діапазону типу даних!");
        } finally {
            scanner.close();
        }
    }
}