package A0;

import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import w0.r;

/* loaded from: classes.dex */
public final class f extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f202h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1163b f203i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InterfaceC0617c interfaceC0617c, InterfaceC1163b interfaceC1163b) {
        super(2, interfaceC0617c);
        this.f203i = interfaceC1163b;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((f) p((InterfaceC0617c) obj2, (r) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        f fVar = new f(interfaceC0617c, this.f203i);
        fVar.f202h = obj;
        return fVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        r rVar = (r) this.f202h;
        o6.j.c(rVar, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
        return this.f203i.m(rVar.c());
    }
}
