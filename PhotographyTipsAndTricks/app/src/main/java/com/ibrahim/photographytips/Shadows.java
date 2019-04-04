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

public class Shadows extends Fragment{

    ImageView imageView1,imageView2,imageView3,imageView4;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;

    Intent intent;

    public Shadows(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        getActivity().setTitle("Composition");

        View view= inflater.inflate(R.layout.fragment_shadows, container, false);

        Typeface custom_font = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(),"fonts/NotoSans-Regular.ttf");



        textView1=(TextView)view.findViewById(R.id.shadows_textView1);
        textView1.setTypeface(custom_font);
        textView1.setText("Shadow");


        textView2=(TextView)view.findViewById(R.id.shadows_textView2);
        textView2.setTypeface(custom_font);
        textView2.setText("If a shadow presents itself into your shot, sometime taking advantage of it can make a better composition than avoiding it. They can make amazing lines, angles and a deeper narrative in a well composed space. Here are some examples of shadow photography and how they can be used enhance the subject.\n" +
                "\n" +
                "Use the shadow as the main subject of the photograph. You can do this by arranging the elements in the shot so that the shadow takes on a more prominent place in the composition. It could be that the shadow is a more interesting shape than the more obvious subject in the space.");

        imageView1=(ImageView) view.findViewById(R.id.shadows_imageView1);
        Glide.with(getContext()).load(R.drawable.shadows1)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView1);

        imageView1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "shadows1";
                intent.putExtra("imgKey", imgId);
                startActivity(intent);

            }
        });

        textView3=(TextView)view.findViewById(R.id.shadows_textView3);
        textView3.setTypeface(custom_font);
        textView3.setText("Figure:Sample picture of Shadow");



        imageView2=(ImageView) view.findViewById(R.id.shadows_imageView2);
        Glide.with(getContext()).load(R.drawable.shadows2)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView2);

        imageView2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "shadows2";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView4=(TextView)view.findViewById(R.id.shadows_textView4);
        textView4.setTypeface(custom_font);
        textView4.setText("Figure:Sample picture of Shadow");


        textView5=(TextView)view.findViewById(R.id.shadows_textView5);
        textView5.setTypeface(custom_font);
        textView5.setText("Distort the shadow in the photograph to create more impact and drama. This effect can also add more inner meaning to the shot with it bending and manipulating the space. It can make ordinary people seem more interesting and a boring space seem more unique. Play with where you stand with the camera in different locations to increase this effect by being in different angles of the sun.");



        imageView3=(ImageView) view.findViewById(R.id.shadows_imageView3);
        Glide.with(getContext()).load(R.drawable.shadows3)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView3);

        imageView3.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "shadows3";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView6=(TextView)view.findViewById(R.id.shadows_textView6);
        textView6.setTypeface(custom_font);
        textView6.setText("Figure:Sample picture of Shadow");



        imageView4=(ImageView) view.findViewById(R.id.shadows_imageView4);
        Glide.with(getContext()).load(R.drawable.shadows4)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView4);

        imageView4.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "shadows4";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView7=(TextView)view.findViewById(R.id.shadows_textView7);
        textView7.setTypeface(custom_font);
        textView7.setText("Figure:Sample picture of Shadow");

        return view;
    }
}
