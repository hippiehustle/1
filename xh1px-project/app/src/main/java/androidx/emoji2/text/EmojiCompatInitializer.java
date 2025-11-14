package androidx.emoji2.text;

import H0.a;
import H0.b;
import android.content.Context;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.InterfaceC0510v;
import androidx.lifecycle.ProcessLifecycleInitializer;
import c0.g;
import c0.k;
import c0.l;
import c0.o;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // H0.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c0.u, c0.g] */
    @Override // H0.b
    public final Object b(Context context) {
        Object obj;
        ?? gVar = new g(new o(context, 0));
        gVar.f9382a = 1;
        if (k.k == null) {
            synchronized (k.j) {
                try {
                    if (k.k == null) {
                        k.k = new k(gVar);
                    }
                } finally {
                }
            }
        }
        a c6 = a.c(context);
        c6.getClass();
        synchronized (a.f1872e) {
            try {
                obj = c6.f1873a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c6.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        C0512x g8 = ((InterfaceC0510v) obj).g();
        g8.a(new l(this, g8));
        return Boolean.TRUE;
    }
}
