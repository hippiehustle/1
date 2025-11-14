package x4;

import L7.F;
import L7.InterfaceC0163v;
import Q7.n;
import Z5.y;
import android.graphics.Bitmap;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import j2.C0902b;
import java.util.concurrent.CancellationException;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import q1.e;
import u6.AbstractC1638C;

/* renamed from: x4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1790c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f16131h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f16132i;
    public final /* synthetic */ C0902b j;
    public final /* synthetic */ InterfaceC1163b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1790c(e eVar, C0902b c0902b, InterfaceC1163b interfaceC1163b, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f16132i = eVar;
        this.j = c0902b;
        this.k = interfaceC1163b;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1790c) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1790c(this.f16132i, this.j, this.k, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (L7.AbstractC0166y.A(r0, r4, r7) == r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (L7.AbstractC0166y.A(r8, r0, r7) != r6) goto L23;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        int i4 = this.f16131h;
        InterfaceC1163b interfaceC1163b = this.k;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        try {
        } catch (CancellationException unused) {
            S7.e eVar = F.f3175a;
            M7.e eVar2 = n.f4962a;
            C1789b c1789b = new C1789b(null, interfaceC1163b);
            this.f16131h = 3;
        }
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                }
                return y.f7506a;
            }
            Z5.a.d(obj);
        } else {
            Z5.a.d(obj);
            e eVar3 = this.f16132i;
            C0902b c0902b = this.j;
            this.f16131h = 1;
            obj = AbstractC1638C.w(eVar3, c0902b);
            if (obj == enumC0646a) {
                return enumC0646a;
            }
        }
        S7.e eVar4 = F.f3175a;
        M7.e eVar5 = n.f4962a;
        C1788a c1788a = new C1788a(interfaceC1163b, (Bitmap) obj, null);
        this.f16131h = 2;
    }
}
