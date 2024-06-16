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


public class MicrosoftWordActivity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_microsoft_word);


        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);


        getSupportActionBar().setTitle("Microsoft Word");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
     
      
        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerview_MS_Word);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("MS Word Basics", R.drawable.btns_08));
        arrayList.add(new computermodel("Editing Documents", R.drawable.btns_08));
        arrayList.add(new computermodel("Formatting Text", R.drawable.btns_08));
        arrayList.add(new computermodel("Formatting Pages", R.drawable.btns_08));
        arrayList.add(new computermodel("Working with Tables", R.drawable.btns_08));
        arrayList.add(new computermodel("Advanced Operations", R.drawable.btns_08));
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

                    MicrosoftWordActivity.this.startActivity(new Intent(MicrosoftWordActivity.this, MS_Word_Basic_Activity.class));
                } else if (i == 1) {
                    MicrosoftWordActivity.this.startActivity(new Intent(MicrosoftWordActivity.this, MS_Word_EditDocuments_Activity.class));
                } else if (i == 2) {
                    MicrosoftWordActivity.this.startActivity(new Intent(MicrosoftWordActivity.this, MS_Word_FormattingText_Activity.class));
                } else if (i == 3) {

                    MicrosoftWordActivity.this.startActivity(new Intent(MicrosoftWordActivity.this, MS_Word_formattongPages_Activity.class));
                } else if (i == 4) {
                    MicrosoftWordActivity.this.startActivity(new Intent(MicrosoftWordActivity.this, MS_Word_workingtables_Activity.class));
                } else if (i == 5) {
                    MicrosoftWordActivity.this.startActivity(new Intent(MicrosoftWordActivity.this, MS_Word_AdvancedOperation_Activity.class));
                }
            }
        }));
    }

    

}
