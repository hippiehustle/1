package q2;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import i.AbstractC0863b;
import n6.InterfaceC1164c;

/* renamed from: q2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1362h extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f13957h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p2.e f13958i;
    public final /* synthetic */ C1365k j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1362h(InterfaceC0617c interfaceC0617c, p2.e eVar, C1365k c1365k) {
        super(2, interfaceC0617c);
        this.f13958i = eVar;
        this.j = c1365k;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1362h) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1362h(interfaceC0617c, this.f13958i, this.j);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f13957h;
        C1365k c1365k = this.j;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            p2.e eVar = this.f13958i;
            C1360f c1360f = new C1360f(null, eVar, c1365k);
            this.f13957h = 1;
            Object s8 = AbstractC0863b.s(eVar, c1360f, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (s8 == enumC0646a) {
                return enumC0646a;
            }
        }
        Q7.d dVar = c1365k.f13965d;
        if (dVar != null) {
            AbstractC0166y.q(dVar, null, null, new C1361g(c1365k, null), 3);
        }
        return y.f7506a;
    }
}
