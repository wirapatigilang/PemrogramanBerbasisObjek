import java.util.ArrayList;
import java.util.List;

public class Pelanggan {
    private String nama;
    private String alamat;
    private String nomorTelpon;
    private String email;
    private List<PesananKamar> daftarPesanan;

    // Konstruktor
    public Pelanggan () {
        this.nama = "";
        this.alamat = "";
        this.nomorTelpon = "";
        this.email = "";
        this.daftarPesanan = new ArrayList<>();
    }
 
    public Pelanggan (String nama, String alamat, String nomorTelpon, String email, List<PesananKamar> daftarPesanan) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelpon = nomorTelpon;
        this.email = email;
        this.daftarPesanan = daftarPesanan != null ? daftarPesanan : new ArrayList<>();
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
    public List<PesananKamar> getDaftarPesanan() {
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
    public void setDaftarPesanan(List<PesananKamar> daftarPesanan) {
        this.daftarPesanan = daftarPesanan;
    }

    public void tambahPesanan(PesananKamar pesanan) {
        this.daftarPesanan.add(pesanan);
        pesanan.setPelanggan(this);
    }

    public void infoPelanggan() {
        System.out.println("Nama : " + getNama());
        System.out.println("Alamat : " + getAlamat());
        System.out.println("Nomor Telepon : " + getNomorTelpon());
        System.out.println("Daftar Pesanan");
        for (PesananKamar pesanan : getDaftarPesanan()) {
            System.out.println("Nomor Pesanan: " + pesanan.getNomorPesanan());
        }
    }
}