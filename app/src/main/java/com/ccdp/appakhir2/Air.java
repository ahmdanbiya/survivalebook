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
    public class Air extends Fragment {


        public Air() {
            // Required empty public constructor
        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_air,
                container, false);
        WebView view = (WebView) rootView.findViewById(R.id.air1);
        String text = "<p align=\"justify\">Sebagai sumber kehidupan setiap mahluk hidup, air tentu nya menjadi prioritas dalam hal survival. Manusia tidak dapat hidup tanpa air, terutama di daerah dengan iklim yang relative panas dimana kita dengan mudah kehilangan cairan tubuh melalui keringat. Bahkan di daerah dingin sekalipun kita masih tetap membutuhkan air, minimal 2 liter sehari. Manusia bisa hidup selama 20 hari tanpa makan. Tetapi,  ketahanan manusia tanpa meminum air maksimal hanya 5 hari.<br>" +
                "<br>Jangan sia – siakan air jika anda ingin hidup lebih lama. Rata-rata, tubuh akan kehilangan 2-3 liter air per hari. Bahkan jika kita tidak melakukan kegiatan apapun, tubuh akan tetap kehilangan cairan.<br>" +
                "<br><b>SUMBER AIR</b><br>" +
                "Di setiap daerah atau ekosistem, rata-rata memiliki kadar air. Kita dapat mencari air dengan memanfaatkan sumber daya yang ada. Gunakan apa saja sebagai penampung air, peples, cangkir, daun, baju, plastik dsb.<br>" +
                "<br>" +
                "<b>Tekhnik Mendapatkan Air</b><br>" +
                "Embun, tumbuhan dapat dijadikan sumber air. Binatang mamalia, burung pemakan biji-bijian, dan serangga seperti semut, lalat dan lebah dapat dijadikan indikator air. Harus di ingat, air yang di minum mamalia belum tentu baik untuk kita. Beberapa mamalia dapat meminum air yang beracun bagi tubuh kita. Periksa kondisi sekitar, serangga air seperti laba-laba air dan tanaman air seperti tespong dapat dijadikan indikator kebersihan air.<br>" +
                "<br>" +
                "<br>" +
                "<b>Air Hujan </b><br>" +
                "Apabila turun hujan ketika sedang ber-survival, maka sebaiknya kesempatan ini dipergunakan sebaik-baiknya untuk menampung air sebanyak-banyaknya. Untuk menampung air hujan, kita dapat memanfaatkan daun yang lebar, bambu, dan sebagainya. <br>" +
                "<br>" +
                "<b>Tanaman </b><br>" +
                "Tanaman rambat dan rotan juga bambu banyak dijumpai di pegunungan dan hutan rimba. Pilihlah tanaman rambat (akar gantung/liana) yang masih segar. Lalu potonglah bagian bawah dari tanaman itu agar air yang terkandung di bagian atas tanaman dapat menetes ke bagian bawah, lalu air yang menetes ditampung di penampungan. Setelah itu baru potong bagian atasnya dengan jarak saru sampai satu setengah meter dari bagian bawahnya. Tanaman rambat ini dapat ditemukan di pohon-pohon besar. Dan satu pohon dapat diambil beberapa tanaman rambat. Sebenarnya air yang didapat dari tanaman rambat ini sedikit, tetapi cukup untuk membasahi tenggorokan.<br>" +
                "<br>" +
                "<b>Air sungai dan mata air</b><br>" +
                "Kebanyakan air sungai yang d hutan dapat langsung diminum. Tetapi harap diteliti sebelumnya, apakah di sekitar sungai itu terdapat pembuangan kotoran atau limbah. <br>" +
                "<br>" +
                "<b>Hutan</b><br>" +
                "Tumbuh-tumbuhan sejenis palem, bambu-bambuan, rotan, akar rambat, kantung semar dapat dijadikan sumber air. Potong bagian batangnya dan tampung tetesan airnya dalam wadah.<br>" +
                "<br>";
        String text1 =
                "<p align=\"center\"><i>Contoh cara mendapatkan air dari pohon pisang dan semacamnya</i><br>" +
                " <br>";
        String text2 =
                "<p align=\"center\"><i>Contoh cara mendapatkan air dari bambu-bambuan</i><br>" +
                "<br>" +
                "<p align=\"justify\">Kita juga dapat menampung embun yang ada pada pucuk-pucuk daun pada pagi hari.<br>" +
                "<br>" +
                "<b>Metode <i>Aboveground Still</i></b><br>" +
                "Untuk melakukan tehnik ini kita membutuhkan lereng dengan sinar matahari yang cukup, kantung plastik bening, dedaunan hijau, sebuah batu.<br>" +
                "Cara membuatnya :<br>" +
                "<ul><li><p align=\"justify\">Isi 3/4 bagian plastik dengan dedaunan hijau. Pastikan tidak ada batang atau benda apa pun yang dapat melubangi plastik.</li>" +
                "<li><p align=\"justify\">Letakkan batu kecil atau semacamnya kedalam plastik</li>" +
                "<li><p align=\"justify\">Tutup rapat plastik. Jika kita memiliki sedotan seperti buluh jerami atau semacamnya, kita dapat memasangnya.</li>" +
                "<li><p align=\"justify\">etakkan plastik di lereng dengan cukup sinar. Atur batu agar berada di bagian bawah.</li>" +
                "</ul><br>";
        String text3 =
                "<b>Metode <i>Belowground Still</i></b><br>" +
                "<ul><li><p align=\"justify\">Buatlah lubang sedalam kira-kira setengah meter dan luas permukaan 1 meter persegi.</li>" +
                "<li><p align=\"justify\">Letakkan dedaunan hijau kedalam lubang dan letakkan juga wadah penampung air tepat di tengah lubang.</li>" +
                "<li><p align=\"justify\">Tutuplah lubang dengan lembaran plastik dan beri penahan pada plastik menggunakan tanah.</li>" +
                "<li><p align=\"justify\">Letakkan batu kecil tepat ditengah plastik.</li>" +
                "<li><p align=\"justify\">Biarkan sinar matahari menguapkan kandungan air dari dedaunan.</li>" +
                "</ul>";
        String text4 =
                "<p align=\"justify\">Tips : Ganti dedaunan hijau secara bertahap untuk mendapatkan air yang maksimal.<br>" +
                "<br>" +
                "<b>Celah Bebatuan</b><br>" +
                "Jika disekitar anda terdapat tebing, goa, maupun kompleks bebatuan. Ada harapan disana terdapat sumber air. Jika anda tidak dapat menemukan sumber air (kemungkinan musim kemarau), perhatikan dengan teliti celah demi celah bebatuan tersebut. Ada kemungkinan terdapat air yang menetes di celah – celah  bebatuan tersebut.<br>" +
                "<br>" +
                "<b>Perasan Lumut</b><br>" +
                "Anda bisa menggunakan lumut untuk mendapatkan air. Dengan cara menempekan kain kemudian menekan nya, lalu peraslah air tersebut, selain itu anda juga bisa menempelkan nya dengan kain bersih, lalu menyedot langsung dari lumut tersebut.<br>" +
                "<br>" +
                "<b>Perasan Kotoran Gajah</b><br>" +
                "Walaupun metode ini mungkin terdengar menjijikan bagi anda. Nyatanya, kotoran gajah benar – benar mengandung air. Untuk mendapatkan air, peras kotoran gajah tersebut dengan menggunakan kain. Hasil perasan dapat langsung di minum.<br>" +
                "<br>" +
                "<b>Air Seni</b><br>" +
                "Jika anda benar – benar terdesak dalam situasi dimana anda tidak dapat menemukan air dan sekarat karena dehidrasi hebat, demi bertahan hidup, Anda dapat menggukanan air seni anda sendiri. Jadi Jangan sia – siakan air seni anda. Jangan lakukan ini jika anda tidak benar – benar terdesak.<br>" +
                "<br>" +
                "<b>Penyaringan Air</b><br>" +
                "Berikut adalah cara menyaring air :<br>" +
                "<br>" +
                "<ul><li> <p align=\"justify\">Dengan kaos berlapis. Lebih baik apabila kaos itu berwarna putih, sehingga apabila kotor dapat terlihat dan dapat dibersihkan terlebih dahulu. Selai itu anda dapat menggunakan plastik.</li>" +
                "<li><p align=\"justify\">Dengan cara melewatkan air ke dalam rongga bambu yang telah dipotong di kedua ujungnya. Di dasar bambu diberi penyaring seperti kerikil, ijuk, rumput kering atau daun kering.</li>" +
                "</ul><br>" +
                "<p align=\"justify\">Air keruh juga dapat dimanfaatkan setelah dilakukan proses pengendapan selama dua puluh empat jam di tempat bersih. Apabila air yang telah diendapkan masih telihat atau terasa kotor, maka dapat dilakukan proses penyaringan beberapa kali. Tetapi cara yang paling aman untuk mendapatkan air bersih adalah setelah dibersihkan lalu air dimasak sampai masak.<br>" +
                "<br>" +
                "<ul><li>Air yang dimurnikan</li>" +
                "<li>Air berlumpur</li>" +
                "<li>Air yang tidak memenuhi syarat fisik.</li>" +
                " </ul>" +
                "<br>";
        String text5 =
                "<p align=\"justify\"><b>Pantai dan daerah dekat laut.</b><br>" +
                "Pada daerah tropis seperti Indonesia, pohon kelapa biasanya tumbuh di sepanjang pantai. Kita dapat memanfaatkan air dari buah kelapa dan memakan dagingnya. Namun bila tidak ada, kita dapat menghisap air dari tumbuhan agar-agar bila ada dan kita juga dapat menyuling air laut. <br>" +
                "<br>" +
                "<b>Tehnik 1</b><br>" +
                "<ul><li>Gali lubang yang cukup dalam sehingga air laut dapat meresap melaui celah-celah lubang.</li>" +
                "<li>Letakkan lembaran plastik, daun, baju atau semacamnya diatasnya.</li>" +
                "<li>Buat api yang cukup besar.</li>" +
                "<li>Cari batu dan panaskan batu kedalam api.</li>" +
                "<li>Setelah batu panas, masukkan ke dalam air dan tampung uap air yang keluar dan menetes dari lembaran plastik. </li>" +
                "</ul><b>Tehnik 2</b><br>" +
                "<p align=\"justify\">Jika kita memiliki penampung air seperti cangkir, mangkuk atau semacamnya, kita dapat memasak air laut dan menampung uap air yang keluar.<br>" +
                "<br>" +
                "<b>Daerah Tandus atau Gurun</b><br>" +
                "Kita dapat mencari air dengan menggali lubang di daerah lembah atau dataran rendah, cekungan pada sungai mati, kaki jurang, dangkalan danau mati, celah dan lubang pada bebatuan, daerah yang berkabut dan dimana pun yang memiliki tumbuhan hijau seperti lumut dan sebagainya.<br>" +
                "<br>" +
                "<b>Kaktus dan tumbuhan lainnya</b><br>" +
                "Kita dapat memotong ujung kaktus dan menumbuknya. Ambil airnya dengan cara meneteskan hasil tumbukan. Jangan pernah menelan ampas dari tumbukan kaktus. <br>" +
                "<br>" +
                "<b>Daerah dingin</b><br>" +
                "Kita dapat mengunakan salju atau es. Jangan menelan salju atau es tanpa melelehkannya terlebih dahulu. Memakan es atau salju dapat menurunkan temperatur tubuh dan dapat menyebabkan dehidrasi.<br>" +
                "<br>" +
                "<b>Perhatian</b><br>" +
                "Jika harus meransum air, lakukan dengan cara meminumnya seteguk demi seteguk. Dan jika menemukan sumber air jangan langsung meminum air dalam jumlah banyak. Kita yang terkena dehidrasi dapat muntah dan kehilangan benda yang paling berharga. Berhati – hati lah meminum dari sumber air seperti telaga atau kolam yang terdapat tulang belulang makhluk hidup atau tidak terdapat tumbuhan hijau disekitar nya. Dikarenakan ada kemungkinan air telah tercemar. Cek pinggiran sumber air terlebih dahulu, jika terdapat kemungkinan indikasi mineral yang menunjukan kondisi adanya alkaline dalam kadar air tersebut, disarankan agar anda tidak meminum air dari sumber tersebut.<br>" +
                "<i><p align=\"left\">http://oltlo.blogspot.co.id/2012/12/cara-mendapatkan-air.html <br>(Cara Mendapatkan Air)<br>" +
                      "<br>https://lampukecil.com/2014/04/08/cara-menemukan-air-saat-terdampar-di-pulau-tak-berpenghuni/ <br>(Cara Menemukan Air saat Terdampar di Pulau tak Berpenghuni).<br>" +
                       "<br>http://indranicellizer.blogspot.co.id/p/teknik-mendapatkan-air-saat-survival.html <br>(Teknik Mendapatkan Air Saat Survival)<br>" +
                        "<br>http://pasabana-smarihexa.blogspot.co.id/p/blog-page_1469.html <br>(Cara Menemukain Air Di Alam Bebas)<br>" +
                       "<br>http://phinemo.com/cara-mendapatkan-air-di-alam-bebas/ <br>(Cara Mendapatkan Air Di Alam Bebas)<br>" +
                   "<br>http://www.sangfajar.com/2016/10/cara-mendapatkan-air-di-alam-bebas.html <br>(Cara Mendapatkan Air Di Alam Bebas)<br>\" +";
        String foto1 = "<p align=\"center\"><img src=\"air/air1.png\"></p>"; //nyoba css
        String foto2 = "<p align=\"center\"><img src=\"air/air2.png\"></p>";
        String foto3 = "<p align=\"center\"><img src=\"air/air3.png\"></p>";
        String foto4 = "<p align=\"center\"><img src=\"air/air4.png\"></p>";
        String foto5 = "<p align=\"center\"><img src=\"air/air5.png\"></p>";
        view.loadDataWithBaseURL("file:///android_asset/", text + foto1 + text1 + foto2 + text2 + foto3 + text3 + foto4 + text4 + foto5 + text5 + "</p>", "text/html", "utf-8", null);
        return rootView;

    }

}
