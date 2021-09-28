import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        HashMap<String, TestSubject> hashMap = new HashMap<>();
        String selectedString = "";

        for (int i = 0; i < 100; i++) {

            TestSubject subject = new TestSubject(i);
            hashMap.put(subject.getId(), subject);
            if (i == 27) {
                selectedString = subject.getId();
            }

        }

        System.out.println(hashMap.get(selectedString).getId());
        if (hashMap.get(selectedString).getId().equals(selectedString)) {
            System.out.println("TRUE");
        } else {
            System.out.println("False");
        }

        TreeMap<Integer, TestSubject> subjectTreeMap = new TreeMap<>(new TestComparator());

        for (int i = 0; i < 100; i++) {

            TestSubject subject = new TestSubject(i);
            subjectTreeMap.put(subject.getOrdinal(), subject);
        }
        System.out.println(subjectTreeMap.lastEntry());


        Parser parser = new Parser();
        ArrayList<String> list = null;

        File file = new File("voyna.txt");

        try {
            list = parser.parse(file);
        } catch (IOException e) {
            e.printStackTrace();
        }


        assert list != null;
  //      list.forEach(System.out::println);


        //таблица умножения вариант 1
        for (int i = 1; i <= 10; i++) {

            for (int y = 1; y <= 10; y++) {
                System.out.print(i * y + " ");
            }
            System.out.println();
        }

        //таблица умножения вариант 2
        IntStream.rangeClosed(1, 10).forEach(i -> {
            IntStream.rangeClosed(1, 10)
                    .forEach(j -> System.out.print(i * j + " "));
            System.out.println();
        });
        String strsearch = "страда";
/*       // String strnext = String.valueOf(list) + "";


        if (0 == 1) {
            System.out.println("ok");
        } else {
            //System.out.println(strLowecase.contains(strsearch));
            System.out.println(strsearch.regionMatches(1, strnext, 1, 3));
        }

*/
        /*


Метод принимает следующие параметры:

ignoreCase: надо ли игнорировать регистр символов при сравнении. Если значение true, регистр игнорируется

toffset: начальный индекс в вызывающей строке, с которого начнется сравнение

other: строка, с которой сравнивается вызывающая

oofset: начальный индекс в сравниваемой строке, с которого начнется сравнение

len: количество сравниваемых символов в обеих строках

  System.out.println(strLowecase.getChars(1,5,strLowecase2,strnext))
        Если надо извлечь сразу группу символов или подстроку, то можно использовать метод getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin). Он принимает следующие параметры:

srcBegin: индекс в строке, с которого начинается извлечение символов

srcEnd: индекс в строке, до которого идет извлечение символов

dst: массив символов, в который будут извлекаться символы

dstBegin: индекс в массиве dst, с которого надо добавлять извлеченные из строки символы
         */
    }

}
