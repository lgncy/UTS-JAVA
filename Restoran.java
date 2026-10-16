import java.util.ArrayList;
import java.util.List;

public class Restoran {
    private String namaRestoran;
    private Koki kepalaDapur;
    private DaftarMenu daftarMenu;
    private List<Meja> daftarMeja;

    public Restoran(String namaRestoran, Koki kepalaDapur) {
        this.namaRestoran = namaRestoran;
        this.kepalaDapur = kepalaDapur;
        this.daftarMenu = new DaftarMenu();
        this.daftarMeja = new ArrayList<>();
    }

    public String getNamaRestoran() {
        return namaRestoran;
    }

    public Koki getKepalaDapur() {
        return kepalaDapur;
    }

    public DaftarMenu getDaftarMenu() {
        return daftarMenu;
    }

    public List<Meja> getDaftarMeja() {
        return daftarMeja;
    }

    public void tambahMeja(Meja meja) {
        daftarMeja.add(meja);
    }

    public Meja getMeja(int nomorMeja) {
        for (Meja m : daftarMeja) {
            if (m.getNomorMeja() == nomorMeja) {
                return m;
            }
        }
        return null;
    }

    public void info() {
        System.out.println("============================================");
        System.out.println("  RESTORAN : " + namaRestoran);
        System.out.println("  KEPALA DAPUR : " + kepalaDapur.getNama());
        System.out.println("  JUMLAH MEJA  : " + daftarMeja.size());
        System.out.println("============================================");
    }
}
