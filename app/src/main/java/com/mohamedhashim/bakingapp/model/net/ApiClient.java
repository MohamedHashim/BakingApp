package com.mohamedhashim.bakingapp.model.net;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Mohamed Hashim on 7/25/2017.
 */

public class ApiClient {

    public static String Base_URL = "https://d17h27t6h515a5.cloudfront.net/topher/2017/May/59121517_baking/";
    public static Retrofit retrofit;

    public static Retrofit getApiClient() {

        if (retrofit == null)
            retrofit = new Retrofit.Builder().baseUrl(Base_URL).
                    addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }
}
