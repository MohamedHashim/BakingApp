package com.mohamedhashim.bakingapp.model.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Mohamed Hashim on 7/25/2017.
 */

public class Recipe {

    @SerializedName("name")
    private String name;

    @SerializedName("ingredients")
    private List<Ingrdient> ingrdients;

    @SerializedName("servings")
    private String servings;

    @SerializedName("steps")
    private List<Step> steps;


    public String getName() {
        return name;
    }

    public List<Ingrdient> getIngrdients() {
        return ingrdients;
    }

    public String getServings() {
        return servings;
    }

    public List<Step> getSteps() {
        return steps;
    }
}
