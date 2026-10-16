public class Makanan extends Menu {
    private boolean porsiJumbo;

    public Makanan(String nama, double hargaDasar, boolean porsiJumbo) {
        super(nama, hargaDasar);
        this.porsiJumbo = porsiJumbo;
    }

    public boolean isPorsiJumbo() {
        return porsiJumbo;
    }

    @Override
    public double getHargaAkhir() {
        if (porsiJumbo) {
            return hargaDasar * 1.30;
        }
        return hargaDasar;
    }

    @Override
    public double hitungHarga() {
        return getHargaAkhir();
    }

    @Override
    public String toString() {
        String porsi = porsiJumbo ? "[JUMBO]" : "[Regular]";
        return "Makanan " + porsi + " - " + getNama() +
               " (Rp " + String.format("%,.0f", getHargaAkhir()) + ")";
    }
}
