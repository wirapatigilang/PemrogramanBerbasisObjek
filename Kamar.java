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

}
