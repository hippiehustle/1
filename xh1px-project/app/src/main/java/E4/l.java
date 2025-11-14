package E4;

import L7.F;
import L7.InterfaceC0163v;
import Z5.y;
import android.graphics.Bitmap;
import android.graphics.Rect;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import j2.C0902b;
import java.util.concurrent.CancellationException;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class l extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f1235h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f1236i;
    public final /* synthetic */ C0902b j;
    public final /* synthetic */ InterfaceC1163b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, C0902b c0902b, InterfaceC1163b interfaceC1163b, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f1236i = nVar;
        this.j = c0902b;
        this.k = interfaceC1163b;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((l) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new l(this.f1236i, this.j, this.k, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (L7.AbstractC0166y.A(r0, r1, r8) == r6) goto L18;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        C0902b c0902b = this.j;
        int i4 = this.f1235h;
        InterfaceC1163b interfaceC1163b = this.k;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        try {
        } catch (CancellationException unused) {
            interfaceC1163b.m(null);
        }
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
            q1.e eVar = this.f1236i.f1240b;
            String str = c0902b.f11793e;
            Rect rect = c0902b.f11794f;
            int width = rect.width();
            int height = rect.height();
            this.f1235h = 1;
            obj = eVar.a(str, width, height);
            if (obj == enumC0646a) {
                return enumC0646a;
            }
        }
        S7.e eVar2 = F.f3175a;
        M7.e eVar3 = Q7.n.f4962a;
        k kVar = new k(interfaceC1163b, (Bitmap) obj, null);
        this.f1235h = 2;
    }
}
