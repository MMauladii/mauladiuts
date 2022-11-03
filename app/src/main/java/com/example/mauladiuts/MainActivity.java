package com.example.mauladiuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNamaLengkap;
    EditText etNomorPendaftaran;
    Button btndaftar;
    CheckBox cbkonfirmasi;
    Spinner sppendaftaran;

    String NomorPendaftaran, NamaLengkap, konfirmasi, pendaftaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNomorPendaftaran = findViewById(R.id.et_NomorPendaftaran);
        etNamaLengkap = findViewById(R.id.et_NamaLengkap);
        btndaftar = findViewById(R.id.btn_daftar);
        cbkonfirmasi = findViewById(R.id.cb_Konfirmasi_dasar);
        sppendaftaran = findViewById(R.id.sp_Pendaftaran);

        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NamaLengkap = etNamaLengkap.getText().toString();
                NomorPendaftaran = etNomorPendaftaran.getText().toString();
                konfirmasi = cbkonfirmasi.getText().toString();
                pendaftaran = String.valueOf(sppendaftaran.getSelectedItem());

                if (NamaLengkap.trim().equals("")) {
                    etNamaLengkap.setError("Nama Harus Diisi");
                }

                else if (NomorPendaftaran.trim().equals("")){
                    etNomorPendaftaran.setError("Nomor Pendaftaran Harus Diisi");
                }
                else if (!cbkonfirmasi.isChecked()){
                    Toast.makeText(MainActivity.this, "centang dulu dek!!!!", Toast.LENGTH_SHORT).show();
                }
                else if (pendaftaran.equalsIgnoreCase("Jalur Pendaftaran")){
                    Toast.makeText(MainActivity.this, "Pilih Dulu Dek!!!", Toast.LENGTH_SHORT).show();
                }
                else{
                   Intent daftar = new Intent(MainActivity.this,SecondMainActivity.class);
                   daftar.putExtra("xnama", NamaLengkap);
                   daftar.putExtra("xnomor", NomorPendaftaran);
                   daftar.putExtra("xconfirm",konfirmasi);
                   daftar.putExtra("xpendaftaran", pendaftaran);
                   startActivity(daftar);
                }
            }
        });

    }
}