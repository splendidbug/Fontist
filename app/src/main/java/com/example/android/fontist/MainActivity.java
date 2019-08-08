package com.example.android.fontist;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {



    private TextView confetti;
    private EditText input;
    private ImageButton cpytxt;
    private ClipboardManager myClipboard;
    private ClipData myClip;
    private ImageButton whatsapp;
    private TextView hcircled;
    private TextView hthai;
    private ImageButton cpytxt2;
    private ImageButton share2;
    private ImageButton share3;
    private ImageButton cpytxt3;
    private TextView hparanthesis;
    private ImageButton cpytxt4;
    private ImageButton share4;
    private TextView hcurly;
    private ImageButton cpytxt5;
    private ImageButton share5;
    private TextView hancient;
    private ImageButton cpytxt6;
    private ImageButton share6;
    private TextView hupsidedown;
    private ImageButton cpytxt7;
    private ImageButton share7;
    private TextView hsmallcaps;
    private ImageButton cpytxt8;
    private ImageButton share8;
    private TextView hparanormal;
    private ImageButton cpytxt9;
    private ImageButton share9;
    private TextView hsymbols;
    private ImageButton cpytxt10;
    private ImageButton share10;
    private TextView hspecial;
    private ImageButton cpytxt11;
    private ImageButton share11;
    private TextView hlove;
    private ImageButton cpytxt12;
    private ImageButton share12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myClipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);

        confetti = (TextView) findViewById(R.id.confettti);
        hcircled = (TextView) findViewById(R.id.circlled);
        hthai = (TextView) findViewById(R.id.thai);
        hparanthesis = (TextView) findViewById(R.id.paranthesized);
        hcurly = (TextView) findViewById(R.id.curly);
        hancient = (TextView) findViewById(R.id.ancient);
        hupsidedown = (TextView) findViewById(R.id.upsidedown);
        hsmallcaps = (TextView) findViewById(R.id.smallcaps);
        hparanormal = (TextView) findViewById(R.id.paranormal);
        hsymbols = (TextView) findViewById(R.id.symbols);
        hspecial = (TextView) findViewById(R.id.special);
        hlove = (TextView) findViewById(R.id.love);
        //triangle = (TextView) findViewById(R.id.textView8);
        input = (EditText) findViewById(R.id.entertext);
        whatsapp = (ImageButton) findViewById(R.id.whatsapp);
        share2 = (ImageButton) findViewById(R.id.whatsapp2);
        share3 = (ImageButton) findViewById(R.id.whatsapp3);
        share4 = (ImageButton) findViewById(R.id.whatsapp4);
        share5 = (ImageButton) findViewById(R.id.whatsapp5);
        share6 = (ImageButton) findViewById(R.id.whatsapp6);
        share7 = (ImageButton) findViewById(R.id.whatsapp7);
        share8 = (ImageButton) findViewById(R.id.whatsapp8);
        share9 = (ImageButton) findViewById(R.id.whatsapp9);
        share10 = (ImageButton) findViewById(R.id.whatsapp10);
        share11 = (ImageButton) findViewById(R.id.whatsapp11);
        share12 = (ImageButton) findViewById(R.id.whatsapp12);
        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (input.getText().toString().equals(""))
                    confetti.setText("\u20A1\u1D7E\u20B9\u20B9\u20AC\u20A6\u20A1\u00A5");

                else

                {
                    String st = edd();

                    confetti.setText(st);

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });

        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (input.getText().toString().equals(""))
                    hcircled.setText("\u24B8\u24BE\u24C7\u24B8\u24C1\u24BA\u24B9");

                else

                {
                    String sut = Circled();

                    hcircled.setText(sut);

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });

        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (input.getText().toString().equals(""))
                   hthai.setText("\uFF72\u3093\uFF91\uFF89");

                else

                {
                    String sgt = thai();

                   hthai.setText(sgt);

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });

        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (input.getText().toString().equals(""))
                    hparanthesis.setText("\u24AB\u249C\u24AD\u249C\u24A9\u24AF\u24A3\u24A0\u24AE\u24A4\u24AE");

                else

                {
                    String sgt = paranthesis();

                    hparanthesis.setText(sgt);

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });

        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (input.getText().toString().equals(""))
                    hcurly.setText("\u00A2\u0E22\u0433\u026D\u05E5");

                else

                {
                    String sg67t = Curly();

                    hcurly.setText(sg67t);

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });

        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (input.getText().toString().equals(""))
                    hancient.setText("\u120D\u12AD\u122D\u130E\u127F\u12AD\u1355");

                else

                {
                    String sg67t1 = Ancient();

                    hancient.setText(sg67t1);

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });

        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (input.getText().toString().equals(""))
                    hupsidedown.setText("\u120D\u12AD\u122D\u130E\u127F\u12AD\u1355");

                else

                {
                    String sg67trt1 = Upsidedown();

                    hupsidedown.setText(sg67trt1);

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });

        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (input.getText().toString().equals(""))
                    hsmallcaps.setText("s\u1d0d\u1D00\u029f\u029f\u1D04\u1D00\u1d18s");

                else

                {
                    String sg67trt1e = Smallcaps();

                    hsmallcaps.setText(sg67trt1e);

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });

        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (input.getText().toString().equals(""))
                    hparanormal.setText("p\u03b1r\u03b1norm\u03b1l");

                else

                {
                    String t1er = Paranormal();

                    hparanormal.setText(t1er);

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });

        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (input.getText().toString().equals(""))
                    hsymbols.setText("\u24e2\u263f\u2654\u266d\u2299\u21b3\u24e2");

                else

                {
                    String t1er1 = Symbols();

                    hsymbols.setText(t1er1);

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });

        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (input.getText().toString().equals(""))
                    hspecial.setText("\u1515\u146dE\u1455I\u15e9\u14aa");

                else

                {
                    String t1er12 = Special();

                    hspecial.setText(t1er12);

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });

        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (input.getText().toString().equals(""))
                    hlove.setText("L\u2665O\u2665V\u2665E\u2665");

                else

                {
                    String tw1er12 = Love();

                    hlove.setText(tw1er12);

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });

        cpytxt = (ImageButton) findViewById(R.id.copy);
        cpytxt2 = (ImageButton) findViewById(R.id.copy2);
        cpytxt3 = (ImageButton) findViewById(R.id.copy3);
        cpytxt4 = (ImageButton) findViewById(R.id.copy4);
        cpytxt5 = (ImageButton) findViewById(R.id.copy5);
        cpytxt6 = (ImageButton) findViewById(R.id.copy6);
        cpytxt7 = (ImageButton) findViewById(R.id.copy7);
        cpytxt8 = (ImageButton) findViewById(R.id.copy8);
        cpytxt9 = (ImageButton) findViewById(R.id.copy9);
        cpytxt10 = (ImageButton) findViewById(R.id.copy10);
        cpytxt11 = (ImageButton) findViewById(R.id.copy11);
        cpytxt12 = (ImageButton) findViewById(R.id.copy12);
        cpytxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String qt = edd();

                String text = qt;
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Text Copied",
                        Toast.LENGTH_SHORT).show();

                // Toast.makeText(this, "Copied to clipboard", 1).show();

            }
        });





        cpytxt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String qerqtt = Circled();

                String text = qerqtt;
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Text Copied",
                        Toast.LENGTH_SHORT).show();

                // Toast.makeText(this, "Copied to clipboard", 1).show();

            }
        });

        cpytxt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String qertyqtt = thai();

                String text = qertyqtt;
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Text Copied",
                        Toast.LENGTH_SHORT).show();

                // Toast.makeText(this, "Copied to clipboard", 1).show();

            }
        });

        cpytxt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String qertyqtt1 = paranthesis();

                String text = qertyqtt1;
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Text Copied",
                        Toast.LENGTH_SHORT).show();

                // Toast.makeText(this, "Copied to clipboard", 1).show();

            }
        });

        cpytxt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String qertyqtt13 = Curly();

                String text = qertyqtt13;
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Text Copied",
                        Toast.LENGTH_SHORT).show();

                // Toast.makeText(this, "Copied to clipboard", 1).show();

            }
        });

        cpytxt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String qertyqtt13tr = Ancient();

                String text = qertyqtt13tr;
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Text Copied",
                        Toast.LENGTH_SHORT).show();

                // Toast.makeText(this, "Copied to clipboard", 1).show();

            }
        });

        cpytxt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String qertyqtt13tr12 = Upsidedown();

                String text = qertyqtt13tr12;
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Text Copied",
                        Toast.LENGTH_SHORT).show();

                // Toast.makeText(this, "Copied to clipboard", 1).show();

            }
        });

        cpytxt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String r12e = Smallcaps();

                String text = r12e;
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Text Copied",
                        Toast.LENGTH_SHORT).show();

                // Toast.makeText(this, "Copied to clipboard", 1).show();

            }
        });

        cpytxt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String r12e1 = Paranormal();

                String text = r12e1;
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Text Copied",
                        Toast.LENGTH_SHORT).show();

                // Toast.makeText(this, "Copied to clipboard", 1).show();

            }
        });

        cpytxt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String r12e1w = Symbols();

                String text = r12e1w;
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Text Copied",
                        Toast.LENGTH_SHORT).show();

                // Toast.makeText(this, "Copied to clipboard", 1).show();

            }
        });

        cpytxt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String r12e1w1 = Special();

                String text = r12e1w1;
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Text Copied",
                        Toast.LENGTH_SHORT).show();

                // Toast.makeText(this, "Copied to clipboard", 1).show();

            }
        });

        cpytxt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String rr12e1w11 = Love();

                String text = rr12e1w11;
                myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(getApplicationContext(), "Text Copied",
                        Toast.LENGTH_SHORT).show();

                // Toast.makeText(this, "Copied to clipboard", 1).show();

            }
        });

        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String yt = edd();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("Text/plain");
                String shareBody = yt;
                intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intent, "Share Using"));


            }
        });

        share2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eyt = Circled();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("Text/plain");
                String shareBody = eyt;

                intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intent, "Share Using"));
                intent.setPackage("com.whatsapp");

            }
        });

        share3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String eyret = thai();
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("Text/plain");
                    String shareBody = eyret;
                    intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                    startActivity(Intent.createChooser(intent, "Share Using"));


            }
        });

        share4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eyret1 = paranthesis();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("Text/plain");
                String shareBody = eyret1;
                intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intent, "Share Using"));


            }
        });

        share5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eyret12 = Curly();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("Text/plain");
                String shareBody = eyret12;
                intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intent, "Share Using"));


            }
        });

        share6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eyret12tr = Ancient();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("Text/plain");
                String shareBody = eyret12tr;
                intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intent, "Share Using"));


            }
        });

        share7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eyret12tr12 = Upsidedown();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("Text/plain");
                String shareBody = eyret12tr12;
                intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intent, "Share Using"));


            }
        });

        share8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eyret12tr12e = Smallcaps();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("Text/plain");
                String shareBody = eyret12tr12e;
                intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intent, "Share Using"));


            }
        });

        share9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p12e1 = Paranormal();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("Text/plain");
                String shareBody = p12e1;
                intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intent, "Share Using"));


            }
        });

        share10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p12e12 = Symbols();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("Text/plain");
                String shareBody = p12e12;
                intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intent, "Share Using"));


            }
        });

        share11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p12e121 = Special();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("Text/plain");
                String shareBody = p12e121;
                intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intent, "Share Using"));


            }
        });

        share12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p112e121 = Love();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("Text/plain");
                String shareBody = p112e121;
                intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intent, "Share Using"));


            }
        });
    }

    private String edd() {
        String y = input.getText().toString();
        int n = y.length();
        y = y.toLowerCase();
        char[] a = y.toCharArray();
        for (int i = 0; i < n; i++) {
            switch (a[i]) {
                case 'a':
                    a[i] = '\u20B3';
                    break;
                case 'b':
                    a[i] = '\u0243';
                    break;
                case 'c':
                    a[i] = '\u20A1';
                    break;
                case 'e':
                    a[i] = '\u20AC';
                    break;
                case 'f':
                    a[i] = '\u20A3';
                    break;
                case 'g':
                    a[i] = '\u20B2';
                    break;
                case 'h':
                    a[i] = '\u0126';
                    break;
                case 'i':
                    a[i] = '\u1D7B';
                    break;
                case 'j':
                    a[i] = '\u0248';
                    break;
                case 'k':
                    a[i] = '\u20AD';
                    break;
                case 'l':
                    a[i] = '\u20AD';
                    break;
                case 'm':
                    a[i] = '\u20A5';
                    break;
                case 'n':
                    a[i] = '\u20A6';
                    break;
                case 'o':
                    a[i] = '\u00D8';
                    break;
                case 'p':
                    a[i] = '\u20B1';
                    break;
                case 'q':
                    a[i] = '\u0051';
                    break;
                case 'r':
                    a[i] = '\u20B9';
                    break;
                case 's':
                    a[i] = '\u20B7';
                    break;
                case 't':
                    a[i] = '\u20B8';
                    break;
                case 'u':
                    a[i] = '\u1D7E';
                    break;
                case 'v':
                    a[i] = 'V';
                    break;
                case 'w':
                    a[i] = '\u20A9';
                    break;
                case 'x':
                    a[i] = '\u04FE';
                    break;
                case 'y':
                    a[i] = '\u00A5';
                    break;
                case 'z':
                    a[i] = '\u01B5';
                    break;
                case 'd':
                    a[i] = '\u0110';
                    break;
            }
        }
        String rt = String.valueOf(a);
        return rt;
    }

    private String Circled() {

        String yr = input.getText().toString();
        int n = yr.length();
        yr = yr.toLowerCase();
        char[] b = yr.toCharArray();
        for (int i = 0; i < n; i++) {
            switch (b[i]) {
                case 'a':
                    b[i] = '\u24B6';
                    break;
                case 'b':
                    b[i] = '\u24B7';
                    break;
                case 'c':
                    b[i] = '\u24B8';
                    break;
                case 'd':
                    b[i] = '\u24B9';
                    break;
                case 'e':
                    b[i] = '\u24BA';
                    break;
                case 'f':
                   b[i] = '\u24BB';
                    break;
                case 'g':
                    b[i] = '\u24BC';
                    break;
                case 'h':
                    b[i] = '\u24BD';
                    break;
                case 'i':
                   b[i] = '\u24BE';
                    break;
                case 'j':
                   b[i] = '\u24BF';
                    break;
                case 'k':
                   b[i] = '\u24C0';
                    break;
                case 'l':
                   b[i] = '\u24C1';
                    break;
                case 'm':
                   b[i] = '\u24C2';
                    break;
                case 'n':
                  b[i] = '\u24C3';
                    break;
                case 'o':
                    b[i] = '\u24C4';
                    break;
                case 'p':
                    b[i] = '\u24C5';
                    break;
                case 'q':
                   b[i] = '\u24C6';
                    break;
                case 'r':
                   b[i] = '\u24C7';
                    break;
                case 's':
                   b[i] = '\u24C8';
                    break;
                case 't':
                   b[i] = '\u24C9';
                    break;
                case 'u':
                    b[i] = '\u24CA';
                    break;
                case 'v':
                   b[i] = '\u24CB';
                    break;
                case 'w':
                   b[i] = '\u24CC';
                    break;
                case 'x':
                    b[i] = '\u24CD';
                    break;
                case 'y':
                    b[i] = '\u24CE';
                    break;
                case 'z':
                   b[i] = '\u24CF';
                    break;

            }
        }
        String rtt = String.valueOf(b);
        return rtt;
    }


    private String thai(){
        String ytr = input.getText().toString();
        int n = ytr.length();
        ytr = ytr.toLowerCase();
        char[] c = ytr.toCharArray();
        for (int i = 0; i < n; i++) {
            switch (c[i]) {
                case 'a':
                    c[i] = '\uFF91';
                    break;
                case 'b':
                    c[i] = '\u4E43';
                    break;
                case 'c':
                    c[i] = 'c';
                    break;
                case 'd':
                    c[i] = 'd';
                    break;
                case 'e':
                    c[i] = '\u4E47';
                    break;
                case 'f':
                    c[i] = '\uFF77';
                    break;
                case 'g':
                    c[i] = 'g';
                    break;
                case 'h':
                   c[i] = '\u3093';
                    break;
                case 'i':
                    c[i] = '\uFF89';
                    break;
                case 'j':
                    c[i] = '\uFF8C';
                    break;
                case 'k':
                   c[i] = '\u30BA';
                    break;
                case 'l':
                    c[i] = '\uFF9A';
                    break;
                case 'm':
                    c[i] = '\uFFB6';
                    break;
                case 'n':
                    c[i] = '\u5200';
                    break;
                case 'o':
                    c[i] = 'o';
                    break;
                case 'p':
                    c[i] = '\uFF71';
                    break;
                case 'q':
                    c[i] = 'q';
                    break;
                case 'r':
                    c[i] = '\u5C3A';
                    break;
                case 's':
                    c[i] = '\u4E02';
                    break;
                case 't':
                    c[i] = '\uFF72';
                    break;
                case 'u':
                    c[i] = 'u';
                    break;
                case 'v':
                    c[i] = '\u221A';
                    break;
                case 'w':
                    c[i] = 'w';
                    break;
                case 'x':
                    c[i] = '\uFF92';
                    break;
                case 'y':
                    c[i] = '\uFF98';
                    break;
                case 'z':
                    c[i] = '\u4E59';
                    break;

            }
        }
        String rrtt = String.valueOf(c);
        return rrtt;
    }
    private String paranthesis() {
        String ytr = input.getText().toString();
        int n = ytr.length();
        ytr = ytr.toLowerCase();
        char[] d = ytr.toCharArray();
        for (int i = 0; i < n; i++) {
            switch (d[i]) {
                case 'a':
                    d[i] = '\u249C';
                    break;
                case 'b':
                   d[i] = '\u249D';
                    break;
                case 'c':
                   d[i] = '\u249E';
                    break;
                case 'd':
                    d[i] = '\u249F';
                    break;
                case 'e':
                    d[i] = '\u24A0';
                    break;
                case 'f':
                    d[i] = '\u24A1';
                    break;
                case 'g':
                    d[i] = '\u24A2';
                    break;
                case 'h':
                    d[i] = '\u24A3';
                    break;
                case 'i':
                    d[i] = '\u24A4';
                    break;
                case 'j':
                    d[i] = '\u24A5';
                    break;
                case 'k':
                    d[i] = '\u24A6';
                    break;
                case 'l':
                    d[i] = '\u24A7';
                    break;
                case 'm':
                    d[i] = '\u24A8';
                    break;
                case 'n':
                    d[i] = '\u24A9';
                    break;
                case 'o':
                    d[i] = '\u24AA';
                    break;
                case 'p':
                    d[i] = '\u24AB';
                    break;
                case 'q':
                    d[i] = '\u24AC';
                    break;
                case 'r':
                    d[i] = '\u24AD';
                    break;
                case 's':
                    d[i] = '\u24AE';
                    break;
                case 't':
                   d[i] = '\u24AF';
                    break;
                case 'u':
                    d[i] = '\u24B0';
                    break;
                case 'v':
                   d[i] = '\u24B1';
                    break;
                case 'w':
                    d[i] = '\u24B2';
                    break;
                case 'x':
                    d[i] = '\u24B3';
                    break;
                case 'y':
                    d[i] = '\u24B4';
                    break;
                case 'z':
                    d[i] = '\u24B5';
                    break;

            }
        }
        String rrtt3 = String.valueOf(d);
        return rrtt3;
    }

    private String Curly() {
        String ytr65 = input.getText().toString();
        int n = ytr65.length();
        ytr65 = ytr65.toLowerCase();
        char[] e = ytr65.toCharArray();
        for (int i = 0; i < n; i++) {
            switch (e[i]) {
                case 'a':
                    e[i] = '\u0E04';
                    break;
                case 'b':
                   e[i] = '\u0E56';
                    break;
                case 'c':
                    e[i] = '\u00A2';
                    break;
                case 'd':
                   e[i] = '\u0ED3';
                    break;
                case 'e':
                    e[i] = '\u0113';
                    break;
                case 'f':
                    e[i] = '\u0066';
                    break;
                case 'g':
                    e[i] = '\u0E87';
                    break;
                case 'h':
                    e[i] = '\u0068';
                    break;
                case 'i':
                   e[i] = '\u0069';
                    break;
                case 'j':
                    e[i] = '\u0E27';
                    break;
                case 'k':
                    e[i] = '\u04C4';
                    break;
                case 'l':
                    e[i] = '\u026D';
                    break;
                case 'm':
                    e[i] = '\u0E53';
                    break;
                case 'n':
                    e[i] = '\u0E20';
                    break;
                case 'o':
                    e[i] = '\u0E4F';
                    break;
                case 'p':
                   e[i] = '\u05E7';
                    break;
                case 'q':
                    e[i] = '\u1EE3';
                    break;
                case 'r':
                    e[i] = '\u0433';
                    break;
                case 's':
                    e[i] = '\u0E23';
                    break;
                case 't':
                    e[i] = '\u0547';
                    break;
                case 'u':
                    e[i] = '\u0E22';
                    break;
                case 'v':
                    e[i] = '\u05E9';
                    break;
                case 'w':
                    e[i] = '\u0E2C';
                    break;
                case 'x':
                    e[i] = '\u05D0';
                    break;
                case 'y':
                    e[i] = '\u05E5';
                    break;
                case 'z':
                    e[i] = '\u0291';
                    break;

            }
        }
        String rrtt45 = String.valueOf(e);
        return rrtt45;
    }

    private String Ancient() {
        String ytr65re = input.getText().toString();
        int n = ytr65re.length();
        ytr65re = ytr65re.toLowerCase();
        char[] f = ytr65re.toCharArray();
        for (int i = 0; i < n; i++) {
            switch (f[i]) {
                case 'a':
                    f [i] = '\u120D';
                    break;
                case 'b':
                    f[i] = '\u130C';
                    break;
                case 'c':
                    f[i] = '\u122D';
                    break;
                case 'd':
                    f[i] = '\u12D5';
                    break;
                case 'e':
                    f[i] = '\u127F';
                    break;
                case 'f':
                    f[i] = '\u127B';
                    break;
                case 'g':
                    f[i] = '\u1297';
                    break;
                case 'h':
                    f[i] = '\u12D8';
                    break;
                case 'i':
                    f[i] = '\u130E';
                    break;
                case 'j':
                    f[i] = '\u130B';
                    break;
                case 'k':
                    f[i] = '\u1315';
                    break;
                case 'l':
                    f[i] = '\u1228';
                    break;
                case 'm':
                    f[i] = '\u1320';
                    break;
                case 'n':
                    f[i] = '\u12AD';
                    break;
                case 'o':
                    f[i] = '\u12D0';
                    break;
                case 'p':
                    f[i] = '\u12E8';
                    break;
                case 'q':
                    f[i] = '\u12D2';
                    break;
                case 'r':
                    f[i] = '\u12EA';
                    break;
                case 's':
                    f[i] = '\u1290';
                    break;
                case 't':
                    f[i] = '\u1355';
                    break;
                case 'u':
                    f[i] = '\u1201';
                    break;
                case 'v':
                    f[i] = '\u1200';
                    break;
                case 'w':
                    f[i] = '\u1220';
                    break;
                case 'x':
                    f[i] = '\u1238';
                    break;
                case 'y':
                    f[i] = '\u1203';
                    break;
                case 'z':
                    f[i] = '\u130A';
                    break;

            }
        }
        String rrtt45re = String.valueOf(f);
        return rrtt45re;
    }

       private String Upsidedown() {
        String ytr65re = input.getText().toString();
        int n = ytr65re.length();
        ytr65re = ytr65re.toLowerCase();
        char[] g = ytr65re.toCharArray();
        for (int i = 0; i < n; i++) {
            switch (g[i]) {
                case 'a':
                    g [i] = '\u0250';
                    break;
                case 'b':
                    g[i] = '\u0071';
                    break;
                case 'c':
                    g[i] = '\u0254';
                    break;
                case 'd':
                    g[i] = '\u0070';
                    break;
                case 'e':
                    g[i] = 'e';
                    break;
                case 'f':
                    g[i] = '\u025F';
                    break;
                case 'g':
                    g[i] = '\u0183';
                    break;
                case 'h':
                    g[i] = '\u0265';
                    break;
                case 'i':
                    g[i] = '\u0131';
                    break;
                case 'j':
                    g[i] = '\u027E';
                    break;
                case 'k':
                    g[i] = '\u029E';
                    break;
                case 'l':
                    g[i] = '\u006C';
                    break;
                case 'm':
                    g[i] = '\u026F';
                    break;
                case 'n':
                    g[i] = '\u0075';
                    break;
                case 'o':
                    g[i] = '\u006F';
                    break;
                case 'p':
                    g[i] = '\u0064';
                    break;
                case 'q':
                    g[i] = '\u0062';
                    break;
                case 'r':
                    g[i] = '\u0279';
                    break;
                case 's':
                    g[i] = '\u0073';
                    break;
                case 't':
                    g[i] = '\u0287';
                    break;
                case 'u':
                    g[i] = '\u006E';
                    break;
                case 'v':
                    g[i] = '\u028C';
                    break;
                case 'w':
                    g[i] = '\u028D';
                    break;
                case 'x':
                    g[i] = '\u0078';
                    break;
                case 'y':
                    g[i] = '\u028E';
                    break;
                case 'z':
                    g[i] = '\u007A';
                    break;

            }
        }
        String e45re = String.valueOf(g);
        return e45re;
    }

    private String Smallcaps() {
        String ytr65re12e = input.getText().toString();
        int n = ytr65re12e.length();
        ytr65re12e = ytr65re12e.toLowerCase();
        char[] g = ytr65re12e.toCharArray();
        for (int i = 0; i < n; i++) {
            switch (g[i]) {
                case 'a':
                    g [i] = '\u1D00';
                    break;
                case 'b':
                    g[i] = '\u0299';
                    break;
                case 'c':
                    g[i] = '\u1D04';
                    break;
                case 'd':
                    g[i] = '\u1D05';
                    break;
                case 'e':
                    g[i] = '\u1d07';
                    break;
                case 'f':
                    g[i] = '\u0493';
                    break;
                case 'g':
                    g[i] = '\u0262';
                    break;
                case 'h':
                    g[i] = '\u029c';
                    break;
                case 'i':
                    g[i] = '\u026a';
                    break;
                case 'j':
                    g[i] = '\u1d0a';
                    break;
                case 'k':
                    g[i] = '\u1d0b';
                    break;
                case 'l':
                    g[i] = '\u029f';
                    break;
                case 'm':
                    g[i] = '\u1d0d';
                    break;
                case 'n':
                    g[i] = '\u0274';
                    break;
                case 'o':
                    g[i] = '\u1d0f';
                    break;
                case 'p':
                    g[i] = '\u1d18';
                    break;
                case 'q':
                    g[i] = '\u01eb';
                    break;
                case 'r':
                    g[i] = '\u0280';
                    break;
                case 's':
                    g[i] = 's';
                    break;
                case 't':
                    g[i] = '\u1d1b';
                    break;
                case 'u':
                    g[i] = '\u1d1c';
                    break;
                case 'v':
                    g[i] = '\u1d20';
                    break;
                case 'w':
                    g[i] = '\u1d21';
                    break;
                case 'x':
                    g[i] = 'x';
                    break;
                case 'y':
                    g[i] = '\u028f';
                    break;
                case 'z':
                    g[i] = '\u1d22';
                    break;

            }
        }
        String e45re1 = String.valueOf(g);
        return e45re1;
    }

    private String Paranormal() {
        String ytr65re12e = input.getText().toString();
        int n = ytr65re12e.length();
        ytr65re12e = ytr65re12e.toLowerCase();
        char[] g = ytr65re12e.toCharArray();
        for (int i = 0; i < n; i++) {
            switch (g[i]) {
                case 'a':
                    g [i] = '\u03b1';
                    break;
                case 'b':
                    g[i] = '\u0432';
                    break;
                case 'c':
                    g[i] = 'c';
                    break;
                case 'd':
                    g[i] = 'd';
                    break;
                case 'e':
                    g[i] = '\u0454';
                    break;
                case 'f':
                    g[i] = 'f';
                    break;
                case 'g':
                    g[i] = 'g';
                    break;
                case 'h':
                    g[i] = 'h';
                    break;
                case 'i':
                    g[i] = '\u00ed';
                    break;
                case 'j':
                    g[i] = 'j';
                    break;
                case 'k':
                    g[i] = 'k';
                    break;
                case 'l':
                    g[i] = 'l';
                    break;
                case 'm':
                    g[i] = 'm';
                    break;
                case 'n':
                    g[i] = 'n';
                    break;
                case 'o':
                    g[i] = '\u03c3';
                    break;
                case 'p':
                    g[i] = 'p';
                    break;
                case 'q':
                    g[i] = 'q';
                    break;
                case 'r':
                    g[i] = 'r';
                    break;
                case 's':
                    g[i] = 's';
                    break;
                case 't':
                    g[i] = 't';
                    break;
                case 'u':
                    g[i] = 'u';
                    break;
                case 'v':
                    g[i] = 'v';
                    break;
                case 'w':
                    g[i] = 'w';
                    break;
                case 'x':
                    g[i] = '\u0445';
                    break;
                case 'y':
                    g[i] = '\u0447';
                    break;
                case 'z':
                    g[i] = 'z';
                    break;

            }
        }
        String e45re12 = String.valueOf(g);
        return e45re12;
    }

    private String Symbols() {
        String ytr65re12e = input.getText().toString();
        int n = ytr65re12e.length();
        ytr65re12e = ytr65re12e.toLowerCase();
        char[] g = ytr65re12e.toCharArray();
        for (int i = 0; i < n; i++) {
            switch (g[i]) {
                case 'a':
                    g [i] = '\ua34f';
                    break;
                case 'b':
                    g[i] = '\u266d';
                    break;
                case 'c':
                    g[i] = '\u263e';
                    break;
                case 'd':
                    g[i] = '\u25d7';
                    break;
                case 'e':
                    g[i] = '\u20ac';
                    break;
                case 'f':
                    g[i] = '\u03dc';
                    break;
                case 'g':
                    g[i] = '\u2761';
                    break;
                case 'h':
                    g[i] = '\u2644';
                    break;
                case 'i':
                    g[i] = '\u2657';
                    break;
                case 'j':
                    g[i] = '\u266a';
                    break;
                case 'k':
                    g[i] = '\u03f0';
                    break;
                case 'l':
                    g[i] = '\u21b3';
                    break;
                case 'm':
                    g[i] = '\u2654';
                    break;
                case 'n':
                    g[i] = '\u266b';
                    break;
                case 'o':
                    g[i] = '\u2299';
                    break;
                case 'p':
                    g[i] = '\u03c1';
                    break;
                case 'q':
                    g[i] = '\u262d';
                    break;
                case 'r':
                    g[i] = '\u2608';
                    break;
                case 's':
                    g[i] = '\u24e2';
                    break;
                case 't':
                    g[i] = '\u2602';
                    break;
                case 'u':
                    g[i] = '\u260b';
                    break;
                case 'v':
                    g[i] = '\u2713';
                    break;
                case 'w':
                    g[i] = '\u03c9';
                    break;
                case 'x':
                    g[i] = '\u2318';
                    break;
                case 'y':
                    g[i] = '\u263f';
                    break;
                case 'z':
                    g[i] = '\u2621';
                    break;

            }
        }
        String e45re12 = String.valueOf(g);
        return e45re12;
    }

    private String Special() {
        String ytr65re12e = input.getText().toString();
        int n = ytr65re12e.length();
        ytr65re12e = ytr65re12e.toLowerCase();
        char[] g = ytr65re12e.toCharArray();
        for (int i = 0; i < n; i++) {
            switch (g[i]) {
                case 'a':
                    g [i] = '\u15e9';
                    break;
                case 'b':
                    g[i] = '\u15f7';
                    break;
                case 'c':
                    g[i] = '\u1455';
                    break;
                case 'd':
                    g[i] = '\u15ea';
                    break;
                case 'e':
                    g[i] = 'E';
                    break;
                case 'f':
                    g[i] = '\u15b4';
                    break;
                case 'g':
                    g[i] = 'G';
                    break;
                case 'h':
                    g[i] = '\u157c';
                    break;
                case 'i':
                    g[i] = 'I';
                    break;
                case 'j':
                    g[i] = '\u148d';
                    break;
                case 'k':
                    g[i] = 'K';
                    break;
                case 'l':
                    g[i] = '\u14aa';
                    break;
                case 'm':
                    g[i] = '\u15f0';
                    break;
                case 'n':
                    g[i] = '\u144e';
                    break;
                case 'o':
                    g[i] = 'O';
                    break;
                case 'p':
                    g[i] = '\u146d';
                    break;
                case 'q':
                    g[i] = '\u146b';
                    break;
                case 'r':
                    g[i] = '\u1587';
                    break;
                case 's':
                    g[i] = '\u1515';
                    break;
                case 't':
                    g[i] = 'T';
                    break;
                case 'u':
                    g[i] = '\u144c';
                    break;
                case 'v':
                    g[i] = '\u142f';
                    break;
                case 'w':
                    g[i] = '\u15ef';
                    break;
                case 'x':
                    g[i] = '\u166d';
                    break;
                case 'y':
                    g[i] = 'Y';
                    break;
                case 'z':
                    g[i] = '\u1614';
                    break;

            }
        }
        String e45re12 = String.valueOf(g);
        return e45re12;
    }

    private String Love() {
        String l = input.getText().toString();
        int n = l.length();
        l = l.toUpperCase();
        StringBuilder str = new StringBuilder(l);
        for (int i = 1; i < n+1; i++) {
            str.insert(2*i - 1, '\u2665');
            }
        return str.toString();

}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.refresh:
                Toast.makeText(this, "Input Refreshed", Toast.LENGTH_SHORT).show();
                input.setText("");
        }
        return super.onOptionsItemSelected(item);
    }
}






















