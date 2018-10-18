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
public class Credit extends Fragment {


    public Credit() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_credit,
                container, false);
        WebView view = (WebView) rootView.findViewById(R.id.credit1);
        String text = "http://tri-santiadji.blogspot.co.id/2014/03/psikologi-dalam-survival.html <br>(Psikologi Dalam Survival)<br>" +
                "<br>https://kapabe.wordpress.com/2015/04/30/cara-mengetahui-cuaca-dari-tanda-tanda-alam/ <br>(Cara Mengetahui Cuaca Dari Tanda Tanda Alam)<br>" +
                "<br>NS. Adiyuwono, Survival Teknik Bertahan Hidup di Alam Bebas, PT. Angkasa Bandung 1993.<br>" +
                "<br>http://oltlo.blogspot.co.id/2012/12/cara-mendapatkan-air.html <br>(Cara Mendapatkan Air)<br>" +
                "<br>https://lampukecil.com/2014/04/08/cara-menemukan-air-saat-terdampar-di-pulau-tak-berpenghuni/ <br>(Cara Menemukan Air saat Terdampar di Pulau tak Berpenghuni).<br>" +
                "<br>http://indranicellizer.blogspot.co.id/p/teknik-mendapatkan-air-saat-survival.html <br>(Teknik Mendapatkan Air Saat Survival<br>" +
                "<br>http://pasabana-smarihexa.blogspot.co.id/p/blog-page_1469.html <br>(Cara Menemukain Air Di Alam Bebas<br>" +
                "<br>http://phinemo.com/cara-mendapatkan-air-di-alam-bebas/ <br>(Cara Mendapatkan Air Di Alam Bebas)<br>" +
                "<br>http://www.sangfajar.com/2016/10/cara-mendapatkan-air-di-alam-bebas.html <br>(Cara Mendapatkan Air Di Alam Bebas)<br>" +
                "<br>http://boyslife.org/outdoors/3473/taking-shelter/ <br>(Taking Shelter)<br>" +
                "<br>http://infopendaki.com/35-jenis-tumbuhan-di-hutan-yang-bisa-dimakan/<br> (35 Jenis Tumbuhan Yang Bisa Dimakan)<br>" +
                "<br>https://basisgear.com/edible-wild-plants/ <br> (Edible Wild Plants<br>"+
                "<br>https://id.wikipedia.org/wiki/Ranjau_darat <br>(Ranjau Darat)<br>" +
                "<br>http://www.wilderness-survival.net/food-2.php <br>(Trap And Snare)<br>" +
                "<br>Departemen Petahanan Amerika Serikat, US Army Field Manual \"Survival\" (FM 21-76), Markas Besar Departemen Tentara Amerika Serikat 1956. \n" +
                "\n";
        view.loadData(text , "text/html", "utf-8");
        return rootView;
    }

}
