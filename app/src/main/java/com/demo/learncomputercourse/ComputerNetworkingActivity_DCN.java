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


public class ComputerNetworkingActivity_DCN extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_computer_networking_next);

        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);


        getSupportActionBar().setTitle("Computer Networking");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
        this.recyclerView = (RecyclerView) findViewById(R.id.computer_networking_next);

      
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Overview", R.drawable.btns_05));
        arrayList.add(new computermodel("Types of Computer Network", R.drawable.btns_05));
        arrayList.add(new computermodel("Computer Network Security", R.drawable.btns_05));
        arrayList.add(new computermodel("Computer Network Topologies", R.drawable.btns_05));
        arrayList.add(new computermodel("Network LAN Technologies", R.drawable.btns_05));
        arrayList.add(new computermodel("Computer Network Models", R.drawable.btns_05));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(ComputerNetworkingActivity_DCN.this.getApplicationContext(), receiving_activity_dcn.class);
                intent2.putExtra("new1", i);
                ComputerNetworkingActivity_DCN.this.startActivity(intent2);
            }
        }));
    }


}
