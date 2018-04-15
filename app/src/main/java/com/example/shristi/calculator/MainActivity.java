package com.example.shristi.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {double val1,val2;
    double val3;int i;
    String s;

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bAC,bEq,bSum,bSub,bDiv,bMul;
    TextView tv;
  List<String> al=new ArrayList<String>();
    boolean bs,bS,bm,bd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         b1 = (Button) findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
     b4=(Button)findViewById(R.id.button4);
         b5=(Button)findViewById(R.id.button5);
         b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b0=(Button)findViewById(R.id.button0);
        bAC=(Button)findViewById(R.id.buttonC);
        bEq=(Button)findViewById(R.id.buttonEq);
        bSub=(Button)findViewById(R.id.buttonSub);
        bSum=(Button)findViewById(R.id.buttonAdd);
        bDiv=(Button)findViewById(R.id.buttonDiv);
        bMul=(Button)findViewById(R.id.buttonMul);
        tv=(TextView)findViewById(R.id.textView);



    }


    public void clicked0(View view) {
        tv.setText(tv.getText() + "0");
        al.add("0");
    }

    public void clicked9(View view) {
        tv.setText(tv.getText() + "9");al.add("9");
    }

    public void clicked8(View view) {tv.setText(tv.getText() + "8");
    al.add("8");
    }



    public void clicked1(View view) { tv.setText(tv.getText() + "1");al.add("1");
    }

    public void clicked2(View view) { tv.setText(tv.getText() + "2");al.add("2");
    }

    public void clicked3(View view) { tv.setText(tv.getText() + "3");al.add("3");
    }



public void clicked4(View view) { tv.setText(tv.getText() + "4");al.add("4");
    }

    public void clicked5(View view) { tv.setText(tv.getText() + "5");al.add("5");
    }

    public void clicked6(View view) { tv.setText(tv.getText() + "6");al.add("6");
    }

    public void add(View view) {al.add("+");
         val1=Double.parseDouble(tv.getText().toString());
        bs=true;
        tv.setText("");

    }
    public void div(View view) {
        val1=Double.parseDouble(tv.getText().toString());al.add("/");
        bd=true;tv.setText("");
    }
    public void Sub(View view) {
        val1=Double.parseDouble(tv.getText().toString());al.add("-");
        bS=true;
        tv.setText("");
    }
    public void Mul(View view) {
        val1=Double.parseDouble(tv.getText().toString());al.add("*");
      bm=true;tv.setText("");
    }
    public void Eq(View view) {
val2=Double.parseDouble(tv.getText().toString());
        al.add("=");
        if(bs==true)
           val3=val1+val2;
        if(bS==true)
            val3=val1-val2;
        if(bm==true)
            val3=val1*val2;
        if(bd==true)
            val3=val1/val2;

        tv.setText(""+val3);
        al.add(val3+"");

    }

    public void clickedC(View view) {
        tv.setText("");
    }



    public void clicked7(View view) { tv.setText(tv.getText() + "7");
    }

    public void history(View view) {
        tv.setText("");
        for(i=0;i<al.size();i++){

    s="";
    s=s+al.get(i);
            tv.append(s);
            if(i%5==4)
                tv.append("\n");

}
        }
    }


