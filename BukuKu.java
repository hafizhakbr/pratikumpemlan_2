// Kelas BukuKu - Digunakan untuk mendefinisikan objek buku dengan atribut dan metode terkait buku
class BukuKu {
  String judul;    // Judul buku
  String penulis;  // Penulis buku
  String sinopsis; // Sinopsis buku
  // Konstruktor untuk menginisialisasi objek BukuKu dengan judul, penulis, dan sinopsis
  public BukuKu(String judul, String penulis, String sinopsis) {
      this.judul = judul;
      this.penulis = penulis;
      this.sinopsis = sinopsis;
  }
  // Method untuk menghitung jumlah kata dalam sinopsis
  public int hitungJumlahKataSinopsis() {
      String[] kata = sinopsis.split("\\s+"); // Memisahkan sinopsis menjadi array kata
      return kata.length; // Mengembalikan jumlah kata dalam sinopsis
  }
  // Method untuk membandingkan tingkat kesamaan dengan buku lain berdasarkan judul, penulis, dan sinopsis
  public void cekTingkatKesamaan(BukuKu bukuLain) {
      int kesamaan = 0;
      if (this.judul.equalsIgnoreCase(bukuLain.judul)) {
          kesamaan++;
      }
      if (this.penulis.equalsIgnoreCase(bukuLain.penulis)) {
          kesamaan++;
      }
      if (this.sinopsis.equalsIgnoreCase(bukuLain.sinopsis)) {
          kesamaan++;
      }
      int persenKesamaan = (kesamaan * 100) / 3; // Menghitung persen kesamaan berdasarkan atribut yang sama
      System.out.println("Tingkat kesamaan buku ini dengan buku lain adalah: " + persenKesamaan + "%");
  }
  // Overload method hitungRoyalti - Menghitung royalti buku berdasarkan harga buku dengan persentase tetap 10%
  public double hitungRoyalti(double hargaBuku) {
      return hargaBuku * 0.1; // Menghitung royalti 10% dari harga buku
  }
  // Overload method hitungRoyalti - Menghitung royalti buku berdasarkan harga dan persentase royalti yang disesuaikan
  public double hitungRoyalti(double hargaBuku, double persenRoyalti) {
      return hargaBuku * (persenRoyalti / 100); // Menghitung royalti dengan persentase yang ditentukan
  }
  // Method untuk membuat salinan (copy) dari objek BukuKu
  public BukuKu copy() {
      return new BukuKu(this.judul, this.penulis, this.sinopsis); // Mengembalikan objek BukuKu baru yang identik
  }
  // Method untuk menampilkan informasi buku
  public void printOut() {
      System.out.println("Judul: " + judul);
      System.out.println("Penulis: " + penulis);
      System.out.println("Sinopsis: " + sinopsis);
  }
}
// Kelas Kategori - Digunakan untuk mendefinisikan kategori buku dengan beberapa buku
class Kategori {
  String namaKategori;  // Nama kategori buku
  BukuKu buku1, buku2, buku3, buku4, buku5; // 5 buku yang ada dalam kategori ini
  // Konstruktor untuk menginisialisasi kategori dengan nama kategori
  public Kategori(String namaKategori) {
      this.namaKategori = namaKategori;
  }
  // Setter untuk menetapkan buku ke kategori
  public void setBuku1(BukuKu buku) {
      this.buku1 = buku;
  }
  public void setBuku2(BukuKu buku) {
      this.buku2 = buku;
  }
  public void setBuku3(BukuKu buku) {
      this.buku3 = buku;
  }
  public void setBuku4(BukuKu buku) {
      this.buku4 = buku;
  }
  public void setBuku5(BukuKu buku) {
      this.buku5 = buku;
  }
  // Method untuk menampilkan semua buku dalam kategori
  public void printKategori() {
      System.out.println("\n=== KATEGORI: " + namaKategori + " ===");
      buku1.printOut(); // Menampilkan informasi buku pertama
      buku2.printOut(); // Menampilkan informasi buku kedua
      buku3.printOut(); // Menampilkan informasi buku ketiga
      buku4.printOut(); // Menampilkan informasi buku keempat
      buku5.printOut(); // Menampilkan informasi buku kelima
  }
  // Method untuk menyalin kategori (copy kategori) dari kategori lain
  public void copyKategori(Kategori kategoriLain) {
      this.buku1 = kategoriLain.buku1.copy(); // Menyalin buku pertama dari kategori lain
      this.buku2 = kategoriLain.buku2.copy(); // Menyalin buku kedua
      this.buku3 = kategoriLain.buku3.copy(); // Menyalin buku ketiga
      this.buku4 = kategoriLain.buku4.copy(); // Menyalin buku keempat
      this.buku5 = kategoriLain.buku5.copy(); // Menyalin buku kelima
  }
}