package U1;

import Z5.y;
import kotlin.NoWhenBranchMatchedException;
import n1.C1150b;
import n1.C1152d;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class b implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6018d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1.i f6019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1.i f6020f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6021g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n1.i f6022h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6023i;

    public b(F0.a aVar, n1.i iVar, n1.i iVar2, n1.i iVar3, n1.i iVar4) {
        this.f6023i = aVar;
        this.f6019e = iVar;
        this.f6020f = iVar2;
        this.f6021g = iVar3;
        this.f6022h = iVar4;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        Long valueOf;
        Long valueOf2;
        Boolean bool;
        Long valueOf3;
        String str;
        Long valueOf4;
        String str2;
        Long valueOf5;
        Long valueOf6;
        switch (this.f6018d) {
            case 0:
                n1.j jVar = (n1.j) obj;
                o6.j.e(jVar, "row");
                n1.i iVar = this.f6019e;
                if (iVar instanceof C1150b) {
                    valueOf = (Long) Boolean.valueOf(jVar.a(((C1150b) iVar).f12838a));
                } else if (iVar instanceof n1.h) {
                    valueOf = (Long) jVar.d(((n1.h) iVar).f12853a);
                } else if (iVar instanceof n1.e) {
                    valueOf = (Long) Integer.valueOf(jVar.b(((n1.e) iVar).f12845a));
                } else {
                    if (!(iVar instanceof n1.g) && !(iVar instanceof C1152d) && !(iVar instanceof n1.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    valueOf = Long.valueOf(jVar.c(iVar.a()));
                }
                n1.i iVar2 = this.f6020f;
                if (iVar2 instanceof C1150b) {
                    valueOf2 = (Long) Boolean.valueOf(jVar.a(((C1150b) iVar2).f12838a));
                } else if (iVar2 instanceof n1.h) {
                    valueOf2 = (Long) jVar.d(((n1.h) iVar2).f12853a);
                } else if (iVar2 instanceof n1.e) {
                    valueOf2 = (Long) Integer.valueOf(jVar.b(((n1.e) iVar2).f12845a));
                } else {
                    if (!(iVar2 instanceof n1.g) && !(iVar2 instanceof C1152d) && !(iVar2 instanceof n1.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    valueOf2 = Long.valueOf(jVar.c(iVar2.a()));
                }
                n1.i iVar3 = (n1.i) this.f6021g;
                if (iVar3 instanceof C1150b) {
                } else if (iVar3 instanceof n1.h) {
                    jVar.d(((n1.h) iVar3).f12853a);
                } else if (iVar3 instanceof n1.e) {
                } else {
                    if (!(iVar3 instanceof n1.g) && !(iVar3 instanceof C1152d) && !(iVar3 instanceof n1.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                n1.i iVar4 = this.f6022h;
                if (iVar4 instanceof C1150b) {
                    bool = Boolean.valueOf(jVar.a(((C1150b) iVar4).f12838a));
                } else if (iVar4 instanceof n1.h) {
                    bool = (Boolean) jVar.d(((n1.h) iVar4).f12853a);
                } else if (iVar4 instanceof n1.e) {
                    bool = (Boolean) Integer.valueOf(jVar.b(((n1.e) iVar4).f12845a));
                } else {
                    if (!(iVar4 instanceof n1.g) && !(iVar4 instanceof C1152d) && !(iVar4 instanceof n1.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bool = (Boolean) Long.valueOf(jVar.c(iVar4.a()));
                }
                long longValue = valueOf2.longValue();
                ((a) this.f6023i).j(Long.valueOf(valueOf.longValue()), Long.valueOf(longValue), bool);
                return y.f7506a;
            case 1:
                n1.j jVar2 = (n1.j) obj;
                o6.j.e(jVar2, "row");
                e eVar = (e) this.f6021g;
                Long valueOf7 = Long.valueOf(jVar2.c(((n1.g) this.f6022h).f12850a));
                Long valueOf8 = Long.valueOf(jVar2.c(((n1.f) this.f6023i).f12848a));
                n1.i iVar5 = this.f6019e;
                if (iVar5 instanceof C1150b) {
                    valueOf3 = (Long) Boolean.valueOf(jVar2.a(((C1150b) iVar5).f12838a));
                } else if (iVar5 instanceof n1.h) {
                    valueOf3 = (Long) jVar2.d(((n1.h) iVar5).f12853a);
                } else if (iVar5 instanceof n1.e) {
                    valueOf3 = (Long) Integer.valueOf(jVar2.b(((n1.e) iVar5).f12845a));
                } else {
                    if (!(iVar5 instanceof n1.g) && !(iVar5 instanceof C1152d) && !(iVar5 instanceof n1.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    valueOf3 = Long.valueOf(jVar2.c(iVar5.a()));
                }
                n1.i iVar6 = this.f6020f;
                if (iVar6 instanceof C1150b) {
                    str = (String) Boolean.valueOf(jVar2.a(((C1150b) iVar6).f12838a));
                } else if (iVar6 instanceof n1.h) {
                    str = jVar2.d(((n1.h) iVar6).f12853a);
                } else if (iVar6 instanceof n1.e) {
                    str = (String) Integer.valueOf(jVar2.b(((n1.e) iVar6).f12845a));
                } else {
                    if (!(iVar6 instanceof n1.g) && !(iVar6 instanceof C1152d) && !(iVar6 instanceof n1.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = (String) Long.valueOf(jVar2.c(iVar6.a()));
                }
                eVar.q(valueOf7, valueOf8, valueOf3, str);
                return y.f7506a;
            default:
                n1.j jVar3 = (n1.j) obj;
                o6.j.e(jVar3, "row");
                F0.a aVar = (F0.a) this.f6023i;
                n1.i iVar7 = this.f6019e;
                if (iVar7 instanceof C1150b) {
                    valueOf4 = (Long) Boolean.valueOf(jVar3.a(((C1150b) iVar7).f12838a));
                } else if (iVar7 instanceof n1.h) {
                    valueOf4 = (Long) jVar3.d(((n1.h) iVar7).f12853a);
                } else if (iVar7 instanceof n1.e) {
                    valueOf4 = (Long) Integer.valueOf(jVar3.b(((n1.e) iVar7).f12845a));
                } else {
                    if (!(iVar7 instanceof n1.g) && !(iVar7 instanceof C1152d) && !(iVar7 instanceof n1.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    valueOf4 = Long.valueOf(jVar3.c(iVar7.a()));
                }
                n1.i iVar8 = this.f6020f;
                if (iVar8 instanceof C1150b) {
                    str2 = (String) Boolean.valueOf(jVar3.a(((C1150b) iVar8).f12838a));
                } else if (iVar8 instanceof n1.h) {
                    str2 = jVar3.d(((n1.h) iVar8).f12853a);
                } else if (iVar8 instanceof n1.e) {
                    str2 = (String) Integer.valueOf(jVar3.b(((n1.e) iVar8).f12845a));
                } else {
                    if (!(iVar8 instanceof n1.g) && !(iVar8 instanceof C1152d) && !(iVar8 instanceof n1.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str2 = (String) Long.valueOf(jVar3.c(iVar8.a()));
                }
                n1.i iVar9 = (n1.i) this.f6021g;
                if (iVar9 instanceof C1150b) {
                    valueOf5 = (Long) Boolean.valueOf(jVar3.a(((C1150b) iVar9).f12838a));
                } else if (iVar9 instanceof n1.h) {
                    valueOf5 = (Long) jVar3.d(((n1.h) iVar9).f12853a);
                } else if (iVar9 instanceof n1.e) {
                    valueOf5 = (Long) Integer.valueOf(jVar3.b(((n1.e) iVar9).f12845a));
                } else {
                    if (!(iVar9 instanceof n1.g) && !(iVar9 instanceof C1152d) && !(iVar9 instanceof n1.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    valueOf5 = Long.valueOf(jVar3.c(iVar9.a()));
                }
                n1.i iVar10 = this.f6022h;
                if (iVar10 instanceof C1150b) {
                    valueOf6 = (Long) Boolean.valueOf(jVar3.a(((C1150b) iVar10).f12838a));
                } else if (iVar10 instanceof n1.h) {
                    valueOf6 = (Long) jVar3.d(((n1.h) iVar10).f12853a);
                } else if (iVar10 instanceof n1.e) {
                    valueOf6 = (Long) Integer.valueOf(jVar3.b(((n1.e) iVar10).f12845a));
                } else {
                    if (!(iVar10 instanceof n1.g) && !(iVar10 instanceof C1152d) && !(iVar10 instanceof n1.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    valueOf6 = Long.valueOf(jVar3.c(iVar10.a()));
                }
                aVar.q(valueOf4, str2, valueOf5, valueOf6);
                return y.f7506a;
        }
    }

    public b(e eVar, n1.g gVar, n1.f fVar, n1.i iVar, n1.i iVar2) {
        this.f6021g = eVar;
        this.f6022h = gVar;
        this.f6023i = fVar;
        this.f6019e = iVar;
        this.f6020f = iVar2;
    }

    public b(n1.i iVar, n1.i iVar2, n1.i iVar3, n1.i iVar4, a aVar) {
        this.f6019e = iVar;
        this.f6020f = iVar2;
        this.f6021g = iVar3;
        this.f6022h = iVar4;
        this.f6023i = aVar;
    }
}
