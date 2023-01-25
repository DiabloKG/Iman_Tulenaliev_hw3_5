package com.example.iman_tulenaliev_hw3_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.iman_tulenaliev_hw3_5.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClick{

    ActivityMainBinding binding;
    BasketballAdapter adapter;
    ArrayList<BasketballClub> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        fillList();
        setAdapter();
    }

    private void fillList() {
        arrayList = new ArrayList();
        arrayList.add(new BasketballClub("Голден Стэйт Уорриорз 2014-15", R.drawable.golden, getString(R.string.golden_description)));
        arrayList.add(new BasketballClub("Бостон Селтикс 1985-86", R.drawable.boston_85_86, getString(R.string.boston_85_86_description)));
        arrayList.add(new BasketballClub("Чикаго Буллз 1991-92", R.drawable.chikago_91_92, getString(R.string.chikago_91_92_description)));
        arrayList.add(new BasketballClub("Лос-Анджелес Лэйкерс 1990-00", R.drawable.los_angeles_90_00, getString(R.string.los_angeles_lakers_90_00_description)));
        arrayList.add(new BasketballClub("Даллас Маверикс 2006-07", R.drawable.dallas_2006_2007, getString(R.string.dallas_2006_2007)));
        arrayList.add(new BasketballClub("Бостон Селтикс 1972-73", R.drawable.boston_72_73, getString(R.string.boston_72_73)));
        arrayList.add(new BasketballClub("Филадельфия Севенти Сиксерс 1966-67", R.drawable.filadelphia, getString(R.string.filadelphia)));
        arrayList.add(new BasketballClub("Лос-Анджелес Лэйкерс 1971-72", R.drawable.los_angeles_71_72, getString(R.string.los_angeles_71_72_description)));
        arrayList.add(new BasketballClub("Чикаго Буллз 1996-97", R.drawable.chikago_96_97, getString(R.string.chikago_96_97)));
        arrayList.add(new BasketballClub("Чикаго Буллз 1995-96", R.drawable.chikago_95_96, getString(R.string.chikago_95_96_description)));
    }

    private void setAdapter() {
        adapter = new BasketballAdapter(arrayList, this);
        binding.recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(BasketballClub basketballClub) {
        Intent intent = new Intent(MainActivity.this, DetailContainerActivity.class);
        intent.putExtra("basketball", basketballClub);
        startActivity(intent);
    }
}