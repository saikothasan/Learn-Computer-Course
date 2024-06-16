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


public class ExcelAdvanceActivity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_excel_advance);

        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);



        getSupportActionBar().setTitle("Microsoft Excel");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
     
      
        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerview_MS_ExcelAdvance);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Data Filtering", R.drawable.btns_10));
        arrayList.add(new computermodel("Data Sorting", R.drawable.btns_10));
        arrayList.add(new computermodel("Ranges in Excel", R.drawable.btns_10));
        arrayList.add(new computermodel("Data Validation", R.drawable.btns_10));
        arrayList.add(new computermodel("Styles in Excel", R.drawable.btns_10));
        arrayList.add(new computermodel("Themes in Excel", R.drawable.btns_10));
        arrayList.add(new computermodel("Templates in Excel", R.drawable.btns_10));
        arrayList.add(new computermodel("Macros in Excel", R.drawable.btns_10));
        arrayList.add(new computermodel("Graphics in Excel ", R.drawable.btns_10));
        arrayList.add(new computermodel("Cross Referencing", R.drawable.btns_10));
        arrayList.add(new computermodel("Printing Worksheets", R.drawable.btns_10));
        arrayList.add(new computermodel("Email Workbooks", R.drawable.btns_10));
        arrayList.add(new computermodel("Translate Worksheet", R.drawable.btns_10));
        arrayList.add(new computermodel("Workbook Security", R.drawable.btns_10));
        arrayList.add(new computermodel("Data Tables", R.drawable.btns_10));
        arrayList.add(new computermodel("Simple Charts", R.drawable.btns_10));
        arrayList.add(new computermodel("Keyboard Shortcuts", R.drawable.btns_10));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(ExcelAdvanceActivity.this, receiving_activity_Excel_Advance.class);
                intent2.putExtra("excel6", i);
                ExcelAdvanceActivity.this.startActivity(intent2);
            }
        }));
    }

    

}
