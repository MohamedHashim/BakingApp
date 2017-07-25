package com.mohamedhashim.bakingapp.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mohamedhashim.bakingapp.R;
import com.mohamedhashim.bakingapp.model.entity.Recipe;

import java.util.List;

/**
 * Created by Mohamed Hashim on 7/24/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<Recipe> recipes;

    public RecyclerAdapter(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.recipe_name_txt.setText(recipes.get(position).getName());
        holder.ingredients_txt.setText(recipes.get(position).getIngrdients().size()+"");
        holder.steps_txt.setText(recipes.get(position).getSteps().size()+"");
        holder.servings_txt.setText(recipes.get(position).getServings());

    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView itemImage;
        public TextView recipe_name_txt, ingredients_txt, steps_txt, servings_txt;

        public ViewHolder(final View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.recipe_photo);
            recipe_name_txt = itemView.findViewById(R.id.recipe_name);
            ingredients_txt = itemView.findViewById(R.id.ingredients_txt);
            steps_txt = itemView.findViewById(R.id.steps_txt);
            servings_txt = itemView.findViewById(R.id.servings_txt);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getPosition();
                    Toast.makeText(itemView.getContext(), "Thank you!" + position, Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}
