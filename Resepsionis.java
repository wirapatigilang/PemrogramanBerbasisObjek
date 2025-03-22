import java.util.ArrayList;
import java.util.List;

public class Resepsionis extends Pegawai {
    private List<String> bahasaYangDikuasai;

    // Konstruktor
    public Resepsionis() {
        super();
        this.bahasaYangDikuasai = new ArrayList<>();
    }

    public Resepsionis(String idPegawai, String nama, String alamat, String email, String shift) {
        super(idPegawai, nama, alamat, "Resepsionis", shift);
        this.bahasaYangDikuasai = new ArrayList<>();
    }

    // Selektor 
    public List<String> getBahasaYangDikuasai() {
        return new ArrayList<>(bahasaYangDikuasai);
    }

    // Mutator 
    public void setBahasaYangDikuasai(List<String> bahasaYangDikuasai) {
        this.bahasaYangDikuasai = new ArrayList<>(bahasaYangDikuasai);
    }

    // Method untuk menampilkan data lengkap resepsionis
    @Override
    public void tunjukkanData() {
        super.tunjukkanData();
        System.out.println("Bahasa yang dikuasai: " + String.join(", ", bahasaYangDikuasai));
    }
    
    public PesananKamar membuatPesananKamar(Pelanggan pelanggan, String nomorPesanan) {
        return new PesananKamar(pelanggan, nomorPesanan, null, null, "Ongoing", new ArrayList<>());
    }

    // Contoh method untuk menerima reservasi (menggunakan method sebelumnya)
    public void terimaReservasi(Pelanggan pelanggan, Kamar kamar, String noPesanan) {
        PesananKamar nota = membuatPesananKamar(pelanggan, noPesanan);
        pelanggan.setDaftarPesanan(nota);
        pelanggan.tambahPesanan(kamar);
    }
}
