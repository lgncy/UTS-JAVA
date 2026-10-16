public class ItemPesanan {
    private Menu menu;
    private int jumlah;

    public ItemPesanan(Menu menu, int jumlah) {
        this.menu = menu;
        this.jumlah = jumlah;
    }

    public Menu getMenu() {
        return menu;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void tambahJumlah(int tambahan) {
        this.jumlah += tambahan;
    }

    public double getTotalHarga() {
        return menu.getHargaAkhir() * jumlah;
    }

    @Override
    public String toString() {
        return String.format("  %-30s x%d  = Rp %,.0f",
                menu.getNama(), jumlah, getTotalHarga());
    }
}
