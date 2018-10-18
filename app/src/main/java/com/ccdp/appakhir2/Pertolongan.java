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
public class Pertolongan extends Fragment {


    public Pertolongan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_psikologi,
                container, false);
        
        WebView view = (WebView) rootView.findViewById(R.id.psikologi1);
        String text = " " +
                "<p align=\"justify\">Dalam bab ini membahas beberapa informasi dari beberapa kasus cara dan bagaimana Pertolongan Pertama Pada Saat Kecelakaan (P3K) di alam bebas. Metode P3K Di Alam Bebas berikut ini adalah sebuah metode penanganan atau penanggulangan pertama pada satu gangguan ataupun kecelakaan yang biasa terjadi saat berkegiatan di alam bebas. Banyak yang sebenarnya mudah kita lakukan, tetapi jarang yang mau ataupun sigap dalam melakukan pertolongan pertama dan awal apabila ada rekan lain yang mengalami kecelakaan di alam terbuka.<br>" +
                " <br>" +
                "<b>BERIKUT KASUS – KASUS KECELAKAAN ATAU GANGGUAN DALAM KEGIATAN SURVIVAL</b><br>" +
                "<b><p align=\"justify\">A. PINGSAN <i>(Syncope/collapse)</i></b>" +
                "<br>Yaitu hilangnya kesadaran sementara karena otak kekurangan O2, lapar, terlalu banyak mengeluarkan tenaga, dehidrasi ( kekurangan cairan tubuh ), hiploglikemia, animea.<br>" +
                "<br><b>Gejala</b>" +
                "<ul><li>Perasaan limbung</li>" +
                "<li>Pandangan berkunang – kunang</li>" +
                "<li>Telinga berdenging</li>" +
                "<li>Nafas tidak teratur</li>" +
                "<li>Muka pucat</li>" +
                "<li>Biji mata melebar</li>" +
                "<li>Lemas</li>" +
                "<li>Keringat dingin</li>" +
                "<li>Menguap berlebihan</li>" +
                "<li>Tak respon ( beberapa menit )</li>" +
                "<li>Denyut nadi lambat</li></ul>" +
                "<b>Penanganan</b><ol>" +
                "<li>Baringkan korban dalam posisi terlentang</li>" +
                "<li>Tinggikan tungkai melebihi tinggi jantung</li>" +
                "<li>Longgarkan pakaian yang mengikat dan hilangkan barang yang menghambat pernafasan</li>" +
                "<li>Beri udara segar</li>" +
                "<li>Periksa kemungkinan cedera lain</li>" +
                "<li>Selimuti korban</li>" +
                "<li>Korban diistirahatkan beberapa saat</li>" +
                "<li>Bila tak segera sadar >> periksa nafas dan nadi >> posisi stabil >> Rujuk ke instansi kesehatan</li></ol>" +
                "<b><p align=\"justify\">B. DEHIDRASI</b>" +
                "<br>Yaitu suatu keadaan dimana tubuh mengalami kekurangan cairan. Hal ini terjadi apabila cairan yang dikeluarkan tubuh melebihi cairan yang masuk. Keluarnya cairan ini biasanya disertai dengan elektrolit ( K, Na, Cl, Ca ). Dehidrasi disebabkan karena kurang minum dan disertai kehilangan cairan / banyak keringat karena udara terlalu panas atau aktivitas yang terlalu berlebihan.<br>" +
                "<b><br>Gejala dan tanda</b><br>" +
                "<ol><li>Dehidrasi ringan</li>" +
                "<ul><li>Defisit cairan 5% dari berat badan</li>" +
                "<li>Penderita merasa haus</li>" +
                "<li>Denyut nadi lebih dari 90x / menit</li>" +
                "</ul><li>Dehidrasi sedang</li>" +
                "<li>Defisit cairan antara 5 – 10% dari berat badan</li>" +
                "<li>Nadi lebih dari 90x / menit</li>" +
                "<li>Nadi lemah</li>" +
                "<li>Sangat haus</li>" +
                "</ul><li>Dehidrasi berat</li>" +
                "<ul>Defisit cairan lebih dari 10% dari berat badan</li>" +
                "<li>Hipotensi</li>" +
                "<li>Mata cekung</li>" +
                "<li>Nadi sangat lemah, sampai tak terasa</li>" +
                "<li>Kejang – kejang</li>" +
                "</ul></ol><b>Penanganan</b>" +
                "<ol><li>Mengganti cairan yang hilang dan mengatasi shock</li>" +
                "<li>mengganti elektrolit yang lemah</li>" +
                "<li>Mengenal dan mengatasi komplikasi yang ada</li>" +
                "<li>Memberantas penyebabnya</li>" +
                "<li>Rutinlah minum jangan tunggu haus</li>" +
                "</ol><p align=\"justify\"><b>C. ASMA</b>" +
                "<br>Yaitu penyempitan / gangguan saluran pernafasan.<br>" +
                "<b><br>Gejala</b>" +
                "<ul><li>Sukar bicara tanpa berhenti, untuk menarik nafas</li>" +
                "<li>Canned be heard the voice of the additional breath (Kalengan menjadi terdengar suara dari nafas tambahan)</li>" +
                "<li>Otot Bantu nafas terlihat menonjol ( dileher )</li>" +
                "<li>Irama nafas tidak teratur</li>" +
                "<li>Terjadinya perubahan warna kulit ( merah / pucat / kebiruan / sianosis )</li>" +
                "<li>Kesadaran menurun ( gelisah / meracau )</li>" +
                "</ul><b>Penanganan</b>" +
                "<ol><li>Tenangkan korban</li>" +
                "<li>Bawa ketempat yang luas dan sejuk</li>" +
                "<li>Posisikan ½ duduk</li>" +
                "<li>Atur nafas</li>" +
                "<li>Beri oksigen ( bantu ) bila diperlukan</li>" +
                "</ol><p align=\"justify\"><b>D. PUSING / VERTIGO / NYERI KEPALA</b>" +
                "<br>Yaitu sakit kepala yang disebabkan oleh kelelahan, kelaparan, gangguan kesehatan dll.<br>" +
                "<br><b>Gejala</b>" +
                "<ul><li>Kepala terasa nyeri / berdenyut</li>" +
                "<li>Kehilangan keseimbangan tubuh</li>" +
                "<li>Lemas</li>" +
                "</ul><b>Penanganan</b>" +
                "<ol><li>Istirahatkan korban</li>" +
                "<li>Beri minuman hangat</li>" +
                "<li>beri obat bila perlu</li>" +
                "<li>Tangani sesuai penyebab</li>" +
                "</ol><b><p align=\"justify\">E. MAAG / MUAL</b><br>" +
                "Yaitu gangguan lambung / saluran pencernaan.<br>" +
                "<b><br>Gejala</b>" +
                "<ul><li>Perut terasa nyeri / mual</li>" +
                "<li>Berkeringat dingin</li>" +
                "<li>Lemas</li>" +
                "</ul><b>Penanganan</b>" +
                "<ol><li>Istirahatkan korban dalam posisi duduk ataupun berbaring sesuai kondisi korban</li>" +
                "<li>Beri minuman hangat ( teh / kopi )</li>" +
                "<li>Jangan beri makan terlalu cepat</li>" +
                "</ol><b><p align=\"justify\">F. LEMAH JANTUNG </b>" +
                "<br>Yaitu nyeri jantung yang disebabkan oleh sirkulasi darah kejantung terganggu atau terdapat kerusakan pada jantung.<br>" +
                "<br><b>Gejala</b>" +
                "<ul><li>Nyeri di dada</li>" +
                "<li>Penderita memegangi dada sebelah kiri bawah dan sedikit membungkuk</li>" +
                "<li>Kadang sampai tidak merespon terhadap suara</li>" +
                "<li>Denyut nadi tak teraba / lemah</li>" +
                "<li>Gangguan nafas</li>" +
                "<li>Mual, muntah, perasaan tidak enak di lambung</li>" +
                "<li>Kepala terasa ringan</li>" +
                "<li>Lemas</li>" +
                "<li>Kulit berubah pucat / kebiruan</li>" +
                "<li>Keringat berlebihan</li>" +
                "</ul><p align=\"justify\">Tidak semua nyeri pada dada adalah sakit jantung. Hal itu bisa terjadi karena gangguan pencernaan, stress, tegang.<br>" +
                "<b><br>Penanganan</b>" +
                "<ol><li>Tenangkan korban</li>" +
                "<li>Istirahatkan</li>" +
                "<li>Posisi ½ duduk</li>" +
                "<li>Buka jalan pernafasan dan atur nafas</li>" +
                "<li>Longgarkan pakaian dan barang barang yang mengikat pada badan</li>" +
                "<li>Jangan beri makan / minum terlebih dahulu</li>" +
                "<li>Jangan biarkan korban sendirian ( harus ada orang lain didekatnya )</li>" +
                "</ol><p align=\"justify\"><b>F. HISTERIA</b>" +
                "<br>Yaitu sikap berlebih – lebihan yang dibuat – buat ( berteriak, berguling – guling ) oleh korban; secara kejiwaan mencari perhatian.<br>" +
                "<b><br>Gejala</b>" +
                "<ul><li>Seolah – olah hilang kesadaran</li>" +
                "<li>Sikapnya berlebihan ( meraung – raung, berguling – guling di tanah )</li>" +
                "<li>Tidak dapat bergerak / berjalan tanpa sebab yang jelas</li>" +
                "</ul><b>Penanganan</b>" +
                "<ol><li>Tenangkan korban</li>" +
                "<li>Pisahkan dari keramaian</li>" +
                "<li>Letakkan di tempat yang tenang</li>" +
                "<li>Awasi</li>" +
                "</ol><p align=\"justify\"><b>G. MIMISAN</b>" +
                "<br>Yaitu pecahnya pembuluh darah di dalam lubang hidung karena suhu ekstrim ( terlalu panas / terlalu dingin )/ kelelahan / benturan.<br>" +
                "<b><br>Gejala</b>" +
                "<ul><li>Dari lubang hidung keluar darah dan terasa nyeri</li>" +
                "<li>Korban sulit bernafas dengan hidung karena lubang hidung tersumbat oleh darah</li>" +
                "<li>Kadang disertai pusing</li>" +
                "</ul><b>Penanganan</b>" +
                "<ol><li>Bawa korban ke tempat sejuk / nyaman</li>" +
                "<li>Tenangkan korban</li>" +
                "<li>Korban diminta menunduk sambil menekan cuping hidung</li>" +
                "<li>Diminta bernafas lewat mulut</li>" +
                "<li>Bersihkan hidung luar dari darah</li>" +
                "<li>Buka setiap 5 / 10 menit. Jika masih keluar ulangi tindakan Pertolongan Pertama</li>" +
                "</ol><b><p align=\"justify\">H. KRAM</b>" +
                "<br>Yaitu otot yang mengejang / kontraksi berlebihan.<br>" +
                "<br><b>Gejala</b>" +
                "<ul><li>Nyeri pada otot</li>" +
                "<li>Kadang disertai bengkak</li>" +
                "</ul><b>Penanganan</b>" +
                "<ol><li>Istirahatkan</li>" +
                "<li>Posisi nyaman</li>" +
                "<li>Relaksasi</li>" +
                "<li>Pijat berlawanan arah dengan kontraksi</li>" +
                "</ol><p align=\"justify\"><b>I. MEMAR</b>" +
                "<br>Yaitu pendarahan yang terdi di lapisan bawah kulit akibat dari benturan keras.<br>" +
                "<b><br>Gejala</b>" +
                "<ul><li>Warna kebiruan / merah pada kulit</li>" +
                "<li>Nyeri jika di tekan</li>" +
                "<li>Kadang disertai bengkak</li>" +
                "</ul><b>Penanganan</b>" +
                "<ol><li>Kompres dingin</li>" +
                "<li>Balut tekan</li>" +
                "<li>Tinggikan bagian luka</li>" +
                "</ol><p align=\"justify\"><b>J. KESELEO</b>" +
                "<br>Yaitu pergeseran yang terjadi pada persendian biasanya disertai kram.<br>" +
                "<b><br>Gejala</b>" +
                "<ul><li>Bengkak</li>" +
                "<li>Nyeri bila tekan</li>" +
                "<li>Kebiruan / merah pada derah luka</li>" +
                "<li>Sendi terkunci</li>" +
                "<li>Ada perubahan bentuk pada sendi</li>" +
                "</ul><b>Penanganan</b>" +
                "<ol><li>Korban diposisikan nyaman</li>" +
                "<li>Kompres es / dingin</li>" +
                "<li>Balut tekan dengan ikatan 8 untuk mengurangi pergerakan</li>" +
                "<li>Tinggikan bagian tubuh yang luka</li>" +
                "</ol><p align=\"justify\"><b>K. LUKA</b>" +
                "<br>Yaitu suatu keadaan terputusnya kontinuitas jaringan secara tiba – tiba karena kekerasan / injury.<br>" +
                "<b><br>Gejala</b>" +
                "<ul><li>Terbukanya kulit</li>" +
                "<li>Pendarahan</li>" +
                "<li>Rasa nyeri</li>" +
                "</ul><b>Penanganan</b>" +
                "<ol><li>Bersihkan luka dengan antiseptic ( alcohol / boorwater )</li>" +
                "<li>Tutup luka dengan kasa steril / plester</li>" +
                "<li>Balut tekan ( jika pendarahannya besar )</li>" +
                "<li>Jika hanya lecet, biarkan terbuka untuk proses pengeringan luka</li>" +
                "</ol><b>Hal – hal yang perlu diperhatikan dalam menangani luka:</b><br>" +
                "<br>" +
                "Ketika memeriksa luka: adakah benda asing, bila ada:" +
                "<ul><li>Keluarkan tanpa menyinggung luka</li>" +
                "<li>Kasa / balut steril ( jangan dengan kapas atau kain berbulu )</li>" +
                "<li>Evakuasi korban ke pusat kesehatan</li>" +
                "<li>Bekuan darah: bila sudah ada bekuan darah pada suatu luka ini berarti luka mulai menutup. Bekuan tidak boleh dibuang, jika luka akan berdarah lagi.</li>" +
                "</ul></ol><br>" +
                "<b><p align=\"justify\">L. PENDARAHAN </b>" +
                "<br>Yaitu keluarnya darah dari saluran darah kapan saja, dimana saja, dan waktu apa saja. Penghentian darah dengan cara:<br>" +
                "<ol><li>Tenaga / mekanik, misal menekan, mengikat, menjahit dll</li>" +
                "<ul><li>Fisika:</li>" +
                "<li>Bila dikompres dingin akan mengecil dan mengurangi pendarahan</li>" +
                "<li>Bila dengan panas akan terjadinya penjedalan dan mengurangi</li>" +
                "</ul><li>Kimia: Obat – obatan</li>" +
                "<li>Biokimia: vitamin K</li>" +
                "<li>Elektrik: diahermik</li>" +
                "</ol><br>" +
                "<b><p align=\"justify\">M. PATAH TULANG / FRAKTUR</b>" +
                "<br>Yaitu rusaknya jaringan tulang, secara keseluruhan maupun sebagian.<br>" +
                "<b><br>Gejala</b>" +
                "<ul><li>Perubahan bentuk</li>" +
                "<li>Nyeri bila ditekan dan kaku</li>" +
                "<li>Bengkak</li>" +
                "<li>Terdengar / terasa ( korban ) derikan tulang yang retak/patah</li>" +
                "<li>Ada memar ( jika tertutup )</li>" +
                "<li>Terjadi pendarahan ( jika terbuka )</li>" +
                "</ul><b>Jenisnya</b>" +
                "<ul><li>Terbuka ( terlihat jaringan luka )</li>" +
                "<li>Tertutup</li>" +
                "</ul><b>Penanganan</b><br>" +
                "Tenangkan korban jika sadar.<br>" +
                "<br>Untuk patah tulang tertutup" +
                "<ol><li>Periksa Gerakan (apakah bagian tubuh yang luka bisa digerakan/diangkat)<br>" +
                "Sensasi ( respon nyeri )<br>" +
                "Sirkulasi ( peredaran darah )</li>" +
                "<li>Ukur bidai disisi yang sehat</li>" +
                "<li>Pasang kain pengikat bidai melalui sela – sela tubuh bawah</li>" +
                "<li>Pasang bantalan didaerah patah tulang</li>" +
                "<li>Pasang bidai meliputi 2 sendi disamping luka</li>" +
                "<li>Ikat bidai</li>" +
                "<li>Periksa GSS</li>" +
                "</ol>Untuk patah tulang terbuka" +
                "<ol><li>Buat pembalut cincin untuk menstabilkan posisi tulang yang mencuat</li>" +
                "<li>Tutup tulang dengan kasa steril, plastik, pembalut cincin</li>" +
                "<li>Ikat dengan ikatan V</li>" +
                "<li>Untuk selanjutnya ditangani seperti pada patah tulang tertutup</li>" +
                "</ol>Tujuan Pembidaian" +
                "<ol><li>Mencegah pergeseran tulang yang patah</li>" +
                "<li>memberikan istirahat pada anggota badan yang patah</li>" +
                "<li>mengurangi rasa sakit</li>" +
                "<li>Mempercepat penyembuhan</li>" +
                "</ol><b><p align=\"justify\">N. LUKA BAKAR </b>" +
                "<br>Yaitu luka yang terjadi akibat sentuhan tubuh dengan benda – benda yang menghasilkan panas ( api, air panas, listrik, atau zat – zat yang bersifat membakar )<br>" +
                "<b><br>Penanganan</b><br>" +
                "<ol><li>Matikan api dengan memutuskan suplai oksigen</li>" +
                "<ul><li>Perhatikan keadaan umum penderita</li>" +
                "</ul><li>Pendinginan</li>" +
                "<ul><li>Membuka pakaian penderita / korban</li>" +
                "<li>Merendam dalam air atau air mengalir selama 20 atau 30 menit. Untuk daerah wajah, cukup dikompres air</li>" +
                "</ul><li>Mencegah infeksi</li>" +
                "Luka ditutup dengan perban atau kain bersih kering yang tak dapat melekat pada luka</li>" +
                "<ul><li>Penderita dikerudungi kain putih</li>" +
                "<li>Luka jangan diberi zat yang tak larut dalam air seperti mentega, kecap dll</li>" +
                "</ul><li>Pemberian sedative / morfin 10 mg im diberikan dalam 24 jam sampai 48 jam pertama</li>" +
                "<li>Bila luka bakar luas penderita dikuasakan</li>" +
                "<li>Transportasi kefasilitasan yang lebih lengkap sebaiknya dilakukan dalam satu jam bila tidak memungkinkan masih bisa dilakukan dalam 24 – 48 jam pertama dengan pengawasan ketat selama perjalanan.</li>" +
                "<li>Khusus untuk luka bakar daerah wajah, posisi kepala harus lebih tinggi dari tubuh.</li>" +
                "</ol><p align=\"justify\"><b>O. HIPOTERMIA</b>" +
                "<br>Yaitu suhu tubuh menurun karena lingkungan yang dingin.<br>" +
                "<br><b>Gejala</b>" +
                "<ul><li>Menggigil / gemetar</li>" +
                "<li>Perasaan melayang</li>" +
                "<li>Nafas cepat, nadi lambat</li>" +
                "<li>Pandangan terganggu</li>" +
                "<li>Reaksi manik mata terhadap rangsangan cahaya lambat</li>" +
                "</ul><b>Penanganan</b>" +
                "<ol><li>Bawa korban ketempat hangat</li>" +
                "<li>Jaga jalan nafas tetap lancar</li>" +
                "<li>Beri minuman hangat dan selimut</li>" +
                "<li>Jaga agar tetap sadar</li>" +
                "<li>Setelah keluar dari ruangan, diminta banyak bergerak ( jika masih kedinginan )</li>" +
                "</ol><b>P. KERACUNAN MAKANAN DAN MINUMAN</b><br>" +
                "<br><b>Gejala</b>" +
                "<ul><li>Mual, muntah</li>" +
                "<li>Keringat dingin</li>" +
                "<li>Wajah pucat / kebiruan</li>" +
                "</ul><b>Penanganan</b>" +
                "<ol><li>Bawa ke tempat teduh dan segar</li>" +
                "<li>Korban diminta muntah</li>" +
                "<li>Diberi norit</li>" +
                "<li>Istirahatkan</li>" +
                "<li>Jangan diberi air minum sampai kondisinya lebih baik</li>" +
                "</ol><br>" +
                "<b><p align=\"justify\">Q. GIGITAN BINATANG</b>" +
                "<br>Gigitan binatang dan sengatan, biasanya merupakan alat dari binatang tersebut untuk mempertahankan diri dari lingkungan atau sesuatu yang mengancam keselamatan jiwanya. Gigitan binatang terbagi menjadi dua jenis; yang berbisa ( beracun ) dan yang tidak memiliki bisa. Pada umumnya resiko infeksi pada gigitan binatang lebih besar daripada luka biasa.<br>" +
                "Pertolongan Pertamanya adalah:" +
                "<ul><li>Cucilah bagian yang tergigit dengan air hangat dengan sedikit antiseptik</li>" +
                "<li>Bila pendarahan, segera dirawat dan kemudian dibalut</li>" +
                "</ul><p align=\"justify\">Ada beberapa jenis binatang yang sering menimbulkan ganguan saat melakukan kegiatan di alam terbuka, diantaranya:<br>" +
                "<br><b>Gigitan Ular</b>" +
                "<p align=\"justify\">Tidak semua ular berbisa, akan tetapi hidup penderita / korban tergantung pada ketepatan diagnosa, maka pad keadaan yang meragukan ambillah sikap menganggap ular tersebut berbisa. Sifat bisa / racun ular terbagi menjadi 3, yaitu:" +
                "<ol><li>Hematotoksin ( keracunan dalam )</li>" +
                "<li>Neurotoksin ( bisa / racun menyerang sistem saraf )</li>" +
                "<li>Histaminik ( bisa menyebabkan alergi pada korban )</li>" +
                "</ol><p align=\"justify\">Nyeri yang sangat dan pembengkakan dapat timbul pada gigitan, penderita dapat pingsan, sukar bernafas dan mungkin disertai muntah. Sikap penolong yaitu menenangkan penderita adalah sangat penting karena rata – rata penderita biasanya takut mati.<br>" +
                "<br><b>Penanganan untuk Pertolongan Pertama:</b><br>" +
                "<ol><li>Telentangkan atau baringkan penderita dengan bagian yang tergigit lebih rendah dari jantung.<br>" +
                "<li>Tenangkan penderita, agar penjalaran bisa ular tidak semakin cepat</li>" +
                "<li>Cegah penyebaran bias penderita dari daerah gigitan</li>" +
                "<ul><li>Torniquet di bagian proximal daerah gigitan pembengkakan untuk membendung sebagian aliran limfa dan vena, tetapi tidak menghalangi aliran arteri. Torniquet / toniket dikendorkan setiap 15 menit selama + 30 detik</li>" +
                "<li>Letakkan daerah gigitan dari tubuh</li>" +
                "<li>Berikan kompres es</li>" +
                "<li>Usahakan penderita setenang mungkin bila perlu diberikan petidine 50 mg / im untuk menghilangkan rasa nyeri</li>" +
                "</ul><li>Perawatan luka</li>" +
                "<ul><li>Hindari kontak luka dengan larutan asam Kmn 04, yodium atau benda panas</li>" +
                "<li>Zat anestetik disuntikkan sekitar luka jangan kedalam lukanya, bila perlu pengeluaran ini dibantu dengan pengisapan melalui breastpump sprit atau dengan isapan mulut sebab bisa ular tidak berbahaya bila ditelan ( selama tidak ada luka di mulut ).</li>" +
                "</ul><li>Bila memungkinkan, berikan suntikan anti bisa ( antifenin )</li>" +
                "<li>Perbaikan sirkulasi darah</li>" +
                "<ul><li>Kopi pahit pekat</li>" +
                "<li>Kafein nabenzoat 0,5 gr im /iv</li>" +
                "<li>Bila perlu diberikan pula vasakonstriktor</li>" +
                "</ul><li>Obat – obatan lain</li>" +
                "<ul><li>Ats</li>" +
                "<li>Toksoid tetanus 1 ml</li>" +
                "<li>Antibiotic misalnya: PS 4:1</li>" +
                "</ul></ol><b>Gigitan Lipan</b><br>" +
                "Ciri – ciri" +
                "<ol><li>Ada sepasang luka bekas gigitan</li>" +
                "<li>Sekitar luka bengkak, rasa terbakar, pegal dan sakit biasanya hilang dengan sendirinya setelah 4 – 5 jam</li>" +
                "</ol><b>Penanganan</b>" +
                "<ol><li>Kompres dengan yang dingin dan cuci dengan obat antiseptik</li>" +
                "<li>Beri obat pelawan rasa sakit, bila gelisah bawa ke paramedik</li>" +
                "</ol><b>Gigitan Lintah dan Pacet</b><br>" +
                "Ciri – ciri<br><br>" +
                "Pembengkakan, gatal dan kemerah – merahan ( lintah )<br>" +
                "<b><br>Penanganan</b>" +
                "<ol><li>Lepaskan lintah / pacet dengan bantuan air tembakau / air garam</li>" +
                "<li>Bila ada tanda – tanda reaksi kepekaan, gosok dengan obat atau salep anti gatal</li>" +
                "</ol><b><p align=\"justify\">Sengatan Lebah / Tawon dan Hewan Penyengat lainnya</b><br>" +
                "Biasanya sengatan ini kurang berbahaya walaupun bengkak, memerah, dan gatal. Namun beberapa sengatan pada waktu yang sama dapat memasukkan racun dalam tubuh korban yang sangat menyakiti.<br>" +
                "<b><br>Perhatian:</b>" +
                "<ul><li><p align=\"justify\">Dalam hal sengatan lebah, pertama cabutlah sengat – sengat itu tapi jangan menggunakan kuku atau pinset, Anda justru akan lebih banyak memasukkan racun kedalam tubuh. Cobalah mengorek sengat itu dengan mata pisau bersih atau dengan mendorongnya ke arah samping</li>" +
                "<li><p align=\"justify\">Balutlah bagian yang tersengat dan basahi dengan larutan garam inggris.</li>" +
                "</ul><b><p align=\"justify\">R. LUKA TEMBAK</b>" +
                "<br>Ada berbagai jenis peluru, namun peluru yang umum dipakai adalah yang memiliki inti timah dilapisi oleh bebapa jenis casing. Pada kecepatan rata-rata saat ditembakkan, proyektil bisa melesat hingga 1,500 meter per detik, tergantung dari inti amunisi dan jenis senjata yang digunakan.<br>" +
                "Ada tiga faktor utama untuk menentukan tingkat keparahan luka tembak, yaitu:" +
                "<ul><li>Lokasi tembak dan jalur keluar-masuk peluru</li>" +
                "<li>Ukuran proyektil</li>" +
                "<li>Kecepatan proyektil</li>" +
                "</ul><p align=\"justify\">Ketiganya akan memiliki dampak pada luka tembak, namun mengubah kecepatan peluru membuat perbedaan besar terhadap tingkat fatalitas yang diakibatkan oleh tembakan tersebut. Singkatnya, semakin besar senjata, akan semakin besar luka tembakan yang dihasilkan.<br>" +
                "<b><br>Penanganan</b>" +
                "<ol><li><p align=\"justify\">Tetap aman. Jika Anda bukan korban luka tembak, tetap selalu utamakan kewaspadaan umum. Segala situasi yang melibatkan senjata api berpotensi bahaya. Jika Anda juga terluka, Anda tidak bisa memberikan banyak pertolongan bagi korban tersebut.</li>" +
                "<li><p align=\"justify\">Telepon polisi (110) atau layanan gawat darurat (119/112), segera setelah Anda mengetahui pasti bahwa ada keterlibatan senjata api. Bertahan hidup dari luka tembak sangat bergantung pada seberapa cepat korban dilarikan ke rumah sakit. Idealnya, korban luka tembak harus segera dilarikan ke unit gawat darurat terdekat dalam 10 menit setelah tertembak.</li>" +
                "<li><p align=\"justify\">Jangan pindahkan korban, jika keselamatan dirinya terancam.</li>" +
                "<li><p align=\"justify\">Buka pakaian atau celananya, dan periksa menyeluruh untuk mencari luka tembak. Anda tidak bisa hanya bergantung pada mencari jalur masuk-keluar peluru, bahwa semua peluru akan secara otomatis menembus keluar di jalur yang sama dengan tempat masuknya dalam keadaan utuh. Kadang, peluru dapat menabrak tulang, pecah menjadi serpihan kecil, dan berbelok kemana saja di dalam tubuh. Beberapa jenis peluru dapat menyebabkan luka ganda." +
                "<p align=\"justify\">Kepala dan tubuh bagian atas (dada dan abdomen) adalah dua area tubuh yang paling kritis, dengan kemungkinan komplikasi gangguan sistem saraf utama atau kerusakan organ berat dan perdarahan.</li>" +
                "<li><p align=\"justify\">Hentikan perdarahan" +
                "<ul><li><p align=\"justify\">Berikan tekanan langsung. Sebisa mungkin, beri tekanan pada luka. Jika Anda memiliki kain kasa, gunakanlah. Pembalut kasa akan menahan darah dan membantu komponen darah untuk tetap bersama dalam luka, guna mendorong proses pembekuan darah. Jika Anda tidak memiliki kain kasa, sobekan baju korban atau handuk juga akan bekerja dengan baik. Jika darah menembus kasa, tambahkan lapisannya dan jangan pernah mengangkat kain tersebut. Mengupas kain kasa dari luka akan menghentikan proses pembekuan darah sehingga perdarahan akan terus berlanjut.</li>" +
                "<li><p align=\"justify\">Angkat bagian tubuh yang terluka lebih tinggi dari jantung. Posisikan luka lebih tinggi daripada jantungnya. Dengan begitu, Anda akan memperlambat aliran darah dan memudahkan untuk menghentikan perdarahan. Ingat: tetap aplikasikan tekanan di atas luka.</li>" +
                "<li><p align=\"justify\">Tahan luka. Poin tekanan adalah area tubuh di mana pembuluh darah terlihat jelas dari permukaan kulit. Dengan menekan pembuluh darah di lokasi ini, aliran darah akan berjalan lebih lambat, yang memungkinkan tekanan langsung bisa menghentikan perdarahan. Pastikan Anda menekan pembuluh darah di lokasi yang lebih dekat ke jantung, bukannya di sekitar luka. Menekan pembuluh darah jauh dari jantung tidak akan memiliki dampak apapun terhadap penghentian perdarahan.</li>" +
                "</ul><li><p align=\"justify\">Rawat syok. Perawatan syok harus dilakukan sejak awal dan bersamaan dengan perawatan perdarahan, dan berlanjut hingga bantuan medis datang. Caranya:" +
                "<ul><li><p align=\"justify\">Pastikan korban masih bernapas.</li>" +
                "<li><p align=\"justify\">ika Anda tidak melihat ada cedera leher, pastikan korban dalam kondisi telentang dan tinggikan kakinya di atas jantung. Jangan mengangkat kaki untuk mengobati syok jika luka tembak berada di atas pinggang, kecuali luka tembak ada di lengan.</li>" +
                "<li><p align=\"justify\">Jika korban muntah, miringkan kepalanya. Jika dalam posisi berbaring, buka mulutnya, dan keluarkan isi muntahannya.</li>" +
                "<li><p align=\"justify\">Jaga agar korban tetap hangat. Kematian akibat hipotermia adalah risiko nyata.</li>" +
                "</ul><li><p align=\"justify\">Jika korban tidak sadar, tetapi masih bernapas, pastikan untuk menjaga saluran napas tetap terbuka dan tidak terhalang. Jika korban tidak bernapas, lakukan pernapasan buatan (CPR). Perhatikan tanda-tanda vital korban.<br>" +
                "</ol><b>Yang terjadi setelah pulih dari luka tembak</b>" +
                "<p align=\"justify\">Ditembak oleh senjata api merupakan pengalaman traumatis. Anda mungkin akan merasa tergoncang, merasa keselamatan Anda terancam, depresi, atau kemarahan sebagai hasilnya. Semua ini adalah reaksi normal bagi seseorang yang baru saja mengalami pengalaman traumatik dan bukan tanda kelemahan. Anda juga mungkin melihat gejala lain, seperti:" +
                "<ul><li>Kegelisahan</li>" +
                "<li>Mimpi buruk atau kesulitan tidur</li>" +
                "<li>Teringat oleh kejadian traumatik tersebut sepanjang waktu</li>" +
                "<li>Lekas marah</li>" +
                "<li>Lesu dan tidak berenergi</li>" +
                "<li>Dirundung oleh kesedihan</li>" +
                "</ul><p align=\"justify\">Jika Anda terus mengalami gejala di atas dan merasa kewalahan oleh perasaan negatif lebih dari tiga minggu, hubungi dokter Anda. Korban tembak perlu mendapatkan tidak hanya perawatan fisik atas luka tembaknya, namun juga perawatan secara emosional untuk mengatasi gejala di atas yang mungkin bisa berkembang menjadi gangguan stres pasca kejadian traumatik (Post Traumatic Stress Disorder/PTSD).<br>";
        view.loadData(text , "text/html", "utf-8");
        return rootView;
    }

}
