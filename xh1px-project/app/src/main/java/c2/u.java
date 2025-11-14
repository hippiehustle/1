package c2;

import a6.AbstractC0438m;
import b6.C0535c;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import f6.AbstractC0720j;
import j2.C0902b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k2.AbstractC0951a;
import k2.C0952b;
import n6.InterfaceC1164c;
import n6.InterfaceC1167f;

/* loaded from: classes.dex */
public final class u extends AbstractC0720j implements InterfaceC1167f {

    /* renamed from: h, reason: collision with root package name */
    public int f9579h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Map f9580i;
    public /* synthetic */ List j;
    public /* synthetic */ List k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ List f9581l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f9582m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1164c f9583n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f9584o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(z zVar, InterfaceC1164c interfaceC1164c, List list, AbstractC0713c abstractC0713c) {
        super(5, abstractC0713c);
        this.f9582m = zVar;
        this.f9583n = interfaceC1164c;
        this.f9584o = list;
    }

    @Override // n6.InterfaceC1167f
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, AbstractC0713c abstractC0713c) {
        u uVar = new u(this.f9582m, this.f9583n, this.f9584o, abstractC0713c);
        uVar.f9580i = (Map) obj;
        uVar.j = (List) obj2;
        uVar.k = (List) obj3;
        uVar.f9581l = (List) obj4;
        return uVar.v(Z5.y.f7506a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0122, code lost:
    
        if (r5.l(r15, r14) == r9) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0124, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0083, code lost:
    
        if (c2.z.c(r4, r15, r5, r14) == r9) goto L48;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Object obj2;
        List i4;
        Map map = this.f9580i;
        List list = this.j;
        List list2 = this.k;
        List<T1.x> list3 = this.f9581l;
        int i8 = this.f9579h;
        InterfaceC1164c interfaceC1164c = this.f9583n;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    Z5.a.d(obj);
                    return Z5.y.f7506a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z5.a.d(obj);
        } else {
            Z5.a.d(obj);
            Iterator it = map.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                z zVar = this.f9582m;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                ((LinkedHashMap) zVar.f9607h.f4987e).put(Long.valueOf(((Number) entry.getKey()).longValue()), Long.valueOf(((Number) entry.getValue()).longValue()));
            }
            C0535c i9 = E2.d.i();
            i9.addAll(list);
            i9.addAll(list2);
            C0535c f8 = E2.d.f(i9);
            this.f9580i = null;
            this.j = null;
            this.k = null;
            this.f9581l = list3;
            this.f9579h = 1;
        }
        if (!list3.isEmpty()) {
            C0535c i10 = E2.d.i();
            for (T1.x xVar : list3) {
                Iterator it2 = this.f9584o.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        AbstractC0951a abstractC0951a = (AbstractC0951a) obj2;
                        if ((abstractC0951a instanceof C0952b) && ((C0952b) abstractC0951a).f11959a.f12187a == xVar.f5652a) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                AbstractC0951a abstractC0951a2 = (AbstractC0951a) obj2;
                if (abstractC0951a2 != null && (i4 = abstractC0951a2.i()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : i4) {
                        if (obj3 instanceof C0902b) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((C0902b) it3.next()).f11793e);
                    }
                    i10.addAll(arrayList2);
                }
            }
            C0535c f9 = E2.d.f(i10);
            this.f9580i = null;
            this.j = null;
            this.k = null;
            this.f9581l = null;
            this.f9579h = 2;
        }
        return Z5.y.f7506a;
    }
}
