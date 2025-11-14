package P1;

import L7.InterfaceC0163v;
import O7.i0;
import Z5.y;
import android.util.Log;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class p extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4475h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f4476i;
    public final /* synthetic */ i0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j, i0 i0Var, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f4476i = j;
        this.j = i0Var;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((p) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new p(this.f4476i, this.j, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (L7.AbstractC0166y.h(r7.f4476i, r7) == r4) goto L16;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        int i4 = this.f4475h;
        y yVar = y.f7506a;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    Z5.a.d(obj);
                    return yVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z5.a.d(obj);
        } else {
            Z5.a.d(obj);
            this.f4475h = 1;
        }
        Log.i("QualityManager", "Grace period expired, quality is back to High");
        this.f4475h = 2;
        this.j.n(d.f4456b, this);
        if (yVar == enumC0646a) {
            return enumC0646a;
        }
        return yVar;
    }
}
