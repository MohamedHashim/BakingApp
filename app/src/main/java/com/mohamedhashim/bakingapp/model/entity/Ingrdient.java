package com.mohamedhashim.bakingapp.model.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Mohamed Hashim on 7/25/2017.
 */

public class Ingrdient {

    @SerializedName("quantity")
    private String quantity;

    @SerializedName("measure")
    private String measure;

    @SerializedName("ingredient")
    private String ingredient;

    @SerializedName("servings")
    private String servings;

    public String getQuantity() {
        return quantity;
    }

    public String getMeasure() {
        return measure;
    }

    public String getIngredient() {
        return ingredient;
    }

    public String getServings() {
        return servings;
    }
}
