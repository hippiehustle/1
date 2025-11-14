package s7;

import C6.InterfaceC0010k;
import a6.AbstractC0436k;
import a7.I;
import java.util.List;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class q implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final s f14611d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14612e;

    /* renamed from: f, reason: collision with root package name */
    public final I f14613f;

    public q(s sVar, boolean z8, I i4) {
        this.f14611d = sVar;
        this.f14612e = z8;
        this.f14613f = i4;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        List list;
        s sVar = this.f14611d;
        F3.m mVar = sVar.f14620a;
        InterfaceC0010k interfaceC0010k = (InterfaceC0010k) mVar.f1373f;
        C1518i c1518i = (C1518i) mVar.f1371d;
        v a3 = sVar.a(interfaceC0010k);
        if (a3 != null) {
            boolean z8 = this.f14612e;
            I i4 = this.f14613f;
            if (z8) {
                list = AbstractC0436k.Q0(c1518i.f14577e.g(a3, i4));
            } else {
                list = AbstractC0436k.Q0(c1518i.f14577e.l(a3, i4));
            }
        } else {
            list = null;
        }
        if (list == null) {
            return a6.s.f7766d;
        }
        return list;
    }
}
