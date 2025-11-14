package J3;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class y extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f2478h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ H f2479i;
    public final /* synthetic */ C0077b j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(H h8, C0077b c0077b, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f2479i = h8;
        this.j = c0077b;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((y) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new y(this.f2479i, this.j, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (L7.AbstractC0166y.A(r0, r2, r6) == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r7 == r3) goto L15;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        int i4 = this.f2478h;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    Z5.a.d(obj);
                    return Z5.y.f7506a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z5.a.d(obj);
        } else {
            Z5.a.d(obj);
            H3.n nVar = this.f2479i.f2414c;
            this.f2478h = 1;
            obj = nVar.b(this);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        S7.e eVar = L7.F.f3175a;
        M7.e eVar2 = Q7.n.f4962a;
        x xVar = new x(this.j, booleanValue, null);
        this.f2478h = 2;
    }
}
