package B6;

import C6.EnumC0023y;
import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0010k;
import C6.InterfaceC0019u;
import C6.N;
import C6.O;
import F6.AbstractC0042b;
import F6.AbstractC0046f;
import F6.AbstractC0049i;
import F6.AbstractC0054n;
import F6.AbstractC0061v;
import F6.C0050j;
import F6.F;
import F6.Q;
import F6.T;
import F6.w;
import I7.v;
import P.S;
import T6.C0329d;
import a6.AbstractC0425A;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import a6.x;
import a7.C0439A;
import a7.C0450k;
import a7.I;
import android.os.Bundle;
import c7.InterfaceC0588g;
import com.buzbuz.smartautoclicker.feature.tutorial.ui.game.TutorialGameFragment;
import f7.AbstractC0726f;
import f7.C0722b;
import f7.C0723c;
import f7.C0725e;
import g0.b0;
import h7.AbstractC0842e;
import h7.C0845h;
import h7.C0848k;
import h7.C0849l;
import i.AbstractC0862a;
import i7.AbstractC0898m;
import i7.C0896k;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n1.AbstractC1149a;
import n6.InterfaceC1162a;
import o6.InterfaceC1285d;
import p7.AbstractC1326h;
import p7.C1325g;
import p7.C1338t;
import p7.InterfaceC1333o;
import q7.C1420a;
import q7.InterfaceC1423d;
import s7.C1516g;
import s7.C1518i;
import t0.C1536c;
import t7.C1593c;
import u6.InterfaceC1642c;
import u7.C1655h;
import w6.J;
import w6.K;
import w6.L;
import w6.o0;
import w6.p0;
import w6.r0;
import w7.AbstractC1741c;
import w7.AbstractC1744f;
import w7.AbstractC1759v;
import w7.C1743e;
import w7.E;
import w7.M;
import w7.X;
import w7.z;
import x7.C1824f;
import x7.C1827i;

