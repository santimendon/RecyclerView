package com.android.smendon.recyclerview.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import com.android.smendon.recyclerview.R;
import com.android.smendon.recyclerview.adapters.AdapterJobListings;
import com.android.smendon.recyclerview.listeners.RecyclerviewItemClickListener;
import com.android.smendon.recyclerview.models.JobListing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sanket Mendon on 30-05-2018.
 */

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<JobListing> mListings = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        initViewComponents();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    private void initViewComponents() {
        getSupportActionBar().setTitle("Job Listings");
        mRecyclerView = (RecyclerView) findViewById(R.id.rcv_job_listings);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        mAdapter = new AdapterJobListings(mListings);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addOnItemTouchListener(new RecyclerviewItemClickListener(this, mRecyclerView, new RecyclerviewItemClickListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                String toastMsg = mListings.get(position).getJobTitle() + "\nSalary: " + mListings.get(position).getPay();
                Toast.makeText(RecyclerViewActivity.this, toastMsg, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        mListings.add(new JobListing("IOS Developer", "ZS Associates Ltd", "Noida, India", "Full-time", "4", "Swift", "12,00,0000"));

        mListings.add(new JobListing("Senior Mobile Developer", "Myntra Pvt Ltd",
                "Bangalore, India", "Full-time", "6", "Android | Ionic",
                "12,00,0000"));
        mListings.add(new JobListing("Android Developer", "Atos India Pvt Ltd",
                "Pune, India", "Full-time", "3", "Android",
                "6,00,0000"));
        mListings.add(new JobListing("Python Developer", "Intuit",
                "Bangalore, India", "Apprenticeship", "NA", "Python",
                "50,000"));
        mListings.add(new JobListing("Technical Lead", "Pixel Inc",
                "Chennai, India", "Full-time", "7", "Java",
                "15,00,000"));
        mListings.add(new JobListing("Business Analyst", "Morgan Stanley",
                "Mumbai, India", "Full-time", "2", "Sales",
                "5,00,000"));

        //
        mListings.add(new JobListing("DevOps Engineer", "Honeywell", "Hyderabad, India", "Full-time", "5", "Python", "10,00,0000"));

        mListings.add(new JobListing("Ruby Developer", "Amazon Ltd",
                "Bangalore, India", "Full-time", "6", "Ruby on rails",
                "13,00,0000"));
        mListings.add(new JobListing("Senior Manager", "Cambridge Analytica",
                "Delhi, India", "Full-time", "12", "Sales",
                "25,00,0000"));
        mListings.add(new JobListing("Chartered Accountant", "TCS",
                "Mumbai, India", "Full-time", "3", "Taxation",
                "7,00,000"));
        mListings.add(new JobListing("IoT Evangelist", "IBM Corp",
                "Bangalore, India", "Full-time", "8", "Java | Python",
                "18,00,000"));
        mListings.add(new JobListing("Business Analyst", "Citi",
                "Mumbai, India", "Full-time", "3", "Sales",
                "7,00,000"));

        mAdapter.notifyDataSetChanged();
    }
}
