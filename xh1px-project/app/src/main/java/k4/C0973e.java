package k4;

import L7.InterfaceC0163v;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import j2.C0902b;
import n6.InterfaceC1164c;

/* renamed from: k4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0973e extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f12087h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0977i f12088i;
    public final /* synthetic */ Context j;
    public final /* synthetic */ Rect k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Bitmap f12089l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0969a f12090m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0973e(C0977i c0977i, Context context, Rect rect, Bitmap bitmap, C0969a c0969a, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12088i = c0977i;
        this.j = context;
        this.k = rect;
        this.f12089l = bitmap;
        this.f12090m = c0969a;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0973e) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0973e(this.f12088i, this.j, this.k, this.f12089l, this.f12090m, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (L7.AbstractC0166y.A(r0, r2, r6) == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r7 == r3) goto L15;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        int i4 = this.f12087h;
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
            H3.b bVar = this.f12088i.f12098c.f1949d;
            this.f12087h = 1;
            obj = bVar.c(this.j, this.k, this.f12089l, this);
        }
        S7.e eVar = L7.F.f3175a;
        M7.e eVar2 = Q7.n.f4962a;
        C0972d c0972d = new C0972d(this.f12090m, (C0902b) obj, null);
        this.f12087h = 2;
    }
}
