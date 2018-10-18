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
public class Makanan extends Fragment {


    public Makanan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_makanan,
                container, false);
        WebView view = (WebView) rootView.findViewById(R.id.makanan1);
        String text1 =
                "<p align=\"justify\">Setelah air, kebutuhan manusia yang paling mendesak adalah makanan. Dalam merenungkan hampir semua situasi bertahan hipotetis, pikiran langsung beralih ke pemikiran makanan. Jika situasinya tidak terjadi di lingkungan yang gersang, bahkan air, yang lebih penting untuk menjaga fungsi tubuh, hampir selalu mengikuti makanan dalam pikiran awal kita. Orang yang selamat harus ingat bahwa tiga hal penting untuk bertahan hidup - air, makanan, dan tempat tinggal - diprioritaskan sesuai perkiraan situasi aktual. Perkiraan ini tidak hanya tepat waktu namun akurat juga. Beberapa situasi mungkin mendikte tempat penampungan tersebut mendahului makanan dan air.<br>" +
                "<p align=\"center\"><b>HEWAN SEBAGAI MAKANAN</b><br>" +
                "<p align=\"justify\">Kecuali Anda memiliki kesempatan untuk melakukan permainan besar, berkonsultasilah usaha Anda pada hewan yang lebih kecil, karena kelimpahannya. Spesies hewan yang lebih kecil juga lebih mudah disiapkan. Anda tidak boleh tahu semua jenis hewan yang cocok sebagai makanan. Relatif sedikit yang beracun, dan mereka membuat daftar yang lebih kecil untuk diingat. Yang penting adalah mempelajari kebiasaan dan pola perilaku kelas binatang. Misalnya, hewan yang merupakan pilihan terbaik untuk menjebak, yang menghuni rentang tertentu dan menempati sarang atau sarang, yang memiliki area makan yang agak tetap, dan yang memiliki jalur yang mengarah dari satu daerah ke daerah lainnya. Lebih besar, menggembalakan hewan, seperti rusa atau karibu, menjelajah daerah yang luas dan agak sulit dijebak. Juga, Anda harus memahami pilihan makanan dari spesies tertentu.<br><br>" +
                "<br>" +
                "Anda bisa, dengan sedikit pengecualian, makan apapun yang merangkak, berenang, berjalan, atau lalat. Hambatan pertama adalah mengatasi keengganan alami Anda terhadap sumber makanan tertentu. Secara historis, orang-orang dalam situasi kelaparan telah memilih makan segala sesuatu yang bisa dibayangkan untuk makanan. Seseorang yang mengabaikan sumber makanan yang sehat karena bias pribadi, atau karena dia merasa tidak menimbulkan selera, mempertaruhkan nyawanya sendiri. Meski pada awalnya mungkin terasa sulit, seorang yang selamat harus makan apa saja yang tersedia untuk menjaga kesehatannya.<br>" +
                "<br>" +
                "<b>Serangga</b><br>" +
                "Bentuk kehidupan yang paling melimpah di bumi, serangga mudah tertangkap. Serangga memberikan protein 65 sampai 80 persen dibandingkan dengan 20 persen untuk daging sapi. Fakta ini membuat serangga menjadi sumber makanan penting, jika tidak terlalu menggugah selera. Serangga yang harus dihindari mencakup semua orang dewasa yang menyengat atau menggigit, serangga berbulu atau berwarna cerah, serta ulat dan serangga yang memiliki bau busuk. Hindari juga laba-laba dan pembawa penyakit umum seperti kutu, lalat, dan nyamuk.<br>" +
                "<br>" +
                "Kayu yang membusuk tergeletak di tanah adalah tempat yang sangat baik untuk mencari berbagai serangga termasuk semut, rayap, kumbang, dan belatung, yang merupakan larva kumbang. Jangan mengabaikan sarang serangga atau di tanah. Area berumput, seperti ladang, adalah area yang bagus untuk ditelusuri karena serangga mudah dilihat. Batu, papan, atau bahan lainnya tergeletak di tanah memberikan serangga dengan lokasi persarangan yang baik. Periksa situs ini. Larva serangga juga dapat dimakan. Serangga seperti kumbang dan belalang yang memiliki kulit luar yang keras akan memiliki parasit. Masak mereka sebelum makan. Lepaskan sayap dan kaki berduri juga. Anda bisa makan sebagian besar serangga mentah. Rasa bervariasi dari satu spesies ke spesies lainnya. Kelelawar kayu lunak, sementara beberapa spesies semut menyimpan madu di tubuh mereka, memberi mereka rasa manis. Anda bisa menggiling koleksi serangga menjadi pasta. Anda bisa mencampurnya dengan vegetasi yang dapat dimakan. Anda bisa memasaknya untuk meningkatkan selera mereka.<br>" +
                "<b><br>Cacing</b><br>" +
                "Cacing (Annelidea) adalah sumber protein yang sangat baik. Gali mereka di tanah lembab lembap atau saksikan mereka di tanah setelah hujan. Setelah menangkapnya, masukkan air bersih dan bersih selama beberapa menit. Cacing secara alami akan membersihkan atau membersihkan diri, setelah itu Anda bisa memakannya mentah-mentah.<br>" +
                "<br>" +
                "<b>Krustasea</b><br>" +
                "Udang air tawar berkisar dari 0,25 sentimeter hingga 2,5 sentimeter. Mereka bisa membentuk koloni agak besar di tikar alga mengambang atau di dasar lumpur tambak dan danau.<br>" +
                "<br>" +
                "Udang karang mirip lobster laut dan kepiting. Anda bisa membedakannya dengan exoskeleton keras dan lima pasang kaki, pasangan depan memiliki penjepit besar. Udang karang aktif di malam hari, tapi Anda bisa menemukannya di siang hari dengan melihat ke bawah dan di sekitar batu di sungai. Anda juga bisa menemukannya dengan melihat ke dalam lumpur lunak di dekat lubang napas seperti cerobong asap dari sarang mereka. Anda bisa menangkap udang karang dengan mengikat potongan jeroan atau organ dalam ke tali. Saat udang karang menyambar umpan, tarik ke pantai sebelum sempat melepaskan umpan.<br>" +
                "<br>" +
                "Anda menemukan lobster air asin, kepiting, dan udang dari tepi ombak hingga air setinggi 10 meter. Udang mungkin datang ke cahaya di malam hari di mana Anda bisa meraupnya dengan jaring. Anda bisa menangkap lobster dan kepiting dengan perangkap umpan atau kait umpan. Kepiting akan sampai pada umpan yang diletakkan di pinggir ombak, di mana Anda bisa menjebak atau membersihkannya. Lobster dan kepiting malam hari dan paling enak di malam hari.<br>" +
                "<br>" +
                "<b>Moluska</b><br>" +
                "Kelas ini mencakup gurita dan kerang air tawar dan air asin seperti siput, kerang, kerang, bivalvia, teritip, periwinkles, chitons, dan bulu babi (Gambar 8-1). Anda menemukan bivalvia yang mirip dengan kerang air tawar dan siput terestrial dan perairan di seluruh dunia di bawah semua kondisi air.<br>" +
                " <br>";
        String text2 =
                "<p align=\"justify\">Siput sungai atau periwinkles air tawar berlimpah di sungai, sungai, dan danau di hutan jenis konifera utara. Bekicot ini bisa jadi titik pensil atau berbentuk bulat.<br>" +
                "<br>" +
                "Di air tawar, carilah moluska di air dangkal, terutama di air dengan dasar berpasir atau berlumpur. Carilah jalan sempit yang mereka tinggalkan di lumpur atau celah celah elips gelap dari katup terbuka mereka.<br>" +
                "Dekat laut, lihat di kolam pasang surut dan pasir basah. Batu-batu di sepanjang pantai atau membentang seperti terumbu ke dalam air yang lebih dalam seringkali mengandung kerang yang menempel. Siput dan limpets menempel pada bebatuan dan rumput laut dari tanda air rendah ke atas. Siput besar, disebut chitons, menempel erat ke batu di atas garis selancar.<br>" +
                "<br>" +
                "Kerang biasanya membentuk koloni padat di kolam batu, di atas kayu bulat, atau di dasar batu-batu besar.<br>" +
                "<p align=\"center\">PERINGATAN<br>" +
                "<p align=\"justify\">Kerang bisa beracun di daerah tropis selama musim panas!<br>" +
                "Uap, rebus, atau panggang moluska di tempurung. Mereka membuat rebusan yang sangat bagus dengan kombinasi sayuran dan umbi.<br>" +
                "<p align=\"center\">PERINGATAN<br>" +
                "<p align=\"justify\">Jangan makan kerang yang tidak tertutup air saat air pasang!<br>" +
                "<br>" +
                "<b>Ikan</b><br>" +
                "Ikan merupakan sumber protein dan lemak yang baik. Mereka menawarkan beberapa keuntungan yang berbeda bagi survivor atau evader. Mereka biasanya lebih banyak daripada margasatwa mamalia, dan cara untuk membuat mereka diam. Agar berhasil menangkap ikan, Anda harus tahu kebiasaan mereka. Misalnya, ikan cenderung makan banyak sebelum badai. Ikan tidak akan makan setelah badai saat airnya berlumpur dan bengkak. Cahaya sering menarik ikan di malam hari. Bila ada arus deras, ikan akan beristirahat di tempat-tempat di mana ada eddy, seperti batuan yang dekat. Ikan juga akan mengumpulkan di mana ada kolam dalam, di bawah sikat yang menjorok, dan di dalam dan di sekitar dedaunan terendam, kayu bulat, atau benda lain yang menawarkan tempat berlindung.<br>" +
                "<br>" +
                "Tidak ada ikan air tawar beracun. Namun, spesies ikan patin memiliki tonjolan tajam dan tajam pada sirip punggung dan duri. Ini bisa menimbulkan luka tusukan yang menyakitkan sehingga cepat terinfeksi.<br>" +
                "<br>" +
                "Masak semua ikan air tawar untuk membunuh parasit. Juga masak ikan air asin yang tertangkap di dalam terumbu atau pengaruh sumber air tawar sebagai tindakan pencegahan. Setiap kehidupan laut yang diperoleh lebih jauh di laut tidak akan mengandung parasit karena lingkungan air asin. Anda bisa makan mentah ini.<br>" +
                "<br>" +
                "Spesies ikan air asin tertentu memiliki daging beracun. Pada beberapa spesies, racun tersebut terjadi musiman pada orang lain, bersifat permanen. Contoh ikan air asin beracun adalah ikan landak, ikan cemara, ikan cowfish, ikan duri, ikan patin, ikan kakap merah, jack, dan puffer (Gambar 8-2). Barakuda, meski tidak benar-benar beracun itu sendiri, bisa menularkan ciguatera (keracunan ikan) jika dimakan mentah.<br>" +
                " <br>";
        String text3 =
                "<b><p align=\"justify\">Amfibi</b><br>" +
                "Katak dan salamander mudah ditemukan di sekitar badan air tawar. Katak jarang bergerak dari sisi amannya air. Pada tanda bahaya pertama, mereka terjun ke air dan mengubur diri mereka di lumpur dan puing-puing. Ada beberapa spesies katak beracun. Hindari katak berwarna cerah atau yang memiliki tanda \"X\" berbeda di punggungnya. Jangan membingungkan kodok dengan kodok. Anda biasanya menemukan kodok di lingkungan yang lebih kering. Beberapa jenis kodok mengeluarkan zat beracun melalui kulit mereka sebagai pertahanan melawan serangan. Karena itu, untuk menghindari keracunan, jangan mengatasinya atau memakan kodok.<br>" +
                "<br>" +
                "Salamander malam hari nokturnal. Waktu terbaik untuk menangkap mereka adalah pada malam hari dengan menggunakan cahaya. Ukurannya bisa berkisar dari beberapa sentimeter sampai panjang lebih dari 60 sentimeter. Lihatlah di air di sekitar batu dan bank lumpur untuk salamander.<br>" +
                "<br>" +
                "<b>Reptil</b><br>" +
                "Reptil adalah sumber protein yang baik dan relatif mudah ditangkap. Anda harus memasaknya, tapi dalam keadaan darurat, Anda bisa memakannya mentah-mentah. Daging mentah mereka bisa menularkan parasit, tapi karena reptil berdarah dingin, mereka tidak membawa penyakit darah pada hewan berdarah panas.<br>" +
                "<br>" +
                "Penyu kotak adalah kura-kura yang biasa ditemui sehingga Anda tidak boleh makan. Ini memakan jamur beracun dan bisa membangun racun yang sangat beracun dalam dagingnya. Memasak tidak menghancurkan toksin ini. Hindari penyu sisik, temukan di Samudera Atlantik, karena kelenjar toraksnya yang beracun. Ular beracun, buaya, buaya, dan kura-kura laut besar menghadirkan bahaya yang jelas bagi orang yang selamat.<br>" +
                "<br>" +
                "<b>Burung-burung</b><br>" +
                "Semua jenis burung bisa dimakan, meski rasanya akan bervariasi. Anda mungkin menguliti burung pemakan ikan untuk meningkatkan selera mereka. Seperti binatang liar lainnya, Anda harus memahami kebiasaan umum burung untuk memiliki kesempatan yang realistis untuk menangkapnya. Anda bisa mengambil merpati, dan juga beberapa spesies lainnya, dari tempat bertengger di malam hari dengan tangan. Selama musim sarang, beberapa spesies tidak akan meninggalkan sarang bahkan saat mendekati. Mengetahui dimana dan kapan sarang burung membuat mereka lebih mudah (Gambar 8-3). Burung cenderung memiliki jalan layang biasa dari tempat bertengger ke tempat makan, ke air, dan sebagainya. Pengamatan yang cermat harus mengungkapkan di mana jalur terbang ini berada dan menunjukkan daerah yang baik untuk menangkap burung di jaring yang terbentang di flyways (Gambar 8-4). Situs dan tempat pembuangan rumput adalah beberapa area yang paling menjanjikan untuk dijebak atau dijebak.<br>" +
                " <br>";
        String text4 =
                "<p align=\"justify\">Burung bersarang menyajikan sumber makanan lain - telur. Hapus semua kecuali dua atau tiga butir telur dari kopling, tandai yang Anda tinggalkan. Burung itu akan terus bertelur lagi untuk mengisi kopling. Lanjutkan mengeluarkan telur segar, tinggalkan yang Anda tandai.<br>" +
                "<br>" +
                "<b>Mamalia</b><br>" +
                "Mamalia adalah sumber protein yang sangat baik dan, bagi orang Amerika, sumber makanan paling lezat. Ada beberapa kekurangan untuk mendapatkan mamalia. Di lingkungan yang tidak bersahabat, musuh bisa mendeteksi perangkap atau perangkap yang ditempatkan di darat. Jumlah cedera yang dapat ditimbulkan binatang secara langsung sesuai dengan ukurannya. Semua mamalia memiliki gigi dan hampir semua akan menggigit untuk membela diri. Bahkan seekor tupai bisa menimbulkan luka serius dan gigitannya menimbulkan risiko infeksi yang serius. Selain itu, seorang ibu bisa sangat agresif dalam membela anak mudanya. Setiap binatang yang tidak memiliki jalur pelarian akan bertarung saat terpojok.<br>" +
                "<br>" +
                "Semua mamalia dapat dimakan; Namun, beruang kutub dan segel berjanggut memiliki tingkat racun vitamin A di hati mereka. Platipus, asli Australia dan Tasmania, adalah peletakan telur, mamalia semiaquatic yang memiliki kelenjar beracun. Memulung mamalia, seperti oposum, bisa membawa penyakit.<br>" +
                "<br>" +
                "<b><p align=\"center\">PERANGKAT PERIKANAN</b><br>" +
                "<p align=\"justify\">" +
                "Anda bisa membuat fishhooks, jaring dan jebakan Anda sendiri dan menggunakan beberapa metode untuk mendapatkan ikan dalam situasi bertahan hidup.<br>" +
                "<br>" +
                "<b>Kait Buatan</b><br>" +
                "Anda bisa membuat tangkapan ikan lapangan dari pin, jarum, kawat, kuku kecil, atau potongan logam lainnya. Anda juga bisa menggunakan kayu, tulang, tempurung kelapa, duri, batu api, kerang, atau kulit kura-kura. Anda juga bisa membuat fishhook dari kombinasi item-item ini (Gambar 8-17).<br>" +
                " <br>";
        String text5 =
                "<p align=\"justify\">Untuk membuat kait kayu, potong kayu keras sekitar 2,5 sentimeter dan diameternya sekitar 6 milimeter untuk membentuk betis. Potong takik di satu ujung di mana untuk menempatkan titik. Tempatkan (potongan tulang, kawat, kuku) di takik. Pegang titik di takik dan dasi dengan kencang sehingga tidak keluar dari posisi. Ini adalah kait yang cukup besar. Untuk membuat kait yang lebih kecil, gunakan material yang lebih kecil.<br>" +
                " <br>" +
                "Jurang adalah batang kecil dari kayu, tulang, logam, atau bahan lainnya. Hal ini tajam pada kedua ujungnya dan dilapisi di tengah tempat Anda mengikat pengikat. Umpan jurang dengan menempatkan umpan di atasnya memanjang. Saat ikan menelan umpan, ia juga menelan ngarai. <br>" +
                "<b>Mengintai</b><br>" +
                "Pengintaian adalah perangkat memancing yang dapat Anda gunakan di lingkungan yang tidak bersahabat (Gambar 8-18). Untuk membangun pengintaian, kendarai dua pohon muda yang subur ke dasar danau, kolam, atau sungai dengan puncaknya tepat di bawah permukaan air. Ikat kabel di antara keduanya dan sedikit di bawah permukaan. Ikat dua kabel pendek dengan kait atau gorges ke kabel ini, pastikan mereka tidak bisa membungkus kutub atau satu sama lain. Mereka juga harus tidak tergelincir sepanjang tali pusat. Umpan kait atau ngarai.<br>" +
                " <br>";
        String text6 =
                "<b><p align=\"justify\">Gill Net</b><br>" +
                "Jika jaring insang tidak tersedia, Anda dapat membuatnya dengan menggunakan garis suspensi parasut atau bahan semacam itu (Gambar 8-19). Lepaskan garis inti dari garis suspensi dan ikat pelonggaran di antara dua pohon. Lampirkan beberapa garis inti ke pelonggaran dengan menggandakannya dan mengikatnya dengan simpul prusik atau lubang lingkar. Panjang jaring yang diinginkan dan ukuran jala menentukan jumlah garis inti yang digunakan dan ruang di antara keduanya. Mulai dari satu ujung pelonggaran, dasi garis inti kedua dan ketiga bersama-sama menggunakan simpul tangan. Kemudian dasi keempat dan kelima, enam dan tujuh, dan seterusnya, sampai Anda mencapai garis inti terakhir. Anda sekarang harus memiliki semua garis inti yang terikat pasangan dengan garis inti tunggal yang tergantung di setiap ujungnya. Mulai baris kedua dengan garis inti pertama, dasi ke yang kedua, yang ketiga sampai yang keempat, dan seterusnya.<br>" +
                " <br>";
        String text7 =
                "<p align=\"justify\">Untuk menjaga barisan genap dan mengatur ukuran jaring, ikatlah sebuah pedoman ke pepohonan. Posisikan pedoman di sisi berlawanan dari jaring yang sedang Anda kerjakan. Pindahkan panduan ini setelah menyelesaikan setiap baris. Garis akan selalu menggantung berpasangan dan Anda selalu mengikat kabel dari satu pasang ke kabel dari pasangan yang berdampingan. Terus mengikat baris sampai net adalah lebar yang diinginkan. Thread garis suspensi mereda sepanjang bagian bawah net untuk memperkuatnya. Gunakan jaring insang seperti ditunjukkan pada Gambar 8-20.<br>" +
                " <br>";
        String text8 =
                "<b><p align=\"justify\">Perangkap ikan</b><br>" +
                "Anda bisa menjebak ikan dengan menggunakan beberapa metode (Gambar 8-21). Keranjang ikan adalah satu metode. Anda membangunnya dengan memukul beberapa batang pohon dengan tanaman merambat menjadi corong. Anda menutup bagian atas, meninggalkan lubang yang cukup besar agar ikan bisa berenang.<br>" +
                " <br>";
        String text9 =
                "<p align=\"justify\">Anda juga bisa menggunakan perangkap untuk menangkap ikan air asin, karena sekolah secara teratur mendekati pantai dengan arus masuk dan sering bergerak sejajar dengan pantai. Pilih lokasi pada saat pasang dan bangun perangkap saat air surut. Di pantai berbatu, gunakan kolam batu alami. Di pulau karang, gunakan kolam alami di permukaan terumbu dengan menghalangi bukaan saat air surut surut. Di tepian berpasir, gunakan sandbars dan parit yang dilampirkan. Bangun jebakan sebagai dinding batu rendah yang membentang keluar ke dalam air dan membentuk sudut dengan pantai.<br>" +
                "<br>" +
                "<b>Spearfishing</b><br>" +
                "Jika Anda berada di dekat perairan dangkal (sekitar pinggang dalam) di mana ikannya besar dan berlimpah, Anda bisa menancapkannya. Untuk membuat tombak, potonglah pohon jambul yang panjang dan lurus (Gambar 8-22). Pertajam ujung ke titik atau lekatkan pisau, potongan tulang yang bergerigi, atau logam yang tajam. Anda juga bisa membuat tombak dengan membelah poros beberapa inci dari ujungnya dan memasukkan sepotong kayu untuk bertindak sebagai penyebar. Anda kemudian mempertajam kedua bagian yang terpisah menjadi poin. Untuk tombak ikan, temukan area dimana ikan bisa berkumpul atau dimana ada ikan yang lari. Tempatkan titik tombak ke dalam air dan perlahan gerakkan ke arah ikan. Lalu, dengan dorongan tiba-tiba, menusuk ikan di dasar sungai. Jangan mencoba mengangkat ikan dengan tombak, karena dengan kemungkinan tergelincir dan Anda akan kehilangannya; Pegang tombak dengan satu tangan dan ambil dan pegang ikan itu dengan yang lain. Jangan melempar tombak, apalagi kalau intinya adalah pisau. Anda tidak bisa kehilangan pisau dalam situasi bertahan hidup. Waspada terhadap masalah yang disebabkan oleh refrakti cahaya saat melihat benda di air.. <br>" +
                "<br>";
        String text10 =
                "<b><p align=\"justify\">Chop Fishing</b> <br>" +
                "Pada malam hari, di daerah dengan kepadatan ikan yang bagus, Anda bisa menggunakan cahaya untuk menarik ikan. Kemudian, dipersenjatai dengan parang atau senjata sejenis, Anda bisa mengumpulkan ikan menggunakan sisi belakang pisau untuk menyerang mereka. Jangan menggunakan sisi yang tajam karena Anda akan memotongnya menjadi dua bagian dan akhirnya kehilangan beberapa ikan.<br>" +
                "<br>" +
                "<b>Racun ikan<br></b>" +
                "Cara lain untuk menangkap ikan adalah dengan menggunakan racun. Racun bekerja dengan cepat. Hal ini memungkinkan Anda untuk tetap tersembunyi saat mulai berlaku. Ini juga memungkinkan Anda menangkap beberapa ikan sekaligus. Bila menggunakan racun ikan, pastikan untuk mengumpulkan semua ikan yang terkena dampaknya, karena banyak ikan mati yang mengambang di hilir bisa menimbulkan kecurigaan. Beberapa tanaman yang tumbuh di daerah hangat di dunia mengandung rotenone, zat yang stuns atau membunuh hewan berdarah dingin namun tidak membahayakan orang yang memakan hewan. Tempat terbaik untuk menggunakan pabrik rotenone, atau rotenone, ada di kolam atau kepala sungai kecil yang mengandung ikan. Rotenone bekerja dengan cepat pada ikan dengan air 21 derajat C (70 derajat F) atau lebih. Ikan itu naik tak berdaya ke permukaan. Ia bekerja perlahan dalam air 10 sampai 21 derajat C (50 sampai 70 derajat F) dan tidak efektif dalam air di bawah 10 derajat C (50 derajat F). Tanaman berikut, yang digunakan seperti yang ditunjukkan, akan setrum atau membunuh ikan:<br>" +
                "<p align=\"justify\">Anamirta cocculus (Gambar 8-23). Pohon anggur berkayu ini tumbuh di Asia selatan dan di kepulauan Pasifik Selatan. Hancurkan biji berbentuk kacang dan buang ke dalam air.<br>" +
                "<p align=\"justify\">Croton tiglium (Gambar 8-23). Semak atau pohon kecil ini tumbuh di daerah limbah di kepulauan Pasifik Selatan. Ini mengandung biji dalam tiga kapsul siku. Hancurkan biji dan buang ke dalam air.\n" +
                "<p align=\"justify\">Barringtonia (Gambar 8-23). Pohon-pohon besar ini tumbuh di dekat laut di Malaya dan sebagian wilayah Polinesia. Mereka menghasilkan buah unggulan satu. Hancurkan biji dan kulit kayu dan buang ke dalam air.\n" +
                "<p align=\"justify\">Derris eliptica (Gambar 8-23). Genus besar semak tropis dan tanaman merambat kayu ini adalah sumber utama rotenone yang diproduksi secara komersial. Menggiling akar menjadi bubuk dan bercampur dengan air. Lemparkan sejumlah besar campuran ke dalam air.\n" +
                "<p align=\"justify\">Duboisia (Gambar 8-23). Semak ini tumbuh di Australia dan beruang putih dengan bunga dan buah yang berry. Hancurkan tanaman dan buang ke dalam air.\n" +
                "<p align=\"justify\">Tephrosia (Gambar 8-23). Spesies semak kecil ini, yang mengandung kacang seperti kacang, tumbuh di seluruh daerah tropis. Menghancurkan atau memar bundel daun dan batang dan membuangnya ke dalam air.\n" +
                "<p align=\"justify\">Jeruk nipis. Anda bisa mendapatkan jeruk nipis dari sumber komersial dan di daerah pertanian yang menggunakan jumlah besar itu. Anda bisa menghasilkan sendiri dengan membakar koral atau kulit kerang. Lemparkan kapur ke dalam air.\n" +
                "<p align=\"justify\">Sekam padi. Hancurkan sekam hijau dari butternuts atau kenari hitam. Lemparkan sekam ke dalam air.\n" +
                " <br>";
        String text11 =
                "<p align=\"center\"><b>IKAN DAN BINATANG BURUAN UNTUK MEMASAK DAN SIMPANAN</b><br>" +
                "<p align=\"justify\">" +
                "Anda harus tahu bagaimana menyiapkan ikan dan binatang buruan untuk memasak dan menyimpan dalam situasi bertahan hidup. Pembersihan atau penyimpanan yang tidak benar bisa mengakibatkan ikan atau permainan yang tidak sedap.<br>" +
                "<br>" +
                "<b>Ikan</b><br>" +
                "Jangan makan ikan yang nampak manja. Memasak tidak memastikan bahwa ikan manja akan dapat dimakan. Tanda pembusukan adalah--<br>" +
                "<ul><li>Mata cekung.</li>" +
                "<li>Bau aneh.</li>" +
                "<li>Mencurigakan warna. (Gills harus merah sampai merah muda. Timbangan harus diberi warna abu-abu yang jelas, tidak pudar.)</li>" +
                "<li>Dents tinggal di daging ikan setelah menekannya dengan ibu jari Anda.</li>" +
                "<li>Lembut, bukan lembab atau badan basah.</li>" +
                "<li>Rasa tajam atau pedas.</li>" +
                "</ul><p align=\"justify\">Makan ikan manja atau busuk dapat menyebabkan diare, mual, kram, muntah, gatal, kelumpuhan, atau rasa logam di mulut. Gejala ini muncul tiba-tiba, satu sampai enam jam setelah makan. Induce muntah jika gejala muncul.<br>" +
                "<br>" +
                "Rampasan ikan cepat setelah kematian, terutama di hari yang panas. Siapkan ikan untuk dimakan sesegera mungkin setelah menangkapnya. Potong insang dan pembuluh darah besar yang berada di dekat tulang belakang. Ikan galah yang panjangnya lebih dari 10 sentimeter. Skala atau kulit ikan.<br>" +
                "<br>" +
                "Anda bisa menusuk seluruh ikan di atas tongkat dan memasaknya di atas api terbuka. Namun, mendidih ikan dengan kulit adalah cara terbaik untuk mendapatkan nilai makanan paling banyak. Lemak dan minyak ada di bawah kulit dan, dengan cara mendidih, Anda bisa menyimpan cairan untuk kaldu. Anda bisa menggunakan salah satu metode yang digunakan untuk memasak makanan nabati untuk memasak ikan. Bungkus ikan ke dalam bola tanah liat dan kuburkan di bara api sampai tanah liat mengeras. Break membuka bola tanah liat untuk sampai ke ikan yang dimasak. Ikan dilakukan saat dagingnya serpih. Jika Anda berencana untuk menjaga ikan nanti, merokok atau goreng. Untuk mempersiapkan ikan untuk merokok, potong kepala dan lepaskan tulang belakangnya.<br>" +
                "<b>Ular</b><br>" +
                "Untuk menguliti seekor ular, pertama memotong kepalanya dan menguburnya. Kemudian potong kulit ke bawah tubuh 15 sampai 20 sentimeter (Gambar 8-24). Kupas kulit kembali, lalu pegang kulit di satu tangan dan tubuh di tangan yang lain dan tarik terpisah. Pada ular berbisa besar yang mungkin diperlukan untuk menggosok kulit perut. Ular ular dengan cara yang sama seperti permainan kecil. Lepaskan isi perut dan buang. Potong ular menjadi bagian kecil dan rebus atau panggang.<br>" +
                " <br>";
        String text12 =
                "<b><p align=\"justify\">Burung-burung</b><br>" +
                "Setelah membunuh burung tersebut, lepaskan bulu-bulunya dengan cara memetik atau menguliti. Ingat, menguliti menghilangkan beberapa nilai makanan. Bukalah rongga tubuh dan lepaskan isi perutnya, simpan perayap (pada unggas pemakan benih), jantung, dan hati. Potong kaki. Masak dengan merebus atau memanggang meludah. Sebelum memasak burung pemulung, rebus mereka setidaknya 20 menit untuk membunuh parasit.<br>" +
                "<br>" +
                "<b>Menguliti dan Memotong Binatang Buruan</b><br>" +
                "Dinginkan hewan itu dengan memotong tenggorokannya. Jika memungkinkan, bersihkan bangkai di dekat sungai. Tempatkan perut bangkai dan belah kulit dari tenggorokan ke ekor, potong-potong semua organ seksual (Gambar 8-25). Lepaskan kelenjar musk pada titik A dan B untuk menghindari tercorengnya daging. Untuk mamalia yang lebih kecil, potong kulit disekitar tubuh dan masukkan dua jari di bawah sembunyi di kedua sisi potongan dan tarik kedua potongannya (Gambar 8-26).<br>" +
                "<br>" +
                "Catatan: Saat memotong kulitnya, masukkan pisau di bawah kulit dan balikkan mata pisau sehingga hanya kulit yang dipotong. Ini juga akan mencegah pemotongan rambut dan mendapatkannya pada daging.<br>" +
                " <br>";
        String text13 =
                "<p align=\"justify\">Lepaskan isi perut dari permainan yang lebih kecil dengan membelah badan dan menariknya keluar dengan jari. Jangan lupakan rongga dada. Untuk permainan yang lebih besar, potong kerongkongan dari diafragma. Gulingkan isi perut keluar dari tubuh. Potong sekitar anus, lalu rapatkan ke rongga perut bagian bawah, pegang bagian bawah usus, dan tarik untuk melepaskannya. Keluarkan kandung kemih dengan mencubitnya dan memotongnya di bawah jari. Jika Anda menumpahkan urin pada daging, cuci agar tidak tercemar daging. Selamatkan hati dan hati. Potong ini terbuka dan periksa tanda cacing atau parasit lainnya. Juga periksa warna hati; itu bisa menunjukkan hewan sakit. Permukaan hati harus halus dan basah dan warnanya merah tua atau ungu. Jika hati tampak sakit, buang saja. Namun, hati yang berpenyakit tidak menunjukkan bahwa Anda tidak bisa memakan jaringan otot.<br>" +
                "<br>" +
                "Potong sepanjang setiap kaki dari atas kaki ke potongan tubuh yang sebelumnya dibuat. Lepaskan sembunyi dengan menariknya dari bangkai, potong jaringan ikat bila diperlukan. Potong kepala dan kaki.<br>" +
                "<br>" +
                "Potong permainan yang lebih besar menjadi potongan yang mudah dikelola. Pertama, iriskan jaringan otot yang menghubungkan kaki depan ke tubuh. Tidak ada tulang atau sendi yang menghubungkan kaki depan dengan tubuh pada hewan berkaki empat. Potong garpu belakang dari tempat mereka bergabung dengan tubuh. Anda harus memotong sekitar tulang besar di bagian atas kaki dan memotong bola dan sendi soket pinggul. Potong ligamen di sekitar sendi dan tekuk kembali untuk memisahkannya. Lepaskan otot besar (tenderloin) yang ada di kedua sisi tulang belakang. Pisahkan tulang rusuk dari tulang punggung. Ada sedikit pekerjaan dan kurang pakai pada pisau Anda jika Anda mematahkan tulang rusuk terlebih dahulu, lalu memotong melalui jeda.<br>" +
                "<br>" +
                "Masak potongan daging besar di atas meludah atau rebus mereka. Anda bisa rebus atau merebus potongan-potongan kecil, terutama yang menempel pada tulang setelah membantai awal, seperti sup atau kaldu. Anda bisa memasak organ tubuh seperti hati, hati, pankreas, limpa, dan ginjal dengan menggunakan metode yang sama seperti untuk daging otot. Anda juga bisa memasak dan memakan otak. Potong lidah keluar, kulitkan, rebus sampai lunak, dan memakannya.<br>" +
                "<br>" +
                "<b>Mengasapkan Daging<br></b>" +
                "Untuk mengisap daging, siapkan kandang di sekitar api (Gambar 8-27). Dua ponco yang bentak bersama akan bekerja. Api tidak perlu besar atau panas. Tujuannya adalah untuk menghasilkan asap, bukan panas. Jangan menggunakan kayu resin di dalam api karena asapnya akan merusak daging. Gunakan kayu keras untuk menghasilkan asap yang bagus. Kayu harus agak hijau. Jika terlalu kering, rendam. Potong daging menjadi irisan tipis, tebal tidak lebih dari 6 sentimeter, dan gantungkan mereka di atas kerangka kerja. Pastikan tidak ada daging yang menyentuh bagian lain. Jaga agar tutup poncho di sekitar daging menahan asap dan awasi api. Jangan biarkan api menjadi terlalu panas. Daging yang dihisap semalam dengan cara ini akan berlangsung sekitar 1 minggu. Dua hari terus merokok akan melestarikan daging selama 2 sampai 4 minggu. Daging asap yang benar akan terlihat seperti batang yang gelap, melengkung, rapuh dan Anda bisa memakannya tanpa memasak lebih lanjut. Anda juga bisa menggunakan lubang untuk menghisap daging (Gambar 8-28).<br>" +
                "<br>";
        String text14 =
                "<b><p align=\"justify\">Pengeringan Daging</b><br>" +
                "Untuk melestarikan daging dengan cara mengeringkan, potong menjadi 6 milimeter dengan gandum. Gantungkan potongan daging di rak di tempat yang cerah dengan aliran udara yang baik. Jauhkan strip dari jangkauan hewan dan tutupi untuk mencegah pembengkakan. Biarkan dagingnya benar-benar kering sebelum makan. Daging yang dikeringkan dengan benar akan memiliki tekstur yang kering dan segar dan tidak akan terasa sejuk jika disentuh.<br>" +
                "<br>" +
                "<b>Metode Pelestarian Lainnya</b><br>" +
                "Anda juga bisa menjaga daging dengan metode pembekuan atau air asin dan garam.<br>" +
                "<br>" +
                "<b>Pembekuan</b><br>" +
                "Di iklim dingin, Anda bisa membekukan dan menyimpan daging tanpa batas waktu. Pembekuan bukanlah sarana menyiapkan daging. Anda tetap harus memasaknya sebelum makan.<br>" +
                " <br>" +
                "<b>Air garam dan garam</b><br>" +
                "Anda bisa memelihara daging dengan merendamnya dengan benar dalam larutan air asin. Solusinya harus menutupi dagingnya. Anda juga bisa menggunakan garam dengan sendirinya. Cuci garam sebelum dimasak.<br>" +
                "<br><i>Departemen Petahanan Amerika Serikat, US Army Field Manual \"Survival\" (FM 21-76), Markas Besar Departemen Tentara Amerika Serikat 1956.";
        String foto1 = "<p align=\"center\"><img src=\"makanan/makanan1.png\"></p>";
        String foto2 = "<p align=\"center\"><img src=\"makanan/makanan2.png\"></p>";
        String foto3 = "<p align=\"center\"><img src=\"makanan/makanan3.png\"></p>";
        String foto4 = "<p align=\"center\"><img src=\"makanan/makanan4.png\"></p>";
        String foto5 = "<p align=\"center\"><img src=\"makanan/makanan5.png\"></p>";
        String foto6 = "<p align=\"center\"><img src=\"makanan/makanan6.png\"></p>";
        String foto7 = "<p align=\"center\"><img src=\"makanan/makanan7.png\"></p>";
        String foto8 = "<p align=\"center\"><img src=\"makanan/makanan8.png\"></p>";
        String foto9 = "<p align=\"center\"><img src=\"makanan/makanan9.png\"></p>";
        String foto10 = "<p align=\"center\"><img src=\"makanan/makanan10.png\"></p>";
        String foto11 = "<p align=\"center\"><img src=\"makanan/makanan11.png\"></p>";
        String foto12 = "<p align=\"center\"><img src=\"makanan/makanan12.png\"></p>";
        String foto13 = "<p align=\"center\"><img src=\"makanan/makanan13.png\"></p>";
        String foto14 = "<p align=\"center\"><img src=\"makanan/makanan14.png\"></p>";
        view.loadDataWithBaseURL("file:///android_asset/", foto1+ text1 +foto2+text2+foto3+text3+foto4+text4+foto5+text5+foto6+text6+foto7+text7+foto8+text8+foto9+text9+foto10+text10+ foto11+ text11 +foto12+text12+foto13+text13+foto14+text14 , "text/html", "utf-8", null);
        return rootView;
    }

}
