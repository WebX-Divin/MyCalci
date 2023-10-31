package com.example.mycalci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bsin, blog, bln, bl, br, b1, b2, b3, b4, b5, b6, b7, b8, b9, bcos, btan, bac, bc, bx, bd, bm, bs, broot, ba, bxpow, bn, bz, bdot, be, bxf;
    String n = "3.14159263";
    TextView tvsec, tvmain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Buttons - Widgets layout
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        bsin = findViewById(R.id.bsin);
        blog = findViewById(R.id.blog);
        bln = findViewById(R.id.bln);
        bl = findViewById(R.id.bl);
        br = findViewById(R.id.br);
        bcos = findViewById(R.id.bcos);
        btan = findViewById(R.id.btan);
        bac = findViewById(R.id.bac);
        bc = findViewById(R.id.bc);
        bx = findViewById(R.id.bx);
        bd = findViewById(R.id.bd);
        bm = findViewById(R.id.bm);
        bs = findViewById(R.id.bs);
        broot = findViewById(R.id.broot);
        ba = findViewById(R.id.ba);
        bxpow = findViewById(R.id.bxpow);
        bn = findViewById(R.id.bn);
        bz = findViewById(R.id.bz);
        bdot = findViewById(R.id.bdot);
        be = findViewById(R.id.be);
        bxf = findViewById(R.id.bxf);

        //TextView - Widgets layout
        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);

        //On-Click Event listeners
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "9");
            }
        });
        bz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "0");
            }
        });
        bsin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "sin");
            }
        });
        bcos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "cos");
            }
        });
        btan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "tan");
            }
        });
        blog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "log");
            }
        });
        bln.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "ln");
            }
        });
        bl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "(");
            }
        });
        br.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText() + ")");
            }
        });
        bac.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText("");
                tvsec.setText("");
            }
        });
        bc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText("");
            }
        });
        bx.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                tvmain.setText(tvmain.getText() + "1/x");
            }
        });
        bd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "/");
            }
        });
        bm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "*");
            }
        });
        bs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "-");
            }
        });
        ba.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "+");
            }
        });
        broot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "√");
            }
        });
        bxpow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(tvmain.getText().toString());
                double square = d*d;
                tvmain.setText(String.valueOf(square));
                tvsec.setText(d+"²");
            }
        });
        bxf.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(tvmain.getText().toString());
                int fact = factorial(val);
                tvmain.setText(String.valueOf(fact));
                tvsec.setText(val + "!");
            }
        });
        bn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "n");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + ".");
            }
        });
        be.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                double result = eval(val);
                tvmain.setText(String.valueOf(result));
                tvsec.setText(val);
            }
        });
    }

    private double eval(String str) {
        return new Object(){
            int pos = -1, ch;

            void nextChar(){
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat){
                while(ch == ' ')nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }
            double parse(){
                nextChar();
                double x = parseExpression();
                if(pos < str.length()) throw new RuntimeException("Unexpected:" + (char) ch);
                return x;
            }
            double parseExpression(){
                double x = parseTerm();
                for (; ;){
                    if(eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }
            double parseTerm(){
                double x = parseFactor();
                for (;;){
                    if(eat('*')) x *= parseFactor();
                    else if(eat('/')) x /= parseFactor();
                    else return x;
                }
            }
            double parseFactor(){
                if (eat('+')) return parseFactor();
                if (eat('-')) return parseFactor();

                double x;
                int startPos = this.pos;
                if(eat('(')){
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.'){
                    while ((ch >= '0' && ch <= '9') || ch == '.')nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if(ch >= 'a' && ch <= 'z'){
                    while(ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if(func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if(func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if(func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if(func.equals("log")) x = Math.log10(x);
                    else if(func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function:" + func);
                }   else {
                    throw new RuntimeException("Unexpected:" + (char) ch);
                }
                if (eat('^')) x = Math.pow(x, parseFactor());
                return x;
            }
        }.parse();
    }

    private int factorial(int val) {
        return (val == 1 || val == 0) ? 1:val*factorial(val -1 );
    }
}