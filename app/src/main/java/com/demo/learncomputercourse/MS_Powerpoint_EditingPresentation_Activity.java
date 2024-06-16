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


public class MS_Powerpoint_EditingPresentation_Activity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_m_s__powerpoint__editing_presentation_);



        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);

        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
     
      
        getSupportActionBar().setTitle("Microsoft PowerPoint");
        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerview_MS_Powerpoint_editingPresentation);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Copy and Paste Content", R.drawable.btns_09));
        arrayList.add(new computermodel("Find and Replace Content", R.drawable.btns_09));
        arrayList.add(new computermodel("Undo Edited Changes", R.drawable.btns_09));
        arrayList.add(new computermodel("Spelling Check", R.drawable.btns_09));
        arrayList.add(new computermodel("Content Translation", R.drawable.btns_09));
        arrayList.add(new computermodel("Setting Language Type", R.drawable.btns_09));
        arrayList.add(new computermodel("Duplicating Content", R.drawable.btns_09));
        arrayList.add(new computermodel("Special Characters", R.drawable.btns_09));
        arrayList.add(new computermodel("Slides Zoom IN/OUT", R.drawable.btns_09));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(MS_Powerpoint_EditingPresentation_Activity.this, receiving_activity_MS_powerpoint_editingpresentation.class);
                intent2.putExtra("ppt2", i);
                MS_Powerpoint_EditingPresentation_Activity.this.startActivity(intent2);
            }
        }));
    }

    

}
