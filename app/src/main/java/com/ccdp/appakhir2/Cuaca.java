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
public class Cuaca extends Fragment {


    public Cuaca() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_psikologi,
                container, false);
        WebView view = (WebView) rootView.findViewById(R.id.psikologi1);
        String text = "<p align=\"justify\">Cuaca merupakan salah satu faktor utama yang dijadikan patokan sebelum memulai aktivitas di luar rumah. Di setiap negara di dunia, ada badan tertentu yang khusus bekerja untuk menganalisa dan memprakirakan bagaimana cuaca hari ini, esok ataupun lusa.<br>" +
                "<br>Dari badan – badan itulah kita mengetahui kondisi cuaca di wilayah kita. Namun, selain mengetahui cuaca dari badan pemantau cuaca, ternyata kita juga dapat menganalisa sendiri dan memprakirakan apakah akan turun hujan atau cerah hanya dengan mengamati perilaku alam.<br>" +
                "<br><i>\"Dan Kami naungi kamu dengan awan, dan Kami turunkan kepadamu “manna” dan “salwa”. Makanlah dari makanan yang baik-baik yang telah Kami berikan kepadamu; dan tidaklah mereka menganiaya Kami; akan tetapi merekalah yang menganiaya diri mereka sendiri\"</i> [Q.S. 2:57]<br>" +
                "<br>Pada zaman dahulu orang membuat analisa atau membuat prakiraan cuaca tidak perlu kaedah – kaedah ilmiah. Tapi, cukup dengan memperhatikan tanda – tanda alam. Seperti memperhatikan tingkah laku hewan atau memperhatikan sifat tumbuhan, agar kita tidak lupa dengan alam dan tetap diperhatikan.<br>" +
                " <br>";
        String text1 =
                "<p align=\"center\"><i>jenis awan – kompani</i><br>" +
                "<p align=\"justify\">Dengan demikian, keberadaaan hewan dan tumbuhan sangat diperlukan dalam melihat pola cuaca yang akan terjadi. Apa saja tanda – tanda alam yang dapat dijadikan bahan untukmemprakirakan cuaca:<br>" +
                "<b>1. Memperhatikan Jenis Dan Pergerakan Awan</b>" +
                "<br>A. Awan Cumulonimbus<br>" +
                "<p align=\"justify\">Awan Cumulonimbus adalah awan yang tumbuh di pagi hari dan berkembang pada siang hari mempunyai peluang akan terjadi cuaca buruk.<br>" +
                "<i><br>“Sesungguhnya dalam penciptaan langit dan bumi, silih bergantinya malam dan siang, bahtera yang berlayar di laut membawa apa yang berguna bagi manusia, dan apa yang Allah turunkan dari langit berupa air, lalu dengan air itu Dia hidupkan bumi sesudah mati (kering)-nya dan Dia sebarkan di bumi itu segala jenis hewan, dan pengisaran angin dan awan yang dikendalikan antara langit dan bumi; sungguh (terdapat) tanda-tanda (keesaan dan kebesaran Allah) bagi kaum yang memikirkan.”</i> [Q.S. 2:164]<br>" +
                "";
        String text2 =
                "<p align=\"center\"><i>Cara Mengetahui Cuaca Dari Tanda – Tanda Alam | KOMPANI</i>" +
                "<p align=\"justify\">Apabila terdapat gerakan awan yang berbeda – beda, misal lapisan yang satu bergerak ke barat dan lapisan yang lain bergerak ke utara bertanda cuaca buruk akan terjadi.<br>" +
                "<br>B. Awan Mamatus.<br>" +
                "<br>Awan mamatus adalah awan yang terbentuk dari udara yang tertahan pada suatu lapisan. Dapat terbentuk akibat adanya awan yang menimbulkan cuaca buruk dan thunderstorm yang tidak begitu hebat atau type awan yang lain.<br>" +
                "</ul>";
        String text3 =
                "<p align=\"center\"><i>Cara Mengetahui Cuaca Dari Tanda – Tanda Alam | KOMPANI</i><br>" +
                "<p align=\"justify\">C. Awan Cirrus<br>" +
                "</ul>";
        String text4 =
                "<p align=\"center\"><i>Cara Mengetahui Cuaca Dari Tanda – Tanda Alam | KOMPANI</i><br>" +
                "<p align=\"justify\">Apabila terdapat Awan Cirrus berbentuk pita panjang, bertanda dalam 36 jam mendatang akan terjadi cuaca buruk.<br>" +
                "<br>D. Awan Altocumulus.<br>" +
                "</ul>";
        String text5 =
                "<p align=\"center\"><i>Altocumulus – KOMPANI</i><br>" +
                "<p align=\"justify\">Awan Altocumulus, yang seperti sisik makarel, juga berarti cuaca buruk dalam 36 jam mendatang.<br>" +
                "<br>E. Awan Towering<br>" +
                "</ul>";
        String text6 =
                "<p align=\"center\"><i>awan towering – kompani</i><br>" +
                "<p align=\"justify\">Apabila terdapat jenis awan towering menandakan akan terjadi hujan keesokan harinya bahkan 3 jam kedepan akan terjadi hujan lebat tiba – tiba.<br>" +
                "<br>F. Awan Nombostratus.<br>" +
                "</ul>";
        String text7 =
                "<p align=\"center\"><i>Nombostratus – KOMPANI</i><br>" +
                "<p align=\"justify\">Jenis awan ini terlihat gelap dan rendah, bergelantungan berat di udara, ini berarti hujan akan cepat turun. Apabila terdapat awan menutupi sebagian langit dimalam hari musim dingin berarti udara terasa panas / lebih hangat, karena awan mencegah radiasi panas yang akan menurunkan suhu pada malam yang cerah.<br>" +
                "</ul><p align=\"justify\"><b>2. Memperhatikan Keadaan Rumput</b><br>" +
                "<br>Jika rumput kering, ini menunjukkan awan atau angin yang kuat, yang dapat berarti hujan. Jika ada embun, mungkin tidak akan hujan hari itu. Namun, jika hujan pada malam hari, metode ini tidak akan dapat diandalkan.<br>" +
                "<b><br>3. Memperhatikan Langit Berwarna Merah</b><br>" +
                "<br>Dalam sajak sebutkan, Langit Merah di malam hari, kegembiraan pelaut, langit merah di pagi hari, pelaut mengambil peringatan . Carilah tanda – tanda merah di langit tapi, bukan Matahari merah.<br>" +
                " <br>";
        String text8 =
                "<p align=\"center\"><i>awan merah – kompani</i><br>" +
                "<p align=\"justify\">Jika Anda melihat langit merah senja ( ketika Anda menghadap ke barat ), ada sistem tekanan tinggi dengan udara kering yang mengaduk partikel debu di udara, inilah yang menyebabkan langit terlihat merah. Karena pergerakan front berlaku dan jet stream, ini biasanya fenomena cuaca akan bergerak dari barat ke timur, dan udara kering menuju ke arah Anda.<br>" +
                "<br>Langit merah di pagi hari ( di Timur, di mana Matahari terbit ) berarti bahwa udara kering telah pindah melewati Anda, dan setelah itu ada sistem tekanan rendah yang membawa kelembaban menuju kearah Anda.<br>" +
                "<b><br>4. Memperhatikan Pelangi Di Barat</b> <br>" +
                "<br>Pelangi di barat berarti kelembaban yang cukup tinggi menandakan hujan dalam perjalanan menuju anda. Di sisi lain, pelangi di timur sekitar Matahari terbenam berarti bahwa hujan menjauhi yang berarti diharapkan udara akan cerah. Penting: apabila ada pelangi di pagi hari, maka perlu membuat peringatan dalam 12 jam kedepan.<br>" +
                "<b><br>5. Memperhatikan Kebiasan Angin</b><br>" +
                "<br>Perhatikan kebiasaan angin yang bertiup di tempat Anda, angin timuran berarti angin dari timur yang menyimpang dari kebiasaan ditempat Anda berarti akan ada badai angin.<br>" +
                "<br>Sebaliknya apabila ada angin barat menyimpang dari kebiasaannya berarti cuaca akan bagus. Apabila terjadi angin kencang dari sepanjang hari dan diikuti hari berikutnya berarti disekitar wilayah Anda terdapat sistem tekanan tinggi. Perhatikan pohon yang daunnya berguguran tepat dibawah pohonnya, ini berarti ada hembusan angin yang biasa terjadi.<br>" +
                "<b><br>6. Pernafasan</b><br>" +
                "<br>Ambil napas dalam – dalam, kemudian tutup mata dan hirup bau udara. Tanaman biasanya akan melepaskan limbahnya menandakan ada sistem tekanan rendah dan menghasilkan bau seperti kompos dan mengindikasikan akan turun hujan diwaktu mendatang.<br>" +
                "<br>Sebuah rawa akan menmbulkan gas pada saat sebelum badai datang hal ini ditunjukkan bau tak sedap. Pepatah mengatakan Bunga bau sebelum hujan. Aroma lebih kuat udara lembab, berhubungan dengan cuaca hujan.<br>" +
                "<b><br>7. Kelembaban</b><br>" +
                "<br>Biasanya kelembaban dapat dilihat pada model rambut ( rambut melengkung / mengerucut ). Anda juga dapat melihat daun oak atau pohon maple.<br>" +
                "<br>Daun ini cenderung melengkung / mengerucut pada kelembaban tinggi, yang cenderung berkembang menjadi hujan lebat. Sisik kerucut pinus tetap tertutup jika kelembaban tinggi, tetapi terbuka pada udara kering. Dalam kondisi lembab, kayu membengkak. Apabila membuka pintu akan terasa pintu sulit dibuka / lengket dengan tiang.<br>" +
                "<b><br>8. Hewan </b><br>" +
                "<br>Hewan lebih peka dibandingkan dengan manusia, dan hewan biasanya akan bereaksi apabila terjadi perubahan tekanan.<br>" +
                "<ul><li><p align=\"justify\">Jika burung terbang tinggi di langit, ada kemungkinan akan cerah. Tekanan udara rendah disebabkan terjadinya badai, sehingga burung merasa tidak nyaman khususnya pada telinganya, dengan demikian burung akan terbang rendah untuk meringankannya. Sebagian besar burung bersarang pada saluran listrik dan ini menunjukan tekanan udara turun.</li>" +
                "<li><p align=\"justify\">Burung Camar ( Seagulls ) cenderung berhenti terbang dan berlindung di pantai jika badai akan datang. burung camar menjadi sangat tenang dalam terbangnya sebelum hujan.</li>" +
                "<li><p align=\"justify\">Sapi biasanya akan berbaring sebelum badai. Mereka juga cenderung untuk tetap dekat bersama – sama jika cuaca buruk akan datang.</li>" +
                "<li><p align=\"justify\">Semut membangun bukit dengan sangat curam sebelum hujan.</li>" +
                "<li><p align=\"justify\">Kucing cenderung membersihkan di belakang telinganya sebelum hujan.</li>" +
                "<li><p align=\"justify\">Kura – kura ( Turtles ) sering mencari tempat yang lebih tinggi apabila hujan lebat akan turun. Mereka biasanya sering berada di jalan selama periode 1 sampai 2 hari sebelum terjadinya hujan.</li>" +
                "<li><p align=\"justify\">Jika burung bergerak cepat ini berarti badai hujan akan turun untuk waktu yang lama.</li>" +
                "</ul><p align=\"justify\"><b><br>9. Api Unggun </b><br>" +
                "<br>Asap api unggun harus naik terus. Apabila asap berputar – putar dan turun bertanda tekanan rendah, yang berarti hujan akan menuju Anda.<br>" +
                "<b><br>10. Bulan </b><br>" +
                "<br>Jika Bulan terlihat kemerahan dan terlihat agak buram ini bertanda banyak debu di udara. Sebaliknya apabila Bulan terlihat terang, ini menunjukan udara terlihat cerah, biasanya telah terjadi hujan akibat terdapat sistem tekanan rendah.<br>" +
                "<br>Apabila di sekitar Bulan terdapat lingkaran cincin dan terdapat Cirostarus ini menandakan dalam 3 hari kedepan akan turun hujan.<br>" +
                "<br>Metode ini biasanya pada prakirawan yang selalu memperhatikan tanda – tanda alam disekitarnya. Dengan menggabungkan disiplin ilmunya dengan pengalamannya sebagai prakirawan akan menciptakan metode prakiraan yang berlaku di daerahnya.<br>" +
                "<br>" +
                        "<p align=\"right\"><i>https://kapabe.wordpress.com/2015/04/30/cara-mengetahui-cuaca-dari-tanda-tanda-alam/ <br>(Cara Mengetahui Cuaca Dari Tanda Tanda Alam)";
        String foto1 = "<p align=\"center\"><img src=\"cuaca/cuaca1.png\"></p>";
        String foto2 = "<p align=\"center\"><img src=\"cuaca/cuaca2.png\"></p>";
        String foto3 = "<p align=\"center\"><img src=\"cuaca/cuaca3.png\"></p>";
        String foto4 = "<p align=\"center\"><img src=\"cuaca/cuaca4.png\"></p>";
        String foto5 = "<p align=\"center\"><img src=\"cuaca/cuaca5.png\"></p>";
        String foto6 = "<p align=\"center\"><img src=\"cuaca/cuaca6.png\"></p>";
        String foto7 = "<p align=\"center\"><img src=\"cuammca/cuaca7.png\"></p>";
        String foto8 = "<p align=\"center\"><img src=\"cuaca/cuaca8.png\"></p>";
        view.loadDataWithBaseURL("file:///android_asset/", text + foto1 + text1 + foto2 + text2 + foto3 + text3 + foto4 + text4 + foto5 + text5 + foto6 + text6 + foto7 + text7 + foto8 + text8, "text/html", "utf-8", null);
        return rootView;
    }

}
