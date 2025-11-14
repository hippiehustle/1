package B6;

import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import f7.C0722b;
import f7.C0723c;
import f7.C0724d;
import i7.AbstractC0890e;
import m7.AbstractC1098d;

/* loaded from: classes.dex */
public final class e implements F7.a {

    /* renamed from: d, reason: collision with root package name */
    public static final e f469d = new Object();

    public static InterfaceC0004e a(InterfaceC0004e interfaceC0004e) {
        C0724d g8 = AbstractC0890e.g(interfaceC0004e);
        String str = d.f457a;
        C0723c c0723c = (C0723c) d.k.get(g8);
        if (c0723c != null) {
            return AbstractC1098d.e(interfaceC0004e).j(c0723c);
        }
        throw new IllegalArgumentException("Given class " + interfaceC0004e + " is not a read-only collection");
    }

    public static InterfaceC0004e c(C0723c c0723c, z6.h hVar) {
        o6.j.e(hVar, "builtIns");
        String str = d.f457a;
        C0722b c0722b = (C0722b) d.f464h.get(c0723c.f10797a);
        if (c0722b != null) {
            return hVar.j(c0722b.a());
        }
        return null;
    }

    @Override // F7.a
    public Iterable b(Object obj) {
        u6.s[] sVarArr = r.f504h;
        return ((InterfaceC0002c) obj).a().s();
    }
}
