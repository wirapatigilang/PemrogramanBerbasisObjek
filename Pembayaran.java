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
    public void  prosesPembayaran(double bayar){
        if (!validasiPembayaran()){
            System.err.println("Pembayaran Tidak Valid"); ;
        }
        else {
            if (bayar < JumlahBayar) {
                JumlahBayar = JumlahBayar - bayar;
                System.err.println("Pembayaran Anda Kurang : " + JumlahBayar);
            }
            else if (bayar>JumlahBayar) {
                this.StatusPembayaran = "Lunas";
                this.TanggalPembayaran = LocalDate.now();
                double susuk = bayar - JumlahBayar;
                System.out.println("Pembayaran berhasil : Rp " + JumlahBayar + " dengan metode pembayaran melalui " + MetodePembayaran);
                System.out.println("Kembalian Anda : Rp " + susuk);
                JumlahBayar = 0;
            }
            else {
                this.StatusPembayaran = "Lunas";
                this.TanggalPembayaran = LocalDate.now();
                System.out.println("Pembayaran berhasil : Rp" + JumlahBayar + " dengan metode pembayaran melalui " + MetodePembayaran);
                System.err.println("Pembayaran Valid");
                JumlahBayar = 0;
            }
        }
    }

    public double hitungTotal(){
        double totalHarga = 0;
        lamaMenginap = pesananKamar.getTanggalCheckIn().until(pesananKamar.getTanggalCheckOut()).getDays(); 

        for(Kamar kamar : pesananKamar.getDaftarKamar()) {
            totalHarga += kamar.getTipe().getHarga() * lamaMenginap;
        }
        setJumlahBayar(totalHarga);
        return totalHarga;

    }

    // Method untuk menampilkan informasi pembayaran
    public void infoPembayaran() {
        System.out.println("\n=== Informasi Pembayaran ===");
        System.out.println("Metode Pembayaran: " + MetodePembayaran);
        System.out.println("Lama Menginap: " + pesananKamar.getTanggalCheckIn().until(pesananKamar.getTanggalCheckOut()).getDays() + " hari");
        System.out.println("Status Pembayaran: " + StatusPembayaran);
        System.out.println("Tanggal Pembayaran: " + TanggalPembayaran);
        System.out.println("\n--- Rincian Harga Per Kamar ---");
    
        long lamaMenginap = pesananKamar.getTanggalCheckIn().until(pesananKamar.getTanggalCheckOut()).getDays();
        double totalHarga = 0;
    
        for (Kamar kamar : pesananKamar.getDaftarKamar()) {
            double hargaPerMalam = kamar.getTipe().getHarga();
            double subtotal = hargaPerMalam * lamaMenginap;
            totalHarga += subtotal;
    
            System.out.println("Kamar: " + kamar.getNomorKamar());
            System.out.println("Tipe: " + kamar.getTipe().getNamaTipe());
            System.out.println("Harga per malam: Rp " + hargaPerMalam);
            System.out.println("Total untuk " + lamaMenginap + " malam: Rp " + subtotal);
            System.out.println("-----------------------------");
        }
    
        System.out.println("Total Pembayaran: Rp " + totalHarga);
    }
}