package com.mohamedhashim.bakingapp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mohamedhashim.bakingapp.R;
import com.mohamedhashim.bakingapp.model.entity.Recipe;
import com.mohamedhashim.bakingapp.model.net.ApiClient;
import com.mohamedhashim.bakingapp.model.service.ApiInterface;
import com.mohamedhashim.bakingapp.view.adapter.RecyclerAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recipe_recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    private List<Recipe> recipes;
    private ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipe_recyclerView = (RecyclerView) findViewById(R.id.recipes_recycler_view);
        layoutManager = new LinearLayoutManager(this);
        recipe_recyclerView.setLayoutManager(layoutManager);
        recipe_recyclerView.setHasFixedSize(true);

        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);

        Call<List<Recipe>> call = apiInterface.getRecipes();

        call.enqueue(new Callback<List<Recipe>>() {
            @Override
            public void onResponse(Call<List<Recipe>> call, Response<List<Recipe>> response) {
                recipes = response.body();
                adapter = new RecyclerAdapter(recipes);
                recipe_recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Recipe>> call, Throwable t) {

            }
        });

    }
}
