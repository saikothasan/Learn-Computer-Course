package com.demo.learncomputercourse;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.demo.learncomputercourse.Adapters.mainAdapter;
import com.demo.learncomputercourse.classes.RecyclerItemClickListener;
import com.demo.learncomputercourse.models.computermodel;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
   
    RecyclerView recyclerView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);

        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);

        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
     
      
        this.recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new computermodel("Computer Fundamentals", R.drawable.btns_01));
        arrayList.add(new computermodel("Basics", R.drawable.btns_02));
        arrayList.add(new computermodel("Computer Science", R.drawable.btns_03));
        arrayList.add(new computermodel("Operating System", R.drawable.btns_04));
        arrayList.add(new computermodel("Computer Networking", R.drawable.btns_05));
        arrayList.add(new computermodel("Computer Security", R.drawable.btns_06));
        arrayList.add(new computermodel("Network Security", R.drawable.btns_07));
        arrayList.add(new computermodel("Microsoft Word", R.drawable.btns_08));
        arrayList.add(new computermodel("Microsoft Powerpoint", R.drawable.btns_09));
        arrayList.add(new computermodel("Microsoft Excel", R.drawable.btns_10));
        arrayList.add(new computermodel("Organization", R.drawable.btns_11));
        arrayList.add(new computermodel("Wireless Communication", R.drawable.btns_12));
        arrayList.add(new computermodel("Short Key Terms", R.drawable.btns_13));
        this.recyclerView.setAdapter(new mainAdapter(arrayList, this));
        this.recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() { 
            @Override 
            public void onLongItemClick(View view, int i) {
            }

            @Override 
            public void onItemClick(View view, int i) {
                switch (i) {
                    case 0:

                        MainActivity.this.startActivity(new Intent(MainActivity.this, FundamentalActivity.class));
                        return;
                    case 1:
                        MainActivity.this.startActivity(new Intent(MainActivity.this, BasicActivity.class));
                        return;
                    case 2:
                        MainActivity.this.startActivity(new Intent(MainActivity.this, ComputerScienceActivity.class));
                        return;
                    case 3:

                        MainActivity.this.startActivity(new Intent(MainActivity.this, OperatingSystemActivity.class));
                        return;
                    case 4:
                        MainActivity.this.startActivity(new Intent(MainActivity.this, ComputerNetworkingActivity.class));
                        return;
                    case 5:
                        MainActivity.this.startActivity(new Intent(MainActivity.this, ComputerSecurityActivity.class));
                        return;
                    case 6:

                        MainActivity.this.startActivity(new Intent(MainActivity.this, NetworkSecurityActivity.class));
                        return;
                    case 7:
                        MainActivity.this.startActivity(new Intent(MainActivity.this, MicrosoftWordActivity.class));
                        return;
                    case 8:
                        MainActivity.this.startActivity(new Intent(MainActivity.this, MicrosoftPowerpointActivity.class));
                        return;
                    case 9:

                        MainActivity.this.startActivity(new Intent(MainActivity.this, MicrosoftExcelActivity.class));
                        return;
                    case 10:
                        MainActivity.this.startActivity(new Intent(MainActivity.this, OrganizationActivity.class));
                        return;
                    case 11:
                        MainActivity.this.startActivity(new Intent(MainActivity.this, WirelessCommunicationActivity.class));
                        return;
                    case 12:

                        MainActivity.this.startActivity(new Intent(MainActivity.this, ShortcutActivity.class));
                        return;
                    default:
                        return;
                }
            }
        }));
    }

    @Override 
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override 
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {

            case R.id.privacy :
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/")));
                return true;
            case R.id.rateus :
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));
                return true;
            case R.id.share_menu :
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.SUBJECT", getString(R.string.app_name));
                intent.putExtra("android.intent.extra.TEXT", "https://play.google.com/store/apps/details?id=" + getPackageName());
                startActivity(Intent.createChooser(intent, "Share With"));
                return true;
            default:
                return true;
        }
    }

    

}
