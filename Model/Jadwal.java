package Model;

import java.util.Date;

public class Jadwal {
    private String idJadwal;
    private String tanggal;
    private String jamMulai;
    private String jamSelesai;
    private Film film;

    public Jadwal(String idJadwal, String tanggal, String jamMulai, String jamSelesai) {
        this.idJadwal = idJadwal;
        this.tanggal = tanggal;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
    }
    
    
    
}
