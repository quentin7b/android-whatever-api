package com.github.quentin7b.whateverapi.android.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Helper for http://developer.android.com/reference/android/content/res/Resources.html
 * {@link android.content.res.Resources} Helper
 */
public class WEApiResources {
    /**
     * Returns a themed color integer associated with a particular resource ID. <br />
     * Deprecated in API Level 23
     *
     * @param resources app resources {@link Context#getResources()}
     * @param colorRes  the resource ID of the color
     * @param theme     app theme or null {@link Context#getTheme()}
     * @return the color itself
     */
    public static int getColor(@NonNull Resources resources, @ColorRes int colorRes, @Nullable Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            return resources.getColor(colorRes, theme);
        } else {
            return resources.getColor(colorRes);
        }
    }

    /**
     * Returns a themed color state list associated with a particular resource ID.
     * Deprecated in API Level 23
     *
     * @param resources app resources {@link Context#getResources()}
     * @param colorRes  the resource ID of the color
     * @param theme     app theme or null {@link Context#getTheme()}
     * @return the color state list itself
     */
    public static ColorStateList getColorStateList(@NonNull Resources resources, @ColorRes int colorRes, @Nullable Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            return resources.getColorStateList(colorRes, theme);
        } else {
            return resources.getColorStateList(colorRes);
        }
    }

    /**
     * Return a drawable object associated with a particular resource ID. <br />
     * Deprecated in API Level 22
     *
     * @param resources   app resources {@link Context#getResources()}
     * @param drawableRes the resource ID of the drawable
     * @param theme       app theme or null {@link Context#getTheme()}
     * @return the drawable itself
     */
    public static Drawable getDrawable(@NonNull Resources resources, @DrawableRes int drawableRes, @Nullable Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            return resources.getDrawable(drawableRes, theme);
        } else {
            return resources.getDrawable(drawableRes);
        }
    }

    /**
     * Return a drawable object associated with a particular resource ID for the given screen density in DPI. <br />
     * Be aware the minimal API is ICE_CREAM_SANDWICH_MR1 (15) <br/>
     * Deprecated in API Level 23
     *
     * @param resources   app resources {@link Context#getResources()}
     * @param drawableRes the resource ID of the drawable
     * @param density     the desired screen density indicated by the resource as found in {@link android.util.DisplayMetrics}.
     * @param theme       app theme or null {@link Context#getTheme()}
     * @return the drawable itself
     */
    public static Drawable getDrawableForDensity(@NonNull Resources resources, @DrawableRes int drawableRes, int density, @Nullable Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            return resources.getDrawableForDensity(drawableRes, density, theme);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1) {
            return resources.getDrawableForDensity(drawableRes, density);
        } else {
            throw new RuntimeException("Method does not exist in APIs older than ICE_CREAM_SANDWICH_MR1 (15)");
        }
    }
}
