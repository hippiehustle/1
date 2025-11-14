package m4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: m4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1092f extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f12507h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f12508i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1092f(i iVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12508i = iVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1092f c1092f = (C1092f) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c1092f.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C1092f c1092f = new C1092f(this.f12508i, interfaceC0617c);
        c1092f.f12507h = obj;
        return c1092f;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f12507h;
        Z5.a.d(obj);
        i iVar = this.f12508i;
        AbstractC0166y.q(interfaceC0163v, null, null, new C1090d(iVar, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C1091e(iVar, null), 3);
        return y.f7506a;
    }
}
