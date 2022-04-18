package com.example.dogapp;

import android.view.View;

public interface ItemClickListener {
//    void onActivityResult(int requestCode, int resultCode, Intent data);

    void onClick(View view, int position, boolean isLongClick);
}
