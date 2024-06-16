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


public class ExcelFormulaActivity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_excel_formula);


        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);
        getSupportActionBar().setTitle("Microsoft Excel");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
     
      
        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerview_MS_ExcelFormula);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Create Formula", R.drawable.btns_10));
        arrayList.add(new computermodel("Copy Formula", R.drawable.btns_10));
        arrayList.add(new computermodel("Formula Reference", R.drawable.btns_10));
        arrayList.add(new computermodel("Using Functions", R.drawable.btns_10));
        arrayList.add(new computermodel("Built-In-Functions", R.drawable.btns_10));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(ExcelFormulaActivity.this, receiving_activity_Excel_Formula.class);
                intent2.putExtra("excel5", i);
                ExcelFormulaActivity.this.startActivity(intent2);
            }
        }));
    }

    

}
