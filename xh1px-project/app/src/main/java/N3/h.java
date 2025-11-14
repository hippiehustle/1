package N3;

import Z5.y;
import a6.AbstractC0438m;
import d4.C0605k;
import d6.InterfaceC0617c;
import e1.C0637a;
import f6.AbstractC0720j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k3.C0959f;
import n6.InterfaceC1165d;
import r4.AbstractC1469i;

/* loaded from: classes.dex */
public final class h extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3750h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ List f3751i;
    public /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i4, InterfaceC0617c interfaceC0617c, int i8) {
        super(i4, interfaceC0617c);
        this.f3750h = i8;
    }

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        String str = (String) obj2;
        InterfaceC0617c interfaceC0617c = (InterfaceC0617c) obj3;
        switch (this.f3750h) {
            case 0:
                h hVar = new h(3, interfaceC0617c, 0);
                hVar.f3751i = list;
                hVar.j = str;
                return hVar.v(y.f7506a);
            case 1:
                h hVar2 = new h(3, interfaceC0617c, 1);
                hVar2.f3751i = list;
                hVar2.j = str;
                return hVar2.v(y.f7506a);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                h hVar3 = new h(3, interfaceC0617c, 2);
                hVar3.f3751i = list;
                hVar3.j = str;
                return hVar3.v(y.f7506a);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                h hVar4 = new h(3, interfaceC0617c, 3);
                hVar4.f3751i = list;
                hVar4.j = str;
                return hVar4.v(y.f7506a);
            default:
                h hVar5 = new h(3, interfaceC0617c, 4);
                hVar5.f3751i = list;
                hVar5.j = str;
                return hVar5.v(y.f7506a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List, java.lang.Iterable] */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        switch (this.f3750h) {
            case 0:
                Object obj2 = this.f3751i;
                String str = this.j;
                Z5.a.d(obj);
                if (str != null && str.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : obj2) {
                        if (obj3 instanceof e) {
                            arrayList.add(obj3);
                        }
                    }
                    obj2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (I7.m.b0(((e) next).f3748a.f10607b, str, true)) {
                            obj2.add(next);
                        }
                    }
                }
                return obj2;
            case 1:
                List<C0637a> list = this.f3751i;
                String str2 = this.j;
                Z5.a.d(obj);
                ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(list, 10));
                for (C0637a c0637a : list) {
                    arrayList2.add(new C0605k(c0637a, o6.j.a(c0637a.f10594a, str2)));
                }
                return arrayList2;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                Object obj4 = this.f3751i;
                String str3 = this.j;
                Z5.a.d(obj);
                if (str3 != null && str3.length() != 0) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : obj4) {
                        if (obj5 instanceof j4.i) {
                            arrayList3.add(obj5);
                        }
                    }
                    obj4 = new ArrayList();
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (I7.m.b0(((j4.i) next2).a().s(), str3, true)) {
                            obj4.add(next2);
                        }
                    }
                }
                return obj4;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                Object obj6 = this.f3751i;
                String str4 = this.j;
                Z5.a.d(obj);
                if (str4 != null && str4.length() != 0) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj7 : obj6) {
                        if (obj7 instanceof C0959f) {
                            arrayList4.add(obj7);
                        }
                    }
                    obj6 = new ArrayList();
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        Object next3 = it3.next();
                        if (I7.m.b0(((C0959f) next3).f11988a.f11999b, str4, true)) {
                            obj6.add(next3);
                        }
                    }
                }
                return obj6;
            default:
                Object obj8 = this.f3751i;
                String str5 = this.j;
                Z5.a.d(obj);
                if (str5 != null && str5.length() != 0) {
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj9 : obj8) {
                        if (obj9 instanceof AbstractC1469i) {
                            arrayList5.add(obj9);
                        }
                    }
                    obj8 = new ArrayList();
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        Object next4 = it4.next();
                        if (I7.m.b0(((AbstractC1469i) next4).a(), str5, true)) {
                            obj8.add(next4);
                        }
                    }
                }
                return obj8;
        }
    }
}
