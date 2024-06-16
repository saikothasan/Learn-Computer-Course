package com.demo.learncomputercourse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.demo.learncomputercourse.Adapters.nextAdapter;
import com.demo.learncomputercourse.classes.RecyclerItemClickListener;
import com.demo.learncomputercourse.models.computermodel;
import java.util.ArrayList;


public class FundamentalActivity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_fundamental);



        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);

        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
     
      
        this.recyclerView = (RecyclerView) findViewById(R.id.fundamental_id);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Overview", R.drawable.btns_01));
        arrayList.add(new computermodel("Applications", R.drawable.btns_01));
        arrayList.add(new computermodel("Generations", R.drawable.btns_01));
        arrayList.add(new computermodel("Types", R.drawable.btns_01));
        arrayList.add(new computermodel("Components", R.drawable.btns_01));
        arrayList.add(new computermodel(" CPU (Central Processing Unit)", R.drawable.btns_01));
        arrayList.add(new computermodel("Input Devices", R.drawable.btns_01));
        arrayList.add(new computermodel("Output Devices", R.drawable.btns_01));
        arrayList.add(new computermodel("Memory", R.drawable.btns_01));
        arrayList.add(new computermodel("RAM (Random Access Memory)", R.drawable.btns_01));
        arrayList.add(new computermodel("ROM (Read Only Memory)", R.drawable.btns_01));
        arrayList.add(new computermodel("Motherboard", R.drawable.btns_01));
        arrayList.add(new computermodel("Memory Units", R.drawable.btns_01));
        arrayList.add(new computermodel("Ports", R.drawable.btns_01));
        arrayList.add(new computermodel("Hardware", R.drawable.btns_01));
        arrayList.add(new computermodel("Software", R.drawable.btns_01));
        arrayList.add(new computermodel("Number System", R.drawable.btns_01));
        arrayList.add(new computermodel("Number Conversion", R.drawable.btns_01));
        arrayList.add(new computermodel("Data and Information", R.drawable.btns_01));
        arrayList.add(new computermodel("Networking", R.drawable.btns_01));
        arrayList.add(new computermodel("Operating System", R.drawable.btns_01));
        arrayList.add(new computermodel("Internet and Intranet", R.drawable.btns_01));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(FundamentalActivity.this.getApplicationContext(), receiving_activity_fundamental.class);
                intent2.putExtra("key", i);
                FundamentalActivity.this.startActivity(intent2);
            }
        }));
    }

    

}
