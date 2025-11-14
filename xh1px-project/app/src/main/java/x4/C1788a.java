package x4;

import L7.InterfaceC0163v;
import Z5.y;
import android.graphics.Bitmap;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;

/* renamed from: x4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1788a extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1163b f16128h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Bitmap f16129i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1788a(InterfaceC1163b interfaceC1163b, Bitmap bitmap, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f16128h = interfaceC1163b;
        this.f16129i = bitmap;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1788a c1788a = (C1788a) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c1788a.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1788a(this.f16128h, this.f16129i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        this.f16128h.m(this.f16129i);
        return y.f7506a;
    }
}
