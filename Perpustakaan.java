public class Perpustakaan {
    public static void main(String[] args) {
        Kategori teknologi = new Kategori("TEKNOLOGI");
        teknologi.setBuku1(new Buku("TikTok dan Transformasi Pembelajaran", "Ikhwan Sawaty", "Buku ini membahas bagaimana TikTok mengubah cara belajar dengan konten kreatif dan interaktif"));
        teknologi.setBuku2(new Buku("Teknologi Digital Membawa Perubahan", "Andri Fitriani Djollong", "Dampak teknologi digital pada kehidupan sehari-hari dan masa depan manusia"));
        teknologi.setBuku3(new Buku("Struktur Data", "Abdullah Husin", "Mempelajari Dasar-dasar struktur data untuk pemahaman ilmu komputer yang lebih baik"));
        teknologi.setBuku4(new Buku("Pengantar Sistem Informasi Enterprise", "Dwi Yuli Prasetyo", "Konsep dasar sistem informasi enterprise untuk manajemen bisnis modern yang efektif"));
        teknologi.setBuku5(new Buku("Pengembangan Aplikasi Berbasis Web", "Fitri Yunita, S.Si., M.Kom", "Panduan praktis mengembangkan aplikasi web dengan teknologi terkini namun mudah dipahami"));
        teknologi.printKategori();


        Kategori filsafat = new Kategori("FILSAFAT");
        filsafat.setBuku1(new Buku("Filsafat Jurnalistik", "Dr. AS Haris Sumadiria, M.Si", "Mengupas filosofi di balik praktik jurnalistik modern dan etika jurnalistik"));
        filsafat.setBuku2(new Buku("Filsafat Barat", "Mukhlas Gunawan", "Sejarah dan pemikiran utama dalam filsafat Barat dari zaman kuno hingga modern"));
        filsafat.setBuku3(new Buku("Pengantar Filsafat Ekonomi Islam", "Ika Nur Wahyuning", "Prinsip-prinsip ekonomi Islam dari perspektif filsafat dan hukum Islam dalam kehidupan sehari-hari"));
        filsafat.setBuku4(new Buku("Filsafat Hidup Berkelanjutan", "Chusantoro Bagus", "Pemikiran filosofis tentang keberlanjutan hidup di bumi dan kehidupan manusia"));
        filsafat.setBuku5(new Buku("Filsafat Hukum Islam dan Maqashid Syariah", "Muhammad Syukri Albani Nasution", "Tujuan hukum Islam dan implementasinya dalam masyarakat modern berdasarkan filsafat Islam"));
        filsafat.printKategori();

        Kategori sejarah = new Kategori("SEJARAH");
        sejarah.setBuku1(new Buku("Metahistory: Mengungkap Sejarah Langka", "Moh. Zahirul Alim", "Sebuah kajian tentang sejarah yang jarang diketahui dan tersembunyi di balik sejarah resmi"));
        sejarah.setBuku2(new Buku("Lini Masa Jambi", "Novrita Suryani", "Rangkaian peristiwa penting dalam sejarah Jambi dari masa ke masa yang menarik"));
        sejarah.setBuku3(new Buku("The Story of Kediri and Alas Pendowo", "Reftiani Metasari", "Kisah sejarah Kediri dan Alas Pendowo yang penuh misteri dan keajaiban"));
        sejarah.setBuku4(new Buku("Kampung Jawa di Tanah Mandar", "Adi Arwan Alimin", "Sejarah suku Jawa di tanah Mandar dan kontribusinya  bagi masyarakat Mandar"));
        sejarah.setBuku5(new Buku("Jejak Dua Lelaki", "Adi Arwan Alimin", "Perjalanan sejarah dua tokoh penting di Indonesia yang mengubah arah sejarah bangsa"));
        sejarah.printKategori();

        Kategori agama = new Kategori("AGAMA");
        agama.setBuku1(new Buku("Tuhan Ada Di Hatimu", "Husein Ja'far Al-Haddar", "Refleksi spiritual tentang kehadiran Tuhan dalam diri manusia dan kehidupan sehari-hari"));
        agama.setBuku2(new Buku("Cahaya Dari Madinah", "Syekh Ali Jaber", "Kisah inspiratif dan ajaran dari kota Madinah yang penuh keberkahan"));
        agama.setBuku3(new Buku("Hidup Sehat Bukan Sekedar Gaya", "Mifta Novikasari", "Panduan hidup sehat berdasarkan ajaran agama dan ilmu kesehatan modern"));
        agama.setBuku4(new Buku("Kun Bil Qur'ani Najman", "Saihul Basyir", "Memahami Al-Quran sebagai pedoman hidup yang menerangi jalan menuju kebahagiaan"));
        agama.setBuku5(new Buku("Maaf Tuhan Aku Hampir Menyerah", "Alfialghazi", "Perjalanan spiritual mengatasi cobaan dan menemukan kekuatan dalam iman dan doa"));
        agama.printKategori();

        Kategori psikologi = new Kategori("PSIKOLOGI");
        psikologi.setBuku1(new Buku("Mengenal Anak Down Syndrome", "Titin Ummi Haniek", "Pemahaman, dukungan, dan terapi untuk anak Down Syndrome dan keluarganya"));
        psikologi.setBuku2(new Buku("Teologi Praktis dan Pendekatan Pastoral Konseling", "Juan Ari Palade Bandu", "Kesadaran diri untuk penyembuhan emosional dan ketenangan batin dalam konseling pastoral"));
        psikologi.setBuku3(new Buku("Menyelami Perkembangan Psikologis Kehidupan Manusia", "Inta Titania", "Pemahaman tentang tahapan perkembangan psikologis manusia dari lahir hingga dewasa"));
        psikologi.setBuku4(new Buku("Teman Konseling", "Magdalena Palunte", "Panduan dunia konseling untuk membantu permasalahan emosional dan psikologis dalam kehidupan sehari-hari"));
        psikologi.setBuku5(new Buku("Self Healing with Awareness", "Zairotul", "Kesadaran diri sebagai kunci penyembuhan emosional dan ketenangan batin dalam hidup"));
        psikologi.printKategori();

        Kategori politik = new Kategori("POLITIK");
        politik.setBuku1(new Buku("Pilkada di Tengah Pandemi", "Adi Arwan Alimin", "Tantangan demokrasi dalam pemilihan kepala daerah selama pandemi global COVID-19"));
        politik.setBuku2(new Buku("Merayakan Demokrasi", "Usman Suhuriah", "Sejarah, perkembangan, dan peran rakyat dalam sistem demokrasi Indonesia yang merdeka"));
        politik.setBuku3(new Buku("40 Tahun di Dunia Diplomasi", "A. Agus Sriyono", "Kisah perjalanan panjang dalam diplomasi dan hubungan internasional Indonesia di dunia"));
        politik.setBuku4(new Buku("Perlindungan Sosial dan Klientelisme", "Mulyadi Sumarto", "Kajian kebijakan sosial dan sistem politik klientelisme Indonesia dalam perlindungan sosial"));
        politik.setBuku5(new Buku("Surat untuk Indonesia", "Anung Dlizta", "Kumpulan surat refleksi tentang Indonesia, nasionalisme, dan masa depan bangsa"));
        politik.printKategori();

        Kategori fiksi = new Kategori("FIKSI");
        fiksi.setBuku1(new Buku("Bumi Manusia", "Pramoedya Ananta Toer", "Perjuangan Minke menghadapi ketidakadilan kolonial dengan pendidikan dan pemikiran kritis"));
        fiksi.setBuku2(new Buku("Negeri 5 Menara", "Ahmad Fuadi", "Persahabatan, pesantren, dan impian besar anak muda menuju kesuksesan dan kebahagiaan"));
        fiksi.setBuku3(new Buku("Gadis Kretek", "Ratih Kumala", "Sejarah industri kretek, cinta, dan rahasia keluarga masa lalu yang terungkap"));
        fiksi.setBuku4(new Buku("Pulang", "Leila S. Chudori", "Eksil politik mencari identitas, pengasingan, dan perjalanan kembali ke tanah air yang berubah"));
        fiksi.setBuku5(new Buku("Laskar Pelangi", "Andrea Hirata", "Anak-anak miskin Belitung berjuang mendapatkan pendidikan dan menggapai mimpi di tengah keterbatasan"));
        fiksi.printKategori();
    }
}