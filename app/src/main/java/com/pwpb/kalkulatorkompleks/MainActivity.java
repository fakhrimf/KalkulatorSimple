package com.pwpb.kalkulatorkompleks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.udojava.evalex.Expression;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button mAC, m1, m2, m3, m4, m5, m6, m7, m8, m9, m0, mHasil, mTambah, mKurang, mKali, mBagi, mDot, mKBuka, mKTutup;
    EditText edt;
    String nomor = "";

    private void initUI() {
        mKBuka = findViewById(R.id.kBuka);
        mKTutup = findViewById(R.id.kTutup);
        mAC = findViewById(R.id.ac);
        mDot = findViewById(R.id.dot);
        m1 = findViewById(R.id.satu);
        m2 = findViewById(R.id.dua);
        m3 = findViewById(R.id.tiga);
        m4 = findViewById(R.id.empat);
        m5 = findViewById(R.id.lima);
        m6 = findViewById(R.id.enam);
        m7 = findViewById(R.id.tujuh);
        m8 = findViewById(R.id.delapan);
        m9 = findViewById(R.id.sembilan);
        m0 = findViewById(R.id.nol);
        mHasil = findViewById(R.id.samadengan);
        mTambah = findViewById(R.id.tambah);
        mKali = findViewById(R.id.kali);
        mKurang = findViewById(R.id.kurang);
        mBagi = findViewById(R.id.bagi);
        edt = findViewById(R.id.edt);
    }

    private void initBtn() {
        mKBuka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomor += "(";
                edt.setText(nomor);
            }
        });
        mKTutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomor += ")";
                edt.setText(nomor);
            }
        });
        mDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomor += ".";
                edt.setText(nomor);
            }
        });
        mAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomor = "";
                edt.setText(nomor);
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomor += "1";
                edt.setText(nomor);
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomor += "2";
                edt.setText(nomor);
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomor += "3";
                edt.setText(nomor);
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomor += "4";
                edt.setText(nomor);
            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomor += "5";
                edt.setText(nomor);
            }
        });
        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomor += "6";
                edt.setText(nomor);
            }
        });
        m7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomor += "7";
                edt.setText(nomor);
            }
        });
        m8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomor += "8";
                edt.setText(nomor);
            }
        });
        m9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomor += "9";
                edt.setText(nomor);
            }
        });
        m0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomor += "0";
                edt.setText(nomor);
            }
        });
        mHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat df = new DecimalFormat("#,###");
                Expression e = new Expression(nomor);
                BigDecimal hasil = e.eval();
                edt.setText(df.format(hasil));
                nomor = "";
            }
        });
        mKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomor += "-";
                edt.setText(nomor);
            }
        });
        mTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomor += "+";
                edt.setText(nomor);
            }
        });
        mBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomor += "/";
                edt.setText(nomor);
            }
        });
        mKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomor += "*";
                edt.setText(nomor);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initBtn();
    }
}
