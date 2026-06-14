/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesmkepl;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Chatbot {
    Scanner sc = new Scanner(System.in);
    private String[] jawaban;
    private String[] pertanyaan;

    public Chatbot() {
        this.jawaban = new String[]{
                "1. Buka menu : \"\n2. Beli Token Listrik\" \n3. pilih nominal \n4. lakukan pembayaran \n5. sistem akan mengirimkan kode token.",
                "1. Periksa kode token dan meteran listrik. \n2. Jika tetap gagal, hubungi layanan pelanggan di aplikasi.",
                "1. Gunakan menu \"Statistik\" \n2. untuk melihat data real-time sisa daya listrik Anda.",
                "Mendukung transfer bank, e-wallet, dan gerai ritel untuk pembayaran token.",
                "Notifikasi otomatis muncul jika konsumsi mendekati batas yang ditentukan.",
                "1. Gunakan fitur \"Kalkulator Biaya Listrik\" \n2. di menu \"Statistik\" untuk menghitung biaya.",
                "1. Gunakan opsi \"Lupa Kata Sandi\" \n2. di halaman login untuk mereset kata sandi.",
                "Saat ini hanya mendukung token prabayar, bukan tagihan reguler.",
                "Data historis dapat diakses melalui menu \"Statistik\" di aplikasi.",
                "Ya, tersedia gamifikasi dan tips hemat energi yang disesuaikan untuk pengguna.",
                "Pastikan koneksi internet stabil atau perbarui aplikasi ke versi terbaru.",
                "Tidak, aplikasi membutuhkan koneksi internet untuk bekerja.",
                "1. Buka menu \"Statistik\" \n2. untuk melihat rincian konsumsi energi Anda.",
                "Saat ini hanya mendukung satu meteran per akun pengguna.",
                "Notifikasi membantu memantau konsumsi energi dan mengingatkan pembelian token.",
                "1. Gunakan menu \"Daftar,\" \n2. isi data pribadi seperti nama, email, dan kata sandi.",
                "Ya, tersedia untuk Android dan iOS melalui Google Play Store dan App Store.",
                "Data dilindungi dengan enkripsi dan autentikasi untuk menjaga keamanan.",
                "Fitur ini memperkirakan masa penggunaan listrik berdasarkan konsumsi saat ini.",
                "Ya, layanan pelanggan tersedia melalui menu \"Layanan Pengguna\" di aplikasi."
        };

        this.pertanyaan = new String[]{
                "Bagaimana cara membeli token listrik menggunakan aplikasi WattGuard?",
                "Apa yang harus dilakukan jika token listrik tidak dapat digunakan?",
                "Bagaimana cara mengetahui sisa daya listrik yang tersedia?",
                "Apa saja metode pembayaran yang didukung oleh aplikasi WattGuard?",
                "Bagaimana cara menerima notifikasi batas penggunaan daya listrik?",
                "Bagaimana cara memperkirakan biaya penggunaan listrik bulanan?",
                "Apa langkah yang harus dilakukan jika saya lupa kata sandi akun WattGuard?",
                "Apakah aplikasi WattGuard mendukung pembayaran tagihan listrik reguler?",
                "Bagaimana cara mengakses data historis penggunaan listrik?",
                "Apakah aplikasi ini menyediakan fitur hemat energi?",
                "Apa yang harus dilakukan jika aplikasi WattGuard tidak dapat diakses?",
                "Apakah aplikasi WattGuard dapat digunakan tanpa koneksi internet?",
                "Bagaimana cara mendapatkan informasi penggunaan listrik secara detail?",
                "Apakah aplikasi WattGuard mendukung lebih dari satu meteran listrik?",
                "Apa manfaat dari fitur notifikasi aplikasi WattGuard?",
                "Bagaimana cara mendaftar akun di aplikasi WattGuard?",
                "Apakah aplikasi WattGuard tersedia untuk perangkat iOS?",
                "Bagaimana aplikasi WattGuard memastikan data pengguna tetap aman?",
                "Apa yang dimaksud dengan fitur \"Cek Masa Pakai\"?",
                "Apakah aplikasi WattGuard memiliki layanan pelanggan?"
        };
    }

    public void displayPertanyaan() {
        System.out.println("====================================");
        System.out.println("       SELAMAT DATANG DI            ");
        System.out.println("       LAYANAN TOKEN LISTRIK        ");
        System.out.println("====================================");
        System.out.println("   Pilih Pertanyaan yang Anda Butuhkan:");
        System.out.println("------------------------------------");

        for (int i = 0; i < pertanyaan.length; i++) {
            System.out.println((i + 1) + ". " + pertanyaan[i]);
        }

        System.out.println("------------------------------------");
        System.out.print("Pilih nomor pertanyaan (1-" + pertanyaan.length + "): ");
        int pilih = sc.nextInt();

        System.out.println("------------------------------------");
        switch (pilih) {
            case 1:
                System.out.println("Jawaban:");
                System.out.println(jawaban[0]);
                break;
            case 2:
                System.out.println("Jawaban:");
                System.out.println(jawaban[1]);
                break;
            case 3:
                System.out.println("Jawaban:");
                System.out.println(jawaban[2]);
                break;
            case 4:
                System.out.println("Jawaban:");
                System.out.println(jawaban[3]);
                break;
            case 5:
                System.out.println("Jawaban:");
                System.out.println(jawaban[4]);
                break;
            case 6:
                System.out.println("Jawaban:");
                System.out.println(jawaban[5]);
                break;
            case 7:
                System.out.println("Jawaban:");
                System.out.println(jawaban[6]);
                break;
            case 8:
                System.out.println("Jawaban:");
                System.out.println(jawaban[7]);
                break;
            case 9:
                System.out.println("Jawaban:");
                System.out.println(jawaban[8]);
                break;
            case 10:
                System.out.println("Jawaban:");
                System.out.println(jawaban[9]);
                break;
            case 11:
                System.out.println("Jawaban:");
                System.out.println(jawaban[10]);
                break;
            case 12:
                System.out.println("Jawaban:");
                System.out.println(jawaban[11]);
                break;
            case 13:
                System.out.println("Jawaban:");
                System.out.println(jawaban[12]);
                break;
            case 14:
                System.out.println("Jawaban:");
                System.out.println(jawaban[13]);
                break;
            case 15:
                System.out.println("Jawaban:");
                System.out.println(jawaban[14]);
                break;
            case 16:
                System.out.println("Jawaban:");
                System.out.println(jawaban[15]);
                break;
            case 17:
                System.out.println("Jawaban:");
                System.out.println(jawaban[16]);
                break;
            case 18:
                System.out.println("Jawaban:");
                System.out.println(jawaban[17]);
                break;
            case 19:
                System.out.println("Jawaban:");
                System.out.println(jawaban[18]);
                break;
            case 20:
                System.out.println("Jawaban:");
                System.out.println(jawaban[19]);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
        System.out.println("------------------------------------");
    }
}
