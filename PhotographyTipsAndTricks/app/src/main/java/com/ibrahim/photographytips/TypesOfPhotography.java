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


public class TypesOfPhotography extends Fragment{

    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11;

    Intent intent;


    public TypesOfPhotography(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        getActivity().setTitle("Types of Photography");
        View view= inflater.inflate(R.layout.fragment_types_of_photography, container, false);
        Typeface custom_font = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(),"fonts/NotoSans-Regular.ttf");

        //Heading

        textView1=(TextView)view.findViewById(R.id.types_of_photography_textView1);
        textView1.setTypeface(custom_font);
        textView1.setText("Photography Types Example");


        //Example of Landscape Photography

        imageView1=(ImageView) view.findViewById(R.id.types_of_photography_imageView1);
        Glide.with(getContext()).load(R.drawable.types_of_photography1)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView1);

        imageView1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "types_of_photography1";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });



        textView2=(TextView)view.findViewById(R.id.types_of_photography_textView2);
        textView2.setTypeface(custom_font);
        textView2.setText("Figure:Example of Landscape Photography.");





        //Example of portrait Photography.


        imageView2=(ImageView) view.findViewById(R.id.types_of_photography_imageView2);
        Glide.with(getContext()).load(R.drawable.types_of_photography2)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView2);

        imageView2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "types_of_photography2";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });



        textView3=(TextView)view.findViewById(R.id.types_of_photography_textView3);
        textView3.setTypeface(custom_font);
        textView3.setText("Figure:Example of portrait Photography.");



        //Example of portrait Photography.

        imageView3=(ImageView) view.findViewById(R.id.types_of_photography_imageView3);
        Glide.with(getContext()).load(R.drawable.types_of_photography3)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView3);

        imageView3.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "types_of_photography3";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });



        textView4=(TextView)view.findViewById(R.id.types_of_photography_textView4);
        textView4.setTypeface(custom_font);
        textView4.setText("Figure:Example of portrait Photography.");


        //Example of wildlife Photography.

        imageView3=(ImageView) view.findViewById(R.id.types_of_photography_imageView3);
        Glide.with(getContext()).load(R.drawable.types_of_photography3)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView3);

        imageView3.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "types_of_photography3";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });



        textView4=(TextView)view.findViewById(R.id.types_of_photography_textView4);
        textView4.setTypeface(custom_font);
        textView4.setText("Figure:Example of wildlife Photography.");







        //Example of macro Photography.


        imageView4=(ImageView) view.findViewById(R.id.types_of_photography_imageView4);
        Glide.with(getContext()).load(R.drawable.types_of_photography4)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView4);

        imageView4.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "types_of_photography4";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });



        textView5=(TextView)view.findViewById(R.id.types_of_photography_textView5);
        textView5.setTypeface(custom_font);
        textView5.setText("Figure:Example of macro Photography.");



        //Example of Street Photography.


        imageView5=(ImageView) view.findViewById(R.id.types_of_photography_imageView5);
        Glide.with(getContext()).load(R.drawable.types_of_photography5)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView5);

        imageView5.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "types_of_photography5";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });



        textView6=(TextView)view.findViewById(R.id.types_of_photography_textView6);
        textView6.setTypeface(custom_font);
        textView6.setText("Figure:Example of Street Photography.");


        //Example of Startrail Photography.



        imageView6=(ImageView) view.findViewById(R.id.types_of_photography_imageView6);
        Glide.with(getContext()).load(R.drawable.types_of_photography6)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView6);

        imageView6.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "types_of_photography6";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });



        textView7=(TextView)view.findViewById(R.id.types_of_photography_textView7);
        textView7.setTypeface(custom_font);
        textView7.setText("Figure:Example of Startrail Photography.");




        return view;
    }

}
