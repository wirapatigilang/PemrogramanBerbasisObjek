public abstract class Pegawai {
    protected String idPegawai;
    protected String nama;
    protected String alamat;
    protected String posisi;

    // Konstruktor
    public Pegawai() {
        this.idPegawai = "";
        this.nama = "";
        this.alamat = "";
        this.posisi = "";
    }

    public Pegawai(String idPegawai, String nama, String alamat, String posisi) {
        this.idPegawai = idPegawai;
        this.nama = nama;
        this.alamat = alamat;
        this.posisi = posisi;
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
    public String getPosisi() {
        return posisi;
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
    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    // Metode untuk menunjukkan data pegawai
    public void tunjukkanData() {
        System.out.println("ID Pegawai: " + idPegawai);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Posisi: " + posisi);
    }

}
