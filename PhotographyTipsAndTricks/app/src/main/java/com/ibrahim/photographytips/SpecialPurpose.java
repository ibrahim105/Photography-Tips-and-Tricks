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
public class SpecialPurpose extends Fragment{
    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9,imageView10;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11;
    TextView textView12;
    Intent intent;

    public SpecialPurpose(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        getActivity().setTitle("Lens Types");

        View view=inflater.inflate(R.layout.fragment_special_purpose, container, false);

        Typeface custom_font = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(),"fonts/NotoSans-Regular.ttf");


        //Special Purpose

        textView1=(TextView)view.findViewById(R.id.special_purpose_textView1);
        textView1.setTypeface(custom_font);
        textView1.setText("Tilt Shift Lens");


        textView2=(TextView)view.findViewById(R.id.special_purpose_textView2);
        textView2.setTypeface(custom_font);
        textView2.setText("Tilt shift lenses enable photographers to transcend the normal restrictions of depth of field and perspective. Many of the optical tricks these lenses permit could not otherwise be reproduced digitally making them a must for certain landscape, architectural and product photography.");

        imageView1=(ImageView) view.findViewById(R.id.special_purpose_imageView1);
        Glide.with(getContext()).load(R.drawable.special_purpose1)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView1);

        imageView1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "special_purpose1";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView3=(TextView)view.findViewById(R.id.special_purpose_textView3);
        textView3.setTypeface(custom_font);
        textView3.setText("Figure:Canon 24mm Tilt shift lens");

        imageView2=(ImageView) view.findViewById(R.id.special_purpose_imageView2);
        Glide.with(getContext()).load(R.drawable.special_purpose2)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView2);

        imageView2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "special_purpose2";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });


        textView4=(TextView)view.findViewById(R.id.special_purpose_textView4);
        textView4.setTypeface(custom_font);
        textView4.setText("Figure:Example Photograph of Tilt shift lens");


//Fisheye Lens



        textView5=(TextView)view.findViewById(R.id.special_purpose_textView5);
        textView5.setTypeface(custom_font);
        textView5.setText("Fisheye Lens");


        textView6=(TextView)view.findViewById(R.id.special_purpose_textView6);
        textView6.setTypeface(custom_font);
        textView6.setText("A fisheye lens is an ultra wide-angle lens that produces strong visual distortion intended to create a wide panoramic or hemispherical image.Fisheye lenses achieve extremely wide angles of view by forgoing producing images with straight lines of perspective (rectilinear images), opting instead for a special mapping (for example: equisolid angle), which gives images a characteristic convex non-rectilinear appearance. Example - Sigma 8 mm f/4.0 EX DG ; Fisheye-Nikkor AF 16mm f/2.8 D;");

        imageView3=(ImageView) view.findViewById(R.id.special_purpose_imageView3);
        Glide.with(getContext()).load(R.drawable.special_purpose3)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView3);

        imageView3.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "special_purpose3";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView7=(TextView)view.findViewById(R.id.special_purpose_textView7);
        textView7.setTypeface(custom_font);
        textView7.setText("Figure:Sigma Fisheye lens");

        imageView4=(ImageView) view.findViewById(R.id.special_purpose_imageView4);
        Glide.with(getContext()).load(R.drawable.special_purpose4)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView4);

        imageView4.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "special_purpose4";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });


        textView8=(TextView)view.findViewById(R.id.special_purpose_textView8);
        textView8.setTypeface(custom_font);
        textView8.setText("Figure:Example Photograph of Fisheye Lens");




        //Macro Lens




        textView9=(TextView)view.findViewById(R.id.special_purpose_textView9);
        textView9.setTypeface(custom_font);
        textView9.setText("Macro Lens");


        textView10=(TextView)view.findViewById(R.id.special_purpose_textView10);
        textView10.setTypeface(custom_font);
        textView10.setText("The official definition of a macro lens is that it should be able to reproduce a life-sized image of an object on the recording medium – in this case the image sensor. Macro photography is extreme close-up photography, usually of very small subjects, in which the size of the subject in the photograph is greater than life size (though macrophotography technically refers to the art of making very large photographs).[2][4] By some definitions, a macro photograph is one in which the size of the subject on the negative or image sensor is life size or greater.[5] However, in other uses it refers to a finished photograph of a subject at greater than life size Example: Canon EF 100mm Lens; Nikon 105mm f/2.8G IF-ED AF-S VR;");

        imageView5=(ImageView) view.findViewById(R.id.special_purpose_imageView5);
        Glide.with(getContext()).load(R.drawable.special_purpose5)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView5);

        imageView5.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "special_purpose5";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView11=(TextView)view.findViewById(R.id.special_purpose_textView11);
        textView11.setTypeface(custom_font);
        textView11.setText("Figure:Nikon 105mm Macro lens");

        imageView6=(ImageView) view.findViewById(R.id.special_purpose_imageView6);
        Glide.with(getContext()).load(R.drawable.special_purpose6)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView6);

        imageView6.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "special_purpose6";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });


        textView12=(TextView)view.findViewById(R.id.special_purpose_textView12);
        textView12.setTypeface(custom_font);
        textView12.setText("Figure:Example Photograph of Macro Lens");











        return  view;
    }
}
