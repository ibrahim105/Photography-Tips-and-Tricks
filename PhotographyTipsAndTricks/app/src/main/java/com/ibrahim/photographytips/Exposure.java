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

public class Exposure extends Fragment{

    ImageView imageView1,imageView2,imageView3;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;

    Intent intent;

    public Exposure(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        getActivity().setTitle("Exposure");

        View view= inflater.inflate(R.layout.fragment_exposure, container, false);

        Typeface custom_font = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(),"fonts/NotoSans-Regular.ttf");

        textView1=(TextView)view.findViewById(R.id.exposure_textView1);
        textView1.setTypeface(custom_font);
        textView1.setText("Exposure");


        textView2=(TextView)view.findViewById(R.id.exposure_textView2);
        textView2.setTypeface(custom_font);
        textView2.setText("In photography, exposure is the amount of light per unit area (the image plane illuminance times the exposure time) reaching a photographic film or electronic image sensor, as determined by shutter speed, lens aperture and scene luminance. Exposure is adjusted by increasing or decreasing aperture, shutter speed or ISO or all of them. These three form what is known as the exposure triangle");

        imageView1=(ImageView) view.findViewById(R.id.exposure_imageView1);
        Glide.with(getContext()).load(R.drawable.exposure1)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView1);

        imageView1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "exposure1";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView3=(TextView)view.findViewById(R.id.exposure_textView3);
        textView3.setTypeface(custom_font);
        textView3.setText("Exposure Triangle");



        textView4=(TextView)view.findViewById(R.id.exposure_textView4);
        textView4.setTypeface(custom_font);
        textView4.setText("Having the perfect exposure is extremely critical for a perfect photo. A beautifully balanced framing can be ruined by over or underexposing.\n" +
                "\n" +
                "Underexposure is setting up the camera to take less light than ideal, resulting the image to be darker or underexposed.\n" +
                "\n" +
                "Overexposure is the exact opposite to underexposure. That is, unlike underexposure, overexposure takes more light than necessary. Sometimes overexposure can burn parts or a whole photo, damaging details from the image.");

        imageView2=(ImageView) view.findViewById(R.id.exposure_imageView2);
        Glide.with(getContext()).load(R.drawable.exposure2)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView2);

        imageView2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "exposure2";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView5=(TextView)view.findViewById(R.id.exposure_textView5);
        textView5.setTypeface(custom_font);
        textView5.setText("Different Exposures");




        textView6=(TextView)view.findViewById(R.id.exposure_textView6);
        textView6.setTypeface(custom_font);
        textView6.setText("Metering");


        textView7=(TextView)view.findViewById(R.id.exposure_textView7);
        textView7.setTypeface(custom_font);
        textView7.setText("Metering mode is in photography refers to the way in which a camera determines the exposure. Digital metering feedback. Analogmetering feedback (light meter). Metering mode determines how the sensor reads the exposure and determines perfect exposure.\n" +
                "\n" +
                "There are different types of metering modes.\n" +
                "\n" +
                "With spot metering, the camera will only measure a very small area of the scene (between 1-5% of the viewfinder area). This will by default be the very centre of the scene. The user can select a different off-centre spot, or to recompose by moving the camera aftermetering.\n" +
                "\n" +
                "center-weighted metering mode or partial metering In this system, the meter concentrates between 60 to 80 percent of the sensitivity towards the central part of the viewfinder.The balance is then \"feathered\" out towards the edges. Some cameras will allow the user to adjust the weight/balance of the central portion to the peripheral one. One advantage of this method is that it is less influenced by small areas that vary greatly in brightness at the edges of the viewfinder; as many subjects are in the central part of the frame, more consistent results can be obtained. When moving the focus point off center the camera will proceed as above but at the chosen focus point.");

        imageView3=(ImageView) view.findViewById(R.id.exposure_imageView3);
        Glide.with(getContext()).load(R.drawable.exposure3)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView3);

        imageView3.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "exposure3";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView8=(TextView)view.findViewById(R.id.exposure_textView8);
        textView8.setTypeface(custom_font);
        textView8.setText("Figure:Metering");




        return view;
    }
}
