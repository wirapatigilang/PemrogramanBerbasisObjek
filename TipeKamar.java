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

    public void deskripsiKamar () {
        System.out.println("Nama Tipe : " + getNamaTipe());
        System.out.println("Harga : " + getHarga());
        System.out.println("Fasilitas : " + getFasilitas());

    }

}
