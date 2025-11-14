package e2;

import o6.j;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0638a extends AbstractC0640c {

    /* renamed from: a, reason: collision with root package name */
    public final String f10597a;

    public C0638a(String str) {
        j.e(str, "value");
        this.f10597a = str;
    }

    @Override // e2.AbstractC0640c
    public final Object a() {
        return this.f10597a;
    }

    @Override // m1.InterfaceC1051a
    public final boolean d() {
        if (this.f10597a.length() > 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0638a) && j.a(this.f10597a, ((C0638a) obj).f10597a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10597a.hashCode();
    }

    public final String toString() {
        return A.j.p("Counter(value=", this.f10597a, ")");
    }
}
