package com.demo.learncomputercourse.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.demo.learncomputercourse.R;
import com.demo.learncomputercourse.models.computermodel;
import java.util.ArrayList;


public class mainAdapter extends RecyclerView.Adapter<mainAdapter.viewHolder> {
    Context context;
    ArrayList<computermodel> list;

    public mainAdapter(ArrayList<computermodel> arrayList, Context context) {
        this.list = arrayList;
        this.context = context;
    }

    @Override 
    public viewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new viewHolder(LayoutInflater.from(this.context).inflate(R.layout.sample_main_adapter, viewGroup, false));
    }

    @Override 
    public void onBindViewHolder(viewHolder viewholder, int i) {
        computermodel computermodelVar = this.list.get(i);
        viewholder.textView.setText(computermodelVar.getText());
        viewholder.imageView.setImageResource(computermodelVar.getPic());
    }

    @Override 
    public int getItemCount() {
        return this.list.size();
    }

    
    public class viewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView imageView;
        TextView textView;

        public viewHolder(View view) {
            super(view);
            this.textView = (TextView) view.findViewById(R.id.textview);
            this.imageView = (ImageView) view.findViewById(R.id.img_view_main_adapter);
            this.cardView = (CardView) view.findViewById(R.id.main_card_view);
        }
    }
}
