package com.company;

class Makanan {
    // private, hanya bisa di akses di dalam class Makanan
    private String nama;
    private String harga;

    // Constructor
    Makanan(String nama, String harga){
        this.nama = nama;
        this.harga = harga;
    }

    // Method
    void dataMakanan(){
        System.out.println(" \n ------ Data Makanan ------ ");
        System.out.println(" Nama          : " + this.nama);
        System.out.println(" Harga         : " + this.harga);
    }

    // Set Harga (setter)
    public void setMakanan(String harga){
        this.harga = harga;
    }

    // Akses Harga (getter)
    public String getHarga(){
        return this.harga;
    }

}

public class Main {

    public static void main(String[] args) {
    Makanan Makanan1 = new Makanan("Seblak", "Rp15.000");
    Makanan1.dataMakanan();

    // Mengubah
    Makanan1.setMakanan("Rp20.000");
    Makanan1.dataMakanan();

    // Mengakses
    System.out.println("\nHarga :");
    System.out.println(Makanan1.getHarga());

    }
}