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


public class ExcelFormatsheetActivity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_excel_formatsheet);


        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);


        getSupportActionBar().setTitle("Microsoft Excel");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
     
      
        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerview_MS_ExcelFormattingWorkSheet);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Sheet Option", R.drawable.btns_10));
        arrayList.add(new computermodel("Set Margins", R.drawable.btns_10));
        arrayList.add(new computermodel("Set Orientation", R.drawable.btns_10));
        arrayList.add(new computermodel("Header and Footer", R.drawable.btns_10));
        arrayList.add(new computermodel("Insert Page Number", R.drawable.btns_10));
        arrayList.add(new computermodel("Set Background", R.drawable.btns_10));
        arrayList.add(new computermodel("Freeze Panes", R.drawable.btns_10));
        arrayList.add(new computermodel("Conditional Format", R.drawable.btns_10));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(ExcelFormatsheetActivity.this, receiving_activity_Excel_Format_Sheet.class);
                intent2.putExtra("excel4", i);
                ExcelFormatsheetActivity.this.startActivity(intent2);
            }
        }));
    }

    

}
