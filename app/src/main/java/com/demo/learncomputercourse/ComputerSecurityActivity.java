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


public class ComputerSecurityActivity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_computer_security);


        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);


        getSupportActionBar().setTitle("Computer Security");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
     
      
        this.recyclerView = (RecyclerView) findViewById(R.id.computersecurity_id);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Overview", R.drawable.btns_06));
        arrayList.add(new computermodel("Anti viruses", R.drawable.btns_06));
        arrayList.add(new computermodel("Data backup and recovery", R.drawable.btns_06));
        arrayList.add(new computermodel("Network", R.drawable.btns_06));
        arrayList.add(new computermodel("Computer Security elements", R.drawable.btns_06));
        arrayList.add(new computermodel("Malwares", R.drawable.btns_06));
        arrayList.add(new computermodel("Encryption", R.drawable.btns_06));
        arrayList.add(new computermodel("Disaster Recovery", R.drawable.btns_06));
        arrayList.add(new computermodel("Computer Security terminologies", R.drawable.btns_06));
        arrayList.add(new computermodel("Securing OS", R.drawable.btns_06));
        arrayList.add(new computermodel("Computer Security policies", R.drawable.btns_06));
        arrayList.add(new computermodel("Layers of Security", R.drawable.btns_06));
        arrayList.add(new computermodel("Security Checklist", R.drawable.btns_06));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(ComputerSecurityActivity.this, receiving_activity_computer_security.class);
                intent2.putExtra("computersecurity", i);
                ComputerSecurityActivity.this.startActivity(intent2);
            }
        }));
    }

    

}
