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
public class Masyarakat extends Fragment {


    public Masyarakat() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_masyarakat,
                container, false);
        WebView view = (WebView) rootView.findViewById(R.id.masyarakat1);
        String text =
                "<p align=\"justify\"><i>Beberapa saran terbaik dan paling sering diberikan, saat berhadapan dengan masyarakat setempat, adalah agar orang yang selamat menerima, menghormati, dan menyesuaikan diri dengan cara mereka. Jadi, \"ketika di Roma, lakukan seperti yang dilakukan orang Romawi.\" Ini adalah saran bagus, namun ada beberapa pertimbangan dalam menerapkan saran ini.</i><br>" +
                "<p align=\"center\"><b>BERINTERAKSI DENGAN MASYARAKAT LOKAL</b><br>" +
                "<p align=\"justify\">Anda harus memberikan pertimbangan serius untuk berurusan dengan masyarakat setempat. Apakah mereka memiliki budaya primitif? Apakah mereka petani, nelayan, orang persahabatan, atau musuh? Sebagai survivor, \"komunikasi lintas budaya\" bisa sangat bervariasi dari satu daerah ke daerah lain dan dari orang ke orang. Ini mungkin berarti interaksi dengan orang-orang dengan budaya yang sangat primitif atau berhubungan dengan orang-orang yang memiliki budaya yang relatif modem. Budaya diidentifikasi oleh standar perilaku yang anggotanya anggap tepat dan dapat diterima namun mungkin atau mungkin tidak sesuai dengan gagasan Anda tentang apa yang benar. Tidak peduli siapa orang-orang ini, Anda dapat mengharapkan mereka akan memiliki hukum, nilai sosial dan ekonomi, dan keyakinan politik dan agama yang mungkin sangat berbeda dari Anda. Sebelum menerapkannya ke wilayah operasi Anda, pelajari aspek budaya yang berbeda ini. Studi dan persiapan sebelumnya akan membantu Anda membuat atau menghindari kontak jika Anda harus berurusan dengan penduduk setempat.<br>" +
                "<br>" +
                "Orang akan ramah, tidak bersahabat, atau mereka akan memilih untuk mengabaikan Anda. Sikap mereka mungkin tidak diketahui. Jika orang tersebut dikenal ramah, cobalah untuk membuat mereka tetap ramah melalui sopan santun dan menghormati agama, politik, kebiasaan sosial, kebiasaan, dan semua aspek budaya mereka lainnya. Jika orang diketahui sebagai musuh atau tidak diketahui, lakukan segala upaya untuk menghindari kontak dan jangan meninggalkan tanda kehadiran Anda. Pengetahuan dasar tentang kebiasaan sehari-hari masyarakat setempat akan sangat penting dalam usaha ini. Jika setelah pengamatan cermat, Anda mengetahui bahwa orang yang tidak dikenal ramah, Anda dapat menghubungi mereka jika Anda benar-benar membutuhkan bantuan mereka.<br>" +
                "<br>" +
                "Biasanya, Anda hanya memiliki sedikit rasa takut dan banyak keuntungan dari kontak hati-hati dan hormat dengan orang-orang lokal di negara-negara yang ramah atau netral. Jika Anda terbiasa dengan kebiasaan setempat, menunjukkan kesopanan umum, dan yang terpenting, menunjukkan rasa hormat pada kebiasaan mereka, Anda seharusnya dapat menghindari masalah dan mungkin mendapatkan bantuan yang dibutuhkan. Untuk melakukan kontak, tunggu sampai hanya satu orang yang dekat dan, jika mungkin, biarkan orang tersebut melakukan pendekatan awal. Kebanyakan orang akan bersedia membantu orang yang selamat yang tampaknya membutuhkan. Namun, sikap, upaya pengajaran, atau propaganda politik lokal dapat mengubah sikap orang yang ramah. Sebaliknya, di negara-negara yang tidak bersahabat, banyak orang, terutama di daerah terpencil, mungkin merasa permusuhan terhadap politisi mereka dan mungkin lebih ramah terhadap korban yang selamat.<br>" +
                "Kunci sukses kontak dengan masyarakat lokal adalah bersikap ramah, sopan, dan sabar. Menampilkan rasa takut, menunjukkan senjata, dan membuat gerakan mendadak atau mengancam dapat menyebabkan orang lokal takut kepada Anda. Tindakan semacam itu bisa memicu respons yang tidak bersahabat. Saat mencoba kontak, tersenyum sesering mungkin. Banyak penduduk lokal pemalu dan tampak tidak dapat didekati, atau mereka mungkin mengabaikan Anda. Pendekatan mereka perlahan dan jangan terburu-buru kontak Anda.<br>" +
                "<p align=\"center\"><b>PERILAKU SURVIVOR</b><br>" +
                "<p align=\"justify\">Gunakan garam, tembakau, uang perak, dan barang semacam itu secara diam-diam saat berdagang dengan orang lokal. Uang kertas terkenal di seluruh dunia. Jangan bayar lebih; Hal itu bisa menyebabkan rasa malu dan bahkan bahaya. Selalu perlakukan orang dengan hormat. Jangan menggertak mereka atau menertawakan mereka.<br>" +
                "<br>" +
                "Menggunakan bahasa isyarat atau memerankan kebutuhan atau pertanyaan bisa sangat efektif. Banyak orang terbiasa dengan bahasa seperti itu dan berkomunikasi menggunakan bahasa isyarat nonverbal. Cobalah untuk mempelajari beberapa kata dan frasa bahasa lokal di dalam dan sekitar area operasi potensial Anda. Mencoba untuk berbicara bahasa seseorang adalah salah satu cara terbaik untuk menunjukkan rasa hormat terhadap budayanya. Karena bahasa Inggris banyak digunakan, beberapa orang setempat mungkin mengerti beberapa kata dalam bahasa Inggris.<br>" +
                "<br>" +
                "Beberapa daerah mungkin tabu. Mereka berkisar dari tempat religius atau suci hingga daerah yang sakit atau bahaya. Di beberapa daerah, hewan tertentu tidak boleh dibunuh. Pelajari peraturan dan ikuti mereka. Perhatikan dan pelajari sebanyak mungkin. Tindakan semacam itu akan membantu memperkuat hubungan dan memberikan pengetahuan dan keterampilan baru yang mungkin sangat penting nantinya. Carilah saran tentang bahaya lokal dan cari tahu dari orang-orang yang ramah dimana orang-orang yang bermusuhan berada. Selalu ingat bahwa orang sering bersikeras bahwa orang lain bermusuhan, hanya karena mereka tidak mengerti budaya dan masyarakat yang berbeda. Orang-orang yang biasanya mereka percayai adalah tetangga terdekat mereka - sama seperti di lingkungan kita sendiri.<br>" +
                "<br>" +
                "Seringkali, penduduk lokal, seperti kita, akan menderita penyakit menular. Bangun tempat penampungan yang terpisah, jika mungkin, dan hindari kontak fisik tanpa memberi kesan melakukannya. Secara pribadi siapkan makanan dan minuman Anda, jika Anda bisa melakukannya tanpa melakukan pelanggaran. Seringkali, masyarakat setempat akan menerima penggunaan \"kebiasaan pribadi atau agama\" sebagai penjelasan untuk perilaku isolasionis.<br>" +
                "<br>" +
                "Barter, atau perdagangan, biasa terjadi pada masyarakat yang lebih primitif. Koin keras biasanya bagus, entah untuk nilai tukar atau perhiasan atau pernak-perniknya. Di daerah terpencil, korek api, tembakau, garam, pisau cukur, wadah kosong, atau kain mungkin lebih berharga daripada bentuk uang apa pun.<br>" +
                "Berhati-hatilah saat menyentuh orang. Banyak orang menganggap \"menyentuh\" tabu dan tindakan semacam itu mungkin berbahaya. Hindari kontak seksual.<br>" +
                "<br>" +
                "Keramahan di antara beberapa orang adalah sifat budaya yang kuat sehingga mereka dapat secara serius mengurangi persediaan mereka sendiri untuk memberi makan orang asing. Terimalah apa yang mereka tawarkan dan bagikan secara merata dengan semua yang hadir. Makan dengan cara yang sama dengan yang mereka makan dan yang terpenting, cobalah makan semua yang mereka tawarkan.<br>" +
                "Jika Anda membuat janji, simpanlah. Hormati harta pribadi dan adat istiadat setempat, biarpun mereka tampak aneh. Buat semacam pembayaran untuk makanan, persediaan, dan sebagainya. Hormati privasi. Jangan masuk rumah kecuali diundang.<br>" +
                "<p align=\"center\"><b>PERUBAHAN KEBIJAKAN POLITIK</b><br>" +
                "<p align=\"justify\">Di dunia politik cepat internasional saat ini, sikap dan komitmen politik di negara-negara tunduk pada perubahan yang cepat. Populasi banyak negara, terutama negara-negara yang bermusuhan secara politis, tidak boleh dianggap ramah hanya karena mereka tidak menunjukkan permusuhan terbuka. Kecuali diberi penjelasan sebaliknya; hindari semua kontak dengan orang seperti itu.\n"+
                        "<br><br><i>Departemen Petahanan Amerika Serikat, US Army Field Manual \"Survival\" (FM 21-76), Markas Besar Departemen Tentara Amerika Serikat 1956.";
        view.loadData(text , "text/html", "utf-8");
        return rootView;
    }

}
