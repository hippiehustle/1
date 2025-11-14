package i7;

import C6.B;
import C6.C0020v;
import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import C6.M;
import C6.U;
import C6.W;
import F6.L;
import f7.C0723c;
import f7.C0725e;
import m7.AbstractC1098d;
import w7.AbstractC1759v;
import w7.z;

/* renamed from: i7.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0892g {
    static {
        C0723c c0723c = new C0723c("kotlin.jvm.JvmInline");
        c0723c.b();
        C0725e f8 = c0723c.f10797a.f();
        C0723c c0723c2 = C0723c.f10796c;
        E2.d.U(f8).f10797a.c();
        new C0723c("kotlin.jvm.JvmName");
    }

    public static final boolean a(InterfaceC0002c interfaceC0002c) {
        InterfaceC0004e interfaceC0004e;
        U l02;
        o6.j.e(interfaceC0002c, "<this>");
        if (interfaceC0002c instanceof L) {
            M M02 = ((L) interfaceC0002c).M0();
            o6.j.d(M02, "getCorrespondingProperty(...)");
            if (M02.M() == null) {
                InterfaceC0010k q6 = M02.q();
                if (q6 instanceof InterfaceC0004e) {
                    interfaceC0004e = (InterfaceC0004e) q6;
                } else {
                    interfaceC0004e = null;
                }
                if (interfaceC0004e != null && (l02 = interfaceC0004e.l0()) != null) {
                    C0725e name = M02.getName();
                    o6.j.d(name, "getName(...)");
                    if (l02.a(name)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean b(InterfaceC0010k interfaceC0010k) {
        o6.j.e(interfaceC0010k, "<this>");
        if ((interfaceC0010k instanceof InterfaceC0004e) && (((InterfaceC0004e) interfaceC0010k).l0() instanceof C0020v)) {
            return true;
        }
        return false;
    }

    public static final boolean c(AbstractC1759v abstractC1759v) {
        o6.j.e(abstractC1759v, "<this>");
        InterfaceC0007h c6 = abstractC1759v.B0().c();
        if (c6 != null) {
            return b(c6);
        }
        return false;
    }

    public static final boolean d(InterfaceC0010k interfaceC0010k) {
        o6.j.e(interfaceC0010k, "<this>");
        if ((interfaceC0010k instanceof InterfaceC0004e) && (((InterfaceC0004e) interfaceC0010k).l0() instanceof B)) {
            return true;
        }
        return false;
    }

    public static final boolean e(W w8) {
        InterfaceC0004e interfaceC0004e;
        C0020v c0020v;
        if (w8.M() == null) {
            InterfaceC0010k q6 = w8.q();
            C0725e c0725e = null;
            if (q6 instanceof InterfaceC0004e) {
                interfaceC0004e = (InterfaceC0004e) q6;
            } else {
                interfaceC0004e = null;
            }
            if (interfaceC0004e != null) {
                int i4 = AbstractC1098d.f12556a;
                U l02 = interfaceC0004e.l0();
                if (l02 instanceof C0020v) {
                    c0020v = (C0020v) l02;
                } else {
                    c0020v = null;
                }
                if (c0020v != null) {
                    c0725e = c0020v.f774a;
                }
            }
            if (o6.j.a(c0725e, w8.getName())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean f(InterfaceC0010k interfaceC0010k) {
        o6.j.e(interfaceC0010k, "<this>");
        if (!b(interfaceC0010k) && !d(interfaceC0010k)) {
            return false;
        }
        return true;
    }

    public static final boolean g(AbstractC1759v abstractC1759v) {
        InterfaceC0007h c6 = abstractC1759v.B0().c();
        if (c6 != null) {
            return f(c6);
        }
        return false;
    }

    public static final boolean h(AbstractC1759v abstractC1759v) {
        o6.j.e(abstractC1759v, "<this>");
        InterfaceC0007h c6 = abstractC1759v.B0().c();
        if (c6 != null && d(c6) && !w7.U.e(abstractC1759v)) {
            return true;
        }
        return false;
    }

    public static final z i(AbstractC1759v abstractC1759v) {
        InterfaceC0004e interfaceC0004e;
        C0020v c0020v;
        o6.j.e(abstractC1759v, "<this>");
        InterfaceC0007h c6 = abstractC1759v.B0().c();
        if (c6 instanceof InterfaceC0004e) {
            interfaceC0004e = (InterfaceC0004e) c6;
        } else {
            interfaceC0004e = null;
        }
        if (interfaceC0004e != null) {
            int i4 = AbstractC1098d.f12556a;
            U l02 = interfaceC0004e.l0();
            if (l02 instanceof C0020v) {
                c0020v = (C0020v) l02;
            } else {
                c0020v = null;
            }
            if (c0020v != null) {
                return (z) c0020v.f775b;
            }
        }
        return null;
    }
}
