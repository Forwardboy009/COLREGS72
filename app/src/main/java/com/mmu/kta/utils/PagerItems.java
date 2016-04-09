package com.mmu.kta.utils;

/**
 * Created by Kyaw Thura Aung on 08-Apr-2016.
 */
import android.content.Context;

import java.util.ArrayList;

public abstract class PagerItems<T extends PagerItem> extends ArrayList<T> {

    private final Context context;

    protected PagerItems(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

}
