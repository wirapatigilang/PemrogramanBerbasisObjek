import java.util.ArrayList;
import java.util.List;

public class Housekeeping extends Pegawai {
    private List<String> daftarKamarTugas;
    private double performanceRating; //Ini apa yah?

    // Konstruktor
    public Housekeeping() {
        super();
        this.shift = "";
        this.daftarKamarTugas = new ArrayList<>();
        this.performanceRating = 0.0;
    }

    public Housekeeping(String idPegawai, String nama, String alamat, String shift) {
        super(idPegawai, nama, alamat, "Housekeeping", shift);
        this.shift = shift;
        this.daftarKamarTugas = new ArrayList<>();
        this.performanceRating = 0.0;
    }

    // Selektor 
    public List<String> getDaftarKamarTugas() {
        return daftarKamarTugas;
    }

    public double getPerformanceRating() {
        return performanceRating;
    }

    // Mutator 
    public void setDaftarKamarTugas(List<String> daftarKamarTugas) {
        this.daftarKamarTugas = daftarKamarTugas;
    }
    public void setPerformanceRating(double performanceRating) {
        this.performanceRating = performanceRating;
    }

    // Method untuk mengubah shift kerja
    public void ubahShift(String shiftBaru) {
        this.shift = shiftBaru;
        System.out.println("Shift Housekeeping telah diubah ke: " + shiftBaru);
    }

    // Method untuk menambahkan kamar ke daftar tugas
    public void assignKamar(String nomorKamar) {
        if (!daftarKamarTugas.contains(nomorKamar)) {
            daftarKamarTugas.add(nomorKamar);
            System.out.println("Kamar " + nomorKamar + " telah ditugaskan.");
        } else {
            System.out.println("Kamar " + nomorKamar + " sudah ada dalam daftar tugas.");
        }
    }

    // Method untuk menghapus kamar dari daftar tugas
    public void removeKamar(String nomorKamar) {
        if (daftarKamarTugas.remove(nomorKamar)) {
            System.out.println("Kamar " + nomorKamar + " telah dihapus dari daftar tugas.");
        } else {
            System.out.println("Kamar " + nomorKamar + " tidak ditemukan dalam daftar tugas.");
        }
    }

    // Method untuk memperbarui performance rating
    public void updatePerformanceRating(double ratingBaru) {
        if (ratingBaru >= 0 && ratingBaru <= 5) {
            this.performanceRating = ratingBaru;
            System.out.println("Performance rating diupdate ke: " + ratingBaru);
        } else {
            System.out.println("Rating harus antara 0 dan 5.");
        }
    }

    // Method untuk menampilkan daftar kamar tugas
    public void tampilkanDaftarKamarTugas() {
        System.out.println("Daftar kamar tugas: " + daftarKamarTugas);
    }

    // Method untuk menampilkan data lengkap housekeeping
    @Override
    public void tunjukkanData() {
        super.tunjukkanData();
        System.out.println("Shift: " + shift);
        System.out.println("Daftar kamar tugas: " + daftarKamarTugas);
        System.out.println("Performance Rating: " + performanceRating);
    }
    
    // Contoh method untuk membersihkan kamar
    public void bersihkanKamar(Kamar kamar) {
        kamar.setStatusKamar("Tersedia");
        System.out.println("Housekeeping " + nama + " telah membersihkan kamar " + kamar.getNomorKamar());
    }
}
