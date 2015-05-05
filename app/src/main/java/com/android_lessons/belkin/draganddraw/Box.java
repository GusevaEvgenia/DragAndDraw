package com.android_lessons.belkin.draganddraw;

import android.graphics.PointF;

/**
 * Created by Belkin on 05.05.2015.
 */
public class Box {
    private PointF mOrigin;

    public PointF getCurrent() {
        return mCurrent;
    }

    private PointF mCurrent;

    public Box(PointF origin) {
        mOrigin = mCurrent = origin;
    }

    public void setCurrent(PointF current) {
        mCurrent = current;
    }

    public PointF getOrigin() {
        return mOrigin;
    }
}
