package com.mmu.kta.colregs72;

/**
 * Created by Kyaw Thura Aung on 08-Apr-2016.
 */

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.mmu.kta.utils.v13.FragmentPagerItem;
import com.mmu.kta.utils.v13.FragmentPagerItemAdapter;
import com.mmu.kta.utils.v13.FragmentPagerItems;

public class Colregs72Activity extends AppCompatActivity {

    private static final String KEY_COLREGS72 = "colregs72";

    public static void startActivity(Context context, Colregs72 colregs72) {
        Intent intent = new Intent(context, Colregs72Activity.class);
        intent.putExtra(KEY_COLREGS72, colregs72.name());
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colregs72);

        Colregs72 colregs72 = getColregs72();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(colregs72.titleResId);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ViewGroup tab = (ViewGroup) findViewById(R.id.tab);
        tab.addView(LayoutInflater.from(this).inflate(colregs72.layoutResId, tab, false));

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        SmartTabLayout viewPagerTab = (SmartTabLayout) findViewById(R.id.viewpagertab);
        colregs72.setup(viewPagerTab);

        FragmentPagerItems pages = new FragmentPagerItems(this);
        for (int titleResId : colregs72.tabs()) {
            pages.add(FragmentPagerItem.of(getString(titleResId), Colregs72Fragment.class));
        }

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), pages);

        viewPager.setAdapter(adapter);
        viewPagerTab.setViewPager(viewPager);

    }

    private Colregs72 getColregs72() {
        return Colregs72.valueOf(getIntent().getStringExtra(KEY_COLREGS72));
    }
}
