public class Test {

    /**
     * Этот метод начинает исполнение программы
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        // переменные
        /*
        здесь
        многострочный комментарий
         */
        /**
         * Символы конца строки
         * Windows - /r/n
         * Linux - /n
         * MacOS - /n/r
         */


        String hello = "Hello";
        String world;
        world = ", world";
        //System.out.println(hello + world);

        int number1 = 40;
        int number2 = 42;
        //System.out.println( hello + (number1 + number2));

        // max values
        long longNumber = Long.MAX_VALUE;
        long longMin = Long.MIN_VALUE;

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        /*System.out.println(
                String.format(
                        "Min Long:%s,\n Max Long: %s,\n min int:%s,\n max int:%s",
                             longMin,      longNumber,         min,           max
                                        ));*/

        String manualConcat = "Min Long:" + longMin + ","
                + "\n Max Long: " + longNumber + "," + ""
                + "\n min int:" + min + ","
                + "\n max int:" + max;

        float fl = Float.MIN_VALUE;
        double d1 = Double.MIN_VALUE;

        //System.out.println(fl + " " + longMin + " " + d1);

        testTypeConversion();


        int val = 257;

        // потеря значения
        //System.out.println((byte)val);


        boolean boolValue = false;
        boolean trueValue = true;

        int v1 = 2;
        int v2 = 3;
        int sum = sum(v1, v2);
        //System.out.println(sum);

        // операции сравнения < > <= >= == !=
        boolean comparisionResult = 2 < 5;
        if (comparisionResult) {
         //   System.out.println("Математика работает");
        }

        String someString = "ABCDFGHIJKLMNOPQRST";

        /*if (someString.length() > 10) {
            System.out.println("ДЛинная строка");
        } else {
            System.out.println("Короткая строка:" + someString);
        }*/

        //students();

        System.out.println(sum(Integer.MAX_VALUE, 1));

    }

    private static void students() {
        String surname = "Ivanov";
        int mark = 5;
        String surname2 = "Petrov";
        int mark2 = 4;

       /* System.out.println(surname + ":" + mark);
        System.out.println(surname2 + ":" + mark2);*/

        String[] students = new String[5];
        students[0] = "Ivanov";
        students[1] = "Petrov";
        students[2] = "Sidorov";

        int[] marks = new int[5];
        marks[0] = 5;
        marks[1] = 4;
        marks[2] = 3;

        for (int i = 2;  ;  i--) {
            if (i >= 0) {
                System.out.println(students[i] + ":" + marks[i]);
            } else {

            }
        }
    }

    private static void testTypeConversion() {
        char ch = 'a';
        byte byt = 42;

        // преобразование типов
        //System.out.println( (int)ch ) ;
    }

    private static int sum(int val1, int val2) {
        return val1 + val2;
    }

}
