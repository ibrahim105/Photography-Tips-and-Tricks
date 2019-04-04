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
public class ShootingModes extends Fragment{

    ImageView imageView1,imageView2,imageView3;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11;

    Intent intent;

    public ShootingModes(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        getActivity().setTitle("Shooting Modes");

        View view= inflater.inflate(R.layout.fragment_shooting_modes, container, false);
        Typeface custom_font = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(),"fonts/NotoSans-Regular.ttf");

        textView1=(TextView)view.findViewById(R.id.shooting_modes_textView1);
        textView1.setTypeface(custom_font);
        textView1.setText("There are different types of shooting modes that a person can select from to take a picture. A lot of them are presets such as portrait mode, sports mode, night mode, landscape mode and a fully functional auto mode. This modes, though are relatively easier to use, limits the functionality of an SLR.\n" +
                "\n" +
                "There are 4 manual modes, that lets the user take control of the camera.");


        textView2=(TextView)view.findViewById(R.id.shooting_modes_textView2);
        textView2.setTypeface(custom_font);
        textView2.setText("Program Mode");


        textView3=(TextView)view.findViewById(R.id.shooting_modes_textView3);
        textView3.setTypeface(custom_font);
        textView3.setText("This mode is generally used when user prefers manual control but doesn’t have much time to think about settings. The camera decides the aperture and shutter speed accordingly and the user can adjust other settings in order to take a photo.");

        textView4=(TextView)view.findViewById(R.id.shooting_modes_textView4);
        textView4.setTypeface(custom_font);
        textView4.setText("Aperture Priority Mode");

        textView5=(TextView)view.findViewById(R.id.shooting_modes_textView5);
        textView5.setTypeface(custom_font);
        textView5.setText("This mode lets the user to manually adjust aperture and ISO of the camera but not the shutter speed. The shutter speed is then automatically adjusted to have the perfect exposure. Aperture mode is ideal for controlling depth of field");

        textView6=(TextView)view.findViewById(R.id.shooting_modes_textView6);
        textView6.setTypeface(custom_font);
        textView6.setText("Shutter Priority Mode");

        textView7=(TextView)view.findViewById(R.id.shooting_modes_textView7);
        textView7.setTypeface(custom_font);
        textView7.setText("This mode lets the user to manually adjust shutter speed and ISO but not the aperture. The aperture is automatically adjusted for optimum exposure. Shutter priority mode is ideal for action photography and other photos that require fast or slow shutters.");

        textView8=(TextView)view.findViewById(R.id.shooting_modes_textView8);
        textView8.setTypeface(custom_font);
        textView8.setText("Manual Mode");

        textView9=(TextView)view.findViewById(R.id.shooting_modes_textView9);
        textView9.setTypeface(custom_font);
        textView9.setText("Manual mode lets the user take full control of the camera, allowing shutter speed aperture and ISO to be altered. This allows full functionality of the camera. Sometimes a photo might be underexposed in order to look good. Or sometimes overexposure is necessary. Manual mode is complete freedom.");

        imageView1=(ImageView) view.findViewById(R.id.shooting_modes_imageView1);
        Glide.with(getContext()).load(R.drawable.shooting_modes)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView1);

        imageView1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "shooting_modes";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView10=(TextView)view.findViewById(R.id.shooting_modes_textView10);
        textView10.setTypeface(custom_font);
        textView10.setText("Nikon Vs Canon Shooting Modes");

        return view;
    }
}
