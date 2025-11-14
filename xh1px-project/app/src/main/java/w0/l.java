package w0;

import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class l implements InterfaceC0234g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0234g f15602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u0.u f15603e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f15604f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1163b f15605g;

    public l(InterfaceC0234g interfaceC0234g, u0.u uVar, boolean z8, InterfaceC1163b interfaceC1163b) {
        this.f15602d = interfaceC0234g;
        this.f15603e = uVar;
        this.f15604f = z8;
        this.f15605g = interfaceC1163b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r7.n(r8, r0) != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r8 == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // O7.InterfaceC0234g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        k kVar;
        int i4;
        InterfaceC0234g interfaceC0234g;
        if (interfaceC0617c instanceof k) {
            kVar = (k) interfaceC0617c;
            int i8 = kVar.f15600h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                kVar.f15600h = i8 - Integer.MIN_VALUE;
                Object obj2 = kVar.f15599g;
                i4 = kVar.f15600h;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Z5.a.d(obj2);
                            return Z5.y.f7506a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC0234g = kVar.f15601i;
                    Z5.a.d(obj2);
                } else {
                    Z5.a.d(obj2);
                    interfaceC0234g = this.f15602d;
                    kVar.f15601i = interfaceC0234g;
                    kVar.f15600h = 1;
                    obj2 = D2.f.C(kVar, this.f15605g, this.f15603e, true, this.f15604f);
                }
                kVar.f15601i = null;
                kVar.f15600h = 2;
            }
        }
        kVar = new k(this, interfaceC0617c);
        Object obj22 = kVar.f15599g;
        i4 = kVar.f15600h;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        kVar.f15601i = null;
        kVar.f15600h = 2;
    }
}
