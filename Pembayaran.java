import java.time.LocalDate;

public class Pembayaran {
    private PesananKamar pesananKamar;
    private String MetodePembayaran;
    private double JumlahBayar;
    private String StatusPembayaran;
    private LocalDate TanggalPembayaran;
    public int lamaMenginap;


    // Konstruktor
    public Pembayaran() {
        this.pesananKamar = null;
        this.MetodePembayaran = "Tunai";
        this.JumlahBayar = 0.0;
        this.StatusPembayaran = "Pending";
        this.TanggalPembayaran = LocalDate.now();
    }

    public Pembayaran(PesananKamar pesananKamar, String MetodePembayaran, LocalDate TanggalPembayaran) {
        this.pesananKamar = pesananKamar;
        this.MetodePembayaran = MetodePembayaran;
        this.JumlahBayar = hitungTotal();
        this.StatusPembayaran = "Belum Lunas";
        this.TanggalPembayaran = TanggalPembayaran;
    }

    // Selektor
    public String getMetodePembayaran() {
        return MetodePembayaran;
    }
    public double getJumlahBayar() {
        return JumlahBayar;
    }
    public String getStatusPembayaran() {
        return StatusPembayaran;
    }
    public LocalDate getTanggalPembayaran() {
        return TanggalPembayaran;
    }

    // Mutator
    public void setMetodePembayaran(String MetodePembayaran) {
        this.MetodePembayaran = MetodePembayaran;
    }
    public void setJumlahBayar(double JumlahBayar) {
        this.JumlahBayar = JumlahBayar;
    }
    public void setStatusPembayaran(String StatusPembayaran) {
        this.StatusPembayaran = StatusPembayaran;
    }
    public void setTanggalPembayaran(LocalDate TanggalPembayaran) {
        this.TanggalPembayaran = TanggalPembayaran;
    }

    // Method untuk memvalidasi pembayaran, if pembayaran is valid
    public boolean validasiPembayaran(){
        if (JumlahBayar <= 0){
            return false;
        }
        if (MetodePembayaran.equals("Kartu Kredit") || MetodePembayaran.equals("Debit") || MetodePembayaran.equals("Transfer")){
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
            if (bayar < JumlahBayar) {
                JumlahBayar -= bayar;
                System.err.printf("Pembayaran Anda Kurang: Rp %.2f%n", JumlahBayar);
            } else if (bayar > JumlahBayar) {
                this.StatusPembayaran = "Lunas";
                this.TanggalPembayaran = LocalDate.now();
                double susuk = bayar - JumlahBayar;
                System.out.printf("Pembayaran berhasil: Rp %.2f dengan metode pembayaran melalui %s%n", JumlahBayar, MetodePembayaran);
                System.out.printf("Kembalian Anda: Rp %.2f%n", susuk);
                JumlahBayar = 0;
            } else {
                this.StatusPembayaran = "Lunas";
                this.TanggalPembayaran = LocalDate.now();
                System.out.printf("Pembayaran berhasil: Rp %.2f dengan metode pembayaran melalui %s%n", JumlahBayar, MetodePembayaran);
                System.out.println("Pembayaran Valid");
                JumlahBayar = 0;
            }
        }
    }

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
        System.out.printf("Metode Pembayaran : %s%n", MetodePembayaran);
        System.out.printf("Lama Menginap     : %d hari%n", pesananKamar.getTanggalCheckIn().until(pesananKamar.getTanggalCheckOut()).getDays());
        System.out.printf("Status Pembayaran : %s%n", StatusPembayaran);
        System.out.printf("Tanggal Pembayaran: %s%n", TanggalPembayaran);
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