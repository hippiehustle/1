package W4;

import L7.InterfaceC0163v;
import S1.C0290a;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.Objects;
import l1.C0999a;
import l2.C1001a;
import n6.InterfaceC1164c;
import o2.C1229a;

/* loaded from: classes.dex */
public final class p extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f6607h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Z4.i f6608i;
    public final /* synthetic */ x j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Z4.i iVar, x xVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f6608i = iVar;
        this.j = xVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((p) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new p(this.f6608i, this.j, interfaceC0617c);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0088 A[RETURN] */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        int i4 = this.f6607h;
        y yVar = y.f7506a;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    Z5.a.d(obj);
                    return yVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z5.a.d(obj);
            return yVar;
        }
        Z5.a.d(obj);
        Object b4 = this.f6608i.b();
        boolean z8 = b4 instanceof p2.e;
        x xVar = this.j;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (z8) {
            C1229a c1229a = xVar.f6629f;
            p2.e eVar = (p2.e) b4;
            this.f6607h = 1;
            m2.l lVar = c1229a.f13440a;
            lVar.getClass();
            Objects.toString(eVar);
            n2.j jVar = lVar.f12410a;
            long j = eVar.f13699a.f12187a;
            Object C8 = D2.f.C(this, new C0290a(17, j), jVar.f12901a, false, true);
            if (C8 != enumC0646a) {
                C8 = yVar;
            }
            if (C8 != enumC0646a) {
                C8 = yVar;
            }
            if (C8 != enumC0646a) {
                C8 = yVar;
            }
            if (C8 == enumC0646a) {
                return enumC0646a;
            }
            return yVar;
        }
        if (b4 instanceof C1001a) {
            b2.r rVar = xVar.f6628e;
            C0999a c0999a = ((C1001a) b4).f12190a;
            this.f6607h = 2;
            Object e9 = rVar.f9111a.e(c0999a, new A1.o(2, rVar, b2.r.class, "clearRemovedConditionsBitmaps", "clearRemovedConditionsBitmaps(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 11), this);
            if (e9 != enumC0646a) {
                e9 = yVar;
            }
            if (e9 == enumC0646a) {
            }
        }
        return yVar;
    }
}
