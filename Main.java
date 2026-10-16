public class Main {
    public static void main(String[] args) {
        Koki koki = new Koki("Budi");
        Restoran restoran = new Restoran("Restoran Nusantara", koki);

        Pelayan pelayanRina = new Pelayan("rina");
        Meja meja2 = new Meja(2, pelayanRina);
        restoran.tambahMeja(meja2);

        Makanan nasiGoreng = new Makanan("nasi goreng", 25000, true);
        Minuman esTeh1 = new Minuman("esteh", 8000, "L");
        Minuman esTeh2 = new Minuman("es teh", 8000, "L");

        restoran.getDaftarMenu().tambahMenu(nasiGoreng);
        restoran.getDaftarMenu().tambahMenu(esTeh1);
        restoran.getDaftarMenu().tambahMenu(esTeh2);

        meja2.pesan(nasiGoreng);
        meja2.pesan(esTeh1);
        meja2.pesan(esTeh2);

        Kasir kasir = new Kasir("Siti");
        kasir.cetakBill(meja2);

        System.out.println();
        System.out.println("Uji Pertanyaan C2 (Kapasitas Meja):");
        meja2.pesan(nasiGoreng, 10);

        System.out.println();
        System.out.println("Uji Pertanyaan C3 (Polimorfisme):");
        Menu m = new Minuman("jus alpukat", 15000, "L");
        System.out.println("Hasil hitungHarga(): " + (int) m.hitungHarga());
    }
}
