package c0;

import android.os.Trace;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class p implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        try {
            Method method = L.f.f2746b;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (k.k != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                k.a().c();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Method method2 = L.f.f2746b;
            Trace.endSection();
            throw th;
        }
    }
}
