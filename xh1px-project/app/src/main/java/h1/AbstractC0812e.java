package h1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import o6.j;

/* renamed from: h1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0812e extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final IntentFilter f11320a;

    /* renamed from: b, reason: collision with root package name */
    public Context f11321b;

    public AbstractC0812e(IntentFilter intentFilter) {
        this.f11320a = intentFilter;
    }

    public static void c(AbstractC0812e abstractC0812e, Context context) {
        abstractC0812e.getClass();
        j.e(context, "context");
        abstractC0812e.f11321b = context;
        IntentFilter intentFilter = abstractC0812e.f11320a;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            F.a.f(context, abstractC0812e, intentFilter, 2);
        } else if (i4 >= 26) {
            F.a.e(context, abstractC0812e, intentFilter, 2);
        } else {
            context.registerReceiver(abstractC0812e, intentFilter, null, null);
        }
        abstractC0812e.a(context);
    }

    public void a(Context context) {
        j.e(context, "context");
    }

    public final void d() {
        try {
            Context context = this.f11321b;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f11321b = null;
            b();
        } catch (IllegalArgumentException unused) {
        }
    }

    public void b() {
    }
}
