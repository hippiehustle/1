package p3;

import L7.InterfaceC0163v;
import Y3.z;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;
import o4.C1254C;

/* renamed from: p3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1306b extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f13710h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1309e f13711i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306b(C1309e c1309e, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13711i = c1309e;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1306b) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1306b(this.f13711i, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r8.x(r1, r7) == r5) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r8.x(r2, r7) == r5) goto L15;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        C1309e c1309e = this.f13711i;
        A4.d dVar = c1309e.f13717B;
        int i4 = this.f13710h;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    Z5.a.d(obj);
                    return y.f7506a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z5.a.d(obj);
        } else {
            Z5.a.d(obj);
            z zVar = ((C1312h) dVar.getValue()).f13725b;
            C1305a c1305a = new C1305a(c1309e, 0);
            this.f13710h = 1;
        }
        C1254C c1254c = ((C1312h) dVar.getValue()).f13726c;
        C1305a c1305a2 = new C1305a(c1309e, 1);
        this.f13710h = 2;
    }
}
