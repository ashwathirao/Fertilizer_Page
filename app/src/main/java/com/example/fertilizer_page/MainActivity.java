package com.example.fertilizer_page;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
/*import android.util.Log;*/
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
/*import android.widget.Toast;*/



public class MainActivity extends AppCompatActivity {

    String crop;
    int N, P, K;

    EditText Crop_name;
    EditText Nitrogen_content;
    EditText Phosphate_content;
    EditText Potassium_content;

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Crop_name = findViewById(R.id.Crop_name);
        Nitrogen_content =  findViewById(R.id.Nitrogen_content);
        Phosphate_content =  findViewById(R.id.Phosphate_content);
        Potassium_content =  findViewById(R.id.Potassium_content);

        button =  findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crop = Crop_name.getText().toString();/*
                N = Integer.valueOf(Nitrogen_content.getText().toString());
                P = Integer.valueOf(Phosphate_content.getText().toString());
                K = Integer.valueOf(Potassium_content.getText().toString());*/
                N=cropnitrogen(Integer.parseInt(Nitrogen_content.getText().toString()),crop);
                P=croppotassium(Integer.parseInt(Phosphate_content.getText().toString()),crop);
                K=cropphosphate(Integer.parseInt(Potassium_content.getText().toString()),crop);
                Intent intent = new Intent(MainActivity.this,Result.class);
                intent.putExtra("Name",crop);
                intent.putExtra("value1",N);
                intent.putExtra("value2",P);
                intent.putExtra("value3",K);

