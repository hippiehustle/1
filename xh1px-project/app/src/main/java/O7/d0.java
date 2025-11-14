package O7;

import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1165d;

/* loaded from: classes.dex */
public final class d0 extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public int f4132h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ InterfaceC0234g f4133i;
    public /* synthetic */ int j;
    public final /* synthetic */ f0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, InterfaceC0617c interfaceC0617c) {
        super(3, interfaceC0617c);
        this.k = f0Var;
    }

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        d0 d0Var = new d0(this.k, (InterfaceC0617c) obj3);
        d0Var.f4133i = (InterfaceC0234g) obj;
        d0Var.j = intValue;
        return d0Var.v(Z5.y.f7506a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007f, code lost:
    
        if (r0.n(O7.X.f4111f, r9) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        if (L7.AbstractC0166y.g(Long.MAX_VALUE, r9) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r0.n(O7.X.f4110e, r9) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (r0.n(O7.X.f4109d, r9) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (L7.AbstractC0166y.g(r7, r9) == r6) goto L32;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        InterfaceC0234g interfaceC0234g;
        int i4 = this.f4132h;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            interfaceC0234g = this.f4133i;
                            Z5.a.d(obj);
                            this.f4133i = null;
                            this.f4132h = 5;
                        }
                    } else {
                        interfaceC0234g = this.f4133i;
                        Z5.a.d(obj);
                        this.f4133i = interfaceC0234g;
                        this.f4132h = 4;
                    }
                } else {
                    interfaceC0234g = this.f4133i;
                    Z5.a.d(obj);
                    this.f4133i = interfaceC0234g;
                    this.f4132h = 3;
                }
            }
            Z5.a.d(obj);
        } else {
            Z5.a.d(obj);
            interfaceC0234g = this.f4133i;
            if (this.j > 0) {
                this.f4132h = 1;
            } else {
                long j = this.k.f4137d;
                this.f4133i = interfaceC0234g;
                this.f4132h = 2;
            }
            return enumC0646a;
        }
        return Z5.y.f7506a;
    }
}
