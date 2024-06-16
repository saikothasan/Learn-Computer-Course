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


public class ExcelBasicActivity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_excel_basic);

        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);


        getSupportActionBar().setTitle("Microsoft Excel");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
     
      
        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerview_MS_ExcelBasic);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Getting Started", R.drawable.btns_10));
        arrayList.add(new computermodel("Explore Window", R.drawable.btns_10));
        arrayList.add(new computermodel("Backstage View", R.drawable.btns_10));
        arrayList.add(new computermodel("Entering Values", R.drawable.btns_10));
        arrayList.add(new computermodel("Move Around", R.drawable.btns_10));
        arrayList.add(new computermodel("Save Workbook", R.drawable.btns_10));
        arrayList.add(new computermodel("Insert Worksheet", R.drawable.btns_10));
        arrayList.add(new computermodel("Copy Worksheet", R.drawable.btns_10));
        arrayList.add(new computermodel("Hiding Worksheet", R.drawable.btns_10));
        arrayList.add(new computermodel("Delete Worksheet", R.drawable.btns_10));
        arrayList.add(new computermodel("Open Workbook", R.drawable.btns_10));
        arrayList.add(new computermodel("Close Workbook", R.drawable.btns_10));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(ExcelBasicActivity.this, receiving_activity_Excel_Basic.class);
                intent2.putExtra("excel1", i);
                ExcelBasicActivity.this.startActivity(intent2);
            }
        }));
    }

    

}
