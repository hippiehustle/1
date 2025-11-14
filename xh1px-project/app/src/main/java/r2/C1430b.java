package r2;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: r2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1430b extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f14268h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f14269i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1430b(j jVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14269i = jVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1430b) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1430b(this.f14269i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f14268h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            this.f14268h = 1;
            Object a3 = j.a(this.f14269i, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (a3 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
