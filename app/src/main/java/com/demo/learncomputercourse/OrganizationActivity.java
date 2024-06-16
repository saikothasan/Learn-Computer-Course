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


public class OrganizationActivity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_organization);


        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);

        getSupportActionBar().setTitle("Organization");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
     
      
        this.recyclerView = (RecyclerView) findViewById(R.id.organization_id);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Computer System Organization", R.drawable.btns_11));
        arrayList.add(new computermodel("Binary Codes", R.drawable.btns_11));
        arrayList.add(new computermodel("Binary Arithmetic", R.drawable.btns_11));
        arrayList.add(new computermodel("Digital Registers", R.drawable.btns_11));
        arrayList.add(new computermodel("Digital Counters", R.drawable.btns_11));
        arrayList.add(new computermodel("Computer Architecture", R.drawable.btns_11));
        arrayList.add(new computermodel("Code Conversion", R.drawable.btns_11));
        arrayList.add(new computermodel("Boolean Algebra", R.drawable.btns_11));
        arrayList.add(new computermodel("Sequential and Combinational Circuits", R.drawable.btns_11));
        arrayList.add(new computermodel("Memory", R.drawable.btns_11));
        arrayList.add(new computermodel("Logic Gates", R.drawable.btns_11));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {


                Intent intent2 = new Intent(OrganizationActivity.this, receiving_activity_organization.class);
                intent2.putExtra("organization111", i);
                OrganizationActivity.this.startActivity(intent2);
            }
        }));
    }

    

}
