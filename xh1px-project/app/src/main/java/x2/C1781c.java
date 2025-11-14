package x2;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;
import y2.p;

/* renamed from: x2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1781c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f16097h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f16098i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1781c(f fVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f16098i = fVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1781c) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1781c(this.f16098i, interfaceC0617c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Object P4;
        int i4 = this.f16097h;
        y yVar = y.f7506a;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return yVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        p pVar = this.f16098i.f16103a;
        this.f16097h = 1;
        boolean r8 = h2.a.r();
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (!r8 || (P4 = pVar.f16492a.P(new AbstractC0720j(2, null), this)) != enumC0646a) {
            P4 = yVar;
        }
        if (P4 == enumC0646a) {
            return enumC0646a;
        }
        return yVar;
    }
}
