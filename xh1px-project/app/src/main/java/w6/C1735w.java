package w6;

import C6.EnumC0005f;
import C6.InterfaceC0004e;
import F6.C0047g;
import I6.AbstractC0065d;
import L6.AbstractC0131n;
import L6.EnumC0132o;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import f7.C0722b;
import f7.C0725e;
import i7.AbstractC0890e;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import m7.AbstractC1098d;
import n6.InterfaceC1162a;
import u6.InterfaceC1642c;
import w7.AbstractC1759v;
import z6.AbstractC1881d;

/* renamed from: w6.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1735w implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15920d;

    /* renamed from: e, reason: collision with root package name */
    public final C1737y f15921e;

    /* renamed from: f, reason: collision with root package name */
    public final C1710B f15922f;

    public /* synthetic */ C1735w(C1737y c1737y, C1710B c1710b, int i4) {
        this.f15920d = i4;
        this.f15921e = c1737y;
        this.f15922f = c1710b;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, Z5.g] */
    @Override // n6.InterfaceC1162a
    public final Object a() {
        Boolean bool;
        Class[] clsArr;
        InterfaceC1642c interfaceC1642c;
        ArrayList arrayList;
        InterfaceC1642c interfaceC1642c2;
        Field declaredField;
        int i4 = this.f15920d;
        int i8 = 0;
        ArrayList arrayList2 = null;
        C1710B c1710b = this.f15922f;
        C1737y c1737y = this.f15921e;
        switch (i4) {
            case 0:
                Class cls = c1710b.f15784e;
                ClassLoader d2 = AbstractC0065d.d(cls);
                L6.L l6 = (L6.L) c1737y.f15927c.getValue();
                if (l6 != null) {
                    ArrayList arrayList3 = l6.f3066l;
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        o6.j.e(str, "name");
                        Class i9 = y0.i(d2, h7.u.m(str), 0);
                        if (i9 != null) {
                            interfaceC1642c = h2.a.n(i9);
                        } else {
                            interfaceC1642c = null;
                        }
                        if (interfaceC1642c != null) {
                            arrayList4.add(interfaceC1642c);
                        }
                    }
                    return arrayList4;
                }
                Method method = (Method) AbstractC0405a.X().f280e;
                if (method == null) {
                    bool = null;
                } else {
                    Object invoke = method.invoke(cls, null);
                    o6.j.c(invoke, "null cannot be cast to non-null type kotlin.Boolean");
                    bool = (Boolean) invoke;
                }
                if (o6.j.a(bool, Boolean.TRUE)) {
                    Method method2 = (Method) AbstractC0405a.X().f281f;
                    if (method2 == null) {
                        clsArr = null;
                    } else {
                        Object invoke2 = method2.invoke(cls, null);
                        o6.j.c(invoke2, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
                        clsArr = (Class[]) invoke2;
                    }
                    if (clsArr != null) {
                        arrayList2 = new ArrayList(clsArr.length);
                        int length = clsArr.length;
                        while (i8 < length) {
                            arrayList2.add(h2.a.n(clsArr[i8]));
                            i8++;
                        }
                    }
                    if (arrayList2 != null) {
                        return arrayList2;
                    }
                }
                return a6.s.f7766d;
            case 1:
                Class cls2 = c1710b.f15784e;
                L6.L l8 = (L6.L) c1737y.f15927c.getValue();
                if (l8 != null) {
                    String str2 = l8.f3058b;
                    if (str2 != null) {
                        C0722b m6 = h7.u.m(str2);
                        ClassLoader d3 = AbstractC0065d.d(cls2);
                        ArrayList arrayList5 = l8.f3065i;
                        arrayList = new ArrayList();
                        Iterator it2 = arrayList5.iterator();
                        while (it2.hasNext()) {
                            Class i10 = y0.i(d3, m6.d(C0725e.e((String) it2.next())), 0);
                            if (i10 != null) {
                                interfaceC1642c2 = h2.a.n(i10);
                            } else {
                                interfaceC1642c2 = null;
                            }
                            if (interfaceC1642c2 != null) {
                                arrayList.add(interfaceC1642c2);
                            }
                        }
                    } else {
                        o6.j.i("name");
                        throw null;
                    }
                } else {
                    Class<?>[] declaredClasses = cls2.getDeclaredClasses();
                    o6.j.d(declaredClasses, "getDeclaredClasses(...)");
                    arrayList = new ArrayList();
                    int length2 = declaredClasses.length;
                    while (i8 < length2) {
                        Class<?> cls3 = declaredClasses[i8];
                        o6.j.b(cls3);
                        arrayList.add(h2.a.n(cls3));
                        i8++;
                    }
                }
                return arrayList;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                Class cls4 = c1710b.f15784e;
                L6.L l9 = (L6.L) c1737y.f15927c.getValue();
                if (l9 == null) {
                    return null;
                }
                if (AbstractC0131n.a(l9) != EnumC0132o.f3152e && AbstractC0131n.a(l9) != EnumC0132o.f3153f) {
                    return null;
                }
                if (AbstractC0131n.a(l9) == EnumC0132o.f3153f) {
                    LinkedHashSet linkedHashSet = AbstractC1881d.f16708a;
                    String str3 = l9.f3058b;
                    if (str3 != null) {
                        if (!AbstractC0436k.l0(linkedHashSet, h7.u.m(str3).e())) {
                            Class<?> enclosingClass = cls4.getEnclosingClass();
                            String str4 = l9.f3058b;
                            if (str4 != null) {
                                if (!I7.v.a0(str4, ".")) {
                                    String t02 = I7.m.t0('/', str4, str4);
                                    declaredField = enclosingClass.getDeclaredField(I7.m.t0('.', t02, t02));
                                    Object obj = declaredField.get(null);
                                    o6.j.c(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                                    return obj;
                                }
                                throw new IllegalArgumentException("Local class is not supported: ".concat(str4).toString());
                            }
                            o6.j.i("name");
                            throw null;
                        }
                    } else {
                        o6.j.i("name");
                        throw null;
                    }
                }
                declaredField = cls4.getDeclaredField("INSTANCE");
                Object obj2 = declaredField.get(null);
                o6.j.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                return obj2;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                List<C6.T> t8 = c1737y.a().t();
                o6.j.d(t8, "getDeclaredTypeParameters(...)");
                ArrayList arrayList6 = new ArrayList(AbstractC0438m.d0(t8, 10));
                for (C6.T t9 : t8) {
                    o6.j.b(t9);
                    arrayList6.add(new p0(c1710b, t9));
                }
                return arrayList6;
            default:
                Collection<AbstractC1759v> d9 = c1737y.a().B().d();
                o6.j.d(d9, "getSupertypes(...)");
                ArrayList arrayList7 = new ArrayList(d9.size());
                for (AbstractC1759v abstractC1759v : d9) {
                    o6.j.b(abstractC1759v);
                    arrayList7.add(new o0(abstractC1759v, new C0047g(abstractC1759v, c1737y, c1710b, 2)));
                }
                InterfaceC0004e a3 = c1737y.a();
                C0725e c0725e = z6.h.f16714e;
                if (!z6.h.b(a3, z6.m.f16762a) && !z6.h.b(a3, z6.m.f16764b)) {
                    if (!arrayList7.isEmpty()) {
                        Iterator it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            EnumC0005f e9 = AbstractC0890e.c(((o0) it3.next()).f15892a).e();
                            o6.j.d(e9, "getKind(...)");
                            if (e9 == EnumC0005f.f742e || e9 == EnumC0005f.f745h) {
                            }
                        }
                    }
                    arrayList7.add(new o0(AbstractC1098d.e(c1737y.a()).e(), C1736x.f15924d));
                }
                return F7.l.d(arrayList7);
        }
    }

    public C1735w(C1710B c1710b, C1737y c1737y) {
        this.f15920d = 0;
        this.f15922f = c1710b;
        this.f15921e = c1737y;
    }
}
