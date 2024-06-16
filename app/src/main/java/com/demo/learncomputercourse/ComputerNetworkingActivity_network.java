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


public class ComputerNetworkingActivity_network extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_computer_networking_network);
        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);


        getSupportActionBar().setTitle("Computer Networking");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));

      
        this.recyclerView = (RecyclerView) findViewById(R.id.computer_networking_network);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Introduction", R.drawable.btns_05));
        arrayList.add(new computermodel("Network Layer Protocols", R.drawable.btns_05));
        arrayList.add(new computermodel("Internet Working", R.drawable.btns_05));
        arrayList.add(new computermodel("Network Addressing", R.drawable.btns_05));
        arrayList.add(new computermodel("Network Layer Routing", R.drawable.btns_05));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(ComputerNetworkingActivity_network.this.getApplicationContext(), receiving_activity_network.class);
                intent2.putExtra("new4", i);
                ComputerNetworkingActivity_network.this.startActivity(intent2);
            }
        }));
    }

}
