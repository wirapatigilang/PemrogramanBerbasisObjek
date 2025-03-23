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

    public Resepsionis(String idPegawai, String nama, String alamat, String email, String bahasa) {
        super(idPegawai, nama, alamat, email);
        this.bahasaYangDikuasai = new ArrayList<>();
        this.bahasaYangDikuasai.add(bahasa);
    }

    // Selektor 
    public List<String> getBahasaYangDikuasai() {
        return new ArrayList<>(bahasaYangDikuasai);
    }

    // Mutator 
    public void setBahasaYangDikuasai(List<String> bahasaYangDikuasai) {
        this.bahasaYangDikuasai = new ArrayList<>(bahasaYangDikuasai);
    }

    // Method untuk membantu pelanggan check-in pada tanggal sekarang
    public void checkIn(Pelanggan pelanggan){
        pelanggan.getDaftarPesanan().setTanggalCheckIn(LocalDate.now());
        for (Kamar kamar : pelanggan.getDaftarPesanan().getDaftarKamar()) {
            kamar.setStatusKebersihan("Kotor"); 
            kamar.setStatusKamar("Tidak Tersedia");
        }
        System.out.println("CheckIn Berhasil");
    }

    // Method untuk membantu pelanggan check-in pada tanggal yang ditentukan pelanggan
    public void checkIn(Pelanggan pelanggan, LocalDate tanggal){
        pelanggan.getDaftarPesanan().setTanggalCheckIn(tanggal);
        for (Kamar kamar : pelanggan.getDaftarPesanan().getDaftarKamar()) {
            kamar.setStatusKebersihan("Kotor");
            kamar.setStatusKamar("Tidak Tersedia");
        }
        System.out.println("CheckIn Berhasil");
    }

    // Method untuk membantu pelanggan check-out
    public void checkOut(Pelanggan pelanggan) {
        if (pelanggan == null || pelanggan.getDaftarPesanan() == null) {
            System.out.println("Pelanggan atau daftar pesanan tidak valid");
            return;
        }
        
        pelanggan.getDaftarPesanan().setTanggalCheckOut(LocalDate.now());

        for (Kamar kamar : pelanggan.getDaftarPesanan().getDaftarKamar()) {
            if (kamar != null) {
                kamar.setStatusKamar("Tersedia");
            }
        }
        pelanggan.getDaftarPesanan().setStatusPesanan("Finished");
        pelanggan.getDaftarPesanan().setPelanggan(null);
        pelanggan.setDaftarPesanan(null);

        System.out.println("CheckOut Berhasil");
    }

    // Method untuk menampilkan data lengkap resepsionis
    @Override
    public void infoPegawai() {
        super.infoPegawai();
        System.out.println("Bahasa yang dikuasai: " + String.join(", ", bahasaYangDikuasai));
    }
}