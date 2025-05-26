package Model;
public class Studio {
    private String idStudio;
    private String namaStudio;
    private String[][] kursi;
    private boolean [][] sudahDipesan;

    public Studio(String idStudio, String namaStudio, String[][] kursi, boolean[][] sudahDipesan) {
        this.idStudio = idStudio;
        this.namaStudio = namaStudio;
        this.kursi = kursi;
        this.sudahDipesan = sudahDipesan;
    }
    
    public boolean bookKursi(String noKursi){
        for (int i = 0; i < kursi.length; i++) {
            for (int j = 0; j < kursi[i].length; j++) {
                if (kursi[i][j].equals(noKursi)) {
                    if (sudahDipesan[i][j]) {
                        System.out.println("Kursi " + noKursi + " sudah dipesan");
                        return false;
                    } else {
                        sudahDipesan[i][j] = true;
                        System.out.println("Kursi " + noKursi + " berhasil dipesan");
                        return true;
                    }
                }
            }
        }
        System.out.println("Nomor kursi tidak valid");
        return false;
    }
}
