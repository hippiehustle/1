package X;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class B extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f6639h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ H f6640i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(H h8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f6640i = h8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((B) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new B(this.f6640i, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r7 == r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        if (r0.i(r6) == r5) goto L22;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        H h8 = this.f6640i;
        C1.f fVar = h8.k;
        int i4 = this.f6639h;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        Z5.a.d(obj);
                        return (c0) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
            } else {
                Z5.a.d(obj);
                if (fVar.b() instanceof S) {
                    return fVar.b();
                }
                this.f6639h = 1;
            }
            this.f6639h = 2;
            obj = H.e(h8, false, this);
        } catch (Throwable th) {
            return new U(th, -1);
        }
    }
}
