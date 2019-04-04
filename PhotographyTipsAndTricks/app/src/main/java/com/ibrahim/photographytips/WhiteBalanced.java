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

public class WhiteBalanced extends Fragment{

    ImageView imageView1,imageView2,imageView3;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11;

    Intent intent;

    public WhiteBalanced(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        getActivity().setTitle("Photography Terms");

        View view= inflater.inflate(R.layout.fragment_white_balanced, container, false);

        Typeface custom_font = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(),"fonts/NotoSans-Regular.ttf");




        //white balanced

        textView1=(TextView)view.findViewById(R.id.white_balanced_textView1);
        textView1.setTypeface(custom_font);
        textView1.setText("White Balance");


        textView2=(TextView)view.findViewById(R.id.white_balanced_textView2);
        textView2.setTypeface(custom_font);
        textView2.setText("White balance (WB) is the process of removing unrealistic color casts, so that objects which appear white in person are rendered white in your photo. Proper camera white balance has to take into account the \"color temperature\" of a light source, which refers to the relative warmth or coolness of white light. Our eyes are very good at judging what is white under different light sources, but digital cameras often have great difficulty with auto white balance (AWB) — and can create unsightly blue, orange, or even green color casts. Understanding digital white balance can help you avoid these color casts, thereby improving your photos under a wider range of lighting conditions.");

        imageView1=(ImageView) view.findViewById(R.id.white_balanced_imageView1);
        Glide.with(getContext()).load(R.drawable.white_balanced1)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView1);

        imageView1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "white_balanced1";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView3=(TextView)view.findViewById(R.id.white_balanced_textView3);
        textView3.setTypeface(custom_font);
        textView3.setText("White Balance Example");



        imageView2=(ImageView) view.findViewById(R.id.white_balanced_imageView2);
        Glide.with(getContext()).load(R.drawable.white_balanced2)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView2);

        imageView2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "white_balanced2";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView4=(TextView)view.findViewById(R.id.white_balanced_textView4);
        textView4.setTypeface(custom_font);
        textView4.setText("White Balance Example with Temperature");


        imageView3=(ImageView) view.findViewById(R.id.white_balanced_imageView3);
        Glide.with(getContext()).load(R.drawable.white_balanced3)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView3);

        imageView3.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "white_balanced3";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView5=(TextView)view.findViewById(R.id.white_balanced_textView5);
        textView5.setTypeface(custom_font);
        textView5.setText("Different colortemperature of White Balance Example");

        return view;
    }
}
