public class Pelayan {
    private String nama;

    public Pelayan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "Pelayan{nama='" + nama + "'}";
    }
}
