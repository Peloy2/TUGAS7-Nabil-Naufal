package util;

import java.util.ArrayList;
import java.util.ArrayDeque;
import model.Person;

public class DataStore {
    public static ArrayList<Person> dataPerson = new ArrayList<>();
    public static ArrayDeque<String> log = new ArrayDeque<>();

    public static void addPerson(Person p) {
        dataPerson.add(p);
        log.add("Added: " + p.getNama());
    }

    public static void showLog() {
        System.out.println("\nLog Aktivitas:");
        for (String l : log) {
            System.out.println(l);
        }
    }
}
