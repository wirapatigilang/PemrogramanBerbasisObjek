import java.time.LocalDate;

public class Pembayaran {
    private String MetodePembayaran;
    private double JumlahBayar;
    private String StatusPembayaran;
    private LocalDate TanggalPembayaran;

    public Pembayaran(String MetodePembayaran, double JumlahBayar, String StatusPembayaran, LocalDate TanggalPembayaran) {
        this.MetodePembayaran = MetodePembayaran;
        this.JumlahBayar = JumlahBayar;
        this.StatusPembayaran = StatusPembayaran;
        this.TanggalPembayaran = TanggalPembayaran;
    }

    public String getMetodePembayaran() {
        return MetodePembayaran;
    }

    public void setMetodePembayaran(String MetodePembayaran) {
        this.MetodePembayaran = MetodePembayaran;
    }

    public double getJumlahBayar() {
        return JumlahBayar;
    }

    public void setJumlahBayar(double JumlahBayar) {
        this.JumlahBayar = JumlahBayar;
    }

    public String getStatusPembayaran() {
        return StatusPembayaran;
    }

    public void setStatusPembayaran(String StatusPembayaran) {
        this.StatusPembayaran = StatusPembayaran;
    }

    public LocalDate getTanggalPembayaran() {
        return TanggalPembayaran;
    }

    public void setTanggalPembayaran(LocalDate TanggalPembayaran) {
        this.TanggalPembayaran = TanggalPembayaran;
    }

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

    public boolean prosesPembayaran(){
        if (!validasiPembayaran()){
            return false;
        }

        this.StatusPembayaran = "Lunas";
        this.TanggalPembayaran = LocalDate.now();
        System.out.println("Pembayaran berhasil : " + JumlahBayar + " dengan metode pembayaran melalui " + MetodePembayaran);
        return true;
    }
}



