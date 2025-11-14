package q2;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;
import o2.C1229a;

/* renamed from: q2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1359e extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public C1365k f13949h;

    /* renamed from: i, reason: collision with root package name */
    public int f13950i;
    public final /* synthetic */ C1365k j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1359e(C1365k c1365k, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = c1365k;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1359e) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1359e(this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        C1365k c1365k;
        int i4 = this.f13950i;
        if (i4 != 0) {
            if (i4 == 1) {
                c1365k = this.f13949h;
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            c1365k = this.j;
            Long l6 = (Long) c1365k.f13969h.f();
            if (l6 != null) {
                long longValue = l6.longValue();
                C1229a c1229a = c1365k.f13962a;
                this.f13949h = c1365k;
                this.f13950i = 1;
                obj = c1229a.f13440a.d(longValue, this);
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (obj == enumC0646a) {
                    return enumC0646a;
                }
            }
            return y.f7506a;
        }
        p2.e eVar = (p2.e) obj;
        if (eVar != null) {
            c1365k.b(eVar);
        }
        return y.f7506a;
    }
}
