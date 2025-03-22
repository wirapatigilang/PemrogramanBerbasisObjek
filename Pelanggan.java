import java.util.ArrayList;
import java.util.List;

public class Pelanggan {
    private String nama;
    private String alamat;
    private String nomorTelpon;
    private String email;
    private PesananKamar daftarPesanan;

    // Konstruktor
    public Pelanggan () {
        this.nama = "";
        this.alamat = "";
        this.nomorTelpon = "";
        this.email = "";
        this.daftarPesanan = null;
    }
 
    public Pelanggan (String nama, String alamat, String nomorTelpon, String email, PesananKamar daftarPesanan) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelpon = nomorTelpon;
        this.email = email;
        this.daftarPesanan = daftarPesanan;
    }

    // Selektor
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getNomorTelpon() {
        return nomorTelpon;
    }
    public String getEmail() {
        return email;
    }
    public PesananKamar getDaftarPesanan() {
        return daftarPesanan;
    }

    //Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setNomorTelpon(String nomorTelpon) {
        this.nomorTelpon = nomorTelpon;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setDaftarPesanan(PesananKamar daftarPesanan) {
        this.daftarPesanan = daftarPesanan;
    }

    // Method bagi Pelanggan untuk menambahkan suatu pesanan
    public void tambahPesanan(Kamar kamar) {
        this.daftarPesanan.tambahKamar(kamar);
    }

    public void reservasi(Kamar kamar, PesananKamar pesanan) {
        
    }

    public void pesan() {
        
    }

    // Method untuk menampilkan data Pelanggan
    public void infoPelanggan() {
        System.out.println("Nama : " + getNama());
        System.out.println("Alamat : " + getAlamat());
        System.out.println("Nomor Telepon : " + getNomorTelpon());
        System.out.println("Daftar Pesanan");
        for (Kamar kamar : this.daftarPesanan.getDaftarKamar()) {
            System.out.println("Nomor Pesanan: " + kamar.getNomorKamar());
        }
    }
}