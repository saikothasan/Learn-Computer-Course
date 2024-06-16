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


public class WirelessCommunicationActivity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_wireless_communication);
        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);

        getSupportActionBar().setTitle("Wireless Communication");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
     
      
        this.recyclerView = (RecyclerView) findViewById(R.id.wireless_id);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Overview", R.drawable.btns_12));
        arrayList.add(new computermodel("Wireless Technology Trends", R.drawable.btns_12));
        arrayList.add(new computermodel("Internet", R.drawable.btns_12));
        arrayList.add(new computermodel("Bluetooth", R.drawable.btns_12));
        arrayList.add(new computermodel("Terms in Mobile Communication", R.drawable.btns_12));
        arrayList.add(new computermodel("Propagation Losses", R.drawable.btns_12));
        arrayList.add(new computermodel("Wide Area Network", R.drawable.btns_12));
        arrayList.add(new computermodel("Satellite", R.drawable.btns_12));
        arrayList.add(new computermodel("Wireless Application Protocol", R.drawable.btns_12));
        arrayList.add(new computermodel("Multiple Access", R.drawable.btns_12));
        arrayList.add(new computermodel("Wireless Channel", R.drawable.btns_12));
        arrayList.add(new computermodel("Cellular Networks", R.drawable.btns_12));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(WirelessCommunicationActivity.this, receiving_activity_wireless.class);
                intent2.putExtra("wireless1", i);
                WirelessCommunicationActivity.this.startActivity(intent2);
            }
        }));
    }

    

}
