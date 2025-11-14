package o3;

import D4.C0040p;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: o3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1238i extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f13456h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1243n f13457i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1238i(C1243n c1243n, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13457i = c1243n;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1238i) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1238i(this.f13457i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f13456h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C1243n c1243n = this.f13457i;
            C0040p c0040p = c1243n.h0().f13494g;
            C1236g c1236g = new C1236g(c1243n, 1);
            this.f13456h = 1;
            Object x8 = c0040p.x(c1236g, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
