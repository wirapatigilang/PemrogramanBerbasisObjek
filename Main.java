import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Membuat Tipe Kamar

        TipeKamar Superior = new TipeKamar("Superior", 200000, List.of("TV", "Water Heater", "Double Bed"));
        TipeKamar Suite = new TipeKamar("Suite", 300000, List.of("TV", "Water Heater", "King Size Bed", "Balkon"));

        // Membuat Kamar
        Kamar Kamar001 = new Kamar("001", "Tersedia", Superior);
        Kamar Kamar002 = new Kamar("002", "Tersedia", Superior);
        Kamar Kamar003 = new Kamar("003", "Tersedia", Superior);
        Kamar Kamar004 = new Kamar("004", "Tersedia", Suite);
        Kamar Kamar005 = new Kamar("005", "Tersedia", Suite);

        Pelanggan Pelanggan1 = new Pelanggan("Gilang", "Lombok", "082340006777", "wirapatigilang@gmail.com", null);
        
        Pelanggan1.tambahPesanan(new PesananKamar(null, "0001", LocalDate.of(2025, 10, 3), LocalDate.of(2025, 10, 5), "Reservasi", List.of(Kamar001)));
        
        Pelanggan1.infoPelanggan();
    }
}
