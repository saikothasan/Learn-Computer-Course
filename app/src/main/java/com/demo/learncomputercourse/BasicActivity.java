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


public class BasicActivity extends AppCompatActivity {

    RecyclerView recyclerView;


    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_basic);


        AdAdmob adAdmob = new AdAdmob(this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);

        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));

        this.recyclerView = (RecyclerView) findViewById(R.id.basic_id);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Basics of Computers", R.drawable.btns_02));
        arrayList.add(new computermodel("Functions of OS", R.drawable.btns_02));
        arrayList.add(new computermodel("Utility Software", R.drawable.btns_02));
        arrayList.add(new computermodel("System Software", R.drawable.btns_02));
        arrayList.add(new computermodel("Classification", R.drawable.btns_02));
        arrayList.add(new computermodel("Office Tools", R.drawable.btns_02));
        arrayList.add(new computermodel("Software Concepts", R.drawable.btns_02));
        arrayList.add(new computermodel("Primary Memory", R.drawable.btns_02));
        arrayList.add(new computermodel("Secondary Memory", R.drawable.btns_02));
        arrayList.add(new computermodel("Domain Specific Tools", R.drawable.btns_02));
        arrayList.add(new computermodel("Input/Output Ports", R.drawable.btns_02));
        arrayList.add(new computermodel("Microprocessor Concepts", R.drawable.btns_02));
        arrayList.add(new computermodel("Evaluation of Microprocessor", R.drawable.btns_02));
        arrayList.add(new computermodel("Open Source Software", R.drawable.btns_02));
        arrayList.add(new computermodel("Types of OS", R.drawable.btns_02));
        this.recyclerView.setAdapter(new nextAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onLongItemClick(View view, int i) {
            }

            @Override
            public void onItemClick(View view, final int i) {

                Intent intent2 = new Intent(BasicActivity.this.getApplicationContext(), receiving_activity_basic.class);
                intent2.putExtra("key1", i);
                BasicActivity.this.startActivity(intent2);
            }
        }));
    }

}
