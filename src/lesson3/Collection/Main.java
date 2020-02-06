package lesson3.Collection;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        part1();
        part2();
    }

    private static void part1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "test1",
                "test2",
                "test3",
                "test4",
                "test5",
                "test6",
                "test7",
                "test8",
                "test9",
                "test10",
                "test11",
                "test12",
                "test13",
                "test14",
                "test15",
                "test2",
                "test5",
                "test8",
                "test14"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void part2() {
        Phonebook phonebook = new Phonebook();

        phonebook.add("test1", "8999123321");
        phonebook.add("test2", "8912155326");
        phonebook.add("test2", "8917155552");
        phonebook.add("test4", "8913455672");
        phonebook.add("test4", "899999999");
        phonebook.add("test6", "899111111");
        phonebook.add("test7", "89923231999");
        phonebook.add("test7", "8888123113");
        phonebook.add("test9", "8324325234");

        System.out.println(phonebook.get("test2"));
        System.out.println(phonebook.get("test4"));
        System.out.println(phonebook.get("test7"));
        System.out.println(phonebook.get("test9"));
    }
}

class Phonebook {
    private Map<String, List<String>> phonebook = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (phonebook.containsKey(surname)) {
            phone_number_list = phonebook.get(surname);
            phone_number_list.add(phone_number);
            phonebook.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            phonebook.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return phonebook.get(surname);
    }




}
