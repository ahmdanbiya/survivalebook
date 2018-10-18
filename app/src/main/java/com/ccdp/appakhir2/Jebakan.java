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
public class Jebakan extends Fragment {


    public Jebakan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_perencanaan,
                container, false);
        WebView view = (WebView) rootView.findViewById(R.id.perencanaan1);
        String text = "<p align=\"center\"><b>JEBAKAN/PENJERAT (TRAP)</b><br>" +
                "<p align=\"justify\">Salah satu keterampilan yang mendukung dalam melakukan kegiatan survival adalah keahlian membuat trap. Trap ini digunakan survivor untuk menangkap binatang lalu diambil dagingnya untuk dimakan maupun untuk mengurangi ancaman bahaya dari musuh anda yang mengancam keselamatan anda. Membuat trap kadangkala memerlukan bahan lainya, seperti : karet, kawat, tali, dan sebagainya. Maka dari itu barang-barang tersebut tersedia di dalam survival kit.<br>" +
                "<br>" +
                "Aturan dalam membuat perangkap:<br>" +
                "<ul><li><p align=\"justify\">Hindari terlalu mencemari lingkungan, jangan pernah meninggalkan tanda-tanda pernah berada di pembuatan trap</li>" +
                "<li><p align=\"justify\">Hilangkan segala bau-bauan, peganglah perangkap sesdikit mungkin, jika bisa gunakan sarung tangan</li>" +
                "<li><p align=\"justify\">Hilangkan bau manusia pada perangkap dengan cara mengasapi bahan-bahan perangkap dengan asap api</li>" +
                "<li><p align=\"justify\">Kamuflase, samarkan bekas potongan yang baru pada kayu yang digunakan sebagai perangkap dengan lumpur. Tutupi tali atau kawat perangkap yang di tanah agar terlihat lebih alami</li>" +
                "<li><p align=\"justify\">Buatlah dengan kuat, makhluk hidup yang terperangkap akan berjuang untuk hidupnya.</li>" +
                "</ul><br>" +
                "<p align=\"justify\"><b>Perangkap Sederhana</b><br>" +
                "Perangkap sederhana (Gambar 8-5) terdiri dari sebuah jerat yang ditempatkan di atas lubang jalan atau di lobang dan menempel pada tiang yang ditanam dengan kuat. Jika jerat adalah beberapa jenis pengikat yang terpasang tegak lurus pada jejak permainan, gunakan ranting kecil atau bilah rumput untuk menahannya. Filamen dari jaring laba-laba sangat bagus untuk menahan noosis terbuka. Pastikan bahunya cukup besar untuk dilewati dengan bebas di atas kepala binatang. Saat hewan terus bergerak, jeratnya mengencang di sekitar lehernya. Semakin banyak hewan berjuang, semakin ketat jeratnya. Jenis jebakan ini biasanya tidak membunuh binatang. Jika Anda menggunakan pengikat, mungkin cukup melonggarkan untuk melepaskan leher binatang itu. Oleh karena itu, kawat merupakan pilihan terbaik untuk jerat sederhana.<br>" +
                " <br>";
        String text1 =
                "<p align=\"justify\"><b><i>Twitch-Up Snare</b></i><br>" +
                "Jerat ini cukup sederhana menggunakan dua batang bercabang, masing-masing dengan kaki panjang dan pendek (Gambar 8-7). Tekuk kedutan dan tandai jejak di bawahnya. Mengendarai kaki panjang satu tongkat bercabang kuat ke tanah pada saat itu. Pastikan potongan pada kaki tongkat ini sejajar dengan tanah. Ikatkan kaki panjang dari tongkat bercabang yang tersisa ke sepotong tali pengikat yang diikat ke dalam kedutan. Potong kaki pendek sehingga menangkap kaki pendek dari tongkat bercabang lainnya. Perluas sebuah jerat di atas jalan setapak. Tetapkan perangkap dengan menekuk dan tarik kaki pendek dari batang bercabang. Ketika seekor binatang menangkap kepalanya di jerami, ia menarik tongkat bercabang itu, sehingga kedutannya melebar dan menggantung mangsanya.<br>" +
                " <br>";
        String text2 =
                "<p align=\"justify\"><b><i>Squirrel Pole</b></i> <br>" +
                "Squirrel Pole adalah jebakan dengan tiang panjang yang ditempatkan di pohon di daerah yang menunjukkan banyak aktivitas tupai (Gambar 8-8). Tempatkan beberapa kawat jerat di sepanjang bagian atas dan sisi tiang sehingga seekor tupai mencoba naik atau turun tiang harus melewati satu atau lebih dari mereka. Posisikan diameter (berdiameter 5 sampai 6 sentimeter) sekitar 2,5 sentimeter dari tiang. Tempatkan kawat atas dan bawah jerat 45 cm dari atas dan bawah tiang untuk mencegah tupai dari mendapatkan kakinya di permukaan yang solid. Jika ini terjadi, si tupai akan mengunyah melalui kawat. Tupai secara alami penasaran. Setelah kehati-hatian awal, mereka akan mencoba naik atau turun dari tiang dan akan terjebak dalam jerat. Hewan yang sedang berjuang akan segera jatuh dari tiang dan mencekiknya. Tupai lain akan segera menyusul dan, dengan cara ini, Anda bisa menangkap beberapa tupai. Anda bisa mengoleskan beberapa kutub untuk meningkatkan tangkapannya.<br>" +
                " <br>";
        String text3 =
                "<p align=\"justify\"><b><i>Ojibwa Bird Pole</b></i> <br>" +
                "Jebakan ini digunakan oleh penduduk asli Amerika selama berabad-abad (Gambar 8-9). Agar efektif, letakkan di tempat yang relatif terbuka jauh dari pohon tinggi. Untuk hasil terbaik, pilih tempat di dekat area makan, area gurun, atau lubang penyiraman. Potong tiang 1,8 sampai 2,1 meter dan sisihkan semua anggota badan dan dedaunan. Jangan menggunakan kayu resin seperti pinus. Pertajam ujung atas ke titik, lalu borkan lubang berdiameter kecil 5 sampai 7,5 cm dari atas. Potong tongkat kecil panjangnya 10 sampai 15 sentimeter dan bentukkan satu ujung sehingga hampir muat ke dalam lubang. Ini adalah tempat bertengger. Tanam tiang panjang di tanah dengan ujung runcing. Tie kecil, kira-kira sama dengan berat spesies yang ditargetkan, sampai batas pengikat. Lewatkan ujung bebas dari tali pengikat melalui lubang, dan dasi tali yang menutupi tempat bertenggernya. Ikatkan satu simpul tangan di tali pengikat dan letakkan tempat bertengger di lubang. Biarkan pengikat tali masuk melalui lubang sampai simpul tangan menempel pada tiang dan bagian atas tempat bertengger. Ketegangan simpul overhand terhadap tiang dan bertengger akan menahan posisi di posisi. Sebarkan jerat di atas tempat bertengger, pastikan itu mencakup tempat bertengger dan tirai di kedua sisinya. Kebanyakan burung lebih memilih untuk beristirahat pada sesuatu di atas tanah dan akan mendarat di tempat bertengger. Begitu burung itu mendarat, tempat bertenggernya akan jatuh, melepaskan simpul di atas dan membiarkan berat badan turun. Tali itu akan mengencangkan kaki burung itu, menangkapnya. Jika berat badannya terlalu berat, itu akan memotong kaki burung itu, membiarkannya meloloskan diri.<br>" +
                " <br>";
        String text4 =
                "<p align=\"justify\"><b><i>Noosing Wand </b></i><br>" +
                "Tongkat noose atau \"noosing wand\" berguna untuk menangkap burung bertangkai atau mamalia kecil (Gambar 8-10). Ini membutuhkan operator pasien. Tongkat ini lebih merupakan senjata daripada jebakan. Ini terdiri dari sebuah tiang (selama Anda bisa menangani secara efektif) dengan tali kawat atau pengikat kaku di ujung yang kecil. Untuk menangkap seekor binatang, Anda menyelipkan jerat ke leher seekor ayam yang berkokok dan menariknya kencang. Anda juga bisa meletakkannya di atas lubang sarang dan bersembunyi di dekat orang buta. Saat binatang itu muncul dari ruang kerja, Anda menyentakkan tiang untuk mengencangkan jerat dan dengan demikian menangkap hewan itu. Bawa sebuah klub yang kokoh untuk membunuh mangsa.<br>" +
                " <br>";
        String text5 =
                "<p align=\"justify\"><b><i>Treadle Spring Snare</b></i> <br>" +
                "Gunakan snare treadle melawan permainan kecil di jalan setapak (Gambar 8-11). Gali lubang dangkal di jalan setapak. Kemudian belilah tongkat bercabang (garpu bawah) ke tanah di setiap sisi lubang di sisi jalan yang sama. Pilih dua tongkat lurus lurus yang membentang dua garpu. Posisikan kedua tongkat ini sehingga ujungnya melibatkan garpu. Tempatkan beberapa batang di atas lubang di jalan setapak dengan memosisikan satu ujung di atas tongkat horisontal bawah dan yang lainnya di tanah di sisi lain lubang. Tutupi lubang dengan tongkat yang cukup sehingga mangsa harus menginjak setidaknya satu dari mereka untuk melepaskan snare. Ikat salah satu ujung tali pengikat ke twitch-up atau ke beban yang tergantung di atas dahan pohon. Tekuk kedutan atau naikkan berat badan yang ditangguhkan untuk menentukan di mana Anda akan mengikat pemicu 5 sentimeter atau lebih lama. Bentuk tali dengan ujung lain dari tali pengikat. Rute dan lepaskan tali di atas bagian atas stik di atas lubang. Tempatkan pelat pemicu menempel pada tongkat horisontal dan rujuk rok di belakang tongkat sehingga tegangan sumber daya akan menahannya pada tempatnya.<br>" +
                "Sesuaikan tongkat horisontal bawah sehingga tidak tahan terhadap pemicunya. Seekor binatang meletakkan kakinya di atas sebuah tongkat di lubang, tongkat horisontal bawah bergerak ke bawah, melepaskan pelatuk dan membiarkan tali itu menangkap hewan itu dengan kaki. Karena gangguan di jalan setapak, seekor binatang akan waspada. Oleh karena itu Anda harus menggunakan kanalisasi. <br>" +
                " <br>";
        String text6 =
                "<p align=\"justify\"><b><i>Figure 4 Deadfall</b></i> <br>" +
                "Gambar 4 adalah pemicu yang digunakan untuk menjatuhkan beban ke mangsa dan menghancurkannya (Gambar 8-12). Jenis berat yang digunakan bisa bervariasi, namun harus cukup berat untuk membunuh atau melumpuhkan mangsa dengan segera. Bangunlah gambar 4 dengan menggunakan tiga batang bertali. Ketukan ini menahan tongkat bersama dalam gambar 4 saat mengalami ketegangan. Berlatihlah membuat pemicu ini sebelumnya; Hal ini membutuhkan toleransi yang ketat dan sudut pandang yang tepat dalam konstruksi.<br>" +
                " <br>";
        String text7 =
                "<p align=\"justify\"><b><i>Paiute Deadfall</b></i> <br>" +
                "Mirip dengan gambar 4 namun menggunakan sepotong tali pengikat dan tangkai tangkapan (Gambar 8-13). Ini memiliki keuntungan karena lebih mudah diatur daripada gambar 4. Ikat salah satu ujung tali pengikat ke ujung bawah tongkat diagonal. Ikat ujung lain dari tali pengikat ke tangkai lain sekitar 5 sentimeter. Tongkat 5 sentimeter ini adalah tangkapan tangkapan. Bawalah kabel di sekeliling stik vertikal dengan tangkai tangkapan pada sudut 90 derajat. Tempatkan tongkat umpan dengan satu ujungnya melawan berat setetes, atau pasak yang digerakkan ke tanah, dan yang lainnya menempel pada tangkai tangkapan. Saat mangsa mengganggu batang umpan, ia jatuh bebas, melepaskan tangkai tangkapannya. Sebagai tongkat diagonal terbang, berat jatuh, menghancurkan mangsa. <br>";
        String text8 =
                "<p align=\"justify\"><b><i>Bow Trap</b></i> <br>"+
                "Perangkap busur adalah salah satu perangkap paling mematikan. Hal ini berbahaya bagi manusia dan juga hewan (Gambar 8-14). Untuk membangun perangkap ini, buatlah busur dan jangkar ke tanah dengan pasak. Sesuaikan titik tujuan saat Anda menambatkan busur. Lash toggle stick ke trigger stick. Dua tongkat tegak yang digerakkan ke tanah menahan tongkat pemicu di tempat pada titik di mana tongkat pengaman akan mengikat tali busur yang ditarik. Tempatkan tangkapan tangkapan antara tongkat pengalih dan pasak yang digerakkan ke tanah. Ikatkan kabel perjalanan atau pengikat ke tangkai tangkapan dan rencanakan di sekitar taruhan dan di seberang jalur permainan tempat Anda mengikatnya (seperti pada Gambar 8-14). Saat mangsa menaiki kawat perjalanan, busur kehilangan anak panah ke dalamnya. Ketukan di haluan berfungsi untuk membantu mengarahkan panah.<br>" +
                " <br>";
        String text9 =
                "<p align=\"justify\"><b><i>Pig Spear Shaft</b></i> <br>" +
                "Untuk membangun poros tombak babi, pilih tiang yang kokoh sepanjang 2,5 meter (Gambar 8-15). Di ujung yang lebih kecil, dengan tegas memukul beberapa taruhan kecil. Lash ujung besar erat ke pohon sepanjang jalan permainan. Ikatlah tali pengikat ke pohon lain di seberang jalan. Ikatkan tongkat yang kokoh dan menempel ke ujung kabel lainnya. Dari pohon pertama, pasang kawat perjalanan atau kabel rendah ke tanah, peregangan di seberang jalan, dan ikat ke tangkai tangkapan. Buat cincin slip dari tanaman merambat atau bahan lain yang sesuai. Melingkari kawat perjalanan dan tongkat halus dengan cincin slip. Ambil salah satu ujung tongkat halus lainnya di dalam ring slip dan ujung lainnya menempel pada pohon kedua. Tarik ujung poros tombak yang lebih kecil ke jalan setapak dan letakkan di antara tali pendek dan tongkat halus. Saat hewan tersebut menaiki kawat perjalanan, tongkat penarik menarik cincin slip dari tongkat halus, melepaskan poros tombak yang muncul di ujung jalan dan menusuk mangsanya ke pohon.<br>" +
                " <br>";
        String text10 =
                "<p align=\"justify\"><b><i>Bottle Trap</b></i> <br>" +
                "Perangkap botol adalah jebakan sederhana untuk tikus dan tikus (Gambar 8-16). Gali lubang 30 sampai 45 sentimeter yang lebih lebar di bagian bawah daripada di bagian atas. Buat bagian atas lubang sekecil mungkin. Tempatkan sepotong kulit kayu atau kayu di atas lubang dengan batu-batu kecil di bawahnya untuk menahannya 2,5 sampai 5 sentimeter dari tanah. Tikus atau tikus akan bersembunyi di bawah penutup untuk menghindari bahaya dan jatuh ke dalam lubang. Mereka tidak bisa memanjat keluar karena lereng belakang dinding. Hati-hati saat memeriksa jebakan ini; Ini adalah tempat persembunyian yang sangat baik untuk ular. <br>" +
                "<br>";
        String text11 =
                "<p align=\"justify\"><b><i>Cartridge Trap</b></i> ( Jebakan Peluru)</b><br>" +
                "Perangkap ini terdiri dari sepotong bambu dan cartridge. Sebuah paku didorong ke bambu sekitar 2 \"dari bawah untuk bertindak sebagai peniti. Sepotong kayu diikat pada potongan bambu untuk menahan kuku. Kartrid akan menonjol dari bambu. Primer kartrid tepat di atas kepala kuku. Ketika seorang pria menginjak jebakan ini, kartrid itu akan menempel pada kuku, meledak, dan memukulnya. Perangkap ini umumnya dipasang di tanah di bahu jalan dan sepanjang jalan. <br>";
        String text12 =
                "<p align=\"center\"><i>Di ilustrasikan oleh Paul Marquis</i><br>" +
                "<br>" +
                "<p align=\"justify\"><b><i>Bola Berduri Tajam</b></i> <br>" +
                "Jebakan ini digunakan para penjuang Vietnam dalam Perang Vietnam. Jebakan Bola yang terbuat dari anyaman akar dan rotan atau besi ini telah dipasangi duri duri dari kayu  yang diruncingkan maupun duri dari bahan besi. Sistemnya pemasangannya sama dengan jebakan harimau, namun bola berduri ini seperti ayunan yang siap menghantam orang dari segala sisi yang  telah masuk dalam tali jebakan.<br>" +
                "Sekali hantam,racun racun yang ada bagian ujung duri akan dengan cepat bereaksi dan tengkorak maupun badan manusia bisa hancur berantakan jika terkena jebakan ini.<br>" +
                "Kalaupun jebakan ini berhasil dihindari, tentara Amerika akan semakin ketakutan dan mengganggu kejiwaannya. Tujuannya bukan untuk membunuh, tapi dengan sedikit luka saja helikopter Amerika akan dibuat kesibukan untuk mengevakuasi para korbannya.<br>" +
                "Yang mana akan menambah boros bahan bakar pada Helikopter untuk pergi maupun mengevakuasi ke markas.<br>";
        String text13 =
                "<p align=\"justify\"><b><i>Punji Bear Trap</b></i><br>" +
                "Alih-alih satu lubang berbentuk seragam, lubang ini terdiri dari dua lubang berukuran berbeda yaitu lubang yang lebih besar di atas dan lubang kecil di bawah. Ketika korban menginjak perangkap ini, kaki korban akan langsung mendorong papan dengan berduri kedalam lubang yang lebih kecil, lalu menyebabkan papan berduri menutup dalam gerakan ke atas. Hampir tidak ada yang dapat melepas pegangan perangkap ini di kaki korban.<br>" +
                " <br>";
        String text14 =
                "<p align=\"justify\"><b><i>Perangkap Penutup Otomatis</b></i><br>" +
                "Perangkap ini adalah versi yang lebih canggih dari Punji Bear Trap. Mereka dibuat dengan papan kayu besar yang diletakkan di atas lubang yang diisi dengan paku maupun bambu yang tajam. Potongan kayu besar yang melekat, di tengah, untuk sepotong kayu yang membentang di seluruh lebar lubang. Ini bertindak sebagai poros untuk sepotong besar meliputi kayu. Ketika seorang menginjak salah satu ujung papan, berat badan mereka menyebabkan kayu untuk menurunkan dan korban jatuh ke dalam lubang penuh paku<br>" +
                " <br>";
        String text15 =
                "<p align=\"justify\"><b><i>Jebakan Granat</b></i><br>" +
                "Biasanya ditemukan di daerah perjalanan, perangkap granat biasanya dihubungkan oleh dua taruhan di sisi sungai atau di sungai. Sebuah granat terikat pada satu sisi dan diikat dengan kawat dari sisi ke sisi lain yang terikat dengan pin granat.<br>" +
                " <br>";
        String text16 =
                "<p align=\"justify\"><b><i>Ranjau Darat</b></i><br>" +
                "Ranjau darat adalah alat peledak yang ditanamkan ke dalam tanah, dan akan meledak saat disentuh atau diinjak oleh sebuah kendaraan, orang, atau binatang. Ranjau darat digunakan untuk daerah yang diperebutkan dan untuk saling pergerakan perang. Secara taktis, peran ranjau seperti kawat berduri atau tembok kendaraan gigi naga, yaitu untuk mengarahkan pergerakan musuh ke tempat di mana bisa dengan mudah. Dari bisa pandang militer, ranjau darat bisa digunakan sebagai pengali pasukan, maksudnya, bisa membantu pasukan yang terorganisir serangan musuh yang lebih besar.<br><i><p align=\"left\">https://id.wikipedia.org/wiki/Ranjau_darat <br>(Ranjau Darat)<br>\" +\n" +
                        "                \"<br>http://www.wilderness-survival.net/food-2.php <br>(Trap And Snare)<br>\" +";
        String foto1 = "<p align=\"center\"><img src=\"jebakan/jebakan1.png\"></p>";
        String foto2 = "<p align=\"center\"><img src=\"jebakan/jebakan2.png\"></p>";
        String foto3 = "<p align=\"center\"><img src=\"jebakan/jebakan3.png\"></p>";
        String foto4 = "<p align=\"center\"><img src=\"jebakan/jebakan4.png\"></p>";
        String foto5 = "<p align=\"center\"><img src=\"jebakan/jebakan5.png\"></p>";
        String foto6 = "<p align=\"center\"><img src=\"jebakan/jebakan6.png\"></p>";
        String foto7 = "<p align=\"center\"><img src=\"jebakan/jebakan7.png\"></p>";
        String foto8 = "<p align=\"center\"><img src=\"jebakan/jebakan8.png\"></p>";
        String foto9 = "<p align=\"center\"><img src=\"jebakan/jebakan9.png\"></p>";
        String foto10 = "<p align=\"center\"><img src=\"jebakan/jebakan10.png\"></p>";
        String foto11 = "<p align=\"center\"><img src=\"jebakan/jebakan11.png\"></p>";
        String foto12 = "<p align=\"center\"><img src=\"jebakan/jebakan12.png\"></p>";
        String foto13 = "<p align=\"center\"><img src=\"jebakan/jebakan13.png\"></p>";
        String foto14 = "<p align=\"center\"><img src=\"jebakan/jebakan14.png\"></p>";
        String foto15 = "<p align=\"center\"><img src=\"jebakan/jebakan15.png\"></p>";
        String foto16 = "<p align=\"center\"><img src=\"jebakan/jebakan16.png\"></p>";
        String foto17 = "<p align=\"center\"><img src=\"jebakan/jebakan17.png\"></p>";
        view.loadDataWithBaseURL("file:///android_asset/", text + foto1+ text1 +foto2+text2+foto3+text3+foto4+text4+foto5+text5+foto6+text6+foto7+text7+foto8+text8+foto9+text9+foto10+text10+ foto11+ text11 +foto12+text12+foto13+text13+foto14+text14+foto15+text15+foto16+text16+foto17 , "text/html", "utf-8", null);
        return rootView;
    }

}
