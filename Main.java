import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("========== SISTEM MANAJEMEN HOTEL ==========\n");
        
        // Inisialisasi data hotel
        List<TipeKamar> daftarTipeKamar = inisialisasiTipeKamar();
        List<Kamar> daftarKamar = inisialisasiKamar(daftarTipeKamar);
        List<Pegawai> daftarPegawai = inisialisasiPegawai();
        
        // Demonstrasi penggunaan semua method
        demonstrasiTipeKamar(daftarTipeKamar);
        demonstrasiKamar(daftarKamar);
        demonstrasiPegawai(daftarPegawai);
        
        // Simulasi booking dan operasi hotel
        System.out.println("\n========== SIMULASI HOTEL ==========");
        
        // Simulasi Pelanggan 1
        simulasiPelanggan1(daftarKamar, daftarPegawai);
        
        // Simulasi Pelanggan 2
        simulasiPelanggan2(daftarKamar, daftarPegawai);


        
        System.out.println("\n========== SISTEM BERAKHIR ==========");
    }
    
    // ==================== INISIALISASI DATA ====================
    private static List<TipeKamar> inisialisasiTipeKamar() {
        System.out.println("--- INISIALISASI TIPE KAMAR ---");
        
        List<TipeKamar> daftarTipe = new ArrayList<>();
        
        // Inisialisasi tipe kamar dengan berbagai fasilitas
        TipeKamar standard = new TipeKamar("Standard", 150000, 
                            new ArrayList<>(List.of("TV", "Air Conditioning", "Single Bed")));
        
        TipeKamar superior = new TipeKamar("Superior", 250000, 
                            new ArrayList<>(List.of("TV", "Water Heater", "Double Bed", "Mini Refrigerator")));
        
        TipeKamar deluxe = new TipeKamar("Deluxe", 350000, 
                           new ArrayList<>(List.of("TV", "Water Heater", "Queen Size Bed", "Mini Bar", "Bathtub")));
        
        TipeKamar suite = new TipeKamar("Suite", 500000, 
                         new ArrayList<>(List.of("TV", "Water Heater", "King Size Bed", "Balkon", "Jacuzzi", "Living Room")));
        
        TipeKamar presidential = new TipeKamar("Presidential", 1000000, 
                               new ArrayList<>(List.of("Smart TV", "Water Heater", "Emperor Size Bed", "Private Pool", 
                                                      "Mini Bar", "Butler Service", "Panoramic View")));
        
        // Tambahkan ke daftar
        daftarTipe.add(standard);
        daftarTipe.add(superior);
        daftarTipe.add(deluxe);
        daftarTipe.add(suite);
        daftarTipe.add(presidential);
        
        System.out.println("Berhasil menginisialisasi " + daftarTipe.size() + " tipe kamar");
        
        return daftarTipe;
    }
    
    private static List<Kamar> inisialisasiKamar(List<TipeKamar> daftarTipe) {
        System.out.println("\n--- INISIALISASI KAMAR ---");
        
        List<Kamar> daftarKamar = new ArrayList<>();
        
        // Kamar Standard (101-105)
        for (int i = 1; i <= 5; i++) {
            daftarKamar.add(new Kamar("10" + i, "Tersedia", daftarTipe.get(0)));
        }
        
        // Kamar Superior (201-205)
        for (int i = 1; i <= 5; i++) {
            daftarKamar.add(new Kamar("20" + i, "Tersedia", daftarTipe.get(1)));
        }
        
        // Kamar Deluxe (301-305)
        for (int i = 1; i <= 5; i++) {
            daftarKamar.add(new Kamar("30" + i, "Tersedia", daftarTipe.get(2)));
        }
        
        // Kamar Suite (401-403)
        for (int i = 1; i <= 3; i++) {
            daftarKamar.add(new Kamar("40" + i, "Tersedia", daftarTipe.get(3)));
        }
        
        // Kamar Presidential (501-502)
        for (int i = 1; i <= 2; i++) {
            daftarKamar.add(new Kamar("50" + i, "Tersedia", daftarTipe.get(4)));
        }
        
        System.out.println("Berhasil menginisialisasi " + daftarKamar.size() + " kamar");
        
        return daftarKamar;
    }
    
    private static List<Pegawai> inisialisasiPegawai() {
        System.out.println("\n--- INISIALISASI PEGAWAI ---");
        
        List<Pegawai> daftarPegawai = new ArrayList<>();
        
        // Inisialisasi pegawai umum
        Pegawai manager = new Pegawai("P001", "Slamet", "Jakarta", "slamet@hotel.com");
        
        // Inisialisasi resepsionis
        Resepsionis resepsionis1 = new Resepsionis("R001", "Azka", "Medan", "azka@hotel.com", "Bahasa Indonesia");
        resepsionis1.setBahasaYangDikuasai(new ArrayList<>(Arrays.asList("Bahasa Indonesia", "English","Cina")));
        
        Resepsionis resepsionis2 = new Resepsionis("R002", "Nina", "Surabaya", "nina@hotel.com", "Bahasa Indonesia");
        resepsionis2.setBahasaYangDikuasai(new ArrayList<>(Arrays.asList("Bahasa Indonesia", "English", "Arab")));
        
        // Inisialisasi housekeeping
        Housekeeping housekeeping1 = new Housekeeping("H001", "Budi", "Jakarta", "budi@hotel.com", null);
        Housekeeping housekeeping2 = new Housekeeping("H002", "Lisa", "Bandung", "lisa@hotel.com", null);
        Housekeeping housekeeping3 = new Housekeeping("H003", "Wayan", "Bali", "wayan@hotel.com", null);
        
        // Tambahkan ke daftar
        daftarPegawai.add(manager);
        daftarPegawai.add(resepsionis1);
        daftarPegawai.add(resepsionis2);
        daftarPegawai.add(housekeeping1);
        daftarPegawai.add(housekeeping2);
        daftarPegawai.add(housekeeping3);
        
        System.out.println("Berhasil menginisialisasi " + daftarPegawai.size() + " pegawai");
        
        return daftarPegawai;
    }
    
    // ==================== DEMONSTRASI METHOD ====================
    private static void demonstrasiTipeKamar(List<TipeKamar> daftarTipe) {
        System.out.println("\n========== DEMONSTRASI METHOD TIPE KAMAR ==========");
        
        // Menggunakan constructor
        System.out.println("1. Membuat tipe kamar baru dengan constructor:");
        TipeKamar executive = new TipeKamar("Executive", 450000, 
                            new ArrayList<>(List.of("Smart TV", "Hot Tub", "Queen Size Bed", "Mini Bar")));
        
        // Menggunakan getter
        System.out.println("\n2. Menggunakan getter:");
        System.out.println("Nama Tipe: " + executive.getNamaTipe());
        System.out.println("Harga: Rp " + executive.getHarga());
        System.out.println("Fasilitas: " + executive.getFasilitas());
        
        // Menggunakan setter
        System.out.println("\n3. Menggunakan setter:");
        executive.setHarga(475000);
        executive.getFasilitas().add("Workspace Desk");
        System.out.println("Harga baru: Rp " + executive.getHarga());
        System.out.println("Fasilitas baru: " + executive.getFasilitas());
        
        // Menggunakan method deskripsiKamar
        System.out.println("\n4. Menggunakan method deskripsiKamar:");
        executive.deskripsiKamar();
        
        // Demo perbandingan tipe kamar
        System.out.println("\n5. Perbandingan tipe kamar:");
        System.out.println("\nPerbandingan Tipe Kamar Standard vs Presidential:");
        daftarTipe.get(0).deskripsiKamar();
        daftarTipe.get(4).deskripsiKamar();
    }
    
    private static void demonstrasiKamar(List<Kamar> daftarKamar) {
        System.out.println("\n========== DEMONSTRASI METHOD KAMAR ==========");
        
        // Menggunakan constructor
        System.out.println("1. Membuat kamar baru dengan constructor:");
        Kamar kamarBaru = new Kamar("601", "Tersedia", new TipeKamar("VIP", 600000, 
                                    new ArrayList<>(List.of("Smart TV", "Jacuzzi", "Emperor Bed"))));
        
        // Menggunakan getter
        System.out.println("\n2. Menggunakan getter:");
        System.out.println("Nomor Kamar: " + kamarBaru.getNomorKamar());
        System.out.println("Status Kamar: " + kamarBaru.getStatusKamar());
        System.out.println("Tipe Kamar: " + kamarBaru.getTipe().getNamaTipe());
        System.out.println("Status Kebersihan: " + kamarBaru.getStatusKebersihan());
        
        // Menggunakan setter
        System.out.println("\n3. Menggunakan setter:");
        kamarBaru.setStatusKamar("Tidak Tersedia");
        kamarBaru.setStatusKebersihan("Kotor");
        System.out.println("Status Kamar baru: " + kamarBaru.getStatusKamar());
        System.out.println("Status Kebersihan baru: " + kamarBaru.getStatusKebersihan());
        
        // Menggunakan method cekKetersediaan
        System.out.println("\n4. Menggunakan method cekKetersediaan:");
        System.out.println("Kamar " + kamarBaru.getNomorKamar() + " tersedia? " + kamarBaru.cekKetersediaan());
        kamarBaru.setStatusKamar("Tersedia");
        System.out.println("Setelah perubahan - Kamar " + kamarBaru.getNomorKamar() + " tersedia? " + kamarBaru.cekKetersediaan());
        
        // Menggunakan method infoKamar
        System.out.println("\n5. Menggunakan method infoKamar:");
        kamarBaru.infoKamar();
        
        // Demo kamar dari daftar yang sudah dibuat
        System.out.println("\n6. Informasi kamar dari daftar:");
        // Menampilkan kamar Standard, Superior, dan Presidential
        daftarKamar.get(0).infoKamar(); 
        System.out.println();
        daftarKamar.get(5).infoKamar();
        System.out.println();
        daftarKamar.get(18).infoKamar();
    }
    
    private static void demonstrasiPegawai(List<Pegawai> daftarPegawai) {
        System.out.println("\n========== DEMONSTRASI METHOD PEGAWAI ==========");
        
        // Demo pegawai umum
        System.out.println("1. Pegawai Umum:");
        Pegawai pegawaiBaru = new Pegawai("P999", "John Doe", "Yogyakarta", "john@hotel.com");
        
        // Menggunakan getter
        System.out.println("\nMenggunakan getter:");
        System.out.println("ID: " + pegawaiBaru.getIdPegawai());
        System.out.println("Nama: " + pegawaiBaru.getNama());
        System.out.println("Alamat: " + pegawaiBaru.getAlamat());
        
        // Menggunakan setter
        System.out.println("\nMenggunakan setter:");
        pegawaiBaru.setAlamat("Solo");
        System.out.println("Alamat baru: " + pegawaiBaru.getAlamat());
        
        // Method infoPegawai
        System.out.println("\nMethod infoPegawai:");
        pegawaiBaru.infoPegawai();
        
        // Demo Resepsionis
        System.out.println("\n2. Resepsionis:");
        Resepsionis resepsionis = (Resepsionis) daftarPegawai.get(1);
        
        // Getter dan Setter khusus Resepsionis
        System.out.println("\nGetter dan Setter bahasaYangDikuasai:");
        System.out.println("Bahasa yang dikuasai: " + resepsionis.getBahasaYangDikuasai());
        
        // Menambah bahasa baru
        List<String> bahasaBaru = resepsionis.getBahasaYangDikuasai();
        bahasaBaru.add("Jepang");
        resepsionis.setBahasaYangDikuasai(bahasaBaru);
        System.out.println("Bahasa setelah ditambah: " + resepsionis.getBahasaYangDikuasai());
        
        // Method infoPegawai override
        System.out.println("\nMethod infoPegawai (setelah override):");
        resepsionis.infoPegawai();
        
        // Demo Housekeeping
        System.out.println("\n3. Housekeeping:");
        Housekeeping housekeeping = (Housekeeping) daftarPegawai.get(3);
        
        // Getter dan Setter khusus Housekeeping
        System.out.println("\nGetter dan Setter daftarKamarTugas dan nota:");
        
        // Membuat daftar kamar tugas
        List<Kamar> kamarTugas = new ArrayList<>();
        kamarTugas.add(new Kamar("101", "Tersedia", new TipeKamar()));
        kamarTugas.add(new Kamar("102", "Tersedia", new TipeKamar()));
        
        housekeeping.setDaftarKamarTugas(kamarTugas);
        System.out.println("Daftar kamar tugas setelah ditambah: " + housekeeping.getDaftarKamarTugas().size() + " kamar");
        
        // Method infoPegawai override
        System.out.println("\nMethod infoPegawai (setelah override):");
        housekeeping.infoPegawai();
    }
    
    // ==================== SIMULASI OPERASI HOTEL ====================
    private static void simulasiPelanggan1(List<Kamar> daftarKamar, List<Pegawai> daftarPegawai) {
        System.out.println("\n========== SIMULASI PELANGGAN 1 ==========");
        
        try {
            // Membuat Pelanggan dan Pesanan Kamar
            System.out.println("--- MEMBUAT PELANGGAN DAN PESANAN ---");
            Pelanggan pelanggan1 = new Pelanggan("Gilang", "Lombok", "082340006777", "wirapatigilang@gmail.com", null);
            
            // Demonstrasi getter dan setter Pelanggan
            System.out.println("\nInformasi Pelanggan (getter):");
            System.out.println("Nama: " + pelanggan1.getNama());
            System.out.println("Alamat: " + pelanggan1.getAlamat());
            System.out.println("Nomor Telepon: " + pelanggan1.getNomorTelpon());
            System.out.println("Email: " + pelanggan1.getEmail());
            
            // Mengubah email
            pelanggan1.setEmail("gilang.update@gmail.com");
            System.out.println("\nEmail baru: " + pelanggan1.getEmail());
            
            // Membuat PesananKamar
            PesananKamar nota1 = new PesananKamar(pelanggan1, "P001", LocalDate.now(), LocalDate.now().plusDays(3), "Ongoing", new ArrayList<>());
            
            // Demonstrasi getter dan setter PesananKamar
            System.out.println("\nInformasi Pesanan (getter):");
            System.out.println("Nomor Pesanan: " + nota1.getNomorPesanan());
            System.out.println("Check-in: " + nota1.getTanggalCheckIn());
            System.out.println("Check-out: " + nota1.getTanggalCheckOut());
            System.out.println("Status: " + nota1.getStatusPesanan());
            
            // Mengubah tanggal check-out
            nota1.setTanggalCheckOut(LocalDate.now().plusDays(5));
            System.out.println("\nTanggal check-out baru: " + nota1.getTanggalCheckOut());
            
            // Menghubungkan pesanan ke pelanggan
            pelanggan1.setDaftarPesanan(nota1);
            
            // Menambahkan kamar ke pesanan
            System.out.println("\n--- MENAMBAHKAN KAMAR KE PESANAN ---");
            pelanggan1.tambahPesanan(daftarKamar.get(0));  // Kamar Standard
            pelanggan1.tambahPesanan(daftarKamar.get(5));  // Kamar Superior
            pelanggan1.tambahPesanan(daftarKamar.get(18)); // Kamar Presidential
            
            // Menampilkan informasi pelanggan dan pesanan
            pelanggan1.infoPelanggan();
            nota1.infoPesananKamar();
            
            // Simulasi Check-In oleh resepsionis
            System.out.println("\n--- PROSES CHECK-IN ---");
            Resepsionis resepsionis = (Resepsionis) daftarPegawai.get(1);
            resepsionis.checkIn(pelanggan1);
            
            // Menampilkan status kamar setelah check-in
            System.out.println("\nStatus kamar setelah check-in:");
            for (Kamar kamar : nota1.getDaftarKamar()) {
                System.out.println("Kamar " + kamar.getNomorKamar() + ": " + kamar.getStatusKebersihan());
            }
            
            // Simulasi proses housekeeping
            System.out.println("\n--- PROSES HOUSEKEEPING ---");
            Housekeeping housekeeping = (Housekeeping) daftarPegawai.get(3);
            housekeeping.setNota(nota1);
            System.out.println("Housekeeping ditugaskan untuk nota " + nota1.getNomorPesanan());
            System.out.println("");
            housekeeping.infoPegawai();
            
            // Proses Housekeeping
            housekeeping.bersihkanKamar();

            // Status kamar setelah dibersihkan
            System.out.println("\nStatus kamar setelah dibersihkan:");
            for (Kamar kamar : nota1.getDaftarKamar()) {
                System.out.println("Kamar " + kamar.getNomorKamar() + ": " + kamar.getStatusKebersihan());
            }
            
            // Simulasi proses pembayaran
            System.out.println("\n--- PROSES PEMBAYARAN ---");
            
            // Simulasi Check-Out
            System.out.println("\n--- PROSES CHECK-OUT ---");
            resepsionis.checkOut(pelanggan1);
            
            // Menampilkan status kamar setelah check-out
            System.out.println("\nStatus kamar setelah check-out:");
            for (Kamar kamar : nota1.getDaftarKamar()) {
                System.out.println("Kamar " + kamar.getNomorKamar() + ": " + kamar.getStatusKamar());
            }
            
            // Membuat Ulasan
            System.out.println("\n--- ULASAN PELANGGAN ---");
            Ulasan ulasan1 = new Ulasan("U001", pelanggan1, 5, "Pelayanan sangat memuaskan. Kamar bersih dan nyaman.", LocalDate.now());
            
            // Demonstrasi getter dan setter Ulasan
            System.out.println("\nInformasi Ulasan (getter):");
            System.out.println("ID Ulasan: " + ulasan1.getIdUlasan());
            System.out.println("Pelanggan: " + ulasan1.getPelanggan().getNama());
            System.out.println("Rating: " + ulasan1.getRating());
            System.out.println("Komentar: " + ulasan1.getKomentar());
            System.out.println("Tanggal: " + ulasan1.getTanggalUlasan());
            
            // Mengubah komentar
            ulasan1.setKomentar("Pelayanan sangat memuaskan. Kamar bersih dan nyaman. Sarapan enak!");
            System.out.println("\nKomentar baru: " + ulasan1.getKomentar());
            
            // Menampilkan ulasan
            ulasan1.printUlasan();
            
            // Demo error handling rating
            System.out.println("\nDemo error handling untuk rating ulasan:");
            try {
                Ulasan ulasanInvalid = new Ulasan("U999", pelanggan1, 7, "Rating terlalu tinggi", LocalDate.now());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            
        } catch (Exception e) {
            System.err.println("Error dalam simulasi pelanggan 1: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private static void simulasiPelanggan2(List<Kamar> daftarKamar, List<Pegawai> daftarPegawai) {
        System.out.println("\n========== SIMULASI PELANGGAN 2 ==========");
        
        try {
            // Membuat Pelanggan dan Pesanan
            System.out.println("--- MEMBUAT PELANGGAN DAN PESANAN ---");
            Pelanggan pelanggan2 = new Pelanggan("Kiki", "Blora", "08123455678", "kikikeren123@gmail.com", null);
            PesananKamar nota2 = new PesananKamar(pelanggan2, "P002", LocalDate.now(), LocalDate.now().plusDays(2), "Ongoing", new ArrayList<>());
            pelanggan2.setDaftarPesanan(nota2);
            
            // Menambahkan kamar ke pesanan - Kamar Deluxe
            System.out.println("\n--- MENAMBAHKAN KAMAR KE PESANAN ---");
            pelanggan2.tambahPesanan(daftarKamar.get(10));
            pelanggan2.tambahPesanan(daftarKamar.get(11));
            
            pelanggan2.infoPelanggan();
            nota2.infoPesananKamar();
            
            // Simulasi Check-In dengan tanggal spesifik
            System.out.println("\n--- PROSES CHECK-IN DENGAN TANGGAL SPESIFIK ---");
            Resepsionis resepsionis = (Resepsionis) daftarPegawai.get(2); // Resepsionis 2
            resepsionis.checkIn(pelanggan2, LocalDate.now().minusDays(1)); // Check-in kemarin
            
            // Status kamar
            System.out.println("\nStatus kamar setelah check-in:");
            for (Kamar kamar : nota2.getDaftarKamar()) {
                System.out.println("Kamar " + kamar.getNomorKamar() + ": " + kamar.getStatusKebersihan());
            }
            
            // Proses Housekeeping
            System.out.println("\n--- PROSES HOUSEKEEPING ---");
            Housekeeping housekeeping = (Housekeeping) daftarPegawai.get(4); // Housekeeping 2
            housekeeping.setNota(nota2);
            housekeeping.bersihkanKamar();
            
            // Status kamar setelah dibersihkan
            System.out.println("\nStatus kamar setelah dibersihkan:");
            for (Kamar kamar : nota2.getDaftarKamar()) {
                System.out.println("Kamar " + kamar.getNomorKamar() + ": " + kamar.getStatusKebersihan());
            }
            
            // Simulasi pembayaran sebagian
            System.out.println("\n--- PROSES PEMBAYARAN SEBAGIAN ---");
            Pembayaran pembayaran2 = new Pembayaran(nota2, "Transfer", LocalDate.now());
            System.out.println("Total tagihan: Rp " + pembayaran2.getJumlahBayar());
            
            // Pembayaran pertama (setengah)
            double setengahBayar = pembayaran2.getJumlahBayar() / 2;
            System.out.println("\nMelakukan pembayaran sebagian (50%): Rp " + setengahBayar);
            pembayaran2.prosesPembayaran(setengahBayar);
            
            // Pelunasan
            System.out.println("\nPelunasan pembayaran: Rp " + pembayaran2.getJumlahBayar());
            pembayaran2.prosesPembayaran(pembayaran2.getJumlahBayar());
            
            // Checkout
            System.out.println("\n--- PROSES CHECK-OUT ---");
            resepsionis.checkOut(pelanggan2);
            
            // Ulasan dengan rating berbeda
            System.out.println("\n--- ULASAN PELANGGAN ---");
            Ulasan ulasan2 = new Ulasan("U002", pelanggan2, 4, "Kamar dan pelayanan bagus, tapi wifi lambat", LocalDate.now());
            ulasan2.printUlasan();
            
        } catch (Exception e) {
            System.err.println("Error dalam simulasi pelanggan 2: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
}