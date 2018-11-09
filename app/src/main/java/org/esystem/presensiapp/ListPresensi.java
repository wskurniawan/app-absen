package org.esystem.presensiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.esystem.presensiapp.adapter.PresensiAdapter;
import org.esystem.presensiapp.model.DataPresensi;

public class ListPresensi extends AppCompatActivity {

    RecyclerView listPresensi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_presensi);

        listPresensi = findViewById(R.id.list_presensi);

        PresensiAdapter adapter = new PresensiAdapter(DataPresensi.listPresensi);

        listPresensi.setAdapter(adapter);
        listPresensi.setLayoutManager(new LinearLayoutManager(this));
    }


}
