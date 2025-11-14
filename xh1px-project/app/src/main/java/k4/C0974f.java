package k4;

import L7.InterfaceC0163v;
import android.graphics.Bitmap;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1162a;
import n6.InterfaceC1164c;

/* renamed from: k4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0974f extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0969a f12091h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Bitmap f12092i;
    public final /* synthetic */ C0977i j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0974f(C0969a c0969a, Bitmap bitmap, C0977i c0977i, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12091h = c0969a;
        this.f12092i = bitmap;
        this.j = c0977i;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C0974f c0974f = (C0974f) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        c0974f.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0974f(this.f12091h, this.f12092i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        this.f12091h.m(this.f12092i);
        J2.b bVar = this.j.f12099d;
        bVar.getClass();
        InterfaceC1162a interfaceC1162a = (InterfaceC1162a) bVar.f2387c.get(J2.a.k);
        if (interfaceC1162a != null) {
            interfaceC1162a.a();
        }
        return Z5.y.f7506a;
    }
}
