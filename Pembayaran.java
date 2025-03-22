import java.time.LocalDate;

public class Pembayaran {
    private String MetodePembayaran;
    private double JumlahBayar;
    private String StatusPembayaran;
    private LocalDate TanggalPembayaran;

    // Konstruktor
    public Pembayaran() {
        this.MetodePembayaran = "Tunai";
        this.JumlahBayar = 0.0;
        this.StatusPembayaran = "Pending";
        this.TanggalPembayaran = LocalDate.now();
    }

    public Pembayaran(String MetodePembayaran, double JumlahBayar, String StatusPembayaran, LocalDate TanggalPembayaran) {
        this.MetodePembayaran = MetodePembayaran;
        this.JumlahBayar = JumlahBayar;
        this.StatusPembayaran = StatusPembayaran;
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
            System.out.println("Jumlah pembayaran tidak valid");
            return false;
        }

        if (MetodePembayaran.equals("Kartu Kredit") || MetodePembayaran.equals("Debit") || MetodePembayaran.equals("Transfer")){
            System.out.println("Validasi berhasil");
            return true;
        } else {
            System.out.println("Metode pembayaran tidak valid");
            return false;
            
        }
    }

    // Method untuk melakukan proses pembayaran
    public boolean prosesPembayaran(){
        if (!validasiPembayaran()){
            return false;
        }

        this.StatusPembayaran = "Lunas";
        this.TanggalPembayaran = LocalDate.now();
        System.out.println("Pembayaran berhasil : " + JumlahBayar + " dengan metode pembayaran melalui " + MetodePembayaran);
        return true;
    }

    // Method untuk menampilkan informasi pembayaran
    public void infoPembayaran() {
        System.out.println("Metode Pembayaran: " + MetodePembayaran);
        System.out.println("Jumlah Bayar: " + JumlahBayar);
        System.out.println("Status Pembayaran: " + StatusPembayaran);
        System.out.println("Tanggal Pembayaran: " + TanggalPembayaran);
    }
}