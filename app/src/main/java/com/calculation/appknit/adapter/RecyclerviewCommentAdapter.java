package com.calculation.appknit.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.calculation.appknit.model.ModelComment;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RecyclerviewCommentAdapter extends RecyclerView.Adapter<RecyclerviewCommentAdapter.ViewHolder> {
    Context context;
    List<ModelComment> commentList;

    public RecyclerviewCommentAdapter(Context context, List<ModelComment> commentList) {
        this.context = context;
        this.commentList = commentList;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
        }
    }
}
