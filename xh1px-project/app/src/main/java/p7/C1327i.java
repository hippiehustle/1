package p7;

import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0008i;
import C6.S;
import f7.C0725e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import n6.InterfaceC1163b;

/* renamed from: p7.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1327i extends AbstractC1334p {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1333o f13831b;

    public C1327i(InterfaceC1333o interfaceC1333o) {
        o6.j.e(interfaceC1333o, "workerScope");
        this.f13831b = interfaceC1333o;
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1335q
    public final Collection a(C1324f c1324f, InterfaceC1163b interfaceC1163b) {
        C1324f c1324f2;
        o6.j.e(c1324f, "kindFilter");
        int i4 = C1324f.f13816l & c1324f.f13825b;
        if (i4 == 0) {
            c1324f2 = null;
        } else {
            c1324f2 = new C1324f(i4, c1324f.f13824a);
        }
        if (c1324f2 == null) {
            return a6.s.f7766d;
        }
        Collection a3 = this.f13831b.a(c1324f2, interfaceC1163b);
        ArrayList arrayList = new ArrayList();
        for (Object obj : a3) {
            if (obj instanceof InterfaceC0008i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public final Set b() {
        return this.f13831b.b();
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public final Set c() {
        return this.f13831b.c();
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1335q
    public final InterfaceC0007h d(C0725e c0725e, K6.b bVar) {
        InterfaceC0004e interfaceC0004e;
        o6.j.e(c0725e, "name");
        o6.j.e(bVar, "location");
        InterfaceC0007h d2 = this.f13831b.d(c0725e, bVar);
        if (d2 != null) {
            if (d2 instanceof InterfaceC0004e) {
                interfaceC0004e = (InterfaceC0004e) d2;
            } else {
                interfaceC0004e = null;
            }
            if (interfaceC0004e != null) {
                return interfaceC0004e;
            }
            if (d2 instanceof S) {
                return (S) d2;
            }
        }
        return null;
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public final Set e() {
        return this.f13831b.e();
    }

    public final String toString() {
        return "Classes from " + this.f13831b;
    }
}
