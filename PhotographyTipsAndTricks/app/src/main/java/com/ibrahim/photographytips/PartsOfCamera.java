package com.ibrahim.photographytips;

/**
 * Created by munna105 on 1/8/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
public class PartsOfCamera extends Fragment{
    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9;
    Intent intent;
    public PartsOfCamera(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        getActivity().setTitle("Parts of Camera");

        View view= inflater.inflate(R.layout.fragment_parts_of_camera, container, false);



        imageView1=(ImageView) view.findViewById(R.id.parts_of_camera_imageView1);
//For image load in xml
        Glide.with(getContext()).load(R.drawable.parts_of_camera1)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView1);
//image pass zooming activity

        imageView1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "parts_of_camera1";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });


        imageView2=(ImageView) view.findViewById(R.id.parts_of_camera_imageView2);

        Glide.with(getContext()).load(R.drawable.parts_of_camera2)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView2);


        imageView2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "parts_of_camera2";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });



        imageView3=(ImageView) view.findViewById(R.id.parts_of_camera_imageView3);

        Glide.with(getContext()).load(R.drawable.parts_of_camera3)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView3);


        imageView3.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "parts_of_camera3";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        imageView4=(ImageView) view.findViewById(R.id.parts_of_camera_imageView4);

        Glide.with(getContext()).load(R.drawable.parts_of_camera4)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView4);


        imageView4.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "parts_of_camera4";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });



        imageView5=(ImageView) view.findViewById(R.id.parts_of_camera_imageView5);

        Glide.with(getContext()).load(R.drawable.parts_of_camera5)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView5);


        imageView5.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "parts_of_camera5";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        imageView6=(ImageView) view.findViewById(R.id.parts_of_camera_imageView6);

        Glide.with(getContext()).load(R.drawable.parts_of_camera6)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView6);


        imageView6.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "parts_of_camera6";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });





        imageView7=(ImageView) view.findViewById(R.id.parts_of_camera_imageView7);

        Glide.with(getContext()).load(R.drawable.parts_of_camera7)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView7);


        imageView7.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "parts_of_camera7";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });


        imageView8=(ImageView) view.findViewById(R.id.parts_of_camera_imageView8);

        Glide.with(getContext()).load(R.drawable.parts_of_camera8)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView8);


        imageView8.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "parts_of_camera8";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });



        imageView9=(ImageView) view.findViewById(R.id.parts_of_camera_imageView9);

        Glide.with(getContext()).load(R.drawable.parts_of_camera9)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView9);


        imageView9.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "parts_of_camera9";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });



        return view;
    }
}
