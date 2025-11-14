package k4;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: k4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0976h extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f12095h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0977i f12096i;
    public final /* synthetic */ C0969a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0976h(InterfaceC0617c interfaceC0617c, C0969a c0969a, C0977i c0977i) {
        super(2, interfaceC0617c);
        this.f12096i = c0977i;
        this.j = c0969a;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0976h) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0976h(interfaceC0617c, this.j, this.f12096i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r0.g(r2, r6) == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (L7.AbstractC0166y.g(200, r6) == r3) goto L15;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        int i4 = this.f12095h;
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
            this.f12095h = 1;
        }
        C0977i c0977i = this.f12096i;
        a2.h hVar = c0977i.f12097b;
        C0975g c0975g = new C0975g(null, this.j, c0977i);
        this.f12095h = 2;
    }
}
