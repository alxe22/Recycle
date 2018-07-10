package andorid.alexvalls.com.newrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpRecyclerView();
    }


    void setUpRecyclerView() {
        recyclerView = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        MyCustomAdapter adapter = new MyCustomAdapter();

        ArrayList<String> dataSet = new ArrayList<>();
        dataSet.add("1");
        dataSet.add("2");
        dataSet.add("3");
        dataSet.add("4");

        adapter.dataSet = dataSet;
        recyclerView.setAdapter(adapter);
    }
}
