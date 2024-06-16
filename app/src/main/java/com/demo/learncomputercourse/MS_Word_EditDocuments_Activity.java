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


public class MS_Word_EditDocuments_Activity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_m_s__word__edit_documents_);

        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);


        getSupportActionBar().setTitle("Microsoft Word");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
     
      
        this.recyclerView = (RecyclerView) findViewById(R.id.recycler_view_MS_EditDocument);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Insert and Select Text", R.drawable.btns_08));
        arrayList.add(new computermodel("Edit and Delete Text", R.drawable.btns_08));
        arrayList.add(new computermodel("Cut,Copy and Paste", R.drawable.btns_08));
        arrayList.add(new computermodel("Find and Replace", R.drawable.btns_08));
        arrayList.add(new computermodel("Spell Check ", R.drawable.btns_08));
        arrayList.add(new computermodel("Zoom IN/OUT", R.drawable.btns_08));
        arrayList.add(new computermodel("Special Symbols", R.drawable.btns_08));
        arrayList.add(new computermodel("Undo Changes", R.drawable.btns_08));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(MS_Word_EditDocuments_Activity.this, receiving_activity_MS_WORD_EDITDOCUMENTS.class);
                intent2.putExtra("EDITDOCWORD", i);
                MS_Word_EditDocuments_Activity.this.startActivity(intent2);
            }
        }));
    }

    

}
