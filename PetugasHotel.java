public class PetugasHotel extends Pegawai {
    // Atribut tambahan
    protected String bagian;

    // Konstruktor
    public PetugasHotel(String idPegawai, String nama, String alamat, String posisi, String bagian) {
        super(idPegawai, nama, alamat, posisi);  // Memanggil konstruktor superclass (Pegawai)
        this.bagian = bagian;
    }

    // Metode untuk memproses check-in
    public void prosesCheckIn(PesananKamar pesanan) {
        System.out.println("Proses Check-in untuk pesanan nomor: " + pesanan.getNomorPesanan());
        // Lakukan logika check-in (misalnya mengubah status kamar)
    }

    // Metode untuk memproses check-out
    public void prosesCheckOut(PesananKamar pesanan) {
        System.out.println("Proses Check-out untuk pesanan nomor: " + pesanan.getNomorPesanan());
        // Lakukan logika check-out (misalnya mengubah status kamar)
    }

    // Metode untuk verifikasi identitas pelanggan
    public boolean verifikasiIdentitas(Pelanggan pelanggan) {
        // Misalnya memverifikasi data pelanggan (hanya contoh)
        System.out.println("Verifikasi identitas untuk pelanggan: " + pelanggan.getNama());
        return true;  // Contoh: verifikasi selalu berhasil
    }
}
