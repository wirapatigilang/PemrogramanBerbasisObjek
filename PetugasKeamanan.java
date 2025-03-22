public class PetugasKeamanan extends Pegawai {
    private String areaTanggungJawab;
    private String nomorRadio;
    private String sertifikasiKeamanan;

    // Konstruktor
    public PetugasKeamanan() {
        super();
        this.shift = "";
        this.areaTanggungJawab = "";
        this.nomorRadio = "";
        this.sertifikasiKeamanan = "";
    }

    public PetugasKeamanan(String idPegawai, String nama, String alamat, String shift, String areaTanggungJawab, String nomorRadio, String sertifikasiKeamanan) {
        super(idPegawai, nama, alamat, "Petugas Keamanan", sertifikasiKeamanan);
        this.shift = shift;
        this.areaTanggungJawab = areaTanggungJawab;
        this.nomorRadio = nomorRadio;
        this.sertifikasiKeamanan = sertifikasiKeamanan;
    }

    // Selektor 
    public String getAreaTanggungJawab() {
        return areaTanggungJawab;
    }
    public String getNomorRadio() {
        return nomorRadio;
    }
    public String getSertifikasiKeamanan() {
        return sertifikasiKeamanan;
    }

    // Mutator 
    public void setAreaTanggungJawab(String areaTanggungJawab) {
        this.areaTanggungJawab = areaTanggungJawab;
    }
    public void setNomorRadio(String nomorRadio) {
        this.nomorRadio = nomorRadio;
    }
    public void setSertifikasiKeamanan(String sertifikasiKeamanan) {
        this.sertifikasiKeamanan = sertifikasiKeamanan;
    }

    // Method untuk mengubah shift
    public void ubahShift(String shiftBaru) {
        this.shift = shiftBaru;
        System.out.println("Shift Petugas Keamanan diubah ke: " + shiftBaru);
    }

    // Method untuk mengupdate area tanggung jawab
    public void updateAreaTanggungJawab(String areaBaru) {
        this.areaTanggungJawab = areaBaru;
        System.out.println("Area tanggung jawab diperbarui ke: " + areaBaru);
    }

    // Method untuk memeriksa nomor radio
    public void cekNomorRadio() {
        System.out.println("Nomor radio yang digunakan: " + nomorRadio);
    }

    // Method untuk mengupdate sertifikasi keamanan
    public void updateSertifikasi(String sertifikasiBaru) {
        this.sertifikasiKeamanan = sertifikasiBaru;
        System.out.println("Sertifikasi keamanan diperbarui ke: " + sertifikasiBaru);
    }

    // Method untuk melakukan patroli di area tanggung jawab
    public void patroli() {
        System.out.println("Petugas Keamanan " + nama + " sedang patroli di area: " + areaTanggungJawab + " dengan radio " + nomorRadio);
    }

    // Method untuk menampilkan data lengkap petugas keamanan
    @Override
    public void tunjukkanData() {
        super.tunjukkanData();
        System.out.println("Shift: " + shift);
        System.out.println("Area Tanggung Jawab: " + areaTanggungJawab);
        System.out.println("Nomor Radio: " + nomorRadio);
        System.out.println("Sertifikasi Keamanan: " + sertifikasiKeamanan);
    }
}
