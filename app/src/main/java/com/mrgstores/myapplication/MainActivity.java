package com.mrgstores.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.rendering.RenderableInstance;

public class MainActivity extends AppCompatActivity {
    Button check_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check_btn = findViewById(R.id.check_btn);

        check_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent sceneViewerIntent = new Intent(Intent.ACTION_VIEW);
                    sceneViewerIntent.setData(Uri.parse("https://arvr.google.com/scene-viewer/1.0?file=https://raw.githubusercontent.com/ShihabHasan15/3dModels/main/Fox.gltf"));
                    sceneViewerIntent.setPackage("com.google.android.googlequicksearchbox");
                    startActivity(sceneViewerIntent);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), ""+e, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}