package v7;

import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15550a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1162a f15551b;

    public g(Object obj, InterfaceC1162a interfaceC1162a) {
        this.f15550a = obj;
        this.f15551b = interfaceC1162a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass() && this.f15550a.equals(((g) obj).f15550a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15550a.hashCode();
    }
}
