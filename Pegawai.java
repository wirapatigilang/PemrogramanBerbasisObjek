public abstract class Pegawai {
    protected String idPegawai;
    protected String nama;
    protected String alamat;
    protected String email;
    protected String shift; // Tolong tinjau lagi, ini perlu apa engga. And maksudnya shift pagi siang sore malem gtu?

    // Konstruktor
    public Pegawai() {
        this.idPegawai = "";
        this.nama = "";
        this.alamat = "";
        this.email = "";
        this.shift = "";
    }

    public Pegawai(String idPegawai, String nama, String alamat, String email, String shift) {
        this.idPegawai = idPegawai;
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
        this.shift = shift;
    }

    // Selektor 
    public String getIdPegawai() {
        return idPegawai;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }

    // Mutator
    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Metode untuk menunjukkan data pegawai
    public void tunjukkanData() {
        System.out.println("ID Pegawai: " + idPegawai);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
    }
}
