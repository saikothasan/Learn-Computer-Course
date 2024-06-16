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


public class MicrosoftPowerpointActivity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_microsoft_powerpoint);

        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);


        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
     
      
        getSupportActionBar().setTitle("Microsoft PowerPoint");
        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerview_MS_Powerpoint);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("MS Powerpoint Basics", R.drawable.btns_09));
        arrayList.add(new computermodel("Editing Presentation", R.drawable.btns_09));
        arrayList.add(new computermodel("Formatting Presentation", R.drawable.btns_09));
        arrayList.add(new computermodel("Working with Multimedia", R.drawable.btns_09));
        arrayList.add(new computermodel("Sharing Presentation", R.drawable.btns_09));
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

                    MicrosoftPowerpointActivity.this.startActivity(new Intent(MicrosoftPowerpointActivity.this, MS_Powerpoint_BasicActivity.class));
                } else if (i == 1) {
                    MicrosoftPowerpointActivity.this.startActivity(new Intent(MicrosoftPowerpointActivity.this, MS_Powerpoint_EditingPresentation_Activity.class));
                } else if (i == 2) {
                    MicrosoftPowerpointActivity.this.startActivity(new Intent(MicrosoftPowerpointActivity.this, MS_Powerpoint_FormattingPresentation_Activity.class));
                } else if (i != 3) {
                    if (i == 4) {
                        MicrosoftPowerpointActivity.this.startActivity(new Intent(MicrosoftPowerpointActivity.this, MS_Powerpoint_SharingPresentation_Activity.class));
                    }
                }  else {
                    MicrosoftPowerpointActivity.this.startActivity(new Intent(MicrosoftPowerpointActivity.this, MS_Powerpoint_WorkingMultimedia_Activity.class));
                }
            }
        }));
    }

    

}
