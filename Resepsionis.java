import java.util.ArrayList;
import java.util.List;

public class Resepsionis extends Pegawai {
    // Atribut khusus
    private String shift;
    private String email;
    private List<String> bahasaYangDikuasai;

    // Konstruktor
    public Resepsionis() {
        super();
        this.email = "";
        this.shift = "";
        this.bahasaYangDikuasai = new ArrayList<>();
    }

    public Resepsionis(String idPegawai, String nama, String alamat, String email, String shift) {
        super(idPegawai, nama, alamat, "Resepsionis");
        this.email = email;
        this.shift = shift;
        this.bahasaYangDikuasai = new ArrayList<>();
    }

    // Selektor 
    public String getShift() {
        return shift;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getBahasaYangDikuasai() {
        return new ArrayList<>(bahasaYangDikuasai);
    }

    // Mutator 
    public void setShift(String shift) {
        this.shift = shift;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBahasaYangDikuasai(List<String> bahasaYangDikuasai) {
        this.bahasaYangDikuasai = new ArrayList<>(bahasaYangDikuasai);
    }

    // Method untuk mengubah shift kerja
    public void ubahShift(String shiftBaru) {
        this.shift = shiftBaru;
        System.out.println("Shift telah diubah ke: " + shiftBaru);
    }

    // Method untuk mengupdate email
    public void updateEmail(String emailBaru) {
        this.email = emailBaru;
        System.out.println("Email telah diupdate ke: " + emailBaru);
    }

    // Method untuk menambahkan bahasa yang dikuasai
    public void tambahBahasa(String bahasa) {
        if (!bahasaYangDikuasai.contains(bahasa)) {
            bahasaYangDikuasai.add(bahasa);
            System.out.println("Bahasa " + bahasa + " ditambahkan.");
        } else {
            System.out.println("Bahasa " + bahasa + " sudah ada.");
        }
    }

    // Method untuk menghapus bahasa yang dikuasai
    public void hapusBahasa(String bahasa) {
        if (bahasaYangDikuasai.remove(bahasa)) {
            System.out.println("Bahasa " + bahasa + " dihapus.");
        } else {
            System.out.println("Bahasa " + bahasa + " tidak ditemukan.");
        }
    }

    // Method untuk menampilkan data lengkap resepsionis
    @Override
    public void tunjukkanData() {
        super.tunjukkanData();
        System.out.println("Email: " + email);
        System.out.println("Shift: " + shift);
        System.out.println("Bahasa yang dikuasai: " + bahasaYangDikuasai);
    }
    
    // Contoh method untuk menerima reservasi (menggunakan method sebelumnya)
    public void terimaReservasi(PesananKamar pesanan) {
        System.out.println("Resepsionis " + nama + " menerima reservasi dengan nomor: " + pesanan.getNomorPesanan());
        // Logika tambahan untuk memproses reservasi...
    }
}
