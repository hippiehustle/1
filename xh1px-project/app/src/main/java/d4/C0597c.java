package d4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: d4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f10372h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0600f f10373i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0597c(C0600f c0600f, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f10373i = c0600f;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C0597c c0597c = (C0597c) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c0597c.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0597c c0597c = new C0597c(this.f10373i, interfaceC0617c);
        c0597c.f10372h = obj;
        return c0597c;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f10372h;
        Z5.a.d(obj);
        AbstractC0166y.q(interfaceC0163v, null, null, new C0596b(this.f10373i, null), 3);
        return y.f7506a;
    }
}
