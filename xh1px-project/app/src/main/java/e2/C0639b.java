package e2;

import A.j;

/* renamed from: e2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0639b extends AbstractC0640c {

    /* renamed from: a, reason: collision with root package name */
    public final int f10598a;

    public C0639b(int i4) {
        this.f10598a = i4;
    }

    @Override // e2.AbstractC0640c
    public final Object a() {
        return Integer.valueOf(this.f10598a);
    }

    @Override // m1.InterfaceC1051a
    public final boolean d() {
        if (this.f10598a >= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0639b) && this.f10598a == ((C0639b) obj).f10598a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10598a);
    }

    public final String toString() {
        return j.j(this.f10598a, "Number(value=", ")");
    }
}
