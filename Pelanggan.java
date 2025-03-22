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
        kamar.setStatusKamar("Tidak Tersedia");
        this.daftarPesanan.tambahKamar(kamar);
    }

    // Method untuk menampilkan data Pelanggan
    public void infoPelanggan() {
        System.out.println("=== Informasi Pelanggan ===");
        System.out.printf("Nama          : %s%n", getNama());
        System.out.printf("Alamat        : %s%n", getAlamat());
        System.out.printf("Nomor Telepon : %s%n", getNomorTelpon());
        System.out.printf("Email         : %s%n", getEmail());
        System.out.println("Daftar Pesanan:");
        if (this.daftarPesanan != null && !this.daftarPesanan.getDaftarKamar().isEmpty()) {
            for (Kamar kamar : this.daftarPesanan.getDaftarKamar()) {
                System.out.printf("  - Nomor Kamar: %s%n", kamar.getNomorKamar());
            }
        } else {
            System.out.println("  Tidak ada pesanan.");
        }
        System.out.println("===========================");
    }
}