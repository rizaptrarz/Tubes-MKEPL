/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesmkepl;

/**
 *
 * @author LENOVO
 */
public class CS_PLN implements InfoService {

    public CS_PLN() {
    }

    @Override
    public void daftarInformasi() {
        System.out.println("==================Daftar Informasi==================");
        System.out.println("1. PLN Jakarta");
        System.out.println("2. PLN Bandung");
        System.out.println("3. PLN Yogyakarta");
        System.out.println("4. PLN Semarang");
        System.out.println("5. Kembali ke menu utama");
        System.out.println("====================================================");
    }

    private void printJawaban1() {
        System.out.println("====================================================");
        System.out.println("Berikut adalah beberapa lokasi PLN di Jakarta beserta nomor teleponnya:");
        System.out.println("1. PLN Area Jakarta Pusat: Jl. Banteng Timur No.1, Gambir, Jakarta Pusat. (Telp: 021-3456789)");
        System.out.println("2. PLN Area Jakarta Selatan: Jl. Warung Buncit Raya No.123, Jakarta Selatan. (Telp: 021-7654321)");
        System.out.println("3. PLN Area Jakarta Barat: Jl. Tomang Raya No.39, Jakarta Barat. (Telp: 021-9988776)");
        System.out.println("4. PLN Area Jakarta Timur: Jl. DI Panjaitan Kav. 10, Jakarta Timur. (Telp: 021-5566778)");
        System.out.println("5. PLN Area Jakarta Utara: Jl. Plumpang Semper No.1, Jakarta Utara. (Telp: 021-3344556)");
        System.out.println("====================================================");

    }

    private void printJawaban2() {
        System.out.println("====================================================");
        System.out.println("Berikut adalah beberapa lokasi PLN di Bandung beserta nomor teleponnya:");
        System.out.println("1. PLN Unit Pelaksana Pelayanan Pelanggan (UP3) Bandung: Jl. Cikapundung No.12, Bandung. (Telp: 022-1234567)");
        System.out.println("2. PLN Unit Layanan Pelanggan (ULP) Bandung Timur: Jl. Raya Ujungberung No.15, Bandung. (Telp: 022-7654321)");
        System.out.println("3. PLN Unit Layanan Pelanggan (ULP) Bandung Barat: Jl. Cipedes Tengah No.33, Bandung. (Telp: 022-3344556)");
        System.out.println("4. PLN Distribusi Jawa Barat: Jl. Asia Afrika No.63, Bandung. (Telp: 022-9988776)");
        System.out.println("====================================================");

    }

    private void printJawaban3() {
       System.out.println("====================================================");
        System.out.println("Berikut adalah beberapa lokasi PLN di Yogyakarta beserta nomor teleponnya:");
        System.out.println("1. PLN UP3 Yogyakarta: Jl. Mangkubumi No.18, Yogyakarta. (Telp: 0274-123456)");
        System.out.println("2. PLN ULP Kotagede: Jl. Pramuka No.123, Kotagede, Yogyakarta. (Telp: 0274-654321)");
        System.out.println("3. PLN ULP Sleman: Jl. Magelang Km.9, Sleman, Yogyakarta. (Telp: 0274-987654)");
        System.out.println("4. PLN ULP Bantul: Jl. Bantul No.15, Bantul, Yogyakarta. (Telp: 0274-456789)");
        System.out.println("====================================================");

    }

    private void printJawaban4() {
        System.out.println("====================================================");
        System.out.println("Berikut adalah beberapa lokasi PLN di Semarang beserta nomor teleponnya:");
        System.out.println("1. PLN UP3 Semarang: Jl. Pemuda No.92-94, Semarang. (Telp: 024-1234567)");
        System.out.println("2. PLN ULP Tlogosari: Jl. Tlogosari Raya No.8, Semarang. (Telp: 024-7654321)");
        System.out.println("3. PLN ULP Banyumanik: Jl. Setiabudi No.123, Banyumanik, Semarang. (Telp: 024-9876543)");
        System.out.println("4. PLN ULP Pedurungan: Jl. Pedurungan Tengah No.45, Semarang. (Telp: 024-4567890)");
        System.out.println("====================================================");

    }

    private void printJawaban5() {
        System.out.println("====================================================");
        System.out.println("Anda memilih kembali ke menu utama.");
        System.out.println("====================================================");
    }

    @Override
    public void printData(int input) {
        try {
            switch (input) {
                case 1:
                    printJawaban1();
                    break;
                case 2:
                    printJawaban2();
                    break;
                case 3:
                    printJawaban3();
                    break;
                case 4:
                    printJawaban4();
                    break;
                case 5:
                    printJawaban5();
                    break;
                default:
                    throw new IllegalArgumentException("Harap Masukkan Nomor Menu yang Benar.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("[Error] " + e.getMessage());
            daftarInformasi();
        }
    }
}
