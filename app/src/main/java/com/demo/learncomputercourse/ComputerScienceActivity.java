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


public class ComputerScienceActivity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_computer_science);

        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);


        getSupportActionBar().setTitle("Computer Science");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
     
      
        this.recyclerView = (RecyclerView) findViewById(R.id.computer_id);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Fundamental Concepts", R.drawable.btns_03));
        arrayList.add(new computermodel("Computer Security", R.drawable.btns_03));
        arrayList.add(new computermodel("Development", R.drawable.btns_03));
        arrayList.add(new computermodel("Multimedia", R.drawable.btns_03));
        arrayList.add(new computermodel("Threat", R.drawable.btns_03));
        arrayList.add(new computermodel("Data Processing", R.drawable.btns_03));
        arrayList.add(new computermodel("Programming Languages", R.drawable.btns_03));
        arrayList.add(new computermodel("Electronic Commerce", R.drawable.btns_03));
        arrayList.add(new computermodel("Computer Network Terminology", R.drawable.btns_03));
        arrayList.add(new computermodel("Abbreviations", R.drawable.btns_03));
        arrayList.add(new computermodel("Computer Related Jobs", R.drawable.btns_03));
        arrayList.add(new computermodel("SDLC", R.drawable.btns_03));
        arrayList.add(new computermodel("Algorithm Flowchart", R.drawable.btns_03));
        arrayList.add(new computermodel("Computer Virus", R.drawable.btns_03));
        arrayList.add(new computermodel("Windows Desktop Elements", R.drawable.btns_03));
        arrayList.add(new computermodel("Analog and Digital", R.drawable.btns_03));
        arrayList.add(new computermodel("Role of Computer in Modern Life", R.drawable.btns_03));
        arrayList.add(new computermodel("Internet and Intranet", R.drawable.btns_03));
        arrayList.add(new computermodel("Extranet", R.drawable.btns_03));
        arrayList.add(new computermodel("Computer System", R.drawable.btns_03));
        arrayList.add(new computermodel("Innovators", R.drawable.btns_03));
        arrayList.add(new computermodel("Mobile", R.drawable.btns_03));
        arrayList.add(new computermodel("Shortcut Keys", R.drawable.btns_03));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(ComputerScienceActivity.this.getApplicationContext(), receiving_activity_computerscience.class);
                intent2.putExtra("sci", i);
                ComputerScienceActivity.this.startActivity(intent2);
            }
        }));
    }

    

}
