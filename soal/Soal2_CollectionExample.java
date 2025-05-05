// Soal 2 - Contoh program menggunakan ArrayList dan ArrayDeque

import java.util.ArrayList;
import java.util.ArrayDeque;

public class CollectionExample {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Andi");
        mahasiswaList.add("Budi");
        mahasiswaList.add("Cici");

        System.out.println("Isi ArrayList:");
        for (String mhs : mahasiswaList) {
            System.out.println(mhs);
        }

        // ArrayDeque
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Pertama");
        deque.addFirst("Kedua");
        deque.addLast("Ketiga");

        System.out.println("\nIsi ArrayDeque:");
        for (String item : deque) {
            System.out.println(item);
        }
    }
}
