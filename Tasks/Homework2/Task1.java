package Homework2;

public class Task1 {
    public static void main(String[] args) {
        String str = "Основание -12б степень 7, результат =";
        System.out.println(FindVars(str));
    }

    public static String FindVars(String my_string) {
        my_string = my_string.replace(",", "");
        String[] line = my_string.split(" ");
        double result = 0;
        for (int i = 0; i < line.length; i++) {
            try {
                int base = Integer.parseInt(line[i]);
                int power = Integer.parseInt(line[i]);
                result = Math.pow(base, power);
                break;
            } catch (NumberFormatException e) {
                continue;
            }

        }

        return my_string + " " + String.valueOf(result);
    }
}