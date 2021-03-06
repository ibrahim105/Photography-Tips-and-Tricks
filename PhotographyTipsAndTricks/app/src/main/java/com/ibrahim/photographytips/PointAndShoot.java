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

public class PointAndShoot extends Fragment{
    ImageView imageView1,imageView2;
    Intent intent;

    public PointAndShoot(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        getActivity().setTitle("Camera Types");

        View view= inflater.inflate(R.layout.fragment_point_and_shoot, container, false);


        imageView1=(ImageView) view.findViewById(R.id.point_and_shoot_imageView1);
//For image load in xml
        Glide.with(getContext()).load(R.drawable.pointandshoot1)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView1);
//image pass zooming activity

        imageView1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                 intent = new Intent(getActivity(),Zooming.class);
                String imgId = "pointandshoot1";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        imageView2=(ImageView) view.findViewById(R.id.point_and_shoot_imageView2);

        Glide.with(getContext()).load(R.drawable.pointandshoot2)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView2);



        imageView2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "pointandshoot2";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });


        return view;


    }
}
