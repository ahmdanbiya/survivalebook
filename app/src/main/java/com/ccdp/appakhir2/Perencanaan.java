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
public class Perencanaan extends Fragment {


    public Perencanaan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_perencanaan,
                container, false);
        WebView view = (WebView) rootView.findViewById(R.id.perencanaan1);
        String text = "\n" +
                "<b><p align=\"justify\">PENTINGNYA PERENCANAAN DAN PERSIAPAN</b><br>" +
                "<br>" +
                "Dalam kondisi survival orang akan dihadapkan pada kebingungan dan disorientasi, sehingga sering kali menimbulkan rasa kepanikan yang luar biasa, dan kebingungan dalam mengambil keputusan ataupun tindakan. Sehingga dalam kondisi survival terutama tersesat atau berada di suatu tempat yang tidak kita ketahui, serta dalam kondisi penopang hidup yang sangat minim, seperti makanan, air, tempat perlindungan dan berada dilokasi yang terisolasi dengan dunia luar. Menuntut untuk membuat sebuah perencanaan saat dihadapkan pada keadaan survival, dan dituntut untuk tidak melakukan tindakan-tindakan di luar perencanaan yang justru akan membahayakan diri kita sendiri, sebelum membuat perencanaan ini alangkah baiknya kita mengikuti pedoman atau prinsip dasar dalam survival yang harus dilakukan secara berurutan, yaitu <b>\"STOP\"</b>." +
                "<ul>\n" +
                "<li><b>S</b> = Stop/Sit Down, berhenti dan beristirahat,</li><br>" +
                "<li><b>T</b> = Thingking, berpikir dan menyadari masalah yang dihadapi,</li><br>" +
                "<li><b>O</b> = Observe, mengamati keadaan lingkungan,</li><br>" +
                "<li><b>P</b> = Planning, membuat rencana mengenai tindakan yang akan dilakukan.</li><br>" +
                "</ul>" +
                "<p align=\"justify\">Ada juga beberapa penggiatan di alam bebas, membagi prinsip atau pedoman dasar survival, pada saat dihadapkan kondisi untuk bertahan hidup dengan istilah <b>\"SPEAR\"</b> :</p>" +
                "<ul><li><b>S</b> = Stop, berhenti,</li><br>" +
                "<li><b>P</b> = Planning, membuat rencana,</li><br>" +
                "<li><b>E</b> = Execute, melaksanakan rencana yang telah dibuat,</li><br>" +
                "<li><b>A</b> = Asses, menilai apa yang telah dilaksanakan,</li><br>" +
                "<li><b>R</b> = Re-evaluate, mengevaluasi kembali dari rencana, pelaksanaan dan hasil penilaian untuk digunakan sebagai pertimbangan rencana survival selanjutnya.</li><br></ul>" +
                "<p align=\"justify\">Jauh sebelum menghadapi kondisi survival alangkah baiknya sudah memiliki perencanaan dalam menghadapi kemungkinan terburuk, seperti kondisi terluka, bertahan hidup (survival) ataupun mengalami kedua-duanya. Sehingga merencanakan dan mempersiapkan diri sebelum melakukan suatu perjalanan akan membuat lebih waspada dan siap saat hal itu terjadi. Perencanaan dan persiapan yang dilakukan akan meningkatkan kesempatan untuk bertahan hidup saat tanpa diduga dihadapkan pada kondisi survival. Kondisi survival ini dapat terjadi pada siapa saja, di mana saja, kapan saja, jadi ingatlah : <font color=\"blue\"><i>\"failure to plan is a plan to fail\"</i> (kegagalan untuk membuat Perencanaan Bertahan Hidup adalah Sebuah Rencana untuk gagal)</font>. Salah satunya adalah membekali diri dengan pengetahuan tentang segala hal yang berhubungan dengan tempat yang digunakan beraktivitas, dan membekali diri dengan peralatan yang memadai, salah satunya adalah survival kits, disamping peralatan standar lainnya.<br>" +
                "<br>" +
                "Rencana yang dibuat harus selalu mengacu pada penghindaran dan pemulihan (Evasion and Recovery / E & R), dalam mempersiapkan perlu memperhitungkan ketersediaan suplai pendukung hidup dan peralatan untuk kondisi darurat (emergensi). Saat membuat rencana perjalanan sebaiknya :<br>" +
                "<ul><li><p align=\"justify\">Harus mempertimbangkan lamanya waktu perjalanan, memperhitungkan jarak yang akan ditempuh,</li>" +
                "<li><p align=\"justify\">Mempelajari kondisi medan yang akan dihadapi, seperti kontur, vegetasi hutan dan kondisi geoografis pada lokasi yang akan dihadapi,</li>" +
                "<li><p align=\"justify\">Mempelajari dan memperhatikan cuaca dan kebiasaan terjadinya perubahan cuaca yang sering terjadi dilokasi,</li>" +
                "<li><p align=\"justify\">Mempelajari tanaman dan binatang apa saja yang hidup dihabitat alam yang akan dijelajahi, sehingga minimal memiliki pengetahuan tentang binatang atau tanaman yang berbahaya ataupun yang dapat dimakan dilokasi yang akan digunakan untuk melakukan kegiatan,</li>" +
                "<li><p align=\"justify\">Mempelajari fasilitas di lokasi dan sistem pendukung yang ada dilokasi kegiatan, sebagai contoh saat melakukan pendakian, sebaiknya harus tahu pemimpin desa terakhir, Pos SAR setempat, Pos Penjaga Hutan, Pos Polisi, Rumah Sakit terdekat sehingga memliki gambaran yang lengkap tentang langkah apa yang akan kita lakukan, kemana kita akan melakukan, jika terjadi kecelakaan ataupun butuh pertolongan.</li>" +
                "<li><p align=\"justify\">Dan yang tidak kalah penting yang tidak boleh ditinggalkan adalah “survival Kits”.</li>" +
                "</ul>" +
                "<p align=\"justify\">Sebuah rencana tanpa persiapan hanya akan menjadi selembar kertas tanpa guna. Hal ini hanya akan mempersulit diri dalam melakukan kegiatan di Alam bebas, dan hanya akan mengakibatkan penyesalan dibelakang hari saat rencana yang dibuat hanyalah sebatas rencana, tanpa berusaha untuk mempersiapkannya, jika ternyata dalam pelaksanaan terjadi kondisi yang sudah diperkirakan pada saat membuat perencanaan tetapi tidak disiapkan, sampai pada akhirnya apa yang sudah ketahui terjadi, pada akhirnya justru akan merepotkan diri sendiri dan bahkan membahayakan jiwa. Sehingga selain perencanaan, mempersiapkan ketersediaan semua hal yang sudah direncanakan menjadi hal yang harus diprioritaskan saatnya melakukan kegiatan di alam bebas, hal-hal yang perlu dipersiapkan adalah :<br>" +
                "<ul><li><p align=\"justify\">Persiapkan diri dan pastikan kondisi fisik dan kesehatan prima (sehat, tidak sakit gigi, flu dll). (mendapatkan imunisasi jika diperlukan saat melakukan kegiatan ada potensi penyakit epidemi ataupun menular),</li>" +
                "<li><p align=\"justify\">Siapkan perlindungan diri seperti ; jaket, jas hujan, baju hangat, cadangan pakaian, pelindung kepala dan leher, kaos kaki, masker (in case jika terjebak di tempat yang memungkikan adanya gas ataupun gangguan pernafasan), sepatu yang sesuai dengan lokasi kegiatan sebaiknya kedap air, tas yang memenuhi standar sehingga membuat nyaman selama melakukan perjalanan.</li>" +
                "<li><p align=\"justify\">Persiapkan peralatan pendukung dalam melakukan perjalanan seperti :sleeping bag, tenda, Peta Lokasi, Kompas.</li>" +
                "<li><p align=\"justify\">Persiapkan perbekalan, dari makanan dan minuman yang harus dibawa yang sudah disesuaikan dengan rencana, kebutuhan kalori dan asupan yang dibutuhkan yang sesuai dengan lokasi saat melakukan kegiatan di alam bebas dilebihkan sebagai cadangan jika sesuatu hal yang tidak diinginkan terjadi.</li>" +
                "<li><p align=\"justify\">Persiapkan dan pelajari pengetahuan survival yang sesuai dengan lokasi dimana akan melakukan kegiatan (survival di Gunung/di Gurun/di Laut/di Daerah Tropis/di Daerah beriklim dingin) buat catatan-catatan penting dalam buku catatan perjalanan, sehingga seandainya tanpa terduga dihadapkan pada kondisi survival ditempat tersebut, memiliki beberapa catatan yang penting akan menghemat waktu yang dapat digunakan untuk melakukan perencanaan dalam kondisi survival (lihat penjelasan dari “STOP”).</li>" +
                "<li><p align=\"justify\">Yang tidak kalah penting yang harus dipersiapkan adalah peralatan survival kits termasuk obat-obatan dan peralatan P3K. (akan dijelaskan dalam sub bahasan tentang survival kits)....</li>" +
                "</ul><p align=\"justify\">Membuat detil perencanaan dan memasukan pertimbangan potensi survival yang mungkin bisa terjadi dalam perencanaan perjalanan dan mempersiapkan diri, akan meningkatkan peluang untuk bertahan hidup jika terjadi keadaan darurat. Misalnya, Jika dalam beraktivitas di alam bebas mengharuskan berkegiatan di sebuah tempat yang sempit atau didaerah tertutup yang membatasi apa yang dapat dibawa, sebaiknya harus membuat rencana dan meentukan di mana ransel atau peralatan beban dapat ditempatkan. Taruh di disuatu tempat yang tidak akan menghalangi jalan keluar dengan cepat, namun harus selalu diingat saat menaruh barang bawaan tersebut letakan di tempat yang mudah diakses." +
                "<br><p align=\"justify\">Menyiapkan dan membawa survival kit adalah sama pentingnya dengan pertimbangan yang disebutkan diatas. Semua pesawat terbang, kapal laut ataupun moda transportasi kebanyakan memiliki survival kit (minimal P3K) yang disesuaikan dengan jenis wilayah yang akan dilewati. Ada survival kits yang disesuaikan dengan kondisi dan lingkungan dimana akan melakukan perjalanan, seperti diatas laut, didaerah beriklim panas (tropis/khatulistiwa), di daerah beriklim dingin (sub tropis/berhawa dibawah 0 derajat C/daerah bersalju) dll. Selalu mengetahui dimana Survival Kit ditempatkan akan mampu menyelamatkan dari bahaya atau minimal mengurangi resiko yang membahayakan jiwa. Karena itu sebaiknya letakan survival kit ditempat yang mudah diakses atau mudah diambil dari tas kita, dan dapat pula ditempat melekat dengan badan kita (taruh di rompi, LBE, atau tas daypack). Semakin cepat dapat mengakses akan semakin cepat menolong jiwa, ketika sesuatu kejadian yang tidak terduga terjadi, yang kadang bisa terjadi dalam hitungan menit ataupun detik. <br>" +
                "<br>" +
                "<b>SURVIVAL KITS</b><br>" +
                "<br>" +
                "Survival Kits, dapat terdiri dalam berbagai ukuran, berisi perlengkapan dan alat-alat untuk memberikan survivor perlindungan dasar terhadap unsur-unsur bahaya disekitar dirinya, membantu dia untuk tetap bertahan hidup : tetap hangat, memenuhi kesehatan dasar dan kebutuhan P3K, menyediakan makanan dan air, sinyal untuk penyelamat, dan membantu dalam menemukan jalan kembali. Lingkungan tempat untuk melakukan kegiatan ataupun perjalanan adalah kunci untuk menentukan item apa saja yang akan butuhkan dalam survival kits. Berapa banyak peralatan yang akan dimasukkan ke dalam survival kits, tergantung juga pada bagaimana akan membawa survvival kits tersebut.<br>" +
                "<br>";
        String text1 =
                "<br>" +
                "<p align=\"justify\">Sebuah survival kit yang diletakan dekat dengan tubuh akan lebih kecil ukurannya dari pada survival kits yang ada dalam kotak atau tempat survival kit yang ada di tas ransel. Selalu membekali diri dan letakan beberapa survival kit dekat dengan tubuh, gunakan rompi ataupun tas khusus kecil yang selalu melekat dekat dengan tubuh dan juga diransel utama. Tempatkan barang-barang yang paling penting dekat dengan tubuh. Misalnya, peta dan kompas harus selalu berada di dekat dengan tubuh. Termasuk juga item dasar untuk mempertahankan hidup seperti pisau kecil, beberapa kit P3K. Taruh barang barang sesuai dengan pentingya barang tersebut, tempatkan barang-barang (survival kit) yang berukuran besar kedalam ransel, dengan catatan tempatkan di suatu tempat yang mudah dijangkau dalam ransel...<br>" +
                "<br>" +
                "Dalam mempersiapkan Survival Kits ini, agar mempertimbangkan <i>\"The Rule of Threes.\"</i> dalam survival, bahwa dalam kondisi survival orang akan dihadapkan pada keadaan, dimana hidup hanya dapat bertahan :<br>" +
                "<ul><li>3 menit tanpa udara</li><br>" +
                "<li>3 jam tanpa suhu tubuh yang sesuai dengan kemampuan tubuh bertahan </li><br>" +
                "<li>3 hari tanpa air</li><br>" +
                "<li>3 minggu tanpa makanan</li><br>" +
                "</ul><p align=\"justify\">Sehingga dalam mempersiapkan Survival Kits pilih item selain berdasarkan lokasi kegiatan juga harus memperhatikan <i>\"The Rule of Threes\"</i> tersebut, selain itu dalam mempersiapkan Survival Kits harus : bisa serba guna, kompak, ringan, tahan lama, dan yang paling penting fungsional. Item yang dibawa dalam melakukan perjalanan akan tidak baik jika ukurannya terlalu besar dan tidak didesain untuk kondisi survival. Penempatan Item survival kits harus saling melengkapi dari lapis per lapis. Sebuah cermin sinyal di saku dapat didukung oleh pena flare di LBE (Load Bearing Equipment = semacam rompi berbentuk sabuk yang biasa digunakan oleh militer) dan didukung panel sinyal dalam ransel. Sebuah pematik api (korek api) disaku rompi dapat dilengkapi dengan magnesium bar (batang magnesium) di LBE dan dry tinder (bahan pembuat api, biasanya kertas kering, kapas dll).<br>"+
                "<i><br>Untuk memaksimal kan penggunaan aplikasi Survival Manual e-Book pengguna aplikasi disarankan menggunakan powerbank bertenaga surya. Power bank memang akan sangat membantu untuk kita, terutama pada saat kita bepergian atau sedang berlibur, pada saat berlibur bagi yang tidak punya kamera pasti menggunakan handphone mereka untuk bisa mengambil gambar mereka atau mengambil pemandangan-pemandangan indah akan tetapi jika handphone itu digunakan secara terus-menerus maka akan mengakibatkan baterai pada handphone itu cepat habis sehingga para pengguna handphone membutuhkan charger untuk mengisi daya dari baterai handphone mereka dan pada saat berlibur jarang di temukan tempat-tempat untuk mengisi daya pada handphone dan disinilah fungsi dari power bank untuk membantu mengisi daya dari handphone atau smartphone tersebut. Selain itu masih banyak lagi fungsi dari power bank ini.</i>";
        String text0 =
                "<p align=\"justify\"><i>Dengan berkembangnya zaman kini sudah tercipta power bank dengan tenaga matahari yaitu power bank solar cell yang mana power bank ini tidak membutuhkan aliran listrik untuk mengisi daya dari power bank ini karena power bank ini hanya membutuhkan sinar matahari untuk mengisi daya dari power bank ini sehingga anda tidak perlu repot-repot untuk aliran listrik guna mengisi daya dari alat ini karena Anda hanya harus menjemurnya di matahari selama 6-7 jam maka power bank ini sudah terisi dengan penuh.</i>" +
                "<p align=\"justify\">Survival kits tidak perlu rumit, hanya perlu item yang fungsional yang akan memenuhi kebutuhan, jika terdapat 2 item yang memiliki fungsi sama pilih salah satu, lebih bagus lagi jika memiliki fungsi lebih dari satu. Untuk mengorganisasi semua item tersebut dibutuhkan kotak untuk menyimpan item-item survival kits tersebut, selain dengan membeli, dapat juga menggunakan : Kotak Perban, Kotak Sabun, Kaleng Tembakau, Kotak Amunisi, atau kotak-kotak yang lain, dimana kotak tersebut harus memenuhi persyaratan sebagi berikut :<br>" +
                "<ul><li>Anti/Tahan air (waterproof).</li><br>" +
                "<li>Mudah dibawa atau mudah ditaruh didekat tubuh Anda.</li><br>" +
                "<li>Cocok untuk menyimpan berbagai ukuran komponen.</li><br>" +
                "<li>Tahan lama.</li>" +
                "</ul>";
        String text2 =
                "<p align=\"center\">(Kotak Survival Kits)<br>" +
                " <br>" +
                "<p align=\"justify\">Survival kits harus dipilah-pilah berdasarkan katagori yang disesuaikan dengan <i>\"The Rules of Three\"</i>, sesuai dengan prioritas. Setiap kategori harus berisi item yang memungkinkan membantu untuk mempertahankan hidup dan memenuhi kebutuhan dasar, pembagian kategori ini dapat dibagi dalam :<br>" +
                "<ul><li><i>Survival Kits - Shelter (Tempat Perlindungan Darurat)</i></li><br>" +
                "<li><i>Survival Kits - Water Procurement (Pengadaan dan Penyimpanan Air)</i></li><br>" +
                "<li><i>Survival Kits - Food Procurement (Cadangan, Pengadaan & Pengawetan Makanan)</i></li><br>" +
                "<li><i>Survival Kits - Making Fire (Membuat Api)</i></li><br>" +
                "<li><i>Survival Kits - Medics (Kesehatan dan P3K)</i></li><br>" +
                "<li><i>Survival Kits - Signal (Sinyal)</i></li><br>" +
                "<li><i>Survival Kits - Miscellaneous (Lain-Lain)</i></li><br>" +
                "</ul>" +
                "<p align=\"justify\"><i><b>1. Survival Kits - Shelter (Tempat Perlindungan darurat)</b></i><br>" +
                "<br>" +
                "Survival kits yang dikategorikan dalam kategori ini, ada beberapa bahan yang direkomendasikan untuk tempat atau membuat perlindungan darurat, dan bisa digunakan disemua wilayah geografis. Pilihan yang sering dimasukkan dalam survival kits ini adalah :<br>" +
                "<ul><li><p align=\"justify\">Space Blanket atau Survival Blanket/Emergency Blanket/Emergency Thermal Blanket, yaitu selimut yang terbuat dari bahan polyster tipis yang dilapisi alumunium, selimut ini anti air dan dapat menahan panas tubuh, selain dapat digunakan sebagai penahan panas, karena dilapisi oleh lapisan alumunium, space blanket ini dapat berfungsi sebagai reflektor dan barang yang sangat mudah dilihat dari ketinggian ataupun dari jauh, sehingga memiliki fungsi sebagai signal survival kit,</li>" +
                "<li><p align=\"justify\">Poncho Ringan, berbahan tipis dan anti air, digunakan untuk perlindungan terhadap angin dan hujan,</li>" +
                "<li><p align=\"justify\">\"Tent tube\" atau “bivvy bag”, di Indoesia lebih dikenal dan yang sering digunakan adalah sleeping bag,</li>" +
                "<li><p align=\"justify\">Tarp (tarpaulin) with grommets (baik berbahan nilon atau polyster), adalah terpal atau tenda dengan lubang mata disekeliling, di Indonesia lebih dikenal digunakan untuk tenda resepsi ataupun tenda untuk pedagang kaki lima. fungsinya sebagai bahan untuk membuat bivak,</li>" +
                "<li><p align=\"justify\">Pelindung Kepala (Topi, full over/balaclava, kupluk),</li>" +
                "<li><p align=\"justify\">Tali,</li>" +
                "<li><p align=\"justify\">Kantong sampah plastik besar yang dapat difungsikan sebagai ponco atau perlindungan daurat jika tidak ada lagi peralatan menghindarkan tubuh dari air yang bisa digunakan,</li>" +
                "<li><p align=\"justify\">Kapak/Pisau Tebas/Parang, yang dapat digunakan untuk membela diri saat ada gangguan dari binatang buas atau suatu hal lainnya, dan dapat juga digunakan untuk memperoleh bahan membangun shelter darurat dari batang pohon, ranting dan daun-daunan (bivak Alam), (cara membuat bivak akan diulas pada tulisan tersendiri).</li>" +
                " </ul>";
        String text3 =
                "<p align=\"center\">(Emergency Blanket/Survival Blanket/Emergency Thermal Blanket)<br>" +
                "<br>" +
                "<p align=\"justify\">(Selimut ini pada mulanya adalah hasil teknologi yang dikembangkan oleh Nasa (USA) pada tahun 1960 untuk peralatan program luar angkasa sehingga lebih dikenal juga dengan nama \"Space Blanket\", namun dikarenakan manfaatnya yang luar biasa dalam menjaga kehangatan tubuh dalam kondisi udara yang sangat dingin, sangat ringan dan mudah dibawa serta murah, sehingga pada perkembangannya, sekarang ini menjadi salah satu survival kits yang wajib dibawa, baik oleh Pendaki Gunung, backpacker, petualang alam bebas, kayak sampai pemain ski es saat beraktivitas di alam bebas)<br>" +
                " <br>";
        String text4 ="<p align=\"center\">(Poncho)<br>" +
                " <br>";
        String text5 ="<p align=\"center\">(Tent Tube/Bivvy Bag)<br>" +
                " <br>";
        String text6 ="<p align=\"center\">(Tarp with Grommets) <br>" +
                " <br>";
        String text7 ="<p align=\"center\">(Pisau Tebas Machete)<br>" +
                "<p align=\"justify\">Yang sangat bermanfaat untuk mempertahankan diri dan membuat bivak alam.<br>" +
                "<br>" +
                "<br>" +
                "<b><i>2. Survival Kits - Water Procurement (Pengadaan & Penyimpanan Air)</i></b><br>" +
                "<br>" +
                "Dalam kondisi survival diwajibkan memiliki item-item survival Kits yang memungkinkan untuk, Mengambil Air, Menyimpan Air, Menyerap Air, atau Menyedot Air, atau sesuatu yang dapat digunakan untuk Mengumpulkan Air Hujan/Air hasil Kondensasi, atau yang dapat digunakan untuk Mengangkut Air, dan sesuatu yang dapat digunakan untuk Memurnikan Air. Beberapa contoh dari kategori ini adalah :" +
                "<ul><li>Tempat Air dalam wadah tertutup,</li>" +
                "<li><p align=\"justify\">Tempat wadah air ekstra, jika tidak ada bisa menggunakan kantong plastik, yang digunakan untuk menyimpan air yang didapat saat survival, sehingga memiliki persediaan air untuk menopang hidup (dair, sumber air, dari air hujan, atau saat melakukan kondensasi dll)</li>" +
                "<li><p align=\"justify\">Pemutih rumah tangga (di Indonesia atau di Jawa Tengah pada khususnya dikenal dengan istilah Tawas), digunakan saat di mana air tersedia tetapi mungkin sudah terkontaminasi,</li>" +
                "<li><p align=\"justify\">Heavy Duty Aluminium Foil, sebagai alat membuat tabung destilasi untuk menghilangkan garam dari air laut, selama perebusan / kondensasi,</li>" +
                "<li><p align=\"justify\">Harus memiliki wadah lain untuk mengumpulkan kondensasi,</li>" +
                "<li><p align=\"justify\">Tablet pemurnian air (tablet Iodine 9 mg),</li>" +
                "<li><p align=\"justify\">Povidone-Iodine tetes, antimikroba terhadap bakteri, jamur, protozoa, dan virus,</li>" +
                "<li><p align=\"justify\">Spons, plastik kecil atau pipa karet, untuk menyerap air.</li>" +
                "</ul><br>";
        String text8 =
                "<p align=\"center\">(Iodine Tablet dan providone-Iodine Cair)<br>";
        String text9 =
                "<p align=\"center\">(Kit yang multi fungsi)" +
                "<p align=\"justify\">Tempat menyimpan air, untuk merebus & untuk tungku kompor, dalam 1 paket<br>" +
                "<br>" +
                "<br><i><b>3. Survival Kits - Food procurement (Pengadaa dan Penyimpanan Makanan)</i></b><br>" +
                "<br>" +
                "Kebanyakan kit survival ini untuk jangka waktu yang singkat, yang akan digunakan dan mengalami keausan, kadang dibutuhkan imajinasi dan improvisasi dilapangan, saat dihadapkan pada kondisi survival yang membutuhkan waktu yang lama :<br>" +
                "<ul><li><p align=\"justify\">Makanan kaleng, buah-buahan kering, Kacang roasted dll, yang penting bisa menjadi makanan siap makan (Stok/cadangan makanan),</li>" +
                "<li><p align=\"justify\">Bisa juga makanan yang mengandung energi tinggi seperti cokelat, energy bar, atau makanan batangan darurat lainnya,</li>" +
                "<li><p align=\"justify\">Kaldu kotak,</li>" +
                "<li><p align=\"justify\">Pisau lipat (pisau kompak, multifungsi seperti pisau Swiss Army),</li>" +
                "<li><p align=\"justify\">Alumunium foil, untuk menjaga agar makanan lebih agak awet,</li>" +
                "<li><p align=\"justify\">alat pancing, mata kail dan senar, dapat digunakan jika kondisi survival terjadi didaerah yang terdapat sumber makanannya berupa ikan, baik di laut, sungai, danau atau parit, dalam kondisi darurat jarum atau peniti dapat dibentuk dan difungsikan sebagai kail,</li>" +
                "<li><p align=\"justify\">Kawat Snare, bisa digunakan untuk menjerat ataupun untuk menjebak binatang memanfaatkan kondisi sekitar,</li>" +
                "<li><p align=\"justify\">Gill Netting (Jaring ikan sederhana), digunakan untuk memperangkap dan menangkap ikan dalam kondisi darurat,</li>" +
                "<li><p align=\"justify\">Kompor Gas Tabung Portable,</li>" +
                "<li>Paraffin wax,</li><br>" +
                "<li>Wadah Makanan,</li>" +
                "<li><p align=\"justify\">Alat Masak (wajan kecil/portable dan panci yang merupakan bagian dari tempat minum/peples).</li>" +
                "</ul>";
        String text10 =
                "<p align=\"center\">(Makanan Siap Makan)<br>" +
                " <br>";
        String text11 =
                "<p align=\"center\">(Peralatan memancing dalam satu tempat kompak, didalam kalung) <br>" +
                " <br>" +
                "<p align=\"justify\"><b><i>4. Survival Kits – Making Fire (Membuat Api)</b></i>" +
                "Survival kits yang masuk dalam kategori ini, adalah barang yang dapat digunakan untuk membuat api yang manfaatnya dapat digunakan untuk memasak ataupun menghangatkan badan, yang masuk dalam kategori ini adalah :<br>" +
                "<ul><li><p align=\"justify\">Batu korek (Ferrocerium/ferro rod),</li>" +
                "<li><p align=\"justify\">Korek Api Kayu yang disimpan ditempat yang kedap air (container film foto dll), Korek gas (lebih disarankan korek api yang tahan angin atau dingin seperti korek zippo),</li>" +
                "<li><p align=\"justify\">Pematik api bersumber dari sinar matahari (Solar Spark Lighter), berfungsi sebagai sumber pembuat api,</li>" +
                "<li><p align=\"justify\">Kapas atau pembalut (sebaiknya disimpan dalam kontainer yang kedap air, bungkus film, atau disimpan kantong plastik kedap air, atau dapat dibuat secara sederhana dari sedotan besar yang kedua ujungnya disegel). Berfungsi sebagai bahan untuk menyalakan api,</li>" +
                "<li><p align=\"justify\">Fuel Petroleum Jelly (bahan bakar berbentuk jelly),</li>" +
                "<li><p align=\"justify\">Magnesium Bar (batang Magesium),</li>" +
                "<li><p align=\"justify\">Lensa Pembesar,</li>" +
                "<li><p align=\"justify\">Lilin, untuk penerang dikala malam.</li>" +
                "</ul> <br>" +
                "<b><p align=\"justify\">5. Survival Kits - Medics  (Obat-Obatan, Kesehatan dan P3K)</b><br>" +
                "<br>" +
                "Survival kits yang masuk dalam kategori P3K ini, banyak item yang bisa direkomendasikan, bahkan biasanya dalam kondisi darurat penggunaaan survival kit ini sering terdiri dari kombinasi dari beberapa survival kit P3K ini, item yang masuk dalam kategori ini adalah : <br>" +
                "<ul><li><p align=\"justify\">Perbanan, Adhesive perban dan atau Perban kassa steril</li>" +
                "<li><p align=\"justify\">Adhesive tape, dan tape kasa, Bantalan Desinfektan,</li>" +
                "<li><p align=\"justify\">Obat pribadi</li>" +
                "<li><p align=\"justify\">Krim antibiotik,</li>" +
                "<li><p align=\"justify\">Epinefrin dan antihistamin untuk reaksi alergi, terutama terhadap sengatan serangga,</li>" +
                "<li><p align=\"justify\">Alkohol Gosok atau alkohol disinfektan,</li>" +
                "<li><p align=\"justify\">Cream untuk anti luka bakar,</li>" +
                "<li><p align=\"justify\">Jahitan Kit atau Stapler Bedah Steril sekali pakai,</li>" +
                "<li><p align=\"justify\">Tablet Oxytetracycline ( untuk diare atau infeksi ),</li>" +
                "<li><p align=\"justify\">Aspirin,</li>" +
                "<li><p align=\"justify\">Obat Anti Malaria ( doxycycline),</li>" +
                "<li><p align=\"justify\">Obat Anti Jamur , anti - inflamasi ( ibuprofen ),</li>" +
                "<li><p align=\"justify\">Kacamata Cadangan untuk yang memiliki kekurangan dalam penglihatan (plus atau minus),</li>" +
                "<li><p align=\"justify\">Garam adalah mineral penting bagi kesehatan. Garam yang mengandung kalium klorida, dijual secara luas garam natrium rendah, dapat digunakan untuk mencegah dehidrasi akibat diare dan dapat mengurangi resiko kematian karena kolera,</li>" +
                "<li><p align=\"justify\">Multivitamin dan suplemen mineral. Suplemen Zinc berguna untuk mengobati infeksi saluran usus karena diare, terutama pada anak-anak,</li>" +
                "<li><p align=\"justify\">Sunscreen (jika perlu , di atas 30 SPF ),</li>" +
                "<li><p align=\"justify\">100 % UV kacamata pelindung (\" UV 400 \") ( melindungi mata dari radiasi UV yang berbahaya, Kacamata Polarized tidak selalu pelindung UV, tetapi membantu meredam silau dan dapat digunakan saat kabut),</li>" +
                "<li>Sabun.</li><br>" +
                " </ul>" +
                "<p align=\"justify\"><b><i>6. Survival Kits – Signal  (Sinyal)</i></b><br>" +
                "<br>" +
                "Dalam kondisi survival dituntut untuk memiliki dan mampu menggunakan peralatan signal yang memberitahu kepada tim pencari, memiliki pengetahuan dan peralatan membuat sinyal akan menambah kesempatan untuk ditemukan oleh tim pencari, ada beberapa survival kits yang dikategorikan dalam kategori sinyal :<br>" +
                "<ul><li>Cermin Sinyal,</li><br>" +
                "<li>Pen Flare,</li><br>" +
                "<li>Bendera,</li><br>" +
                "<li>Scarft (Warna Menyolok, Merah, Orange dll),</li><br>" +
                "<li>Kain Sutera,</li><br>" +
                "<li>Laser Point,</li><br>" +
                "<li>Flash light (senter),</li>" +
                "<li><p align=\"justify\">Space Blanked (Selimut tipis dari Polyster yang dilapisi lapisan Alumunium),</li>" +
                "<li>Sinyal Asap,</li><br>" +
                "<li>Pluit</li><br>" +
                "</ul>" +
                "<p align=\"justify\"><i><b>7. Survival Kits – Miscellaneous (Lain-Lain)</i></b><br>" +
                "<br>" +
                "Selain beberapa survival kits yang disebut sebelumnya disarankan juga memiliki survival kits lain-lain, yang dapat mendukung survival kits yang lain pada saat dihadapkan pada kondisi survival :<br>" +
                "<ul><li><p align=\"justify\">Kompas kecil (biasanya dapat dipasang di pergelangan tangan),</li>" +
                "<li>Jarum dan Benang,</li><br>" +
                "<li>Gabus,</li><br>" +
                "<li>Pengasah (Asahan) kompak,</li>" +
                "<li><p align=\"justify\">Manual Survival (atau catatan tentang survival).</li>" +
                "</ul>" +
                "<p align=\"justify\">Mungkin berdasarkan dari pengalaman beberapa orang, ada perbedaan dalam memilih survival Kits antara satu orang dengan yang lainnya, namun paling tidak dengan memiliki pengetahuan tentang survival kits standar dan yang terpenting adalah harus bisa memahami fungsi masing-masing survival kits yang dibawa, syukur-syukur memiliki imajinasi dan improvisasi yang bisa memadukan semua survival kits sehingga memiliki atau berubah menjadi multi fungsi. Kreativitas adalah salah satu kunci yang akan membantu melewati kondisi survival, selain kemauan untuk hidup, kekuatan jiwa, pikiran dan batin saat menghadapi kondisi survival...." +
                "<br>" +
                "<p align=\"left\">Merbabu,Semarang, Jakarta,September 1988,<br>" +
                "Agustus 1992,<br>" +
                "05 Oktober 2002....<br>" +
                "<p align=\"justify\">Catatan :<br>" +
                "Dalam dunia militer ada standar Survival Kits yang harus dibawa oleh seorang prajurit dalam tugas dimedan pertempuran yang ditempatkan, didalam LBE, Rompi dan Ransel Mereka, Survival Kits ini disesuaikan dengan daerah dimana mereka akan berada. Namun secara umum Survival Kits standar yang mereka bawa adalah sebagai berikut :<br>" +
                "<ul><li>Paket makanan, siap makan,</li><br>" +
                "<li>Kawat Snare,</li><br>" +
                "<li>Sinyal Asap, Sinyal Cahaya,</li>" +
                "<li><p align=\"justify\">Korek Api didalam Kotak Tahan Air, atau Korek Api Gas,</li>" +
                "<li>Gergaji Kecil/Pisau Tebas (Parang),</li><br>" +
                "<li>First Aid Kit - P3K,</li><br>" +
                "<li>MC-1 (magnetic Compass-1), Kompas Magnetik standar,</li><br>" +
                "<li>Pisau Saku multi fungsi,</li>" +
                "<li><p align=\"justify\">Compact Canteen (peples), terdiri dari tungku parafin, tempat air minum dan tempat memasak (merebus),</li>" +
                "<li>Sekop portable (sekop lipat),</li><br>" +
                "<li>Wajan/Panci kompak (ringkas),</li><br>" +
                "<li>Lilin,</li>" +
                "<li><p align=\"justify\">Bahan Bakar Padat (Compressed trioxane) atau lebih dikenal dengan istilah Parafin,</li>" +
                "<li>Cermin Sinyal,</li><br>" +
                "<li>Peralatan Mancing (untuk survival),</li><br>" +
                "<li>Sendok plastic,</li><br>" +
                "<li>Poncho,</li>" +
                "<li><p align=\"justify\">Jaring/Kelambu Kepala (untuk menghindari gangguan serangga),</li>" +
                "<li>Tali,</li><br>" +
                "<li>Matras (kasus luar),</li><br>" +
                "<li>Tempat Air Minum,</li>" +
                "<li><p align=\"justify\">Kantung Plastik Air (kantung ukuran kecil dapat digunakan sebagai tempat menyimpan cadangan air saat survival, yang berukuran besar dapat digunakan sebagai pengganti ponco),</li>" +
                "<li>Pluit,</li><br>" +
                "<li>Cream pelindung Sinar Matahari,</li><br>" +
                "<li>Sleeping Bag,</li><br>" +
                "<li>Buku Panduan Survival</li><br>" +
                "<li>Check List Barang Bawaan.</li><br>" +
                "</ul>" +
                "<p align=\"justify\">" +
                "<i><b>Tips Ekstrim :</i></b><br>" +
                "Banyak orang yag mungkin tidak begitu memperhatikan, bahwa kondom dan tampon (pembalut wanita) bisa digunakan sebagai salah satu peralatan untuk survival (survival kits), kondom non pelumas (tidak berpelumas) dapat digunakan untuk menyimpan cadangan air yang dikumpulkan dari alam (dari hujan, sumber air, kondensasi dll), dalam kondisi darurat kondom dapat digunakan untuk pengganti kotak penyimpan survival kits kedap air yang bukan berbentuk tajam ataupun dari bahan kimia, untuk bahan bakar membuat api (tinder), menjadi tali elastis untuk mengikat alat/senjata survival dalam memperoleh makanan (tombak, kapak, atau pisau darurat),<br>" +
                "<br>" +
                "Tampon dapat digunakan untuk Survival Kits, Pengetahuan atau boleh dibilang penemuan ini, pertama kali diperkenalkan dan digunakan langsung oleh Creek Stewart, seorang profesional dan ahli pelatihan survival, Tampon oleh dia dimasukan dalam daftar survival kits (dia mempraktekan salah satu aspek dari survival = improvised) dimana di dalam pelatihan yang dia lakukan, ditemukan bahwa tampon (selain berfungsi sebagai pembalut wanita) juga memiliki multi fungsi yang sebelumnya tidak terpikirkan oleh orang lain, dia mendapatkan beberapa fungsi tampon yang bisa dimanfaatkan dalam survival seperti ; (1). sebagai pengganti kapas untuk menutup luka, (2). bungkusnya tampon bisa digunakan sebagai tempat yang kedap air untuk menyimpan korek api, (3). Sebagai komponen filter bagi penyaring air, (4). bandul dalam peralatan mancing untuk survival, (5). bahan pembuat api (tinder), (6). untuk menyerap air, (7). sebagai sumbu lilin cair, (8). tali pada tuas perangkap binatang, (9). sebagai bagian dari sumpit (bagian belakang sehingga berfungsi penyeimbang dan sebagai pemapat dalam tabung sumpit sehingga memiliki tekanan yang melontarkan anak senjata sumpit tersebut).<br>" +
                "<br>" +
                "<i>Ditulis Oleh Tri Santiaji<br> SURVIVAL : PENTINGNYA PERENCANAAN-PERSIAPAN DAN SURVIVAL KITS </i> " +
                "<br>";
        String foto1 = "<p align=\"center\"><img src=\"perencanaan/perencanaan1.png\"></p>";
        String foto2 = "<p align=\"center\"><img src=\"perencanaan/perencanaan2.png\"></p>";
        String foto3 = "<p align=\"center\"><img src=\"perencanaan/perencenaan4.png\"></p>";
        String foto4 = "<p align=\"center\"><img src=\"perencanaan/perencanaan5.png\"></p>";
        String foto5 = "<p align=\"center\"><img src=\"perencanaan/perencanaan6.png\"></p>";
        String foto6 = "<p align=\"center\"><img src=\"perencanaan/perencanaan7.png\"></p>";
        String foto7 = "<p align=\"center\"><img src=\"perencanaan/perencanaan8.png\"></p>";
        String foto8 = "<p align=\"center\"><img src=\"perencanaan/perencanaan10.png\"></p>";
        String foto9 = "<p align=\"center\"><img src=\"perencanaan/perencanaan11.png\"></p>";
        String foto10 = "<p align=\"center\"><img src=\"perencanaan/perencanaan12.png\"></p>";
        String foto11 = "<p align=\"center\"><img src=\"perencanaan/perencanaan13.png\"></p>";
        String foto0 = "<p align=\"center\"><img src=\"perencanaan/perencanaan0.png\"></p>";
        view.loadDataWithBaseURL("file:///android_asset/", text + foto1 + text1 + foto0 +text0 + foto2 + text2 + foto3 + text3 + foto4 + text4 + foto5 + text5 + foto6 + text6 + foto7 + text7 + foto8 + text8 + foto9 + text9 + foto10 + text10 + foto11 + text11 + "</p>", "text/html", "utf-8", null);
        return rootView;
    }

}
