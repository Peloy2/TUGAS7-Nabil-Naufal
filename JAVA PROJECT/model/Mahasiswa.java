package model;

import service.Registrable;

public class Mahasiswa<T> extends Person implements Registrable {
    private T kelas;

    public Mahasiswa(String nama, String id, T kelas) {
        super(nama, id);
        this.kelas = kelas;
    }

    public T getKelas() {
        return kelas;
    }

    @Override
    public void register() {
        System.out.println(nama + " berhasil registrasi sebagai mahasiswa.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Mahasiswa: " + nama + ", NIM: " + id + ", Kelas: " + kelas);
    }
}
