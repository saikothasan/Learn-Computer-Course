package com.demo.learncomputercourse.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.demo.learncomputercourse.R;
import com.demo.learncomputercourse.models.computermodel;
import java.util.ArrayList;


public class nextAdapter extends RecyclerView.Adapter<nextAdapter.viewHolder> {
    ArrayList<computermodel> Array_list;
    Context context;

    public nextAdapter(ArrayList<computermodel> arrayList, Context context) {
        this.Array_list = arrayList;
        this.context = context;
    }

    @Override 
    public viewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new viewHolder(LayoutInflater.from(this.context).inflate(R.layout.sample_next_adapter, viewGroup, false));
    }

    @Override 
    public void onBindViewHolder(viewHolder viewholder, int i) {
        computermodel computermodelVar = this.Array_list.get(i);
        viewholder.textView.setText(computermodelVar.getText());
        viewholder.imageView.setImageResource(computermodelVar.getPic());
    }

    @Override 
    public int getItemCount() {
        return this.Array_list.size();
    }

    
    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public viewHolder(View view) {
            super(view);
            this.textView = (TextView) view.findViewById(R.id.fundamental_text_id);
            this.imageView = (ImageView) view.findViewById(R.id.fundalmental_image_id);
        }
    }
}
