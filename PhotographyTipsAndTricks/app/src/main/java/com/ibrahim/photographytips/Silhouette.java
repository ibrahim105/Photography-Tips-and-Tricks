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

public class Silhouette extends Fragment{


    ImageView imageView1,imageView2,imageView3;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;

    Intent intent;
    public Silhouette(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        getActivity().setTitle("Composition");

        View view =inflater.inflate(R.layout.fragment_silhouette, container, false);

        Typeface custom_font = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(),"fonts/NotoSans-Regular.ttf");


        textView1=(TextView)view.findViewById(R.id.silhouette_textView1);
        textView1.setTypeface(custom_font);
        textView1.setText("Silhouette");


        textView2=(TextView)view.findViewById(R.id.silhouette_textView2);
        textView2.setTypeface(custom_font);
        textView2.setText("Sometimes it is the simplest pictures that work best. And in terms of photo composition and lighting, shots don’t come any simpler than silhouette photography.\n" +
                "\n" +
                "Silhouette photography is when you shoot a subject with backlight so that you only show its outline. As the subject is thrown into shadow due to the position of the lighting, you can not see texture, you can not see its three dimensional form, and you can not even see its colour. What you are left with is the shape alone.");

        imageView1=(ImageView) view.findViewById(R.id.silhouette_imageView1);

        Glide.with(getContext()).load(R.drawable.silhouette1)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView1);

        imageView1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "silhouette1";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView3=(TextView)view.findViewById(R.id.silhouette_textView3);
        textView3.setTypeface(custom_font);
        textView3.setText("Figure:Silhouette example photographs");


        imageView2=(ImageView) view.findViewById(R.id.silhouette_imageView2);

        Glide.with(getContext()).load(R.drawable.silhouette2)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView2);

        imageView2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "silhouette2";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView4=(TextView)view.findViewById(R.id.silhouette_textView4);
        textView4.setTypeface(custom_font);
        textView4.setText("Figure:Silhouette example photographs");







        return view;

    }
}
