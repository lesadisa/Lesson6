import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Parser buffParse = new ParserViaBufferedReader();
        var file = new File("voyna.txt");

        ArrayList<String> list = buffParse.parse(file);

        list.forEach(System.out::println);
        System.out.println("======");
        System.out.println(list.size());













 /*        //таблица умножения вариант 1
        System.out.println("Таблица умножения вариант 1");
        for (int i = 1; i <= 10; i++) {

            for (int y = 1; y <= 10; y++) {
                System.out.print(i * y + " ");
            }
            System.out.println();
        }

        //таблица умножения вариант 2
        System.out.println("Таблица умножения вариант 2");
        IntStream.rangeClosed(1, 10).forEach(i -> {
            IntStream.rangeClosed(1, 10)
                    .forEach(j -> System.out.print(i * j + " "));
            System.out.println();
        });

    // поиск количеств вхождения
        System.out.println("Поиск количеств вхождения без класса Scanner");
        String strsearch = "страда";
        String[] strtext = String.valueOf(list).split("\\s");
        int z = 0;
        for (String s : strtext) {
            if (s.contains(strsearch)) {
                //   System.out.println(s.contains(strsearch) + " " + s);
                z = z + 1;
            }
        }
        System.out.println(z);  */


    }
}

