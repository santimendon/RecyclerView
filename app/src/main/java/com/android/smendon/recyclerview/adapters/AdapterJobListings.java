package com.android.smendon.recyclerview.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.smendon.recyclerview.R;
import com.android.smendon.recyclerview.models.JobListing;

import java.util.List;

/**
 * Created by a619046 on 18-06-2018.
 */

public class AdapterJobListings extends RecyclerView.Adapter<AdapterJobListings.ViewHolder> {
    private List<JobListing> mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtTitle, txtSalary, txtLocation, txtType;

        public ViewHolder(View itemView) {
            super(itemView);
            txtTitle = (TextView) itemView.findViewById(R.id.txt_title);
            txtSalary = (TextView) itemView.findViewById(R.id.txt_salary);
            txtLocation = (TextView) itemView.findViewById(R.id.txt_location);
            txtType = (TextView) itemView.findViewById(R.id.txt_type);
        }
    }

    public AdapterJobListings(List<JobListing> dataset) {
        this.mDataset = dataset;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.rcv_list_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtTitle.setText(mDataset.get(position).getJobTitle());
        holder.txtSalary.setText("\u20B9" + mDataset.get(position).getPay());
        holder.txtLocation.setText(mDataset.get(position).getJobLocation());
        holder.txtType.setText(mDataset.get(position).getJobType());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
