import java.time.LocalDate;
import java.util.List;

public class PesananKamar {
    private Pelanggan pelanggan;
    private String nomorPesanan;
    private LocalDate tanggalCheckIn;
    private LocalDate tanggalCheckOut;
    private String statusPesanan;
    private List<Kamar> daftarKamar;

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public String getNomorPesanan() {
        return nomorPesanan;
    }

    public void setNomorPesanan(String nomorPesanan) {
        this.nomorPesanan = nomorPesanan;
    }

    public LocalDate getTanggalCheckIn() {
        return tanggalCheckIn;
    }

    public void setTanggalCheckIn(LocalDate tanggalCheckIn) {
        this.tanggalCheckIn = tanggalCheckIn;
    }

    public LocalDate getTanggalCheckOut() {
        return tanggalCheckOut;
    }

    public void setTanggalCheckOut(LocalDate tanggalCheckOut) {
        this.tanggalCheckOut = tanggalCheckOut;
    }

    public String getStatusPesanan() {
        return statusPesanan;
    }

    public void setStatusPesanan(String statusPesanan) {
        this.statusPesanan = statusPesanan;
    }

    public List<Kamar> getDaftarKamar() {
        return daftarKamar;
    }

    public void setDaftarKamar(List<Kamar> daftarKamar) {
        this.daftarKamar = daftarKamar;
    }

}
