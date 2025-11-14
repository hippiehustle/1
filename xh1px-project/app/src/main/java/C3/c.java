package C3;

import D4.C0030f;
import D4.C0031g;
import D4.C0032h;
import D4.C0034j;
import D4.C0035k;
import K3.C0092f;
import M3.C0191y;
import M3.EnumC0192z;
import P1.f;
import V4.t;
import V4.u;
import Z.g;
import Z5.j;
import Z5.y;
import a6.AbstractC0436k;
import android.graphics.Point;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import java.util.Iterator;
import java.util.List;
import k2.AbstractC0951a;
import k2.C0952b;
import l2.C1001a;
import n6.InterfaceC1165d;
import o3.C1230a;
import v2.i;
import z3.EnumC1855a;

/* loaded from: classes.dex */
public final class c extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f590h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f591i;
    public /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i4, InterfaceC0617c interfaceC0617c, int i8) {
        super(i4, interfaceC0617c);
        this.f590h = i8;
    }

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        switch (this.f590h) {
            case 0:
                c cVar = new c(3, (InterfaceC0617c) obj3, 0);
                cVar.f591i = (C1001a) obj;
                cVar.j = (C1001a) obj2;
                return cVar.v(y.f7506a);
            case 1:
                c cVar2 = new c(3, (InterfaceC0617c) obj3, 1);
                cVar2.f591i = (C0035k) obj;
                cVar2.j = (List) obj2;
                return cVar2.v(y.f7506a);
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                c cVar3 = new c(3, (InterfaceC0617c) obj3, 2);
                cVar3.f591i = (C0034j) obj;
                cVar3.j = (C0030f) obj2;
                return cVar3.v(y.f7506a);
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                c cVar4 = new c(3, (InterfaceC0617c) obj3, 3);
                cVar4.f591i = (C0092f) obj;
                cVar4.j = (I3.b) obj2;
                return cVar4.v(y.f7506a);
            case g.LONG_FIELD_NUMBER /* 4 */:
                c cVar5 = new c(3, (InterfaceC0617c) obj3, 4);
                cVar5.f591i = (Point) obj;
                cVar5.j = (C0191y) obj2;
                return cVar5.v(y.f7506a);
            case g.STRING_FIELD_NUMBER /* 5 */:
                c cVar6 = new c(3, (InterfaceC0617c) obj3, 5);
                cVar6.f591i = (f) obj;
                cVar6.j = (f) obj2;
                return cVar6.v(y.f7506a);
            case g.STRING_SET_FIELD_NUMBER /* 6 */:
                c cVar7 = new c(3, (InterfaceC0617c) obj3, 6);
                cVar7.f591i = (t) obj;
                cVar7.j = (EnumC1855a) obj2;
                return cVar7.v(y.f7506a);
            case g.DOUBLE_FIELD_NUMBER /* 7 */:
                c cVar8 = new c(3, (InterfaceC0617c) obj3, 7);
                cVar8.f591i = (C1230a) obj;
                cVar8.j = (p2.e) obj2;
                return cVar8.v(y.f7506a);
            default:
                c cVar9 = new c(3, (InterfaceC0617c) obj3, 8);
                cVar9.f591i = (List) obj;
                cVar9.j = (i) obj2;
                return cVar9.v(y.f7506a);
        }
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        boolean z8;
        String str;
        boolean z9;
        List list;
        switch (this.f590h) {
            case 0:
                C1001a c1001a = (C1001a) this.f591i;
                C1001a c1001a2 = (C1001a) this.j;
                Z5.a.d(obj);
                boolean z10 = true;
                if (c1001a != null && c1001a2 != null && !c1001a.equals(c1001a2)) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (c1001a2 == null || c1001a2.f12191b.length() <= 0) {
                    z10 = false;
                }
                return new I3.a(c1001a2, z8, z10);
            case 1:
                C0035k c0035k = (C0035k) this.f591i;
                List list2 = (List) this.j;
                Z5.a.d(obj);
                if (c0035k != null) {
                    C0952b c0952b = c0035k.f967b;
                    if (!list2.isEmpty()) {
                        if (c0952b.f11964f.size() == 1) {
                            str = E2.d.n(((C0030f) AbstractC0436k.p0(list2)).f956c);
                        } else {
                            Iterator it = list2.iterator();
                            int i4 = 0;
                            while (it.hasNext()) {
                                i4 += ((C0030f) it.next()).f954a ? 1 : 0;
                            }
                            str = i4 + "/" + c0952b.f11964f.size();
                        }
                        return new C0032h(str, list2);
                    }
                }
                return null;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                C0034j c0034j = (C0034j) this.f591i;
                C0030f c0030f = (C0030f) this.j;
                Z5.a.d(obj);
                if (c0034j == null) {
                    return null;
                }
                return new C0031g(E2.d.n(c0030f.f956c), c0030f);
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                C0092f c0092f = (C0092f) this.f591i;
                I3.b bVar = (I3.b) this.j;
                Z5.a.d(obj);
                boolean z11 = c0092f.f2676b;
                List list3 = bVar.f2089a;
                if (list3 == null) {
                    return new j(null, Boolean.valueOf(z11));
                }
                int size = list3.size();
                int i8 = c0092f.f2675a;
                if (i8 >= 0 && i8 < size) {
                    return new j(list3.get(i8), Boolean.valueOf(z11));
                }
                return new j(null, Boolean.valueOf(z11));
            case g.LONG_FIELD_NUMBER /* 4 */:
                Point point = (Point) this.f591i;
                C0191y c0191y = (C0191y) this.j;
                Z5.a.d(obj);
                if (c0191y == null) {
                    return new C0191y(point, EnumC0192z.f3478d);
                }
                return new C0191y(c0191y.f3476a, c0191y.f3477b);
            case g.STRING_FIELD_NUMBER /* 5 */:
                f fVar = (f) this.f591i;
                f fVar2 = (f) this.j;
                Z5.a.d(obj);
                if (fVar2 != null) {
                    return fVar2;
                }
                return fVar;
            case g.STRING_SET_FIELD_NUMBER /* 6 */:
                t tVar = (t) this.f591i;
                EnumC1855a enumC1855a = (EnumC1855a) this.j;
                Z5.a.d(obj);
                if (enumC1855a == EnumC1855a.f16627e && tVar == t.f6423e) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return new u(tVar, z9);
            case g.DOUBLE_FIELD_NUMBER /* 7 */:
                C1230a c1230a = (C1230a) this.f591i;
                p2.e eVar = (p2.e) this.j;
                Z5.a.d(obj);
                boolean z12 = c1230a.f13443b;
                if (eVar != null && (list = eVar.f13701c) != null) {
                    int size2 = list.size();
                    int i9 = c1230a.f13442a;
                    if (i9 >= 0 && i9 < size2) {
                        return new j(list.get(i9), Boolean.valueOf(z12));
                    }
                    return new j(null, Boolean.valueOf(z12));
                }
                return new j(null, Boolean.valueOf(z12));
            default:
                List list4 = (List) this.f591i;
                i iVar = (i) this.j;
                Z5.a.d(obj);
                if (iVar != i.f15510d && iVar != i.f15513g) {
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        if (((AbstractC0951a) it2.next()).j()) {
                            return Boolean.TRUE;
                        }
                    }
                    return Boolean.FALSE;
                }
                return Boolean.FALSE;
        }
    }
}
