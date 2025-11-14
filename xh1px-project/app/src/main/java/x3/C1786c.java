package x3;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;
import w3.C1692a;
import w3.C1694c;
import w3.C1695d;

/* renamed from: x3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1786c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f16118h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1787d f16119i;
    public final /* synthetic */ long j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1786c(C1787d c1787d, long j, boolean z8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f16119i = c1787d;
        this.j = j;
        this.k = z8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1786c) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1786c(this.f16119i, this.j, this.k, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f16118h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C1695d c1695d = this.f16119i.f16124e;
            C1692a c1692a = new C1692a(this.j, this.k);
            this.f16118h = 1;
            Object P4 = c1695d.f15686a.P(new C1694c(c1692a, null), this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (P4 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
