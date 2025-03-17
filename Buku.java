public class Buku {
    String judul;
    String penulis;
    String sinopsis;

    public Buku(String judul, String penulis, String sinopsis) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = sinopsis; 
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int hitungJumlahKataSinopsis() {
        String kata[] = sinopsis.split("\\s+");
        return kata.length;

    }
    public void cekTingkatKesamaan(Buku bukuLain) {
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
        int persenKesamaan = (kesamaan * 100) / 3; 
        System.out.println("Tingkat kesamaan buku ini dengan buku lain adalah: " + persenKesamaan + "%");
    }
        public Buku copy() {
            return new Buku(this.judul, this.penulis, this.sinopsis);
        }
        public void printOut() {
            System.out.println("Judul: " + judul + ", Penulis: " + penulis + ", Sinopsis: " + sinopsis + ", Jumlah Kata: " + hitungJumlahKataSinopsis());
        }
    }
class Kategori {
    String namaKategori;
    Buku buku1;
    Buku buku2;
    Buku buku3;
    Buku buku4;
    Buku buku5;

    public Kategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }

    public void setBuku1(Buku buku) { this.buku1 = buku; }

    public void setBuku2(Buku buku) { this.buku2 = buku; }

    public void setBuku3(Buku buku) { this.buku3 = buku; }

    public void setBuku4(Buku buku) { this.buku4 = buku; }

    public void setBuku5(Buku buku) { this.buku5 = buku; }

    public void copyKategori(Kategori kategoriLain) {
        this.buku1 = kategoriLain.buku1.copy();
        this.buku2 = kategoriLain.buku2.copy();
        this.buku3 = kategoriLain.buku3.copy();
        this.buku4 = kategoriLain.buku4.copy();
        this.buku5 = kategoriLain.buku5.copy();
    }

    public void printKategori() {
        System.out.println("\n=== KATEGORI: " + namaKategori + " ===");
        buku1.printOut();
        buku2.printOut();
        buku3.printOut();
        buku4.printOut();
        buku5.printOut();
    }
}