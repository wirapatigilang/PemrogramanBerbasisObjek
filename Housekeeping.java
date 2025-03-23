import java.util.ArrayList;
import java.util.List;

public class Housekeeping extends Pegawai {
    private List<Kamar> daftarKamarTugas;
    private PesananKamar nota;

    // Konstruktor
    public Housekeeping() {
        super();
        this.nota = null;
        this.daftarKamarTugas = new ArrayList<>();
    }
    
    public Housekeeping(String id, String nama, String alamat, String email, PesananKamar nota) {
        super(id, nama, alamat, email);
        this.nota = nota;
        this.daftarKamarTugas = new ArrayList<>();
        if (nota != null && !nota.getDaftarKamar().isEmpty()) {
            this.daftarKamarTugas = nota.getDaftarKamar();
        }
    }

    // Selektor 
    public List<Kamar> getDaftarKamarTugas() {
        return daftarKamarTugas;
    }
    public PesananKamar getNota() {
        return nota;
    }

    // Mutator 
    public void setNota(PesananKamar nota) {
        this.nota = nota;
    }
    public void setDaftarKamarTugas(List<Kamar> daftarKamarTugas) {
        this.daftarKamarTugas = daftarKamarTugas;
    }

    // Method untuk menampilkan data lengkap housekeeping
    @Override
    public void infoPegawai() {
        super.infoPegawai();
        if (nota != null && !nota.getDaftarKamar().isEmpty()) {
            System.out.println("Daftar Tugas Kamar sesuai Nota:");
            for (Kamar kamar : nota.getDaftarKamar()) {
                System.out.println("Kamar " + kamar.getNomorKamar() + " - Status Kebersihan: " + kamar.getStatusKebersihan());
            }
        } 
        else if (nota == null && !daftarKamarTugas.isEmpty()) {
            System.out.println("Daftar Tugas Kamar:");
            for (Kamar kamar : daftarKamarTugas) {
                System.out.println("Kamar " + kamar.getNomorKamar() + " - Status Kebersihan: " + kamar.getStatusKebersihan());
            }
        }
        else {
            System.out.println("Belum ada daftar tugas Kamar");
        }
    }
    
    // Method untuk membersihkan kamar
    public void bersihkanKamar() { // akan membersihkan kamar yang di nota
        if (nota == null) {
            System.out.println("Belum ada daftar tugas Kamar");
        } else {
            for (Kamar kamar : nota.getDaftarKamar()) {
                kamar.setStatusKebersihan("Bersih");
            }
        }
    }
}
