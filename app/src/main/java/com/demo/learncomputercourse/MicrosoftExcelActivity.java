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


public class MicrosoftExcelActivity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_microsoft_excel);



        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);

        getSupportActionBar().setTitle("Microsoft Excel");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
     
      
        this.recyclerView = (RecyclerView) findViewById(R.id.recycler_view_MS_Excel);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("MS Excel Basics", R.drawable.btns_10));
        arrayList.add(new computermodel("Editing Worksheet", R.drawable.btns_10));
        arrayList.add(new computermodel("Formatting Cells", R.drawable.btns_10));
        arrayList.add(new computermodel("Formatting Worksheets", R.drawable.btns_10));
        arrayList.add(new computermodel("Working with Formula", R.drawable.btns_10));
        arrayList.add(new computermodel("Advance Operations", R.drawable.btns_10));
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

                    MicrosoftExcelActivity.this.startActivity(new Intent(MicrosoftExcelActivity.this, ExcelBasicActivity.class));
                } else if (i == 1) {
                    MicrosoftExcelActivity.this.startActivity(new Intent(MicrosoftExcelActivity.this, ExcelEditingWorksheetActivity.class));
                } else if (i == 2) {
                    MicrosoftExcelActivity.this.startActivity(new Intent(MicrosoftExcelActivity.this, ExcelFormatcellActivity.class));
                } else if (i == 3) {

                    MicrosoftExcelActivity.this.startActivity(new Intent(MicrosoftExcelActivity.this, ExcelFormatsheetActivity.class));
                } else if (i == 4) {
                    MicrosoftExcelActivity.this.startActivity(new Intent(MicrosoftExcelActivity.this, ExcelFormulaActivity.class));
                } else if (i == 5) {
                    MicrosoftExcelActivity.this.startActivity(new Intent(MicrosoftExcelActivity.this, ExcelAdvanceActivity.class));
                }
            }
        }));
    }

    

}
