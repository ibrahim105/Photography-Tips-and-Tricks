package com.ibrahim.photographytips;

/**
 * Created by munna105 on 1/8/2017.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.content.Intent;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class Iso extends Fragment{

    ImageView imageView1;
    TextView textView1,textView2,textView3,textView4;

    Intent intent;
    public Iso(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        getActivity().setTitle("Photography Terms");

        View view=  inflater.inflate(R.layout.fragment_iso, container, false);

        Typeface custom_font = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(),"fonts/NotoSans-Regular.ttf");

        textView1=(TextView)view.findViewById(R.id.iso_textView1);
        textView1.setTypeface(custom_font);
        textView1.setText("ISO");


        textView2=(TextView)view.findViewById(R.id.iso_textView2);
        textView2.setTypeface(custom_font);
        textView2.setText("In very basic terms, ISO is the level of sensitivity of your camera to available light. The lower the ISO number, the less sensitive it is to the light, while a higher ISO number increases the sensitivity of your camera. The component within your camera that can change sensitivity is called image sensor or simply sensor. It is the most important (and most expensive) part of a camera and it is responsible for gathering light and transforming it into an image. With increased sensitivity, your camera sensor can capture images in low light environments without having to use a flash. But higher sensitivity comes at an expense, it adds grain or noise to the pictures.");

        imageView1=(ImageView) view.findViewById(R.id.iso_imageView1);
        Glide.with(getContext()).load(R.drawable.iso)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView1);

        imageView1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "iso";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView3=(TextView)view.findViewById(R.id.iso_textView3);
        textView3.setTypeface(custom_font);
        textView3.setText("ISO Example");



        return view;
    }
}
