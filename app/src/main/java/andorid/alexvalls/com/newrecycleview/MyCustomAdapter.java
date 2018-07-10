package andorid.alexvalls.com.newrecycleview;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.MyCustomViewHolder> {

    public ArrayList<String> dataSet;

    @NonNull
    @Override
    public MyCustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyCustomViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class MyCustomViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        CardView cardView;

        public MyCustomViewHolder(View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.CardView);
            textView = itemView.findViewById(R.id.textView);

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            cardView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                        public boolean onLongClick(View view){
                    return true;
                }
            });
        }
    }

}
