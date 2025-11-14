package androidx.lifecycle;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0505p extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f8852h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0506q f8853i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0505p(C0506q c0506q, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f8853i = c0506q;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C0505p c0505p = (C0505p) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        c0505p.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0505p c0505p = new C0505p(this.f8853i, interfaceC0617c);
        c0505p.f8852h = obj;
        return c0505p;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f8852h;
        C0506q c0506q = this.f8853i;
        C0512x c0512x = c0506q.f8854d;
        if (c0512x.f8862d.compareTo(EnumC0504o.f8847e) >= 0) {
            c0512x.a(c0506q);
        } else {
            AbstractC0166y.d(interfaceC0163v.p(), null);
        }
        return Z5.y.f7506a;
    }
}
