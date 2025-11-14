package h4;

import C6.A;
import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import D6.i;
import F7.l;
import I7.v;
import T1.C0313l;
import T1.C0316o;
import T1.K;
import T1.L;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import a6.s;
import a6.t;
import a6.x;
import a7.C0440a;
import a7.G;
import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.e0;
import b7.AbstractC0543b;
import b7.C0542a;
import f7.C0723c;
import f7.C0724d;
import f7.C0725e;
import g0.b0;
import g7.AbstractC0793b;
import g7.C0797f;
import g7.C0799h;
import h7.u;
import java.io.InputStream;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import k0.C0946a;
import k7.k;
import k7.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import l1.C0999a;
import l2.C1001a;
import m1.InterfaceC1051a;
import m7.AbstractC1098d;
import n0.AbstractC1136n;
import n0.C1135m;
import n2.C1155c;
import o.L0;
import o6.j;
import p2.C1304a;
import r6.C1474e;
import t7.C1593c;
import u6.InterfaceC1642c;
import w7.AbstractC1741c;
import w7.AbstractC1759v;
import w7.E;
import w7.M;
import w7.z;
import x6.C1800d;
import z6.h;
import z6.m;
import z6.n;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11371a = 0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, r6.e] */
    public static final C1474e a(long j) {
        int i4 = (int) j;
        int i8 = (int) (j >> 32);
        int i9 = ~i4;
        ?? obj = new Object();
        obj.f14418e = i4;
        obj.f14419f = i8;
        obj.f14420g = 0;
        obj.f14421h = 0;
        obj.f14422i = i9;
        obj.j = (i4 << 10) ^ (i8 >>> 4);
        if ((i8 | i4 | i9) != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                obj.c();
            }
            return obj;
        }
        throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
    }

    public static final String c(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static final int d(AbstractC1759v abstractC1759v) {
        j.e(abstractC1759v, "<this>");
        D6.c e9 = abstractC1759v.getAnnotations().e(m.f16783q);
        if (e9 == null) {
            return 0;
        }
        k7.g gVar = (k7.g) x.M0(e9.c(), n.f16797e);
        j.c(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((k) gVar).f12144a).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0028, code lost:
    
        if (r1 <= r2) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1593c e(C0723c c0723c, v7.k kVar, A a3, InputStream inputStream) {
        G g8;
        G g9;
        j.e(c0723c, "fqName");
        j.e(a3, "module");
        try {
            C0542a c0542a = C0542a.f9242f;
            C0542a G8 = E2.b.G(inputStream);
            C0542a c0542a2 = C0542a.f9242f;
            int i4 = G8.f9676c;
            j.e(c0542a2, "ourVersion");
            int i8 = c0542a2.f9676c;
            int i9 = c0542a2.f9675b;
            int i10 = G8.f9675b;
            if (i10 == 0) {
                if (i9 == 0 && i4 == i8) {
                    C0799h c0799h = new C0799h();
                    AbstractC0543b.a(c0799h);
                    C0440a c0440a = G.f7819n;
                    c0440a.getClass();
                    C0797f c0797f = new C0797f(inputStream);
                    AbstractC0793b abstractC0793b = (AbstractC0793b) c0440a.a(c0797f, c0799h);
                    try {
                        c0797f.a(0);
                        if (abstractC0793b.b()) {
                            g8 = (G) abstractC0793b;
                            g9 = g8;
                            inputStream.close();
                            if (g9 != null) {
                                return new C1593c(c0723c, kVar, a3, g9, G8);
                            }
                            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + c0542a2 + ", actual " + G8 + ". Please update Kotlin");
                        }
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
                        invalidProtocolBufferException.f12155d = abstractC0793b;
                        throw invalidProtocolBufferException;
                    } catch (InvalidProtocolBufferException e9) {
                        e9.f12155d = abstractC0793b;
                        throw e9;
                    }
                }
                g8 = null;
                g9 = g8;
                inputStream.close();
                if (g9 != null) {
                }
            } else {
                if (i10 == i9) {
                }
                g8 = null;
                g9 = g8;
                inputStream.close();
                if (g9 != null) {
                }
            }
        } finally {
        }
    }

    public static final Object f(Class cls, Map map, List list) {
        j.e(cls, "annotationClass");
        j.e(list, "methods");
        Z5.n nVar = new Z5.n(new B6.j(28, map));
        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C1800d(cls, map, new Z5.n(new B6.f(cls, 17, map)), nVar, list));
        j.c(newProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return newProxyInstance;
    }

    public static final z g(h hVar, D6.j jVar, AbstractC1759v abstractC1759v, List list, ArrayList arrayList, AbstractC1759v abstractC1759v2, boolean z8) {
        int i4;
        E e9;
        InterfaceC0004e k;
        int size = list.size() + arrayList.size();
        int i8 = 0;
        int i9 = 1;
        if (abstractC1759v != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        ArrayList arrayList2 = new ArrayList(size + i4 + 1);
        ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(AbstractC0405a.e((AbstractC1759v) it.next()));
        }
        arrayList2.addAll(arrayList3);
        if (abstractC1759v != null) {
            e9 = AbstractC0405a.e(abstractC1759v);
        } else {
            e9 = null;
        }
        l.a(arrayList2, e9);
        Iterator it2 = arrayList.iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i11 = i10 + 1;
            if (i10 >= 0) {
                arrayList2.add(AbstractC0405a.e((AbstractC1759v) next));
                i10 = i11;
            } else {
                AbstractC0437l.c0();
                throw null;
            }
        }
        arrayList2.add(AbstractC0405a.e(abstractC1759v2));
        int size2 = list.size() + arrayList.size();
        if (abstractC1759v == null) {
            i9 = 0;
        }
        int i12 = size2 + i9;
        if (z8) {
            k = hVar.w(i12);
        } else {
            C0725e c0725e = n.f16793a;
            k = hVar.k("Function" + i12);
        }
        D6.j jVar2 = i.f1043a;
        if (abstractC1759v != null) {
            C0723c c0723c = m.f16782p;
            if (!jVar.a(c0723c)) {
                ArrayList B02 = AbstractC0436k.B0(jVar, new D6.l(hVar, c0723c, t.f7767d));
                if (B02.isEmpty()) {
                    jVar = jVar2;
                } else {
                    jVar = new D6.k(i8, B02);
                }
            }
        }
        if (!list.isEmpty()) {
            int size3 = list.size();
            C0723c c0723c2 = m.f16783q;
            if (!jVar.a(c0723c2)) {
                ArrayList B03 = AbstractC0436k.B0(jVar, new D6.l(hVar, c0723c2, x.O0(new Z5.j(n.f16797e, new k(size3)))));
                if (!B03.isEmpty()) {
                    jVar2 = new D6.k(i8, B03);
                }
                jVar = jVar2;
            }
        }
        return AbstractC1741c.s(AbstractC1741c.B(jVar), k, arrayList2);
    }

    public static final long h() {
        return Thread.currentThread().getId();
    }

    public static final C0725e i(AbstractC1759v abstractC1759v) {
        w wVar;
        String str;
        D6.c e9 = abstractC1759v.getAnnotations().e(m.f16784r);
        if (e9 != null) {
            Object H02 = AbstractC0436k.H0(e9.c().values());
            if (H02 instanceof w) {
                wVar = (w) H02;
            } else {
                wVar = null;
            }
            if (wVar != null && (str = (String) wVar.f12144a) != null) {
                if (!C0725e.f(str)) {
                    str = null;
                }
                if (str != null) {
                    return C0725e.e(str);
                }
            }
        }
        return null;
    }

    public static final List j(AbstractC1759v abstractC1759v) {
        j.e(abstractC1759v, "<this>");
        q(abstractC1759v);
        int d2 = d(abstractC1759v);
        if (d2 == 0) {
            return s.f7766d;
        }
        List subList = abstractC1759v.r0().subList(0, d2);
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(subList, 10));
        Iterator it = subList.iterator();
        while (it.hasNext()) {
            arrayList.add(((M) it.next()).b());
        }
        return arrayList;
    }

    public static Drawable k(Context context, int i4) {
        return L0.b().c(context, i4);
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [g0.b0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, o6.u] */
    public static b0 l(E0.a aVar, String str, String str2, Collection collection) {
        j.e(aVar, "database");
        j.e(str, "originTableName");
        j.e(str2, "copyName");
        ?? obj = new Object();
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        R.g p8 = h2.a.p(aVar, "sqlite_master");
        String p9 = A.j.p("WHERE `tbl_name` = \"", str, "\"");
        n1.h hVar = new n1.h(6, "sql", null);
        n1.k N8 = p8.N(p9, hVar);
        try {
            N8.a(new n1.l(hVar, obj, str, str2, collection, arrayList, linkedHashSet));
            N8.close();
            CharSequence charSequence = (CharSequence) obj.f13642d;
            if (charSequence != null && charSequence.length() != 0) {
                Object obj2 = obj.f13642d;
                j.b(obj2);
                String Z8 = v.Z((String) obj2, A.j.p("CREATE TABLE `", str, "`"), "CREATE TABLE `" + str2 + "`");
                ?? obj3 = new Object();
                obj3.f10988e = Z8;
                obj3.f10987d = arrayList;
                obj3.f10989f = str2;
                obj3.f10990g = linkedHashSet;
                return obj3;
            }
            throw new IllegalStateException("Can't drop column for ".concat(str));
        } finally {
        }
    }

    public static final A6.k m(InterfaceC0007h interfaceC0007h) {
        if ((interfaceC0007h instanceof InterfaceC0004e) && h.J(interfaceC0007h)) {
            C0724d h8 = AbstractC1098d.h(interfaceC0007h);
            if (h8.d() && !h8.c()) {
                A6.m mVar = A6.m.f407b;
                C0723c b4 = h8.g().b();
                String b9 = h8.f().b();
                j.d(b9, "asString(...)");
                mVar.getClass();
                A6.l a3 = mVar.a(b4, b9);
                if (a3 != null) {
                    return a3.f405a;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static C1135m n(e0 e0Var) {
        U5.d dVar = AbstractC1136n.f12776a;
        C0946a c0946a = C0946a.f11950b;
        j.e(dVar, "factory");
        j.e(c0946a, "extras");
        b0 b0Var = new b0(e0Var, dVar, c0946a);
        InterfaceC1642c b4 = o6.v.f13643a.b(C1135m.class);
        String a3 = b4.a();
        if (a3 != null) {
            return (C1135m) b0Var.l("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(a3), b4);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static final AbstractC1759v o(AbstractC1759v abstractC1759v) {
        j.e(abstractC1759v, "<this>");
        q(abstractC1759v);
        if (abstractC1759v.getAnnotations().e(m.f16782p) != null) {
            return ((M) abstractC1759v.r0().get(d(abstractC1759v))).b();
        }
        return null;
    }

    public static final List p(AbstractC1759v abstractC1759v) {
        int i4;
        j.e(abstractC1759v, "<this>");
        q(abstractC1759v);
        List r02 = abstractC1759v.r0();
        int d2 = d(abstractC1759v);
        if (q(abstractC1759v) && abstractC1759v.getAnnotations().e(m.f16782p) != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        return r02.subList(i4 + d2, r02.size() - 1);
    }

    public static final boolean q(AbstractC1759v abstractC1759v) {
        j.e(abstractC1759v, "<this>");
        InterfaceC0007h c6 = abstractC1759v.B0().c();
        if (c6 != null) {
            A6.k m6 = m(c6);
            if (j.a(m6, A6.g.f399c) || j.a(m6, A6.j.f402c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean r(AbstractC1759v abstractC1759v) {
        A6.k kVar;
        j.e(abstractC1759v, "<this>");
        InterfaceC0007h c6 = abstractC1759v.B0().c();
        if (c6 != null) {
            kVar = m(c6);
        } else {
            kVar = null;
        }
        return j.a(kVar, A6.j.f402c);
    }

    public static final void s(AccessibilityService accessibilityService, boolean z8) {
        int i4;
        j.e(accessibilityService, "<this>");
        AccessibilityServiceInfo serviceInfo = accessibilityService.getServiceInfo();
        int i8 = 32;
        if (serviceInfo == null) {
            AccessibilityServiceInfo accessibilityServiceInfo = new AccessibilityServiceInfo();
            if (!z8) {
                i8 = 0;
            }
            accessibilityServiceInfo.flags = i8;
            accessibilityService.setServiceInfo(accessibilityServiceInfo);
            return;
        }
        if (z8) {
            i4 = serviceInfo.flags | 32;
        } else {
            i4 = serviceInfo.flags & (-33);
        }
        serviceInfo.flags = i4;
        accessibilityService.setServiceInfo(serviceInfo);
    }

    public static final Z5.j t(C0316o c0316o) {
        InterfaceC1051a n3;
        j.e(c0316o, "<this>");
        K k = c0316o.f5609a;
        C1001a c1001a = new C1001a(new C0999a(k.f5528a, true), k.f5529b, k.f5530c, k.f5531d, k.f5532e, 96);
        List<C0313l> list = c0316o.f5610b;
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
        for (C0313l c0313l : list) {
            j.e(c0313l, "<this>");
            int ordinal = c0313l.f5604a.f5658g.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    n3 = u.o(c0313l, true);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                n3 = u.n(c0313l, true);
            }
            arrayList.add(n3);
        }
        return new Z5.j(c1001a, arrayList);
    }

    public static final p2.d u(C1155c c1155c) {
        j.e(c1155c, "<this>");
        Long l6 = c1155c.f12874h;
        Boolean bool = c1155c.f12873g;
        Integer num = c1155c.f12872f;
        long j = c1155c.f12868b;
        long j5 = c1155c.f12867a;
        int ordinal = c1155c.f12871e.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    C0999a c0999a = new C0999a(j5, (Long) null);
                    C0999a c0999a2 = new C0999a(j, (Long) null);
                    String str = c1155c.f12870d;
                    int i4 = c1155c.f12869c;
                    Long l8 = c1155c.f12881q;
                    j.b(l8);
                    return new p2.b(c0999a, c0999a2, str, i4, l8.longValue());
                }
                throw new NoWhenBranchMatchedException();
            }
            C0999a c0999a3 = new C0999a(j5, (Long) null);
            C0999a c0999a4 = new C0999a(j, (Long) null);
            String str2 = c1155c.f12870d;
            int i8 = c1155c.f12869c;
            Integer num2 = c1155c.f12877m;
            j.b(num2);
            int intValue = num2.intValue();
            Integer num3 = c1155c.f12878n;
            j.b(num3);
            Point point = new Point(intValue, num3.intValue());
            Integer num4 = c1155c.f12879o;
            j.b(num4);
            int intValue2 = num4.intValue();
            Integer num5 = c1155c.f12880p;
            j.b(num5);
            Point point2 = new Point(intValue2, num5.intValue());
            Long l9 = c1155c.f12876l;
            j.b(l9);
            long longValue = l9.longValue();
            j.b(num);
            int intValue3 = num.intValue();
            j.b(bool);
            boolean booleanValue = bool.booleanValue();
            j.b(l6);
            return new p2.c(c0999a3, c0999a4, str2, i8, intValue3, booleanValue, l6.longValue(), point, point2, longValue);
        }
        C0999a c0999a5 = new C0999a(j5, (Long) null);
        C0999a c0999a6 = new C0999a(j, (Long) null);
        String str3 = c1155c.f12870d;
        int i9 = c1155c.f12869c;
        Integer num6 = c1155c.j;
        j.b(num6);
        int intValue4 = num6.intValue();
        Integer num7 = c1155c.k;
        j.b(num7);
        Point point3 = new Point(intValue4, num7.intValue());
        Long l10 = c1155c.f12875i;
        j.b(l10);
        long longValue2 = l10.longValue();
        j.b(num);
        int intValue5 = num.intValue();
        j.b(bool);
        boolean booleanValue2 = bool.booleanValue();
        j.b(l6);
        return new C1304a(c0999a5, c0999a6, str3, i9, intValue5, booleanValue2, l6.longValue(), point3, longValue2);
    }

    public static C1001a v(T1.M m6) {
        h1.f fVar;
        j.e(m6, "<this>");
        K k = m6.f5537a;
        C0999a c0999a = new C0999a(k.f5528a, false);
        String str = k.f5529b;
        int i4 = k.f5530c;
        boolean z8 = k.f5531d;
        boolean z9 = k.f5532e;
        int size = m6.f5538b.size();
        L l6 = m6.f5539c;
        if (l6 == null) {
            fVar = new h1.f(0L, 0L);
        } else {
            fVar = new h1.f(l6.f5535c, l6.f5536d);
        }
        return new C1001a(c0999a, str, i4, z8, z9, size, fVar);
    }

    public static final K w(C1001a c1001a) {
        j.e(c1001a, "<this>");
        return new K(c1001a.f12190a.f12187a, c1001a.f12191b, c1001a.f12192c, c1001a.f12193d, c1001a.f12194e);
    }

    public abstract String b();
}
