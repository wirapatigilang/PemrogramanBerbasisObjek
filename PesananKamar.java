import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PesananKamar {
    private Pelanggan pelanggan;
    private String nomorPesanan;
    private LocalDate tanggalCheckIn;
    private LocalDate tanggalCheckOut;
    private String statusPesanan;
    private List<Kamar> daftarKamar;

    // Konstruktor
    public PesananKamar() {
        this.pelanggan = null;
        this.nomorPesanan = "";
        this.tanggalCheckIn = null;
        this.tanggalCheckOut = null;
        this.statusPesanan = "Ongoing";
        this.daftarKamar = new ArrayList<>();
    }

    public PesananKamar(Pelanggan pelanggan, String nomorPesanan, LocalDate tanggalCheckIn, LocalDate tanggalCheckOut, String statusPesanan, List<Kamar> daftarKamar) {
        this.pelanggan = pelanggan;
        this.nomorPesanan = nomorPesanan;
        this.tanggalCheckIn = tanggalCheckIn;
        this.tanggalCheckOut = tanggalCheckOut;
        this.statusPesanan = statusPesanan;
        this.daftarKamar = daftarKamar;
    }

    // Selektor
    public Pelanggan getPelanggan() {
        return pelanggan;
    }
    public String getNomorPesanan() {
        return nomorPesanan;
    }
    public LocalDate getTanggalCheckIn() {
        return tanggalCheckIn;
    }
    public LocalDate getTanggalCheckOut() {
        return tanggalCheckOut;
    }
    public String getStatusPesanan() {
        return statusPesanan;
    }
    public List<Kamar> getDaftarKamar() {
        return daftarKamar;
    }

    // Mutator
    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }
    public void setNomorPesanan(String nomorPesanan) {
        this.nomorPesanan = nomorPesanan;
    }
    public void setTanggalCheckIn(LocalDate tanggalCheckIn) {
        this.tanggalCheckIn = tanggalCheckIn;
    }
    public void setTanggalCheckOut(LocalDate tanggalCheckOut) {
        this.tanggalCheckOut = tanggalCheckOut;
    }
    public void setStatusPesanan(String statusPesanan) {
        this.statusPesanan = statusPesanan;
    }
    public void setDaftarKamar(List<Kamar> daftarKamar) {
        this.daftarKamar = daftarKamar;
    }

    // Method untuk menambahkan kamar
    public void tambahKamar(Kamar kamar) {
        this.daftarKamar.add(kamar);
        
    }

    // Method untuk menampilkan informasi lengkap Pesanan Kamar
    public void infoPesananKamar() {
        System.out.println("Nomor Pesanan: " + nomorPesanan);
        System.out.println("Pelanggan: " + (pelanggan != null ? pelanggan.getNama() : "Tidak ada"));
        System.out.println("Tanggal Check-In: " + (tanggalCheckIn != null ? tanggalCheckIn : "Belum ditentukan"));
        System.out.println("Tanggal Check-Out: " + (tanggalCheckOut != null ? tanggalCheckOut : "Belum ditentukan"));
        System.out.println("Status Pesanan: " + statusPesanan);
        System.out.println("Daftar Kamar: ");
        for (Kamar kamar : daftarKamar) {
            kamar.infoKamar();
        }
    }
}
