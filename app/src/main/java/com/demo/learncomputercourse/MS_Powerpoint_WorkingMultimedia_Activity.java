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


public class MS_Powerpoint_WorkingMultimedia_Activity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_m_s__powerpoint__working_multimedia_);



        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);


        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
     
      
        getSupportActionBar().setTitle("Microsoft PowerPoint");
        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerview_MS_Powerpoint_Multimedia);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Add Pictures to Slides", R.drawable.btns_09));
        arrayList.add(new computermodel("Editing added Pictures", R.drawable.btns_09));
        arrayList.add(new computermodel("Format added Pictures", R.drawable.btns_09));
        arrayList.add(new computermodel("Inserting a Screenshot", R.drawable.btns_09));
        arrayList.add(new computermodel("Adding Shapes to Slides", R.drawable.btns_09));
        arrayList.add(new computermodel("Editing added Shapes", R.drawable.btns_09));
        arrayList.add(new computermodel("Format added Shapes", R.drawable.btns_09));
        arrayList.add(new computermodel("Adding Text to Shapes", R.drawable.btns_09));
        arrayList.add(new computermodel("Arrange Shapes/Images", R.drawable.btns_09));
        arrayList.add(new computermodel("Group/Ungroup Objects", R.drawable.btns_09));
        arrayList.add(new computermodel("Adding Audio/Video", R.drawable.btns_09));
        arrayList.add(new computermodel("Add and Format Tables", R.drawable.btns_09));
        arrayList.add(new computermodel("Add and Format Charts", R.drawable.btns_09));
        arrayList.add(new computermodel("Add and Format SmartArt", R.drawable.btns_09));
        arrayList.add(new computermodel("Add and Preview Animations", R.drawable.btns_09));
        arrayList.add(new computermodel("Add and Preview Transitions", R.drawable.btns_09));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(MS_Powerpoint_WorkingMultimedia_Activity.this, receiving_activity_MS_powerpoint_WorkingMultimedia.class);
                intent2.putExtra("ppt4", i);
                MS_Powerpoint_WorkingMultimedia_Activity.this.startActivity(intent2);
            }
        }));
    }

    

}
