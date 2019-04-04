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

public class Bokeh extends Fragment{
    ImageView imageView1,imageView2,imageView3;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11;

    Intent intent;
    public Bokeh(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        getActivity().setTitle("Photography Terms");

        View view= inflater.inflate(R.layout.fragment_bokeh, container, false);

        Typeface custom_font = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(),"fonts/NotoSans-Regular.ttf");

        //Bokeh

        textView1=(TextView)view.findViewById(R.id.bokeh_textView1);
        textView1.setTypeface(custom_font);
        textView1.setText("Bokeh");


        textView2=(TextView)view.findViewById(R.id.bokeh_textView2);
        textView2.setTypeface(custom_font);
        textView2.setText("In photography, bokeh is the aesthetic quality of the blur produced in the out-of-focus parts of an image produced by a lens. Bokeh has been defined as ,the way the lens renders out-of-focus points of light. Differences in lens aberrations and aperture shape cause some lens designs to blur the image in a way that is pleasing to the eye, while others produce blurring that is unpleasant or distracting—good and bad bokeh, respectively.Bokeh occurs for parts of the scene that lie outside the depth of field. Photographers sometimes deliberately use a shallow focus technique to create images with prominent out-of-focus regions.\n" +
                "\n" +
                "The term comes from the Japanese word boke,which means blur.");

        imageView1=(ImageView) view.findViewById(R.id.bokeh_imageView1);
        Glide.with(getContext()).load(R.drawable.bokeh)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView1);

        imageView1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "bokeh";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView3=(TextView)view.findViewById(R.id.bokeh_textView3);
        textView3.setTypeface(custom_font);
        textView3.setText("Bokeh Example");

        return view;
    }
}
