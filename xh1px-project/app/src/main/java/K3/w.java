package K3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import a6.AbstractC0437l;
import android.content.Context;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import k2.C0953c;
import l1.C0999a;
import l2.C1001a;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class w extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f2715h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ D f2716i;
    public final /* synthetic */ Context j;
    public final /* synthetic */ C1001a k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2717l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2718m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ B0.e f2719n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(D d2, Context context, C1001a c1001a, ArrayList arrayList, int i4, B0.e eVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f2716i = d2;
        this.j = context;
        this.k = c1001a;
        this.f2717l = arrayList;
        this.f2718m = i4;
        this.f2719n = eVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((w) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new w(this.f2716i, this.j, this.k, this.f2717l, this.f2718m, this.f2719n, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f2715h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            this.f2715h = 1;
            Object g8 = AbstractC0166y.g(500L, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (g8 == enumC0646a) {
                return enumC0646a;
            }
        }
        D d2 = this.f2716i;
        v2.h hVar = d2.f2643e;
        f2.a aVar = (f2.a) this.f2717l.get(this.f2718m);
        A1.n nVar = new A1.n(d2, 6, this.f2719n);
        hVar.getClass();
        o6.j.e(aVar, "action");
        C0999a c0999a = new C0999a(1L, (Long) null);
        C1001a c1001a = this.k;
        C0999a c0999a2 = c1001a.f12190a;
        List y4 = E2.d.y(new j2.f(new C0999a(1L, (Long) null), c0999a, "Test timer reached", 1L, false));
        C0999a c0999a3 = new C0999a(1L, (Long) null);
        f2.n nVar2 = f2.n.f10747e;
        a6.s sVar = a6.s.f7766d;
        List y5 = E2.d.y(new C0953c(c0999a, c0999a2, "Test Event", 1, AbstractC0437l.X(aVar, new f2.o(c0999a3, c0999a, "Test Pause", 0, true, nVar2, sVar)), y4, true));
        g0.L l6 = new g0.L(21, nVar);
        Objects.toString(c1001a);
        hVar.f15502b.b(this.j, c1001a, sVar, y5, l6);
        return Z5.y.f7506a;
    }
}
