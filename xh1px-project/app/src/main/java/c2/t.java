package c2;

import T1.C;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import k2.AbstractC0951a;
import k2.C0952b;
import k2.C0953c;
import kotlin.NoWhenBranchMatchedException;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class t extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9577h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f9578i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(long j, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f9578i = j;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((t) p((InterfaceC0617c) obj2, (AbstractC0951a) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        t tVar = new t(this.f9578i, interfaceC0617c);
        tVar.f9577h = obj;
        return tVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        T1.x xVar;
        AbstractC0951a abstractC0951a = (AbstractC0951a) this.f9577h;
        Z5.a.d(obj);
        o6.j.e(abstractC0951a, "<this>");
        if (abstractC0951a instanceof C0952b) {
            C0952b c0952b = (C0952b) abstractC0951a;
            long j = c0952b.f11959a.f12187a;
            long j5 = c0952b.f11960b.f12187a;
            String str = c0952b.f11961c;
            int i4 = c0952b.f11962d;
            int i8 = c0952b.f11966h;
            boolean z8 = c0952b.f11967i;
            xVar = new T1.x(j, j5, str, i4, i8, c0952b.f11965g, C.f5507d, Boolean.valueOf(z8));
        } else if (abstractC0951a instanceof C0953c) {
            C0953c c0953c = (C0953c) abstractC0951a;
            xVar = new T1.x(c0953c.f11968a.f12187a, c0953c.f11969b.f12187a, c0953c.f11970c, c0953c.f11971d, -1, c0953c.f11974g, C.f5508e, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        xVar.f5653b = this.f9578i;
        return xVar;
    }
}
