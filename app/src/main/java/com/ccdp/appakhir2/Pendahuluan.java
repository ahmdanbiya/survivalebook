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
public class Pendahuluan extends Fragment {


    public Pendahuluan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_pendahuluan,
                container, false);
        WebView view = (WebView) rootView.findViewById(R.id.pendahuluan1);
        String text = "<p align=\"justify\"><b>PENGERTIAN SURVIVAL</b> <br>" +
                "PENGETAHUAN DASAR DALAM SURVIVAL<br>" +
                "<br>" +
                "Bagi anda yang pernah  mengikuti kegiatan Kepecinta-Alaman tentunya sangat kenal degan istilah Survival, karena untuk menjadi seorang anggota pecinta-Alam pengetahuan tentang Survival adalah salah satu pengetahuan dasar yang wajib dimiliki, baik didapatkan saat Pendidikan Dasar di Ruangan (PDR) dan Pendidikan Dasar di Lapangan (PDL). Dari pengertian Survival, Survival Kit sampai tentang Teknik Survival merupakan syarat mutlak yang harus dikuasai.<br>" +
                "<br>" +
                "Selama ini banyak versi yang menjelaskan tentang pengertian survival.kalau berdasarkan dari asal-usul kata Survival adalah berasal dari bahasa inggris survive atau to survive yang artinya bertahan hidup. Yang dimaksud disini adalah kemampuan untuk dapat bertahan hidup dari keadaan yang kurang menguntungkan sampai terjalin komunikasi dengan pihak luar. Survival dapat juga diartikan sebagai upaya untuk mempertahankan hidup dan keluar dari keadaan yang sulit atau kritis. Dalam arti yang sempit, survival digunakan dalam kaitan dengan keadaan-keadaan darurat yang terjadi karena terisolasinya seseorang atau sekelompok orang (disebut sebagai SURVIVOR) akibat suatu musibah atau kecelakaan. Keadaan tersebut antara lain tersesat di hutan, terdampar di pulau atau pesawat yang terjatuh disuatu tempat asing. Akibatnya survivor mengalami kesulitan berkomunikasi dengan masyarakat luas dan dengan demikian sukar mendapatkan bantuan atau pertolongan yang diperlukan.<br>" +
                "<br>" +
                "Pengertian Survival dalam <b>Buku Panduan (Pedoman) yang di Keluarkan oleh Institusi Tentara Amerika Serikat ; \"FM 21-76\"</b> atau sebut juga <b>\"FM 3-05.70\"</b> yang diterbitkan pada bulan Mei 2002 dalam Bab 1 tentang pendahuluan dijelaskan apa itu Survival. Di dalam Panduan ini pengertian tentang survival didasarkan sepenuhnya dari huruf pembentuk dari kata <b>“SURVIVAL“</b> itu sendiri. Dimana arti dari Huruf dalam kata ini akan dapat membantu membimbing Anda bertindakan dalam setiap situasi untuk bertahan hidup (Survival). Pelajarilah apa arti dari setiap huruf tersebut dan selalu berlatih menerapkan panduan ini ketika melakukan pelatihan bertahan hidup. serta harus selalu dicamkan pada batin kita, pikiran kita dan insting kita tentang arti dari kata <b>SURVIVAL</b>, seperti yang dijabarkan dibawah ini :<br>" +
                "<br>" +
                "S - Size Up the Situation <br>" +
                "Pahami Situasi</b><br>" +
                "<br>" +
                "Disaat kita berada dalam kondisi survival ingatlah selalu, gunakan indra pendengaran, penciuman, dan penglihatan untuk merasakan situasi yang terjadi disekitar anda. Tentukan keadaan situasi, Anda harus mempertimbangkan apa yang berkembang di sekitar anda ketika Anda membuat rencana hidup Anda.<br>" +
                "<ul><li><p align=\"justify\">Lingkungan, Tentukan pola daerah disekitar Anda. Rasakan  apa yang terjadi di sekitar Anda. Setiap lingkungan, baik hutan, gunung, pantai atau gurun, memiliki irama atau pola tersendiri. Hal ini termasuk hewan dan suara dan gerakan burung dan suara serangga.</li>" +
                "<li><p align=\"justify\">Kondisi Fisik, periksa kondisi yang terjadi disekitar Anda, apakah berada dalam trauma (terluka), karena saat berada dalam situasi bertahan hidup (survival) mungkin sekali telah menyebabkan Anda mengabaikan luka yang Anda terima. Periksa luka Anda dan berikan diri pertolongan pertama (P3K). Berhati-hatilah untuk mencegah ancaman fisik lebih lanjut. Misalnya, dalam iklim apapun, minumlah banyak air untuk mencegah dehidrasi. Jika Anda berada di iklim dingin atau basah, kenakan pakaian tambahan untuk mencegah hipotermia.</li>" +
                "<li><p align=\"justify\">P eralatan, Mungkin dalam ketika berada dalam kondisi survival, beberapa peralatan Anda hilang atau rusak. Periksa dan lihat apa saja peralatan yang Anda miliki dan dan kondisi dari peralatan tersebut. Setelah Anda menaksir situasi, lingkungan, kondisi fisik, dan peralatan, Saatnya Anda bersiap untuk membuat rencana bertahan hidup. Dalam  melakukan persiapan tersebut juga harus diperhatikan kebutuhan  dasar fisik Anda, seperti kebutuhan air, makanan, dan perlindungan (shelter).</li>" +
                "</ul>" +
                "<p align=\"justify\">U - Use All Your Senses,  <br>" +
                "(Undue Haste Makes Waste)<br>" +
                "Gunakan Semua Akal Sehat dan Rasa Anda</b><br>" +
                "<br>" +
                "Kita harus selalu memikirkan dan memperhitungkan tindakan demi tindakan yang akan kita lakukan, karena tindakan yang terburu-buru cenderung sia-sia dan membahayakan diri :<br>" +
                "<ul><li><p align=\"justify\">Anda dapat saja membuat satu langkah yang salah, ketika Anda bereaksi terlalu cepat tanpa berpikir terlebih dahulu atau membuat perencanaan. Langkah yang justru dapat mengakibatkan kematian. Jangan bergerak hanya demi untuk mengambil tindakan. Pertimbangkan seluruh aspek dari situasi Anda, sebelum Anda membuat keputusan dan bergerak.</li>" +
                "<li><p align=\"justify\">Jika Anda bertindak tergesa-gesa, akan memungkinkan  Anda lupa atau kehilangan beberapa peralatan Anda. Dalam kondisi tergesa-gesa, Anda juga dapat menjadi bingung, sehingga Anda tidak tahu mana cara yang harus digunakan untuk pergi. Rencanakan langkah Anda.</li>" +
                "<li><p align=\"justify\">Bersiaplah untuk bergerak cepat tanpa membahayakan diri sendiri. Gunakan semua indera Anda untuk mengevaluasi situasi.</li>" +
                "<li><p align=\"justify\">Catat dan ingat suara dan bau disekitar Anda. Jadilah sensitif terhadap perubahan suhu. Selalu waspada dan jeli.</li>" +
                "</ul>" +
                "<p align=\"justify\">R - Remember Where You Are <br>" +
                "Ingat Dimana Anda Ada.</b><br>" +
                "<ul><li><p align=\"justify\">Tandai  lokasi Anda di peta dan cocokkan dengan keadaan daerah sekitarnya, hal ini adalah salah satu Prinsip Dasar yang  harus selalu Anda ikuti. Jika ada orang lain bersama Anda, pastikan mereka juga tahu lokasi mereka. Selalu tahu siapa yang ada dalam kelompok Anda, terutama yang memiliki peta dan kompas. Perhatikan dengan teliti di mana Anda berada dan ke mana Anda akan pergi. Jangan hanya saling mengandalkan orang lain dalam kelompok untuk melacak rute. Anda juga harus melakukan orientasi sendiri. dan dilakukan dengan efisien dengan bergantian jangan berbarengan.</li>" +
                "<li><p align=\"justify\">Selalu mencoba untuk menentukan rute yang minimal atau efisien yang harus ditempuh berkaitan dengan lokasi Anda lokasi Anda dengan sumber air (biasanya kalau digurun) dan lokasi yang akan dituju. Informasi ini akan memungkinkan Anda untuk membuat keputusan cerdas ketika Anda berada dalam situasi bertahan hidup (survival) dan dalam kegelapan.</li>" +
                "</ul>" +
                "<p align=\"justify\">V - Vanquish Fear and Panic <br>" +
                "Kuasai Rasa Takut dan Panik</b><br>" +
                "<br>" +
                "Musuh terbesar dalam bertahan hidup (survival) adalah rasa takut dan panik. Jika tidak dikontrol, mereka dapat menghancurkan kemampuan Anda untuk membuat keputusan cerdas. Mereka dapat menyebabkan Anda untuk jadi kurang atau bahkan susah bereaksi terhadap perasaan dan imajinasi pada situasi Anda. Emosi  (rasa takut dan panic) ini bisa menguras energi Anda dan dapat menyebabkan emosi negatif lainnya timbul yag justru akan semaki meperparah keadaan. mempersiapkan diri jauh sebelumnya untuk bertahan hidup dan mendapatkan pembekalan kemampuan untuk bertahan hidup serta pembekalan tentang cara-cara keluar dari kondisi tersebut (survival) dan kepercayaan diri akan memungkinkan Anda untuk mengalahkan rasa takut dan panik.<br>" +
                "<br>" +
                "<p align=\"justify\">I - Improvise <br>" +
                "Berimprovisasi</b><br>" +
                "<ul><li><p align=\"justify\">Di Rumah atau lingkungan tempat tinggal, kita memiliki item yang tersedia untuk semua kebutuhan kita. Banyak dari barang-barang yang murah yang dapat digunakan untuk menggantikan dan meperbaiki barang saat rusak. Mudah datang, mudah pergi , mudah mendapatkan ganti adalah budaya kita yang membuat kita tidak perlu atau tidak siap untuk berimprovisasi. Pengalaman yang tergantung dengan segala kondisi selalu ada atau dengan mudah tersedia\" bisa menjadi musuh dalam situasi hidup. Belajarlah untuk berimprovisasi. Ambil alat yang dirancang untuk tujuan tertentu dan melihat berapa banyak kegunaan lain yang mungkin dapat Anda kembangkan dari hanya sekedar kegunaan standar atau yang sudah biasa.</li>" +
                "<li><p align=\"justify\">Pelajari untuk menggunakan benda-benda di alam sekitar Anda untuk memenuhi kebutuhan yang berbeda, Contohnya adalah menggunakan batu untuk palu. Tidak peduli seberapa lengkap survival kit Anda miliki yang ada pada Anda, karena alat tersebut akan habis atau aus setelah beberapa waktu lamanya. \"<i>Imajinasi Anda harus mengambil alih ketika survival kit Anda habis dipakai</i>\".</li>" +
                "</ul>" +
                "<p align=\"justify\">V - Value Living  <br>" +
                "Menghargai Hidup</b><br>" +
                "<br>" +
                "Kita semua saat baru lahir didunia akan menendang dan berjuang untuk hidup, tapi dalam perjalanan hidup kita akhirnya kita telah menjadi terbiasa dengan kehidupan tenang, menjadi makhluk selalu penuh dengan kenyamanan, Kita tidak menyukai ketidaknyamanan. Apa yang terjadi ketika kita dihadapkan dengan situasi hidup yang penuh tekanan, terganggu dengan keterbatasan, dan ketidaknyamanan? Hal ini adalah berhubungan dengan kemauan untuk hidup, menempatkan tinggi pada nilai hidup adalah sesuatu yang sangat penting. Pengalaman dan pengetahuan yang Anda dapatkan melalui kehidupan dan pelatihan akan memiliki landasan yang kuat pada kemauan Anda untuk hidup. \"<i>Keras kepala, penolakan untuk menyerah pada masalah dan kendala yang dihadapi Anda, akan memberikan kekuatan mental dan fisik untuk bertahan</i>\".<br>" +
                "<br>" +
                "A - Act Like the Natives <br>" +
                "Bertindak Seperti Penghuni Asli</b><br>" +
                "<br>" +
                "Penduduk asli dan hewan yang ada di daerah sekitar adalah penghuni yang telah beradaptasi dengan lingkungan mereka. Untuk mendapatkan nuansa dan kebiasaan daerah, melihat bagaimana mahluk hidup dilingkungan sekitar kita?, Kapan dan apa yang mereka makan? Kapan, di mana, dan bagaimana mereka mendapatkan makanan mereka? Kapan dan di mana mereka pergi untuk memperoleh  air? Adalah hal yang sangat penting bagi Anda, ketika Anda mencoba untuk bertahan hidup, menghindari interaksi degan binatang atau tumbuhan yang berbahaya, atau apa saja yang aman untuk dimakan, hal ini sangat penting untuk dipelajari, yang terutama sebenar setiap kita akan beraktivitas di alam bebas, diusahakan untuk mempelajari lingkungan dan penghuni dan apa yang ada dihabitat, yang berbahaya atau aman buat kita. Kehidupan hewan di daerah tersebut juga dapat memberikan petunjuk tentang cara untuk bertahan hidup. Hewan juga membutuhkan makanan, air, dan tempat tinggal. Dengan mempelajari dan mengamati kebiasaan mereka, Anda dapat menemukan sumber-sumber air dan makanan.<br>" +
                "<br>" +
                "<font color=\"red\">PERINGATAN<br>" +
                "Binatang tidak selalu dapat dijadikan panduan mutlak untuk apa yang dapat Anda makan dan minum . Banyak hewan makan tumbuhan yang beracun bagi manusia.<br>" +
                "<br>" +
                "Perlu diingat jika kondisi survival tidak sendiri tetapi dengan orang lain, dengan mempelajari karakter orang-orang, belajar untuk menghormati mereka, sering membuat teman-teman yang berharga, dan, yang paling penting adalah belajar bagaimana beradaptasi dengan lingkungan mereka dan meningkatkan kesempatan Anda untuk bertahan hidup.</font><br>" +
                "<br>" +
                "L - Live by Your Wits, But for Now, Learn Basic Skills <br>" +
                "Hidup dengan kemampuan dari alam, Mulai dari sekarang , Belajar Keterampilan Dasar.</b><br>" +
                "<br>" +
                "Tanpa pelatihan keterampilan dasar untuk bertahan dan menghindari  bahaya, peluang Anda untuk hidup melalui situasi bertahan hidup dalam kondisi keterbatasan dan  minimnya pendukung hidup akan sangat kecil kemungkinannya bisa membuat Anda mampu melewati atau selamat. Pelajari keterampilan dasar ini sekarang - tidak ketika Anda menuju atau berada dalam kondisi survival. Bagaimana Anda memutuskan untuk melengkapi diri sebelum terjadi akan mempengaruhi apakah Anda bisa bertahan hidup. Anda perlu tahu tentang lingkungan yang akan Anda hadapi, dan Anda harus berlatih keterampilan dasar disesuaikankan dengan lingkungan tersebut. Misalnya, jika Anda pergi ke gurun atau saat dihutan tropis, Anda perlu tahu bagaimana cara untuk mendapatkan air. Sehingga mengharuskan Anda untuk selalu berlatih dan mempraktekan keterampilan dasar untuk bertahan hidup. Pelatihan dan penguasaan pengetahuan untuk bertahan hidup akan mengurangi ketakutan akan rasa ketidak-tahuan dan akan memberi Anda kepercayaan diri. Ini mengajarkan Anda untuk hidup dengan akal dan keahlian anda.<br>" +
                "<br>" +
                "<i>Selain pengertian dasar tentang survival di atas, ada yang harus dipelajari, di kuasai tentang mengetahui Pola untuk Survival.</i><br>" +
                "<br>" +
                "<b>PATTERN FOR SURVIVAL <br>" +
                "POLA UNTUK BERTAHAN HIDUP<br>" +
                "</b><br>" +
                "Mengembangkan pola bertahan hidup (kemampuan Survival) akan memungkinkan Anda untuk bertahan hidup. Pola hidup ini harus mencakup makanan, air, tempat tinggal, Api, pertolongan pertama (P3K), dan pengetahuan tentang penggunaan sinyal, membuat tempat perlindungan. Pengurutan pola ini disesuaikan dalam urutan kepentingan. Sebagai contoh, dalam lingkungan yang dingin, Anda akan membutuhkan api untuk mendapatkan hangat, sebuah tempat penampungan untuk melindungi Anda dari dingin, angin, dan hujan, perangkap atau jerat untuk mendapatkan makanan, sarana untuk sinyal yang dapat dikenali oleh tim pencari, dan pertolongan pertama untuk menjaga kesehatan. Jika Anda terluka, pertolongan pertama memiliki prioritas utama tidak peduli apa iklim Anda masuk. Satu hal yang sangat penting dalam kondisi Survival adalah mengubah pola hidup Anda untuk memenuhi kebutuhan fisik Anda harus menyesuaikan dengan lingkungan disekitar karena dihadapkan pada perubahan lingkungan. <br>" +
                "<br>" +
                "Banyak orang menganggap, membawa benda-benda untuk alat bertahan hidup di alam bebas (Survival Kit) sewaktu bepergian, rasanya ribet atau bikin repot. Tapi bagi kita yang mempunyai hobi di alam bebas sebagai penggiat pecinta alam, dituntut untuk mampu mengantisipasi suatu keadaan darurat sampai hal yang kecil sekalipun sangat diperlukan. Telah banyak kejadian yang membuktikan pada peristiwa kecelakaan di laut dan udara, korban yang kebetulan selamat kebanyakan tidak siap bertahan hidup. Padahal upaya penyelamatan oleh tim SAR atau polisi belum tentu datang segera. Tak ada pilihan lain, korban harus bertahan hidup di alam yang sama sekali asing. Jika tanpa persiapan, ditambah kelelahan mental dan fisik, nyawa bisa jadi taruhannya. Hal ini secara tidak langsung dan tidak dapat kita duga, dapat terjadi pada siapa saja dan di mana saja. Bagimana jika mimpi buruk tersebut terjadi pada diri kita, apa yang dapat kita lakukan dan kita perbuat jika kita berada dalam keadaan tersebut. <br>" +
                "<br>" +
                "Persiapan menghadapi situasi buruk sebenarnya sederhana. Sebelum perjalanan, paling tidak semua perlengkapan penyelamatan diri yang standar sudah disiapkan. Misalnya, jika akan berperahu melintasi sungai atau laut, siapkan pelampung yang memadai. <b><i>”jangan menyepelekan alat-alat standar! Karena inilah gantungan hidup kita kalau terjadi sesuatu”</b></i>. Dalam melakukan perjalanan kita harus mempersiapkan bekal pribadi, terutama peralatan bertahan hidup (Survival Kit), juga harus memadai. Barang-barang kecil yang amat sangat vital harus tersedia, seperti lampu senter, korek api, pisau lipat kecil, peralatan jahit, pluit, tisu basah, perlengkapan P3K, obat-obatan, dan lain sebagainya. Meski perjalanan dirasa tidak terlalu jauh, biasakan juga untuk selalu membawa makanan dan minuman cadangan. Setelah semuanya siap, tempatkan peralatan dan perlengkapan tadi kedalam sebuah wadah atau tas yang memenuhi syarat, seperti cukup ringan, kuat dan tahan air. Buat perbedaan antara wadah tadi dengan tas atau barang-barang lain, agar mudah dikenali. Tempatkan juga di ruang yang mudah terjangkau, jangan sampai kita bingung harus memprioritaskan barang mana yang harus diselamatkan saat kecelakaan.<br>" +
                "<br>" +
                "Untuk selalu mengingat dan mencamkan dalam pikiran dan batin kita saat beraktivitas di alam bebas, dan selalu mempersiapkan diri dalam kondisi apapun, karena didalam kata dasar dari \"SURVIVAL\", pada setiap huruf member kita pemahaman, dan dibutuhan kemauan dan kperdulian kita bahwa untuk memahami tentang pola untuk bertahan hidup adalah sesuatu yang wajib kita miliki.<br>" +
                "<br></p>";
        view.loadData( text , "text/html", "utf-8");
        return rootView;
    }

}
