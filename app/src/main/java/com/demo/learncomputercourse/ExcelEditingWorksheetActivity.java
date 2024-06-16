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


public class ExcelEditingWorksheetActivity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_excel_editing_worksheet);



        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);



        getSupportActionBar().setTitle("Microsoft Excel");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
     
      
        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerview_MS_ExcelEditingWorksheet);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Insert Data", R.drawable.btns_10));
        arrayList.add(new computermodel("Select Data", R.drawable.btns_10));
        arrayList.add(new computermodel("Delete Data", R.drawable.btns_10));
        arrayList.add(new computermodel("Move Data", R.drawable.btns_10));
        arrayList.add(new computermodel("Rows and Columns", R.drawable.btns_10));
        arrayList.add(new computermodel("Copy and Paste", R.drawable.btns_10));
        arrayList.add(new computermodel("Find and Replace", R.drawable.btns_10));
        arrayList.add(new computermodel("Spell Check", R.drawable.btns_10));
        arrayList.add(new computermodel("Zoom IN/OUT", R.drawable.btns_10));
        arrayList.add(new computermodel("Special Symbols", R.drawable.btns_10));
        arrayList.add(new computermodel("Insert Comments", R.drawable.btns_10));
        arrayList.add(new computermodel("Add Text Box", R.drawable.btns_10));
        arrayList.add(new computermodel("Undo Changes", R.drawable.btns_10));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(ExcelEditingWorksheetActivity.this, receiving_activity_Excel_Edit_Worksheet.class);
                intent2.putExtra("excel2", i);
                ExcelEditingWorksheetActivity.this.startActivity(intent2);
            }
        }));
    }

    

}
