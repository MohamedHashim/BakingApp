package com.mohamedhashim.bakingapp.model.service;


import com.mohamedhashim.bakingapp.model.entity.Recipe;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Mohamed Hashim on 7/25/2017.
 */

public interface ApiInterface {

    @GET("baking.json")
    Call<List<Recipe>> getRecipes();
}
