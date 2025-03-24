// // Kelas utama PerpustakaanKu yang berfungsi untuk menjalankan program
public class PerpustakaanKu {
  public static void main(String[] args) {
      // Membuat kategori "TEKNOLOGI" dan menambahkan buku-buku ke dalamnya
      Kategori teknologi = new Kategori("TEKNOLOGI");
      teknologi.setBuku1(new BukuKu("TikTok dan Transformasi Pembelajaran", "Ikhwan Sawaty", "Buku ini membahas bagaimana TikTok mengubah cara belajar dengan konten kreatif dan interaktif"));
      teknologi.setBuku2(new BukuKu("Teknologi Digital Membawa Perubahan", "Andri Fitriani Djollong", "Dampak teknologi digital pada kehidupan sehari-hari dan masa depan manusia"));
      teknologi.setBuku3(new BukuKu("Struktur Data", "Abdullah Husin", "Mempelajari Dasar-dasar struktur data untuk pemahaman ilmu komputer yang lebih baik"));
      teknologi.setBuku4(new BukuKu("Pengantar Sistem Informasi Enterprise", "Dwi Yuli Prasetyo", "Konsep dasar sistem informasi enterprise untuk manajemen bisnis modern yang efektif"));
      teknologi.setBuku5(new BukuKu("Pengembangan Aplikasi Berbasis Web", "Fitri Yunita, S.Si., M.Kom", "Panduan praktis mengembangkan aplikasi web dengan teknologi terkini namun mudah dipahami"));
      teknologi.printKategori();
      // Membuat kategori "FILSAFAT" dan menambahkan buku-buku ke dalamnya
      Kategori filsafat = new Kategori("FILSAFAT");
      filsafat.setBuku1(new BukuKu("Filsafat Jurnalistik", "Dr. AS Haris Sumadiria, M.Si", "Mengupas filosofi di balik praktik jurnalistik modern dan etika jurnalistik"));
      filsafat.setBuku2(new BukuKu("Filsafat Barat", "Mukhlas Gunawan", "Sejarah dan pemikiran utama dalam filsafat Barat dari zaman kuno hingga modern"));
      filsafat.setBuku3(new BukuKu("Pengantar Filsafat Ekonomi Islam", "Ika Nur Wahyuning", "Prinsip-prinsip ekonomi Islam dari perspektif filsafat dan hukum Islam dalam kehidupan sehari-hari"));
      filsafat.setBuku4(new BukuKu("Filsafat Hidup Berkelanjutan", "Chusantoro Bagus", "Pemikiran filosofis tentang keberlanjutan hidup di bumi dan kehidupan manusia"));
      filsafat.setBuku5(new BukuKu("Filsafat Hukum Islam dan Maqashid Syariah", "Muhammad Syukri Albani Nasution", "Tujuan hukum Islam dan implementasinya dalam masyarakat modern berdasarkan filsafat Islam"));
      filsafat.printKategori();
      // Membuat kategori "SEJARAH" dan menambahkan buku-buku ke dalamnya
      Kategori sejarah = new Kategori("SEJARAH");
      sejarah.setBuku1(new BukuKu("Metahistory: Mengungkap Sejarah Langka", "Moh. Zahirul Alim", "Sebuah kajian tentang sejarah yang jarang diketahui dan tersembunyi di balik sejarah resmi"));
      sejarah.setBuku2(new BukuKu("Lini Masa Jambi", "Novrita Suryani", "Rangkaian peristiwa penting dalam sejarah Jambi dari masa ke masa yang menarik"));
      sejarah.setBuku3(new BukuKu("The Story of Kediri and Alas Pendowo", "Reftiani Metasari", "Kisah sejarah Kediri dan Alas Pendowo yang penuh misteri dan keajaiban"));
      sejarah.setBuku4(new BukuKu("Kampung Jawa di Tanah Mandar", "Adi Arwan Alimin", "Sejarah suku Jawa di tanah Mandar dan kontribusinya bagi masyarakat Mandar"));
      sejarah.setBuku5(new BukuKu("Jejak Dua Lelaki", "Adi Arwan Alimin", "Perjalanan sejarah dua tokoh penting di Indonesia yang mengubah arah sejarah bangsa"));
      sejarah.printKategori();
      // Membuat kategori "TEKNOLOGI" dan menambahkan buku-buku ke dalamnya
      Kategori agama = new Kategori("AGAMA");
      agama.setBuku1(new BukuKu("Tuhan Ada Di Hatimu", "Husein Ja'far Al-Haddar", "Refleksi spiritual tentang kehadiran Tuhan dalam diri manusia dan kehidupan sehari-hari"));
      agama.setBuku2(new BukuKu("Cahaya Dari Madinah", "Syekh Ali Jaber", "Kisah inspiratif dan ajaran dari kota Madinah yang penuh keberkahan"));
      agama.setBuku3(new BukuKu("Hidup Sehat Bukan Sekedar Gaya", "Mifta Novikasari", "Panduan hidup sehat berdasarkan ajaran agama dan ilmu kesehatan modern"));
      agama.setBuku4(new BukuKu("Kun Bil Qur'ani Najman", "Saihul Basyir", "Memahami Al-Quran sebagai pedoman hidup yang menerangi jalan menuju kebahagiaan"));
      agama.setBuku5(new BukuKu("Maaf Tuhan Aku Hampir Menyerah", "Alfialghazi", "Perjalanan spiritual mengatasi cobaan dan menemukan kekuatan dalam iman dan doa"));
      agama.printKategori();
      // Membuat kategori "PSIKOLOGI" dan menambahkan buku-buku ke dalamnya
      Kategori psikologi = new Kategori("PSIKOLOGI");
      psikologi.setBuku1(new BukuKu("Mengenal Anak Down Syndrome", "Titin Ummi Haniek", "Pemahaman, dukungan, dan terapi untuk anak Down Syndrome dan keluarganya"));
      psikologi.setBuku2(new BukuKu("Teologi Praktis dan Pendekatan Pastoral Konseling", "Juan Ari Palade Bandu", "Kesadaran diri untuk penyembuhan emosional dan ketenangan batin dalam konseling pastoral"));
      psikologi.setBuku3(new BukuKu("Menyelami Perkembangan Psikologis Kehidupan Manusia", "Inta Titania", "Pemahaman tentang tahapan perkembangan psikologis manusia dari lahir hingga dewasa"));
      psikologi.setBuku4(new BukuKu("Teman Konseling", "Magdalena Palunte", "Panduan dunia konseling untuk membantu permasalahan emosional dan psikologis dalam kehidupan sehari-hari"));
      psikologi.setBuku5(new BukuKu("Self Healing with Awareness", "Zairotul", "Kesadaran diri sebagai kunci penyembuhan emosional dan ketenangan batin dalam hidup"));
      psikologi.printKategori();
      // Membuat kategori "POLITIK" dan menambahkan buku-buku ke dalamnya
      Kategori politik = new Kategori("POLITIK");
      politik.setBuku1(new BukuKu("Pilkada di Tengah Pandemi", "Adi Arwan Alimin", "Tantangan demokrasi dalam pemilihan kepala daerah selama pandemi global COVID-19"));
      politik.setBuku2(new BukuKu("Merayakan Demokrasi", "Usman Suhuriah", "Sejarah, perkembangan, dan peran rakyat dalam sistem demokrasi Indonesia yang merdeka"));
      politik.setBuku3(new BukuKu("40 Tahun di Dunia Diplomasi", "A. Agus Sriyono", "Kisah perjalanan panjang dalam diplomasi dan hubungan internasional Indonesia di dunia"));
      politik.setBuku4(new BukuKu("Perlindungan Sosial dan Klientelisme", "Mulyadi Sumarto", "Kajian kebijakan sosial dan sistem politik klientelisme Indonesia dalam perlindungan sosial"));
      politik.setBuku5(new BukuKu("Surat untuk Indonesia", "Anung Dlizta", "Kumpulan surat refleksi tentang Indonesia, nasionalisme, dan masa depan bangsa"));
      politik.printKategori();
      // Membuat kategori "FIKSI" dan menambahkan buku-buku ke dalamnya
      Kategori fiksi = new Kategori("FIKSI");
      fiksi.setBuku1(new BukuKu("Bumi Manusia", "Pramoedya Ananta Toer", "Perjuangan Minke menghadapi ketidakadilan kolonial dengan pendidikan dan pemikiran kritis"));
      fiksi.setBuku2(new BukuKu("Negeri 5 Menara", "Ahmad Fuadi", "Persahabatan, pesantren, dan impian besar anak muda menuju kesuksesan dan kebahagiaan"));
      fiksi.setBuku3(new BukuKu("Gadis Kretek", "Ratih Kumala", "Sejarah industri kretek, cinta, dan rahasia keluarga masa lalu yang terungkap"));
      fiksi.setBuku4(new BukuKu("Pulang", "Leila S. Chudori", "Eksil politik mencari identitas, pengasingan, dan perjalanan kembali ke tanah air yang berubah"));
      fiksi.setBuku5(new BukuKu("Laskar Pelangi", "Andrea Hirata", "Anak-anak miskin Belitung berjuang mendapatkan pendidikan dan menggapai mimpi di tengah keterbatasan"));
      fiksi.printKategori();
 // Perhitungan Royalti dan Kesamaan Buku
 System.out.println("\n=======================================================");

 BukuKu bukuContoh = new BukuKu("Contoh Buku", "Penulis Contoh", "Sinopsis contoh buku.");
 double hargaBuku = 100000;
 double royalti10Persen = bukuContoh.hitungRoyalti(hargaBuku);
 System.out.println("Royalti 10% dari buku: " + royalti10Persen);

 double persenRoyalti = 15;
 double royaltiCustom = bukuContoh.hitungRoyalti(hargaBuku, persenRoyalti);
 System.out.println("Royalti " + persenRoyalti + "% dari buku: " + royaltiCustom);

 // Membandingkan Kesamaan Buku
 System.out.println("\n=======================================================");
 BukuKu buku1 = new BukuKu("Bumi Manusia", "Pramoedya Ananta Toer", "Perjuangan Minke menghadapi ketidakadilan kolonial dengan pendidikan dan pemikiran kritis");
 BukuKu buku2 = new BukuKu("Bumi Manusia", "Pramoedya Ananta Toer", "Perjuangan Minke menghadapi ketidakadilan kolonial dengan pendidikan dan pemikiran kritis");
 buku1.cekTingkatKesamaan(buku2);

 // Menyalin kategori dan menampilkan hasil
 System.out.println("\n=======================================================");
 Kategori kategoriCopy = new Kategori("TEKNOLOGI (Copy)");
 kategoriCopy.copyKategori(teknologi);
 kategoriCopy.printKategori();

 System.out.println("\n=======================================================");
}
}