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


public class MS_Powerpoint_SharingPresentation_Activity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_m_s__powerpoint__sharing_presentation_);

        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);


        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
        getSupportActionBar().setTitle("Microsoft PowerPoint");
        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerview_MS_Powerpoint_sharingPresentation);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Create a PDF File", R.drawable.btns_09));
        arrayList.add(new computermodel("Create a Video File", R.drawable.btns_09));
        arrayList.add(new computermodel("Create Image File", R.drawable.btns_09));
        arrayList.add(new computermodel("Printing Presentation", R.drawable.btns_09));
        arrayList.add(new computermodel("Broadcast Slide Show", R.drawable.btns_09));
        arrayList.add(new computermodel("Packaging Presentation", R.drawable.btns_09));
        arrayList.add(new computermodel("Setting Document Password", R.drawable.btns_09));
        arrayList.add(new computermodel("Email Slide Show", R.drawable.btns_09));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(MS_Powerpoint_SharingPresentation_Activity.this, receiving_activity_MS_powerpoint_SharingPresentation.class);
                intent2.putExtra("ppt5", i);
                MS_Powerpoint_SharingPresentation_Activity.this.startActivity(intent2);
            }
        }));
    }

    

}
