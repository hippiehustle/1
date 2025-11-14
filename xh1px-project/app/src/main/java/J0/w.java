package J0;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f2343a;

    static {
        boolean z8;
        if (Build.VERSION.SDK_INT >= 28) {
            z8 = true;
        } else {
            z8 = false;
        }
        f2343a = z8;
    }
}
