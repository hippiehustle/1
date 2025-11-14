package E;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f1101a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f1102b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1103c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1104d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1105e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f1106f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f1107g;

    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(int i4, String str, PendingIntent pendingIntent) {
        IconCompat b4;
        if (i4 == 0) {
            b4 = null;
        } else {
            b4 = IconCompat.b(null, "", i4);
        }
        Bundle bundle = new Bundle();
        this.f1104d = true;
        this.f1102b = b4;
        if (b4 != null) {
            int i8 = b4.f8557a;
            if (i8 == -1) {
                int i9 = Build.VERSION.SDK_INT;
                Object obj = b4.f8558b;
                if (i9 >= 28) {
                    i8 = I.a.j(obj);
                } else {
                    try {
                        i8 = ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                    } catch (IllegalAccessException e9) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e9);
                        i8 = -1;
                        if (i8 == 2) {
                        }
                        this.f1106f = j.b(str);
                        this.f1107g = pendingIntent;
                        this.f1101a = bundle;
                        this.f1103c = true;
                        this.f1104d = true;
                    } catch (NoSuchMethodException e10) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                        i8 = -1;
                        if (i8 == 2) {
                        }
                        this.f1106f = j.b(str);
                        this.f1107g = pendingIntent;
                        this.f1101a = bundle;
                        this.f1103c = true;
                        this.f1104d = true;
                    } catch (InvocationTargetException e11) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                        i8 = -1;
                        if (i8 == 2) {
                        }
                        this.f1106f = j.b(str);
                        this.f1107g = pendingIntent;
                        this.f1101a = bundle;
                        this.f1103c = true;
                        this.f1104d = true;
                    }
                }
            }
            if (i8 == 2) {
                this.f1105e = b4.c();
            }
        }
        this.f1106f = j.b(str);
        this.f1107g = pendingIntent;
        this.f1101a = bundle;
        this.f1103c = true;
        this.f1104d = true;
    }

    public final IconCompat a() {
        int i4;
        if (this.f1102b == null && (i4 = this.f1105e) != 0) {
            this.f1102b = IconCompat.b(null, "", i4);
        }
        return this.f1102b;
    }
}
