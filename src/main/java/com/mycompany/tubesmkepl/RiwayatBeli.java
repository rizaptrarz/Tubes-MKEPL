/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesmkepl;

/**
 *
 * @author LENOVO
 */
public class RiwayatBeli extends Token {
    private String idTransaksi;
    private boolean status;
    private String tanggal;
    private int biayaAdmin;
    private String metodeBayar;

    public RiwayatBeli(int nominal, long nomor_token, double Kwh, String metodebayar, 
                        String idTransaksi, boolean status, String tanggal, int biayaAdmin) {
        super(nominal, nomor_token, Kwh);
        this.metodeBayar = metodebayar;
        this.idTransaksi = idTransaksi;
        this.status = status;
        this.tanggal = tanggal;
        this.biayaAdmin = biayaAdmin;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getBiayaAdmin() {
        return biayaAdmin;
    }

    public void setBiayaAdmin(int biayaAdmin) {
        this.biayaAdmin = biayaAdmin;
    }

    public void printTransaksi() {
        System.out.println("=== Informasi Transaksi ===");
        System.out.println("ID Transaksi        : " + idTransaksi);
        System.out.println("Status              : " + (status ? "Lunas" : "Belum Lunas"));
        System.out.println("Metode Pembayaran   : " + metodeBayar);
        System.out.println("Tanggal             : " + tanggal);
        System.out.println("Biaya Admin         : Rp " + biayaAdmin);
        System.out.println("Total Transaksi     : " + getNominal());
    }
}
