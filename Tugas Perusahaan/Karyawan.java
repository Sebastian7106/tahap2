import java.text.DecimalFormat;

public class Karyawan {
  private String nama;
  private double gajiPokok;
  private Perusahaan perusahaan;

  DecimalFormat df = new DecimalFormat("#,###");

  public Karyawan (String nama, double gajiPokok, Perusahaan perusahaan) {
    this.nama = nama;
    this.gajiPokok = gajiPokok;
    this.perusahaan = perusahaan;
  }

  public void info() {
    System.out.println("Nama Karyawan: " + nama);
    System.out.println("Total Gaji: Rp " + df.format(hitungGaji()));
    System.out.println("Nama Perusahaan: " + perusahaan.getNama());
    System.out.println();
  }

  public double hitungGaji() {
    return gajiPokok;
  }
}

class Programmer extends Karyawan {
  private double bonus;

  public Programmer(String nama, double gajiPokok, double bonus, Perusahaan perusahaan) {
    super(nama, gajiPokok, perusahaan);
    this.bonus = bonus;
  }

  @Override
  public double hitungGaji() {
    return super.hitungGaji() + bonus;
  }
}

class Manager extends Karyawan {
  private double insentif; 

  public Manager (String nama, double gajiPokok, double insentif, Perusahaan perusahaan) {
    super(nama, gajiPokok, perusahaan);
    this.insentif = insentif;
  }

  @Override
  public double hitungGaji() {
    return super.hitungGaji() + insentif;
  }
}
