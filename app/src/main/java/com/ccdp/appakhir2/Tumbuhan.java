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
public class Tumbuhan extends Fragment {


    public Tumbuhan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tumbuhan,
                container, false);
        WebView view = (WebView) rootView.findViewById(R.id.tumbuhan1);
        String text = "<p align=\"justify\">Aktivitas di alam terbuka sering memunculkan situasi darurat. Tersesat, terhadang cuaca buruk, atau kehabisan bekal. Jangan panik, tumbuhan liar hutan menyediakan aneka daun, buah, umbi, batang yang bisa dimakan, asalkan kita mengenal ciri-cirinya. Pengetahuan survival wajib dikuasai oleh para petualang untuk menghadapi situasi darurat lantaran kehilangan orientasi atau kehabisan bekal.<br>" +
                "<br>" +
                "Menurut para ahli, 10% dari keseluruhan jenis tumbuhan berbunga di dunia ada di Indonesia, Artinya kita memiliki kurang lebih 25.000 jenis tumbuhan berbunga. Jika ditambah dengan tumbuhan tak berbunga dan jamur, maka jumlahnya akan berlipat-lipat. Dari keseluruhan jenis tumbuhan itu ada yang beracun, ada yang bisa dimakan, dan ada yang disarankan untuk dimakan.<br>" +
                "<br>" +
                "<b>Tak beracun = dimakan satwa</b><br>" +
                "<br>" +
                "Untuk mengetahui apakah suatu jenis tumbuhan di hutan aman atau tidak untuk dimakan, ada<br>" +
                "beberapa kunci yang bisa dijadikan pegangan. Tumbuhan yang daun, bunga, buah, atau umbinya biasa dimakan oleh satwa liar, adalah tumbuhan yang tidak beracun. Jadi kita bisa mengkonsumsinya. Sementara, tumbuhan yang berbau tidak sedap dan bisa membuat pusing, serta tidak disentuh oleh binatang liar, sebaiknya jangan disentuh. Juga tumbuhan bergetah yang membikin kulit gatal, dianjurkan untuk dihindari.<br>" +
                "<br>" +
                "Tumbuhan lain yang perlu disingkirkan adalah tanaman yang daunnya bergetah pekat, berwarna mencolok, berbulu, atau permukaannya kasar. Tanaman dengan daun yang keras atau liat juga jangan dikonsumsi. Jika mendapatkan tumbuhan kemaduh (Laportea stimulans) waspadalah lantaran bulu pada daunnya membuat kulit gatal dan panas.<br>" +
                "<br>" +
                "Sementara itu beberapa jenis tumbuhan yang mungkin ditemui di hutan dan dapat dimakan meliputi beragam jenis. Di antaranya keluarga palem-paleman, misalnya kelapa, kelapa sawit, sagu, nipah, aren, dan siwalan. Bukan hanya bagian umbutnya (bagian ujung batang muda dan berwarna putih) yang bisa dimakan, tapi juga buahnya (seperti kelapa dan siwalan).<br>" +
                "Jenis jambu-jambuan yang masuk dalam keluarga Myrtaceae juga banyak dijumpai di hutan. Ciri-ciri Myrtaceae adalah daunnya berbau agak manis jika diremas. Bunganya memiliki banyak sekali benang sari dengan buah yang enak dimakan.<br>" +
                "<br>" +
                "Tumbuhan semak dari keluarga begonia juga bisa jadi penyelamat dalam keadaan darurat. Daun begonia umumnya berbentuk jantung tidak simetris. Beberapa jenis dijadikan tanaman hias. Bila tangkai daunnya yang masih muda dikupas dan dimakan, rasanya masam dan sedikit pahit.<br>" +
                "Beberapa jenis keladi umbinya bisa dimakan, meski pada jenis lain umbinya menyebabkan gatal di mulut dan bibir. Untuk itu dianjurkan untuk tidak sembarangan melahap keladi hutan. Sebaiknya dicoba dulu dalam jumlah kecil. Hindari makan iles-iles (Amorphophallus sp.)<br>" +
                "<br>" +
                "Tumbuhan merambat dan melilit di pohon lain, bisa dimakan jika lilitan batang ke arah kanan (searah dengan jarum jam). Di antaranya gembili (Dioscorea aculeata), gembolo (Dioscorea bulbifera), ubi rambat. Tapi bila arah lilitannya ke kiri (berlawanan arah jarum jam) dan batangnya berduri, harus ekstrahati-hati. Jenis yang kedua ini misalnya gadung (Dioscorea hispida), yang beracun, walau tetap dapat dimakan setelah melalui proses pengolahan khusus.<br>" +
                "<br>" +
                "Sementara keluarga rumput-rumputan seperti tebu dan beberapa jenis bambu, rebungnya enak dimakan. Demikian pula pisang hutan bisa langsung dikonsumsi.<br>" +
                "<br>" +
                "Di tempat yang lembap dan tinggi, jenis paku-pakuan tunas dan daun mudanya enak dimakan. Tumbuhan lain yang buahnya juga bisa dimakan misalnya markisa (Passiflora sp.). Markisa ini adalah tumbuhan merambat dengan bunga khas. Beberapa anggota keluarga sirsak (Annonaceae), misalnya Annona muricata, daging buahnya segar. Buah lainnya semisal senggani (Melastoma sp.), arbei hutan (Rubus), dan anggur hutan<br>" +
                "<br>" +
                "<b>Hindari warna mencolok</b><br>" +
                "<br>" +
                "Secara singkat jika kita ingin tahu tumbuhan yang bisa dimakan maka perhatikan sekilas warna, dan batangnya. Yang jelas warnanya hijau, dan batangnya gembur/mengandung air. Jika kamu bertemu dengan monyet atau kera sedang memakan buah/tumbuhan, maka buah tersebut layak konsumsi.<br>" +
                "Dan tumbuhan yang harus kamu hindari/jangan dimakan spesifikasinya seperti ini:<br>" +
                "– Tumbuhan berbulu<br>" +
                "– Tumbuhan gatal<br>" +
                "– Bau menyengat<br>" +
                "– Bergetah<br>" +
                "– Buahnya pahit dan berlendir<br>" +
                "– Jangan makan tumbuhan yang buahnya berwarna ungu<br>" +
                "Beberapa tumbuhan bisa dimakan mentah atau sebagai snack, namun beberapa lagi lebih nikmat jika dimasak (rebus atau tumis). *catatan: lebih nikmat dan aman jika dimasak dengan air campur garam.<br>" +
                "<br><b>Cantigi</b><br>" +
                "Cantigi banyak tumbuh di puncak-puncak gunung. Daunnya yang pucuk (muda) bisa dimakan meskipun rasanya agak masam dan sepet.<br>" +
                " <br>";

        String text1 = "<p align=\"justify\"><b>Semanggi</b><br>" +
                "Daun semanggi atau clover yang biasa ditemukan di kaki gunung juga bisa dimakan. Daun Semanggi teksturnya tipis dan kecil dan biasa ditemukan di dataran tidak terlalu tinggi.<br>" +
                " <br>";
        String text2 ="<p align=\"justify\"><b>Pohpohan</b><br>" +
                "Pohpohan termasuk tumbuhan terna dengan tinggi mencapai 5 meter. Daunnya lunak berbau harum dan biasa digunakan sebagai obat sakit perut. Selain itu, daun Pohpohan merupakan salah satu menu untuk lalapan dan tentunya bisa dimakan.<br>" +
                " <br>" ;
        String text3 = "<p align=\"justify\"><b>Buah lo</b><br>" +
                "Buah lo adalah buah yang biasa dimakan rusa. Buah ini biasa ditemukan di hutan. Buah lo bisa dimakan mentah maupun matang. Rasanya agak masam jika dimakan mentah, namun manis jika sudah dimasak/rebus<br>" +
                " <br>";
        String text4 =
                "<p align=\"justify\"><b>Selaginella</b><br>" +
                "Selaginella memiliki tekstur daun seperti paku-paku. Oleh karena itu tumbuhan ini dikelompokkan dalam kategori tumbuhan paku-pakuan. Daun Selaginella berwarna hijau, ada pula yang merah dan kebiru-biruan. yang warna hijau bisa dimakan yakni dengan merebusnya dahulu akan lebih baik.<br>" +
                " <br>";
        String text5 =
                "<p align=\"justify\"><b>Ilalang</b><br>" +
                "Ilalang atau sejenis rumput ini sangat sering dijumpai di gunung. Sering kali kita melihat ada orang mengemut batang ilalang, dan sepertinya itu keren. Namun banyak yang tidak tau, memang ilalang itu bisa dimakan. Supaya lebih banyak kandungannya maka makanlah akarnya<br>" +
                " <br>";
        String text6 =
                "<p align=\"justify\"><b>Lamb’s Quarter</b><br>" +
                "Ini adalah tanaman yang tampak berdebu dari kejauhan karena lapisan putih pada daunnya.<br>" +
                "Hal ini biasa terjadi di dekat sungai, sungai, dan kebun dengan ketinggian rata-rata 1 meter.<br>" +
                "Ingatlah bahwa daun, tunas, biji dan bunga tanaman ini dapat dimakan. Namun, karena komponen yang berpotensi beracun, akan lebih baik jika dikonsumsi dalam jumlah kecil, terutama jika dikonsumsi secara mentah. Namun tumbuhan ini buahnya bisa dimakan dan daunnya bisa dimasak (seperti bayam)<br>" +
                " <br>";
        String text7 =
                "<p align=\"justify\"><b>Rotan</b><br>" +
                "Rotan banyak ditemukan di hutan Kalimantan. Tumbuhan ini bisa dimakan juga, namun harus melalui proses pembersihan yang cukup lama yakni dibersihkan duri-duri batangnya dengan dibakar. Kemudian keluarkan isi batangnya, isinya tersebut yang dimakan. Buah rotan juga bisa dimakan, hanya saja rasanya tentu tidak enak.<br>" +
                " <br>";
        String text8 =
                "<p align=\"justify\"><b>Kincung</b><br>" +
                "Tumbuhan ini memiliki bunga berwarna merah muda, batangnya panjang dan daun lebar. Tumbuhan kincung biasa dimasak sebagai menu lalapan sama ikan bakar.<br>" +
                " <br>";
        String text9 =
                "<p align=\"justify\"><b>Stevia Rebaudiana</b><br>" +
                "Para spesies Stevia rebaudiana, umumnya dikenal sebagai daun manis atau hanya 'stevia, banyak ditanam untuk daun manis. Sebagai pemanis dan gula pengganti, rasa stevia memiliki onset lambat dan durasi yang lebih lama daripada gula <br>" +
                " <br>";
        String text10 =
                "<p align=\"justify\"><b>Cattails</b><br>" +
                "Dengan mudah dikenali oleh kepala berbentuk coklat dan berbentuk cerutu, Anda bisa menemukan cattail di area basah terbuka dan juga rawa dan parit. Sebagian besar cattail bisa dimakan. Anda bisa makan batang muda mentah, bersama dengan batang bawah tanaman setelah lumpur dicuci. Daunnya lebih enak direbus.<br>" +
                "<br>";
        String text11 =
                "<p align=\"justify\"><b>Selada air</b><br>" +
                "Selada air hidup di pinggiran air/sungai. Bentuk daunnya kecil-kecil. Bimakan mentah atau dijadikan lalapan<br>" +
                " <br>";
        String text12 =
                "<p align=\"justify\"><b>Begonia</b><br>" +
                "Tumbuhan ini banyak terdapat di hutan hujan tropis (hutan yang lebat sering hujan). Batangnya bisa dimakan, dibersihkan dahulu.<br>" +
                " <br>";
        String text13 =
                "<p align=\"justify\"><b>Padi liar</b><br>" +
                "Padi liar tumbuh di dekar sungai. Teksturnya seperti tanaman padi pada umumnya hanya saja tidak lebat.<br>" +
                " <br>";
        String text14 =
                "<p align=\"justify\"><b>Daun Mete (Jambu Monyet)</b><br>" +
                "Pucuk daun mete bisa dikonsumsi. Selain itu, daun yang tua dimanfaatkan sebagai obat penyakit kulit, untuk mengatasi ruam-ruam pada kulit. Semua bagian pohonnya juga dapat dimanfaatkan dalam ramuan obat tradisional, terutama untuk menyembuhkan sakit kulit; untuk pembersih mulut; dan untuk obat pencahar<br>" +
                " <br>";
        String text15 =
                "<p align=\"justify\"><b>Bunga Turi</b><br>" +
                "Turi merupakan pohon yang berkayu lunak dan berumur pendek. Tingginya dapat mencapai 5-12 m. Akarnya berbintil-bintil dan berguna untuk menyuburkan tanah.Bunganya besar dan keluar dari rantingnya. Bunganya apabila mekar, berbentuk seperti kupu-kupu.Warna bunganya ada yang merah dan ada juga yang putih<br>" +
                "<br>"+
                "Bisa diuleg sebagai lalapan atau campuran sambal, selain itu, tumbuhan ini bisa digunakan untuk mengobati luka memar dan bengkak – bengkak.<br>" +
                " <br>";
        String text16 =
                "<p align=\"justify\"><b>Kaliandra</b><br>" +
                "Tumbuhan ini juga bisa dimakan. Bentuknya seperti tumbuhan rumput atau mirip tumbuhan putri malu. Tumbuhan ini biasa dimakan hewan seperti sapi, dan kambing<br>" +
                " <br>";
        String text17 =
                "<p align=\"justify\"><b>Dandelions</b><br>" +
                "Taraxacum, atau yang lebih sering disebut \"Dandelion\", sebenarnya sangat dapat dimakan.<br>" +
                "Ini berarti bahwa bunga, daun, dan bahkan akarnya, aman dikonsumsi. Daun Dandelion umumnya panjangnya 5-25cm atau lebih dan kepala bunga mereka berwarna kuning sampai oranye yang terbuka pada siang hari, namun ditutup pada malam hari. <br>" +
                "<br>";
        String text18 =
                "<p align=\"justify\"><b>Bulrush</b><br>" +
                "Tumbuhan ini termasuk dalam jenis ilalang yang tumbuh di rawa. Batang, biji dan daunnya bisa dimakan/dimasak<br>" +
                " <br>";
        String text19 =
                "<p align=\"justify\"><b>Leeks</b><br>" +
                "Tumbuhan ini bisa dibilang sebagai bawang liar. yang nampak hanya daunnya yang lebar. Tumbuhan ini bisa dimakan daun, dan umbinya<br>" +
                " <br>";
        String text20 =
                "<p align=\"justify\"><b>Spring Beauty</b><br>" +
                "Tumbuhan ini adalah tumbuhan berbunga indah dan berkelompok. Meskipun terlihat seperti hanya bunga saja, namun akarnya berumbi. Umbinya bisa dimakan/dimasak<br>" +
                " <br>";
        String text21 =
                "<p align=\"justify\"><b>Daun Sendok</b><br>" +
                "Tumbuhan ini daunnya berbentuk bulat dan lebar. Tumbuhan ini  bisa digunakan sebagai obat, daun sendok dapat digunakan sebagai anti radang, melancarkan air kemih, peluruh dahak, menghentikan batuk, memperbaiki penglihatan dan menormalkan aktivitas hati yang berlebihan. Selain itu daun nya juga dapat dimasak.<br>" +
                " <br>";
        String text22 =
                "<p align=\"justify\"><b>Lumut hati</b><br>" +
                "Lumut ini memiliki daun berbentuk seperti hati dan umumnya tumbuh di dataran tinggi yang basah. Daunnya bisa dikonsumsi sebagai obat demam<br>" +
                " <br>";
        String text23 =
                "<p align=\"justify\"><b>Nangsi</b><br>" +
                "Tumbuhan nangsi biasa hidup di hujan hujan tropis. Buahnya kecil-kecil dan daun lebar. Daun Nangsi bisa dimakan dan buahnya bisa dimakan pula<br>" +
                " <br>";
        String text24 =
                "<p align=\"justify\"><b>Murbei</b><br>" +
                "Tumbuhan tumbuh cukup cepat pada saat masih muda, namun kemudian tumbuh lambat dan tingginya jarang melebihi 10–15 m. Daun bebesaran merupakan daun sederhana berbentuk cuping dan menggergaji di bagian tepi. Buah murbei merupakan buah majemuk dengan panjang 2–3 cm, berwarna merah bila masih mudah dan ungu tua bila ranum, dan dapat dimakan.  <br>" +
                "<br>";
        String text25 =
                        "<p align=\"justify\"><b>Jamur</b><br>" +
                "Jamur adalah tumbuhan yang hidup dari kehidupan tumbuhan lain. Tumbuhan ini menjadi menu yang nikmat jika dimasak. Namun hati-hati karena beberapa jenis jamur juga beracun. Karakteristik jamur yang bisa dimakan adalah warnanya putih dan bersih. Jenis-jenis jamur yang bisa dikonsumsi yakni:<br>" +
                "jamur tiram, jamur kancing, jamur merang, jamur kuping. Sedangkan jamur yang berbentuk seperti payung dan rapuh adalah yang beracun, jenisnya yakni: jamur galerina, destroying angel, Amanita (merah), laktarius (biru)<br>" +
                " <br>";
        String text26 =
                "<p align=\"justify\"><b>Common Chickweed</b><br>" +
                "Tanamannya, dikenal secara ilmiah sebagai “Stellaria Media\", bisa dijadikan obat herbal pendinginan dan makanan yang aman dan bergizi.<br>" +
                "<br>" +
                "Chickweeds dapat diidentifikasi dengan bulu halus yang hanya terletak di satu sisi batangnya dalam satu band dan bulu halus pada sepalnya.<br>" +
                " <br>";
        String text27 =
                "<p align=\"justify\"><b>Burdock</b><br>" +
                "Bunganya seperti buah rambutan. Biasanya tumbuhan ini hidup di lapangan terbuka. Tangkai daunnya bisa dikupas dahulu lalu dimakan mentah<br>" +
                " <br>";
        String text28 =
                "<p align=\"justify\"><b>Buah kesemek</b><br>" +
                "Kesemek yang matang berwarna antara jingga kekuningan sampai kemerahan dan berdiameter antara 2-8 cm. Buah ini dapat dimakan langsung dalam keadaan segar setelah diolesi dengan air kapur dan diperam, agar rasa sepatnya hilang. Buah ini bisa tumbuh dihutan dataran rendah. Buahnya bisa dimakan, bijinya dipanggang bisa untuk kopi<br>" +
                " <br>";
        String text29 =
                "<p align=\"justify\"><b>Arrowhead</b><br>" +
                "Tumbuhan ini hidup di dekat air atau rawa. Daunnya berbentuk seperti panah atau hati. Umbinya bisa dimakan<br>" +
                " <br>";
        String text30 =
                "<p align=\"justify\"><b>Wild Onion</b><br>" +
                "Tumbuhan ini juga sering hidup di hutan. Bentuknya persis seperti rumput biasa. Daunnya bisa dimasak<br>" +
                " <br>";
        String text31 =
                "<p align=\"justify\"><b>Buah ciplukan/cecendet</b><br>" +
                "Umumnya tumbuh liar, ceplukan biasa didapati bercampur dengan herba dan semak lainnya di kebun, tegalan, sawah yang mengering, tepi jalan, tepi hutan dan bagian-bagian hutan yang terbuka disinari terik matahari.<br>" +
                "Buahnya digemari anak-anak. Seluruh bagian tumbuhan, dari daun sampai akar dan biasanya dikeringkan lebih dulu, digunakan sebagai bahan ramuan obat tradisional.<br>" +
                " <br>";
        String text32 =
                "<p align=\"justify\"><b>Calingcing</b><br>" +
                "Tumbuhan ini mirip ciplukan. Buahnya bisa dimakan (asam) batangnya bisa sebagai obat flu atau demam.<br>" +
                " <br>";
        String text33 =
                "<p align=\"justify\"><b>Honje</b><br>" +
                "Honje berwarna kemerahan seperti jenis tanaman hias pisang-pisangan. Jika batangnya sudah tua, bentuk tanamannya mirip jahe atau lengkuas, dengan tinggi mencapai 5 m. Tumbuhan ini ditemukan di daerah yang lembab. Batangnya tebal dan kenyal. Bunganya bisa dimakan<br>" +
                " <br>";
        String text34 =
                "<p align=\"justify\"><b>Harendong Bulu</b><br>" +
                "Tumbuhan ini mirip pohpohan, hanya saja daunnya berbulu. Hilangkan bulunya, daunnya bisa dimasak<br>" +
                " <br>";
        String text35 =
                "<p align=\"justify\"><br>" +
                "Sebelum dimakan, tumbuhan liar di hutan sebaiknya dimasak dulu untuk mengurangi dampak buruk seperti diare dan alergi. Bagaimana kalau sedang coba-coba makan tumbuhan hutan lantas keracunan? Masih ada upaya menetraliskan. Upayakan untuk memuntahkannya dengan jalan “dipancing-pancing”. Jika sudah muntah minumlah air kelapa. Pil norit mungkin bisa juga membantu mengurangi kadar racun, kalau ada.<br>"
                +"<p align=\"left\"><i>http://infopendaki.com/35-jenis-tumbuhan-di-hutan-yang-bisa-dimakan/<br> (35 Jenis Tumbuhan Yang Bisa Dimakan)<br><br>https://basisgear.com/edible-wild-plants/ <br> (Edible Wild Plants";
        String foto1 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan1.png\"></p>";
        String foto2 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan2.png\"></p>";
        String foto3 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan3.png\"></p>";
        String foto4 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan4.png\"></p>";
        String foto5 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan5.png\"></p>";
        String foto6 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan6.png\"></p>";
        String foto7 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan7.png\"></p>";
        String foto8 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan8.png\"></p>";
        String foto9 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan9.png\"></p>";
        String foto10 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan10.png\"></p>";
        String foto11 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan11.png\"></p>";
        String foto12 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan12.png\"></p>";
        String foto13 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan13.png\"></p>";
        String foto14 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan14.png\"></p>";
        String foto15 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan15.png\"></p>";
        String foto16 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan16.png\"></p>";
        String foto17 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan17.png\"></p>";
        String foto18 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan18.png\"></p>";
        String foto19 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan19.png\"></p>";
        String foto20 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan20.png\"></p>";
        String foto21 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan21.png\"></p>";
        String foto22 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan22.png\"></p>";
        String foto23 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan23.png\"></p>";
        String foto24 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan24.png\"></p>";
        String foto25 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan25.png\"></p>";
        String foto26 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan26.png\"></p>";
        String foto27 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan27.png\"></p>";
        String foto28 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan28.png\"></p>";
        String foto29 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan29.png\"></p>";
        String foto30 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan30.png\"></p>";
        String foto31 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan31.png\"></p>";
        String foto32 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan32.png\"></p>";
        String foto33 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan33.png\"></p>";
        String foto34 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan34.png\"></p>";
        String foto35 = "<p align=\"center\"><img src=\"tumbuhan/tumbuhan35.png\"></p>";

        view.loadDataWithBaseURL("file:///android_asset/", text + foto1 + text1 + foto2 + text2 + foto3 + text3 + foto4 + text4 + foto5 + text5 + foto6 + text6 + foto7 + text7 + foto8 + text8 + foto9 + text9 + foto10 + text10 + foto11 + text11 + foto12 + text12 + foto13 + text13 +foto14+text15+foto15+text15+foto16+text16+foto17+text17+foto18+text18+foto19+text19+foto20+text20+foto21+text21+foto22+text22+foto23+text23+foto24+text24+foto25+text25+foto26+text26+foto27+text27+foto28+text28+foto29+text29+foto30+text30+foto31+text31+foto32+text32+foto33+text33+foto34+text34+foto35+text35+ "</p>", "text/html", "utf-8", null);
        return rootView;
    }

}
