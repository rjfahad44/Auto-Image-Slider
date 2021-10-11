package com.example.autoimageslideractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<SlideModel> slideModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSlideView();
    }

    private void imageSlideView() {

        ImageSlider imageSlider = findViewById(R.id.image_slider);


        slideModels.add(new SlideModel(R.drawable.img0,"Image 1", ScaleTypes.FIT) );
        slideModels.add(new SlideModel(R.drawable.img1,"Image 2", ScaleTypes.FIT) );
        slideModels.add(new SlideModel(R.drawable.img2,"Image 3", ScaleTypes.FIT) );
        slideModels.add(new SlideModel(R.drawable.img3,"Image 4", ScaleTypes.FIT) );
        slideModels.add(new SlideModel(R.drawable.img4,"Image 5", ScaleTypes.FIT) );
        slideModels.add(new SlideModel(R.drawable.img5,"Image 6", ScaleTypes.FIT) );


        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

    }
}