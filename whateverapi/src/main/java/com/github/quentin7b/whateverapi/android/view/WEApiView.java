package com.github.quentin7b.whateverapi.android.view;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TimePicker;

/**
 * Helper for http://developer.android.com/reference/android/view/View.html
 * {@link android.view.View} Helper
 */
public class WEApiView {

    /**
     * Ask that a new dispatch of onApplyWindowInsets(WindowInsets) be performed. <br />
     * Be aware the minimal API is JELLY_BEAN (16) <br/>
     * Deprecated in API Level 20
     *
     * @param view the view used to apply
     */
    public static void requestApplyInsets(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT_WATCH) {
            view.requestApplyInsets();
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            view.requestFitSystemWindows();
        } else {
            throw new RuntimeException("Method does not exist in APIs older than JELLY_BEAN (16)");
        }
    }

    /**
     * Set the background to a given Drawable, or remove the background <br />
     * Deprecated in API Level 16
     *
     * @param view       the view used to apply
     * @param background the background to set on view or null to remove the background
     */
    public static void setBackground(@NonNull View view, @Nullable Drawable background) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            view.setBackground(background);
        } else {
            view.setBackgroundDrawable(background);
        }
    }


    /***
     * Set current hour to {@link TimePicker}
     *
     * @param timePicker
     * @param hour
     */
    public static void setTimePickerHour(@NonNull TimePicker timePicker, int hour) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            timePicker.setHour(hour);
        } else {
            timePicker.setCurrentHour(hour);
        }
    }


    /***
     * Set minute to {@link TimePicker}
     *
     * @param timePicker
     * @param minute
     */
    public static void setTimePickerMinute(@NonNull TimePicker timePicker, int minute) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            timePicker.setMinute(minute);
        } else {
            timePicker.setCurrentMinute(minute);
        }
    }

    /**
     * Get the current hour from {@link TimePicker}
     *
     * @param timePicker
     * @return
     */
    public static int getTimePickerHour(@NonNull TimePicker timePicker) {
        int hour = 0;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            hour = timePicker.getHour();
        } else {
            hour = timePicker.getCurrentHour();
        }
        return hour;
    }

    /***
     * Get the current minute from {@link TimePicker}
     *
     * @param timePicker
     * @return
     */
    public static int getTimePickerMinute(@NonNull TimePicker timePicker) {
        int minute = 0;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            minute = timePicker.getMinute();
        } else {
            minute = timePicker.getCurrentMinute();
        }
        return minute;
    }

}
