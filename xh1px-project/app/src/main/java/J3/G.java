package J3;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class G extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f2411h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ H f2412i;
    public final /* synthetic */ long j;
    public final /* synthetic */ C0076a k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(H h8, long j, C0076a c0076a, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f2412i = h8;
        this.j = j;
        this.k = c0076a;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((G) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new G(this.f2412i, this.j, this.k, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (L7.AbstractC0166y.A(r7, r0, r6) == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r7 == r3) goto L17;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        int i4 = this.f2411h;
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
            H3.n nVar = this.f2412i.f2414c;
            this.f2411h = 1;
            obj = nVar.e(this.j, this);
        }
        if (((Boolean) obj).booleanValue()) {
            S7.e eVar = L7.F.f3175a;
            M7.e eVar2 = Q7.n.f4962a;
            F f8 = new F(this.k, null);
            this.f2411h = 2;
        }
        return Z5.y.f7506a;
    }
}
