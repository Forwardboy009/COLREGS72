package com.mmu.kta.utils.v13;

/**
 * Created by Kyaw Thura Aung on 08-Apr-2016.
 */
import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.StringRes;

import com.mmu.kta.utils.PagerItems;

public class FragmentPagerItems extends PagerItems<FragmentPagerItem> {

    public FragmentPagerItems(Context context) {
        super(context);
    }

    public static Creator with(Context context) {
        return new Creator(context);
    }

    public static class Creator {

        private final FragmentPagerItems items;

        public Creator(Context context) {
            items = new FragmentPagerItems(context);
        }

        public Creator add(@StringRes int title, Class<? extends Fragment> clazz) {
            return add(FragmentPagerItem.of(items.getContext().getString(title), clazz));
        }

        public Creator add(@StringRes int title, Class<? extends Fragment> clazz, Bundle args) {
            return add(FragmentPagerItem.of(items.getContext().getString(title), clazz, args));
        }

        public Creator add(@StringRes int title, float width, Class<? extends Fragment> clazz) {
            return add(FragmentPagerItem.of(items.getContext().getString(title), width, clazz));
        }

        public Creator add(@StringRes int title, float width, Class<? extends Fragment> clazz,
                           Bundle args) {
            return add(FragmentPagerItem.of(items.getContext().getString(title), width, clazz, args));
        }

        public Creator add(CharSequence title, Class<? extends Fragment> clazz) {
            return add(FragmentPagerItem.of(title, clazz));
        }

        public Creator add(CharSequence title, Class<? extends Fragment> clazz, Bundle args) {
            return add(FragmentPagerItem.of(title, clazz, args));
        }

        public Creator add(FragmentPagerItem item) {
            items.add(item);
            return this;
        }

        public FragmentPagerItems create() {
            return items;
        }

    }
}

