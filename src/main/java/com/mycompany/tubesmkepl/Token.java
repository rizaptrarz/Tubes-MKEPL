/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesmkepl;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.List;

public class Token {
    private int nominal;
    private long nomorToken;
    private double kwh;
    private double harga;
    private static final String[] metodePembayaran = {
        "Transfer Bank",
        "DANA",
        "Gerai Retail"
    };

    private static List<Token> tokenList = new ArrayList<>();

    public Token(int nominal, long nomorToken, double kwh) {
        this.nominal = nominal;
        this.nomorToken = nomorToken;
        this.kwh = kwh;
        this.harga = calculateHarga();
        tokenList.add(this); 
    }

    public int getNominal() {
        return nominal;
    }

    public long getNomorToken() {
        return nomorToken;
    }

    public double getKwh() {
        return kwh;
    }

    public double getHarga() {
        return harga;
    }

    public static String[] getMetodePembayaran() {
        return metodePembayaran;
    }

    public static List<Token> getTokenList() {
        return tokenList;
    }

    private double calculateHarga() {
        return nominal * 0.1 + kwh * 1500;
    }

    @Override
    public String toString() {
        return "Token [Nominal: " + nominal + " - Nomor Token: " + nomorToken + " - Total Energi: " + kwh + "Kwh" + " - Harga: Rp. " + harga + "]";
    }

    // Menampilkan Token tanpa Nomor Token
    public String toStringWithoutNomorToken() {
        return "Token [Nominal: " + nominal + " - Total Energi: " + kwh 
            + "Kwh - Harga: Rp. " + harga + "]";
    }

    public static void displayAllTokens() {
        System.out.println("=== Data Token dan Harganya ===");
        for (Token token : tokenList) {
            System.out.println(token);
        }
        System.out.println("=== Metode Pembayaran yang Tersedia ===");
        for (String metode : metodePembayaran) {
            System.out.println("- " + metode);
        }
    }

    public static void addToken(int nominal, long nomorToken, double kwh) {
        new Token(nominal, nomorToken, kwh);
    }

}
