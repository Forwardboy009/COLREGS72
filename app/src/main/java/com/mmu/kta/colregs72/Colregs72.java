package com.mmu.kta.colregs72;

import android.content.Context;

/**
 * Created by Kyaw Thura Aung on 08-Apr-2016.
 */

public enum Colregs72 {

    ALWAYS_IN_CENTER(R.string.colregs72_colregs72, R.layout.colregs72_rules);

    public final int titleResId;
    public final int layoutResId;

    Colregs72(int titleResId, int layoutResId) {
        this.titleResId = titleResId;
        this.layoutResId = layoutResId;
    }

    public static int[] tab42() {
        return new int[] {
                R.string.r1,
                R.string.r2,
                R.string.r3,
                R.string.r4,
                R.string.r5,
                R.string.r6,
                R.string.r7,
                R.string.r8,
                R.string.r9,
                R.string.r10,
                R.string.r11,
                R.string.r12,
                R.string.r13,
                R.string.r14,
                R.string.r15,
                R.string.r16,
                R.string.r17,
                R.string.r18,
                R.string.r19,
                R.string.r20,
                R.string.r21,
                R.string.r22,
                R.string.r23,
                R.string.r24,
                R.string.r25,
                R.string.r26,
                R.string.r27,
                R.string.r28,
                R.string.r29,
                R.string.r30,
                R.string.r31,
                R.string.r22,
                R.string.r33,
                R.string.r34,
                R.string.r35,
                R.string.r36,
                R.string.r37,
                R.string.r38,
                R.string.r39,
                R.string.r40,
                R.string.r41,
                R.string.AnnexI,
                R.string.AnnexII,
                R.string.AnnexIII,
                R.string.AnnexIV,

        };
    }
    public void startActivity(Context context) {
        Colregs72Activity.startActivity(context, this);
    }

    public void setup(final SmartTabLayout layout) {
        //Do nothing.
    }

    public int[] tabs() {
        return tab42();
    }

}
