import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, TestSubject> hashMap = new HashMap<>();
        String selectedString = "";

        for (int i = 0; i < 100; i++) {

            TestSubject subject = new TestSubject();
            hashMap.put(subject.getId(), subject);
            if (i == 27) {
                selectedString = subject.getId();
            }

        }

        System.out.println(hashMap.get(selectedString).getId());
    }


}
