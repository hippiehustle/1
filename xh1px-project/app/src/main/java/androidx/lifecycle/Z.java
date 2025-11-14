package androidx.lifecycle;

import java.util.Iterator;
import l0.C0998b;

/* loaded from: classes.dex */
public abstract class Z {

    /* renamed from: a, reason: collision with root package name */
    public final C0998b f8824a = new C0998b();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        C0998b c0998b = this.f8824a;
        if (c0998b != null) {
            if (c0998b.f12186d) {
                C0998b.a(autoCloseable);
                return;
            }
            synchronized (c0998b.f12183a) {
                autoCloseable2 = (AutoCloseable) c0998b.f12184b.put(str, autoCloseable);
            }
            C0998b.a(autoCloseable2);
        }
    }

    public final void b() {
        C0998b c0998b = this.f8824a;
        if (c0998b != null && !c0998b.f12186d) {
            c0998b.f12186d = true;
            synchronized (c0998b.f12183a) {
                try {
                    Iterator it = c0998b.f12184b.values().iterator();
                    while (it.hasNext()) {
                        C0998b.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0998b.f12185c.iterator();
                    while (it2.hasNext()) {
                        C0998b.a((AutoCloseable) it2.next());
                    }
                    c0998b.f12185c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        C0998b c0998b = this.f8824a;
        if (c0998b != null) {
            synchronized (c0998b.f12183a) {
                autoCloseable = (AutoCloseable) c0998b.f12184b.get(str);
            }
            return autoCloseable;
        }
        return null;
    }

    public void d() {
    }
}
