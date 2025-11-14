package P7;

import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.C0623i;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import n6.InterfaceC1164c;
import n6.InterfaceC1165d;

/* renamed from: P7.b */
/* loaded from: classes.dex */
public abstract class AbstractC0285b {

    /* renamed from: a */
    public static final InterfaceC0617c[] f4639a = new InterfaceC0617c[0];

    /* renamed from: b */
    public static final Q7.t f4640b = new Q7.t("NULL", 0);

    /* renamed from: c */
    public static final Q7.t f4641c = new Q7.t("UNINITIALIZED", 0);

    /* renamed from: d */
    public static final Q7.t f4642d = new Q7.t("DONE", 0);

    public static final Object a(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c, InterfaceC1165d interfaceC1165d, InterfaceC0233f[] interfaceC0233fArr) {
        r rVar = new r(interfaceC0234g, null, interfaceC1165d, interfaceC0233fArr);
        Q7.q qVar = new Q7.q(interfaceC0617c, interfaceC0617c.h());
        Object L8 = D2.f.L(qVar, true, qVar, rVar);
        if (L8 == EnumC0646a.f10656d) {
            return L8;
        }
        return Z5.y.f7506a;
    }

    public static /* synthetic */ InterfaceC0233f b(v vVar, InterfaceC0622h interfaceC0622h, int i4, N7.a aVar, int i8) {
        if ((i8 & 1) != 0) {
            interfaceC0622h = C0623i.f10448d;
        }
        if ((i8 & 2) != 0) {
            i4 = -3;
        }
        if ((i8 & 4) != 0) {
            aVar = N7.a.f3795d;
        }
        return vVar.m(interfaceC0622h, i4, aVar);
    }

    public static final Object c(InterfaceC0622h interfaceC0622h, Object obj, Object obj2, InterfaceC1164c interfaceC1164c, InterfaceC0617c interfaceC0617c) {
        Object l6;
        Object n3 = Q7.b.n(interfaceC0622h, obj2);
        try {
            C c6 = new C(interfaceC0617c, interfaceC0622h);
            if (interfaceC1164c == null) {
                l6 = E2.c.I0(interfaceC1164c, obj, c6);
            } else {
                o6.y.c(2, interfaceC1164c);
                l6 = interfaceC1164c.l(obj, c6);
            }
            Q7.b.g(interfaceC0622h, n3);
            if (l6 == EnumC0646a.f10656d) {
                o6.j.e(interfaceC0617c, "frame");
            }
            return l6;
        } catch (Throwable th) {
            Q7.b.g(interfaceC0622h, n3);
            throw th;
        }
    }
}
