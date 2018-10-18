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
public class Navigasi extends Fragment {


    public Navigasi() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_psikologi,
                container, false);
        WebView view = (WebView) rootView.findViewById(R.id.psikologi1);
        String text = " \n" +
                "<p align=\"justify\">Dalam situasi bertahan hidup, Anda akan sangat beruntung jika kebetulan memiliki peta dan kompas. Jika Anda memiliki dua peralatan ini, kemungkinan besar Anda bisa bergerak menuju bantuan. Jika Anda tidak mahir menggunakan peta dan kompas, Anda harus mengambil langkah untuk mendapatkan keterampilan ini.<br>" +
                "Ada beberapa metode yang dengannya Anda bisa menentukan arah dengan menggunakan matahari dan bintang-bintang. Metode ini, bagaimanapun, akan memberi Anda hanya arah umum. Anda bisa datang dengan arah yang lebih benar jika Anda mengetahui medan dari wilayah atau negara.<br>" +
                "Anda harus mempelajari semua yang Anda bisa tentang medan negara atau wilayah yang Anda atau unit Anda boleh dikirim, terutama fitur dan landmark yang menonjol. Pengetahuan tentang medan ini bersama dengan menggunakan metode yang dijelaskan di bawah ini akan memungkinkan Anda menemukan arahan yang benar untuk membantu Anda menavigasi.<br>" +
                "<p align=\"center\"><b>MENGGUNAKAN MATAHARI DAN BAYANGAN</b><br>" +
                "<p align=\"justify\">Hubungan bumi dengan matahari dapat membantu Anda menentukan arah di bumi. Matahari selalu terbit di timur dan terbenam di barat, tapi tidak sampai ke timur atau ke barat. Ada juga beberapa variasi musiman. Di belahan bumi utara, matahari akan jatuh ke selatan saat berada di titik tertinggi di langit, atau saat benda tidak menghasilkan bayangan yang berarti. Di belahan bumi selatan, matahari siang hari yang sama ini akan menandai ke utara. Di belahan bumi utara, bayangan akan bergerak searah jarum jam. Bayangan akan bergerak berlawanan arah jarum jam di belahan bumi bagian selatan. Dengan latihan, Anda bisa menggunakan bayangan untuk menentukan arah dan waktu.<br>" +
                "<b>Tehnik Bayangan</b> <br>" +
                "Dalam metode bayangan pertama, temukan tongkat lurus sepanjang 1 meter, dan titik sejuk yang bebas dari sikat tempat tongkat itu akan menghasilkan bayangan yang pasti. Metode ini sederhana dan akurat dan terdiri dari empat langkah: <br>" +
                "<ul><li><p align=\"justify\">Langkah 1. Tempatkan tongkat atau ranting ke tanah pada titik di mana ia akan melemparkan bayangan yang khas. Tandai ujung bayangan dengan batu, ranting, atau cara lainnya. Tanda bayangan pertama ini selalu ke barat - di mana-mana di bumi.</li>" +
                "<li><p align=\"justify\">Langkah 2. Tunggu 10 sampai 15 menit sampai ujung bayangan bergerak beberapa sentimeter. Tandai posisi baru bayangan dengan cara yang sama seperti yang pertama.</li>" +
                "<li><p align=\"justify\">Langkah 3. Gambarkan garis lurus melalui dua tanda untuk mendapatkan perkiraan garis timur-barat. </li>" +
                "<li><p align=\"justify\">Langkah 4. Berdiri dengan tanda pertama (barat) ke kiri dan tanda kedua di sebelah kanan Anda - Anda sekarang menghadap ke utara. Fakta ini benar dimana-mana di bumi.<br>" +
                "<p align=\"justify\">Metode alternatif lebih akurat namun membutuhkan lebih banyak waktu. Atur tongkat bayanganmu dan tandai bayangan pertama di pagi hari. Gunakan sepotong tali untuk menggambar busur bersih melalui tanda ini dan di sekitar tongkat. Pada tengah hari, bayangan akan menyusut dan hilang. Sore hari, itu akan memanjang lagi dan pada titik di mana ia menyentuh busur, buat tanda kedua. Buat garis melalui dua tanda untuk mendapatkan garis timur-barat yang akurat (lihat Gambar 18-1).</li>" +
                "</ul> <br>";
        String text1 =
                "<p align=\"justify\"><b>Tehnik Jam Tangan</b> <br>" +
                "Anda juga bisa menentukan arah dengan menggunakan jam tangan biasa atau analog - yang memiliki tangan. Arahnya akan akurat jika Anda menggunakan waktu setempat yang sebenarnya, tanpa perubahan pada waktu siang hari. Ingat, semakin jauh Anda dari khatulistiwa, semakin akurat metode ini. Jika Anda hanya memiliki jam tangan digital, Anda bisa mengatasi hambatan ini. Dengan cepat arahkan jam tangan ke lingkaran kertas dengan waktu yang benar dan gunakan untuk menentukan arah Anda saat itu.<br>" +
                "Di belahan bumi utara, pegang arloji horizontal dan arahkan jam tangan ke arah matahari. Bisect sudut antara jam tangan dan tanda pukul 12 untuk mendapatkan garis utara-selatan (Gambar 18-2). Jika ada keraguan tentang ujung mana yang berada di utara, ingatlah bahwa matahari terbit di timur, terbenam di barat, dan menuju ke selatan pada siang hari. Matahari berada di timur sebelum tengah hari dan di barat setelah siang hari.<br>" +
                "<br>" +
                "Catatan: Jika jam tangan Anda disetel pada daylight savings time, gunakan titik tengah antara jam tangan dan jam 1 untuk menentukan garis utara-selatan.<br>" +
                " <br>";
        String text2 =
                "<p align=\"justify\">Di belahan bumi bagian selatan, arahkan jam 12 jam ke arah matahari dan titik tengah di tengah antara jam 12 dan jam tangan akan memberi Anda garis utara-selatan (Gambar 18-2).<br>" +
                "<p align=\"center\"><b>MENGGUNAKAN BULAN</b><br>" +
                "<p align=\"justify\">Karena bulan tidak memiliki cahaya tersendiri, kita hanya bisa melihatnya saat itu memantulkan sinar matahari. Saat mengorbit bumi pada sirkuit 28 hari, bentuk cahaya yang dipantulkan bervariasi sesuai dengan posisinya. Kita mengatakan ada bulan baru atau tidak ada bulan saat berada di seberang bumi dari sengatan matahari. Kemudian, saat bergerak menjauh dari bayangan bumi, ia mulai memantulkan cahaya dari sisi kanan dan malam untuk menjadi bulan purnama sebelum memudar, atau kehilangan bentuk, tampak seperti potongan di sisi kiri. Anda bisa menggunakan informasi ini untuk mengidentifikasi arah.<br>" +
                "Jika bulan terbit sebelum matahari terbenam, sisi yang diterangi akan menjadi barat. Jika bulan terbit setelah tengah malam, sisi yang diterangi akan menjadi timur. Penemuan yang jelas ini memberi kita referensi timur-barat yang kasar pada malam hari.<br>" +
                "<p align=\"center\"><b>MENGGUNAKAN BINTANG</b><br>" +
                "<p align=\"justify\">Lokasi Anda di Belahan Utara atau Selatan menentukan konstelasi mana yang Anda gunakan untuk menentukan arah utara atau selatan Anda.<br>" +
                "</b>T<br>he Northern Sky</b> <br>" +
                "Konstelasi utama yang harus dipelajari adalah Ursa Major, yang juga dikenal sebagai Big Dipper atau Plough, dan Cassiopeia (Gambar 18-3). Tak satu pun dari konstelasi ini pernah ada. Mereka selalu terlihat pada malam yang cerah. Gunakan mereka untuk menemukan Polaris, juga dikenal sebagai polestar atau Bintang Utara. Bintang Utara merupakan bagian dari pegangan Little Dipper dan bisa dibingungkan dengan Big Dipper. Cegah kebingungan dengan menggunakan Big Dipper dan Cassiopeia bersama-sama. Big Dipper dan Cassiopeia selalu berhadapan langsung dengan masing-masing. Lain dan putar berlawanan arah jarum jam di sekitar Polaris, dengan Polaris di tengahnya. The Big Dipper adalah rasi bintang tujuh dalam bentuk sebuah dipper. Dua bintang yang membentuk bibir luar dari celup ini adalah \"bintang penunjuk\" karena mengarah ke Bintang Utara. Secara mental, tarik garis dari bintang terluar ke arah luar bintang atas ember Big Dipper. Perluas garis ini kira-kira lima kali jarak antara bintang penunjuk. Anda akan menemukan Bintang Utara sepanjang baris ini.<br>" +
                "  <br>";
        String text3 =
                "<p align=\"justify\">Cassiopeia memiliki lima bintang yang membentuk bentuk seperti \"W\" di sisinya. Bintang Utara langsung keluar dari bintang pusat Cassiopeia.<br>" +
                "Setelah menemukan Bintang Utara, temukan Kutub Utara atau utara benar dengan menggambar garis imajiner langsung ke bumi.<br>" +
                "<br><b>The Southern Sky</b> <br>" +
                "Karena tidak ada bintang yang cukup terang untuk dikenali dengan mudah di dekat kutub langit selatan, sebuah rasi yang dikenal dengan Southern Cross digunakan sebagai rambu ke Selatan (Gambar 18-4). Salib Selatan atau Crux memiliki lima bintang. Keempat bintang terangnya membentuk salib yang miring ke satu sisi. Dua bintang yang membentuk sumbu panjang salib adalah bintang penunjuk. Untuk menentukan selatan, bayangkan jarak lima kali jarak antara Bintang-bintang ini dan titik di mana garis imajiner ini berakhir berada pada arah selatan. Lihatlah ke cakrawala dari titik imajiner ini dan pilih tengara yang harus ditempuh. Dalam situasi bertahan hidup yang statis, Anda dapat memperbaiki lokasi ini di siang hari jika Anda mengemudikan taruhan di tanah pada malam hari untuk menunjukkan" +
                "caranya.<br>";
        String text4 =
                "<p align=\"center\"><b>MEMBUAT KOMPAS SEADANYA</b><br>" +
                "<p align=\"justify\">Anda bisa membuat kompresor improvisasi dengan menggunakan sepotong logam besi yang bisa berbentuk jarum atau pisau silet bermata datar dan sepotong benang nonmetalik atau rambut panjang untuk menangguhkannya. Anda dapat menarik atau memolarisasi logam dengan perlahan membelainya dalam satu arah pada sepotong sutra atau dengan hati-hati melalui rambut Anda dengan menggunakan goresan yang disengaja. Anda juga bisa memolarisasi logam dengan membelainya berulang kali di salah satu ujungnya dengan magnet. Selalu gosok ke satu arah saja. Jika Anda memiliki baterai dan beberapa kabel listrik, Anda bisa memolarisasi logam secara elektrik. Kawat harus diinsulasi. Jika tidak terisolasi, bungkus benda logam dengan kertas tipis tipis untuk mencegah kontak. Baterai harus minimal 2 volt. Bentuk koil dengan kabel listrik dan sentuh ujungnya ke terminal baterai. Berulang kali masukkan salah satu ujung benda logam masuk dan keluar dari koil. Jarum akan menjadi elektromagnet. Bila ditangguhkan dari sepotong senapan non logam, atau melayang di atas sepotong kayu kecil di air, ia akan menyesuaikan diri dengan garis utara-selatan.<br>" +
                "<br>" +
                "Anda bisa membuat kompas improvisasi yang lebih rumit dengan menggunakan jarum jahit atau benda metalik tipis, wadah nonmetalik (misalnya wadah plastik), penutupnya dengan pusat dipotong dan kedap air, dan ujung perak dari pena. Untuk membangun kompas ini, ambil jarum jahit biasa dan hentikan dua. Satu setengah akan membentuk pointer arah Anda dan yang lainnya akan bertindak sebagai titik pivot. Dorong bagian yang digunakan sebagai titik pivot melalui pusat bawah wadah Anda; Bagian ini harus disiram di bagian bawah dan tidak mengganggu tutupnya. Pasang bagian tengah bagian lainnya (penunjuk) jarum pada ujung perak pena dengan menggunakan lem, getah pohon, atau plastik cair. Magnetize salah satu ujung pointer dan istirahat pada titik pivot.<br>" +
                "<p align=\"center\"><b>ALAT LAINNYA YANG DAPAT MENENTUKAN ARAH</b><br>" +
                "<p align=\"justify\">Pepatah lama tentang penggunaan lumut di pohon untuk menunjukkan ke utara tidak akurat karena lumut tumbuh benar di sekitar beberapa pohon. Sebenarnya, pertumbuhan lebih subur di sisi pohon yang menghadap ke selatan di belahan bumi utara dan sebaliknya di belahan bumi bagian selatan. Jika ada beberapa pohon yang ditebang untuk perbandingan, lihatlah tunggulnya. Pertumbuhan lebih gencar di sisi khatulistiwa dan cincin pertumbuhan pohon akan lebih banyak jaraknya. Di sisi lain, cincin pertumbuhan pohon akan saling berdekatan di sisi ke arah kutub.<br>" +
                "Arah angin mungkin membantu dalam beberapa kasus di mana ada arah yang berlaku dan Anda tahu apa adanya.<br>" +
                "Mengetahui perbedaan antara vegetasi dan pola kelembaban di lereng utara dan selatan dapat membantu menentukan arah. Di belahan bumi utara, lereng yang menghadap ke utara menerima lebih sedikit sinar matahari daripada lereng yang menghadap ke selatan dan karena itu lebih sejuk dan meredam. Di musim panas, lereng yang menghadap ke utara menyimpan petak salju. Di musim dingin, pepohonan dan area terbuka di lereng yang menghadap ke selatan adalah yang pertama kehilangan salju mereka, dan tumpukan salju di tanah dangkal.<br>"+
                        "<br><br><i>Departemen Petahanan Amerika Serikat, US Army Field Manual \"Survival\" (FM 21-76), Markas Besar Departemen Tentara Amerika Serikat 1956.";
        String foto1 = "<p align=\"center\"><img src=\"navigasi/navigasi1.png\"></p>";
        String foto2 = "<p align=\"center\"><img src=\"navigasi/navigasi2.png\"></p>";
        String foto3 = "<p align=\"center\"><img src=\"navigasi/navigasi3.png\"></p>";
        String foto4 = "<p align=\"center\"><img src=\"navigasi/navigasi4.png\"></p>";
        view.loadDataWithBaseURL("file:///android_asset/", text + foto1 + text1 + foto2 + text2 + foto3 + text3 + foto4 + text4 + "</p>", "text/html", "utf-8", null);
        return rootView;
    }

}
