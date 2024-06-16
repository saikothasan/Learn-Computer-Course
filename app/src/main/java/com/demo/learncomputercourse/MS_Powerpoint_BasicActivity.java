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


public class MS_Powerpoint_BasicActivity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_m_s__powerpoint__basic);


        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);

        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
     
      
        getSupportActionBar().setTitle("Microsoft PowerPoint");
        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerview_MS_Powerpoint_Basic);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Getting Started Powerpoint", R.drawable.btns_09));
        arrayList.add(new computermodel("Explore Window", R.drawable.btns_09));
        arrayList.add(new computermodel("Backstage View", R.drawable.btns_09));
        arrayList.add(new computermodel("Create Presentation", R.drawable.btns_09));
        arrayList.add(new computermodel("Add New Slides", R.drawable.btns_09));
        arrayList.add(new computermodel("Adding text in Slides", R.drawable.btns_09));
        arrayList.add(new computermodel("Adding New Text Boxes", R.drawable.btns_09));
        arrayList.add(new computermodel("Deleting Existing Slides", R.drawable.btns_09));
        arrayList.add(new computermodel("Rearranging Slides", R.drawable.btns_09));
        arrayList.add(new computermodel("Adding Speaker Notes", R.drawable.btns_09));
        arrayList.add(new computermodel("Managing Sections", R.drawable.btns_09));
        arrayList.add(new computermodel("Working With Outlines", R.drawable.btns_09));
        arrayList.add(new computermodel("Slide Thumbnails", R.drawable.btns_09));
        arrayList.add(new computermodel("Presentation View", R.drawable.btns_09));
        arrayList.add(new computermodel("Setting Background", R.drawable.btns_09));
        arrayList.add(new computermodel("Slide Orientation", R.drawable.btns_09));
        arrayList.add(new computermodel("Saving Presentation", R.drawable.btns_09));
        arrayList.add(new computermodel("Review Presentation", R.drawable.btns_09));
        arrayList.add(new computermodel("Adding Slide Numbers", R.drawable.btns_09));
        arrayList.add(new computermodel("Adding Header and Footer", R.drawable.btns_09));
        arrayList.add(new computermodel("Running Slideshow", R.drawable.btns_09));
        arrayList.add(new computermodel("Keyboard Shortcuts", R.drawable.btns_09));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(MS_Powerpoint_BasicActivity.this, receiving_activity_MS_powerpoint_basic.class);
                intent2.putExtra("ppt1", i);
                MS_Powerpoint_BasicActivity.this.startActivity(intent2);
            }
        }));
    }

    

}
