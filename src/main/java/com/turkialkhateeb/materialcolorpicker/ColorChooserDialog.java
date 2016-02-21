package com.turkialkhateeb.materialcolorpicker;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by TurkiAlkhateeb on 1/17/16.
 */
public class ColorChooserDialog extends Dialog{
    public ColorChooserDialog(Context context) {
        super(context);
    }

    private ImageButton one;
    private ImageButton two;
    private ImageButton three;
    private ImageButton four;
    private ImageButton five;
    private ImageButton six;
    private ImageButton seven;
    private ImageButton eight;
    private ImageButton nine;
    private ImageButton ten;
    private ImageButton eleven;
    private ImageButton twelve;
    private ImageButton thirteen;
    private ImageButton fourteen;
    private ImageButton fifteen;
    private ImageButton sixteen;
    private ImageButton seventeen;
    private ImageButton eighteen;
    private ImageButton nineteen;
    private ImageButton twenty;
    private Button twentyOne;

    private List<Integer> colors;
    private List<ImageButton> buttons;

    private ColorListener myColorListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_picker_dialog);

        one =      (ImageButton)findViewById(R.id.b1);
        two =      (ImageButton)findViewById(R.id.b2);
        three =    (ImageButton)findViewById(R.id.b3);
        four =     (ImageButton)findViewById(R.id.b4);
        five =     (ImageButton)findViewById(R.id.b5);
        six =      (ImageButton)findViewById(R.id.b6);
        seven =    (ImageButton)findViewById(R.id.b7);
        eight =    (ImageButton)findViewById(R.id.b8);
        nine =     (ImageButton)findViewById(R.id.b9);
        ten =      (ImageButton)findViewById(R.id.b10);
        eleven =   (ImageButton)findViewById(R.id.b11);
        twelve =   (ImageButton)findViewById(R.id.b12);
        thirteen = (ImageButton)findViewById(R.id.b13);
        fourteen = (ImageButton)findViewById(R.id.b14);
        fifteen =  (ImageButton)findViewById(R.id.b15);
        sixteen =  (ImageButton)findViewById(R.id.b16);
        seventeen =(ImageButton)findViewById(R.id.b17);
        eighteen = (ImageButton)findViewById(R.id.b18);
        nineteen = (ImageButton)findViewById(R.id.b19);
        twenty =   (ImageButton)findViewById(R.id.b20);
        twentyOne =(Button)findViewById(R.id.b21);



        colors = new ArrayList<>();
        colors.add(red);
        colors.add(pink);
        colors.add(Purple);
        colors.add(DeepPurple);
        colors.add(Indigo);
        colors.add(Blue);
        colors.add(LightBlue);
        colors.add(Cyan);
        colors.add(Teal);
        colors.add(Green);
        colors.add(LightGreen);
        colors.add(Lime);
        colors.add(Yellow);
        colors.add(Amber);
        colors.add(Orange);
        colors.add(DeepOrange);
        colors.add(Brown);
        colors.add(Grey);
        colors.add(BlueGray);
        colors.add(Black);
        colors.add(White);

        buttons = new ArrayList<>();
        buttons.add(one);
        buttons.add(two);
        buttons.add(three);
        buttons.add(four);
        buttons.add(five);
        buttons.add(six);
        buttons.add(seven);
        buttons.add(eight);
        buttons.add(nine);
        buttons.add(ten);
        buttons.add(eleven);
        buttons.add(twelve);
        buttons.add(thirteen);
        buttons.add(fourteen);
        buttons.add(fifteen);
        buttons.add(sixteen);
        buttons.add(seventeen);
        buttons.add(eighteen);
        buttons.add(nineteen);
        buttons.add(twenty);




        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            Colorize();
        }else{
            ColorizeOld();
        }

        twentyOne.setVisibility(View.INVISIBLE);

        setListeners();
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(myColorListener != null)
            myColorListener.OnColorClick(v, (int)v.getTag());
            dismiss();
        }
    };

    private void setListeners() {
        for (int i = 0; i < buttons.size(); i++) {
            buttons.get(i).setTag(colors.get(i));
            buttons.get(i).setOnClickListener(listener);
        }
        twentyOne.setTag(colors.get(20));
        twentyOne.setOnClickListener(listener);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void Colorize() {
        for (int i = 0; i < buttons.size(); i++) {
            ShapeDrawable d = new ShapeDrawable(new OvalShape());
            d.setBounds(58, 58, 58, 58);
            Log.e("Shape drown no", i + "");
            buttons.get(i).setVisibility(View.INVISIBLE);

                d.getPaint().setStyle(Paint.Style.FILL);
                d.getPaint().setColor(colors.get(i));

            buttons.get(i).setBackground(d);
        }
            animate();

    }

    private void ColorizeOld() {
        for (int i = 0; i < buttons.size(); i++) {
            ShapeDrawable d = new ShapeDrawable(new OvalShape());
            d.getPaint().setColor(colors.get(i));
            d.getPaint().setStrokeWidth(1f);
            d.setBounds(58, 58, 58, 58);
            buttons.get(i).setVisibility(View.INVISIBLE);
                d.getPaint().setStyle(Paint.Style.FILL);
                d.getPaint().setColor(colors.get(i));
        buttons.get(i).setBackgroundDrawable(d);
        }
        animate();
    }


    private void animate(){
        Log.e("animate","true");
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                Log.e("animator 1","r");
                animator(one);
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                animator(two);
                animator(six);
            }
        };

        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                animator(three);
                animator(seven);
                animator(eleven);
            }
        };

        Runnable r4 = new Runnable() {
            @Override
            public void run() {
                animator(four);
                animator(eight);
                animator(twelve);
                animator(sixteen);
            }
        };

        Runnable r5 = new Runnable() {
            @Override
            public void run() {
                animator(five);
                animator(nine);
                animator(thirteen);
                animator(seventeen);
            }
        };

        Runnable r6 = new Runnable() {
            @Override
            public void run() {
                animator(ten);
                animator(fourteen);
                animator(eighteen);
            }
        };

        Runnable r7 = new Runnable() {
            @Override
            public void run() {
                animator(fifteen);
                animator(nineteen);
            }
        };

        Runnable r8 = new Runnable() {
            @Override
            public void run() {
                animator(twenty);
            }
        };

        Runnable r9 = new Runnable() {
            @Override
            public void run() {
                Animation animation = AnimationUtils.loadAnimation(getContext(),android.R.anim.fade_in);
                animation.setInterpolator(new AccelerateInterpolator());
                twentyOne.setAnimation(animation);
                twentyOne.setVisibility(View.VISIBLE);
                animation.start();
            }
        };



        android.os.Handler handler = new android.os.Handler();
        int counter = 85;
        handler.postDelayed(r1,counter);
        handler.postDelayed(r2,counter * 2);
        handler.postDelayed(r3,counter * 3);
        handler.postDelayed(r4,counter * 4);
        handler.postDelayed(r5,counter * 5);
        handler.postDelayed(r6,counter * 6);
        handler.postDelayed(r7,counter * 7);
        handler.postDelayed(r8,counter * 8);
        handler.postDelayed(r9,counter * 9);
    }


    private void animator(final ImageButton imageButton){
        Animation animation = AnimationUtils.loadAnimation(getContext(),R.anim.color_item);
        animation.setInterpolator(new AccelerateInterpolator());
        imageButton.setAnimation(animation);
        imageButton.setVisibility(View.VISIBLE);
        animation.start();
    }

    //CONSTANTS
    public final int red =        0xffF44336;
    public final int pink =       0xffE91E63;
    public final int Purple =     0xff9C27B0;
    public final int DeepPurple = 0xff673AB7;
    public final int Indigo =     0xff3F51B5;
    public final int Blue =       0xff2196F3;
    public final int LightBlue =  0xff03A9F4;
    public final int Cyan =       0xff00BCD4;
    public final int Teal =       0xff009688;
    public final int Green =      0xff4CAF50;
    public final int LightGreen = 0xff8BC34A;
    public final int Lime =       0xffCDDC39;
    public final int Yellow =     0xffFFEB3B;
    public final int Amber =      0xffFFC107;
    public final int Orange =     0xffFF9800;
    public final int DeepOrange = 0xffFF5722;
    public final int Brown =      0xff795548;
    public final int Grey =       0xff9E9E9E;
    public final int BlueGray =   0xff607D8B;
    public final int Black =      0xff000000;
    public final int White =      0xffffffff;


    public void setColorListener(ColorListener listener){
        this.myColorListener = listener;
    }


}
