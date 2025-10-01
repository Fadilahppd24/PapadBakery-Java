package com.papadbakery.model;

public class Produk {
    private String nama;
    private int harga;
    private int stok;

    public Produk(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() { return nama; }
    public int getHarga() { return harga; }
    public int getStok() { return stok; }

    // Method dengan throws
    public void kurangiStok(int jumlah) throws Exception {
        if (jumlah > stok) {
            // Melempar exception
            throw new Exception("Stok tidak cukup untuk " + nama);
        }
        stok -= jumlah;
    }
}
