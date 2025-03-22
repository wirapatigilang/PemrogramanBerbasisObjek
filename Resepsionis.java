import java.time.LocalDate;
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

    public void checkIn(Pelanggan pelanggan){
        pelanggan.getDaftarPesanan().setTanggalCheckIn(LocalDate.now());
        for (Kamar kamar : pelanggan.getDaftarPesanan().getDaftarKamar()) {
            kamar.setStatusKebersihan("Kotor"); 
        }
        System.out.println("Sudah Bisa Checkin");

    
    }

    public void checkIn(Pelanggan pelanggan, LocalDate tanggal){
        pelanggan.getDaftarPesanan().setTanggalCheckIn(tanggal);
        for (Kamar kamar : pelanggan.getDaftarPesanan().getDaftarKamar()) {
            kamar.setStatusKebersihan("Kotor"); 
        }
        System.out.println("Sudah Bisa Checkin");
    
    }

    

    public void checkOut(Pelanggan pelanggan){
        pelanggan.getDaftarPesanan().setTanggalCheckOut(LocalDate.now());
        for (Kamar kamar : pelanggan.getDaftarPesanan().getDaftarKamar()) {
            kamar.setStatusKamar("Tersedia");
        }
        pelanggan.getDaftarPesanan().setStatusPesanan("Finished");
        pelanggan.getDaftarPesanan().setPelanggan(null);
        System.out.println("Sudah Bisa Checkout");


    }

    // Method untuk menampilkan data lengkap resepsionis
    @Override
    public void tunjukkanData() {
        super.tunjukkanData();
        System.out.println("Bahasa yang dikuasai: " + String.join(", ", bahasaYangDikuasai));
    }
}