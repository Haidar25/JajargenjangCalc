package com.example.haidar_1202164150_si4006_pab_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtViewAlas,txtViewTinggi;
    private Button btn_cek;
    private TextView txtViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtViewAlas = (EditText) findViewById(R.id.input_alas);
        txtViewTinggi = (EditText) findViewById(R.id.input_tinggi);
        btn_cek = (Button) findViewById(R.id.button_cek);
        txtViewHasil = (TextView) findViewById(R.id.hasil);

        btn_cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input_alas,input_tinggi;
                input_alas=txtViewAlas.getText().toString();
                input_tinggi=txtViewTinggi.getText().toString();

                if (TextUtils.isEmpty(input_alas)){
                    txtViewAlas.setError("Anda Harus Mengisi Angka Terlebih Dahulu !");
                    txtViewAlas.requestFocus();
                }else if(TextUtils.isEmpty(input_tinggi)){
                    txtViewTinggi.setError("Anda Harus Mengisi Angka Terlebih Dahulu !");
                    txtViewTinggi.requestFocus();
                }else {
                    int alas = Integer.parseInt(input_alas);
                    int tinggi = Integer.parseInt(input_tinggi);
                    int luas = alas*tinggi;

                    txtViewHasil.setText(Integer.toString(luas));
                }
            }
        });

    }
}
