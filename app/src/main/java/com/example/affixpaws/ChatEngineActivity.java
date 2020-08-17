package com.example.affixpaws;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.os.Bundle;

        import java.util.ArrayList;

public class ChatEngineActivity extends AppCompatActivity {

    private RecyclerView messageRecyclerView;
    private RecyclerView.Adapter messageAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_s);
        ArrayList<Data> list = new ArrayList<>();

        list.add(new Data(R.drawable.drawble_snow_ball_s,"Self","Hi"));
        list.add(new Data(R.drawable.drawble_snow_ball_s,"friend","hello"));
        list.add(new Data(R.drawable.drawble_snow_ball_s,"Self","What are you doing"));
        list.add(new Data(R.drawable.drawble_snow_ball_s,"friend","Studying"));
         list.add(new Data(R.drawable.drawble_snow_ball_s,"Self","Oh great"));
          list.add(new Data(R.drawable.drawble_snow_ball_s,"friend","Hehe"));
        list.add(new Data(R.drawable.drawble_snow_ball_s,"Self","Oh great"));
        list.add(new Data(R.drawable.drawble_snow_ball_s,"friend","Hehe"));
        list.add(new Data(R.drawable.drawble_snow_ball_s,"Self","Oh great"));
        list.add(new Data(R.drawable.drawble_snow_ball_s,"friend","Hehe"));
         list.add(new Data(R.drawable.drawble_snow_ball_s,"Self","Bye"));
         list.add(new Data(R.drawable.drawble_snow_ball_s,"friend","Bye"));
        list.add(new Data(R.drawable.drawble_snow_ball_s,"friend","Hehe"));
        list.add(new Data(R.drawable.drawble_snow_ball_s,"Self","Oh great"));
        list.add(new Data(R.drawable.drawble_snow_ball_s,"friend","Hehe"));
        list.add(new Data(R.drawable.drawble_snow_ball_s,"Self","Oh great"));
        list.add(new Data(R.drawable.drawble_snow_ball_s,"friend","Hehe"));
        list.add(new Data(R.drawable.drawble_snow_ball_s,"Self","Bye"));
        list.add(new Data(R.drawable.drawble_snow_ball_s,"friend","Bye"));


        messageRecyclerView = findViewById(R.id.chat_recycle_view);
        messageRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        messageAdapter = new Recycler_View_Adapter(list);
        messageRecyclerView.setLayoutManager(mLayoutManager);
        messageRecyclerView.setAdapter(messageAdapter);
    }

}