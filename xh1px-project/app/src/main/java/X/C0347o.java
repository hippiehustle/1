package X;

import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: X.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347o extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6759h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c0 f6760i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0347o(c0 c0Var, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f6760i = c0Var;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0347o) p((InterfaceC0617c) obj2, (c0) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0347o c0347o = new C0347o(this.f6760i, interfaceC0617c);
        c0347o.f6759h = obj;
        return c0347o;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        boolean z8;
        Z5.a.d(obj);
        c0 c0Var = (c0) this.f6759h;
        if ((c0Var instanceof C0334b) && c0Var.f6718a <= this.f6760i.f6718a) {
            z8 = true;
        } else {
            z8 = false;
        }
        return Boolean.valueOf(z8);
    }
}
