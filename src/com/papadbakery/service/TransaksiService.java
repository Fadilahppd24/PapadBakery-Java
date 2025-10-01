package com.papadbakery.service;

import com.papadbakery.model.Produk;
import java.util.ArrayList;
import java.util.HashMap;

public class TransaksiService {
    private ArrayList<Produk> daftarProduk;
    private HashMap<String, Integer> keranjang;

    public TransaksiService(ArrayList<Produk> daftarProduk) {
        this.daftarProduk = daftarProduk;
        this.keranjang = new HashMap<>();
    }

    public void beliProduk(String namaProduk, int jumlah) {
        try {
            // Cari produk di daftar
            for (Produk p : daftarProduk) {
                if (p.getNama().equalsIgnoreCase(namaProduk)) {
                    p.kurangiStok(jumlah); // bisa lempar exception
                    keranjang.put(namaProduk, jumlah);
                    System.out.println("✅ Berhasil membeli " + jumlah + " " + namaProduk);
                    return;
                }
            }
            // Kalau produk tidak ketemu, lempar exception
            throw new Exception("Produk tidak ditemukan: " + namaProduk);

        } catch (Exception e) {
            System.out.println("❌ Terjadi error: " + e.getMessage());

        } finally {
            System.out.println("ℹ️ Transaksi selesai diproses.\n");
        }
    }
}
