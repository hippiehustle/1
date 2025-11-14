package c2;

import b6.C0535c;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import f6.AbstractC0720j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n6.InterfaceC1164c;
import n6.InterfaceC1167f;

/* loaded from: classes.dex */
public final class m extends AbstractC0720j implements InterfaceC1167f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9549h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f9550i;
    public /* synthetic */ Map j;
    public /* synthetic */ List k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f9551l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9552m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(z zVar, AbstractC0713c abstractC0713c) {
        super(5, abstractC0713c);
        this.f9551l = zVar;
    }

    @Override // n6.InterfaceC1167f
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, AbstractC0713c abstractC0713c) {
        Map map = (Map) obj;
        List list = (List) obj2;
        List list2 = (List) obj3;
        List list3 = (List) obj4;
        switch (this.f9549h) {
            case 0:
                m mVar = new m(this.f9551l, abstractC0713c);
                mVar.j = map;
                mVar.k = list;
                mVar.f9552m = list2;
                return mVar.v(Z5.y.f7506a);
            default:
                m mVar2 = new m((InterfaceC1164c) this.f9552m, this.f9551l, abstractC0713c);
                mVar2.j = map;
                mVar2.k = list3;
                return mVar2.v(Z5.y.f7506a);
        }
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        switch (this.f9549h) {
            case 0:
                Map map = this.j;
                List list = this.k;
                List list2 = (List) this.f9552m;
                int i4 = this.f9550i;
                if (i4 != 0) {
                    if (i4 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    Iterator it = map.entrySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        z zVar = this.f9551l;
                        if (hasNext) {
                            Map.Entry entry = (Map.Entry) it.next();
                            ((LinkedHashMap) zVar.f9607h.f4989g).put(Long.valueOf(((Number) entry.getKey()).longValue()), Long.valueOf(((Number) entry.getValue()).longValue()));
                        } else {
                            C0535c i8 = E2.d.i();
                            i8.addAll(list);
                            i8.addAll(list2);
                            C0535c f8 = E2.d.f(i8);
                            this.j = null;
                            this.k = null;
                            this.f9552m = null;
                            this.f9550i = 1;
                            Object a3 = z.a(zVar, f8, this);
                            EnumC0646a enumC0646a = EnumC0646a.f10656d;
                            if (a3 == enumC0646a) {
                                return enumC0646a;
                            }
                        }
                    }
                }
                return Z5.y.f7506a;
            default:
                Map map2 = this.j;
                List list3 = this.k;
                int i9 = this.f9550i;
                if (i9 != 0) {
                    if (i9 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    for (Map.Entry entry2 : map2.entrySet()) {
                        ((LinkedHashMap) this.f9551l.f9607h.f4988f).put(Long.valueOf(((Number) entry2.getKey()).longValue()), Long.valueOf(((Number) entry2.getValue()).longValue()));
                    }
                    if (!list3.isEmpty()) {
                        InterfaceC1164c interfaceC1164c = (InterfaceC1164c) this.f9552m;
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            String str = ((T1.r) it2.next()).f5618f;
                            if (str != null) {
                                arrayList.add(str);
                            }
                        }
                        this.j = null;
                        this.k = null;
                        this.f9550i = 1;
                        Object l6 = interfaceC1164c.l(arrayList, this);
                        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
                        if (l6 == enumC0646a2) {
                            return enumC0646a2;
                        }
                    }
                }
                return Z5.y.f7506a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(InterfaceC1164c interfaceC1164c, z zVar, AbstractC0713c abstractC0713c) {
        super(5, abstractC0713c);
        this.f9552m = interfaceC1164c;
        this.f9551l = zVar;
    }
}
