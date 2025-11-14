package X;

import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.concurrent.atomic.AtomicInteger;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class G extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public o6.s f6650h;

    /* renamed from: i, reason: collision with root package name */
    public int f6651i;
    public /* synthetic */ Object j;
    public final /* synthetic */ o6.s k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H f6652l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6653m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f6654n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(o6.s sVar, H h8, Object obj, boolean z8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.k = sVar;
        this.f6652l = h8;
        this.f6653m = obj;
        this.f6654n = z8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((G) p((InterfaceC0617c) obj2, (Q) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        G g8 = new G(this.k, this.f6652l, this.f6653m, this.f6654n, interfaceC0617c);
        g8.j = obj;
        return g8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r5.b(r1, r7) == r6) goto L16;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Q q6;
        o6.s sVar;
        int i4;
        int i8 = this.f6651i;
        Object obj2 = this.f6653m;
        H h8 = this.f6652l;
        o6.s sVar2 = this.k;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    Z5.a.d(obj);
                    if (this.f6654n) {
                        C1.f fVar = h8.k;
                        if (obj2 != null) {
                            i4 = obj2.hashCode();
                        } else {
                            i4 = 0;
                        }
                        fVar.d(new C0334b(obj2, i4, sVar2.f13640d));
                    }
                    return Z5.y.f7506a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = this.f6650h;
            q6 = (Q) this.j;
            Z5.a.d(obj);
        } else {
            Z5.a.d(obj);
            Q q8 = (Q) this.j;
            b0 h9 = h8.h();
            this.j = q8;
            this.f6650h = sVar2;
            this.f6651i = 1;
            Integer num = new Integer(((AtomicInteger) h9.f6714b.f6486e).incrementAndGet());
            if (num != enumC0646a) {
                q6 = q8;
                obj = num;
                sVar = sVar2;
            }
            return enumC0646a;
        }
        sVar.f13640d = ((Number) obj).intValue();
        this.j = null;
        this.f6650h = null;
        this.f6651i = 2;
    }
}
