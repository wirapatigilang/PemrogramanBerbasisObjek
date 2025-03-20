public class Kamar {
    private String nomorKamar;
    private String statusKamar;
    private TipeKamar tipe;

    public Kamar() {

    }

    public Kamar (String nomorKamar, String statusKamar, TipeKamar tipe) {
        this.nomorKamar = nomorKamar;
        this.statusKamar = statusKamar;
        this.tipe = tipe;
    }

    public String getNomorKamar (){
        return this.nomorKamar;
    }

    public String getStatusKamar () {
        return this.statusKamar;
    }

    public TipeKamar getTipe () {
        return this.tipe;
    }

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
