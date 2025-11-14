package D3;

import F4.f;
import F4.g;
import F4.h;
import F4.j;
import F4.v;
import F4.x;
import M3.H;
import Z5.y;
import a.AbstractC0405a;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import j2.C0902b;
import java.util.Iterator;
import java.util.List;
import k2.C0952b;
import kotlin.NoWhenBranchMatchedException;
import l1.C0999a;
import m1.InterfaceC1053c;
import n6.InterfaceC1166e;
import w1.e;

/* loaded from: classes.dex */
public final class b extends AbstractC0720j implements InterfaceC1166e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f881h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f882i;
    public /* synthetic */ Object j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f883l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, InterfaceC0617c interfaceC0617c, int i4) {
        super(4, interfaceC0617c);
        this.f881h = i4;
        this.f883l = obj;
    }

    @Override // n6.InterfaceC1166e
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f881h) {
            case 0:
                b bVar = new b((d) this.f883l, (InterfaceC0617c) obj4, 0);
                bVar.f882i = (InterfaceC1053c) obj;
                bVar.j = (InterfaceC1053c) obj2;
                bVar.k = obj3;
                return bVar.v(y.f7506a);
            case 1:
                b bVar2 = new b((j) this.f883l, (InterfaceC0617c) obj4, 1);
                bVar2.f882i = (h) obj;
                bVar2.j = (x) obj2;
                bVar2.k = (e) obj3;
                return bVar2.v(y.f7506a);
            default:
                b bVar3 = new b((H) this.f883l, (InterfaceC0617c) obj4, 2);
                bVar3.f882i = (C0952b) obj;
                bVar3.j = (List) obj2;
                bVar3.k = (f2.e) obj3;
                return bVar3.v(y.f7506a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Integer num;
        boolean z8;
        C0999a c0999a;
        switch (this.f881h) {
            case 0:
                InterfaceC1053c interfaceC1053c = (InterfaceC1053c) this.f882i;
                InterfaceC1053c interfaceC1053c2 = (InterfaceC1053c) this.j;
                Object obj2 = this.k;
                Z5.a.d(obj);
                boolean z9 = false;
                if (interfaceC1053c != null && interfaceC1053c2 != null && !interfaceC1053c.equals(interfaceC1053c2)) {
                    z9 = true;
                }
                return new I3.a(interfaceC1053c2, z9, ((d) this.f883l).c(interfaceC1053c2, obj2));
            case 1:
                h hVar = (h) this.f882i;
                x xVar = (x) this.j;
                e eVar = (e) this.k;
                Z5.a.d(obj);
                if (hVar == null) {
                    return null;
                }
                List list = hVar.f1386c;
                if (xVar != null) {
                    num = new Integer(xVar.f1434a);
                } else {
                    num = null;
                }
                if (num == null || num.intValue() < 0 || num.intValue() >= list.size()) {
                    return null;
                }
                v vVar = (v) list.get(num.intValue());
                AbstractC0405a a3 = vVar.a();
                if (!o6.j.a(a3, F4.e.f1382f)) {
                    if (o6.j.a(a3, g.f1383f)) {
                        if (o6.j.a(xVar.f1437d, eVar)) {
                            z8 = false;
                        }
                    } else if (o6.j.a(a3, F4.d.f1381f)) {
                        z8 = o6.j.a(xVar.f1436c, Boolean.TRUE);
                    } else if (o6.j.a(a3, F4.c.f1380f)) {
                        z8 = o6.j.a(xVar.f1436c, Boolean.FALSE);
                    } else if (a3 instanceof f) {
                        z8 = xVar.f1435b;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!z8) {
                        vVar.toString();
                        return vVar;
                    }
                    vVar.toString();
                    return null;
                }
                z8 = true;
                if (!z8) {
                }
                break;
            default:
                C0952b c0952b = (C0952b) this.f882i;
                List list2 = (List) this.j;
                f2.e eVar2 = (f2.e) this.k;
                Z5.a.d(obj);
                int i4 = c0952b.f11962d;
                Object obj3 = null;
                if (eVar2.f10695f != f2.d.f10688e || i4 != 1 || (c0999a = eVar2.f10697h) == null) {
                    return null;
                }
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (o6.j.a(((C0902b) next).f11789a, c0999a)) {
                            obj3 = next;
                        }
                    }
                }
                return (C0902b) obj3;
        }
    }
}
