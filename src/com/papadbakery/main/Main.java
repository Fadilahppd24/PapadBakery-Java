package com.papadbakery.main;

import com.papadbakery.model.Produk;
import com.papadbakery.service.TransaksiService;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat daftar produk bakery
        ArrayList<Produk> daftarProduk = new ArrayList<>();
        daftarProduk.add(new Produk("Roti Tawar", 15000, 10));
        daftarProduk.add(new Produk("Donat", 5000, 20));
        daftarProduk.add(new Produk("Croissant", 20000, 5));

        // Membuat layanan transaksi
        TransaksiService transaksi = new TransaksiService(daftarProduk);

        // Contoh transaksi
        transaksi.beliProduk("Roti Tawar", 2);   // sukses
        transaksi.beliProduk("Donat", 25);       // stok habis → exception
        transaksi.beliProduk("Bolu", 1);         // produk tidak ditemukan
    }
}
