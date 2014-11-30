package com.espian.showcaseview.targets;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;

public class ViewTarget implements Target {

    private final View mView;

    public ViewTarget(View view) {
        mView = view;
    }

    public ViewTarget(int viewId, Activity activity) {
        mView = activity.findViewById(viewId);
    }

    @Override
    public Point getPoint() {
        int[] location = new int[2];
        int x = 0;
        int y = 0;
        if (mView != null) {
            mView.getLocationInWindow(location);
            x = location[0] + mView.getWidth() / 2;
            y = location[1] + mView.getHeight() / 2;
        }
        return new Point(x, y);
    }
}
