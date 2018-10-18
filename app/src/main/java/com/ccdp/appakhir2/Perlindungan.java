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
public class Perlindungan extends Fragment {


    public Perlindungan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_perlindungan,
                container, false);
        WebView view = (WebView) rootView.findViewById(R.id.perlindungan1);
        String text =
                "<p align=\"justify\">Seorang survivor adalah seseorang yang siap untuk bertahan hidup - dan bertahan hidup semaksimal mungkin - ketika kehidupan jauh dari rumah tidak berjalan sesuai rencana. Bersiap untuk bertahan di alam bebas dimulai dengan mengetahui apa yang harus dipersiapkan. Anda bisa hidup berhari-hari tanpa air dan berminggu-minggu tanpa makanan. Orang yang tidak dapat bertahan di alam terbuka paling sering meninggal karena kehilangan panas tubuhnya, tidak selalu karena kelaparan atau dehidrasi. Maka dari itu anda harus bisa menyalakan api. Dan mungkin yang terpenting, Anda harus bisa membangun tempat penampungan untuk mencegah angin, hujan dan salju, dan agar tubuh Anda tetap hangat saat terjebak di tempat yang memiliki hal tersebut di sekitar anda.<br>" +
                "Berikut adalah kunci untuk berlindung di alam terbuka:<br>" +
                "<p align=\"center\"><b>BERPAKAIANLAH DENGAN BIJAK</b><br>" +
                "<p align=\"justify\">Baris pertahanan pertama anda melawan unsur-unsur tersebut adalah pakaian apa yang Anda pilih untuk dipakai. Jika Anda memakai lapisan bahan sintetis atau wol, dan lapisan tahan angin atau bahan tahan air. Anda akan menjebak panas tubuh anda.<br>" +
                "<p align=\"center\"><b>PEMILIHAN TEMPAT</b><br>" +
                "<p align=\"justify\">Bila Anda berada dalam situasi bertahan hidup dan menyadari bahwa tempat berlindung merupakan prioritas tinggi, mulailah mencari tempat berlindung sesegera mungkin. Sewaktu Anda melakukannya, ingat apa yang Anda perlukan di situs ini. Berikut syarat penting membuat tempat perlindungan:<br>" +
                "<ul><li><p align=\"justify\">Harus berisi material untuk membuat jenis tempat berlindung yang Anda butuhkan.</li>" +
                "<li<p align=\"justify\">>Harus cukup besar dan cukup ketinggian agar Anda berbaring dengan nyaman.</li>" +
                "<p align=\"justify\">Bila Anda mempertimbangkan persyaratan ini, Anda tidak dapat mengabaikan situasi taktis atau keselamatan Anda. Anda juga harus mempertimbangkan apakah lokasi tersebut --<br>" +
                "</ul><ul><li>Tersembunyi dalam pengamatan musuh.</li>" +
                "<li>Memiliki rute pelarian. </li>" +
                "<li>Cocok untuk memberikan sinyal kepada teman anda atau sekutu, jika perlu. </li>" +
                "<li>Aman terhadap gangguan hewan liar, bebatuan, ataupun pohon mati yang dapat sewaktu waktu jatuh. </li>" +
                "<li>Bebas dari serangga, hewan reptil, dan juga tanaman beracun.</li></ul>" +
                "<p align=\"justify\">Anda juga harus mengingat masalah yang bisa timbul di lingkungan Anda. Contohnya--<br>" +
                "<ul><li>Hindari daerah banjir bandang di kaki bukit.</li>" +
                "<li>Hindari longsor atau daerah longsor di daerah pegununga</li>" +
                "<li>Hindari tempat di dekat genanganan air yang berada di bawah titik air yang tinggi.</li>" +
                "</ul><p align=\"justify\">Di beberapa daerah, musim tahun ini memiliki pengaruh kuat pada situs yang Anda pilih. Situs ideal untuk tempat berlindung berbeda pada musim dingin dan musim panas. Selama bulan-bulan musim dingin Anda akan menginginkan sebuah situs yang akan melindungi Anda dari angin dingin dan angin, namun akan memiliki sumber bahan bakar dan air. Selama bulan-bulan musim panas di daerah yang sama Anda akan menginginkan sumber air, tapi Anda pasti ingin agar situs ini hampir bebas serangga.<br>" +
                "<br>" +
                "<b>THE COCOON</b><br>" +
                "Jika hari hampir gelap, Anda bisa buru-buru mengumpulkan puing-puing kering (dedaunan, ranting kayu, kulit kayu) di sekitar anda dan buat tumpukan setinggi sekitar setengah meter. Saat Anda masuk ke dalam tumpukan, Anda berada dalam kantong tidur alami yang melindungi dari kehilangan panas tubuh anda.<br>" +
                " <br>";
        String text1 =
                "<p align=\"justify\"><b>THE FALLEN TREE</b><br>" +
                "Tempat berlindungan yang paling sederhana adalah pohon tumbang yang memiliki cukup ruang di bawahnya agar Anda bisa merangkak masuk. Cabang bersandar di sisi angin pohon (agar angin bertiup ke sana dan tidak melawannya) untuk membuat dinding. Buatlah dinding cukup tebal untuk menahan angin. Jika Anda bisa membangun perapian di sisi terbuka tempat berlindung Anda, panas akan membantu Anda tetap hangat.<br>" +
                " <br>";
        String text2 =
                "<p align=\"justify\"><b>THE LEAN-TO</b><br>" +
                "Jika Anda menemukan pohon tumbang tanpa cukup ruang di bawahnya, atau batu atau atasan kecil, Anda bisa membangun lean-to sederhana. Mulailah dengan menekuk tungkai jatuh ke objek, seperti tepi atas overhang, untuk membuat dinding. Bersandarlah pada tungkai di sudut untuk membantu melindungi hujan. Tutupi anggota badan yang bersandar dengan dedaunan, dahan, jarum pinus, kulit kayu atau apapun yang ditawarkan hutan. Bila Anda telah membangun dinding yang tebal, Anda bisa merangkak ke bawah ke tempat penampungan Anda. Ingatlah untuk membuat tempat berlindung Anda tidak lebih besar dari yang Anda butuhkan agar sesuai dengan Anda dan orang lain dengan Anda. Semakin besar ruang, semakin sulit untuk tetap hangat.<br>" +
                "Anda juga bisa membangun lean-to dengan menempatkan satu ujung tongkat panjang di dahan pohon yang rendah dan menopang ujung tongkat dengan dua tongkat lagi. Ikat ujung tongkat bersama dengan tali sepatu boot atau ikat pinggang Anda. Bersandar lebih banyak tongkat melawan tongkat horisontal. Kemudian tumpukan daun dan sisa-sisa hutan lainnya dari batang yang bersandar sampai Anda memiliki dinding. Sekali lagi, api di sisi terbuka ramping - akan menambah panas ke \"ruangan\" Anda.<br>" +
                " <br>";
        String text3 =
                "<p align=\"justify\"><b>THE A-FRAME</b><br>" +
                "Jika Anda tidak bisa membuat lean-to, Anda bisa membuat shelter A-frame. Anda memerlukan dua batang panjang empat atau lima kaki dan satu tongkat panjangnya 10 sampai 12 kaki. Prop dua tongkat lebih pendek dalam bentuk huruf A. Prop yang lebih panjang menempel di bagian atas A. Tie tiga batang bersama di mana mereka bertemu. Ketiga tongkat itu akan berbentuk tenda A-frame dengan satu ujungnya roboh ke tanah. Sekarang pasang lebih banyak stik menempel pada tongkat yang lebih panjang, dan susun sisa-sisa hutan dari batang kayu sampai Anda memiliki tempat berlindung terisolasi yang terbuka di ujung yang tinggi.<br>" +
                " <br>";
        String text4 =
                "<p align=\"justify\"><b>A TARP</b><br>" +
                "Jika Anda tidak bisa membuat lean-to, Anda bisa membuat shelter A-frame. Anda memerlukan dua batang panjang empat atau lima kaki dan satu tongkat panjangnya 10 sampai 12 kaki. Prop dua tongkat lebih pendek dalam bentuk huruf A. Prop yang lebih panjang menempel di bagian atas A. Tie tiga batang bersama di mana mereka bertemu. Ketiga tongkat itu akan berbentuk tenda A-frame dengan satu ujungnya roboh ke tanah. Sekarang pasang lebih banyak stik menempel pada tongkat yang lebih panjang, dan susun sisa-sisa hutan dari batang kayu sampai Anda memiliki tempat berlindung terisolasi yang terbuka di ujung yang tinggi.<br>";
        String text5 =
                "<p align=\"justify\"><b>KASUR</b><br>" +
                "Tempat penampungan Anda tidak lengkap sampai Anda membuat tempat tidur untuk berbaring. Daun kering bekerja dengan baik. Buat tempat tidur Anda sedikit lebih besar dari ruang yang tubuh Anda tutup dan setebal delapan inci tebal. Saat Anda meringkuk ke dalamnya, Anda siap untuk malam yang tak terduga.<br>" +
                        "<p align=\"left\"><i>http://boyslife.org/outdoors/3473/taking-shelter/ <br>(Taking Shelter)<br>";

        String foto1 = "<p align=\"center\"><img src=\"shelter/shelter1.png\"></p>";
            String foto2 = "<p align=\"center\"><img src=\"shelter/shelter2.png\"></p>";
            String foto3 = "<p align=\"center\"><img src=\"shelter/shelter3.png\"></p>";
            String foto4 = "<p align=\"center\"><img src=\"shelter/shelter4.png\"></p>";
            String foto5 = "<p align=\"center\"><img src=\"shelter/shelter5.png\"></p>";
            view.loadDataWithBaseURL("file:///android_asset/", text + foto1 + text1 + foto2 + text2 + foto3 + text3 + foto4 + text4 + foto5 + text5 + "</p>", "text/html", "utf-8", null);
            return rootView;
    }

}
