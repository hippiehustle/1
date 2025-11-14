package h7;

import C6.F;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import C6.T;
import F6.E;
import a6.z;
import f7.C0724d;
import f7.C0725e;
import i7.AbstractC0890e;
import java.util.ArrayList;

/* renamed from: h7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0839b implements InterfaceC0840c {

    /* renamed from: b, reason: collision with root package name */
    public static final C0839b f11425b = new C0839b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0839b f11426c = new C0839b(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0839b f11427d = new C0839b(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11428a;

    public /* synthetic */ C0839b(int i4) {
        this.f11428a = i4;
    }

    public static String b(InterfaceC0007h interfaceC0007h) {
        String str;
        C0725e name = interfaceC0007h.getName();
        o6.j.d(name, "getName(...)");
        String i4 = u.i(name);
        if (!(interfaceC0007h instanceof T)) {
            InterfaceC0010k q6 = interfaceC0007h.q();
            o6.j.d(q6, "getContainingDeclaration(...)");
            if (q6 instanceof InterfaceC0004e) {
                str = b((InterfaceC0007h) q6);
            } else if (q6 instanceof F) {
                C0724d c0724d = ((E) ((F) q6)).f1461i.f10797a;
                o6.j.e(c0724d, "<this>");
                str = u.j(C0724d.e(c0724d));
            } else {
                str = null;
            }
            if (str != null && !str.equals("")) {
                return str + '.' + i4;
            }
        }
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [C6.h, C6.k] */
    /* JADX WARN: Type inference failed for: r2v8, types: [C6.k] */
    /* JADX WARN: Type inference failed for: r2v9, types: [C6.k] */
    @Override // h7.InterfaceC0840c
    public final String a(InterfaceC0007h interfaceC0007h, C0845h c0845h) {
        switch (this.f11428a) {
            case 0:
                if (interfaceC0007h instanceof T) {
                    C0725e name = ((T) interfaceC0007h).getName();
                    o6.j.d(name, "getName(...)");
                    return c0845h.M(name, false);
                }
                C0724d g8 = AbstractC0890e.g(interfaceC0007h);
                o6.j.d(g8, "getFqName(...)");
                return c0845h.m(u.j(C0724d.e(g8)));
            case 1:
                if (interfaceC0007h instanceof T) {
                    C0725e name2 = ((T) interfaceC0007h).getName();
                    o6.j.d(name2, "getName(...)");
                    return c0845h.M(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(interfaceC0007h.getName());
                    interfaceC0007h = interfaceC0007h.q();
                } while (interfaceC0007h instanceof InterfaceC0004e);
                return u.j(new z(arrayList));
            default:
                return b(interfaceC0007h);
        }
    }
}
