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
public class Peralatan extends Fragment {


    public Peralatan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_peralatan,
                container, false);
        WebView view = (WebView) rootView.findViewById(R.id.peralatan1);
        String text1 =
                "<p align=\"justify\">Sebagai seorang surivival Anda tahu pentingnya perawatan yang tepat dan penggunaan senjata, alat, dan peralatan Anda. Hal ini terutama berlaku untuk pisau Anda. Anda harus selalu menyimpannya tajam dan siap pakai. Pisau adalah alat paling berharga Anda dalam situasi bertahan hidup. Bayangkan berada dalam situasi bertahan tanpa senjata, peralatan, atau peralatan kecuali pisau Anda. Itu mungkin terjadi! Anda bahkan mungkin tanpa pisau. Anda mungkin akan merasa tidak berdaya, namun dengan pengetahuan dan keterampilan yang tepat, Anda dapat dengan mudah melakukan improvisasi barang-barang yang dibutuhkan.<br>" +
                "<br>" +
                "Dalam situasi bertahan hidup, Anda mungkin harus membuat sejumlah peralatan dan peralatan lapangan untuk bertahan hidup. Contoh alat dan perlengkapan yang bisa membuat hidup Anda jauh lebih mudah adalah tali, ransel, pakaian, jaring, dan sebagainya.<br>" +
                "<br>Senjata melayani tujuan ganda. Anda menggunakannya untuk mendapatkan dan menyiapkan makanan dan untuk memberikan pembelaan diri. Senjata juga bisa memberi Anda perasaan aman dan memberi Anda kemampuan untuk berburu saat bepergian.<br>" +
                "<br><p align=\"center\"><b>GADA</b> <br>" +
                "<p align=\"justify\">Anda memegang gada, Anda tidak membuangnya. Sebagai senjata lapangan, gada tidak melindungi Anda dari musuh. Namun, hal itu bisa memperluas area pertahanan Anda di luar ujung jari Anda. Ini juga berfungsi untuk meningkatkan kekuatan pukulan tanpa melukai diri sendiri. Ada tiga tipe dasar gada. Mereka adalah gada sederhana, berbobot, dan selempang.<br>" +
                "<br>" +
                "<b>Gada Sederhana</b><br>" +
                "Gada sederhana adalah staf atau cabang. Harus cukup singkat agar Anda mudah berayun, tapi cukup lama dan cukup kuat untuk merusak apa pun yang Anda pukul. Diameternya harus sesuai dengan nyaman di telapak tangan Anda, tapi seharusnya tidak terlalu tipis sehingga memungkinkan gada mudah patah pada benturan. Kayu keras lurus adalah yang terbaik jika Anda bisa menemukannya.<br>" +
                "<br>" +
                "<b>Gada Berbobot</b><br>" +
                "Gada berbobot adalah gada sederhana dengan berat di salah satu ujungnya. Bobotnya mungkin berat alami, seperti simpul pada kayu, atau sesuatu yang ditambahkan, seperti batu yang dilempar ke gada.<br>" +
                "<br>" +
                "Untuk membuat gada berbobot, pertama cari batu yang memiliki bentuk yang akan memungkinkan Anda menepuknya kencang ke gada. Batu dengan bentuk jam pasir sedikit bekerja dengan baik. Jika Anda tidak dapat menemukan batu berbentuk sesuai, Anda harus membuat alur atau saluran ke batu dengan teknik yang dikenal sebagai mematuk. Dengan berulang kali mengetuk batu gada dengan batu keras yang lebih kecil, Anda bisa mendapatkan bentuk yang diinginkan.<br>" +
                "Selanjutnya, cari sepotong kayu yang merupakan panjang yang tepat untuk Anda. Kayu keras lurus adalah yang terbaik. Panjang kayu harus terasa nyaman dalam kaitannya dengan berat batu. Akhirnya, cambuk batu itu ke gagangnya.<br>" +
                "<br>" +
                "Ada tiga teknik untuk memukul batu ke pegangan: pegangan split, cabang bercabang, dan pegangan yang dibungkus. Teknik yang Anda gunakan akan tergantung pada jenis pegangan yang Anda pilih. Lihat Gambar 12-1.<br>" +
                " <br>";
        String text2 =
                "<p align=\"justify\"><b>Gada Sling</b><br>" +
                "Sebuah gada selempang adalah jenis gada tertimbang lainnya. Bobot menggantung 8 sampai 10 sentimeter dari pegangan dengan pukulan kuat dan fleksibel (Gambar 12-2). Jenis gada ini memperluas jangkauan pengguna dan mengalikan kekuatan pukulan.<br>" +
                " <br>";
        String text3 =
                "<p align=\"center\"><b>SENJATA TAJAM</b><br>" +
                "<br>" +
                "<p align=\"justify\">Pisau, pisau tombak, dan titik panah berada di bawah kategori senjata bermata. Paragraf berikut akan membahas pembuatan senjata tersebut.<br>" +
                "<br>" +
                "<b>Pisau</b><br>" +
                "Pisau memiliki tiga fungsi dasar. Bisa menusuk, memotong atau memotong, dan memotong. Pisau juga merupakan alat yang sangat berharga yang digunakan untuk membangun barang-barang kelangsungan hidup lainnya. Anda mungkin menemukan diri Anda tanpa pisau atau Anda mungkin memerlukan pisau jenis lain atau tombak. Untuk berimprovisasi Anda bisa menggunakan batu, tulang, kayu, atau logam untuk membuat pisau atau tombak.<br>" +
                "<br>" +
                "<b><i>Batu</b></i><br>" +
                "Untuk membuat pisau batu, Anda memerlukan batu yang tajam, alat potongan, dan alat pengaduk. Alat chipping adalah alat ringan dan tumpul yang digunakan untuk memecah potongan-potongan kecil batu. Alat pengapung adalah alat runcing yang digunakan untuk memecah potongan batu yang tipis dan rata. Anda bisa membuat alat potongan dari kayu, tulang, atau logam, dan alat pengaduk dari tulang, tanduk tanduk, atau besi lunak (Gambar 12-3).<br>" +
                " <br>";
        String text4 =
                "<p align=\"justify\">Mulailah membuat pisau dengan menyusun bentuk yang diinginkan di batu tajam Anda, dengan menggunakan alat chipping. Usahakan membuat pisau cukup tipis. Kemudian, dengan menggunakan alat pengaduk, tekan ke tepi. Tindakan ini akan menyebabkan serpihan datang dari sisi yang berlawanan dari tepi, meninggalkan tepi tajam pisau cukur. Gunakan alat pengaduk sepanjang sepanjang tepi yang perlu ditajamkan. Akhirnya, Anda akan memiliki cutting edge yang sangat tajam yang bisa Anda gunakan sebagai pisau.<br>" +
                "<br>" +
                "Lash pisau ke beberapa jenis gagang (Gambar 12-3).<br>" +
                "<br>" +
                "Catatan: Batu akan membuat alat penusukan yang bagus dan alat pemotong yang bagus tapi tidak akan menggenggam tepi yang bagus. Beberapa batu seperti chert atau flint bisa memiliki tepi yang sangat halus.<br>" +
                "<br>" +
                "<b><i>Tulang</b></i><br>" +
                "Anda juga bisa menggunakan tulang sebagai senjata bermata bijih yang efektif. Pertama, Anda perlu memilih tulang yang sesuai. Tulang yang lebih besar, seperti tulang kaki rusa atau hewan berukuran sedang lainnya, adalah yang terbaik. Letakkan tulang di atas benda keras lainnya. Hancurkan tulang dengan memukulnya dengan benda berat, seperti batu. Dari potongan, pilih semprotan runcing yang sesuai. Anda dapat lebih jauh membentuk dan mempertajam sempalan ini dengan menggosoknya di atas batu yang kasar. Jika potongannya terlalu kecil untuk ditangani, Anda tetap bisa menggunakannya dengan menambahkan pegangan ke dalamnya. Pilih sepotong kayu keras yang cocok untuk pegangan dan cukur tulang serpihan dengan aman ke dalamnya.<br>" +
                "<br>" +
                "Catatan: Gunakan pisau tulang hanya untuk tusukan. Ini tidak akan bertahan dan mungkin serpihan atau patah jika digunakan secara berbeda.<br>" +
                "<br>" +
                "<b><i>Kayu</b></i> <br>" +
                "Anda bisa membuat senjata bermata lapangan dari kayu. Gunakan ini hanya untuk tusukan. Bambu adalah satu-satunya kayu yang akan memegang tepi yang sesuai. Untuk membuat pisau menggunakan kayu, pertama pilih sepotong kayu keras lurus yang panjangnya sekitar 30 sentimeter dan diameter 2,5 sentimeter. Celana pisau sekitar 15 sentimeter. Mencukurnya sampai titik tertentu. Gunakan hanya bagian kayu lurus. Jangan gunakan inti atau empulur, karena akan membuat titik lemah.<br>" +
                "<br>" +
                "Harden titik oleh sebuah proses yang dikenal sebagai pengerasan api. Jika api memungkinkan, keringkan bagian pisau di atas api perlahan sampai hangus ringan. Semakin kering kayu, semakin sulit intinya. Setelah menyambar bagian pisau dengan ringan, pertajam dengan batu kasar. Jika menggunakan bambu dan setelah membuat pisau, lepaskan kayu lain agar pisau lebih tipis dari bagian dalam bambu. Penghapusan dilakukan dengan cara ini karena bagian bambu yang paling sulit adalah lapisan luarnya. Simpan sebanyak mungkin lapisan ini untuk memastikan pisau tersulit mungkin. Saat menggandeng bambu di atas api, hanya char kayu bagian dalam; jangan char di luar.<br>" +
                "<br>" +
                "<b><i>Logam </b></i><br>" +
                "Metal is the best material to make field-expedient edged weapons. Metal, when properly designed, can fulfill a knife's three uses--puncture, slice or chop, and cut. First, select a suitable piece of metal, one that most resembles the desired end product. Depending on the size and original shape, you can obtain a point and cutting edge by rubbing the metal on a rough-surfaced stone. If the metal is soft enough, you can hammer out one edge while the metal is cold. Use a suitable flat, hard surface as an anvil and a smaller, harder object of stone or metal as a hammer to hammer out the edge. Make a knife handle from wood, bone, or other material that will protect your hand. <br>" +
                "<br>" +
                "<p align=\"justify\"><b><i>Material Lainnya</b></i><br>" +
                "Anda bisa menggunakan bahan lain untuk menghasilkan senjata bermata. Kaca adalah alternatif yang baik untuk senjata atau alat bermata, jika tidak ada bahan lain yang tersedia. Dapatkan potongan yang sesuai dengan cara yang sama seperti yang dideskripsikan untuk tulang. Kaca memiliki tepi alami namun kurang tahan lama untuk pekerjaan berat. Anda juga bisa mempertajam plastik - jika cukup tebal atau cukup keras - menjadi titik tahan lama untuk menusuk.<br>" +
                "<br>" +
                "<b>Tombak</b><br>" +
                "Untuk membuat tombak, gunakan prosedur yang sama untuk membuat pisau yang biasa Anda pakai pisau. Kemudian pilih poros (pohon muda) sepanjang 1,2 sampai 1,5 meter. Panjang harus memungkinkan Anda untuk menangani tombak dengan mudah dan efektif. Pasang pisau spear ke poros dengan menggunakan pukulan. Metode yang disukai adalah membagi pegangan, masukkan pisau, lalu bungkus atau cecupnya dengan kencang. Anda bisa menggunakan bahan lain tanpa menambahkan pisau. Pilih batang kayu keras setinggi 1,2 sampai 1,5 meter dan cukur satu ujung ke satu titik. Jika memungkinkan, api mengeras titik. Bambu juga membuat tombak yang sangat baik. Pilih potongan 1,2 sampai 1,5 meter. Mulai 8 sampai 10 sentimeter kembali dari ujung yang digunakan sebagai intinya, mencukur ujungnya pada sudut 45 derajat (Gambar 12-4). Ingat, untuk mempertajam ujung-ujungnya, hanya mencukur bagian dalam.<br>" +
                " <br>";
        String text5 =
                "<p align=\"justify\"><b>Anak Panah</b><br>" +
                "Untuk membuat anak panah, gunakan prosedur yang sama untuk membuat pisau batu. Chert, batu api, dan batu tipe shell paling baik untuk titik panah. Anda bisa menata tulang seperti batu - dengan mengelupas. Anda bisa membuat titik panah efisien menggunakan pecahan kaca.<br>" +
                "<br>" +
                "<p align=\"center\"><b>SENJATA PENTING LAINNYA</b><br>" +
                "<p align=\"justify\">Anda bisa membuat senjata lapangan lainnya seperti tongkat pelontar, peralatan memanah, dan bola.<br>" +
                "<br>" +
                "<b>Tongkat Pelempar/Bumerang</b> <br>" +
                "Tongkat pelempar, yang biasa dikenal dengan tongkat kelinci, sangat efektif melawan permainan kecil (tupai, tupai, dan kelinci). Tongkat kelinci itu sendiri adalah tongkat tumpul, melengkung secara alami sekitar sudut 45 derajat. Pilih tongkat dengan sudut yang diinginkan dari kayu keras berat seperti kayu ek. Cukur dua sisi yang berlawanan sehingga stiknya rata seperti bumerang (Gambar 12-5). Anda harus berlatih teknik lempar untuk akurasi dan kecepatan. Pertama, selaraskan target dengan memperluas lengan nonthrowing sesuai dengan pertengahan ke bagian bawah target. Perlahan dan berulang kali angkat lengan lempar ke atas dan ke belakang sampai lempeng lempar menyilang bagian belakang pada sudut 45 derajat atau sesuai dengan pinggul. Bawa lengan lempar ke depan sampai agak di atas dan sejajar dengan lengan nonthrowing. Ini akan menjadi titik pelepas tongkat pelontar. Berlatihlah perlahan dan berulang kali untuk mencapai akurasi. <br>" +
                " <br>";
        String text6 =
                "<p align=\"justify\"><b>Peralatan Panahan</b><br>" +
                "Anda bisa membuat busur dan panah (Gambar 12-6) dari bahan yang tersedia di area bertahan Anda. Untuk membuat busur, gunakan prosedur yang dijelaskan di bawah Perangkat Pembunuhan di Bab 8.<br>" +
                " <br>";
        String text7 =
                "<p align=\"justify\">Meskipun mungkin relatif mudah untuk membuat busur dan panah, tidak mudah menggunakannya. Anda harus berlatih menggunakannya cukup lama untuk memastikan bahwa Anda akan mencapai target Anda. Juga, busur lapangan cepat tidak akan bertahan lama sebelum Anda harus membuat yang baru. Untuk waktu dan usaha yang terlibat, Anda mungkin memutuskan untuk menggunakan jenis senjata lapangan lainnya.<br>" +
                "<br>" +
                "<b>Bola</b> <br>" +
                "Bola adalah senjata lapangan lain yang mudah dibuat (Gambar 12-7). Hal ini terutama efektif untuk menangkap permainan lari atau unggas terbang rendah di kawanan domba. Untuk menggunakan bola, tahan dengan simpul tengah dan putar di atas kepala Anda. Lepaskan simpul sehingga bola terbang ke arah target Anda. Saat melepaskan bola, tali yang tertimbang akan terpisah. Tali ini akan membungkus dan melumpuhkan unggas atau hewan yang Anda pukul.<br>" +
                " <br>";
        String text8 =
                "<p align=\"center\"><b>PEMBUATAN KERANJANG</b><br>" +
                "<p align=\"justify\">Bahan untuk membangun ransel atau paket hampir tidak terbatas. Anda bisa menggunakan kayu, bambu, tali, serat tanaman, pakaian, kulit binatang, kanvas, dan banyak bahan lainnya untuk membuat paket.<br>" +
                "<br>" +
                "Ada beberapa teknik konstruksi untuk ransel. Banyak yang sangat rumit, tapi yang sederhana dan mudah sering kali paling mudah dibuat dalam situasi bertahan hidup.<br>" +
                "<br>" +
                "<b>Horseshoe Pack</b> <br>" +
                "Tas ini sederhana untuk membuat dan menggunakan dan relatif nyaman untuk membawa lebih dari satu bahu. Lay tersedia berbentuk persegi bahan, seperti poncho, selimut, atau kanvas, rata di tanah. Lay item pada satu sisi dari bahan. Pad item keras. Gulung bahan (dengan barang) ke arah yang berlawanan dan dasi kedua ujungnya dengan kencang. Tambahkan ikatan ekstra sepanjang bundelnya. Anda bisa menggantungkan bungkus di atas satu bahu dengan garis yang menghubungkan kedua ujungnya (Gambar 12-9).<br>" +
                " <br>";
        String text9 =
                "<p align=\"justify\"><b>Tas Persegi</b><br>" +
                "Paket ini mudah dibangun jika tali atau kabel tersedia. Jika tidak, Anda harus terlebih dahulu melakukan pengikatan. Untuk membuat paket ini, buat bingkai persegi dari bambu, tungkai, atau stik. Ukuran akan bervariasi untuk setiap orang dan jumlah peralatan yang dibawa (Gambar 12-10).<br>" +
                " <br>";
        String text10 =
                "<p align=\"justify\">Anda bisa menggunakan banyak bahan untuk pakaian dan isolasi. Kedua bahan buatan manusia, seperti parasut, dan bahan alami, seperti kulit dan bahan tanaman, tersedia dan menawarkan perlindungan yang signifikan.<br>" +
                "<br>" +
                "<b>Parasut</b><br>" +
                "Pertimbangkan seluruh parasut sebagai sumber daya. Gunakan setiap bagian material dan perangkat keras, untuk memasukkan kanopi, garis suspensi, kuncian konektor, dan bantalan parasut. Sebelum membongkar parasut, pertimbangkan semua persyaratan kelangsungan hidup Anda dan rencanakan untuk menggunakan berbagai bagian parasut yang sesuai. Misalnya, pertimbangkan persyaratan tempat tinggal, kebutuhan akan ransel, dan sebagainya, selain kebutuhan pakaian atau insulasi.<br>" +
                "<br>" +
                "<b>Kulit binatang</b><br>" +
                "Pemilihan kulit binatang dalam situasi bertahan hidup paling sering dibatasi pada apa yang Anda jaga untuk jebakan atau perburuan. Namun, jika ada kelimpahan satwa liar, pilihlah kulit hewan yang lebih besar dengan mantel lebih besar dan kandungan lemaknya besar. Jangan gunakan kulit hewan yang terinfeksi atau berpenyakit jika memungkinkan. Karena mereka hidup di alam bebas, hewan adalah pembawa hama seperti kutu, kutu, dan kutu. Karena hama ini, gunakan air bersih untuk membersihkan kulit yang didapat dari binatang manapun. Jika air tidak tersedia, seketika guncangkan kulit secara menyeluruh. Seperti kulit mentah, lay out kulit, dan lepaskan semua lemak dan daging. Keringkan kulit sepenuhnya. Gunakan area sendi triwulan untuk membuat sepatu dan sarung tangan atau kaus kaki. Pakai sikat dengan bulu ke bagian dalam untuk faktor isolasi.<br>" +
                "<br>" +
                "<b>Serat Fiber</b><br>" +
                "Beberapa tanaman merupakan sumber isolasi dari dingin. Cattail adalah tanaman rawa yang ditemukan di sepanjang danau, kolam, dan sungai-sungai terpencil. Bagian bulu di bagian atas tangkai membentuk ruang udara mati dan membuat insulasi seperti di bawah yang baik bila diletakkan di antara dua bagian material. Milkweed memiliki biji pollenlike yang berfungsi sebagai insulasi yang bagus. Serabut kulit dari kelapa sangat baik untuk menenun tali dan, bila dikeringkan, buat sarung dan insulasi yang sangat baik.<br>" +
                "<br>" +
                "<p align=\"center\"><b>SUMBER DAN PENGADAAN MAKANAN</b><br>" +
                "<p align=\"justify\">Banyak bahan bisa digunakan untuk membuat peralatan memasak, makan, dan menyimpan makanan.<br>" +
                "<br>" +
                "<b>Mangkuk</b><br>" +
                "Gunakan kayu, tulang, tanduk, kulit kayu, atau bahan sejenis lainnya untuk membuat mangkuk. Untuk membuat mangkuk kayu, gunakan sepotong kayu yang dilubangi yang akan menampung makanan dan cukup air untuk memasaknya. Gantungkan wadah kayu di atas api dan tambahkan bebatuan panas ke air dan makanan. Lepaskan bebatuan saat mereka dingin dan tambahkan bebatuan yang lebih panas sampai makanan Anda dimasak.<br>" +
                "<br>" +
                "Anda juga bisa menggunakan metode ini dengan wadah yang terbuat dari kulit kayu atau daun. Namun, wadah ini akan terbakar di atas permukaan air kecuali jika Anda tetap lembab atau tetap menyala rendah.<br>" +
                "<br>" +
                "Bagian bambu bekerja dengan sangat baik, jika Anda memotong bagian antara dua sambungan tertutup (Gambar 12-11).<br>" +
                " <br>";
        String text11 =
                "<p align=\"justify\"><b>Garpu, Pisau, dan Sendok</b><br>" +
                "Ukir garpu, pisau, dan sendok dari kayu tanpa busuk sehingga Anda tidak mendapatkan endapan kayu atau tidak mencemari makanan. Kayu yang tidak berdaun meliputi pohon ek, pohon birch, dan pohon kayu keras lainnya.<br>" +
                "<br>" +
                "Catatan: Jangan gunakan pohon yang mengeluarkan cairan sirup atau resin seperti pada kulit kayu atau saat dipotong.<br>" +
                "<br>" +
                "<b>Pot</b><br>" +
                "Anda bisa membuat pot dari kulit kura-kura atau kayu. Seperti yang dijelaskan dengan mangkuk, menggunakan bebatuan panas di kayu bulat yang dilubangi sangat efektif. Bambu adalah kayu terbaik untuk membuat wadah masak.<br>" +
                "<br>" +
                "Untuk menggunakan kulit kura-kura, mulailah mendidih bagian atas cangkang. Kemudian gunakan untuk memanaskan makanan dan air di atas api (Gambar 12-11).<br>" +
                "<br>" +
                "<b>Botol air</b><br>" +
                "Buat botol air dari perut binatang yang lebih besar. Tenangkan perut dengan air, lalu dorong bagian bawahnya. Biarkan bagian atas terbuka, dengan beberapa cara untuk mengikatnya ditutup.<br>" +
                "<p align=\"center\"><b><i>SENJATA API DAN KALIBER PELURU</i> </b><br>" +
                "<p align=\"justify\">" +
                "Sejak ditemukannya bubuk mesiu, senjata api dan meriam mulai digunakan oleh manusia untuk berperang. Dinamakan senjata api karena menggunakan pembakaran atau ledakan untuk menghasilkan gas yang dapat mendorong dengan kecepatan tinggi suatu proyektil atau peluru.<br>" +
                "<br>" +
                "Walaupun dari sejak pertama kali ditemukannya hingga sekarang menggunakan prinsip yang sama, yaitu pelontaran proyektil dengan pembakaran, tetapi perkembangan senjata api modern sudah sangat jauh berbeda dengan senjata api di masa lalu. Berikut jenis-jenis senjata api yang dewasa ini banyak beredar di dunia.<br>" +
                "<br>" +
                "Jenis senjata api yang paling banyak digunakan adalah handguns, yang mana didesain agar bisa dipegang dan digunakan oleh tangan. Yang termasuk di dalamnya adalah pistol, pistol semi otomatis, pistol mesin, revolver dan derringer.<br>" +
                "<br>" +
                "Jenis yang kedua adalah senjata laras panjang, atau dalam bahasa Inggrisnya disebut long guns atau shoulder guns. Senapan rifles dan shotguns termasuk dalam kategori ini.<br>" +
                "<br>" +
                "Jenis ketiga adalah senjata berat yang tidak bisa ditangani atau diangkat oleh orang, melainkan harus diletakkan di tanah atau dipasang pada sesuatu. Misalnya kebanyakan senjata mesin, senjata yang terpasang di pesawat terbang, tank, senjata anti pesawat, dan lainnya. Ada pula yang dinamakan meriam, yaitu senjata yang mempunyai kaliber lebih dari 50.<br>" +
                "<br>" +
                "<b>Pistol</b><br>" +
                "Yang dimaksud pistol biasanya memang mengacu kepada istilah handgun itu sendiri. Jenis pistol ialah pistol semi otomatis, seperti FN, dan pistol mesin yang full otomatis, seperti UZI.<br>" +
                "<br>" +
                "Pistol menggunakan peluru yang terlebih dahulu dimasukkan ke dalam magazine. Satu magazine bisa memuat 5 hingga 19 peluru tergantung kepada jenisnya, dan bisa diisi berulang kali. Dalam pemakaiannya, magazine dimasukkan ke dalam pegangan pistol.<br>" +
                "<br>" +
                "<b>Revolver</b><br>";
        String text12 =
                "<p align=\"justify\">Adalah pistol dengan magazine yang berbentuk silinder berlubang, dengan laras yang lebih panjang. Kita biasa melihatnya di film-film koboi. Biasanya magazine silinder ini dapat diisi 6 peluru, satu peluru dalam setiap lubang. Silinder akan otomatis memutar mengarahkan lubang berikutnya setelah ditembakkan.<br>" +
                "<br>"+
                "Terdapat semacam palu yang memukul ujung bagian peluru ketika pelatuk ditarik, bagian belakang peluru yang berisi bubuk peledak akan seketika terbakar dan meledak, sehingga ujung peluru depan yang merupakan bagian inti dari peluru, akan melesat dengan cepat memburu sasarannya.<br>" +
                "<br>" +
                "Ada pula jenis yang lain, yaitu revolver dengan dua buah laras panjang. Jenis ini lebih kuat hentakannya dan lebih lemah akurasinya jika dibandingkan revolver berlaras satu. Tetapi dapat lebih cepat dalam proses penembakkannya.<br>" +
                "<br>"+
                "<b>Derringers</b><br>";
        String text13 =
                "<p align=\"justify\">Ialah jenis pistol yang sangat kecil dan pendek. Berlaras satu atau dia, dengan pengisian peluru langsung di belakang larasnya. Karena ukurannya yang kecil, senjata jenis ini sering digunakan untuk cadangan yang disembunyikan, atau sebagai pelengkap.<br>" +
                "<br>"+
                "<b>Rifles</b><br>";
        String text14 =
                "<p align=\"justify\">Rifle adalah jenis senapan yang biasanya mempunyai panjang laras lebih dari 18 inci. Terdapat pegangan kearah dada atau bahu, yang disebut stock, agar dapat menahan hentakan yang terjadi ketika menembak, supaya akurasi tetap terjaga.<br>" +
                "<br>"+
                "Laras panjangnya ini biasanya mempunyai alur spiral di dalam, sehingga peluru yang melesat menjadi berputar, dimaksudkan untuk akurasi dan kecepatan yang lebih maksimal.<br>" +
                "<br>"+
                "<b>Shotguns</b><br>";
        String text15 =
                "<p align=\"justify\">Senapan yang memiliki laras panjang dengan kaliber yang biasanya cukup besar. Selain untuk berburu, biasanya digunakan pula untuk berolahraga menembak, dengan sasaran bergerak yang dilontarkan ke udara.<br>" +
                "<br>"+
                "<b>Senjata Semi Otomatis dan Senjata Mesin</b><br>";
        String text16 =
                "<p align=\"justify\">Perbedaan yang jelas pada keduanya adalah jika senjata semi otomatis akan melontarkan peluru ketika pelatuk ditarik, sedangkan senjata mesin benar-benar otomatis penuh, dimana peluru akan terus ditembakkan selama pelatuknya ditarik dan tidak dilepas.<br>" +
                "<br>" +
                "Pada kaliber yang besar, senjata mesin atau machine gun ini dipasang pada sesuatu, misalnya pada tank, helicopter, pesawat dan lainnya. Atau ada juga yang hanya dipasangi kaki-kaki dan diletakkan di tanah. Untuk membedakannya dengan senjata mesin yang berkaliber kecil, maka dimunculkan istilah submachine gun, seperti yang banyak digunakan oleh para gangster di film-film.<br>" +
                "<br>" +
                "<b>Senapan Serbu</b><br>";
        String text17 =
                "<p align=\"justify\">Atau dalam bahasa Inggrisnya Assault Rifles, adalah senapan yang digunakan militer. Biasanya memiliki semacam saklar yang dapat memilih mode semi-otomatis atau full otomatis, atau ada pula pilihan burst di beberapa jenis senapan, yaitu memuntahkan sejumlah peluru dalam waktu singkat ketika sekali menarik pelatuk.<br>" +
                "<br>" +
                "AK-47, M16 dan FN FAL adalah beberapa jenis senjata yang termasuk senapan serbu.<br>" +
                "<br>" +
                "<b>Kaliber Peluru</b><br>" +
                "Kaliber peluru adalah salah satu informasi yang sering kita dengar dalam sehar-hari saat kita melaksanakan latihan menembak. Kaliber secara umum menyatakan ukuran peluru yang dipakai pada senjata api.<br>" +
                "<br>" +
                "Kaliber dilihat dari diameter atau garis tengah peluru, atau dari diameter isi lorong laras.<br>" +
                "<br>" +
                "Kaliber dapat dinyatakan dalam inci maupun dalam milimeter. Biasanya penyebutan dalam inci digunakan untuk produk komersial, dan penyebutan dalam milimeter untuk produk militer. Dalam inci, kaliber disebut dalam desimal dan bisa ditambahkan satuan kaliber “cal“. Jadi untuk peluru dengan diameter 0,45 inci biasa disebut .45 cal (“kaliber empat-lima”). Dalam milimeter kaliber tidak diberi satuan cal, untuk peluru 5,56 milimeter disebut 5.56 mm.<br>" +
                "<br>" +
                "Pada generasi selanjutnya, setelah dirancangnya senapan yang dimasukkan peluru dari belakang senapan yang dinamakan senjata jarum oleh Pauly dan digunakan pertama kali oleh tentara Prusia yang waktu di bawah perdana menteri Otto von Bismarck dan Kaiser Wilhelm I itu ketika menyerang Perancis yang waktu itu dipimpin oleh Kaisar Napoleon III serta pengembangan-pengembangan senapan dan peluru di mana bubuk mesiu dimasukkan ke dalam tabung kecil kuningan yang dinamakan selongsong atau cartridge.<br>" +
                " <br>";
        String text18 =
                "<p align=\"center\"><i>(Peluru senapan,dari kiri ke kanan: .50 BMG, 300 Win Mag,7.62 NATO, 7.62 Soviet, 5.56 NATO, .22LR.)</i><br>" +
                "<p align=\"justify\">" +
                "Penyebutan lain juga bisa dengan ditambahkan negara asal, tipe senjata, atau pabrik yang pertama memproduksi, misalnya:<br>" +
                "<ul><li>5.56 x 45 mm, bisa disebut 5.56 NATO, .223 Rem</li>" +
                "<li>7.62 x 39 mm, bisa disebut 7.62 Soviet, 7.62 Warsaw, 7.62 ComBloc, .30 Short Russian</li>" +
                "<li>7.62 x 51 mm, bisa disebut 7.62 NATO, .308 Winchester</li>" +
                "<li>9 x 19 mm, bisa disebut 9 mm NATO, 9 mm Luger, 9 mm Parabellum</li>" +
                "<li>11.43 x 23 mm, biasa disebut .45 ACP, .45 Auto</li>" +
                "</ul> <br>";
        String text19 =
                "<p align=\"center\"><p align=\"justify\"><i>(Dari kiri ke kanan : .22 lr, .380 auto, .38 special, 9mm, .357 magnum, .40 S&W, .45 acp, .44 magnum, 7.62x39mm, 8mm)</i><br>" +
                "<p align=\"justify\">" +
                "Bagi beberapa orang, ukuran kaliber sangat membosankan apabila ditulis dalam inci, karena lebih familiar dengan milimeter (mm) ketimbang inci. Seperti pada gambar diatas, ada kaliber .22, .38, .357, .40, dan .45, itu semua dalam inci. Artinya kaliber .22 adalah 0,22 inci, kaliber .38 adalah 0,38 inci dan seterusnya. Berapa 1 inci ? 1 inci sama dengan 2,54 cm atau 254mm. Bila tertulis dalam satuan milimeter, cukup gampang, seperti pada contoh diatas 7.62x39mm, artinya 7,62mm diameter dan 39mm panjang.<br>" +
                "<br>" +
                "Ukuran kaliber peluru ini menggambarkan bagaimana “gemuknya” sebuah peluru. Perlu diperhatikan, bahwa diameter peluru yang lebih besar tidak secara otomatis berarti kekuatannya lebih besar. Sebagian besar kaliber di dunia diukur dalam milimeter. Di AS, nominal kaliber peluru diukur dalam inci seperti kaliber .50 (setengah inci). Tapi dalam kenyataannya ukuran kaliber peluru di AS tidak sepenuhnya sama dengan inci. Misalnya kaliber .38 khusus Magnum dan kaliber .357 memiliki diameter yang sama.<br>" +
                "<br>" +
                "Namun dalam artikel lain juga disebutkan bahwa Kaliber sebagai ukuran panjang laras.<br>" +
                " <br>";
        String text20 =
                "<p align=\"center\"><i>(Dari kiri ke kanan: Peluru anti-tank dan high explosive 37 mmJerman dan peluru anti-tank 45 mmSoviet.</i><br>" +
                "<p align=\"justify\">" +
                "Panjang laras (biasanya pada senjata api dan meriam yang besar) juga dapat dihitung dalam kaliber. Panjang efektif laras akan dibagi dengan diameter lorong laras. Sebagai contoh, meriam pada kapal perang kelas Iowa disebut meriam kaliber 16″/50. Maksudnya, diameter isi larasnya 16 inci, dan panjang larasnya adalah 800 inci (16 * 50 = 800). Perhitungan ini kadang-kadang diberi awalan L/, misalnya pada meriam tank Panzer IV, yaitu “75 mm L/48″, yang berarti diameternya adalah 75 mm dan panjangnya adalah 3600 mm.<br>" +
                " <br>";
        String text21 =
                "<p align=\"justify\">Selain sebagai ukuran diameter laras (atas), kaliber dapat digunakan sebagai ukuran panjang laras (bawah).<br>" +
                "<br>" +
                "Bahwa penyebutan kaliber ada 2 pengertian yaitu :<br>" +
                "</ul><li>Sebagai ukuran diameter peluru/laras</li><br>" +
                "<li>Sebagai ukuran panjang laras</li></ul><br>"+
                        "<br><br><i>Departemen Petahanan Amerika Serikat, US Army Field Manual \"Survival\" (FM 21-76), Markas Besar Departemen Tentara Amerika Serikat 1956.";
        String foto1 = "<p align=\"center\"><img src=\"peralatan/alat1.png\"></p>";
        String foto2 = "<p align=\"center\"><img src=\"peralatan/alat2.png\"></p>";
        String foto3 = "<p align=\"center\"><img src=\"peralatan/alat3.png\"></p>";
        String foto4 = "<p align=\"center\"><img src=\"peralatan/alat4.png\"></p>";
        String foto5 = "<p align=\"center\"><img src=\"peralatan/alat5.png\"></p>";
        String foto6 = "<p align=\"center\"><img src=\"peralatan/alat6.png\"></p>";
        String foto7 = "<p align=\"center\"><img src=\"peralatan/alat7.png\"></p>";
        String foto8 = "<p align=\"center\"><img src=\"peralatan/alat8.png\"></p>";
        String foto9 = "<p align=\"center\"><img src=\"peralatan/alat9.png\"></p>";
        String foto10 = "<p align=\"center\"><img src=\"peralatan/alat10.png\"></p>";
        String foto11 = "<p align=\"center\"><img src=\"peralatan/alat11.png\"></p>";
        String foto12 = "<p align=\"center\"><img src=\"peralatan/alat12.png\"></p>";
        String foto13 = "<p align=\"center\"><img src=\"peralatan/alat13.png\"></p>";
        String foto14 = "<p align=\"center\"><img src=\"peralatan/alat14.png\"></p>";
        String foto15 = "<p align=\"center\"><img src=\"peralatan/alat15.png\"></p>";
        String foto16 = "<p align=\"center\"><img src=\"peralatan/alat16.png\"></p>";
        String foto17 = "<p align=\"center\"><img src=\"peralatan/alat17.png\"></p>";
        String foto18 = "<p align=\"center\"><img src=\"peralatan/alat18.png\"></p>";
        String foto19 = "<p align=\"center\"><img src=\"peralatan/alat19.png\"></p>";
        String foto20 = "<p align=\"center\"><img src=\"peralatan/alat20.png\"></p>";
        String foto21 = "<p align=\"center\"><img src=\"peralatan/alat21.png\"></p>";
        view.loadDataWithBaseURL("file:///android_asset/", foto1+text1 +foto2+text2+foto3+text3+foto4+text4+foto5+text5+foto6+text6+foto7+text7+foto8+text8+foto9+text9+foto10+text10+ foto11+ text11 +foto12+text12+foto13+text13+foto14+text14+foto15+text15+foto16+text16+foto17+text17+foto18+text18+foto19+text19+foto20+text20+foto21+text21, "text/html", "utf-8", null);
        return rootView;
    }

}
