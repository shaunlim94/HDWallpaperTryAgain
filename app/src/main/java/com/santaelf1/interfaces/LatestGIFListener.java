package com.santaelf1.interfaces;

import com.santaelf1.items.ItemGIF;

import java.util.ArrayList;

public interface LatestGIFListener {
    void onStart();
    void onEnd(String success, ArrayList<ItemGIF> arrayListCat);
}