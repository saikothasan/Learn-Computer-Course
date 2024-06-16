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


public class MS_Word_FormattingText_Activity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_m_s__word__formatting_text_);


        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);

        getSupportActionBar().setTitle("Microsoft Word");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
     
      
        this.recyclerView = (RecyclerView) findViewById(R.id.recycler_view_MS_formattingtext);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Text Font and Decoration", R.drawable.btns_08));
        arrayList.add(new computermodel("Text Case and Color", R.drawable.btns_08));
        arrayList.add(new computermodel("Text Alignment and Paragraph Indent", R.drawable.btns_08));
        arrayList.add(new computermodel("Create Bullets and Set Tabs", R.drawable.btns_08));
        arrayList.add(new computermodel("Apply Formatting", R.drawable.btns_08));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(MS_Word_FormattingText_Activity.this, receiving_activity_MS_WORD_FORMATTEXT.class);
                intent2.putExtra("FORMATTEXTWORD1", i);
                MS_Word_FormattingText_Activity.this.startActivity(intent2);
            }
        }));
    }

    

}
