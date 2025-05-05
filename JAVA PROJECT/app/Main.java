package app;

import model.Mahasiswa;
import model.Dosen;
import util.DataStore;

public class Main {
    public static void main(String[] args) {
        Mahasiswa<String> m1 = new Mahasiswa<>("Rina", "M001", "TI-1A");
        Dosen d1 = new Dosen("Pak Budi", "D100");

        m1.register();
        m1.displayInfo();
        d1.displayInfo();

        DataStore.addPerson(m1);
        DataStore.addPerson(d1);

        DataStore.showLog();
    }
}
