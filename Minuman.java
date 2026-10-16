public class Minuman extends Menu {
    private String ukuran;

    public Minuman(String nama, double hargaDasar, String ukuran) {
        super(nama, hargaDasar);
        this.ukuran = ukuran.toUpperCase();
    }

    public String getUkuran() {
        return ukuran;
    }

    @Override
    public double getHargaAkhir() {
        if (ukuran.equals("L")) {
            return hargaDasar + 5000;
        }
        return hargaDasar;
    }

    @Override
    public double hitungHarga() {
        return getHargaAkhir();
    }

    @Override
    public String toString() {
        return "Minuman [" + ukuran + "] - " + getNama() +
               " (Rp " + String.format("%,.0f", getHargaAkhir()) + ")";
    }
}
