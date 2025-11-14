package a5;

import Z5.y;
import a0.C0407b;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: a5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0421e extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7741h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f7742i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0421e(boolean z8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f7742i = z8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C0421e c0421e = (C0421e) p((InterfaceC0617c) obj2, (C0407b) obj);
        y yVar = y.f7506a;
        c0421e.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0421e c0421e = new C0421e(this.f7742i, interfaceC0617c);
        c0421e.f7741h = obj;
        return c0421e;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        C0407b c0407b = (C0407b) this.f7741h;
        Z5.a.d(obj);
        c0407b.d(C0423g.f7746c, Boolean.valueOf(this.f7742i));
        return y.f7506a;
    }
}
