package com.santaelf1.interfaces;

import com.santaelf1.items.ItemCat;

import java.util.ArrayList;

public interface CategoryListener {
    void onStart();
    void onEnd(String success, ArrayList<ItemCat> arrayListCat);
}
