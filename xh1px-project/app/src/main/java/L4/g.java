package L4;

import F4.u;
import F4.v;
import L7.AbstractC0166y;
import L7.F;
import L7.InterfaceC0163v;
import O7.i0;
import P.C;
import Z5.y;
import b6.C0536d;
import b6.C0541i;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.LinkedHashMap;
import l1.C0999a;
import n6.InterfaceC1164c;
import q4.X;

/* loaded from: classes.dex */
public final class g extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f2912h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2913i;
    public final /* synthetic */ j j;
    public final /* synthetic */ F4.h k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i4, j jVar, F4.h hVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f2913i = i4;
        this.j = jVar;
        this.k = hVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((g) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new g(this.f2913i, this.j, this.k, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f2912h;
        int i8 = this.f2913i;
        j jVar = this.j;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            S7.e eVar = F.f3175a;
            S7.d dVar = S7.d.f5456f;
            f fVar = new f(i8, jVar, null);
            this.f2912h = 1;
            obj = AbstractC0166y.A(dVar, fVar, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (obj == enumC0646a) {
                return enumC0646a;
            }
        }
        Long l6 = (Long) obj;
        y yVar = y.f7506a;
        if (l6 != null) {
            C0999a c0999a = new C0999a(l6.longValue(), (Long) null);
            i0 i0Var = jVar.k;
            Integer num = new Integer(i8);
            i0Var.getClass();
            i0Var.h(null, num);
            jVar.f2926i = c0999a;
            jVar.f2919b.b(c0999a, false);
            F4.j jVar2 = jVar.f2922e;
            jVar2.getClass();
            J2.b bVar = jVar2.f1389b;
            C0541i c0541i = new C0541i();
            F4.h hVar = this.k;
            for (v vVar : hVar.f1386c) {
                if (vVar instanceof u) {
                    E2.d dVar2 = ((u) vVar).f1431d;
                    if (dVar2 instanceof F4.a) {
                        c0541i.add(((F4.a) dVar2).f1378e);
                    }
                }
            }
            C0541i j = X.j(c0541i);
            LinkedHashMap linkedHashMap = bVar.f2386b;
            o6.j.e(j, "types");
            Object it = j.iterator();
            while (((C) it).hasNext()) {
                J2.a aVar = (J2.a) ((C0536d) it).next();
                if (!linkedHashMap.containsKey(aVar)) {
                    linkedHashMap.put(aVar, new J2.d(bVar.f2385a));
                }
            }
            i0 i0Var2 = jVar2.f1391d;
            i0Var2.getClass();
            i0Var2.h(null, hVar);
            jVar2.a(0);
        }
        return yVar;
    }
}