/* loaded from: classes.dex */
public final class j implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f485d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f486e;

    public /* synthetic */ j(int i4, Object obj) {
        this.f485d = i4;
        this.f486e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v0, types: [w7.Q] */
    /* JADX WARN: Type inference failed for: r15v3, types: [F6.v] */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, F6.j] */
    @Override // n6.InterfaceC1162a
    public final Object a() {
        Object obj;
        ?? r14;
        C0050j f8;
        w wVar;
        a6.s sVar;
        u7.s sVar2;
        Map map;
        Map map2;
        I6.t tVar;
        k7.i iVar;
        D6.o oVar;
        k7.b bVar;
        C0848k c0848k;
        a6.s sVar3;
        int hashCode;
        int i4 = this.f485d;
        a6.t tVar2 = a6.t.f7767d;
        a6.s sVar4 = a6.s.f7766d;
        int i8 = 10;
        int i9 = 0;
        Map map3 = null;
        Object obj2 = this.f486e;
        switch (i4) {
            case 0:
                l lVar = (l) obj2;
                i iVar2 = lVar.f489f;
                if (iVar2 != null) {
                    k kVar = (k) iVar2.a();
                    lVar.f489f = null;
                    return kVar;
                }
                throw new AssertionError("JvmBuiltins instance has not been initialized properly");
            case 1:
                return (InterfaceC1333o) ((N) obj2).f724b.m(C1824f.f16282a);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                D6.l lVar2 = (D6.l) obj2;
                return lVar2.f1046a.j(lVar2.f1047b).l();
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC0046f abstractC0046f = (AbstractC0046f) obj2;
                u7.s sVar5 = (u7.s) abstractC0046f;
                InterfaceC0004e M02 = sVar5.M0();
                if (M02 != null) {
                    Collection<??> G8 = M02.G();
                    o6.j.d(G8, "getConstructors(...)");
                    ArrayList arrayList = new ArrayList();
                    for (?? r8 : G8) {
                        F f9 = Q.K;
                        v7.n nVar = abstractC0046f.f1524i;
                        o6.j.b(r8);
                        f9.getClass();
                        o6.j.e(nVar, "storageManager");
                        if (sVar5.M0() == null) {
                            obj = map3;
                        } else {
                            obj = w7.Q.d(sVar5.N0());
                        }
                        if (obj == null || (f8 = r8.f((r14 = obj))) == null) {
                            sVar2 = sVar5;
                            Map map4 = map3;
                            map2 = map4;
                            map = map4;
                        } else {
                            D6.j annotations = ((D6.b) r8).getAnnotations();
                            AbstractC0061v abstractC0061v = (AbstractC0061v) r8;
                            int e9 = abstractC0061v.e();
                            AbstractC1149a.n("getKind(...)", e9);
                            O h8 = abstractC0046f.h();
                            ?? r24 = map3;
                            o6.j.d(h8, "getSource(...)");
                            Q q6 = new Q(nVar, abstractC0046f, f8, null, annotations, e9, h8);
                            List z02 = abstractC0061v.z0();
                            if (z02 != null) {
                                ArrayList Q02 = AbstractC0061v.Q0(q6, z02, r14, false, false, null);
                                if (Q02 == null) {
                                    sVar2 = sVar5;
                                    map = r24;
                                    map2 = r24;
                                } else {
                                    z E7 = AbstractC1741c.E(AbstractC1741c.l(f8.k.H0()), sVar5.l());
                                    w wVar2 = abstractC0061v.f1590n;
                                    X x8 = X.INVARIANT;
                                    D6.h hVar = D6.i.f1043a;
                                    if (wVar2 != null) {
                                        wVar = AbstractC0898m.k(q6, r14.g(wVar2.b(), x8), hVar);
                                    } else {
                                        wVar = r24;
                                    }
                                    InterfaceC0004e M03 = sVar5.M0();
                                    if (M03 != null) {
                                        List W7 = abstractC0061v.W();
                                        o6.j.d(W7, "getContextReceiverParameters(...)");
                                        ?? arrayList2 = new ArrayList(AbstractC0438m.d0(W7, i8));
                                        int i10 = 0;
                                        for (Object obj3 : W7) {
                                            int i11 = i10 + 1;
                                            if (i10 >= 0) {
                                                w wVar3 = (w) obj3;
                                                AbstractC1759v g8 = r14.g(wVar3.b(), x8);
                                                InterfaceC1423d M04 = wVar3.M0();
                                                o6.j.c(M04, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                                                u7.s sVar6 = sVar5;
                                                C1420a c1420a = new C1420a(M03, g8, ((C1420a) M04).K0());
                                                I7.k kVar2 = AbstractC0726f.f10806a;
                                                arrayList2.add(new w(M03, c1420a, hVar, C0725e.e(AbstractC0726f.f10807b + '_' + i10)));
                                                i10 = i11;
                                                sVar5 = sVar6;
                                            } else {
                                                AbstractC0437l.c0();
                                                throw r24;
                                            }
                                        }
                                        sVar = arrayList2;
                                    } else {
                                        sVar = sVar4;
                                    }
                                    sVar2 = sVar5;
                                    ?? r15 = q6;
                                    r15.R0(wVar, null, sVar, abstractC0046f.t(), Q02, E7, EnumC0023y.f778e, abstractC0046f.j);
                                    map = r15;
                                    map2 = r24;
                                }
                            } else {
                                AbstractC0061v.G0(28);
                                throw r24;
                            }
                        }
                        if (map != null) {
                            arrayList.add(map);
                        }
                        map3 = map2;
                        sVar5 = sVar2;
                        i8 = 10;
                    }
                    return arrayList;
                }
                return sVar4;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                StringBuilder sb = new StringBuilder("Scope for type parameter ");
                f fVar = (f) obj2;
                sb.append(((C0725e) fVar.f472f).b());
                return AbstractC0862a.d(sb.toString(), ((AbstractC0049i) fVar.f471e).getUpperBounds());
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                F6.r rVar = (F6.r) obj2;
                HashSet hashSet = new HashSet();
                for (C0725e c0725e : (Set) rVar.f1555e.f1556l.a()) {
                    K6.b bVar2 = K6.b.f2735i;
                    hashSet.addAll(rVar.g(c0725e, bVar2));
                    hashSet.addAll(rVar.f(c0725e, bVar2));
                }
                return hashSet;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return (List) obj2;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return (List) ((T) obj2).f1511p.getValue();
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                TutorialGameFragment tutorialGameFragment = (TutorialGameFragment) obj2;
                Bundle bundle = tutorialGameFragment.f11115i;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException("Fragment " + tutorialGameFragment + " has null arguments");
            case 9:
                Object obj4 = Q6.e.f4918a;
                W6.a aVar = ((Q6.i) obj2).f4912d;
                if (aVar instanceof I6.t) {
                    tVar = (I6.t) aVar;
                } else {
                    tVar = null;
                }
                if (tVar != null && (oVar = (D6.o) Q6.e.f4919b.get(C0725e.e(tVar.f2213b.name()).b())) != null) {
                    C0723c c0723c = z6.m.f16788v;
                    o6.j.e(c0723c, "topLevelFqName");
                    iVar = new k7.i(new C0722b(c0723c.b(), c0723c.f10797a.f()), C0725e.e(oVar.name()));
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    map3 = x.O0(new Z5.j(Q6.c.f4915c, iVar));
                }
                if (map3 != null) {
                    return map3;
                }
                return tVar2;
            case 10:
                W6.a aVar2 = ((Q6.j) obj2).f4912d;
                if (aVar2 instanceof I6.h) {
                    Object obj5 = Q6.e.f4918a;
                    bVar = Q6.e.a(((I6.h) aVar2).a());
                } else if (aVar2 instanceof I6.t) {
                    Object obj6 = Q6.e.f4918a;
                    bVar = Q6.e.a(E2.d.y(aVar2));
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    map3 = x.O0(new Z5.j(Q6.c.f4914b, bVar));
                }
                if (map3 != null) {
                    return map3;
                }
                return tVar2;
            case 11:
                C0329d c0329d = (C0329d) obj2;
                T6.q qVar = c0329d.f5820c;
                Collection values = ((Map) AbstractC0862a.j(qVar.f5881m, T6.q.f5879q[0])).values();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    u7.p a3 = ((S6.a) c0329d.f5819b.f280e).f5401d.a(qVar, (H6.b) it.next());
                    if (a3 != null) {
                        arrayList3.add(a3);
                    }
                }
                return (InterfaceC1333o[]) q4.X.C(arrayList3).toArray(new InterfaceC1333o[0]);
            case 12:
                C0849l c0849l = ((C0845h) obj2).f11449a;
                C0849l c0849l2 = new C0849l();
                S g9 = o6.j.g(C0849l.class.getDeclaredFields());
                while (g9.hasNext()) {
                    Field field = (Field) g9.next();
                    if ((field.getModifiers() & 8) == 0) {
                        field.setAccessible(true);
                        Object obj7 = field.get(c0849l);
                        if (obj7 instanceof C0848k) {
                            c0848k = (C0848k) obj7;
                        } else {
                            c0848k = null;
                        }
                        if (c0848k != null) {
                            String name = field.getName();
                            o6.j.d(name, "getName(...)");
                            v.a0(name, "is");
                            InterfaceC1642c b4 = o6.v.f13643a.b(C0849l.class);
                            field.getName();
                            String name2 = field.getName();
                            o6.j.d(name2, "getName(...)");
                            if (name2.length() > 0) {
                                Character.toUpperCase(name2.charAt(0));
                                o6.j.d(name2.substring(1), "substring(...)");
                            }
                            ((InterfaceC1285d) b4).d();
                            field.set(c0849l2, new C0848k(c0848k.f11467a, c0849l2));
                        }
                    }
                }
                C0845h c0845h = C0845h.f11446c;
                c0849l2.f11479L.b(AbstractC0425A.g0(c0849l2.m(), AbstractC0437l.X(z6.m.f16782p, z6.m.f16783q)), C0849l.Y[36]);
                c0849l2.f11492a = true;
                return new C0845h(c0849l2);
            case 13:
                AbstractC1759v b9 = ((M) obj2).b();
                o6.j.d(b9, "getType(...)");
                return b9;
            case 14:
                AbstractC1326h abstractC1326h = (AbstractC1326h) obj2;
                List h9 = abstractC1326h.h();
                ArrayList arrayList4 = new ArrayList(3);
                AbstractC0042b abstractC0042b = abstractC1326h.f13829b;
                Collection d2 = abstractC0042b.B().d();
                o6.j.d(d2, "getSupertypes(...)");
                ArrayList arrayList5 = new ArrayList();
                Iterator it2 = d2.iterator();
                while (it2.hasNext()) {
                    a6.q.f0(arrayList5, h7.u.d(((AbstractC1759v) it2.next()).w0(), null, 3));
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (next instanceof InterfaceC0002c) {
                        arrayList6.add(next);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    C0725e name3 = ((InterfaceC0002c) next2).getName();
                    Object obj8 = linkedHashMap.get(name3);
                    if (obj8 == null) {
                        obj8 = new ArrayList();
                        linkedHashMap.put(name3, obj8);
                    }
                    ((List) obj8).add(next2);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    o6.j.d(key, "component1(...)");
                    C0725e c0725e2 = (C0725e) key;
                    List list = (List) entry.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj9 : list) {
                        Boolean valueOf = Boolean.valueOf(((InterfaceC0002c) obj9) instanceof InterfaceC0019u);
                        Object obj10 = linkedHashMap2.get(valueOf);
                        if (obj10 == null) {
                            obj10 = new ArrayList();
                            linkedHashMap2.put(valueOf, obj10);
                        }
                        ((List) obj10).add(obj9);
                    }
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                        List list2 = (List) entry2.getValue();
                        C0896k c0896k = C0896k.f11782c;
                        if (booleanValue) {
                            ?? arrayList7 = new ArrayList();
                            for (Object obj11 : h9) {
                                if (o6.j.a(((AbstractC0054n) ((InterfaceC0019u) obj11)).getName(), c0725e2)) {
                                    arrayList7.add(obj11);
                                }
                            }
                            sVar3 = arrayList7;
                        } else {
                            sVar3 = sVar4;
                        }
                        c0896k.h(c0725e2, list2, sVar3, abstractC0042b, new C1325g(arrayList4, abstractC1326h));
                    }
                }
                return AbstractC0436k.C0(h9, F7.l.d(arrayList4));
            case 15:
                C1338t c1338t = (C1338t) obj2;
                return c1338t.i(h7.u.d(c1338t.f13851b, null, 3));
            case 16:
                Set keySet = ((LinkedHashMap) ((C1593c) obj2).f15140m.f10990g).keySet();
                ArrayList arrayList8 = new ArrayList();
                for (Object obj12 : keySet) {
                    C0722b c0722b = (C0722b) obj12;
                    if (!c0722b.g() && !C1516g.f14569c.contains(c0722b)) {
                        arrayList8.add(obj12);
                    }
                }
                ArrayList arrayList9 = new ArrayList(AbstractC0438m.d0(arrayList8, 10));
                Iterator it5 = arrayList8.iterator();
                while (it5.hasNext()) {
                    arrayList9.add(((C0722b) it5.next()).f());
                }
                return arrayList9;
            case 17:
                HashSet hashSet2 = new HashSet();
                C1655h c1655h = (C1655h) ((b0) obj2).f10990g;
                T6.h hVar2 = c1655h.f15406q;
                F3.m mVar = c1655h.f15404o;
                C0450k c0450k = c1655h.f15399h;
                Iterator it6 = hVar2.d().iterator();
                while (it6.hasNext()) {
                    for (InterfaceC0010k interfaceC0010k : h7.u.d(((AbstractC1759v) it6.next()).w0(), null, 3)) {
                        if ((interfaceC0010k instanceof F6.N) || (interfaceC0010k instanceof C6.M)) {
                            hashSet2.add(((InterfaceC0002c) interfaceC0010k).getName());
                        }
                    }
                }
                List list3 = c0450k.f8170t;
                o6.j.d(list3, "getFunctionList(...)");
                Iterator it7 = list3.iterator();
                while (it7.hasNext()) {
                    hashSet2.add(AbstractC0842e.t((InterfaceC0588g) mVar.f1372e, ((C0439A) it7.next()).f7782i));
                }
                List list4 = c0450k.f8171u;
                o6.j.d(list4, "getPropertyList(...)");
                Iterator it8 = list4.iterator();
                while (it8.hasNext()) {
                    hashSet2.add(AbstractC0842e.t((InterfaceC0588g) mVar.f1372e, ((I) it8.next()).f7858i));
                }
                return AbstractC0425A.g0(hashSet2, hashSet2);
            case 18:
                u7.o oVar2 = (u7.o) obj2;
                Set n3 = oVar2.n();
                if (n3 == null) {
                    return null;
                }
                return AbstractC0425A.g0(AbstractC0425A.g0(oVar2.m(), oVar2.f15434c.f15425c.keySet()), n3);
            case 19:
                u7.t tVar3 = (u7.t) obj2;
                F3.m mVar2 = tVar3.f15458o;
                return AbstractC0436k.Q0(((C1518i) mVar2.f1371d).f14577e.d(tVar3.f15459p, (InterfaceC0588g) mVar2.f1372e));
            case 20:
                return r0.a(((w6.F) obj2).d());
            case 21:
                return new w6.I((J) obj2);
            case 22:
                return new K((L) obj2);
            case 23:
                return new w6.M((w6.N) obj2);
            case 24:
                List upperBounds = ((p0) obj2).f15899d.getUpperBounds();
                o6.j.d(upperBounds, "getUpperBounds(...)");
                ArrayList arrayList10 = new ArrayList(AbstractC0438m.d0(upperBounds, 10));
                Iterator it9 = upperBounds.iterator();
                while (it9.hasNext()) {
                    arrayList10.add(new o0((AbstractC1759v) it9.next(), null));
                }
                return arrayList10;
            case 25:
                return new C1743e(((AbstractC1744f) obj2).f());
            case 26:
                return AbstractC1741c.w((C6.T) ((E) obj2).f15949b);
            case 27:
                return y7.l.c(y7.k.CANNOT_COMPUTE_ERASED_BOUND, ((C1536c) obj2).toString());
            case 28:
                for (Map.Entry entry3 : ((Map) obj2).entrySet()) {
                    String str = (String) entry3.getKey();
                    Object value = entry3.getValue();
                    if (value instanceof boolean[]) {
                        hashCode = Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        hashCode = Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        hashCode = Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        hashCode = Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        hashCode = Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        hashCode = Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        hashCode = Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        hashCode = Arrays.hashCode((double[]) value);
                    } else if (value instanceof Object[]) {
                        hashCode = Arrays.hashCode((Object[]) value);
                    } else {
                        hashCode = value.hashCode();
                    }
                    i9 += hashCode ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(i9);
            default:
                InterfaceC1162a interfaceC1162a = ((C1827i) obj2).f16290b;
                if (interfaceC1162a == null) {
                    return null;
                }
                return (List) interfaceC1162a.a();
        }
    }
}
