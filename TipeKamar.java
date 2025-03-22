import java.util.ArrayList;
import java.util.List;

public class TipeKamar {
    private String namaTipe;
    private double harga;
    private List<String> fasilitas;

    // Konstruktor
    public TipeKamar() {
        this.namaTipe = "";
        this.harga = 0;
        this.fasilitas = new ArrayList<>();
    };

    public TipeKamar(String namaTipe, double harga, List<String> fasilitas) {
        this.namaTipe = namaTipe;
        this.harga = harga;
        this.fasilitas = fasilitas;
    }

    // Selektor
    public String getNamaTipe () {
        return this.namaTipe;
    }
    public double getHarga () {
        return this.harga;
    }
    public List<String> getFasilitas () {
        return this.fasilitas;
    }

    // Mutator
    public void setNamaTipe (String namaTipe){
        this.namaTipe = namaTipe;
    }
    public void setHarga (double harga) {
        this.harga = harga;
    }
    public void setFasilitas (List<String> fasilitas) {
        this.fasilitas = fasilitas;
    }

    // Method untuk menampilkan deskripsi kamar
    public void deskripsiKamar() {
        System.out.println("\n=== Deskripsi Kamar ===");
        System.out.printf("Nama Tipe : %s%n", getNamaTipe());
        System.out.printf("Harga     : Rp %.2f%n", getHarga());
    
        List<String> fasilitas = getFasilitas();
        if (fasilitas != null && !fasilitas.isEmpty()) {
            System.out.printf("Fasilitas : %s%n", String.join(", ", fasilitas));
        } else {
            System.out.println("Fasilitas : Tidak ada fasilitas yang tersedia");
        }
        System.out.println("========================");
    }

}
