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


public class Aperture extends Fragment{
    ImageView imageView1,imageView2,imageView3;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11;

    Intent intent;

    public Aperture(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        getActivity().setTitle("Photography Terms");

        View view= inflater.inflate(R.layout.fragment_aperture, container, false);

        Typeface custom_font = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(),"fonts/NotoSans-Regular.ttf");



        //Aperture

        textView1=(TextView)view.findViewById(R.id.aperture_textView1);
        textView1.setTypeface(custom_font);
        textView1.setText("Aperture");


        textView2=(TextView)view.findViewById(R.id.aperture_textView2);
        textView2.setTypeface(custom_font);
        textView2.setText("Aperture refers to the opening of a lens's diaphragm through which light passes. It is calibrated in f/stops and is generally written as numbers such as 1.4, 2, 2.8, 4, 5.6, 8, 11 and 16. The lower f/stops give more exposure because they represent the larger apertures, while the higher f/stops give less exposure because they represent smaller apertures.This may seem a little contradictory at first but will become clearer as you take pictures at varying f/stops. Be sure to check your manual first to learn how to set your camera for Aperture Priority, then try experimenting to get comfortable with changing the aperture and recognizing the effects different apertures will have on the end-result image.");

        imageView1=(ImageView) view.findViewById(R.id.aperture_imageView1);
        Glide.with(getContext()).load(R.drawable.aperture1)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView1);

        imageView1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "aperture1";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView3=(TextView)view.findViewById(R.id.aperture_textView3);
        textView3.setTypeface(custom_font);
        textView3.setText("Different aperture");



        //How Aperture Affects Depth of Field


        textView4=(TextView)view.findViewById(R.id.aperture_textView4);
        textView4.setTypeface(custom_font);
        textView4.setText("How Aperture Affects Depth of Field");


        textView5=(TextView)view.findViewById(R.id.aperture_textView5);
        textView5.setTypeface(custom_font);
        textView5.setText("Depth of field is defined as the zone of acceptable sharpness in front of and behind the subject on which the lens is focused.Simply put: how sharp or blurry is the area behind your subject. Here's the equation" +
                "The lower the f/stop—the larger the opening in the lens—the less depth of field—the blurrier the background." +
                "The higher the f/stop—the smaller the opening in the lens—the greater the depth of field—the sharper the background.");

        imageView2=(ImageView) view.findViewById(R.id.aperture_imageView2);
        Glide.with(getContext()).load(R.drawable.aperture2)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView2);

        imageView2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "aperture2";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView6=(TextView)view.findViewById(R.id.aperture_textView6);
        textView6.setTypeface(custom_font);
        textView6.setText("Different depth of field with different aperture");


        //How Aperture Affects Shutter Speed



        textView7=(TextView)view.findViewById(R.id.aperture_textView7);
        textView7.setTypeface(custom_font);
        textView7.setText("How Aperture Affects Shutter Speed");


        textView8=(TextView)view.findViewById(R.id.aperture_textView8);
        textView8.setTypeface(custom_font);
        textView8.setText("The f/stop also affects shutter speed. Using a low f/stop means more light is entering the lens and therefore the shutter doesn't need to stay open as long to make a correct exposure which translates into a faster shutter speed. Again, the reverse is true: using a high f/stop means that less light is entering the lens and therefore the shutter will need to stay open a little longer which translates into a slower shutter speed.");

        imageView3=(ImageView) view.findViewById(R.id.aperture_imageView3);
        Glide.with(getContext()).load(R.drawable.aperture3)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView3);

        imageView3.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "aperture3";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView9=(TextView)view.findViewById(R.id.aperture_textView9);
        textView9.setTypeface(custom_font);
        textView9.setText("Aperture informations");





        textView10=(TextView)view.findViewById(R.id.aperture_textView10);
        textView10.setTypeface(custom_font);
        textView10.setText("Choosing the Aperture:");


        textView11=(TextView)view.findViewById(R.id.aperture_textView11);
        textView11.setTypeface(custom_font);
        textView11.setText("Now that we know how to control depth of field, what determines the choices we make in selecting the aperture? We use focus and depth of field to direct attention to what is important in the photograph, and we use lack of focus to minimize distractions that cannot be eliminated from the composition. While there are no rules, there are some guidelines." +
                "For classic portraiture we separate our subject from the surroundings by using selective focus. Choosing a large aperture (lower f/stop, like f2.8) creates very shallow depth of field with only the subject, or just a portion of the subject, in focus. This helps direct the viewer's attention to the subject." +
                "In a landscape or scenic photograph we usually want to see as much detail as possible from foreground to background; we want to achieve the maximum depth of field by choosing a small aperture (higher f/stop, like f/8 or f/11)." +
                "While we can get the maximum or minimum depth of field by working at each end of the aperture range, sometimes we want a more intermediate level of depth of field, limiting focus to a specific range of distances within the overall photograph. One way to do this is to choose a mid-range f/stop, like f/5.6, and shoot a test frame. In image playback, use the magnifying function of the LCD to zoom in and check the depth of field; make adjustments if necessary and reshoot.");



        return view;
    }
}
