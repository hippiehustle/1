package p7;

import C6.InterfaceC0007h;
import F6.N;
import f7.C0725e;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import n6.InterfaceC1163b;

/* renamed from: p7.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1334p implements InterfaceC1333o {
    @Override // p7.InterfaceC1335q
    public Collection a(C1324f c1324f, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c1324f, "kindFilter");
        return a6.s.f7766d;
    }

    @Override // p7.InterfaceC1333o
    public Set b() {
        Collection a3 = a(C1324f.f13820p, F7.b.f1618d);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : a3) {
            if (obj instanceof N) {
                C0725e name = ((N) obj).getName();
                o6.j.d(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // p7.InterfaceC1333o
    public Set c() {
        Collection a3 = a(C1324f.f13821q, F7.b.f1618d);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : a3) {
            if (obj instanceof N) {
                C0725e name = ((N) obj).getName();
                o6.j.d(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // p7.InterfaceC1335q
    public InterfaceC0007h d(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        o6.j.e(bVar, "location");
        return null;
    }

    @Override // p7.InterfaceC1333o
    public Set e() {
        return null;
    }

    @Override // p7.InterfaceC1333o
    public Collection f(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        return a6.s.f7766d;
    }

    @Override // p7.InterfaceC1333o
    public Collection g(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        return a6.s.f7766d;
    }
}
