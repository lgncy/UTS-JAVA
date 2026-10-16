import java.util.ArrayList;
import java.util.List;

public class DaftarMenu {
    private List<Menu> daftar;

    public DaftarMenu() {
        this.daftar = new ArrayList<>();
    }

    public void tambahMenu(Menu menu) {
        daftar.add(menu);
    }

    public Menu getMenu(int index) {
        if (index < 0 || index >= daftar.size()) {
            throw new IndexOutOfBoundsException("Menu index tidak valid: " + index);
        }
        return daftar.get(index);
    }

    public Menu cariMenu(String nama) {
        for (Menu m : daftar) {
            if (m.getNama().equalsIgnoreCase(nama)) {
                return m;
            }
        }
        return null;
    }

    public List<Menu> getDaftar() {
        return daftar;
    }

    public int jumlahMenu() {
        return daftar.size();
    }

    public void tampilkanMenu() {
        System.out.println("======= DAFTAR MENU =======");
        for (int i = 0; i < daftar.size(); i++) {
            System.out.println((i + 1) + ". " + daftar.get(i));
        }
        System.out.println("===========================");
    }
}
