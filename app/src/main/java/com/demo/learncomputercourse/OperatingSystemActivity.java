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


public class OperatingSystemActivity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_operating_system);




        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);


        getSupportActionBar().setTitle("Operating System");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
     
      
        this.recyclerView = (RecyclerView) findViewById(R.id.operatingsystem_id);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Overview", R.drawable.btns_04));
        arrayList.add(new computermodel("Types of OS", R.drawable.btns_04));
        arrayList.add(new computermodel("System Process of OS", R.drawable.btns_04));
        arrayList.add(new computermodel("System Services of OS", R.drawable.btns_04));
        arrayList.add(new computermodel("I/O OS Harware", R.drawable.btns_04));
        arrayList.add(new computermodel("I/O OS Software", R.drawable.btns_04));
        arrayList.add(new computermodel("OS Security", R.drawable.btns_04));
        arrayList.add(new computermodel("OS Multi-threading", R.drawable.btns_04));
        arrayList.add(new computermodel("OS File System", R.drawable.btns_04));
        arrayList.add(new computermodel("OS Memory Manage", R.drawable.btns_04));
        arrayList.add(new computermodel("OS Virtual Memory", R.drawable.btns_04));
        arrayList.add(new computermodel("OS Properties", R.drawable.btns_04));
        arrayList.add(new computermodel("OS Scheduling Process", R.drawable.btns_04));
        arrayList.add(new computermodel("OS Scheduling Algorithm", R.drawable.btns_04));
        arrayList.add(new computermodel("OS Linux", R.drawable.btns_04));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(OperatingSystemActivity.this.getApplicationContext(), receiving_activity_operating_system.class);
                intent2.putExtra("key3", i);
                OperatingSystemActivity.this.startActivity(intent2);
            }
        }));
    }

    

}
