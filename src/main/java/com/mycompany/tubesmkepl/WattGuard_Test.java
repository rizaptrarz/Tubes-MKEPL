/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tubesmkepl;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.time.LocalDate;
import java.util.Scanner;

public class WattGuard_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> userMap = new HashMap<>();
        userMap.put("user123", "mamasayangaku");
        userMap.put("user", "user");
        userMap.put("pengguna", "pengguna");

        Chatbot cbt = new Chatbot();
        List<InfoService> infoServices = new ArrayList<>();
        infoServices.add(new CS_PLN());
        infoServices.add(new Informasi());


        Token.addToken(1, 1111111111L, 13.5);
        Token.addToken(1, 2222222222L, 35.0);
        Token.addToken(1, 3333333333L, 75.0);

        List<RiwayatBeli> riwayatPembelian = new ArrayList<>();

        if (!Login.prosesLogin(userMap)) {
            System.out.println("Keluar dari aplikasi. Terima kasih.");
            return;
        }

        while (true) {
            try {
                System.out.println("\n- - - - MENU UTAMA - - - -");
                System.out.println("1. Layanan Pengguna");
                System.out.println("2. FAQ");
                System.out.println("3. Isi Token");
                System.out.println("4. Riwayat Pembelian");
                System.out.println("5. Customer Service PLN");
                System.out.println("6. Statistik Penggunaan Token");
                System.out.println("0. Keluar");

                System.out.print("Pilih (0-6): ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Anda memilih Layanan Pengguna.");
                        cbt.displayPertanyaan();
                        break;
                    case 2:
                        System.out.println("Anda memilih FAQ.");
                        InfoService faqService = infoServices.get(1); 
                        faqService.daftarInformasi();

                        System.out.print("Pilih nomor informasi (1-5): ");
                        int infoChoice = scanner.nextInt();

                        faqService.printData(infoChoice);
                        break;
                    case 3:
                        String idTagihan;

                        System.out.println("= = = = = = = = = = = = = = = = = = = =");
                        System.out.println("\n- - - - LIST TOKEN DAN HARGA - - - -");
                        List<Token> tokens = Token.getTokenList();
                        for (int i = 0; i < tokens.size(); i++) {
                            System.out.println((i + 1) + ". " + tokens.get(i).toStringWithoutNomorToken());
                        }

                        System.out.println("\n- - - - METODE PEMBAYARAN - - - -");
                        String[] metodePembayaran = Token.getMetodePembayaran();
                        for (int i = 0; i < metodePembayaran.length; i++) {
                            System.out.println((i + 1) + ". " + metodePembayaran[i]);
                        }

                        System.out.print("\nPilih nomor produk token: ");
                        int tokenChoice = scanner.nextInt();
                        scanner.nextLine(); 
                        if (tokenChoice < 1 || tokenChoice > tokens.size()) {
                            System.out.println("Pilihan token tidak valid.");
                            return;
                        }

                        System.out.print("Pilih nomor metode pembayaran: ");
                        int metodeChoice = scanner.nextInt();
                        scanner.nextLine(); 
                        if (metodeChoice < 1 || metodeChoice > metodePembayaran.length) {
                            System.out.println("Pilihan metode pembayaran tidak valid.");
                            return;
                        }

                        System.out.println("- - - - - Pembayaran melalui DANA - - - - - -");
                        System.out.print("Silahkan masukkan nomor anda: ");
                        String danaPay = scanner.nextLine();

                        Token selectedToken = tokens.get(tokenChoice - 1);
                        String selectedMetode = metodePembayaran[metodeChoice - 1];

                        System.out.println("========================================");
                        System.out.println("           KONFIRMASI PEMBELIAN         ");
                        System.out.println("========================================");
                        System.out.printf("Nominal          : %d%n", selectedToken.getNominal());
                        System.out.printf("Total Energi     : %.1f KWh%n", selectedToken.getKwh());
                        System.out.printf("Harga            : Rp. %,.2f%n", selectedToken.getHarga());
                        System.out.println("Nomor DANA       : " + danaPay);
                        System.out.println("----------------------------------------");
                        System.out.print("Konfirmasi Pembelian? (y/n): ");
                        String confirm = scanner.nextLine();

                        if (!confirm.equalsIgnoreCase("y")) {
                            System.out.println("Pembelian dibatalkan.");
                            return;
                        }

                        System.out.println("========================================");
                        System.out.println("           RINGKASAN TRANSAKSI         ");
                        System.out.println("========================================");
                        System.out.printf("Nominal          : %d%n", selectedToken.getNominal());
                        System.out.printf("Nomor Token      : %d%n", selectedToken.getNomorToken());
                        System.out.printf("Total Energi     : %.1f KWh%n", selectedToken.getKwh());
                        System.out.printf("Harga            : Rp. %,.2f%n", selectedToken.getHarga());
                        System.out.println("Metode Pembayaran: " + selectedMetode);
                        System.out.println("----------------------------------------");
                        System.out.println("Pembelian berhasil! Token akan segera dikirim ke perangkat Anda.");
                        System.out.println("========================================");

                        idTagihan = "ID" + (riwayatPembelian.size() + 1);

                        RiwayatBeli newRiwayat = new RiwayatBeli(
                                selectedToken.getNominal(),
                                selectedToken.getNomorToken(),
                                selectedToken.getKwh(),
                                selectedMetode,
                                idTagihan,
                                true,
                                LocalDate.now().toString(),
                                2500
                        );

                        riwayatPembelian.add(newRiwayat);
                        break;

                    case 4:
                        System.out.println("= = = = = = = = = = DAFTAR TRANSAKSI BULAN INI = = = = = = = = = =");
                        if (riwayatPembelian.isEmpty()) {
                            System.out.println("Belum ada riwayat pembelian.");
                        } else {
                            System.out.println("\n- - - - RIWAYAT PEMBELIAN - - - -");
                            for (RiwayatBeli riwayat : riwayatPembelian) {
                                riwayat.printTransaksi();
                                System.out.println();
                            }
                        }
                        break;
                    case 5:
                        System.out.println("= = = = = = = = = = SELAMAT DATANG DI INFORMASI CUSTOMER SERVICE PLN = = = = = = = = = =");
                        infoServices.get(0).daftarInformasi();
                        System.out.print("Pilih lokasi kamu berada: ");
                        int infoUser = scanner.nextInt();
                        infoServices.get(1).printData(infoUser);
                        break;
                    case 6:
                        System.out.println("= = = = = = = = = = STATISTIK PENGGUNAAN DI BULAN INI = = = = = = = = = =");
                        Statistik statistik = new Statistik(0, 0, 0);

                        statistik.calculateStatistics(riwayatPembelian);
                        break;
                    case 0:
                        System.out.println("Keluar dari program. Terima kasih.");
                        return;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid. Masukkan angka antara 0-6.");
                scanner.nextLine();
            }
        }
    }
}
