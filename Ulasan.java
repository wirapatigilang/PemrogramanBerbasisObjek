import java.time.LocalDate;

public class Ulasan {
    private String IdUlasan;
    private Pelanggan pelanggan;
    private int rating;
    private String komentar;
    private LocalDate tanggalUlasan;

    // Konstruktor
    public Ulasan() {
        this.IdUlasan = "";
        this.pelanggan = new Pelanggan();
        this.rating = 0;
        this.komentar = "";
        this.tanggalUlasan = LocalDate.now();
    }

    public Ulasan(String IdUlasan, Pelanggan pelanggan, int rating, String komentar, LocalDate tanggalUlasan) throws Exception {
        this.IdUlasan = IdUlasan;
        this.pelanggan = pelanggan;
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
        System.out.println("\n=== Ulasan ===");
        System.out.printf("Id Ulasan       : %s%n", IdUlasan);
        System.out.printf("Pelanggan       : %s%n", pelanggan.getNama());
        System.out.printf("Rating          : %d bintang%n", rating);
        System.out.printf("Komentar        : %s%n", komentar);
        System.out.printf("Tanggal Ulasan  : %s%n", tanggalUlasan);
        System.out.println("================");
    }
}
