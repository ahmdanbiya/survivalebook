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
public class Psikologi extends Fragment {


    public Psikologi() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_psikologi,
                container, false);
        WebView view = (WebView) rootView.findViewById(R.id.psikologi1);
        String text = "<b><p align=\"justify\">PSIKOLOGI DALAM SURVIVAL</b> <br>" +
                "PENGETAHUAN DASAR DALAM SURVIVAL<br>" +
                "<br>" +
                "Dibutuhkan lebih dari sekedar pengetahuan, keterampilan dan pelatihan untuk memiliki kemampuan membangun tempat perlindungan, mendapatkan makanan dan minuman, membuat api, dan melakukan perjalanan tanpa bantuan perangkat navigasi standar untuk menghadapi kondisi bertahan hidup, serta berhasil melalui situasi tersebut. Namun dalam beberapa kasus mengenai orang dengan sedikit pelatihan atau tanpa pelatihan survival ada yang telah berhasil bertahan hidup dalam kondisi yang mengancam jiwa mereka ketika tersesat atau terjebak dalam kondisi survival. Dan dalam beberapa kasus, ada juga orang yang sudah memiliki pengetahuan dan mendapat pelatihan bertahan hidup yang cukup, namun belum pernah menggunakan keterampilan mereka, ketika tersesat ataupu terjebak dalam situasi survival ditemukan meninggal. Dari beberapa kasus tersebut dapat diambil sebuah pelajaran bahwa dalam setiap situasi  bertahan hidup (survival) yang terpenting adalah sikap mental dari individu yang terlibat. Memiliki keterampilan bertahan hidup penting, namun memiliki <b>“kemauan untuk bertahan hidup”</b> adalah juga sangat penting. Tanpa keinginan untuk bertahan hidup, keterampilan yang diperoleh dan pengetahuan berharga yang telah dimiliki <b>“akan sia-sia”</b>.<br>" +
                "<br>" +
                "<br>" +
                "Sehingga disinilah diperlukan adanya pengetahuan tentang psikologi untuk bertahan hidup (survival). Pada saat dalam kondisi survival Anda akan menghadapi banyak stress (tekanan batin) dalam lingkungan tempat untuk bertahan hidup yang pada akhirnya akan mempengaruhi pikiran Anda. Stres ini dapat mengganggu pikiran dan emosi, yang jika kurang dipahami, dapat mengubah rasa percaya diri yang dimiliki menjadi hilang, dimana akan ; berubah menjadi orang yang ragu-ragu, individu tidak efektif yang pada akhirnya akan dipertanyakan kemampuannya untuk dapat bertahan hidup. Sehingga, Anda harus menyadari dan harus dapat mengenali bahwa orang-orang stres umumnya terkait dengan kemampuannya dalam bertahan hidup. Hal ini sangat penting untuk disadari bagaimana reaksi Anda terhadap berbagai macam stres yang berhubungan dengan kondisi bertahan hidup (survival). Bab ini akan mengidentifikasi dan menjelaskan stres, stresor, dan stres dalam bertahan hidup (survival), serta reaksi-reaksi internal yang Anda alami saat menghadapi kondisi survival. Pengetahuan yang Anda peroleh dari bab ini, akan mempersiapkan Anda untuk dapat melalui saat-saat terberat hidup.<br>" +
                "<br>" +
                "<b>1.    A LOOK AT STRESS</b><br>" +
                "MENGERTI DAN MEMAHAMI APA ITU STRES DALAM SURVIVAL <br>" +
                "<br>" +
                "Sebelum kita dapat memahami reaksi psikologis kita dalam bertahann hidup (survival), akan sangat membantu jika kita tahu sedikit tentang pengertian stres dan dampaknya. Stres bukanlah penyakit. Sebaliknya, adalah suatu kondisi yang kita semua pernah alami. Stres dapat digambarkan sebagai reaksi kita terhadap tekanan. Istilah ini diberikan untuk pengalaman yang kita miliki secara fisik, mental, emosional, dan spiritual saat merespon ketegangan dan tekanan hidup.<br>" +
                "<br>" +
                "<b>2.    NEED FOR STRESS</b><br>" +
                "STRES ITU PERLU<br>" +
                "<br>" +
                "Kadang kita sebenarnya membutuhkan stres karena dengan mengalami dan memiliki pengalaman stres akan memiliki banyak manfaat positif. Stres akan memberikan kita tantangan, selain itu juga akan memberi kita kesempatan untuk belajar tentang nilai-nilai dan kekuatan diri kita. Stres dapat menunjukkan kemampuan kita untuk menangani tekanan tanpa melanggar atau merugikan diri kita sendiri dan orang lain. Sebagai tes kemampuan untuk beradaptasi dan melatih fleksibilitas kita, dan dapat merangsang kita untuk melakukan yang terbaik. Karena kita biasanya tidak menganggap penting tentang kemampuan kita mengelola stres, stres juga dapat menjadi indikator yang sangat baik, dalam artikel ini tentang pentingnya kita memahami dan mengelola stres serta apa saja efek dari stres yang tidak dikelola dengan benar atau tepat.<br>" +
                "<br>" +
                "Kita perlu mengalami dan memiliki beberapa stres dalam hidup kita, tapi jika terlalu banyak hal bisa berakibat buruk. Tujuannya untuk memiliki stres adalah untuk melatih respon fisik kita, emosi kita, dan spiritual, kita saat dihadapkan pada kondisi survival, tapi jangan sampai berlebihan. Terlalu banyak stres dapat mengganggu diri sendiri, orang lain dan lingkungan. Terlalu banyak stres akan menyebabkan penderitaan. Distress menyebabkan ketegangan dan rasa tidak nyaman, sehingga kita mencoba untuk melarikan diri atau, sebaiknya menghindari. Di bawah ini adalah beberapa tanda umum kesulitan yang mungkin Anda hadapi ketika dihadapkan dengan terlalu banyak stres :<br>" +
                "<ul><li><p align=\"justify\">Kesulitan membuat keputusan</li>" +
                "<li><p align=\"justify\">Luapan kemarahan.</li>" +
                "<li><p align=\"justify\">Kelupaan.</li>" +
                "<li><p align=\"justify\">Tingkat energi yang rendah.</li>" +
                "<li><p align=\"justify\">Sering khawatir.</li>" +
                "<li><p align=\"justify\">Kecenderungan untuk membuat kesalahan.</li>" +
                "<li><p align=\"justify\">Pikiran tentang kematian atau bunuh diri.</li>" +
                "<li><p align=\"justify\">Kesulitan bergaul dengan orang lain.</li>" +
                "<li><p align=\"justify\">Menutup diri dari orang lain.</li>" +
                "<li><p align=\"justify\">Lari dari tanggung jawab.</li>" +
                "<li><p align=\"justify\">Kecerobohan.</li>" +
                "</ul>" +
                "<p align=\"justify\">Seperti yang Anda lihat, stres dapat konstruktif atau destruktif. Hal ini dapat mendorong atau menghambat, menggerakkan kita bersama atau menghentikan kita yang menyebabkan kematian, dan membuat hidup bermakna atau yang tampaknya tidak berarti. Stres dapat menginspirasi Anda untuk bertindak dengan sukses dan tampil secara maksimum efisien dalam menghadapi situasi hidup. Namun hal ini juga dapat menyebabkan Anda panik dan melupakan semua pelatihan Anda. Kunci utama Anda untuk dapat bertahan hidup adalah kemampuan Anda untuk mengatasi tekanan yang tak terelakkan yang akan Anda hadapi. Orang yang bertahan adalah orang yang bekerja dengan tekanan, bukannya membiarkan tekanan itu bekerja padanya.<br>" +
                "<br>" +
                "<b>3.    SURVIVAL STRESSOR</b><br>" +
                "STRESOR DALAM SURVIVAL<br>" +
                "<br>" +
                "Setiap peristiwa dapat menyebabkan stress, dan semua orang rata-rata pernah mengalami dalam proses menjalani hidupnya. Peristiwa yang terjadi tidak selalu datang satu per satu. Seringkali, peristiwa stres terjadi secara bersamaan. Sebenarya peristiwa yang terjadi bukanlah stres itu sendiri, tetapi efek yang dihasilkan dari peristiwa inilah yang disebut sebagai \"Stres\". Sedang \"Stresor\" adalah penyebab dari stres, sehingga disini dapat disimpulkan bahwa stres adalah respon alami dari sebuah peristiwa yang menimbulkan tekanan dalam diri. Setelah tubuh mengakui adanya stressor, maka ia mulai bertindak untuk melindungi diri.<br>" +
                "<br>" +
                "Menanggapi stressor ini, tubuh mempersiapkan diri baik untuk \"melawan atau melarikan diri\". Persiapan ini melibatkan sinyal SOS internal kita yang dikirim ke seluruh tubuh. Saat tubuh merespon SOS ini, tindakan berikut terjadi :" +
                "<ul><li><p align=\"justify\">Tubuh melepaskan disimpan bahan bakar (gula dan lemak) untuk menyediakan energi yang cepat.</li>" +
                "<li><p align=\"justify\">Pernapasan kenaikan tarif untuk memasok lebih banyak oksigen ke darah.</li>" +
                "<li><p align=\"justify\">Ketegangan otot meningkat untuk mempersiapkan tindakan.</li>" +
                "<li><p align=\"justify\">Mekanisme pembekuan darah diaktifkan untuk mengurangi pendarahan dari luka.</li>" +
                "<li><p align=\"justify\">Indra menjadi lebih akut (pendengaran menjadi lebih sensitif, pupil membesar, bau menjadi lebih tajam) sehingga Anda lebih sadar lingkungan Anda.</li>" +
                "<li><p align=\"justify\">Denyut jantung dan tekanan darah meningkat untuk memberikan lebih banyak darah ke otot.</li>" +
                "<li><p align=\"justify\">Postur pelindung ini memungkinkan Anda mengatasi potensi bahaya. Namun, Anda tidak dapat mempertahankan tingkat kewaspadaan tanpa batas.</li>" +
                "</ul>" +
                "<p align=\"justify\">Stresor sering bersikap tidak sopan; kadang terjadi dalam hidup atau dalam kondisi survival salah satu stressor tidak akan pergi dikarenakan ada stresor lainnya datang. Stresor-stresor ini justru kadang menambahkan yang sudah ada. Efek kumulatif dari stress-stres kecil ini dapat berubah menjadi kesulitan besar, jika semua stresor tersebut terjadi terlalu dekat secara bersamaan. Sebagai suatu daya tahan tubuh terhadap stres, tubuh memakai semua yag ada didalam tubuh untuk merespon stres tersebut dan namun jika sumber stres terus bertambah (atau meningkat) , akhirnya akan membuat tubuh dalam keadaan kelelahan. Pada titik ini, kemampuan untuk melawan stres atau cara-cara positif yang digunakan untuk memberikan jalan keluar mulai berkurang dan tanda-tanda tertekan akan muncul. <b>“Mengantisipasi stres dan mengembangkan strategi”</b> untuk mengatasi mereka adalah dua hal yang digunakan dalam manajemen yang efektif untuk menghadapi stres. Oleh karena itu, sangat penting bahwa Anda menyadari jenis stres yang akan Anda hadapi. Paragraf berikut menjelaskan beberapa jenis yang menyebabkan stres (stresor).<br>" +
                "<br>" +
                "<ul><il><p align=\"justify\"><b>3.1 Cedera, Penyakit, atau Kematian</b>" +
                "<br><br>" +
                "Cedera, penyakit, dan kematian adalah kemungkinan nyata yang Anda harus hadapi. Mungkin tidak ada yang lebih stres daripada sendirian di lingkungan yang asing di mana Anda bisa mati karena kecelakaan, atau karena memakan sesuatu yang mematikan. Penyakit dan cedera juga dapat menambah stres karena membatasi kemampuan Anda untuk bergerak atau bermanuver dalam mendapatkan makanan dan minuman, mencari tempat berlindung, dan membela diri. Bahkan jika penyakit dan cedera tersebut tidak menyebabkan kematian, mereka akan menambah stres melalui rasa sakit dan ketidaknyamanan yang mereka hasilkan. Hanya dengan mengendalikan stres yang terkait dengan kerentanan terhadap cedera, penyakit, dan kematian yang dapat membuat Anda memiliki keberanian untuk mengambil risiko yang terkait dengan cara bertahan hidup dalam survival.<br>" +
                "<br>" +
                "<p align=\"justify\"><b>3.2 Ketidakpastian dan Kurangnya Pengendalian</b><br>" +
                "<br>" +
                "Beberapa orang ada yang mengalami kesulitan bertindak dalam mengendalikan keadaan di mana semuanya dalam kondisi yang tidak jelas. Satu-satunya jaminan dalam situasi bertahan hidup (survival) adalah bahwa tidak ada yang dapat dijamin kepastiannya. Hal ini dapat sangat mudah menyebabkan stres timbul, pada kondisi informasi yang terbatas dalam mengendalikan keadaan, di mana Anda hanya memiliki kontrol yang terbatas pada lingkungan disekitar Anda. Ketidakpastian ini dan kurangnya kontrol juga menambah stres berubah menjadi sumber rasa sakit, terluka, atau menjadi penyebab kematian.<br>" +
                "</il>" +
                "<il><p align=\"justify\"><b>3.3 Lingkungan</b><br>" +
                "<br>" +
                "Bahkan dalam situasi lingkungan yang paling idealpun, alam masih cukup tangguh dan susah untuk diprediksi. Dalam kondisi bertahan hidup (survival) Anda masih harus berhadapan dengan stres karena cuaca, medan, dan berbagai makhluk yang menghuni di suatu daerah. Panas, dingin, hujan, angin, gunung, rawa, padang pasir, serangga, reptil berbahaya, dan hewan lainnya, merupakan sebagaian dari tantangan yang akan Anda hadapi saat harus bertahan hidup dalam kondisi survival. Tergantung pada bagaimana Anda menangani stres di lingkungan Anda, lingkungan Anda dapat menjadi sumber makanan dan perlindungan atau bisa menjadi penyebab ketidaknyamanan yang ekstrim dan dapat menjadi penyebab cedera, sakit, atau kematian.<br>" +
                "</il>" +
                "<il><p align=\"justify\"><b>3.4 Kelaparan dan Kehausan</b><br>" +
                "<br>" +
                "Tanpa makanan dan air, Anda akan melemah dan akhirnya meninggal dunia. Dengan demikian, mendapatkan dan menjaga pasokan makanan dan air menjadi hal yang sangat penting, untuk membantu memperpanjang waktu dalam menjaga kelangsungan hidup. Mencari makan juga dapat menjadi sumber besar dari stres tergantung bagaimana cara dalam menangani stress yang terjadi dan pengetahuan dalam memperoleh makanan dan minuman sangat membantu selain kemampuan dalam mengelola stres.<br>" +
                "</il>" +
                "<il><p align=\"justify\"><b>3.5 Kelelahan</b><br>" +
                "<br>" +
                "Memaksa diri untuk terus bertahan hidup sangatlah tidak mudah, lama lama akan membuat tubuh semakin lelah. Hal ini dimungkinkan menimbulkan rasa begitu melelahkan, apalagi kondisi disekitar yang memaksa untuk tetap terjaga dan waspada, juga merupakan salah satu sumber dari stres dalam dirinya sendiri.<br>" +
                "</il>" +
                "<il><p align=\"justify\"><b>3.6 Terisolasi</b><br>" +
                "<br>" +
                "Ada beberapa keuntungan saat menghadapi kesulitan dihadapi dapat berbagi beban dengan orang lain, karena membuat merasa tidak sendirian. Sebagai seorang yang telah mendapat pembekalan pengetahuan dan memiliki pengalaman sebagai individu, juga dilatih keterampilan individu sebagai bagian dari tim, Ketika kita melakukan kegiatan berkelompok dalam hal ini melakukan pendakian bersama, saat dihadapkan pada kondisi terbatasnya informasi dan sumber daya, saat berada didalam kondisi yang bisa berhubungan dengan orang lain juga memberikan rasa aman dan perasaan tenang karena tahu bahwa akan ada orang lain yang dapat membantu jika terjadi masalah. Sebuah stressor yang signifikan dalam situasi survival adalah harus mengandalkan sumber daya Anda sendiri .<br>" +
                "<br>" +
                "Stres dalam bertahan hidup (survival) yang disebutkan dalam bagian ini tidak berarti satu-satunya yang mungkin akan dihadapi. Ingat, apa yang menjadi stres untuk satu orang mungkin tidak berlaku untuk orang lain. Pengalaman, pelatihan , pandangan hidup, kondisi fisik dan mental, dan tingkat kepercayaan diri sangat berkontribusi terhadap apa yang akan dihadapi saat menghadapi stres dalam lingkungan bertahan hidup (survival). Tujuannya bukan untuk menghindari stres, melainkan untuk mengelola stres dalam bertahan hidup (survival) dan membuat mereka bekerja untuk Anda.<br>" +
                "<br>" +
                "Dengan menguasai serta memiliki pengetahuan umum tentang stres dan stres pada umumnya yang terjadi saat dalam kondisi bertahan hidup(survival) yang kita sebutkan diatas. selain itu langkah berikutnya adalah untuk menguji reaksi Anda terhadap stres mungkin akan Anda hadapi.<br>" +
                "<br>" +
                "<i><font color=\"blue\">“Survival starts by paying attention to what is close at hand and immediate. To look out with idle hope is tantamount to dreaming one's life away.”  - Yann Martel<br>" +
                "</i></font></il></ul>" +
                "<b><p align=\"justify\">4.    NATURAL REACTIONS</b><br>" +
                "REAKSI ALAMIAH<br>" +
                "<br>" +
                "Manusia telah mampu bertahan dalam perubahan yang terjadi pada lingkungan disekitarnya selama berabad-abad. Kemampuannya untuk beradaptasi secara fisik dan mental saat menghadapi perubahan yang terjadi di bumi (dunia) ini, dapat membantu bertahan hidup, sementara ada beberapa spesies lainnya mengalami kepunahan. Sebuah mekanisme survival yang sama yang membuat nenek moyang kita bertahan hidup sampai sekarang, sama berlaku juga buat kita sehingga akan dapat membantu kita tetap bertahan hidup juga! Mekanisme reaksi alami ini (Ketakutan, Kecemasan, Kemarahan dan Frustasi, Depresi, Kesepian dan Kebosanan, dan Rasa Bersalah) dalam survival akan dapat membantu Anda untuk bertahan hidup, namun juga dapat juga berbalik melawan Anda jika tidak memahami dan mengantisipasi  serta mengelola kehadirannya.<br>" +
                "<br>" +
                "Hal ini tidak mengherankan bahwa rata-rata orang akan memiliki beberapa reaksi psikologis dalam situasi bertahan hidup (survival) sebagai bagian dari mekanisme alamiah (rekasi alamiah) kita. Paragraf berikut menjelaskan beberapa reaksi-reaksi internal utama yang Anda atau siapa pun yang bersama dalam kondisi survival yang dinyatakan dalam paragraph sebelumnya.<br>" +
                "<ul><il><p align=\"justify\"><b>4.1 Fear</b><br>" +
                "Ketakutan<br>" +
                "<br>" +
                "Ketakutan adalah respon emosional kita ketika menghadapi keadaan berbahaya yang dipercaya memiliki potensi untuk menyebabkan kematian, cedera, atau penyakit. Bahaya ini tidak hanya terbatas pada kerusakan fisik, namun selain ancaman secara fisik, ancaman bahaya juga akan berpengaruh terhadap emosi dan mental Anda, sehingga dapat menghasilkan rasa takut. Jika Anda mencoba untuk bertahan hidup, ketakutan dapat berfungsi positif jika mendorong Anda untuk berhati-hati dalam situasi di mana kecerobohan dapat mengakibatkan cedera. Sayangnya, rasa takut juga dapat melumpuhkan Anda. Hal ini dapat menyebabkan Anda menjadi begitu takut bahwa Anda akan gagal untuk melakukan kegiatan penting agar dapat bertahan dalam kondisi survival. Kebanyakan orang akan memiliki beberapa tingkat ketakutan ketika ditempatkan di lingkungan yang tidak dikenalnya dalam kondisi yang sulit. Tidak perlu malu untuk mengakui hal ini! Anda harus sering melatih diri untuk tidak dikuasai oleh ketakutan Anda sendiri. Idealnya, melalui pelatihan yang realistis, Anda dapat memperoleh pengetahuan dan keterampilan yang diperlukan untuk meningkatkan rasa percaya diri Anda dan dengan demikian mengelola ketakutan Anda.<br>" +
                "<br>" +
                "<i><font color=\"blue\">“Fear is a part of life. It's a warning mechanism. That's all. It tells you when there's danger around. Its job is to help you survive. Not cripple you into being unable to do it.” - Jim Butcher</il>" +
                "</i></font><il><p align=\"justify\"><b>4.2 Anxiety</b><br>" +
                "Kecemasan<br>" +
                "<br>" +
                "Terkait dengan ketakutan adalah kecemasan. Karena itu wajar bagi Anda untuk takut, juga alami bagi Anda untuk mengalami kecemasan. Kecemasan bisa menjadi gelisah, perasaan khawatir yang Anda dapatkan ketika menghadapi situasi berbahaya (baik secara ; fisik, mental, dan emosional). Ketika digunakan dan diarahkan dengan cara yang sehat, kecemasan dapat mendorong Anda untuk bertindak pada saat tepat, atau setidaknya membuat Anda dapat lebih peka untuk memahami atau mengetahui, bahaya yang mengancam keberadaan Anda. Jika Anda tidak pernah cemas, akan ada sedikit motivasi untuk membuat perubahan dalam hidup Anda. Dalam hidup, anda dapat mengurangi kecemasan Anda dengan melakukan tugas-tugas yang akan memastikan Anda dapat melalui cobaan hidup. Ketika Anda mengurangi kecemasan Anda, Anda juga mengendalikan  sumber kecemasan – yaitu rasa ketakutan Anda. Dalam bentuk ini, kecemasan adalah baik, namun, kecemasan juga dapat memiliki dampak yang menghancurkan. Kecemasan dapat membanjiri Anda ke titik di mana Anda menjadi mudah bingung dan mengalami kesulitan berpikir. Setelah ini terjadi, hal itu akan menjadi semakin sulit bagi Anda untuk membuat penilaian yang baik dan membuat keputusan yang tepat. Untuk bertahan hidup, Anda harus belajar teknik untuk mengelola kecemasan Anda dan menjaga mereka dalam kisaran di mana mereka membantu, tidak ada salahnya untuk mulai mencoba dalam kehidupan sehari-hari kita.<br>" +
                "</il>" +
                "<il><p align=\"justify\"><b>4.3 Anger and Frustration</b><br>" +
                "Kemarahan dan Frustrasi<br>" +
                "<br>" +
                "Frustrasi muncul ketika Anda terus-menerus dihadapkan pada kegagalan dalam upaya Anda untuk mencapai tujuan. Tujuan dalam bertahan hidup (survival) adalah untuk tetap hidup sampai Anda bisa mencapai bantuan atau sampai bantuan dapat mencapai Anda. Untuk mencapai tujuan ini , Anda harus menyelesaikan beberapa tugas dengan sumber daya yang minim. Tidak dapat dipungkiri, dalam mencoba untuk melakukan tugas-tugas ini atau bertahan hidup, bahwa akan terjadi suatu tindakan yang salah, bahwa sesuatu akan terjadi di luar kendali Anda, dan bahwa hidup Anda sedang dipertaruhkan, setiap kesalahan yang terus terjadi akan berpengaruh. Dengan demikian, pada akhirnya, Anda harus dapat mengatasi frustrasi ketika beberapa rencana Anda mengalami kesulitan ataupun kegagalan. Salah satu hasil dari frustrasi ini adalah kemarahan. Ada banyak peristiwa dalam situasi bertahan hidup (survival) yang dapat membuat anda frustasi dan marah, seperti ; Tersesat, rusak atau lupa peralatan, cuaca, medan yang tidak ramah, dan keterbatasan fisik, ini adalah hanya sebagian dari beberapa sumber frustrasi dan kemarahan. Frustrasi dan kemarahan akan menghasilkan reaksi impulsif, perilaku irasional, keputusan buruk dan berpikir diluar nalar. Dalam beberapa kasus , \"I quit\" sikap mudah menyerah (orang kadang-kadang menghindari melakukan sesuatu yang tidak dapat mereka kuasai). Jika Anda bisa memanfaatkan dan dengan benar menyalurkan intensitas emosional yang terkait dengan kemarahan dan frustrasi, Anda akan produktif, dengan membuat Anda bertindak sebagai jawaban akan tantangan hidup. Jika Anda tidak benar-benar fokus menguasai perasaan marah Anda, Anda dapat membuang banyak energy. Di dalam keadaan yang dapat menguasai rasa marah akan banyak memberi peluang Anda untuk bertahan hidup atau memberi kesempatan peluang hidup yang lebih besar pada orang di sekitar Anda.<br>" +
                "</il>" +
                "<il><p align=\"justify\"><b>4.4 Depression</b><br>" +
                "Depresi<br>" +
                "<br>" +
                "Anda akan menjadi orang yang aneh jika Anda tidak pernah merasakan kesedihan, setidaknya untuk sesaat, ketika dihadapkan dengan kesulitan hidup. Namun kesedihan yang mendalam akan berubah, menjadi \"Depresi\". Depresi berhubungan erat dengan frustrasi dan kemarahan. Frustrasi akan menyebabkan Anda menjadi semakin marah ketika Anda gagal untuk mencapai tujuan Anda. Jika kemarahan tidak membantu Anda sukses, maka tingkat frustrasi akan semakin meningkat lebih tinggi. Sebuah siklus destruktif antara kemarahan dan frustrasi akan terus sampai pada suatu titik dimana Anda menjadi down ; secara fisik, emosional, dan mental. Ketika Anda mencapai titik ini, Anda mulai menyerah, dan pergeseran fokus Anda dari \"Apa yang bisa saya lakukan\" berubah menjadi \"Tidak ada yang bisa saya lakukan\". Depresi adalah ekspresi putus asa, perasaan tidak berdaya. <br>" +
                "<br>" +
                "Tidak ada yang salah dengan rasa sedih, karena Anda mengalami perasaan dan pikiran Anda kembali ke peradaban dan dunia dimana orang yang Anda cintai berada namun pada saat yang samaAnda dihadapkan pada kondisi bertahan hidup (survival) disuatu tempat yang tidak diketahui. Pikiran seperti itu, pada kenyataannya, dapat memberikan keinginan untuk berusaha lebih keras dan hidup satu hari lagi sehingga dapat diselamatkan ataupun selamat. Tapi di sisi lain, jika Anda membiarkan diri Anda tenggelam dalam keadaan tertekan, maka bisa menguras seluruh energi Anda diseret dalam kesedihan yang mendalam. Ada yang lebih penting sebenarnya yang seharusnya dapat dijadikan pegangan, bahw \"keinginan Anda untuk bertahan hidup\". Sehingga menjadi hal yang harus penting pada saat menghadpi kondisi survival bahwa \"Anda menolak menyerah pada depresi\".<br>" +
                "</il>" +
                "<il><p align=\"justify\"><b>4.5 Loneliness and Boredom</b><br>" +
                "Kesepian dan Kebosanan<br>" +
                "<br>" +
                "Manusia adalah mahluk sosial. Manusia menikmati kebersamaan dan bersosialisasi  dengan orang lain. Sangat sedikit orang yang ingin sendirian sepanjang waktu! Namun kadang saat dihadapkan pada kondisi terisolisasi dalam keadaan bertahan hidup (survival). Isolasi sebenarnya tidak buruk. Kesepian dan kebosananlah justru yang dapat timbul kepermukaan yang pada akhirnya sangat mempengaruhi sikap Anda, yang selama ini mungkin tidak terpikirkan oleh Anda sendiri atau orang lain. Tingkat imajinasi dan kreativitas Anda miliki mungkin akan mengejutkan Anda. Ketika diminta untuk melakukannya, Anda mungkin menemukan beberapa bakat dan kemampuan tersembunyi, Anda dapat memanfaatkan reservoir kekuatan batin dan ketabahan Anda tidak pernah tahu bahwa Anda memilikinya. Sebaliknya, kesepian dan kebosanan dapat menjadi sumber lain dari depresi. Jika Anda hidup sendiri, atau dengan orang lain, Anda harus menemukan cara untuk menjaga pikiran Anda produktif diduduki. Selain itu, Anda harus mengembangkan tingkat swasembada. Anda harus memiliki keyakinan dalam kemampuan Anda untuk \" pergi sendiri\".<br>" +
                "<br>" +
                "<i><font color=\"blue\">“When walking alone in a jungle of true darkness, there are three things that can show you the way: instinct to survive, the knowledge of navigation, creative imagination. Without them, you are lost.”  Toba Beta</il>" +
                "</i></font><il><p align=\"justify\"><b>4.6 Guilt</b><br>" +
                "Rasa Bersalah<br>" +
                "<br>" +
                "Keadaan yang menyebabkan Anda berada dalam lingkungan bertahan hidup (survival) kadang-kadang sangat dramatis dan tragis. Mungkin Anda adalah satu-satunya yang selamat atau salah satu dari beberapa yang selamat. Sementara secara alami Anda bersyukur masih diberi kesempatan hidup, namun secara bersamaan ada rasa bersalah menyerang Anda merasa sangat berkabung atas kematian orang lain yang kurang beruntung. Merasa Kejadian kejadian ini tidak adil, sehigga merasa bersalah karena menjadi orang yang beruntung terhindar dari kematian sementara yang lain tidak. Perasaan ini, bila digunakan dengan cara yang positif, akan mendorong orang untuk berusaha lebih keras untuk bertahan dengan keyakinan bahwa mereka diizinkan untuk hidup karena ada beberapa alasan yang lebih besar dalam hidup ini sehingga Anda diijinkan tetap hidup. Kadang, keinginan untuk tetap hidup adalah agar bisa melanjutkan apa yang telah dilakukan oleh mereka yang tewas. Apapun alasan Anda saat diberi kesempatan untukk hidup, jangan biarkan perasaan bersalah mencegah Anda tetap bertahan hidup. Jika yang selamat membuang kesempatan mereka untuk bertahan hidup maka tidak akan mencapai apa-apa. Tindakan semacam itu akan menjadi tragedi terbesar.<br>" +
                "<br>" +
                "<i><font color=\"blue\">“Who wants to die? Everything struggles to live. Look at that tree growing up there out of that grating. It gets no sun, and water only when it rains. It's growing out of sour earth. And it's strong because its hard struggle to live is making it strong. My children will be strong that way.”  Betty Smith<br>" +
                "</i></font></il></ul>" +
                "<b><p align=\"justify\">5.   PREPARING YOURSELF</b><br>" +
                "MEMPERSIAPKAN DIRI<br>" +
                "<br>" +
                "Misi Anda dalam situasi bertahan hidup (survival) adalah untuk tetap hidup. Bermacam-macam pikiran dan emosi akan Anda alami dalam situasi hidup dapat membawa Anda bertahan hidup (survival), ataupun mereka dapat membawa Anda gagal bertahan hidup (survival). Ketakutan, kecemasan, kemarahan, frustrasi, rasa bersalah, depresi, dan kesepian adalah semua reaksi yang mungkin akan terjadi secara umum dalam kondisi untuk bertahan hidup. Reaksi-reaksi ini, ketika dapat dikendalikan dengan cara yang sehat dan tepat, akan dapat membantu untuk meningkatkan kemungkinan Anda bisa bertahan hidup. Hal ini menuntut Anda untuk lebih bersungguh-sungguh dan fokus, untuk melawan kembali ketika rasa takut datang, untuk mengambil tindakan yang menjamin keselamatan dan keamanan, untuk mempertahankan keyakinan dan saling percaya serta dapat diandalkan dengan sesama anggota tim, dan berusaha melawan rintangan yang besar. Bila Anda tidak dapat mengendalikan reaksi-reaksi ini dengan cara yang sehat dan tepat, mereka dapat membawa Anda menuju kematian. Alih-alih mengerahkan sumber daya internal Anda, ketika Anda lebih mendengarkan rasa kekhawatiran internal Anda. Ketakutan ini justru akan menyebabkan Anda mengalami kekalahan psikologis jauh sebelum Anda secara fisik mengalami mengalah, dan menyerah sebelum berjuang. Ingat, bertahan hidup adalah sesuatu hal yang wajar untuk semua orang, yang kadang tidak dapat diduga membawa Anda ke dalam perjuangan hidup atau mati untuk bertahan hidup. Jangan takut dengan \"reaksi alami untuk situasi yang tidak alami ini\". Siapkan diri Anda untuk bisa mengendalikan reaksi ini sehingga mereka membantu menghadapi dan membawa Anda tetap bertahan hidup dengan kehormatan dan martabat.<br>" +
                "<br>" +
                "Selalu mempersiapkan diri dan mengetahui bahwa reaksi Anda dalam menghadapi kondisi bertahan hidup adalah reaksi yang produktif, bukan destruktif. Tantangan hidup telah menghasilkan banyak contoh kepahlawanan, keberanian, dan pengorbanan diri. semua ini adalah kualitas hidup yang dapat membawa Anda keluar dari kondisi tersebut, hal itu akan terjadi jika Anda telah mempersiapkan diri. Berikut adalah beberapa tips untuk membantu mempersiapkan diri secara psikologis untuk bertahan hidup. Melalui belajar panduan ini dan mengikuti pelatihan survival Anda dapat mengembangkan \"sikap hidup\".<br>" +
                "<ul><il><p align=\"justify\"><b>5.1 Know Yourself</b><br>" +
                "Tahu Diri<br>" +
                "<br>" +
                "Anda harus meluangkan waktu melalui pelatihan, saat dengan keluarga, dan teman-teman untuk menemukan siapa yang ada di dalam Anda. Memperkuat kualitas Anda lebih kuat lagi dan mengembangkan kemampuan dan pengetahuan And yang diperlukan untuk dapat bertahan hidup.<br>" +
                "</il>" +
                "<il><p align=\"justify\"><b>5.2 Anticipate Fears</b><br>" +
                "Mengantisipasi Ketakutan<br>" +
                "<br>" +
                "Jangan berpura-pura bahwa Anda tidak memiliki kekhawatiran. Mulailah berpikir dan menemukan tentang apa yang akan paling menakutkan buat Anda saat untuk bertahan hidup sendirian. Melatih cara mengatasi ketakutan tersebut untuk dapat bertahan hidup (survival) harus menjadi perhatian dan prioritas Anda. Tujuannya bukan untuk menghilangkan rasa takut, tetapi untuk membangun rasa percaya diri dalam kemampuan Anda untuk berfungsi meski ada kekhawatiran Anda.<br>" +

                "</il>" +
                "<il><p align=\"justify\"><b>5.3 Be Realistic</b><br>" +
                "Realistis<br>" +
                "<br>" +
                "Jangan takut untuk membuat penilaian yang jujur tentang situasi. Lihat keadaan seperti apa mereka sebenarnya, bukan seperti apa yang Anda ingin. Menjaga harapan hidup dalam memperkirakan situasi. Ketika Anda masuk dalam kondisi survival tentukan keadaan terbaik dan tidak realistik agar tetap menjaga harapan untuk tetap bertahan hidup sehingga dapat menjadi lentera dan tenaga pendorong untuk bisa terus bertahan hidup, namun mempersiapkan kondisi terburuk yang akan diihadapi atau yang akan terjadi sehingga akan membuat kita waspada dan berhati-hati, Anda mungkin akan menghadapi kecewaan yang sagat pahit namun hal itu akan membuat anda dapat bertahan hidup dan membuat Anda siap untuk mengelola kekecewaan dan kesedihan. Seperti kata pepatah, <b>\"Letakan harapan setinggi langit, dan bersiap untuk hal yang terburuk\"</b>. Adalah jauh lebih mudah untuk menyesuaikan diri dengan kejutan menyenangkan tentang nasib yang tak terduga, daripada Anda akan kecewa dengan keadaan hidup yang sangat keras dan selalu bersikap menyedihkan saat harus menghadapi keadaan yang tak terduga.<br>" +

                "</il>" +
                "<il><p align=\"justify\"><b>5.4 Adopt A Positive Attitude</b><br>" +
                "Menerapkan Sikap Positif<br>" +
                "<br>" +
                "Belajarlah untuk melihat potensi yang baik dalam segala hal. Mencari yang baik tidak hanya mendongkrak moral, juga sangat baik untuk melatih imajinasi dan kreativitas.<br>" +

                "</il>" +
                "<il><p align=\"justify\"><b>5.5 Remind Yourself What Is At Stake</b><br>" +
                "Ingatkan Diri Apa Yang Dipertaruhkan<br>" +
                "<br>" +
                "Kegagalan untuk mempersiapkan diri secara psikologis untuk mengatasi survival menyebab kan beberapa reaksi, seperti depresi, kecerobohan, kurangnya perhatian, kehilangan kepercayaan diri, pengambilan keputusan yang buruk, dan menyerah sebelum tubuh memberi masuk Ingat bahwa hidup Anda dan kehidupan orang lain yang bergantung pada Anda dipertaruhkan.<br>" +

                "</il>" +
                "<il><p align=\"justify\"><b>5.6 Train</b><br>" +
                "Pelatihan<br>" +
                "<br>" +
                "Melalui pelatihan dan pengalaman hidup, diharapkan akan membuat kita selalu mampu mempersiapkan diri menghadapi kerasnya hidup. Mendemonstrasikan keterampilan Anda dalam pelatihan akan memberi Anda kepercayaan diri untuk mengatasi segala sesuatu yang akan timbul dalam hidup maupun dalam kondisi survival di alam bebas, semakin realistisnya pelatihan, semakin besar kemampuan kita mengatasi dalam kondisi bertahan hidup dalam lingkungan yang sebenarnya.<br>" +

                "</il>" +
                "<il><p align=\"justify\"><b>5.7 Learn Stress Management Techniques</b><br>" +
                "Belajar Teknik Manajemen Stres<br>" +
                "<br>" +
                "Orang di dalam kondisi stres memiliki potensi untuk panik jika mereka tidak terlatih dan tidak siap secara psikologis, untuk menghadapi apapun keadaan yang mungkin akan terjadi. Meskipun Anda sering dihadapkan pada keadaan bahwa Anda tidak dapat mengendalikan keadaan hidup di mana Anda berada, namun Anda memiliki kemampuan untuk mengendalikan respons Anda terhadap situasi tersebut. Belajar teknik manajemen stres secara signifikan dapat meningkatkan kemampuan Anda untuk tetap tenang dan fokus saat Anda berfungsi untuk menjaga diri dan orang lain bertahan hidup. Beberapa teknik yang baik untuk mengembangkan keterampilan termasuk relaksasi , keterampilan manajemen waktu, kemampuan bersikap asertif, dan keterampilan restrukturisasi kognitif (kemampuan untuk mengontrol bagaimana Anda melihat situasi). Ingat, \"kehendak untuk bertahan hidup\" juga dapat dianggap \"penolakan untuk menyerah\".<br>" +
                "</il></ul>" +
                "<i>http://tri-santiadji.blogspot.co.id/2014/03/psikologi-dalam-survival.html <br>(Psikologi Dalam Survival)";

        view.loadData(text , "text/html", "utf-8");
        return rootView;
    }

}
