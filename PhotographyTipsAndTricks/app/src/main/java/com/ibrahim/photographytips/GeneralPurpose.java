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


public class GeneralPurpose extends Fragment{
    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11;
    TextView textView12,textView13,textView14,textView15;
    Intent intent;

    public GeneralPurpose(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        getActivity().setTitle("Lens Types");

        View view= inflater.inflate(R.layout.fragment_general_purpose, container, false);


        Typeface custom_font = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(),"fonts/NotoSans-Regular.ttf");

        textView1=(TextView)view.findViewById(R.id.general_purpose_textView1);
        textView1.setTypeface(custom_font);
        textView1.setText("Fixed focal length");


        textView2=(TextView)view.findViewById(R.id.general_purpose_textView2);
        textView2.setTypeface(custom_font);
        textView2.setText("Fixed Focal Length Lens. Also referred to as a 'prime lens' the fixed focal length lens (FFL) has a focal length that is not adjustable.Photographers are unable to zoom in and out on a particular subject when using a prime lens. Lens manufacturers produce or produced prime lenses at or near the following focal lengths: 20 mm, 24 mm, 28 mm, 35 mm, 40 mm, 50 mm, 85 mm, 105 mm etc. For these lengths many manufacturers produce two or more lenses with the same focal length but with different maximum apertures to suit the different needs of photographers. For example 85mm f/1.8 and 85mm f/1.4.");



        imageView1=(ImageView) view.findViewById(R.id.general_purpose_imageView1);
//For image load in xml
        Glide.with(getContext()).load(R.drawable.general_purpose1)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView1);
//image pass zooming activity

        imageView1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "general_purpose1";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });


        textView3=(TextView)view.findViewById(R.id.general_purpose_textView3);
        textView3.setTypeface(custom_font);
        textView3.setText("Figure:Nikon 85mm fixed focal length with sample photograph.");



        //Variable Focal Length

        textView4=(TextView)view.findViewById(R.id.general_purpose_textView4);
        textView4.setTypeface(custom_font);
        textView4.setText("Variable Focal length");


        textView5=(TextView)view.findViewById(R.id.general_purpose_textView5);
        textView5.setTypeface(custom_font);
        textView5.setText("A variable focal length lens is a mechanical assembly of lens elements for which the focal length (and thus angle of view) can be varied, as opposed to a fixed focal length (FFL) lens (see prime lens). A true zoom lens, also called a parfocal lens, is one that maintains focus when its focal length changes. When focal length is greater than 50 degree we call it Telephoto lens. And when focal length is smaller than 50 degree we call it Wide lens.");

        imageView2=(ImageView) view.findViewById(R.id.general_purpose_imageView2);
        Glide.with(getContext()).load(R.drawable.general_purpose2)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView2);

        imageView2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "general_purpose2";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView6=(TextView)view.findViewById(R.id.general_purpose_textView6);
        textView6.setTypeface(custom_font);
        textView6.setText("Figure:Nikon 28-300mm variable focal length");

        imageView3=(ImageView) view.findViewById(R.id.general_purpose_imageView3);
        Glide.with(getContext()).load(R.drawable.general_purpose3)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView3);

        imageView3.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "general_purpose3";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });


        textView7=(TextView)view.findViewById(R.id.general_purpose_textView7);
        textView7.setTypeface(custom_font);
        textView7.setText("Figure:Example Photographs of variable focal length");

        //Wide Focal Length


        textView8=(TextView)view.findViewById(R.id.general_purpose_textView8);
        textView8.setTypeface(custom_font);
        textView8.setText("Wide");


        textView9=(TextView)view.findViewById(R.id.general_purpose_textView9);
        textView9.setTypeface(custom_font);
        textView9.setText("In photography and cinematography, a wide-angle lens refers to a lens whose focal length is substantially smaller than the focal length of a normal lens for a given film plane. This type of lens allows more of the scene to be included in the photograph, which is useful in architectural, interior and landscape photography where the photographer may not be able to move farther from the scene to photograph it. Example – Tokina 11-16mm. Nikon 12-24mm. Canon 10-16mm.");

        imageView4=(ImageView) view.findViewById(R.id.general_purpose_imageView4);
        Glide.with(getContext()).load(R.drawable.general_purpose4)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView4);

        imageView4.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "general_purpose4";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView10=(TextView)view.findViewById(R.id.general_purpose_textView10);
        textView10.setTypeface(custom_font);
        textView10.setText("Figure:Tokina 11-16mm wide variable focal length");

        imageView5=(ImageView) view.findViewById(R.id.general_purpose_imageView5);
        Glide.with(getContext()).load(R.drawable.general_purpose5)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView5);

        imageView5.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "general_purpose5";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });


        textView11=(TextView)view.findViewById(R.id.general_purpose_textView11);
        textView11.setTypeface(custom_font);
        textView11.setText("Figure:Example picture of wide variable focal length");


        //Tele Focal Length


        textView12=(TextView)view.findViewById(R.id.general_purpose_textView12);
        textView12.setTypeface(custom_font);
        textView12.setText("Tele");


        textView13=(TextView)view.findViewById(R.id.general_purpose_textView13);
        textView13.setTypeface(custom_font);
        textView13.setText("In photography and cinematography, a telephoto lens is a specific type of a long-focus lens in which the physical length of the lens is shorter than the focal length. This is achieved by incorporating a special lens group known as a telephoto group that extends the light path to create a long-focus lens in a much shorter overall design. The angle of view and other effects of long-focus lenses are the same for telephoto lenses of the same specified focal length. Long-focal-length lenses are often informally referred to as telephoto lenses although this is technically incorrect: a telephoto lens specifically incorporates the telephoto group. Telephoto lenses are sometimes broken into the further sub-types of medium telephoto: lenses covering between a 30° and 10° field of view (85mm to 135mm in 35mm film format), and super telephoto: lenses covering between 8° through less than 1° field of view (over 300mm in 35mm film format).");

        imageView6=(ImageView) view.findViewById(R.id.general_purpose_imageView6);
        Glide.with(getContext()).load(R.drawable.general_purpose6)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView6);

        imageView6.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "general_purpose6";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView14=(TextView)view.findViewById(R.id.general_purpose_textView14);
        textView14.setTypeface(custom_font);
        textView14.setText("Figure:Nikon 70-200mm Tele lens");

        imageView7=(ImageView) view.findViewById(R.id.general_purpose_imageView7);
        Glide.with(getContext()).load(R.drawable.general_purpose7)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView7);

        imageView7.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "general_purpose7";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });


        textView15=(TextView)view.findViewById(R.id.general_purpose_textView15);
        textView15.setTypeface(custom_font);
        textView15.setText("Figure:Example picture of Tele variable focal length");










        return  view;
    }
}
