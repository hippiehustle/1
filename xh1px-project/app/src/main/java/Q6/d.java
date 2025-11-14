package Q6;

import C6.A;
import F6.U;
import a.AbstractC0405a;
import n6.InterfaceC1163b;
import w7.AbstractC1759v;
import y7.k;
import y7.l;
import z6.m;

/* loaded from: classes.dex */
public final class d implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public static final d f4917d = new Object();

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        AbstractC1759v b4;
        A a3 = (A) obj;
        Object obj2 = e.f4918a;
        o6.j.e(a3, "module");
        U z8 = AbstractC0405a.z(c.f4914b, a3.o().j(m.f16786t));
        if (z8 != null && (b4 = z8.b()) != null) {
            return b4;
        }
        return l.c(k.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]);
    }
}
