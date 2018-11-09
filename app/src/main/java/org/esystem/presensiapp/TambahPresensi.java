package org.esystem.presensiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.esystem.presensiapp.model.DataPresensi;
import org.esystem.presensiapp.model.ItemPresensi;

public class TambahPresensi extends AppCompatActivity {

    private EditText editNama;
    private EditText editNim;
    private EditText editJurusan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_presensi);

        //inisiasi variabel dengan view yang dibuat
        editNama = findViewById(R.id.edit_nama);
        editNim = findViewById(R.id.edit_nim);
        editJurusan = findViewById(R.id.edit_jurusan);
    }

    //untuk menerima perintah click dari buttn
    public void onTambahClick(View view){
        String nama, nim, jurusan;

        //mendapatkan data dari view
        nama = editNama.getText().toString();
        nim = editNim.getText().toString();
        jurusan = editJurusan.getText().toString();

        //membuat sebuah item presensi baru dari data yang didapat
        ItemPresensi itemPresensi = new ItemPresensi(nama, nim, jurusan);

        //menambahkan item presensi ke list presensi
        DataPresensi.listPresensi.add(itemPresensi);
    }


}
