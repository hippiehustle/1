package A0;

import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;
import w0.r;

/* loaded from: classes.dex */
public final class a extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f187h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n2.h f188i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC0617c interfaceC0617c, n2.h hVar) {
        super(2, interfaceC0617c);
        this.f188i = hVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((a) p((InterfaceC0617c) obj2, (r) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        a aVar = new a(interfaceC0617c, this.f188i);
        aVar.f187h = obj;
        return aVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        r rVar = (r) this.f187h;
        o6.j.c(rVar, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
        return this.f188i.m(rVar.c());
    }
}
