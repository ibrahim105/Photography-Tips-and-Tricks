package com.ibrahim.photographytips;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Handler;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    boolean doubleBackToExitPressedOnce = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.relativelayout, new MainFragment());
        fragmentTransaction.commit();






        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }



    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
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

        if (id == R.id.action_rate_us) {

            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            //intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.ibrahim.photographytips"));
            startActivity(intent);


            return true;

        }else if (id == R.id.action_exit) {

            finish();
            System.exit(0);


            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_rate) {

            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            //intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.ibrahim.photographytips"));
            startActivity(intent);

        } else if (id == R.id.top_apps) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            //intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://play.google.com/store/apps/developer?id=Hexa%20Developers&hl=en"));
            startActivity(intent);

        } else if (id == R.id.app1) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            //intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.riad.ShadowJumperAxion&hl=en"));
            startActivity(intent);

        } else if (id == R.id.app2) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            //intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.riad.axionsoft.stylishinteriordesign&hl=en"));
            startActivity(intent);

        } else if (id == R.id.app3) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            //intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.hexadeveloper.flirtytexts&hl=en"));
            startActivity(intent);

        } else if (id == R.id.app4) {

            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            //intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.axion.ibrahim.lovetextmessages&hl=en"));
            startActivity(intent);

        }


        else if (id == R.id.app5) {

            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            //intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.riad.axionsoft.newnailartdesign&hl=en"));
            startActivity(intent);

        }

        else if (id == R.id.app6) {

            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            //intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.axion.mahade.english2bangladictionary"));
            startActivity(intent);

        }

        else if (id == R.id.app7) {

            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            //intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.axion.ibrahim.studytips&hl=en"));
            startActivity(intent);

        }








        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }





}
