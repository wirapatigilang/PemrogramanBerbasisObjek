import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Membuat Tipe Kamar
        TipeKamar superior = new TipeKamar("Superior", 200000, new ArrayList<>(List.of("TV", "Water Heater", "Double Bed")));
        TipeKamar suite = new TipeKamar("Suite", 300000, new ArrayList<>(List.of("TV", "Water Heater", "King Size Bed", "Balkon")));

        // Membuat Kamar
        Kamar kamar001 = new Kamar("001", "Tersedia", superior);
        Kamar kamar002 = new Kamar("002", "Tersedia", superior);
        Kamar kamar003 = new Kamar("003", "Tersedia", superior);
        Kamar kamar004 = new Kamar("004", "Tersedia", suite);
        Kamar kamar005 = new Kamar("005", "Tersedia", suite);

        // Membuat Pelanggan dan Pesanan Kamar
        Pelanggan pelanggan1 = new Pelanggan("Gilang", "Lombok", "082340006777", "wirapatigilang@gmail.com", null);
        PesananKamar nota1 = new PesananKamar(pelanggan1, "P001", null, LocalDate.now().plusDays(3), "Ongoing", new ArrayList<>());
        pelanggan1.setDaftarPesanan(nota1);
        pelanggan1.tambahPesanan(kamar005);
        pelanggan1.tambahPesanan(kamar001);
        pelanggan1.tambahPesanan(kamar002);

        // Membuat Pegawai
        Resepsionis Resepsionis1 = new Resepsionis("P001", "Azka", "Medan", "azkagantengbanget123@gmail.com", "Malam");




        pelanggan1.infoPelanggan();
        Resepsionis1.checkIn(pelanggan1);
        System.out.println("\nPAS CHECKIN");
        kamar002.infoKamar();

      
        System.out.println("\nPAS CHECKout");

        Resepsionis1.checkOut(pelanggan1);
        kamar002.infoKamar();

        // Menampilkan info pelanggan
        pelanggan1.infoPelanggan();

        // Membuat Ulasan
        Ulasan ulasan1 = new Ulasan("U001", pelanggan1, 5, "Kamarnya ganteng", LocalDate.now());
        ulasan1.printUlasan();

        // Membuat Pembayaran
        Pembayaran pembayaran1 = new Pembayaran(nota1,"Kartu Kredit", LocalDate.now());
        // System.out.println(pembayaran1.getStatusPembayaran());
        pembayaran1.prosesPembayaran(2100001);
        pembayaran1.infoPembayaran();

        //Membuat Pelannggan Baru
        Pelanggan pelanggan2 = new Pelanggan("Kiki", "Blora", "08123455678", "kikikeren123@gmail.com", null);
        PesananKamar nota2 = new PesananKamar(pelanggan2, "P002", LocalDate.now(), LocalDate.now().plusDays(2), "Ongoing", new ArrayList<>());
        pelanggan2.setDaftarPesanan(nota2);
        pelanggan2.tambahPesanan(kamar005);
        pelanggan2.infoPelanggan();


        PesananKamar nota3 = new PesananKamar(pelanggan2, "P002", LocalDate.now(), LocalDate.now().plusDays(2), "Ongoing", new ArrayList<>());
        pelanggan2.setDaftarPesanan(nota3);
        pelanggan2.tambahPesanan(kamar003);
        pelanggan2.tambahPesanan(kamar004);

        pelanggan2.infoPelanggan();
        Pembayaran pembayaran2 = new Pembayaran(nota2, "Transfer", LocalDate.now());

    }
}