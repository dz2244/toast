package com.example.toast;
import static java.lang.Math.round;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    int rand1,rand2,rand3,rand4,ans1,ans2,ans3,counter;
    String str1,str2,str3;
    EditText etn1,etn2,etn3;
    ImageView iv1,iv2,iv3;
    Button btn1,btn2,btn3,bigbtn ;
    Random rnd = new Random();
    Boolean clickedEtn1 = false;
    Boolean clickedEtn2 = false;
    Boolean clickedEtn3 = false;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        etn1 = findViewById(R.id.etn1);
        etn2 = findViewById(R.id.etn2);
        etn3 = findViewById(R.id.etn3);
        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
        iv3 = findViewById(R.id.iv3);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        bigbtn = findViewById(R.id.bigbtn);

        rand1 = rnd.nextInt(90)+10;
        rand2 = rnd.nextInt(90)+10;
        rand3 = rnd.nextInt(90)+10;
        rand4 = rnd.nextInt(90)+10;

        tv1.setText(" "+rand1);
        tv2.setText(" "+rand2);
        tv4.setText(" "+rand3);
        tv6.setText(" "+rand4);

        tv3.setVisibility(View.INVISIBLE);
        tv4.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        etn2.setVisibility(View.INVISIBLE);
        etn3.setVisibility(View.INVISIBLE);
        iv1.setVisibility(View.INVISIBLE);
        iv2.setVisibility(View.INVISIBLE);
        iv3.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        bigbtn.setVisibility(View.INVISIBLE);

    }
    public void clickEtn1(View view) {
        clickedEtn1 = true;
    }
    public void clickedBtn1(View view) {
        str1 = etn1.getText().toString();
        if (!str1.isEmpty()) {
            ans1 = Integer.parseInt(str1);
            iv1.setVisibility(View.VISIBLE);
            if (ans1 == rand1 + rand2)
            {
                iv1.setImageResource(R.drawable.check);
                counter++;
            }
            else
                iv1.setImageResource(R.drawable.x);

            tv3.setVisibility(View.VISIBLE);
            tv4.setVisibility(View.VISIBLE);
            etn2.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            tv3.setText("" + (rand1 + rand2));
        }
        else if(str1.isEmpty())
            Toast.makeText(this, "IM ALWAYS ONE STEP AHEAD", Toast.LENGTH_SHORT).show();
    }
    public void clickedEtn2(View view) {clickedEtn2 = true;}
    public void clickedBtn2(View view) {
        str2 = etn2.getText().toString();
        if (!str2.isEmpty()) {
            ans2 = Integer.parseInt(str2);
            iv2.setVisibility(View.VISIBLE);
            if (ans2 == rand3 + rand1 + rand2)
            {
                iv2.setImageResource(R.drawable.check);
                counter++;
            }
            else
                iv2.setImageResource(R.drawable.x);

            tv5.setVisibility(View.VISIBLE);
            tv6.setVisibility(View.VISIBLE);
            etn3.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            tv5.setText("" + (rand3 + rand1 + rand2));
        }
        else if(str2.isEmpty())
            Toast.makeText(this, "IM ALWAYS ONE STEP AHEAD", Toast.LENGTH_SHORT).show();
    }
    public void clickedEtn3(View view) {clickedEtn3 = true;}

    public void clickedBtn3(View view) {
        str3 = etn3.getText().toString();
        if (!str3.isEmpty()) {
            ans3 = Integer.parseInt(str3);
            iv3.setVisibility(View.VISIBLE);
            if (ans3 == rand4 + rand1 + rand2 + rand3)
            {
                iv3.setImageResource(R.drawable.check);
                counter++;
            }
            else
                iv3.setImageResource(R.drawable.x);
            Toast.makeText(this, round(counter * 33.333 )+"% ," + counter + "/3", Toast.LENGTH_SHORT).show();
            bigbtn.setVisibility(View.VISIBLE);
        }
        else if(str3.isEmpty())
            Toast.makeText(this, "IM ALWAYS ONE STEP AHEAD", Toast.LENGTH_SHORT).show();
    }
    public void clickedBigbtn(View view) {
        etn1.setText("");
        etn2.setText("");
        etn3.setText("");
        tv3.setVisibility(View.INVISIBLE);
        tv4.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        etn2.setVisibility(View.INVISIBLE);
        etn3.setVisibility(View.INVISIBLE);
        iv1.setVisibility(View.INVISIBLE);
        iv2.setVisibility(View.INVISIBLE);
        iv3.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        bigbtn.setVisibility(View.INVISIBLE);
        rand1 = rnd.nextInt(90)+10;
        rand2 = rnd.nextInt(90)+10;
        tv1.setText(" "+rand1);
        tv2.setText(" "+rand2);
        counter = 0;
    }
}