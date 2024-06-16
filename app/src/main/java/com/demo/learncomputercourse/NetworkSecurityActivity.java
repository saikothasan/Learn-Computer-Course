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


public class NetworkSecurityActivity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_network_security);
        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);


        getSupportActionBar().setTitle("Network Security");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
        this.recyclerView = (RecyclerView) findViewById(R.id.networksecurity_id);
     
      
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Overview", R.drawable.btns_07));
        arrayList.add(new computermodel("Application Layer", R.drawable.btns_07));
        arrayList.add(new computermodel("Transport Layer", R.drawable.btns_07));
        arrayList.add(new computermodel("Network Layer", R.drawable.btns_07));
        arrayList.add(new computermodel("Data Link Layer", R.drawable.btns_07));
        arrayList.add(new computermodel("Access Control", R.drawable.btns_07));
        arrayList.add(new computermodel("Firewalls", R.drawable.btns_07));
        arrayList.add(new computermodel("Critical Necessity", R.drawable.btns_07));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(NetworkSecurityActivity.this.getApplicationContext(), receiving_activity_networksecurity.class);
                intent2.putExtra("network", i);
                NetworkSecurityActivity.this.startActivity(intent2);
            }
        }));
    }

    

}
