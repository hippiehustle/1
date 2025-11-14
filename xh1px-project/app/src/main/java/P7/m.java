package P7;

import L7.InterfaceC0163v;
import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class m extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4663h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4664i;
    public final /* synthetic */ n j;
    public final /* synthetic */ InterfaceC0234g k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = nVar;
        this.k = interfaceC0234g;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((m) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        m mVar = new m(this.j, this.k, interfaceC0617c);
        mVar.f4664i = obj;
        return mVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o6.u] */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f4663h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f4664i;
            ?? obj2 = new Object();
            n nVar = this.j;
            InterfaceC0233f interfaceC0233f = nVar.f4652g;
            l lVar = new l((o6.u) obj2, interfaceC0163v, nVar, this.k);
            this.f4663h = 1;
            Object x8 = interfaceC0233f.x(lVar, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
