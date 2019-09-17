package com.santaelf1.interfaces;

import com.santaelf1.items.ItemWallpaper;

import java.util.ArrayList;

public interface HomeListener {
    void onStart();
    void onEnd(String success, ArrayList<ItemWallpaper> arrayListLatest, ArrayList<ItemWallpaper> arrayListMostView, ArrayList<ItemWallpaper> arrayListMostRated);
}
