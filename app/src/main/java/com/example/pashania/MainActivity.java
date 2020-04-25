package com.example.pashania;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.nbsp.materialfilepicker.MaterialFilePicker;
import com.nbsp.materialfilepicker.ui.FilePickerActivity;

import org.opencv.android.OpenCVLoader;

import java.io.IOException;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";

    static {
        if (OpenCVLoader.initDebug()){
            Log.d(TAG, "OpenCV is configured successfully");
        }
        else{

            Log.d(TAG, "OpenCV is not configured correctly");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}
