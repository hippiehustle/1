package r2;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import L7.k0;
import O7.i0;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class i extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f14291h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f14292i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14292i = jVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((i) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new i(this.f14292i, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r1 == r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r8.e(r7) == r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        if (r8.v(r7) == r6) goto L22;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        int i4 = this.f14291h;
        y yVar = y.f7506a;
        j jVar = this.f14292i;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        Z5.a.d(obj);
                        Q7.d dVar = jVar.k;
                        if (dVar != null) {
                            AbstractC0166y.e(dVar);
                        }
                        jVar.k = null;
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
                i0 i0Var = jVar.f14305o;
                this.f14291h = 3;
                i0Var.n(k.f14308d, this);
            } else {
                Z5.a.d(obj);
            }
        } else {
            Z5.a.d(obj);
            k0 k0Var = jVar.f14303m;
            if (k0Var != null) {
                this.f14291h = 1;
            }
        }
        Y1.d dVar2 = jVar.f14294b;
        dVar2.f7102c.remove(jVar.f14304n);
        a2.h hVar = jVar.f14297e;
        this.f14291h = 2;
    }
}
