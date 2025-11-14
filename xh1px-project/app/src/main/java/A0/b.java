package A0;

import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;
import u0.C1617h;
import u0.u;
import u0.y;
import u0.z;

/* loaded from: classes.dex */
public final class b extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public y f189h;

    /* renamed from: i, reason: collision with root package name */
    public int f190i;
    public /* synthetic */ Object j;
    public final /* synthetic */ boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f191l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n2.h f192m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z8, u uVar, InterfaceC0617c interfaceC0617c, n2.h hVar) {
        super(2, interfaceC0617c);
        this.k = z8;
        this.f191l = uVar;
        this.f192m = hVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((b) p((InterfaceC0617c) obj2, (z) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        b bVar = new b(this.k, this.f191l, interfaceC0617c, this.f192m);
        bVar.j = obj;
        return bVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        z zVar;
        y yVar;
        z zVar2;
        int i4 = this.f190i;
        n2.h hVar = this.f192m;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 != 0) {
            u uVar = this.f191l;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            Object obj2 = this.j;
                            Z5.a.d(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                C1617h e9 = uVar.e();
                                e9.f15231b.e(e9.f15234e, e9.f15235f);
                            }
                            return obj2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Z5.a.d(obj);
                    return obj;
                }
                yVar = this.f189h;
                zVar2 = (z) this.j;
                Z5.a.d(obj);
            } else {
                yVar = this.f189h;
                zVar = (z) this.j;
                Z5.a.d(obj);
                if (!((Boolean) obj).booleanValue()) {
                    C1617h e10 = uVar.e();
                    this.j = zVar;
                    this.f189h = yVar;
                    this.f190i = 2;
                    if (e10.a(this) != enumC0646a) {
                        zVar2 = zVar;
                    }
                    return enumC0646a;
                }
            }
            zVar = zVar2;
        } else {
            Z5.a.d(obj);
            zVar = (z) this.j;
            if (this.k) {
                yVar = y.f15292d;
            } else {
                o6.j.c(zVar, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return hVar.m(((w0.y) zVar).c());
            }
        }
        a aVar = new a(null, hVar);
        this.j = zVar;
        this.f189h = null;
        this.f190i = 3;
        Object d2 = zVar.d(yVar, aVar, this);
        if (d2 == enumC0646a) {
            return enumC0646a;
        }
        return d2;
    }
}
