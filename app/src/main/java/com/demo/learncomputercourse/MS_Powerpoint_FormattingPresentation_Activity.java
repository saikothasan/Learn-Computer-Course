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


public class MS_Powerpoint_FormattingPresentation_Activity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_m_s__powerpoint__formatting_presentation_);

        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);

        getSupportActionBar().setTitle("Microsoft PowerPoint");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
     
      
        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerview_MS_Powerpoint_formattingPresentation);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Font Management", R.drawable.btns_09));
        arrayList.add(new computermodel("Change Text Font", R.drawable.btns_09));
        arrayList.add(new computermodel("Text Decoration", R.drawable.btns_09));
        arrayList.add(new computermodel("Change Text Case", R.drawable.btns_09));
        arrayList.add(new computermodel("Change Text Size", R.drawable.btns_09));
        arrayList.add(new computermodel("Change Text Color", R.drawable.btns_09));
        arrayList.add(new computermodel("Text Alignment & Indent Paragraph", R.drawable.btns_09));
        arrayList.add(new computermodel("Borders and Shades", R.drawable.btns_09));
        arrayList.add(new computermodel("Apply Formatting", R.drawable.btns_09));
        arrayList.add(new computermodel("Slide Master", R.drawable.btns_09));
        arrayList.add(new computermodel("Save Design Templete", R.drawable.btns_09));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(MS_Powerpoint_FormattingPresentation_Activity.this, receiving_activity_MS_powerpoint_formattingPresentation.class);
                intent2.putExtra("ppt3", i);
                MS_Powerpoint_FormattingPresentation_Activity.this.startActivity(intent2);
            }
        }));
    }

    

}
