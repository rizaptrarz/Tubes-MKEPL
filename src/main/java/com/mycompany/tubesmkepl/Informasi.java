/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tubesmkepl;

/**
 *
 * @author LENOVO
 */
public class Informasi implements InfoService{

    public Informasi() {
    }
    
    @Override
    public void daftarInformasi(){
        System.out.println("==================Daftar Informasi==================");
        System.out.println("1. Tips Menghemat Penggunaan Listrik");
        System.out.println("2. Tarif Listrik Terkini");
        System.out.println("3. Jadwal Pemadaman Berkala");
        System.out.println("4. Modus Penipuan Tagihan Listrik");
        System.out.println("5. Info Terbaru Pekan Ini");
        System.out.println("====================================================");
    }
    
    private void printJawaban1(){
        System.out.println("====================================================");
        System.out.println("Menghemat listrik dapat membantu menurunkan tagihan");
        System.out.println("bulanan dan mengurangi dampak lingkungan. Berikut");
        System.out.println("beberapa tips untuk menghemat penggunaan listrik:");
        
        System.out.println("\n\n1. Matikan Alat Elektronik yang Tidak Digunakan");
        System.out.println("Matikan lampu, kipas angin, AC, televisi, atau alat");
        System.out.println("elektronik lainnya saat tidak digunakan. Hindari");
        System.out.println("membiarkan alat elektronik dalam mode standby,");
        System.out.println("karena masih mengonsumsi listrik.");
        
        System.out.println("\n\n2. Gunakan Lampu LED");
        System.out.println("Gantilah lampu pijar dengan lampu LED. Lampu LED");
        System.out.println("lebih hemat energi dan memiliki masa pakai yang");
        System.out.println("lebih lama dibandingkan lampu pijar atau CFL.");
        
        System.out.println("\n\n3. Gunakan Peralatan Hemat Energi");
        System.out.println("Pilih peralatan listrik yang memiliki label hemat");
        System.out.println("energi, seperti peralatan dengan sertifikasi Energy");
        System.out.println("Star. Alat-alat ini dirancang untuk menggunakan lebih");
        System.out.println("sedikit listrik tanpa mengorbankan kinerja.");
        
        System.out.println("\n\n4. Atur Waktu Penggunaan Peralatan Listrik");
        System.out.println("Gunakan alat listrik berat, seperti mesin cuci, setrika,");
        System.out.println("dan oven, pada waktu tertentu ketika tarif listrik lebih");
        System.out.println("murah (misalnya, di luar jam puncak, jika ada tarif");
        System.out.println("listrik berbeda).");
        
        System.out.println("\n\n5. Bersihkan dan Rawat Peralatan Secara Rutin");
        System.out.println("Peralatan yang kotor atau tidak dirawat, seperti filter");
        System.out.println("AC yang tersumbat atau kulkas dengan debu di bagian");
        System.out.println("kondensor, bekerja lebih keras dan mengonsumsi lebih");
        System.out.println("banyak listrik.");
        
        System.out.println("\n\nItulah beberapa tips untuk membantumu menghemat");
        System.out.println("penggunaan daya listrikmu~");
        System.out.println("====================================================");
    }
    
    private void printJawaban2(){
        System.out.println("====================================================");
        System.out.println("Berikut adalah tarif listrik PLN terbaru per Desember 2024");
        
        System.out.println("\n\nGolongan : Rumah Tangga (R-1/TR)");
        System.out.println(">> Daya 900 VA          : Rp 1.352/kWh");
        System.out.println(">> Daya 1.300 VA        : Rp 1.444,70/kWh");
        System.out.println(">> Daya 2.200 VA        : Rp 1.444,70/kWh");
        System.out.println(">> Daya 3.500-5.500 VA  : Rp 1.699,53/kWh");
        
        System.out.println("\n\nGolongan : Penerangan Jalan Umum (P-3/TR)");
        System.out.println(">> Tarif    : Rp 1.699,53/kWh");
        
        System.out.println("\n\nGolongan : Golongan Lain (L/TR, TM, TT)");
        System.out.println(">> Tarif    : Rp 1.644,52/kWh");
        
        System.out.println("\n\nGolongan : Subsidi Rumah Tangga (R-1/TR)");
        System.out.println(">> Daya 450 VA          : Rp 415/kWh");
        
        System.out.println("\nSumber    : PLN");
        System.out.println("====================================================");
    }
    
