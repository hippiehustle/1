package T7;

import G.k;
import L7.AbstractC0166y;
import Z5.y;
import d6.InterfaceC0622h;
import n6.InterfaceC1165d;
import o6.j;

/* loaded from: classes.dex */
public final /* synthetic */ class a extends o6.i implements InterfaceC1165d {

    /* renamed from: l, reason: collision with root package name */
    public static final a f5906l = new o6.i(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        b bVar = (b) obj;
        f fVar = (f) obj2;
        long j = bVar.f5907a;
        y yVar = y.f7506a;
        if (j <= 0) {
            ((e) fVar).f5925h = yVar;
            return yVar;
        }
        k kVar = new k(fVar, 2, bVar);
        j.c(fVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        e eVar = (e) fVar;
        InterfaceC0622h interfaceC0622h = eVar.f5921d;
        eVar.f5923f = AbstractC0166y.k(interfaceC0622h).p(j, kVar, interfaceC0622h);
        return yVar;
    }
}
