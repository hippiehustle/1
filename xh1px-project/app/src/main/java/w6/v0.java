package w6;

import C6.InterfaceC0002c;
import C6.InterfaceC0019u;
import F6.AbstractC0054n;
import a6.AbstractC0436k;
import f7.C0725e;
import h7.C0845h;
import java.util.List;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0845h f15919a = C0845h.f11446c;

    public static void a(InterfaceC0002c interfaceC0002c, StringBuilder sb) {
        boolean z8;
        F6.w g8 = y0.g(interfaceC0002c);
        F6.w M8 = interfaceC0002c.M();
        if (g8 != null) {
            sb.append(d(g8.b()));
            sb.append(".");
        }
        if (g8 != null && M8 != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            sb.append("(");
        }
        if (M8 != null) {
            sb.append(d(M8.b()));
            sb.append(".");
        }
        if (z8) {
            sb.append(")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String b(InterfaceC0019u interfaceC0019u) {
        o6.j.e(interfaceC0019u, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        a(interfaceC0019u, sb);
        C0725e name = ((AbstractC0054n) interfaceC0019u).getName();
        o6.j.d(name, "getName(...)");
        sb.append(f15919a.M(name, true));
        List z02 = interfaceC0019u.z0();
        o6.j.d(z02, "getValueParameters(...)");
        AbstractC0436k.u0(z02, sb, ", ", "(", ")", C1715b.k, 48);
        sb.append(": ");
        AbstractC1759v r8 = interfaceC0019u.r();
        o6.j.b(r8);
        sb.append(d(r8));
        return sb.toString();
    }

    public static String c(C6.M m6) {
        String str;
        o6.j.e(m6, "descriptor");
        StringBuilder sb = new StringBuilder();
        if (m6.H()) {
            str = "var ";
        } else {
            str = "val ";
        }
        sb.append(str);
        a(m6, sb);
        C0725e name = m6.getName();
        o6.j.d(name, "getName(...)");
        sb.append(f15919a.M(name, true));
        sb.append(": ");
        AbstractC1759v b4 = m6.b();
        o6.j.d(b4, "getType(...)");
        sb.append(d(b4));
        return sb.toString();
    }

    public static String d(AbstractC1759v abstractC1759v) {
        o6.j.e(abstractC1759v, "type");
        return f15919a.V(abstractC1759v);
    }
}
