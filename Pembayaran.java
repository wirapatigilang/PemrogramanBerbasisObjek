import java.time.LocalDate;

public class Pembayaran {
    private PesananKamar pesananKamar;
    private String metodePembayaran;
    private double jumlahBayar;
    private String statusPembayaran;
    private LocalDate tanggalPembayaran;
    public int lamaMenginap;


    // Konstruktor
    public Pembayaran() {
        this.pesananKamar = null;
        this.metodePembayaran = "Tunai";
        this.jumlahBayar = 0.0;
        this.statusPembayaran = "Pending";
        this.tanggalPembayaran = LocalDate.now();
    }

    public Pembayaran(PesananKamar pesananKamar, String metodePembayaran, LocalDate tanggalPembayaran) {
        this.pesananKamar = pesananKamar;
        this.metodePembayaran = metodePembayaran;
        this.jumlahBayar = hitungTotal();
        this.statusPembayaran = "Belum Lunas";
        this.tanggalPembayaran = tanggalPembayaran;
    }

    // Selektor
    public String getmetodePembayaran() {
        return metodePembayaran;
    }
    public double getJumlahBayar() {
        return jumlahBayar;
    }
    public String getstatusPembayaran() {
        return statusPembayaran;
    }
    public LocalDate gettanggalPembayaran() {
        return tanggalPembayaran;
    }
    public PesananKamar getPesananKamar() {
        return pesananKamar;
    }
    public int getLamaMenginap() {
        return lamaMenginap;
    }

    // Mutator
    public void setmetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }
    public void setJumlahBayar(double jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }
    public void setstatusPembayaran(String statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }
    public void settanggalPembayaran(LocalDate tanggalPembayaran) {
        this.tanggalPembayaran = tanggalPembayaran;
    }
    public void setPesananKamar(PesananKamar pesananKamar) {
        this.pesananKamar = pesananKamar;
    }
    public void setLamaMenginap(int lamaMenginap) {
        this.lamaMenginap = lamaMenginap;
    }

    // Method untuk memvalidasi pembayaran, if pembayaran is valid
    public boolean validasiPembayaran(){
        if (jumlahBayar <= 0){
            return false;
        }
        if (metodePembayaran.equals("Kartu Kredit") || metodePembayaran.equals("Debit") || metodePembayaran.equals("Transfer")){
            return true;
        } else {
            return false;
        }
    }

    // Method untuk melakukan proses pembayaran
    public void prosesPembayaran(double bayar) {
        if (!validasiPembayaran()) {
            System.err.println("Pembayaran Tidak Valid");
        } else {
            if (bayar < jumlahBayar) {
                jumlahBayar -= bayar;
                System.err.printf("Pembayaran Anda Kurang: Rp %.2f%n", jumlahBayar);
            } else if (bayar > jumlahBayar) {
                this.statusPembayaran = "Lunas";
                this.tanggalPembayaran = LocalDate.now();
                double susuk = bayar - jumlahBayar;
                System.out.printf("Pembayaran berhasil: Rp %.2f dengan metode pembayaran melalui %s%n", jumlahBayar, metodePembayaran);
                System.out.printf("Kembalian Anda: Rp %.2f%n", susuk);
                jumlahBayar = 0;
            } else {
                this.statusPembayaran = "Lunas";
                this.tanggalPembayaran = LocalDate.now();
                System.out.printf("Pembayaran berhasil: Rp %.2f dengan metode pembayaran melalui %s%n", jumlahBayar, metodePembayaran);
                System.out.println("Pembayaran Valid");
                jumlahBayar = 0;
            }
        }
    }

    // Method untuk menghitung total harga
    public double hitungTotal(){
        double totalHarga = 0;
        lamaMenginap = pesananKamar.getTanggalCheckIn().until(pesananKamar.getTanggalCheckOut()).getDays(); 
        if (lamaMenginap == 0) {
            lamaMenginap += 1;
        }
        for(Kamar kamar : pesananKamar.getDaftarKamar()) {
            totalHarga += kamar.getTipe().getHarga() * lamaMenginap;
        }
        setJumlahBayar(totalHarga);
        return totalHarga;

    }

    // Method untuk menampilkan informasi pembayaran
    public void infoPembayaran() {
        System.out.println("\n=== Informasi Pembayaran ===");
        System.out.printf("Metode Pembayaran : %s%n", metodePembayaran);
        System.out.printf("Lama Menginap     : %d hari%n", pesananKamar.getTanggalCheckIn().until(pesananKamar.getTanggalCheckOut()).getDays());
        System.out.printf("Status Pembayaran : %s%n", statusPembayaran);
        System.out.printf("Tanggal Pembayaran: %s%n", tanggalPembayaran);
        System.out.println("\n--- Rincian Harga Per Kamar ---");
    
        long lamaMenginap = pesananKamar.getTanggalCheckIn().until(pesananKamar.getTanggalCheckOut()).getDays();
        double totalHarga = 0;
        if (lamaMenginap == 0) {
            lamaMenginap += 1;
        }
        for (Kamar kamar : pesananKamar.getDaftarKamar()) {
            double hargaPerMalam = kamar.getTipe().getHarga();
            double subtotal = hargaPerMalam * lamaMenginap;
            totalHarga += subtotal;
    
            System.out.printf("Kamar            : %s%n", kamar.getNomorKamar());
            System.out.printf("Tipe             : %s%n", kamar.getTipe().getNamaTipe());
            System.out.printf("Harga per malam  : Rp %.2f%n", hargaPerMalam);
            System.out.printf("Total untuk %d malam: Rp %.2f%n", lamaMenginap, subtotal);
            System.out.println("-----------------------------");
        }
    
        System.out.printf("Total Pembayaran : Rp %.2f%n", totalHarga);
    }
}