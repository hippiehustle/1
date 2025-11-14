package L4;

import F4.l;
import F4.s;
import L7.AbstractC0166y;
import L7.F;
import L7.InterfaceC0163v;
import L7.k0;
import O7.i0;
import Z5.y;
import a6.t;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import l1.C0999a;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class h extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f2914h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2915i;
    public final /* synthetic */ j j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i4, j jVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f2915i = i4;
        this.j = jVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((h) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new h(this.f2915i, this.j, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
    
        if (r11 == r2) goto L26;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Object obj2;
        j jVar = this.j;
        i0 i0Var = jVar.k;
        int i4 = this.f2914h;
        y yVar = y.f7506a;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            F4.j jVar2 = jVar.f2922e;
            i0 i0Var2 = jVar2.f1391d;
            F4.h hVar = (F4.h) i0Var2.f();
            if (hVar != null) {
                H4.c cVar = hVar.f1385b.f1741b;
                k0 k0Var = cVar.f2015i;
                if (k0Var != null) {
                    k0Var.d(null);
                }
                cVar.f2015i = null;
                i0 i0Var3 = cVar.f2008b;
                Boolean bool = Boolean.FALSE;
                i0Var3.getClass();
                i0Var3.h(null, bool);
                i0 i0Var4 = cVar.f2010d;
                i0Var4.getClass();
                i0Var4.h(null, 0);
                i0 i0Var5 = cVar.f2011e;
                i0Var5.getClass();
                i0Var5.h(null, 0);
                cVar.f2009c.g(null);
                i0 i0Var6 = cVar.f2013g;
                i0Var6.getClass();
                i0Var6.h(null, t.f7767d);
            }
            jVar2.f1389b.f2386b.clear();
            jVar2.f1393f.g(null);
            i0Var2.g(null);
            jVar.f2919b.e();
            this.f2914h = 1;
            Integer num = (Integer) i0Var.f();
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (num != null) {
                int intValue = num.intValue();
                C0999a c0999a = jVar.f2926i;
                if (c0999a != null) {
                    s sVar = jVar.f2921d;
                    sVar.getClass();
                    S7.e eVar = F.f3175a;
                    obj2 = AbstractC0166y.A(S7.d.f5456f, new l(sVar, intValue, c0999a, null), this);
                    if (obj2 != enumC0646a) {
                        obj2 = yVar;
                    }
                }
            }
            obj2 = yVar;
            if (obj2 == enumC0646a) {
                return enumC0646a;
            }
        }
        i0Var.g(null);
        return yVar;
    }
}
