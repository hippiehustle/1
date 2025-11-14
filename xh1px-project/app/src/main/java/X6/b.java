package X6;

import C6.InterfaceC0004e;
import C6.O;
import f7.C0723c;
import java.util.Map;
import m7.AbstractC1098d;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public final class b implements D6.c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6991a = new Object();

    @Override // D6.c
    public final C0723c a() {
        InterfaceC0004e d2 = AbstractC1098d.d(this);
        if (d2 != null) {
            if (y7.l.f(d2)) {
                d2 = null;
            }
            if (d2 != null) {
                return AbstractC1098d.c(d2);
            }
        }
        return null;
    }

    @Override // D6.c
    public final AbstractC1759v b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // D6.c
    public final Map c() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // D6.c
    public final O h() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
