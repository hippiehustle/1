package x2;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;
import y2.p;

/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1779a extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f16093h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f16094i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1779a(f fVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f16094i = fVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1779a) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1779a(this.f16094i, interfaceC0617c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f16093h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            p pVar = this.f16094i.f16103a;
            this.f16093h = 1;
            Object P4 = pVar.f16492a.P(new AbstractC0720j(2, null), this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (P4 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
