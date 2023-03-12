package com.example.flexible_talk.activities_and_their_logics.adding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flexible_talk.R;

import java.util.List;

public class NotsAdapter extends RecyclerView.Adapter<NotsAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<Not> nots;

    public NotsAdapter(LayoutInflater inflater, List<Not> nots) {
        this.inflater = inflater;
        this.nots = nots;
    }

    @NonNull
    @Override
    public NotsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_nots, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotsAdapter.ViewHolder holder, int position) {
        Not not = nots.get(position);
        holder.pp.setImageResource(R.drawable.person);
        holder.nickName.setText("unknown");
        holder.doing.setText(not.getDoing());
    }

    @Override
    public int getItemCount() {
        return nots.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        final ImageView pp;
        final TextView nickName;
        final TextView doing;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            pp = itemView.findViewById(R.id.profile_picture_nots);
            nickName = itemView.findViewById(R.id.nickname_nots);
            doing = itemView.findViewById(R.id.doing_nots);
        }
    }
}
