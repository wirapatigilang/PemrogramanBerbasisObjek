public class Pegawai {
    protected String idPegawai;
    protected String nama;
    protected String alamat;
    protected String email;

    // Konstruktor
    public Pegawai() {
        this.idPegawai = "";
        this.nama = "";
        this.alamat = "";
        this.email = "";
    }

    public Pegawai(String idPegawai, String nama, String alamat, String email) {
        this.idPegawai = idPegawai;
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
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
    public void infoPegawai() {
        System.out.printf("ID Pegawai: %s%n", idPegawai);
        System.out.printf("Nama: %s%n", nama);
        System.out.printf("Alamat: %s%n", alamat);
        System.out.printf("Email: %s%n", email);
    }
}
