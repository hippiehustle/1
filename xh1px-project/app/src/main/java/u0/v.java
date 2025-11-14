package u0;

import L7.AbstractC0166y;
import L7.C0150h;
import L7.InterfaceC0163v;
import d6.AbstractC0615a;
import d6.C0618d;
import d6.InterfaceC0617c;
import d6.InterfaceC0619e;
import d6.InterfaceC0620f;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class v extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f15284h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f15285i;
    public final /* synthetic */ u j;
    public final /* synthetic */ C0150h k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f15286l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(u uVar, C0150h c0150h, w wVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = uVar;
        this.k = c0150h;
        this.f15286l = wVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((v) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        v vVar = new v(this.j, this.k, this.f15286l, interfaceC0617c);
        vVar.f15285i = obj;
        return vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0617c interfaceC0617c;
        int i4 = this.f15284h;
        if (i4 != 0) {
            if (i4 == 1) {
                interfaceC0617c = (InterfaceC0617c) this.f15285i;
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            InterfaceC0620f B8 = ((InterfaceC0163v) this.f15285i).p().B(C0618d.f10447d);
            o6.j.b(B8);
            InterfaceC0619e interfaceC0619e = (InterfaceC0619e) B8;
            x xVar = new x(interfaceC0619e);
            InterfaceC0622h D7 = E2.d.C((AbstractC0615a) interfaceC0619e, xVar).D(new Q7.v(Integer.valueOf(System.identityHashCode(xVar)), this.j.f15283i));
            interfaceC0617c = this.k;
            this.f15285i = interfaceC0617c;
            this.f15284h = 1;
            obj = AbstractC0166y.A(D7, this.f15286l, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (obj == enumC0646a) {
                return enumC0646a;
            }
        }
        interfaceC0617c.k(obj);
        return Z5.y.f7506a;
    }
}
