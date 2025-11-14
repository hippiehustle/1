package h3;

import L7.F;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import l1.C0999a;
import n6.InterfaceC1162a;
import n6.InterfaceC1164c;

/* renamed from: h3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0823k extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f11354h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0826n f11355i;
    public final /* synthetic */ C0999a j;
    public final /* synthetic */ InterfaceC1162a k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0823k(C0826n c0826n, C0999a c0999a, InterfaceC1162a interfaceC1162a, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f11355i = c0826n;
        this.j = c0999a;
        this.k = interfaceC1162a;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0823k) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0823k(this.f11355i, this.j, this.k, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (L7.AbstractC0166y.A(r7, r0, r6) == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (r7 == r3) goto L17;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        int i4 = this.f11354h;
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
            g3.e eVar = this.f11355i.f11358b;
            long j = this.j.f12187a;
            this.f11354h = 1;
            obj = eVar.d(j, this);
        }
        if (((Boolean) obj).booleanValue()) {
            S7.e eVar2 = F.f3175a;
            M7.e eVar3 = Q7.n.f4962a;
            C0822j c0822j = new C0822j(this.k, null);
            this.f11354h = 2;
        }
        return y.f7506a;
    }
}
