package com.ccdp.appakhir2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tanda extends Fragment {


    public Tanda() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tanda,
                container, false);
        WebView view = (WebView) rootView.findViewById(R.id.tanda1);
        String text = "<p align=\"justify\">Salah satu kekhawatiran pertama Anda saat Anda berada dalam situasi bertahan adalah berkomunikasi dengan teman atau sekutu Anda. Umumnya komunikasi adalah pemberian dan penerimaan informasi. Sebagai seorang yang selamat, Anda harus menarik perhatian penyelamat terlebih dahulu, dan kedua, kirim pesan yang menurut penyelamat Anda. Beberapa adalah pola geometris buatan manusia seperti garis lurus, lingkaran, segitiga, atau X yang ditampilkan di daerah tak berpenghuni; api besar atau kilatan cahaya; Benda besar dan terang bergerak perlahan; atau kontras, entah dari warna atau bayangan. Jenis sinyal yang digunakan akan tergantung pada lingkungan dan situasi musuh Anda.<br>" +
                "<b><p align=\"center\">PENERAPAN</b> <br>" +
                "<p align=\"justify\">Jika dalam situasi non kombat, Anda harus menemukan area jernih dan datar terbesar yang tersedia di medan tertinggi. Gunakan sebagai sinyal yang jelas yang bisa Anda ciptakan. Di sisi lain, Anda harus lebih berhati-hati dalam situasi tempur. Anda tidak ingin memberi isyarat dan menarik musuh. Pilihlah area yang terlihat dari udara, tapi pastikan ada tempat bersembunyi di dekatnya. Cobalah untuk memiliki bukit atau objek lain antara situs sinyal dan musuh untuk menutupi sinyal Anda dari musuh. Lakukan pengintaian menyeluruh daerah tersebut untuk memastikan tidak ada kekuatan musuh di dekatnya.<br>" +
                "Apapun teknik atau perangkat pensinyalan yang Anda rencanakan untuk digunakan, ketahuilah bagaimana menggunakannya dan bersiap untuk menginputnya dalam operasi dalam waktu singkat. Jika memungkinkan, hindari menggunakan sinyal atau teknik pensinyalan yang secara fisik dapat membahayakan Anda. Ingatlah bahwa sinyal ke teman Anda mungkin mengingatkan musuh terhadap keberadaan dan lokasi Anda. Sebelum memberi sinyal, timbangkan dengan hati-hati peluang pertolongan Anda oleh teman-teman agar tidak tertangkap oleh musuh.<br>" +
                "<br>Radio mungkin adalah cara yang paling pasti dan tercepat untuk memberi tahu orang lain tempat Anda berada dan membiarkan Anda menerima pesan mereka. Kenali radio di unit Anda. Pelajari cara mengoperasikannya dan cara mengirim dan menerima pesan.<br>" +
                "<br>Anda akan menemukan deskripsi teknik, perangkat, dan artikel signaling lainnya yang dapat Anda gunakan. Pelajari cara menggunakannya. Pikirkan cara-cara di mana Anda dapat menyesuaikan atau mengubahnya untuk lingkungan yang berbeda. Berlatih menggunakan teknik, perangkat, dan artikel signaling ini sebelum Anda membutuhkannya. Teknik pensinyalan yang sudah diatur sebelumnya dapat meningkatkan kesempatan Anda untuk menyelamatkan.<br>" +
                "<b><p align=\"center\">CARA MEMBERI TANDA</b><br>" +
                "<p align=\"justify\">Ada dua cara utama untuk mendapatkan perhatian atau untuk berkomunikasi - visual dan audio. Cara yang Anda gunakan akan tergantung pada situasi dan materi yang Anda miliki. Apapun caranya, selalu ada sinyal visual dan audio yang siap digunakan.<br>" +
                "<br>" +
                "<b>Sinyal Visual</b><br>" +
                "<br>" +
                "Sinyal ini adalah bahan atau peralatan yang Anda gunakan untuk membuat kehadiran Anda <br>" +
                "diketahui oleh penyelamat.<br>" +
                "<br>" +
                "<b><i>Api</i></b><br>" +
                "Selama kegelapan, api adalah sarana visual yang paling efektif untuk memberi sinyal. Bangun tiga perapian dalam segitiga (sinyal marabahaya internasional) atau dalam garis lurus dengan sekitar 25 meter di antara api. Buat mereka segera setelah waktu dan situasi mengizinkan dan melindungi api tersebut sampai Anda membutuhkannya. Jika Anda sendiri, mempertahankan tiga bakaran api mungkin sulit dilakukan. Jika demikian, pertahankan satu isyarat api.<br>" +
                "<br>" +
                "Saat membangun sinyal kebakaran, pertimbangkan lokasi geografis Anda. Jika di hutan, temukan tempat terbuka alami atau tepi sungai tempat Anda bisa membangun api yang tidak akan disembunyikan oleh dedaunan hutan. Anda bahkan mungkin harus membersihkan area. Jika di daerah tertutup salju, Anda mungkin harus membersihkan dasar salju atau membuat platform untuk membangun api sehingga salju yang mencair tidak akan memadamkannya.<br>" +
                "Pohon yang terbakar (pohon obor) adalah cara lain untuk menarik perhatian (Gambar 19-1). <br>" +
                "<br>" +
                "Anda bisa membakar pepohonan untuk memberikan tanda. Anda bisa mendapatkan jenis pohon lain untuk dibakar dengan meletakkan kayu kering di cabang bawah dan menyalakannya sehingga  api menyala dan membakar dedaunan. Sebelum pohon utama terbakar habis, potong dan tambahkan lebih banyak batang kecil yang belum kering ke perapian untuk menghasilkan lebih banyak asap. Selalu pilih pohon yang jauh dari pepohanan lain nya sehingga tidak membakar  hutan dan membahayakan diri Anda sendiri.<br>" +
                " <br>";
        String text1 =
                "<br><b><i>Asap</i></b> <br>" +
                "Di siang hari, gunakan asap untuk mendapatkan perhatian (Gambar 19-2). Sinyal marabahaya internasional adalah tiga kolom asap. Cobalah untuk menciptakan warna asap yang kontras dengan latar belakang; Asap gelap terhadap latar belakang yang terang dan sebaliknya. Jika Anda praktis memadamkan api besar dengan daun hijau, lumut, atau sedikit air, api akan menghasilkan asap putih. Jika Anda menambahkan lap karet atau minyak yang direndam ke api, Anda akan terkena asap hitam.<br>" +
                " <br>";
        String text2 =
                "<p align=\"justify\">Di lingkungan padang pasir, asap menggantung di tanah, tapi pilot bisa menemukannya di padang gurun terbuka.<br>" +
                "<br>" +
                "Sinyal asap efektif hanya pada hari yang tenang dan tenang. Angin kencang, hujan, atau salju membasahi asap, mengurangi peluangnya untuk terlihat.<br>" +
                "<b><i><br>Granat Asap</i></b><br>" +
                "Jika Anda memiliki granat asap dengan Anda, gunakan mereka dalam pola yang sama seperti yang dijelaskan untuk kebakaran. Jaga agar tetap kering sehingga bisa bekerja saat Anda membutuhkannya. Berhati-hatilah untuk tidak membakar pepohonan di sekitar saat Anda menggunakannya.<br>" +
                "<b><i><br>Pen Flares</i></b> <br>" +
                "Pen flare ini adalah bagian dari rompi survival penerbang. Perangkat terdiri dari senapan berbentuk pena dengan suar yang dilekatkan pada kabel nilon. Saat ditarik,  terdengar seperti tembakan pistol dan membakar suar setinggi 150 meter. Diameternya sekitar 3 sentimeter.<br>" +
                "Agar tangkai pena siap untuk segera digunakan, keluarkan dari bungkusnya, letakkan suar, biarkan pistol terlepas, dan kenakan dengan tali atau rantai di leher Anda. Bersiaplah untuk memecatnya di depan pesawat pencari dan bersiaplah dengan sinyal sekunder. Juga, siap untuk berlindung jika pilot kesalahan suar untuk tembakan musuh.<br>" +
                "<b><i><br>Amunisi</i></b><br>" +
                "Anda bisa menggunakan peluru senapan atau peluru pistol untuk memberi sinyal pada pesawat pencari. Jangan api amunisi di depan pesawat terbang. Seperti halnya pen flare, bersiaplah untuk berlindung jika pilot melakukan kesalahan terhadap peluru tembakan musuh Anda.<br>" +
                "<b><i><br>Star Clusters</b></i> <br>" +
                "Merah adalah warna marabahaya internasional; Oleh karena itu, gunakan cluster bintang merah bila memungkinkan. Warna apapun, bagaimanapun, akan membiarkan tim penyelamat Anda tahu di mana Anda berada. Cluster bintang mencapai ketinggian 200 sampai 215 meter, membakar rata-rata 6 sampai 10 detik, dan turun pada kecepatan 14 meter per detik.<br>" +
                "<b><i><br>Star Parachute Flares</b></i> <br>" +
                "Flare ini mencapai ketinggian 200 sampai 215 meter dan turun pada kecepatan 2,1 meter per detik. M126 (merah) terbakar sekitar 50 detik dan M127 (putih) sekitar 25 detik. Pada malam hari Anda bisa melihat flare ini pada 48 sampai 56 kilometer.<br>" +
                "Kaca atau Benda Mengkilat lainnya<br>" +
                "Pada hari yang cerah, cermin adalah perangkat sinyal terbaik Anda. Jika Anda tidak memiliki cermin, masukkan cangkir kantin Anda, ikat pinggang ikat pinggang Anda, atau benda serupa yang akan memantulkan sinar matahari. Langsung berkedip dalam satu area sehingga aman dari pengamatan musuh. Berlatih menggunakan cermin atau objek mengkilap untuk memberi isyarat sekarang; jangan menunggu sampai kamu membutuhkannya Jika Anda memiliki cermin sinyal MK-3, ikuti petunjuk di bagian belakangnya (Gambar 19-3).<br>" +
                " <br>";
        String text3 =
                "<p align=\"justify\">Kenakan cermin sinyal pada kabel atau rantai di sekitar leher Anda sehingga siap untuk segera digunakan. Namun, pastikan sisi kaca menempel pada tubuh Anda sehingga tidak berkedip; musuh bisa melihat kilatnya.<br>" +
                "PERINGATAN<br>" +
                "Jangan mengedarkan cermin sinyal dengan cepat karena pilot mungkin salah mengira berkedip untuk tembakan musuh. Jangan mengarahkan balok di kokpit pesawat terbang lebih dari beberapa detik karena bisa membendung pilot.<br>" +
                "Asap, kabut, dan fatamorgana bisa menyulitkan pilot untuk melihat sinyal dari benda yang berkedip. Jadi, jika mungkin, sampai ke titik tertinggi di wilayah Anda saat memberi sinyal. Jika Anda tidak dapat menentukan lokasi pesawat, nyalakan sinyal Anda ke arah kebisingan pesawat terbang.<br>" +
                "Catatan: Pilot telah melaporkan bahwa melihat cermin berkedip hingga 160 kilometer jauhnya dalam kondisi ideal.<br>" +
                "Gambar 19-4 dan 19-5 menunjukkan metode untuk mengarahkan cermin sinyal untuk pensinyalan.<br>" +
                " <br>";
        String text4 =
                "<p align=\"justify\"><b><i>Senter atau Lampu Sorot</i></b> <br>" +
                "Pada malam hari Anda bisa menggunakan lampu senter atau lampu strobo untuk mengirim SOS ke pesawat terbang. Saat menggunakan lampu strobo, jaga agar pilot tidak salah melihatnya karena kebakaran di darat. Lampu strobo berkedip 60 kali per menit. Beberapa lampu strobo memiliki penutup inframerah dan lensa. Kolimator flash biru juga tersedia untuk lampu strobo.<br>" +
                "<b><i><br>VS-17 Panel</b></i> <br>" +
                "Pada siang hari Anda bisa menggunakan panel VS-17 untuk memberi isyarat. Letakkan sisi oranye ke atas karena lebih mudah dilihat dari udara daripada sisi violet. Berkedip panel akan memudahkan bagi aircrew untuk melihat. Anda bisa menggunakan kain oranye atau ungu terang sebagai pengganti VS-17.<br>" +
                "<b><i><br>Pakaian</i></b> <br>" +
                "Menyebarkan pakaian di tanah atau di atas pohon adalah cara lain untuk memberi sinyal. Pilih artikel yang warnanya akan kontras dengan lingkungan sekitar. Aturlah mereka dalam pola geometris yang besar untuk membuat mereka lebih cenderung menarik perhatian.<br>" +
                "<b><i><br>Meterial Alam</b></i>  <br>" +
                "Jika Anda kekurangan sarana lain, Anda bisa menggunakan bahan alami untuk membentuk simbol atau pesan yang bisa dilihat dari udara. Bangun gundukan yang membuat bayangan; Anda bisa menggunakan sikat, dedaunan dari jenis, batu, atau blok salju.<br>" +
                "Di daerah yang tertutup salju, gelapkan salju untuk membentuk huruf atau simbol dan mengisi depresi dengan bahan kontras (ranting atau cabang). Di pasir, gunakan batu-batu besar, vegetasi, atau rumput laut untuk membentuk simbol atau pesan. Di area yang tertutup sikat, gunting pola di vegetasi atau bakar tanah. Di tundra, gali parit atau putar sod terbalik.<br>" +
                "Di medan apapun, gunakan material kontras yang akan membuat simbol terlihat pada kru pesawat.<br>" +
                "<b><i><br>Penanda Pewarna Laut</b></i> <br>" +
                "Semua pesawat Angkatan Darat/ yang terlibat dalam operasi di dekat atau di atas air biasanya akan membawa kit kelangsungan hidup air yang mengandung spidol pewarna laut. Jika Anda berada dalam situasi bertahan hidup dengan air, gunakan penanda pewarna laut di siang hari untuk menunjukkan lokasi Anda. Bintik-bintik pewarna ini tetap mencolok selama sekitar 3 jam, kecuali di lautan yang sangat kasar. Gunakan mereka hanya jika Anda berada di daerah yang ramah. Jaga spidol dibungkus sampai Anda siap menggunakannya. Gunakan mereka hanya saat Anda mendengar atau melihat pesawat terbang. Penanda pewarna laut juga sangat efektif di atas tanah yang tertutup salju; gunakan mereka untuk menulis surat kode bahaya.<br>" +
                "<b><br>Sinyal Audio</b><br>" +
                "Radio, peluit, dan tembakan adalah beberapa metode yang dapat Anda gunakan untuk memberi isyarat kehadiran Anda ke penyelamat.<br>" +
                "<b><i><br>Peralataan Radio</b></i><br>" +
                "Radio kelangsungan hidup AN / PRC-90 adalah bagian dari rompi kelangsungan hidup penerbang Angkatan Darat. AN / PRC-112 akhirnya akan menggantikan AN / RRC-90. Kedua radio dapat mentransmisikan nada atau suara. Jenis radio Angkatan Darat lainnya bisa melakukan hal yang sama. Rentang radio yang berbeda bervariasi tergantung pada ketinggian pesawat penerima, medan, kepadatan vegetasi, cuaca, kekuatan baterai, jenis radio, dan gangguan. Untuk mendapatkan performa maksimal dari radio, gunakan prosedur berikut ini: <br>" +
                "<ul><li><p align=\"justify\">Cobalah untuk hanya mentransmisikan di medan yang jelas dan tidak terhalang. Karena radio adalah perangkat komunikasi garis depan, medan antara radio dan receiver akan menghalangi sinyal. </li>" +
                "<li><p align=\"justify\">Jauhkan antena pada sudut kanan ke pesawat yang diselamatkan. Tidak ada sinyal dari ujung antena.</li>" +
                "<li><p align=\"justify\">Jika radio memiliki kemampuan nada, pasang tegak lurus pada permukaan datar dan tinggi sehingga Anda dapat melakukan tugas bertahan lainnya.</li>" +
                "<li><p align=\"justify\">Jangan biarkan antena menyentuh pakaian, tubuh, dedaunan, atau tanah Anda. Kontak semacam itu sangat mengurangi jangkauan sinyal. </li>" +
                "<li><p align=\"justify\">Menghemat daya baterai. Matikan radio saat Anda tidak menggunakannya. Jangan mengirim atau menerima terus-menerus. Di wilayah yang tidak bersahabat, jaga agar transmisi tetap pendek untuk menghindari pencarian arah radio musuh.</li>" +
                "<li><p align=\"justify\">Dalam cuaca dingin, simpan baterai di dalam pakaian saat tidak menggunakan radio. Dingin dengan cepat menghabiskan daya baterai. Jangan memaparkan baterai ke panas yang ekstrem seperti matahari gurun. Panas yang tinggi dapat menyebabkan baterai meledak. Usahakan agar radio dan baterai kering mungkin, karena air bisa merusak sirkuit.</li>" +
                "</ul><b><i>Peluit</b></i> <br>" +
                "Peluit memberikan cara yang bagus untuk sinyal close up. Dalam beberapa kasus terdokumentasi, mereka telah didengar sampai 1,6 kilometer jauhnya. Peluit diproduksi memiliki jangkauan lebih dari peluit manusia.<br>" +
                "<b><i>Tembakan Senjata</b></i> <br>" +
                "Dalam beberapa situasi Anda bisa menggunakan senjata api untuk memberi isyarat. Tiga tembakan yang dipecat pada interval yang berbeda biasanya mengindikasikan sinyal bahaya. Jangan gunakan teknik ini di wilayah musuh. Musuh pasti akan datang untuk menyelidiki tembakan.<br>" +
                "<p align=\"center\"><br><b>KODE DAN SINYAL<b> <br>" +
                "<p align=\"justify\">Sekarang Anda tahu bagaimana membiarkan orang tahu di mana Anda berada, Anda perlu tahu bagaimana memberi mereka lebih banyak informasi. Lebih mudah membentuk satu simbol daripada mengeja seluruh pesan. Oleh karena itu, pelajari kode dan simbol yang dipahami semua pilot pesawat terbang.<br>" +
                "<b>SOS</b> <br>" +
                "Anda bisa menggunakan lampu atau bendera untuk mengirim SOS - tiga titik, tiga tanda hubung, tiga titik. SOS adalah sinyal distress yang diakui secara internasional dalam kode radio Morse. Titik adalah denyut nadi yang pendek dan tajam; Dash adalah pulsa yang lebih panjang. Terus ulangi sinyal. Saat menggunakan bendera, tahan bendera di sisi kiri untuk tanda hubung dan di sisi kanan titik-titik.<br>" +
                "Ground-to-Air Emergency Code <br>" +
                "Kode ini (Gambar 19-6) sebenarnya adalah lima simbol yang pasti dan berarti. Buatlah simbol-simbol ini minimal 1 meter dan panjangnya 6 meter. Jika Anda membuatnya lebih besar, simpan rasio 1: 6 yang sama. Pastikan sinyal sangat kontras dengan ground yang ada. Tempatkan di tempat terbuka dengan mudah terlihat dari udara. <br>" +
                " <br>";
        String text5 =
                "<p align=\"justify\"><b>Bahasa Tubuh</b><br>" +
                "Bila sebuah pesawat cukup dekat sehingga pilot bisa melihat Anda dengan jelas, gunakan gerakan tubuh atau posisi (Gambar 19-7) untuk menyampaikan pesan.<br>" +
                " <br>";
        String text6 =
                "<p align=\"justify\"><b><br>Panel Sinyal </b><br>" +
                "Jika Anda memiliki penutup rafal atau layar hidup, atau pengganti yang sesuai, gunakan simbol yang ditunjukkan pada Gambar 19-8 untuk menyampaikan pesan.<br>" +
                " <br>";
        String text7 =
                "<p align=\"justify\"><b><br>Aircraft Acknowledgments</b> <br>" +
                "Begitu pilot pesawat terbang sayap tetap melihat Anda, dia biasanya akan menunjukkan bahwa dia telah melihat Anda dengan terbang rendah, menggerakkan pesawat, dan lampu berkedip seperti yang ditunjukkan pada Gambar 19-9. Bersiaplah untuk menyampaikan pesan lain ke pilot begitu dia mengetahui bahwa dia menerima dan memahami pesan pertama Anda. Gunakan radio jika memungkinkan, untuk menyampaikan pesan lebih lanjut. Jika tidak ada radio yang tersedia, gunakan kode yang tercakup dalam paragraf sebelumnya.<br>" +
                " <br>";
        String text8 =
                "<p align=\"center\"><b>PROSEDUR VEKTOR PESAWAT</b><br>" +
                "<p align=\"justify\">Jika Anda dapat menghubungi pesawat terbang yang ramah dengan radio, pandu pilot ke lokasi Anda. Gunakan format umum berikut untuk memandu pilot: <br>" +
                "<ul><li>Mayday, Mayday.</li>" +
                "<li>Sebutkan Isyarat (jika ada). </li>" +
                "<li>Nama. </li>" +
                "<li>Lokasi. </li>" +
                "<li>Jumlah yang selamat. </li>" +
                "<li>Tempat landasan yang tersedia . </li>" +
                "<li>Katakan kebutuhan seperti bantuan medis atau jenis bantuan khusus lainnya yang dibutuhkan segera.</li>" +
                "</ul><p align=\"justify\">Hanya karena Anda telah melakukan kontak dengan regu penyelamat tidak berarti Anda aman. Ikuti instruksi dan terus gunakan teknik bertahan dan penghindaran suara sampai Anda benar-benar diselamatkan.<br>"+
                        "<br><br><i>Departemen Petahanan Amerika Serikat, US Army Field Manual \"Survival\" (FM 21-76), Markas Besar Departemen Tentara Amerika Serikat 1956.";
        String foto = "<p align=\"center\"><img src=\"tanda/tanda1.png\"></p>";
        String foto1 = "<p align=\"center\"><img src=\"tanda/tanda2.png\"></p>";
        String foto2 = "<p align=\"center\"><img src=\"tanda/tanda3.png\"></p>";
        String foto3 = "<p align=\"center\"><img src=\"tanda/tanda4.png\"></p>";
        String foto4 = "<p align=\"center\"><img src=\"tanda/tanda5.png\"></p>";
        String foto5 = "<p align=\"center\"><img src=\"tanda/tanda6.png\"></p>";
        String foto6 = "<p align=\"center\"><img src=\"tanda/tanda7.png\"></p>";
        String foto7 = "<p align=\"center\"><img src=\"tanda/tanda8.png\"></p>";
        String foto8 = "<p align=\"center\"><img src=\"tanda/tanda9.png\"></p>";
        String foto9 = "<p align=\"center\"><img src=\"tanda/tanda10.png\"></p>";
        view.loadDataWithBaseURL("file:///android_asset/", foto+text + foto1 + text1 + foto2 + text2 + foto3 + text3 + foto4 + text4 + foto5 + foto6 + text5 + foto7 + text6 + foto8 + text7 + foto9 + text8 + "</p>", "text/html", "utf-8", null);
        return rootView;
    }

}
