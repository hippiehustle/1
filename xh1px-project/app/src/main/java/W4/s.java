package W4;

import Z5.y;
import a6.AbstractC0438m;
import f6.AbstractC0713c;
import f6.AbstractC0720j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import n6.InterfaceC1167f;

/* loaded from: classes.dex */
public final class s extends AbstractC0720j implements InterfaceC1167f {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Z4.q f6614h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ List f6615i;
    public /* synthetic */ Z4.a j;
    public /* synthetic */ d k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f6616l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(x xVar, AbstractC0713c abstractC0713c) {
        super(5, abstractC0713c);
        this.f6616l = xVar;
    }

    @Override // n6.InterfaceC1167f
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, AbstractC0713c abstractC0713c) {
        s sVar = new s(this.f6616l, abstractC0713c);
        sVar.f6614h = (Z4.q) obj;
        sVar.f6615i = (List) obj2;
        sVar.j = (Z4.a) obj3;
        sVar.k = (d) obj4;
        return sVar.v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Object obj2;
        Z4.p oVar;
        ArrayList arrayList;
        boolean z8;
        Z4.q qVar = this.f6614h;
        List<Object> list = this.f6615i;
        Z4.a aVar = this.j;
        d dVar = this.k;
        Z5.a.d(obj);
        int ordinal = qVar.ordinal();
        boolean z9 = true;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    o6.j.e(aVar, "<this>");
                    if (aVar.f7416a.isEmpty() && aVar.f7417b.isEmpty()) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    oVar = new Z4.l(true ^ z8);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                oVar = Z4.n.f7455g;
            }
        } else {
            boolean z10 = !list.isEmpty();
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((Z4.k) obj2) instanceof Z4.h) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            if (obj2 == null) {
                z9 = false;
            }
            oVar = new Z4.o(z10, z9);
        }
        if (qVar != Z4.q.f7466f) {
            arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
            for (Object obj3 : list) {
                if (obj3 instanceof Z4.e) {
                    Z4.e eVar = (Z4.e) obj3;
                    obj3 = Z4.e.e(eVar, false, dVar.f6589a.contains(Long.valueOf(eVar.d())), 2039);
                } else if (obj3 instanceof Z4.g) {
                    Z4.g gVar = (Z4.g) obj3;
                    obj3 = Z4.g.e(gVar, false, dVar.f6590b.contains(Long.valueOf(gVar.d())), 503);
                }
                arrayList.add(obj3);
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj4 : list) {
                if (!(obj4 instanceof Z4.j)) {
                    if (obj4 instanceof Z4.e) {
                        Z4.e eVar2 = (Z4.e) obj4;
                        obj4 = Z4.e.e(eVar2, aVar.f7416a.contains(Long.valueOf(eVar2.f7424b.f13699a.f12187a)), false, 2041);
                    } else if (obj4 instanceof Z4.g) {
                        Z4.g gVar2 = (Z4.g) obj4;
                        obj4 = Z4.g.e(gVar2, aVar.f7417b.contains(Long.valueOf(gVar2.f7438b.f12190a.f12187a)), false, 505);
                    } else {
                        obj4 = null;
                    }
                }
                if (obj4 != null) {
                    arrayList2.add(obj4);
                }
            }
            arrayList = arrayList2;
        }
        return new Z4.r(qVar, oVar, arrayList);
    }
}
