package com.appteamnith.hillffair.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.appteamnith.hillffair.R;
import com.appteamnith.hillffair.adapters.SponsorAdapter;
import com.appteamnith.hillffair.application.SharedPref;
import com.appteamnith.hillffair.models.SponsorItem;

import java.util.ArrayList;

public class SponsorActivity extends AppCompatActivity {

    RecyclerView rvSponsor;
    SponsorAdapter sponsorAdapter;
    Toolbar tbSponsor;
    ArrayList<SponsorItem> sponsorItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPref pref= new SharedPref(this);
        setTheme(pref.getThemeId());
        super.onCreate(savedInstanceState);
        SharedPref pref= new SharedPref(this);
        setTheme(pref.getThemeId());
        setContentView(R.layout.activity_sponsor);
        String BASE_URL="https://s3.ap-south-1.amazonaws.com/hillffair2016/images/";
        rvSponsor = (RecyclerView)findViewById(R.id.rvSponsor);

        sponsorItems = new ArrayList<>();
        /*sponsorItems.add(new SponsorItem("Fossbytes",R.drawable.fossbyte));
        sponsorItems.add(new SponsorItem("SBI",R.drawable.fossbyte));
        sponsorItems.add(new SponsorItem("SVJN",R.drawable.fossbyte));
        sponsorItems.add(new SponsorItem("The Big Jump",R.drawable.fossbyte));
        sponsorItems.add(new SponsorItem("Tata Powers",R.drawable.fossbyte));
        sponsorItems.add(new SponsorItem("Prodot",R.drawable.fossbyte));
        sponsorItems.add(new SponsorItem("HimCab",R.drawable.fossbyte));*/

        sponsorItems.add(new SponsorItem("Board Of School Education, H.P.",BASE_URL+"sponsor-16.png"));
        sponsorItems.add(new SponsorItem("Tata Shaktee",BASE_URL+"sponsor-17.png"));
        sponsorItems.add(new SponsorItem("Cad Desk",BASE_URL+"sponsor-18.png"));
    //  sponsorItems.add(new SponsorItem("",BASE_URL+"sponsor-4.png"));
        sponsorItems.add(new SponsorItem("HPSEDC",BASE_URL+"sponsor-19.png"));
        sponsorItems.add(new SponsorItem("Ratan Jewellers",BASE_URL+"sponsor-20.png"));
        sponsorItems.add(new SponsorItem("Chankya The Guru",BASE_URL+"sponsor-21.png"));


        sponsorAdapter = new SponsorAdapter(sponsorItems,SponsorActivity.this);
        rvSponsor.setAdapter(sponsorAdapter);

        tbSponsor = (Toolbar)findViewById(R.id.tbSponsor);
        tbSponsor.setTitle("Our Sponsors");
        setSupportActionBar(tbSponsor);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        LinearLayoutManager lvmanager = new LinearLayoutManager(this);
        lvmanager.setOrientation(LinearLayoutManager.VERTICAL);
        rvSponsor.setLayoutManager(lvmanager);
    }
}