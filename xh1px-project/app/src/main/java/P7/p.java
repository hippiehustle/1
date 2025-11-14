package P7;

import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;

/* loaded from: classes.dex */
public final class p implements InterfaceC0234g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N7.h f4669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4670e;

    public p(N7.h hVar, int i4) {
        this.f4669d = hVar;
        this.f4670e = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (L7.AbstractC0166y.C(r0) != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r5.f4669d.b(r0, r7) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // O7.InterfaceC0234g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        o oVar;
        int i4;
        if (interfaceC0617c instanceof o) {
            oVar = (o) interfaceC0617c;
            int i8 = oVar.f4668i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                oVar.f4668i = i8 - Integer.MIN_VALUE;
                Object obj2 = oVar.f4666g;
                i4 = oVar.f4668i;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Z5.a.d(obj2);
                            return Z5.y.f7506a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Z5.a.d(obj2);
                } else {
                    Z5.a.d(obj2);
                    a6.v vVar = new a6.v(this.f4670e, obj);
                    oVar.f4668i = 1;
                }
                oVar.f4668i = 2;
            }
        }
        oVar = new o(this, interfaceC0617c);
        Object obj22 = oVar.f4666g;
        i4 = oVar.f4668i;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        oVar.f4668i = 2;
    }
}
