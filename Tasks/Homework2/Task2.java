package Homework2;

public class Task2 {
    public static void main(String[] args) {
        String my_string = """
                Плавание. Вид спорта или спортивная дисциплина, 
                заключающаяся в преодолении вплавь за наименьшее 
                время различных дистанций. При этом в подводном 
                положении по действующим ныне правилам разрешается 
                проплыть не более 15 м после старта или поворота; 
                скоростные виды подводного плавания относятся не к плаванию, 
                а к подводному спорту.""";

        double begin = System.nanoTime();
        double begin1 = System.currentTimeMillis();

        String search = "небесные";
        System.out.println(my_string);

        System.out.println("\n" + my_string.replace(search, "красивые"));
        double end = System.nanoTime();
        double end1 = System.currentTimeMillis();

        System.out.println("\n Время работы = " + (end - begin) + " наносекунд");
        System.out.println(" Время работы = " + (end1 - begin1) + " милисекунд");

        begin = System.nanoTime();
        begin1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(my_string);
        while (sb.indexOf(search) > 0) {
            sb.replace(sb.indexOf(search), sb.indexOf(search) + search.length(), "красивые");
        }
        System.out.println("\n" + sb);

        end = System.nanoTime();
        end1 = System.currentTimeMillis();
        System.out.println("\n Время работы = " + (end - begin) + " наносекунд");
        System.out.println(" Время работы = " + (end1 - begin1) + " милисекунд");
    }
}