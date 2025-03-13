import java.text.DecimalFormat;

public class Main {
  public static void main(String[] args) {
    Perusahaan p1 = new Perusahaan("PT. Sebastian");
    Karyawan k1 = new Karyawan("Noel", 3000000, p1);
    Programmer pro1 = new Programmer("Kristian", 8000000, 2000000, p1);
    pro1.info();
    Manager man1 = new Manager("Christopher", 15000000, 5000000, p1);
    man1.info();
  }
}
