package com.ibrahim.photographytips;

/**
 * Created by munna105 on 1/8/2017.
 */

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
public class NegativeSpace extends Fragment{

    ImageView imageView1,imageView2,imageView3;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;

    Intent intent;
    public NegativeSpace(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        getActivity().setTitle("Composition");

        View view = inflater.inflate(R.layout.fragment_negative_space, container, false);

        Typeface custom_font = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(),"fonts/NotoSans-Regular.ttf");


        textView1=(TextView)view.findViewById(R.id.negative_space_textView1);
        textView1.setTypeface(custom_font);
        textView1.setText("Negative Space");


        textView2=(TextView)view.findViewById(R.id.negative_space_textView2);
        textView2.setTypeface(custom_font);
        textView2.setText("It is often tempting when taking photographs to fill up as much of the space as possible. When taking photos of a subject that really interests you, it can be hard to censor yourself and consider your composition carefully. The use of negative space next to your subject matter can add so much to the content and composition of your shots. It can show off the contours of something in the foreground or help angle or anchor the rest of your shot.");


        imageView1=(ImageView) view.findViewById(R.id.negative_space_imageView1);

        Glide.with(getContext()).load(R.drawable.negative_space1)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView1);

        imageView1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "negative_space1";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView3=(TextView)view.findViewById(R.id.negative_space_textView3);
        textView3.setTypeface(custom_font);
        textView3.setText("Figure:Negative Space Example");


        imageView2=(ImageView) view.findViewById(R.id.negative_space_imageView2);

        Glide.with(getContext()).load(R.drawable.negative_space2)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView2);

        imageView2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "negative_space2";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView4=(TextView)view.findViewById(R.id.negative_space_textView4);
        textView4.setTypeface(custom_font);
        textView4.setText("Figure:Negative Space Example");


        textView5=(TextView)view.findViewById(R.id.negative_space_textView5);
        textView5.setTypeface(custom_font);
        textView5.setText("Photographs are more than the objects that are being shot. They are also the environment and space they come from. Including and composing the negative space can add context and visual interest to an otherwise ordinary photograph.");


        return view;

    }
}
