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


public class Patterns extends Fragment{

    ImageView imageView1,imageView2,imageView3;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;
    Intent intent;


    public Patterns(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        getActivity().setTitle("Composition");

        View view = inflater.inflate(R.layout.fragment_patterns, container, false);

        Typeface custom_font = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(),"fonts/NotoSans-Regular.ttf");



        textView1=(TextView)view.findViewById(R.id.patterns_textView1);
        textView1.setTypeface(custom_font);
        textView1.setText("Pattern");


        textView2=(TextView)view.findViewById(R.id.patterns_textView2);
        textView2.setTypeface(custom_font);
        textView2.setText("Patterns, both natural and man-made, bring a sense of visual rhythm and harmony to photographs that, like a series of repeating notes in a melody, capture the imagination. Patterns appear whenever strong graphic elements—lines, colors, shapes, or forms—repeat themselves.\n" +
                "\n" +
                "Once you do become aware of the power of patterns, you will discover them almost everywhere: in a field of Maine lupines, in crowds of faces in a stadium, even in the zigs and zags of modern architecture. The secret to finding patterns is to explore potential subjects from a variety of angles. While you might not notice the colorful design of umbrellas as you maneuver a crowded Paris sidewalk, they become blatantly clear from an upper-floor window or balcony. Lighting is another potent painter of pattern. Fresh-plowed furrows in a cornfield, all but invisible on a dull, overcast day, rise into waves of highlight and shadow when lit by a bright, low-angle sun. Close-ups are also filled with pattern—consider the swirl of seeds in a sunflower or the intricate tracings of color in a butterfly's wings.");

        imageView1=(ImageView) view.findViewById(R.id.patterns_imageView1);
        Glide.with(getContext()).load(R.drawable.patterns1)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView1);

        imageView1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "patterns1";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });

        textView3=(TextView)view.findViewById(R.id.patterns_textView3);
        textView3.setTypeface(custom_font);
        textView3.setText("Example of pattern");



        imageView2=(ImageView) view.findViewById(R.id.patterns_imageView2);
        Glide.with(getContext()).load(R.drawable.patterns2)
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView2);

        imageView2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                intent = new Intent(getActivity(),Zooming.class);
                String imgId = "patterns2";
                intent.putExtra("imgKey", imgId);

                startActivity(intent);

            }
        });



        textView4=(TextView)view.findViewById(R.id.patterns_textView4);
        textView4.setTypeface(custom_font);
        textView4.setText("Example of pattern");


        textView5=(TextView)view.findViewById(R.id.patterns_textView5);
        textView5.setTypeface(custom_font);
        textView5.setText("The key to emphasizing patterns is to isolate them from their surroundings. By excluding everything but the design, you create the illusion that the repetition is infinite, extending beyond the frame. Telephoto and longer zoom lenses are excellent tools for isolating and extracting patterns by enabling you to exclude extraneous images.\n" +
                "\n" +
                "Patterns also reinforce the emotional appeal of their components. In his book Learning to See Creatively, photographer Bryan Peterson observes: Whatever emotional response a single design element arouses is multiplied when it is repeated in a pattern.");



        return view;
    }
}
