import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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
        PesananKamar nota1 = new PesananKamar(pelanggan1, "P001", LocalDate.now(), LocalDate.now().plusDays(3), "Ongoing", new ArrayList<>());
        pelanggan1.setDaftarPesanan(nota1);
        pelanggan1.tambahPesanan(kamar005);
        pelanggan1.tambahPesanan(kamar001);
        pelanggan1.tambahPesanan(kamar002);



        // Menampilkan info pelanggan
        pelanggan1.infoPelanggan();

        // Membuat Ulasan
        // Ulasan ulasan1 = new Ulasan("U001", pelanggan1, kamar005, 5, "Kamarnya ganteng", LocalDate.now());
        // ulasan1.printUlasan();

        // Membuat Pembayaran
        Pembayaran pembayaran1 = new Pembayaran(nota1,"Kartu Kredit", "Belum Lunas", LocalDate.now());
        pembayaran1.validasiPembayaran();
        System.out.println(pembayaran1.getStatusPembayaran());
        pembayaran1.prosesPembayaran();
        System.out.println(pembayaran1.getStatusPembayaran());
        pembayaran1.infoPembayaran();
    }
}