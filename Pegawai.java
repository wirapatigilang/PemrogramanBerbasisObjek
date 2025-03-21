public class Pegawai {
    // Atribut
    protected String idPegawai;
    protected String nama;
    protected String alamat;
    protected String posisi;

    // Konstruktor
    public Pegawai(String idPegawai, String nama, String alamat, String posisi) {
        this.idPegawai = idPegawai;
        this.nama = nama;
        this.alamat = alamat;
        this.posisi = posisi;
    }

    // Metode untuk menunjukkan data pegawai
    public void tunjukkanData() {
        System.out.println("ID Pegawai: " + idPegawai);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Posisi: " + posisi);
    }

    // Metode login untuk autentikasi pegawai
}
