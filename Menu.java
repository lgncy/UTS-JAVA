public abstract class Menu {
    private String nama;
    protected double hargaDasar;

    public Menu(String nama, double hargaDasar) {
        this.nama = nama;
        this.hargaDasar = hargaDasar;
    }

    public String getNama() {
        return nama;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    public abstract double getHargaAkhir();

    public double hitungHarga() {
        return getHargaAkhir();
    }

    @Override
    public String toString() {
        return nama + " (Rp " + String.format("%,.0f", getHargaAkhir()) + ")";
    }
}
