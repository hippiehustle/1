package h3;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;
import q2.C1365k;

/* renamed from: h3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0825m extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0826n f11357h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0825m(C0826n c0826n, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f11357h = c0826n;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C0825m c0825m = (C0825m) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c0825m.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0825m(this.f11357h, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        C0826n c0826n = this.f11357h;
        C1365k c1365k = c0826n.f11359c;
        if (((Boolean) c0826n.f11362f.f()).booleanValue()) {
            c1365k.c();
        } else {
            c1365k.a();
        }
        return y.f7506a;
    }
}
