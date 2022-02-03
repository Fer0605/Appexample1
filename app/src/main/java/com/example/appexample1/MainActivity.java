package com.example.appexample1;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
@SuppressWarnings("LambdaParameterTypeCanBeSpecified")
public class MainActivity extends AppCompatActivity {

    int n;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Spiderman");

        ImageView imageView = findViewById(R.id.Spiderman0);
        final boolean[] invisible = {true};

        Button button = findViewById(R.id.Stash);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //textView.setText(Spiderman);
                //finish();
                n++;
                textView.setText(" Spiderman x"+n+" ");


        if(invisible[0]){
            imageView.setVisibility(View.INVISIBLE);
            invisible[0] = false;
        }else{
            imageView.setVisibility(View.VISIBLE);
            invisible[0] = true;

        }
            }
    });
 }
}