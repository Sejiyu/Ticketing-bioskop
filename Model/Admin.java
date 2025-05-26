package Model;

public class Admin extends Pengguna {
    private String nip;

    public Admin(String id, String nama, String email, String password, String nip) {
        super(id, nama, email, password, "Admin");
        this.nip = nip;
    }

//    public boolean tambahFilm(Film film) {
//        System.out.println("Film " + film.getJudul() + " ditambahkan.");
//        return true;
//    }
//
//    public boolean aturJadwal(Jadwal jadwal) {
//        System.out.println("Jadwal diatur untuk " + jadwal.getNamaFilm());
//        return true;
//    }
}
