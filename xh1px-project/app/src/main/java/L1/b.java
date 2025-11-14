package L1;

import android.content.Context;
import android.os.Build;
import i.AbstractActivityC0870i;
import o6.j;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2756a;

    public b(boolean z8) {
        this.f2756a = z8;
    }

    public final boolean a(Context context) {
        j.e(context, "context");
        if (this instanceof e) {
            int i4 = Build.VERSION.SDK_INT;
            if (33 > i4 || i4 >= Integer.MAX_VALUE) {
                return true;
            }
        }
        return c(context);
    }

    public final boolean b(Context context) {
        return context.getSharedPreferences("permissions", 0).getBoolean(getClass().getSimpleName(), false);
    }

    public abstract boolean c(Context context);

    public abstract boolean d(AbstractActivityC0870i abstractActivityC0870i);
}
