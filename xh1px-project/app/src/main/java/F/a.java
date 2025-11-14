package F;

import A.j;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import h1.AbstractC0812e;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public abstract class a {
    public static Icon a(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static float b(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float c(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static boolean d(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (u6.AbstractC1638C.k(r7, r10) == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Intent e(Context context, AbstractC0812e abstractC0812e, IntentFilter intentFilter, int i4) {
        String opPackageName;
        if ((i4 & 4) != 0) {
            String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (AbstractC1638C.k(context, str) != 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    StringBuilder sb = new StringBuilder();
                    opPackageName = context.getOpPackageName();
                    sb.append(opPackageName);
                    sb.append(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
                    str = sb.toString();
                }
                throw new RuntimeException(j.p("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
            }
            return context.registerReceiver(abstractC0812e, intentFilter, str, null);
        }
        return context.registerReceiver(abstractC0812e, intentFilter, null, null, i4 & 1);
    }

    public static Intent f(Context context, AbstractC0812e abstractC0812e, IntentFilter intentFilter, int i4) {
        return context.registerReceiver(abstractC0812e, intentFilter, null, null, i4);
    }

    public static void g(MenuItem menuItem, char c6, int i4) {
        menuItem.setAlphabeticShortcut(c6, i4);
    }

    public static void h(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void i(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void j(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void k(MenuItem menuItem, char c6, int i4) {
        menuItem.setNumericShortcut(c6, i4);
    }

    public static void l(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
