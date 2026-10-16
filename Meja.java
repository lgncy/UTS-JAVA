import java.util.ArrayList;
import java.util.List;

public class Meja {
    private static final int KAPASITAS_MAKSIMAL = 5;

    private int nomorMeja;
    private Pelayan pelayan;
    private List<ItemPesanan> pesanan;

    public Meja(int nomorMeja, Pelayan pelayan) {
        this.nomorMeja = nomorMeja;
        this.pelayan = pelayan;
        this.pesanan = new ArrayList<>();
    }

    public int getNomorMeja() {
        return nomorMeja;
    }

    public Pelayan getPelayan() {
        return pelayan;
    }

    public List<ItemPesanan> getPesanan() {
        return pesanan;
    }

    public void pesan(Menu m) {
        pesan(m, 1);
    }

    public void pesan(Menu m, int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah pesanan harus lebih dari 0.");
            return;
        }

        if (pesanan.size() + jumlah > KAPASITAS_MAKSIMAL) {
            System.out.println("Pesanan gagal: Meja " + nomorMeja + " maksimal menampung " + KAPASITAS_MAKSIMAL + " item pesanan.");
            return;
        }

        for (int i = 0; i < jumlah; i++) {
            pesanan.add(new ItemPesanan(m, 1));
        }
    }

    public double getSubtotal() {
        double total = 0;
        for (ItemPesanan item : pesanan) {
            total += item.getTotalHarga();
        }
        return total;
    }

    public void kosongkan() {
        pesanan.clear();
        System.out.println("[Meja " + nomorMeja + "] Pesanan dikosongkan.");
    }

    @Override
    public String toString() {
        return "Meja " + nomorMeja + " [Pelayan: " + pelayan.getNama() + "]";
    }
}
