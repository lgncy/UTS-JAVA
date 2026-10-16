public class Koki {
    private String nama;

    public Koki(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "Koki{nama='" + nama + "'}";
    }
}
