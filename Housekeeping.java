import java.util.ArrayList;
import java.util.List;

public class Housekeeping extends Pegawai {
    private List<Kamar> daftarKamarTugas;

    // Konstruktor
    public Housekeeping() {
        super();
        this.daftarKamarTugas = new ArrayList<>();
    }
    
    public Housekeeping(String id, String nama, String alamat, String email) {
        super(id, nama, alamat, email);
    }


    public Housekeeping(String idPegawai, String nama, String alamat) {
        super(idPegawai, nama, alamat, "Housekeeping");
        this.daftarKamarTugas = new ArrayList<>();
    }

    // Selektor 
    public List<Kamar> getDaftarKamarTugas() {
        return daftarKamarTugas;
    }

    // Mutator 
    public void setDaftarKamarTugas(List<Kamar> daftarKamarTugas) {
        this.daftarKamarTugas = daftarKamarTugas;
    }


    // Method untuk menampilkan data lengkap housekeeping
    @Override
    public void tunjukkanData() {
        super.tunjukkanData();
        if (!daftarKamarTugas.isEmpty()) {
            for (Kamar kamar : daftarKamarTugas) {
                kamar.getNomorKamar();
            }
        }

    }
    
    // Contoh method untuk membersihkan kamar
    public void bersihkanKamar() {
        if (!daftarKamarTugas.isEmpty()) {
            for (Kamar kamar : daftarKamarTugas) {
                kamar.setStatusKamar("Bersih");
            }
        }
    }
}
