package com.ibrahim.photographytips;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;


public class TabDesign extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_design);


        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3487493141935710/6836342380");

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
            }
        });

        requestNewInterstitial();

        viewPager = (ViewPager)findViewById(R.id.viewpager);
        if (viewPager != null)
        {
            cameraTypes(viewPager);
        }
        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {
            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab)
            {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab)
            {

            }
        });

        Bundle bundle = getIntent().getExtras();
        int page = bundle.getInt("page");

        if(page==0){

            tabLayout.setVisibility(View.VISIBLE);
            tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
            cameraTypes(viewPager);
            viewPager.setCurrentItem(0);


        }else if(page==1){

            tabLayout.setVisibility(View.GONE);
            partsOfCamera(viewPager);

        }else if(page==2){

            tabLayout.setVisibility(View.VISIBLE);
            tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
            lensTypes(viewPager);
            viewPager.setCurrentItem(0);


        }else if(page==3){


            tabLayout.setVisibility(View.VISIBLE);
            tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
            photographyTerms(viewPager);
            viewPager.setCurrentItem(0);

        }else if(page==4){

            tabLayout.setVisibility(View.GONE);
            shootingModes(viewPager);


        }else if(page==5){


            tabLayout.setVisibility(View.GONE);
            exposure(viewPager);

        }else if(page==6){

            tabLayout.setVisibility(View.VISIBLE);
            tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
            composition(viewPager);
            viewPager.setCurrentItem(0);


        }else if(page==7){

            tabLayout.setVisibility(View.GONE);
            typesOfPhotography(viewPager);
        }






        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:

                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent intent = new Intent(this, MainActivity.class);
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private void cameraTypes(ViewPager viewPager)
    {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFrag(new PointAndShoot(),"Point & Shoot");
        adapter.addFrag(new Dslr(),"Dslr");
        adapter.addFrag(new Mirrorless(),"Mirrorless");

        viewPager.setAdapter(adapter);
    }

    private void partsOfCamera(ViewPager viewPager)
    {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());


        adapter.addFrag(new PartsOfCamera(), "Parts of Camera");

        viewPager.setAdapter(adapter);
    }

    private void lensTypes(ViewPager viewPager)
    {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFrag(new GeneralPurpose(), "General Purpose");
        adapter.addFrag(new SpecialPurpose(), "Special Purpose");
        viewPager.setAdapter(adapter);
    }




    private void photographyTerms(ViewPager viewPager)
    {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFrag(new Aperture(), "Aperture");
        adapter.addFrag(new ShutterSpeed(), "Shutter Speed");
        adapter.addFrag(new Iso(), "Iso");
        adapter.addFrag(new WhiteBalanced(), "White Balanced");
        adapter.addFrag(new Bokeh(), "Bokeh");
        viewPager.setAdapter(adapter);
    }



    private void shootingModes(ViewPager viewPager)
    {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());


        adapter.addFrag(new ShootingModes(), "Shooting Modes");

        viewPager.setAdapter(adapter);
    }


    private void exposure(ViewPager viewPager)
    {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());


        adapter.addFrag(new Exposure(), "Exposure");

        viewPager.setAdapter(adapter);
    }

    private void composition(ViewPager viewPager)
    {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFrag(new RuleOfThird(), "Rule of Third");
        adapter.addFrag(new Patterns(), "Patterns");
        adapter.addFrag(new Shadows(), "Shadows");
        adapter.addFrag(new Silhouette(), "Silhouette");
        adapter.addFrag(new NegativeSpace(), "Negative Space");
        viewPager.setAdapter(adapter);
    }


    private void typesOfPhotography(ViewPager viewPager)
    {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());


        adapter.addFrag(new TypesOfPhotography(), "Types Of Photography");

        viewPager.setAdapter(adapter);
    }






    static class ViewPagerAdapter extends FragmentStatePagerAdapter
    {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager){
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        @Override
        public int getItemPosition(Object object){
            return PagerAdapter.POSITION_NONE;
        }

        public void addFrag(Fragment fragment, String title){
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position){
            return mFragmentTitleList.get(position);
        }
    }


    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("SEE_YOUR_LOGCAT_TO_GET_YOUR_DEVICE_ID")
                .build();

        mInterstitialAd.loadAd(adRequest);
    }



}
