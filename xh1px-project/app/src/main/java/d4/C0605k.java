package d4;

import e1.C0637a;

/* renamed from: d4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0605k {

    /* renamed from: a, reason: collision with root package name */
    public final C0637a f10394a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10395b;

    public C0605k(C0637a c0637a, boolean z8) {
        this.f10394a = c0637a;
        this.f10395b = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0605k)) {
            return false;
        }
        C0605k c0605k = (C0605k) obj;
        if (o6.j.a(this.f10394a, c0605k.f10394a) && this.f10395b == c0605k.f10395b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10395b) + (this.f10394a.hashCode() * 31);
    }

    public final String toString() {
        return "ItemAction(action=" + this.f10394a + ", isSelected=" + this.f10395b + ")";
    }
}
