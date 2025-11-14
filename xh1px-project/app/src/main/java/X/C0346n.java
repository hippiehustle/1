package X;

import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: X.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0346n extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6758h;

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0346n) p((InterfaceC0617c) obj2, (c0) obj)).v(Z5.y.f7506a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f6.j, X.n, d6.c] */
    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        ?? abstractC0720j = new AbstractC0720j(2, interfaceC0617c);
        abstractC0720j.f6758h = obj;
        return abstractC0720j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        return Boolean.valueOf(!(((c0) this.f6758h) instanceof S));
    }
}
