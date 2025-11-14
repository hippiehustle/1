package o6;

import u6.InterfaceC1641b;
import u6.InterfaceC1645f;

/* loaded from: classes.dex */
public abstract class i extends AbstractC1284c implements h, InterfaceC1645f {
    public final int j;
    public final int k;

    public i(int i4, Class cls, String str, String str2, int i8) {
        this(i4, C1283b.f13627d, cls, str, str2, i8, 0);
    }

    @Override // o6.h
    public final int d() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (this.f13631g.equals(iVar.f13631g) && this.f13632h.equals(iVar.f13632h) && this.k == iVar.k && this.j == iVar.j && j.a(this.f13629e, iVar.f13629e) && j.a(g(), iVar.g())) {
                    return true;
                }
                return false;
            }
            if (obj instanceof InterfaceC1645f) {
                InterfaceC1641b interfaceC1641b = this.f13628d;
                if (interfaceC1641b == null) {
                    interfaceC1641b = f();
                    this.f13628d = interfaceC1641b;
                }
                return obj.equals(interfaceC1641b);
            }
            return false;
        }
        return true;
    }

    @Override // o6.AbstractC1284c
    public final InterfaceC1641b f() {
        return v.f13643a.a(this);
    }

    public final int hashCode() {
        int hashCode;
        if (g() == null) {
            hashCode = 0;
        } else {
            hashCode = g().hashCode() * 31;
        }
        return this.f13632h.hashCode() + A.j.c(this.f13631g, hashCode, 31);
    }

    public final String toString() {
        InterfaceC1641b interfaceC1641b = this.f13628d;
        if (interfaceC1641b == null) {
            interfaceC1641b = f();
            this.f13628d = interfaceC1641b;
        }
        if (interfaceC1641b != this) {
            return interfaceC1641b.toString();
        }
        String str = this.f13631g;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return A.j.p("function ", str, " (Kotlin reflection is not available)");
    }

    public i(int i4, Object obj, Class cls, String str, String str2, int i8, int i9) {
        super(obj, cls, str, str2, (i8 & 1) == 1);
        this.j = i4;
        this.k = 0;
    }
}
