package com.example.user.demo_recycler_images;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.image2);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerlist);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(createTestImageProduct(),this,imageView));
    }

    private List<Integer> createTestImageProduct() {
        return Arrays.asList(
                R.drawable.test_phone_1,
                R.drawable.test_phone_2,
                R.drawable.test_phone_3,
                R.drawable.test_phone_4);
    }
}
