public class Kamar {
    private String nomorKamar;
    private String statusKamar;
    private TipeKamar tipe;
    private String statusKebersihan;

    // Konstruktor
    public Kamar() {
        this.nomorKamar = "";
        this.statusKamar = "";
        this.tipe = new TipeKamar();
        this.statusKebersihan = "";
    }

    public Kamar (String nomorKamar, String statusKamar, TipeKamar tipe) {
        this.nomorKamar = nomorKamar;
        this.statusKamar = statusKamar;
        this.tipe = tipe;
        this.statusKebersihan = "Bersih";
    }

    // Selektor
    public String getNomorKamar (){
        return nomorKamar;
    }
    public String getStatusKamar () {
        return statusKamar;
    }
    public TipeKamar getTipe () {
        return tipe;
    }
    public String getStatusKebersihan () {
        return statusKebersihan;
    }


    // Mutator
    public void setNomorKamar (String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }
    public void setStatusKamar(String status) {
        this.statusKamar = status;
    }
    public void setTipe (TipeKamar tipe) {
        this.tipe = tipe;
    }
    public void setStatusKebersihan (String statusKebersihan) {
        this.statusKebersihan = statusKebersihan;
    }

    // Method untuk mengecek ketersediaan suatu kamar
    public boolean cekKetersediaan() {
        return this.statusKamar.equalsIgnoreCase("tersedia");
    }

    // Method untuk menampilkan informasi kamar
    public void infoKamar() {
        System.out.println("Nomor Kamar: " + this.getNomorKamar());
        System.out.println("Status Kamar: " + this.getStatusKamar());
        System.out.println("Tipe Kamar: " + this.getTipe().getNamaTipe());
        System.out.println("Status Kebersihan: " + this.getStatusKebersihan());
    }
}
