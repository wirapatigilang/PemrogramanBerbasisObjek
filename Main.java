import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("========== SISTEM MANAJEMEN HOTEL ==========\n");
        
        // Membuat Tipe Kamar
        System.out.println("--- INISIALISASI TIPE KAMAR ---");
        TipeKamar superior = new TipeKamar("Superior", 200000, new ArrayList<>(List.of("TV", "Water Heater", "Double Bed")));
        TipeKamar suite = new TipeKamar("Suite", 300000, new ArrayList<>(List.of("TV", "Water Heater", "King Size Bed", "Balkon")));
        superior.deskripsiKamar();
        suite.deskripsiKamar();
        
        // Membuat Kamar
        System.out.println("\n--- INISIALISASI KAMAR ---");
        Kamar kamar001 = new Kamar("001", "Tersedia", superior);
        Kamar kamar002 = new Kamar("002", "Tersedia", superior);
        Kamar kamar003 = new Kamar("003", "Tersedia", superior);
        Kamar kamar004 = new Kamar("004", "Tersedia", suite);
        Kamar kamar005 = new Kamar("005", "Tersedia", suite);
        System.out.println("Salah satu Kamar yang berhasil dibuat:");
        kamar001.infoKamar();
        System.out.println();

        
        // Membuat Pegawai
        System.out.println("\n--- INISIALISASI PEGAWAI ---");
        Resepsionis resepsionis1 = new Resepsionis("P001", "Azka", "Medan", "azkagantengbanget123@gmail.com", "Bahasa Indonesia");
        Housekeeping housekeeping1 = new Housekeeping("H001", "Budi", "Jakarta", "budi.cleaning@gmail.com", null);
        
        System.out.println("Pegawai berhasil dibuat:");
        System.out.println("Resepsionis:");
        resepsionis1.infoPegawai();
        System.out.println("\nHousekeeping:");
        housekeeping1.infoPegawai();
        
        // SIMULASI PELANGGAN 1
        System.out.println("\n========== SIMULASI PELANGGAN 1 ==========");
        
        // Membuat Pelanggan dan Pesanan Kamar
        System.out.println("--- MEMBUAT PELANGGAN DAN PESANAN ---");
        Pelanggan pelanggan1 = new Pelanggan("Gilang", "Lombok", "082340006777", "wirapatigilang@gmail.com", null);
        PesananKamar nota1 = new PesananKamar(pelanggan1, "P001", null, LocalDate.now().plusDays(3), "Ongoing", new ArrayList<>());
        pelanggan1.setDaftarPesanan(nota1);
        pelanggan1.tambahPesanan(kamar005);
        pelanggan1.tambahPesanan(kamar001);
        pelanggan1.tambahPesanan(kamar002);
        pelanggan1.infoPelanggan();
        nota1.infoPesananKamar();
        System.out.println("Note: Setelah kamar dipesan, kamar langsung di set \"Tidak Tersedia\"");

        
        // Simulasi Check-In
        System.out.println("\n--- PROSES CHECK-IN ---");
        resepsionis1.checkIn(pelanggan1);
        System.out.println("Status kamar setelah check-in:");
        kamar002.infoKamar();
        
        // Simulasi Check-Out
        System.out.println("\n--- PROSES CHECK-OUT ---");
        resepsionis1.checkOut(pelanggan1);
        System.out.println("Status kamar setelah check-out:");
        kamar002.infoKamar();
        pelanggan1.infoPelanggan();
        
        // Membuat Ulasan
        System.out.println("\n--- ULASAN PELANGGAN ---");
        Ulasan ulasan1 = new Ulasan("U001", pelanggan1, 5, "Kamarnya ganteng", LocalDate.now());
        ulasan1.printUlasan();
        
        // Membuat Ulasan Tambahan dengan Rating Berbeda
        try {
            Ulasan ulasan2 = new Ulasan("U002", pelanggan1, 4, "Pelayanan ramah, tapi AC kurang dingin", LocalDate.now());
            System.out.println("\nUlasan tambahan:");
            ulasan2.printUlasan();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Membuat Pembayaran
        System.out.println("\n--- PROSES PEMBAYARAN ---");
        Pembayaran pembayaran1 = new Pembayaran(nota1, "Kartu Kredit", LocalDate.now());
        System.out.println("Status Pembayaran Awal: " + pembayaran1.getStatusPembayaran());
        System.out.println("\nMemproses pembayaran...");
        pembayaran1.prosesPembayaran(2100001);
        pembayaran1.infoPembayaran();
        
        // SIMULASI PELANGGAN 2
        System.out.println("\n========== SIMULASI PELANGGAN 2 ==========");
        
        // Membuat Pelanggan Baru
        System.out.println("--- MEMBUAT PELANGGAN DAN PESANAN ---");
        Pelanggan pelanggan2 = new Pelanggan("Kiki", "Blora", "08123455678", "kikikeren123@gmail.com", null);
        PesananKamar nota2 = new PesananKamar(pelanggan2, "P002", LocalDate.now(), LocalDate.now().plusDays(2), "Ongoing", new ArrayList<>());
        pelanggan2.setDaftarPesanan(nota2);
        pelanggan2.tambahPesanan(kamar005);
        System.out.println("Pesanan pertama:");
        pelanggan2.infoPelanggan();
        
        // Membuat Pesanan Tambahan
        System.out.println("\n--- MENAMBAH PESANAN ---");
        pelanggan2.tambahPesanan(kamar003);
        pelanggan2.tambahPesanan(kamar004);
        System.out.println("Pesanan setelah ditambah:");
        pelanggan2.infoPelanggan();
        nota2.infoPesananKamar();
        System.out.println("Note: Setelah kamar dipesan, kamar langsung di set \"Tidak Tersedia\"");
        
        // Simulasi Housekeeping untuk Pelanggan 2
        System.out.println("\n--- INISIALISASI HOUSEKEEPING PELANGGAN 2 ---");
        // Menambahkan kamar ke daftar tugas housekeeping
        System.out.println("Assign Housekeeping 1 untuk melayani nota Pelanggan 2");
        housekeeping1.setNota(nota2);
        System.out.println("Berhasil assign!");
        housekeeping1.infoPegawai();
        
        // Simulasi Check-In
        System.out.println("\n--- PROSES CHECK-IN ---");
        resepsionis1.checkIn(pelanggan2);
        System.out.println("Status kamar setelah check-in:");
        kamar003.infoKamar();
        
        // Simulasi Check-Out
        System.out.println("\n--- PROSES CHECK-OUT ---");
        resepsionis1.checkOut(pelanggan2);
        System.out.println("Status kamar setelah check-out:");
        kamar003.infoKamar();

        // Membersihkan kamar
        System.out.println("\nMemulai proses pembersihan kamar...");
        housekeeping1.bersihkanKamar();
        System.out.println("Kamar telah dibersihkan oleh " + housekeeping1.getNama());
        
        System.out.println("\nStatus kamar setelah dibersihkan:");
        for (Kamar kamar : nota2.getDaftarKamar()) {
            System.out.println("Nomor Kamar: " + kamar.getNomorKamar());
            System.out.println("Status Kebersihan: " + kamar.getStatusKebersihan());
        }
        
        // Membuat Ulasan dari Pelanggan 2
        System.out.println("\n--- ULASAN PELANGGAN 2 ---");
        try {
            Ulasan ulasan3 = new Ulasan("U003", pelanggan2, 3, "Kamar bersih, tapi wifi lambat", LocalDate.now());
            ulasan3.printUlasan();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Pembayaran
        System.out.println("\n--- PROSES PEMBAYARAN ---");
        Pembayaran pembayaran2 = new Pembayaran(nota2, "Transfer", LocalDate.now());
        System.out.println("Jumlah yang harus dibayar: Rp " + pembayaran2.getJumlahBayar());
        System.out.println("Status Pembayaran: " + pembayaran2.getStatusPembayaran());
        System.out.println("\nMemproses pembayaran pelanggan 2...");
        pembayaran2.prosesPembayaran(pembayaran2.getJumlahBayar());
        
        
        System.out.println("\n========== SISTEM BERAKHIR ==========");
    }
}