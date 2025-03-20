import java.time.LocalDate;
import java.util.List;

public class PesananKamar {
    private Pelanggan pelanggan;
    private String nomorPesanan;
    private LocalDate tanggalCheckIn;
    private LocalDate tanggalCheckOut;
    private String statusPesanan;
    private List<Kamar> daftarKamar;

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

    public void tambahDaftarKamar(Kamar kamar) {
        this.daftarKamar.add(kamar);
    }
}
