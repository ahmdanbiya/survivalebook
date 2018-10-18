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
public class Api extends Fragment {


    public Api() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_psikologi,
                container, false);
        WebView view = (WebView) rootView.findViewById(R.id.psikologi1);
        String text = "<p align=\"justify\">Kegunaan api sangat penting dalam situasi dimana anda harus mempertahankan diri anda, yang memaksa anda untuk bisa <i>survive</i> disegala kondisi yang juga mengancam keselamatan. Api juga sangat bermanfaat bagi para <i>survivor</i>, seperti; digunakan untuk memasak, penerangan, menghangakan suhu tubuh, mengurangi ancaman binatang liar, dan juga dapat digunakan untuk memberi sinyal kepada orang lain atau tim penyelamat.<br>" +
                "<br>Selain itu, bahaya dari penggunaan api juga sangat fatal. Cahaya dan asap yang ditimbulkan dari api juga dapat dengan mudah di deteksi oleh musuh yang mengancam keselamatan <i>survivor</i>. Oleh karena itu, akan sangat penting bagi <i>survivor</i> untuk mengetahui kondisi sekitar agar bisa menghindari ancaman musuh.<br>" +
                "<br>" +
                "<b>PEMILIHAN TEMPAT DAN PERSIAPAN</b><br>" +
                "Anda perlu untuk memutuskan lokasi dan mengatur apa yang akan dipakai. Sebelum mebuat api perhatikan hal-hal berikut:<br>" +
                "<ul><li>Areal (medan dan cuaca) di tempat anda beraktifitas</li>" +
                "<li>Bahan dan alat yang tersedia.</li>" +
                "<li>Waktu - berapa lama anda punya waktu.</li>" +
                "<li>Kebutuhan - kenapa anda butuh api.</li>" +
                "<li>Keamanan - perhatikan arah angin dan sekeliling anda jangan sampai mengakibatkan kebakaran hutan. </li>" +
                "</ul>Carilah tempat yang kering yang:<br>" +
                "<ul><li>Terlindung dari angin </li>" +
                "<li>Tempatnya layak dan cocok dengan shelter anda (jika punya). </li>" +
                "<li>Bisa menkonsentrasikan panas pada arah yang anda inginkan. </li>" +
                "<li>Ada persediaan kayu atau bahan bakar lain yang tersedia. </li>" +
                "<li>Pastikan tidak ada musuh yang mengintai anda.</li>" +
                "</ul><br>" +
                "<b><p align=\"justify\">PEMILIHAN MATERIAL UNTUK MEMBUAT API</b><br><br>" +
                "Anda akan membutuhkan tiga tipe material untuk membuat api yaitu: Tinder (penyala), kindling (pemancing), dan Fuel (bahan bakar)<br>" +
                "Tinder, adalah material kering yang akan menyala dengan panas atau suatu percikan api. Kita harus benar menyediakan bahan yang benar-benar kering agar hanya dengan percikan api bisa menyala. <br>" +
                "Kindling, adalah material yang sudah disiapkan dan gampang menyala yang akan ditambahkan setelah bahan tinder menyala. Material ini juga harus yang sudah kering dan mudah terbakar dengan cepat. Kindling akan meningkatkan temperatur api dan akan membuat menyala lebih besar.<br>" +
                "Fuel, material ini diperlukan saat api sudah menyala besar dan baru dibutuhkan bahan pembakar yang agak besar dan terbakar secara pelahan-lahan.<br>" +
                "Berikut adalah jenis-jenis serta golongan dari material atau bahan yang bisa dipakai untuk membuat api.<br>";
        String text1 =
                "<b><p align=\"justify\">MEMBUAT PERAPIAN<br><br></b>" +
                "Ada beberapa metode untuk menyiapakan perapian, masing-masing mempunyai kelebihan. Situasi yang anda hadapi akan membuat anda bisa memutuskan cara apa yang akan dipakai.<br>" +
                " <br>TEPEE<br>";
        String text2 =
                "<p align=\"justify\">Untuk membuat jenis ini, aturlah tinder dan beberapa potong kindling dalam bentuk teppe atau kerucut ini. Nyalakan tengahnya. Ketika teppe terbakar, potongan kayu bagian luar akan jatuh ke bagian dalam, dan dimakan api. Jenis api unggun seperti ini akan terbakar dengan baik sekali walaupun memakai kayu basah.<br>" +
                "<br>" +
                " \tLEAN-TO<br>";
        String text3 =
                "<p align=\"justify\">Untuk membuat jenis ini, tanjapkanlah potongan kayu muda (hijau) ditanah dengan sudut 30 derajat. Arahkan bagian ujung dari potongan hijau tadi pada arah angin. Tempatkan beberapa tinder jauh dipojoknya bentuk ini. sandarkan potongan kindling pada potongan hijau tadi. Nyalakan tinder. Saat kindling terbakar oleh api dari tinder tambahkan terus potongan kindlingnya.<br>" +
                "<br>" +
                " \tCROSS-DITCH<br>";
        String text4 =
                "<p align=\"justify\">Untuk membuat jenis ini, galilah parit menyilang dengan ukuran 30cm ditanah dengan kedalaman 7,5cm. Taruhlah gumpalan besar tinder dipertengahan dari bentuk silang tersebut, bangunlah kindling berbentuk piramid tinder. Parit tersebut memungkinkan udara untuk mengalir dibawah tinder dan membuat api tetap menyala.<br>" +
                "<br>" +
                " \tPYRAMID<br>";
        String text5 =
                "<p align=\"justify\">Mebuat api unggun jenis ini, tempatkan dua batang kecil atau dahan kecil secara paralel ditanah. Tempatkan lapisan yang solid dari potongan kecil diatas dua batang paralel tadi. Tambahkan tiga atau empat lapisan batang atau ranting. Masing-masing lapisan lebih kecil dari dan pada sudut yang tepat dengan lapisan yang dibawah. buatlah permulaan nyala api pada bagian atas dari piramid. Saat api mulai menyala, akan membakar potongan dibawahnya. ini akan memberikan anda api unggun yang arah bakarnya dari atas kebawah dan tidak membutuhkan perhatian khusus sepanjang malam.<br><br>" +
                "<br>" +
                "<b>CARA MEMBUAT API</b><br><br>" +
                "Selalu nyalakan api unggun anda dari arah melawan angin. Pastikan anda menaruh tinder, kindling dan fuel sedemikiasn rupa sehingga api unggun anda akan menyala sepanjang anda butuhkan. Pematik menyediakan panas awal yang diperlukan untuk menyalakan tinder dan terbagi dalam dua jenis katagori yaitu metode moderen dan primitif<br>" +
                "<b><br>1. METODE MODEREN</b><br>" +
                "Pematik moderen menggunakan alat moderen - yaitu item yang biasa kita pakai dalam menyalakan api.<br>" +
                "<br><b>Korek Api:</b> Pastikan korek api ini waterproof atau tahan air. Juga simpan dalam wadah tahan air bersamaan dengan lapisan goresnya.<br>" +
                "<br><i><b>Convex Lens</i>:</b> Metode ini hanya bisa digunakan saat siang, dan marahari bersinar. Lensanya bisa dipakai dari lensa teropong, camera, telescope, atau kaca pembesar. Sudut peletakan lensa diatur agar sinar matahari bisa terkumpul diatas tinder. Peganglah lensa pada sudut tersebut hingga tinder mulai membara. Tiuplah pelan-pelan tinder agar kelihatan nyala apinya.<br>" +
                " <br>";
        String text6 =
                "<b><p align=\"justify\">2. METODE PRIMITIF<br></b>" +
                "Metode pematik primitif ini adalah metode yang dipakai oleh nenek moyang kita, berikut adalah contoh – contoh metode tersebut;<br>";
        String text7 =
                "<p align=\"center\"><i>sumber survivalprimer</i><br>" +
                "<p align=\"justify\"><i><b>Fire-Plow:</b></i> Merupakan metode friksi pengapian. Gosokan batang kayu keras melawan kayu lunak sebagai alas. Untuk menggunakan metode ini, Potong mendalam (lobangi) memanjang dasarnyadan gerakan seperti membajak naik turun batang kayu yang keras tersebut. Gerakan membajak ini akan mendesak keluar partikel atau butir serabut kayu. Gerakan friksi ini akan lambat laun menimbulkan bunga api.<br>";
        String text8 =
                "<p align=\"center\"><i>sumber sharpassist<br></i>" +
                "<p align=\"justify\"><i><b>Hand drill</i>:</b> Metode ini adalah teknik paling banyak tersebar di berbagai macam budaya nenek moyang manusia diseluruh dunia. Ditandai dengan menggunakan batang kayu atau buluh yang tipis untuk dipintal menggunakan tangan, lalu digiling diatas papan kayu atau batang kayu kering yang diberi lubang atau cekukan. Gesekan dari perputaran dan tekanan gaya secara terus menerus menghasilkan panas dan meyebabkan debu hitam terbentuk di lubang atau cekukan tersebut, yang pada akhir nya dapat menghasilkan serpihan bara api yang menyala. Setelah itu, bara kemudian ditempatkan dengan hati hati diatas tinder.<br>" +
                "<p align=\"justify\"><b>Mematik:</b> Metode ini menggunakan dua buah batu yang keras dan berkilau seperti batu kuarsa, jasper, akik, atau batu api (rijang) dengan cara mengesekan atau membenturkannya hingga mengasilkan percikan api. Selain menggunakan dua buah batu anda juga bisa menggunakan benda lain yang keras, tajam-batu karang dengan baja karbon (stainless stell tidak menghasilakan percikan yang bagus). Metode ini memerlukan kelenturan pergelangan tangan dan latihan. Saat percikan ditangkap oleh tinder, tiuplah pelan-pelan, percikan akan menyebar dan terbakar.<br>";
        String text9 =
                "<p align=\"justify\"><i><b>Bow and Drill</i>:</b> Metode ini menggunakan prinsip yang sama dengan hand drill, tapi poros nya lebih pendek, lebih lebar (kira kira seukuran jempol manusia), mengunakan busur dan penumpu berlubang. cara menggunakan teknik bow drill adalah dengan menggunakan tali busur yang disilangkan ke poros kayu yang telah diruncingkan bagian atas nya, lalu gunakan penumpu berlubang pada bagian yang diruncingkan tesebut, agar tetap memberikan tekanan gaya selagi poros kayu berputar. Setelah itu tarik busur pemutar tersebut maju dan mundur, Lakukan gerakan ini dengan perlahan – lahan terlebih dahulu, kemudian percepat, dan percepat lagi, hingga menghasilkan serpihan bara api.<br>";
        String text10 =
                "<p align=\"justify\"><b>Penggunaan Baterai:</b> Metode ini menggunakan arus listrik dari baterai dan alumunium foil (dapat diperoleh dari bungkus permen karet yang berbahan alumunium foil). Untuk dapat menghasilkan api, potong kertas alumunium foil dengan bagian tengah kertas yang mengecil seperti diatas, lalu sambungkan kedua sisi kertas ke masing masing kutub positif dan negatif baterai. Alumunium foil yang dihubungkan langsung kekutub positif dan negative baterai menyebabkan hambatan dirangkaian tersebut mendekati angka nol. Karena hambatan mendekati angka nol menyebabkan arus listrik menjadi sangat besar (mendekati tak terhingga). Efek dari arus yang sangat besar tersebut akan menimbulkan suhu panas diseluruh rangkaian dan lama kelamaan akan timbul api. <br>" +
                "<br><b>CARA MEMBUAT ARANG</b><br>\n";
        String text11 =
                "<p align=\"justify\">1.\tSusun batang-batang kayu seperti gambar dibawah ini, dengan susunan batang kayu yang lebih besar berada pada bagian dalam hingga susunan batang kayu yang lebih kecil pada bagian luar.\n" +
                "\n";
        String text12 =
                "<p align=\"justify\">2.\tLapisi susunan kayu tersebut dengan dedaunan kering.\n" +
                "\n";
        String text13 =
                "<p align=\"justify\">3.\tKemudian lapisi kembali dengan lumpur. (Anda dapat membuat lumpur dari tanah disekitar menggunakan air).\n" +
                "\n";
        String text14 =
                "<p align=\"justify\">4.\tBuat lubang pada bagian atas dan disekitaran bagian bawah gundukan yang nantinya akan berfungsi sebagai ventilasi pembakaran.\n" +
                "\n";
        String text15 =
                "<p align=\"justify\">5.\tLalu sulut api pada lubang bagian atas gundukan hingga bagian dalam gundukan benar benar terbakar.\n" +
                "\n";
        String text16 =
                "<p align=\"justify\">6.\tJika salah satu lubang bagian bawah mulai terlihat api pembakaran, tutup lubang tersebut menggunakan lumpur. disarankan untuk tidak menutup lubang bagian bawah yang belum terlihat api. lalu yang terakhir tutup lubang bagian atas gundukan. \n" +
                "\n";
        String text17 =
                "<p align=\"justify\">7.\tTunggu hingga api padam dan anda dapat membuka gundukan tersebut jika tidak lagi panas\n" +
                "\n";
        String text18 =
                "<p align=\"justify\">8.\tDan anda sudah dapat memanen arang yang anda buat tersebut <br>";
        String text19 =
                "<i><br>Detail video dan sumber cek <a href=\"https://www.youtube.com/watch?v=GzLvqCTvOQY\">disini</a></i><br>" +
                "<p align=\"justify\">Arang dengan kualitas terbaik akan berdenting seperti logam ketika dipukul dan mengkilat pada bagian yang pecah, hal ini terjadi karena adanya unsur karbon yang tersisa setelah melalui proses pengarangan. Suhu yang dapat dihasilkan oleh arang dapat mecapai 700 hingga 1200 derajat celcius\n";
        String foto1 = "<p align=\"center\"><img src=\"api/api1.png\"></p>";
        String foto2 = "<p align=\"center\"><img src=\"api/api2.png\"></p>";
        String foto3 = "<p align=\"center\"><img src=\"api/api3.png\"></p>";
        String foto4 = "<p align=\"center\"><img src=\"api/api4.png\"></p>";
        String foto5 = "<p align=\"center\"><img src=\"api/api5.png\"></p>";
        String foto6 = "<p align=\"center\"><img src=\"api/api6.png\"></p>";
        String foto7 = "<p align=\"center\"><img src=\"api/api7.png\"></p>";
        String foto8 = "<p align=\"center\"><img src=\"api/api8.png\"></p>";
        String foto9 = "<p align=\"center\"><img src=\"api/api9.png\"></p>";
        String foto10 = "<p align=\"center\"><img src=\"api/api10.png\"></p>";
        String foto11 = "<p align=\"center\"><img src=\"api/api11.png\"></p>";
        String foto12 = "<p align=\"center\"><img src=\"api/api12.png\"></p>";
        String foto13 = "<p align=\"center\"><img src=\"api/api13.png\"></p>";
        String foto14 = "<p align=\"center\"><img src=\"api/api14.png\"></p>";
        String foto15 = "<p align=\"center\"><img src=\"api/api15.png\"></p>";
        String foto16 = "<p align=\"center\"><img src=\"api/api16.png\"></p>";
        String foto17 = "<p align=\"center\"><img src=\"api/api17.png\"></p>";
        String foto18 = "<p align=\"center\"><img src=\"api/api18.png\"></p>";
        view.loadDataWithBaseURL("file:///android_asset/", text + foto1 + text1 + foto2 + text2 + foto3 + text3 + foto4 + text4 + foto5 + text5 + foto6 + text6 + foto7 + text7 + foto8 + text8 + foto9 + text9 + foto10 + text10 + text11 + foto11 + text12 + foto12 + text13 +  foto13 + text14 + foto14 + text15 + foto15 + text16 + foto16 + text17 + foto17 + text18 + foto18 + text19 , "text/html", "utf-8", null);
        return rootView;
    }

}
