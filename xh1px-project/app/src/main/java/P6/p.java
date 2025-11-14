package P6;

import C6.InterfaceC0001b;
import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0019u;
import F6.AbstractC0054n;
import a.AbstractC0405a;
import f7.C0725e;
import i7.InterfaceC0891f;
import java.util.ArrayList;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class p implements InterfaceC0891f {
    @Override // i7.InterfaceC0891f
    public final int a() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (P6.F.j.contains(r2) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        if (o6.j.a(r9, D2.f.e(r0, 2)) != false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // i7.InterfaceC0891f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(InterfaceC0001b interfaceC0001b, InterfaceC0001b interfaceC0001b2, InterfaceC0004e interfaceC0004e) {
        InterfaceC0019u interfaceC0019u;
        o6.j.e(interfaceC0001b, "superDescriptor");
        o6.j.e(interfaceC0001b2, "subDescriptor");
        if ((interfaceC0001b instanceof InterfaceC0002c) && (interfaceC0001b2 instanceof InterfaceC0019u) && !z6.h.A(interfaceC0001b2)) {
            int i4 = AbstractC0282e.f4559l;
            InterfaceC0019u interfaceC0019u2 = (InterfaceC0019u) interfaceC0001b2;
            AbstractC0054n abstractC0054n = (AbstractC0054n) interfaceC0019u2;
            C0725e name = abstractC0054n.getName();
            o6.j.d(name, "getName(...)");
            if (!AbstractC0282e.b(name)) {
                ArrayList arrayList = F.f4534a;
                C0725e name2 = abstractC0054n.getName();
                o6.j.d(name2, "getName(...)");
            }
            InterfaceC0002c v8 = AbstractC1492c.v((InterfaceC0002c) interfaceC0001b);
            boolean z8 = interfaceC0001b instanceof InterfaceC0019u;
            if (z8) {
                interfaceC0019u = (InterfaceC0019u) interfaceC0001b;
            } else {
                interfaceC0019u = null;
            }
            if ((interfaceC0019u != null && interfaceC0019u2.g0() == interfaceC0019u.g0()) || (v8 != null && interfaceC0019u2.g0())) {
                if ((interfaceC0004e instanceof R6.c) && interfaceC0019u2.y() == null && v8 != null && !AbstractC1492c.w(interfaceC0004e, v8)) {
                    if ((v8 instanceof InterfaceC0019u) && z8 && AbstractC0282e.a((InterfaceC0019u) v8) != null) {
                        String e9 = D2.f.e(interfaceC0019u2, 2);
                        InterfaceC0019u a3 = ((InterfaceC0019u) interfaceC0001b).a();
                        o6.j.d(a3, "getOriginal(...)");
                    }
                }
            }
            return 2;
        }
        if (AbstractC0405a.u(interfaceC0001b, interfaceC0001b2)) {
            return 2;
        }
        return 3;
    }
}