    private void printJawaban3(){
        System.out.println(
            "Berikut adalah jadwal pemadaman listrik berkala di sekitar Bojongsong, Bandung:\n" + //
                                "- - - - - - - - - - - - - - - - - - - - - - - -\n"+ //
                                "Tanggal: 13 Desember 2024, 10:00 - 13:00 WIB\n" + //
                                "Wilayah: Bojongsong, Jl. Raya Bandung - Garut\n" + //
                                "Tujuan: Pemeliharaan saluran listrik\n" + //
                                "\n" + //
                                "- - - - - - - - - - - - - - - - - - - - - - - -"+ //
                                "Tanggal: 14 Desember 2024, 09:00 - 12:00 WIB\n" + //
                                "Wilayah: Kampung Ciparay\n" + //
                                "Tujuan: Peningkatan jaringan listrik\n" + //
                                "\n" + //
                                "- - - - - - - - - - - - - - - - - - - - - - - -"+ //
                                "Tanggal: 15 Desember 2024, 13:00 - 15:00 WIB\n" + //
                                "Wilayah: Desa Cisarua\n" + //
                                "Tujuan: Peningkatan trafo\n" + //
                                "\n" + //
                                "- - - - - - - - - - - - - - - - - - - - - - - -"+ //
                                "Tanggal: 16 Desember 2024, 10:00 - 14:00 WIB\n" + //
                                "Wilayah: Bojongsong\n" + //
                                "Tujuan: Perbaikan feeder\n" + //
                                "\n" + //
                                "- - - - - - - - - - - - - - - - - - - - - - - -"+ //
                                "Tanggal: 17 Desember 2024, 08:00 - 11:00 WIB\n" + //
                                "Wilayah: Jl. Bojongsong Raya\n" + //
                                "Tujuan: Pemeliharaan rutin" + //   
                                "- - - - - - - - - - - - - - - - - - - - - - - -" //
        );
    }
    
    private void printJawaban4(){
        System.out.println("====================================================");
        System.out.println("Berikut adalah daftar modus penipuan terkait tagihan");
        System.out.println("listrik yang terbaru:");
        
        System.out.println("\n\n1. Penipuan Lewat SMS atau Telepon");
        System.out.println("2. Tawaran Diskon Tagihan Palsu");
        System.out.println("3. Pemalsuan Struk Pembayaran");
        System.out.println("4. Petugas PLN Palsu");
        
        System.out.println("\n\nTips untuk menghindari penipuan:");
        System.out.println(">> Pastikan selalu melakukan pembayaran tagihan listrik");
        System.out.println("   melalui kanal resmi seperti aplikasi PLN Mobile,");
        System.out.println("   ATM, atau bank yang bekerjasama dengan PLN.\n");
        
        System.out.println(">> Jangan pernah memberikan informasi pribadi, termasuk");
        System.out.println("   nomor rekening atau identitas, kepada pihak yang");
        System.out.println("   tidak dikenal.\n");
        
        System.out.println(">> Cek kebenaran informasi tagihan melalui situs resmi");
        System.out.println("   PLN atau menghubungi call center PLN 123 jika ragu");
        System.out.println("   terhadap keaslian suatu tagihan.\n");
        
        System.out.println("Sumber: PLN, berbagai laporan media terkait penipuan tagihan listrik.");
        System.out.println("====================================================");
    }
    
    private void printJawaban5(){
        System.out.println("====================================================");
        System.out.println("       GEBYAR MERDEKA (2024)");
        System.out.println("semakin MERIAH rayakan KEMERDEKAAN");
        
        System.out.println("\n\n>> Tambah Daya");
        System.out.println("- Diskon 73% (Berlaku hingga 2 september 2024)");
        System.out.println("- Diskon 50% (Berlaku hingga 31 oktober 2024)");
        
        System.out.println("\n\n>> Penyambungan Sementara");
        System.out.println("- Tarif : Rp. 170.845,00, (Sudah termasuk 80kWh*)");
        System.out.println("Promo berlaku hingga 31 oktober 2024");
        
        System.out.println("\nSumber: Instagram (@plnbandung)");
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
