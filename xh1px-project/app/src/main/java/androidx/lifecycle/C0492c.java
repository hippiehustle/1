package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0492c {

    /* renamed from: a, reason: collision with root package name */
    public final int f8830a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f8831b;

    public C0492c(int i4, Method method) {
        this.f8830a = i4;
        this.f8831b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0492c)) {
            return false;
        }
        C0492c c0492c = (C0492c) obj;
        if (this.f8830a == c0492c.f8830a && this.f8831b.getName().equals(c0492c.f8831b.getName())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8831b.getName().hashCode() + (this.f8830a * 31);
    }
}
