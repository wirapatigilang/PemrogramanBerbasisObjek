
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

        
    }
}
