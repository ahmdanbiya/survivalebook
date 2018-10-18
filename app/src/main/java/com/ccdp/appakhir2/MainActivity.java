package com.ccdp.appakhir2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id){
        //case R.id.action_add:
        //Intent intent = new Intent(MainActivity.this,AddKebersihanActivity.class);
        //startActivity(intent);
        //break;

       /// case R.id.action_logout:
        ///logout();
        //break;

            case R.id.action_exit:
            finish();
            break;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_psikologi) {
            setTitle("Psikologi");
            Psikologi psikologi = new Psikologi();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, psikologi).commit();
        } else if (id == R.id.nav_pendahuluan) {
            setTitle("Pendahuluan");
            Pendahuluan pendahuluan = new Pendahuluan();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, pendahuluan).commit();
        } else if (id == R.id.nav_makanan) {
            setTitle("Makanan");
            Makanan makanan = new Makanan();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, makanan).commit();
        } else if (id == R.id.nav_perencanaan) {
            setTitle("Perencanaan");
            Perencanaan perencanaan = new Perencanaan();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, perencanaan).commit();
        } else if (id == R.id.nav_obat) {
            setTitle("Pertolongan Pertama");
            Pertolongan pertolongan = new Pertolongan();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, pertolongan).commit();
        } else if (id == R.id.nav_penanda) {
            setTitle("Sinyal Penanda");
            Tanda tanda = new Tanda();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, tanda).commit();
        } else if (id == R.id.nav_home) {
            setTitle("Tempat Perlindungan");
            Perlindungan perlindungan = new Perlindungan();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, perlindungan).commit();
        } else if (id == R.id.nav_bahaya) {
            setTitle("Ancaman bahaya");
            Bahaya bahaya = new Bahaya();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, bahaya).commit();
        } else if (id == R.id.nav_air) {
            setTitle("Air");
            Air air = new Air();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, air).commit();
        } else if (id == R.id.nav_api) {
            setTitle("Api");
            Api api = new Api();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, api).commit();
        } else if (id == R.id.nav_cuaca) {
            setTitle("Cuaca");
            Cuaca cuaca = new Cuaca();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, cuaca).commit();
        } else if (id == R.id.nav_peralatan) {
            setTitle("Peralatan");
            Peralatan peralatan = new Peralatan();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, peralatan).commit();
        } else if (id == R.id.nav_jebakan) {
            setTitle("Jebakan");
            Jebakan jebakan = new Jebakan();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, jebakan).commit();
        } else if (id == R.id.nav_tumbuhan) {
            setTitle("Tumbuhan");
            Tumbuhan tumbuhan = new Tumbuhan();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, tumbuhan).commit();
        } else if (id == R.id.nav_credit) {
            setTitle("Credit");
            Credit credit = new Credit();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, credit).commit();
        } else if (id == R.id.nav_masyarakat) {
            setTitle("Masyarakat");
            Masyarakat masyarakat = new Masyarakat();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, masyarakat).commit();
        } else if (id == R.id.nav_lokasi) {
            setTitle("Navigasi");
            Navigasi navigasi = new Navigasi();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, navigasi).commit();
            } else if (id == R.id.nav_kompas) {
            Intent kompas = new Intent(MainActivity.this, KompasActivity.class);
            kompas.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(kompas);
        } else if (id == R.id.nav_kanvas) {
            Intent drawing = new Intent(MainActivity.this, DrawingActivity.class);
            drawing.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(drawing);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
