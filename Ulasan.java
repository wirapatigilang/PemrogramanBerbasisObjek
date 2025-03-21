import java.time.LocalDate;

public class Ulasan {
    private String IdUlasan;
    private Pelanggan pelanggan;
    private Kamar kamar;
    private int rating;
    private String komentar;
    private LocalDate tanggalUlasan;

    // Konstruktor
    public Ulasan() {
        this.IdUlasan = "";
        this.pelanggan = new Pelanggan();
        this.kamar = new Kamar();
        this.rating = 0;
        this.komentar = "";
        this.tanggalUlasan = LocalDate.now();
    }

    public Ulasan(String IdUlasan, Pelanggan pelanggan, Kamar kamar, int rating, String komentar, LocalDate tanggalUlasan) throws Exception {
        this.IdUlasan = IdUlasan;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        setRating(rating);
        this.komentar = komentar;
        this.tanggalUlasan = tanggalUlasan;
    }

    // Selektor
    public String getIdUlasan() {
        return IdUlasan;
    }
    public Pelanggan getPelanggan() {
        return pelanggan;
    }
    public Kamar getKamar() {
        return kamar;
    }
    public int getRating() {
        return rating;
    }       
    public String getKomentar() {
        return komentar;
    }
    public LocalDate getTanggalUlasan() {
        return tanggalUlasan;
    }

    // Mutator
    public void setIdUlasan(String IdUlasan) {
        this.IdUlasan = IdUlasan;
    }
    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }
    public void setKamar(Kamar kamar) {
        this.kamar = kamar;
    }
    public void setRating(int rating) throws Exception {
        if (rating < 0 || rating > 5) {
            throw new Exception("Rating harus diantara 0 sampai 5");
        }
        this.rating = rating;
    }
    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }
    public void setTanggalUlasan(LocalDate tanggalUlasan) {
        this.tanggalUlasan = tanggalUlasan;
    }

    // Method untuk menampilkan Ulasan
    public void printUlasan() {
        System.out.println("Id Ulasan : " + IdUlasan);
        System.out.println("Pelanggan : " + pelanggan.getNama());
        System.out.println("Kamar : " + kamar.getNomorKamar());
        System.out.println("Rating : " + rating + " bintang");
        System.out.println("Komentar : " + komentar);
        System.out.println("Tanggal Ulasan : " + tanggalUlasan);
    }
}
