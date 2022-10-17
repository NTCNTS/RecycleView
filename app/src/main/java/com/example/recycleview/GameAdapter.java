package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.ViewHolder> {
    private List<Game> mGame;
    // Lưu Context để dễ dàng truy cập
    private Context mContext;

    public GameAdapter(List<Game> games, Context mContext) {
        this.mGame = games;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public GameAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView;
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_gameitem, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull GameAdapter.ViewHolder holder, int position) {
        Game game =mGame.get(position);
        holder.gamename.setText(game.getName());
        holder.mota.setText(game.getMota());
        holder.hinh.setImageResource(game.getHinh());
    }

    @Override
    public int getItemCount() {
        return mGame.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private View itemview;
        public TextView gamename;
        public TextView mota;
        public Button detail_button;
        public ImageView hinh;

        public ViewHolder(View itemView) {
            super(itemView);
            itemview = itemView;
            gamename = itemView.findViewById(R.id.gamename);
            mota = itemView.findViewById(R.id.mota);
            hinh = itemView.findViewById(R.id.hinh);
            detail_button = itemView.findViewById(R.id.detail_button);

            //Xử lý khi nút Chi tiết được bấm
            detail_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(),
                                    gamename.getText() +" | "
                                            + " Demo function", Toast.LENGTH_SHORT)
                            .show();
                }
            });
        }
    }


}
