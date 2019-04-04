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


public class RuleOfThird extends Fragment{

    ImageView imageView1,imageView2,imageView3;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;

    Intent intent;

    public RuleOfThird(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        getActivity().setTitle("Composition");

        View view =inflater.inflate(R.layout.fragment_rule_of_third, container, false);

        Typeface custom_font = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(),"fonts/NotoSans-Regular.ttf");


        textView1=(TextView)view.findViewById(R.id.rule_of_third_textView1);
        textView1.setTypeface(custom_font);
        textView1.setText("Rule of Third");


        textView2=(TextView)view.findViewById(R.id.rule_of_third_textView2);
        textView2.setTypeface(custom_font);
        textView2.setText("The rule of thirds is a rule of thumb or guideline which applies to the process of composing visual images such as photographs. The guideline proposes that an image should be imagined as divided into nine equal parts by two equally spaced horizontal lines and two equally spaced vertical lines, and that important compositional elements should be placed along these lines or their intersections. Proponents of the technique claim that aligning a subject with these points creates more tension, energy and interest in the composition than simply centering the subject.");

        imageView1=(ImageView) view.findViewById(R.id.rule_of_third_imageView1);

        Glide.with(getContext()).load(R.drawable.rule_of_third1)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView1);

        imageView1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "rule_of_third1";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView3=(TextView)view.findViewById(R.id.rule_of_third_textView3);
        textView3.setTypeface(custom_font);
        textView3.setText("Figure:Rule of Third");




        textView4=(TextView)view.findViewById(R.id.rule_of_third_textView4);
        textView4.setTypeface(custom_font);
        textView4.setText("The rule of thirds is applied by aligning a subject with the guide lines and their intersection points, placing the horizon on the top or bottom line, or allowing linear features in the image to flow from section to section. The main reason for observing the rule of thirds is to discourage placement of the subject at the center, or prevent a horizon from appearing to divide the picture in half.\n" +
                "\n" +
                "When filming or photographing people, it is common to line the body up to a vertical line and the person's eyes to a horizontal line. If filming a moving subject, the same pattern is often followed, with the majority of the extra room being in front of the person (the way they are moving).Likewise, when photographing a still subject who is not directly facing the camera, the majority of the extra room should be in front of the subject with the vertical line running through their perceived center of mass.");

        imageView2=(ImageView) view.findViewById(R.id.rule_of_third_imageView2);
        Glide.with(getContext()).load(R.drawable.rule_of_third2)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView2);

        imageView2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "rule_of_third2";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView5=(TextView)view.findViewById(R.id.rule_of_third_textView5);
        textView5.setTypeface(custom_font);
        textView5.setText("A picture example without and with rule of third");


        return view;

    }
}
