public class Kasir {
    private static final double TARIF_PAJAK = 0.10;

    private String nama;

    public Kasir(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public double cetakBill(Meja meja) {
        double subtotal = meja.getSubtotal();
        double pajak = subtotal * TARIF_PAJAK;
        double totalBill = subtotal + pajak;

        System.out.println("bill meja " + meja.getNomorMeja() + " pelayan " + meja.getPelayan().getNama().toLowerCase());
        for (ItemPesanan item : meja.getPesanan()) {
            System.out.println(item.getMenu().getNama().toLowerCase() + " " + (int) item.getTotalHarga());
        }
        System.out.println("subtotal " + (int) subtotal);
        System.out.println("pajak 10% " + (int) pajak);
        System.out.println("total " + (int) totalBill);

        return totalBill;
    }
}