                startActivity(intent);





            }

        });
    }
    private int cropnitrogen(int a, String Crop) {
        int a1 = 0;
        switch (Crop) {
            case "Wheat":
                a1 = 40 - a;
                break;
            case "Maize":
                a1 = 40 - a;
                break;
            case "Sorghum":
                a1 = 40 - a;
                break;
            case "Ragi":
                a1 = 40 - a;
                break;
            case "Cumbu":
                a1 = 40 - a;
                break;
            case "Varagu":
                a1 = 40 - a;
                break;
            case "Panivaragu":
                a1 = 40 - a;
                break;
            case "Samai":
                a1 = 40 - a;
                break;
            case "Tenai":
                a1 = 40 - a;
                break;
            case "Blackgram":
                a1 = 40 - a;
                break;
            case "Greengram":
                a1 = 40 - a;
                break;
            case "Cowpea":
                a1 = 40 - a;
                break;
            case "Bengalgram":
                a1 = 40 - a;
                break;
            case "Redgram":
                a1 = 40 - a;
                break;
            case "Soyabean":
                a1 = 40 - a;
                break;
            case "Horsegram":
                a1 = 40 - a;
                break;
            case "Feildlablab":
                a1 = 40 - a;
                break;
            case "Swordbean":
                a1 = 40 - a;
                break;
            case "Ground nut":
                a1 = 40 - a;
                break;
            case "Sunflower":
                a1 = 40 - a;
                break;
            case "Sesame":
                a1 = 40 - a;
                break;
            case "Castor":
                a1 = 40 - a;
                break;
            case "Safflower":
                a1 = 40 - a;
                break;
            case "Niger":
                a1 = 40 - a;
                break;
            case "Cotton":
                a1 = 40 - a;
                break;
            case "Jute":
                a1 = 40 - a;
                break;
            case "Sugarcane":
                a1 = 40 - a;
                break;
            case "Sugarbeet":
                a1 = 40 - a;
                break;
            case "Sweetsorghum":
                a1 = 40 - a;
                break;
            case "Cumbu Napier":
                a1 = 40 - a;
                break;
            case "KollukattaiPul":
                a1 = 40 - a;
                break;
            case "Foddercholam":
                a1 = 40 - a;
                break;
            case "Foddercowpea":
                a1 = 40 - a;
                break;
            case "Foddercumbu":
                a1 = 40 - a;
                break;
            case "Foddermaize":
                a1 = 40 - a;
                break;
            case "GunieGrass":
                a1 = 40 - a;
                break;
            case "Velimasal":
                a1 = 40 - a;
                break;
            case "Soundal":
                a1 = 40 - a;
                break;
            case "Kudiraimasal":
                a1 = 40 - a;
                break;
            case "Muyalmasal":
                a1 = 40 - a;
                break;
            default:
                break;
        }
        return a1;
    }

    private int croppotassium(int a, String Crop){
        int a2=0;
        switch (Crop){
            case "Wheat":
                a2=40-a;
                break;
            case "Maize":
                a2=40-a;
                break;
            case "Sorghum":
                a2=40-a;
                break;
            case "Ragi":
                a2=40-a;
                break;
            case "Cumbu":
                a2=40-a;
                break;
            case "Varagu":
                a2=40-a;
                break;
            case "Panivaragu":
                a2=40-a;
                break;
            case "Samai":
                a2=40-a;
                break;
            case "Tenai":
                a2=40-a;
                break;
            case "Blackgram":
                a2=40-a;
                break;
            case "Greengram":
                a2=40-a;
                break;
            case "Cowpea":
                a2=40-a;
                break;
            case "Bengalgram":
                a2=40-a;
                break;
            case "Redgram":
                a2=40-a;
                break;
            case "Soyabean":
                a2=40-a;
                break;
            case "Horsegram":
                a2=40-a;
                break;

            case "Feildlablab":
                a2=40-a;
                break;

            case "Swordbean":
                a2=40-a;
                break;
            case "Ground nut":
                a2=40-a;
                break;
            case "Sunflower":
                a2=40-a;
                break;
            case "Sesame":
                a2=40-a;
                break;
            case "Castor":
                a2=40-a;
                break;
            case "Safflower":
                a2=40-a;
                break;
            case "Niger":
                a2=40-a;
                break;
            case "Cotton":
                a2=40-a;
                break;
            case "Jute":
                a2=40-a;
                break;
            case "Sugarcane":
                a2=40-a;
                break;
            case "Sugarbeet":
                a2=40-a;
                break;
            case "Sweetsorghum":
                a2=40-a;
                break;
            case "Cumbu Napier":
                a2=40-a;
                break;
            case "KollukattaiPul":
                a2=40-a;
                break;
            case "Foddercholam":
                a2=40-a;
                break;
            case "Foddercowpea":
                a2=40-a;
                break;
            case "Foddercumbu":
                a2=40-a;
                break;
            case "Foddermaize":
                a2=40-a;
                break;
            case "GunieGrass":
                a2=40-a;
                break;
            case "Velimasal":
                a2=40-a;
                break;
            case "Soundal":
                a2=40-a;
                break;
            case "Kudiraimasal":
                a2=40-a;
                break;
            case "Muyalmasal":
                a2=40-a;
                break;
            default:
                break;
        }
        return a2;
    }
    private int cropphosphate(int a, String Crop){
        int a3=0;
        switch (Crop){
            case "Wheat":
                a3=40-a;
                break;
            case "Maize":
                a3=40-a;
                break;
            case "Sorghum":
                a3=40-a;
                break;
            case "Ragi":
                a3=40-a;
                break;
            case "Cumbu":
                a3=40-a;
                break;
            case "Varagu":
                a3=40-a;
                break;
            case "Panivaragu":
                a3=40-a;
                break;
            case "Samai":
                a3=40-a;
                break;
            case "Tenai":
                a3=40-a;
                break;
            case "Blackgram":
                a3=40-a;
                break;
            case "Greengram":
                a3=40-a;
                break;
            case "Cowpea":
                a3=40-a;
                break;
            case "Bengalgram":
                a3=40-a;
                break;
            case "Redgram":
                a3=40-a;
                break;
            case "Soyabean":
                a3=40-a;
                break;
            case "Horsegram":
                a3=40-a;
                break;
            case "Feildlablab":
                a3=40-a;
                break;
            case "Swordbean":
                a3=40-a;
                break;
            case "Ground nut":
                a3=40-a;
                break;
            case "Sunflower":
                a3=40-a;
                break;
            case "Sesame":
                a3=40-a;
                break;
            case "Castor":
                a3=40-a;
                break;
            case "Safflower":
                a3=40-a;
                break;
            case "Niger":
                a3=40-a;
                break;
            case "Cotton":
                a3=40-a;
                break;
            case "Jute":
                a3=40-a;
                break;
            case "Sugarcane":
                a3=40-a;
                break;
            case "Sugarbeet":
                a3=40-a;
                break;
            case "Sweetsorghum":
                a3=40-a;
                break;
            case "Cumbu Napier":
                a3=40-a;
                break;
            case "KollukattaiPul":
                a3=40-a;
                break;
            case "Foddercholam":
                a3=40-a;
                break;
            case "Foddercowpea":
                a3=40-a;
                break;
            case "Foddercumbu":
                a3=40-a;
                break;
            case "Foddermaize":
                a3=40-a;
                break;
            case "GunieGrass":
                a3=40-a;
                break;
            case "Velimasal":
                a3=40-a;
                break;
            case "Soundal":
                a3=40-a;
                break;
            case "Kudiraimasal":
                a3=40-a;
                break;
            case "Muyalmasal":
                a3=40-a;
                break;
            default:
                break;
        }
        return a3;
    }
}

