package m7;

import B6.q;
import C6.A;
import C6.F;
import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0008i;
import C6.InterfaceC0010k;
import C6.InterfaceC0011l;
import C6.L;
import C6.M;
import F6.E;
import F6.I;
import F6.U;
import F7.l;
import H7.k;
import H7.m;
import H7.r;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import f7.C0722b;
import f7.C0723c;
import f7.C0724d;
import f7.C0725e;
import i7.AbstractC0890e;
import java.util.Collection;
import n6.InterfaceC1163b;
import o6.j;
import x7.AbstractC1825g;
import z6.h;

/* renamed from: m7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1098d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12556a = 0;

    static {
        C0725e.e("value");
    }

    public static final boolean a(U u8) {
        Boolean h8 = l.h(E2.d.y(u8), C1095a.f12551e, C1097c.f12555l);
        j.d(h8, "ifAny(...)");
        return h8.booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o6.u] */
    public static InterfaceC0002c b(InterfaceC0002c interfaceC0002c, InterfaceC1163b interfaceC1163b) {
        j.e(interfaceC0002c, "<this>");
        return (InterfaceC0002c) l.f(E2.d.y(interfaceC0002c), new C1095a(1), new q(new Object(), interfaceC1163b));
    }

    public static final C0723c c(InterfaceC0011l interfaceC0011l) {
        j.e(interfaceC0011l, "<this>");
        C0724d h8 = h(interfaceC0011l);
        if (!h8.d()) {
            h8 = null;
        }
        if (h8 == null) {
            return null;
        }
        return h8.g();
    }

    public static final InterfaceC0004e d(D6.c cVar) {
        j.e(cVar, "<this>");
        InterfaceC0007h c6 = cVar.b().B0().c();
        if (c6 instanceof InterfaceC0004e) {
            return (InterfaceC0004e) c6;
        }
        return null;
    }

    public static final h e(InterfaceC0010k interfaceC0010k) {
        j.e(interfaceC0010k, "<this>");
        return j(interfaceC0010k).o();
    }

    public static final C0722b f(InterfaceC0007h interfaceC0007h) {
        InterfaceC0010k q6;
        C0722b f8;
        if (interfaceC0007h != null && (q6 = interfaceC0007h.q()) != null) {
            if (q6 instanceof F) {
                C0723c c0723c = ((E) ((F) q6)).f1461i;
                C0725e name = interfaceC0007h.getName();
                j.d(name, "getName(...)");
                return new C0722b(c0723c, name);
            }
            if ((q6 instanceof InterfaceC0008i) && (f8 = f((InterfaceC0007h) q6)) != null) {
                C0725e name2 = interfaceC0007h.getName();
                j.d(name2, "getName(...)");
                return f8.d(name2);
            }
            return null;
        }
        return null;
    }

    public static final C0723c g(InterfaceC0010k interfaceC0010k) {
        j.e(interfaceC0010k, "<this>");
        C0723c h8 = AbstractC0890e.h(interfaceC0010k);
        if (h8 != null) {
            return h8;
        }
        return AbstractC0890e.g(interfaceC0010k.q()).a(interfaceC0010k.getName()).g();
    }

    public static final C0724d h(InterfaceC0010k interfaceC0010k) {
        j.e(interfaceC0010k, "<this>");
        C0724d g8 = AbstractC0890e.g(interfaceC0010k);
        j.d(g8, "getFqName(...)");
        return g8;
    }

    public static final void i(A a3) {
        j.e(a3, "<this>");
        if (a3.m0(AbstractC1825g.f16283a) == null) {
        } else {
            throw new ClassCastException();
        }
    }

    public static final A j(InterfaceC0010k interfaceC0010k) {
        j.e(interfaceC0010k, "<this>");
        A d2 = AbstractC0890e.d(interfaceC0010k);
        j.d(d2, "getContainingModule(...)");
        return d2;
    }

    public static final InterfaceC0002c k(InterfaceC0002c interfaceC0002c) {
        j.e(interfaceC0002c, "<this>");
        if (interfaceC0002c instanceof L) {
            M M02 = ((I) ((L) interfaceC0002c)).M0();
            j.d(M02, "getCorrespondingProperty(...)");
            return M02;
        }
        return interfaceC0002c;
    }

    public static final H7.h l(InterfaceC0002c interfaceC0002c) {
        j.e(interfaceC0002c, "<this>");
        k L02 = AbstractC0434i.L0(new InterfaceC0002c[]{interfaceC0002c});
        Collection s8 = interfaceC0002c.s();
        j.d(s8, "getOverriddenDescriptors(...)");
        return m.S(AbstractC0434i.L0(new k[]{L02, new H7.h(AbstractC0436k.k0(s8), new C1096b(1), r.f2078l)}));
    }
}
