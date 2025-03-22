public class Kamar {
    private String nomorKamar;
    private String statusKamar;
    private TipeKamar tipe;

    // Konstruktor
    public Kamar() {
        this.nomorKamar = "";
        this.statusKamar = "";
        this.tipe = new TipeKamar();
    }

    public Kamar (String nomorKamar, String statusKamar, TipeKamar tipe) {
        this.nomorKamar = nomorKamar;
        this.statusKamar = statusKamar;
        this.tipe = tipe;
    }

    // Selektor
    public String getNomorKamar (){
        return this.nomorKamar;
    }
    public String getStatusKamar () {
        return this.statusKamar;
    }
    public TipeKamar getTipe () {
        return this.tipe;
    }

    // Mutator
    public void setNomorKamar (String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }
    public void setStatusKamar (String statusKamar) {
        this.statusKamar = statusKamar;
    }
    public void setTipe (TipeKamar tipe) {
        this.tipe = tipe;
    }

    // Method untuk mengecek ketersediaan suatu kamar
    public boolean cekKetersediaan() {
        return this.statusKamar.equalsIgnoreCase("tersedia");
    }

    // Method untuk menampilkan informasi kamar
    public void infoKamar() {
        System.out.println("Nomor Kamar: " + this.nomorKamar);
        System.out.println("Status Kamar: " + this.statusKamar);
        System.out.println("Tipe Kamar: " + this.tipe.getNamaTipe());
    }
}
