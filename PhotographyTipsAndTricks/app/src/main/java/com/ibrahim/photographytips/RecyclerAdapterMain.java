package com.ibrahim.photographytips;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class RecyclerAdapterMain  extends RecyclerView.Adapter<RecyclerAdapterMain.ViewHolder> {

    private int[] images =
            {

                    R.drawable.cameratypes,
                    R.drawable.partsofcamera,
                    R.drawable.lenstypes,
                    R.drawable.photographyterms,
                    R.drawable.shootingmodes,
                    R.drawable.exposure,
                    R.drawable.composition,
                    R.drawable.typesofphotography,



            };



    class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView itemImage;
        private final Context context;
        Intent intent;
        TabLayout tabLayout;
        ViewPager viewPager;

        public ViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
            itemImage = (ImageView) itemView.findViewById(R.id.photo);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();

                    if (position == 0) {
                         Intent intent = new Intent(context, TabDesign.class);

                        Bundle bundle = new Bundle();
                        bundle.putInt("page", position);
                        intent.putExtras(bundle);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        Intent intent = new Intent(context, TabDesign.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("page",position);
                        intent.putExtras(bundle);

                        context.startActivity(intent);
                    } else if (position == 2) {
                        Intent intent = new Intent(context, TabDesign.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("page",position);
                        intent.putExtras(bundle);

                        context.startActivity(intent);
                    } else if (position == 3) {
                        Intent intent = new Intent(context, TabDesign.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("page",position);
                        intent.putExtras(bundle);

                        context.startActivity(intent);
                    } else if (position == 4) {
                        Intent intent = new Intent(context, TabDesign.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("page",position);
                        intent.putExtras(bundle);
                        context.startActivity(intent);

                    } else if (position == 5) {
                        Intent intent = new Intent(context, TabDesign.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("page",position);
                        intent.putExtras(bundle);

                        context.startActivity(intent);
                    } else if (position == 6) {
                        Intent intent = new Intent(context, TabDesign.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("page",position);
                        intent.putExtras(bundle);

                        context.startActivity(intent);
                    } else if (position == 7) {
                        Intent intent = new Intent(context, TabDesign.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("page",position);
                        intent.putExtras(bundle);

                        context.startActivity(intent);
                    }

                }
            });


        }

        }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemImage.setImageResource(images[i]);
    }


    @Override
    public int getItemCount() {

        return images.length;
    }
}
