package model;

public class Dosen extends Person {

    public Dosen(String nama, String nidn) {
        super(nama, nidn);
    }

    @Override
    public void displayInfo() {
        System.out.println("Dosen: " + nama + ", NIDN: " + id);
    }
}
