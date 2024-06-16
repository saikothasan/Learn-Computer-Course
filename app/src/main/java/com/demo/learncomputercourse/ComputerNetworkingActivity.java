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


public class ComputerNetworkingActivity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_computer_networking);


        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);

        getSupportActionBar().setTitle("Computer Networking");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
       

        this.recyclerView = (RecyclerView) findViewById(R.id.computer_networking_id);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("DCN", R.drawable.btns_05));
        arrayList.add(new computermodel("Physical Layer", R.drawable.btns_05));
        arrayList.add(new computermodel("Data Link Layer", R.drawable.btns_05));
        arrayList.add(new computermodel("Network Layer", R.drawable.btns_05));
        arrayList.add(new computermodel("Transport Layer", R.drawable.btns_05));
        arrayList.add(new computermodel("Application Layer", R.drawable.btns_05));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, int i) {
                if (i == 0) {

                    ComputerNetworkingActivity.this.startActivity(new Intent(ComputerNetworkingActivity.this.getApplicationContext(), ComputerNetworkingActivity_DCN.class));
                } else if (i == 1) {
                    ComputerNetworkingActivity.this.startActivity(new Intent(ComputerNetworkingActivity.this.getApplicationContext(), ComputerNetworkingActivity_physical.class));
                } else if (i == 2) {
                    ComputerNetworkingActivity.this.startActivity(new Intent(ComputerNetworkingActivity.this.getApplicationContext(), ComputerNetworkingActivity_data.class));
                } else if (i == 3) {

                    ComputerNetworkingActivity.this.startActivity(new Intent(ComputerNetworkingActivity.this.getApplicationContext(), ComputerNetworkingActivity_network.class));
                } else if (i == 4) {
                    ComputerNetworkingActivity.this.startActivity(new Intent(ComputerNetworkingActivity.this.getApplicationContext(), ComputerNetworkingActivity_transport.class));
                } else if (i == 5) {

                    ComputerNetworkingActivity.this.startActivity(new Intent(ComputerNetworkingActivity.this.getApplicationContext(), ComputerNetworkingActivity_application.class));
                }
            }
        }));
    }

}
