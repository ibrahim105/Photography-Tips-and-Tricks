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



public class ShutterSpeed extends Fragment{

    ImageView imageView1,imageView2,imageView3;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11;

    Intent intent;

    public ShutterSpeed(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        getActivity().setTitle("Photography Terms");

        View view=  inflater.inflate(R.layout.fragment_shutter_speed, container, false);

        Typeface custom_font = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(),"fonts/NotoSans-Regular.ttf");



        //Shutter

        textView1=(TextView)view.findViewById(R.id.shutter_speed_textView1);
        textView1.setTypeface(custom_font);
        textView1.setText("Shutter");


        textView2=(TextView)view.findViewById(R.id.shutter_speed_textView2);
        textView2.setTypeface(custom_font);
        textView2.setText("Shutter Speed is one of the three pillars of photography, the other two being ISO and Aperture. Shutter speed is where the other side of the magic happens – it is responsible for creating dramatic effects by either freezing action or blurring motion. In this article, I will try to explain everything I know about shutter speed in very simple language.");

        imageView1=(ImageView) view.findViewById(R.id.shutter_speed_imageView1);
        Glide.with(getContext()).load(R.drawable.shutter_speed1)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView1);

        imageView1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "shutter_speed1";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView3=(TextView)view.findViewById(R.id.shutter_speed_textView3);
        textView3.setTypeface(custom_font);
        textView3.setText("High Shutter example");



        //Shutter Speed

        textView4=(TextView)view.findViewById(R.id.shutter_speed_textView4);
        textView4.setTypeface(custom_font);
        textView4.setText("What is Shutter Speed?");


        textView5=(TextView)view.findViewById(R.id.shutter_speed_textView5);
        textView5.setTypeface(custom_font);
        textView5.setText("Shutter speed, also known as “exposure time”, stands for the length of time a camera shutter is open to expose light into the camera sensor. If the shutter speed is fast, it can help to freeze action completely, as seen in the above photo of the dolphin. If the shutter speed is slow, it can create an effect called “motion blur”, where moving objects appear blurred along the direction of the motion. This effect is used quite a bit in advertisements of cars and motorbikes, where a sense of speed and motion is communicated to the viewer by intentionally blurring the moving wheels.");

        imageView2=(ImageView) view.findViewById(R.id.shutter_speed_imageView2);
        Glide.with(getContext()).load(R.drawable.shutter_speed2)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView2);

        imageView2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "shutter_speed2";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView6=(TextView)view.findViewById(R.id.shutter_speed_textView6);
        textView6.setTypeface(custom_font);
        textView6.setText("Slow Shutter example");

        textView7=(TextView)view.findViewById(R.id.shutter_speed_textView7);
        textView7.setTypeface(custom_font);
        textView7.setText("Slow shutter speeds are also used to photograph lightnings or other objects at night or in dim environments with a tripod. Landscape photographers intentionally use slow shutter speeds to create a sense of motion on rivers and waterfalls, while keeping everything else in focus.");

        textView8=(TextView)view.findViewById(R.id.shutter_speed_textView8);
        textView8.setTypeface(custom_font);
        textView8.setText("How shutter speed is measured?");

        textView9=(TextView)view.findViewById(R.id.shutter_speed_textView9);
        textView9.setTypeface(custom_font);
        textView9.setText("Shutter speeds are typically measured in fractions of a second, when they are under a second. For example 1/4 means a quarter of a second, while 1/250 means one two-hundred-and-fiftieth of a second or four milliseconds. Most modern DSLRs can handle shutter speeds of up to 1/4000th of a second, while some can handle much higher speeds of 1/8000th of a second and faster. The longest shutter speed on most DSLRs is typically 30 seconds (without using external remote triggers).");



        return view;
    }
}
