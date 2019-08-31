package com.pwpb.kalkulatorkompleks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button mAC, m1, m2, m3, m4, m5, m6, m7, m8, m9, m0, mHasil, mTambah, mKurang, mKali, mBagi, mDot;
    EditText edt;
    String nomor = "";
    int pilih = 0;
    Double nomorAwal = 0.0;

    private void initUI() {
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
        mDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomor+=".";
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
                if (pilih == 1){
                    Double hasil = nomorAwal - Double.parseDouble(edt.getText().toString());
                    edt.setText(hasil.toString());
                    nomor = "";
                } else if (pilih == 2){
                    Double hasil = nomorAwal + Double.parseDouble(edt.getText().toString());
                    edt.setText(hasil.toString());
                    nomor = "";
                } else if (pilih == 3){
                    Double hasil = nomorAwal / Double.parseDouble(edt.getText().toString());
                    edt.setText(hasil.toString());
                    nomor = "";
                } else if (pilih == 4){
                    Double hasil = nomorAwal * Double.parseDouble(edt.getText().toString());
                    edt.setText(hasil.toString());
                    nomor = "";
                }
            }
        });
        mKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomorAwal = Double.parseDouble(edt.getText().toString());
                pilih = 1;
                edt.setText(" - ");
            }
        });
        mTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomorAwal = Double.parseDouble(edt.getText().toString());
                pilih = 2;
                nomor = "";
                edt.setText(" + ");
            }
        });
        mBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomorAwal = Double.parseDouble(edt.getText().toString());
                pilih = 3;
                nomor = "";
                edt.setText(" / ");
            }
        });
        mKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomorAwal = Double.parseDouble(edt.getText().toString());
                pilih = 4;
                nomor = "";
                edt.setText(" * ");
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
