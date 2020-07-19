package com.example.androidtutorial.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtutorial.R;

import java.util.ArrayList;
import java.util.List;

class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> implements Filterable {

    private List<String> userlist;
    private List<String> originalList;

    public HomeAdapter(List<String> list) {
        this.userlist = list;
        this.originalList = list;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home, parent, false);
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        holder.usernameTextView.setText(userlist.get(position));
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults results = new FilterResults();
                if (constraint.length() > 0) {
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (String q : originalList) {
                        if (q.equalsIgnoreCase(constraint.toString())) {
                            arrayList.add(q);
                        }
                    }
                    results.values = arrayList;
                } else {
                    results.values = new ArrayList<>(originalList);
                }

                return results;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                userlist = (ArrayList<String>) results.values;
                notifyDataSetChanged();
            }
        };
    }

    public static class HomeViewHolder extends RecyclerView.ViewHolder {

        private TextView usernameTextView;

        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);
            usernameTextView = itemView.findViewById(R.id.usernameEditText);
        }
    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }
}
