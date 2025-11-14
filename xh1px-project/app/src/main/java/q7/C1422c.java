package q7;

import C6.InterfaceC0004e;
import o6.j;
import w7.AbstractC1759v;
import w7.z;

/* renamed from: q7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1422c implements InterfaceC1423d {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0004e f14217d;

    public C1422c(InterfaceC0004e interfaceC0004e) {
        this.f14217d = interfaceC0004e;
    }

    @Override // q7.InterfaceC1423d
    public final AbstractC1759v b() {
        z l6 = this.f14217d.l();
        j.d(l6, "getDefaultType(...)");
        return l6;
    }

    public final boolean equals(Object obj) {
        C1422c c1422c;
        InterfaceC0004e interfaceC0004e = null;
        if (obj instanceof C1422c) {
            c1422c = (C1422c) obj;
        } else {
            c1422c = null;
        }
        if (c1422c != null) {
            interfaceC0004e = c1422c.f14217d;
        }
        return j.a(this.f14217d, interfaceC0004e);
    }

    public final int hashCode() {
        return this.f14217d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        z l6 = this.f14217d.l();
        j.d(l6, "getDefaultType(...)");
        sb.append(l6);
        sb.append('}');
        return sb.toString();
    }
}
