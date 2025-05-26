package Model;

import Model.Pengguna;
import java.util.List;

public class Penonton extends Pengguna {
    private String noTelepon;

    public Penonton(String id, String nama, String email, String password, String noTelepon) {
        super(id, nama, email, password, "Penonton");
        this.noTelepon = noTelepon;
    }

//    public List<Jadwal> lihatJadwal() {
//        // Simulasi lihat jadwal
//        return List.of(new Jadwal("Film A"), new Jadwal("Film B"));
//    }
//
//    public Tiket pesanTiket(Jadwal jadwal) {
//        return new Tiket(jadwal, this);
//    }
}
