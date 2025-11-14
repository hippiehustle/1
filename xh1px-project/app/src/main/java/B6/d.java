package B6;

import I7.v;
import a.AbstractC0405a;
import a6.AbstractC0437l;
import f7.AbstractC0727g;
import f7.C0722b;
import f7.C0723c;
import f7.C0724d;
import f7.C0725e;
import f7.C0728h;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import n7.EnumC1170c;
import z6.AbstractC1881d;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f457a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f458b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f459c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f460d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0722b f461e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0723c f462f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0722b f463g;

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f464h;

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap f465i;
    public static final HashMap j;
    public static final HashMap k;

    /* renamed from: l, reason: collision with root package name */
    public static final HashMap f466l;

    /* renamed from: m, reason: collision with root package name */
    public static final HashMap f467m;

    /* renamed from: n, reason: collision with root package name */
    public static final List f468n;

    static {
        StringBuilder sb = new StringBuilder();
        A6.g gVar = A6.g.f399c;
        sb.append(gVar.f403a);
        sb.append('.');
        sb.append(gVar.f404b);
        f457a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        A6.h hVar = A6.h.f400c;
        sb2.append(hVar.f403a);
        sb2.append('.');
        sb2.append(hVar.f404b);
        f458b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        A6.j jVar = A6.j.f402c;
        sb3.append(jVar.f403a);
        sb3.append('.');
        sb3.append(jVar.f404b);
        f459c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        A6.i iVar = A6.i.f401c;
        sb4.append(iVar.f403a);
        sb4.append('.');
        sb4.append(iVar.f404b);
        f460d = sb4.toString();
        C0722b D02 = E2.c.D0(new C0723c("kotlin.jvm.functions.FunctionN"));
        f461e = D02;
        f462f = D02.a();
        f463g = C0728h.f10834u;
        d(Class.class);
        f464h = new HashMap();
        f465i = new HashMap();
        j = new HashMap();
        k = new HashMap();
        f466l = new HashMap();
        f467m = new HashMap();
        C0722b D03 = E2.c.D0(z6.m.f16739B);
        C0723c c0723c = z6.m.f16747J;
        C0723c c0723c2 = D03.f10793a;
        c cVar = new c(d(Iterable.class), D03, new C0722b(c0723c2, AbstractC0405a.C0(c0723c, c0723c2), false));
        C0722b D04 = E2.c.D0(z6.m.f16738A);
        C0723c c0723c3 = z6.m.f16746I;
        C0723c c0723c4 = D04.f10793a;
        c cVar2 = new c(d(Iterator.class), D04, new C0722b(c0723c4, AbstractC0405a.C0(c0723c3, c0723c4), false));
        C0722b D05 = E2.c.D0(z6.m.f16740C);
        C0723c c0723c5 = z6.m.K;
        C0723c c0723c6 = D05.f10793a;
        c cVar3 = new c(d(Collection.class), D05, new C0722b(c0723c6, AbstractC0405a.C0(c0723c5, c0723c6), false));
        C0722b D06 = E2.c.D0(z6.m.f16741D);
        C0723c c0723c7 = z6.m.f16748L;
        C0723c c0723c8 = D06.f10793a;
        c cVar4 = new c(d(List.class), D06, new C0722b(c0723c8, AbstractC0405a.C0(c0723c7, c0723c8), false));
        C0722b D07 = E2.c.D0(z6.m.f16743F);
        C0723c c0723c9 = z6.m.f16750N;
        C0723c c0723c10 = D07.f10793a;
        c cVar5 = new c(d(Set.class), D07, new C0722b(c0723c10, AbstractC0405a.C0(c0723c9, c0723c10), false));
        C0722b D08 = E2.c.D0(z6.m.f16742E);
        C0723c c0723c11 = z6.m.f16749M;
        C0723c c0723c12 = D08.f10793a;
        c cVar6 = new c(d(ListIterator.class), D08, new C0722b(c0723c12, AbstractC0405a.C0(c0723c11, c0723c12), false));
        C0723c c0723c13 = z6.m.f16744G;
        C0722b D09 = E2.c.D0(c0723c13);
        C0723c c0723c14 = z6.m.f16751O;
        C0723c c0723c15 = D09.f10793a;
        c cVar7 = new c(d(Map.class), D09, new C0722b(c0723c15, AbstractC0405a.C0(c0723c14, c0723c15), false));
        C0722b d2 = E2.c.D0(c0723c13).d(z6.m.f16745H.f10797a.f());
        C0723c c0723c16 = z6.m.f16752P;
        C0723c c0723c17 = d2.f10793a;
        List<c> X8 = AbstractC0437l.X(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(d(Map.Entry.class), d2, new C0722b(c0723c17, AbstractC0405a.C0(c0723c16, c0723c17), false)));
        f468n = X8;
        c(Object.class, z6.m.f16762a);
        c(String.class, z6.m.f16772f);
        c(CharSequence.class, z6.m.f16770e);
        b(Throwable.class, z6.m.k);
        c(Cloneable.class, z6.m.f16766c);
        c(Number.class, z6.m.f16777i);
        b(Comparable.class, z6.m.f16778l);
        c(Enum.class, z6.m.j);
        b(Annotation.class, z6.m.f16785s);
        for (c cVar8 : X8) {
            C0722b c0722b = cVar8.f454a;
            C0722b c0722b2 = cVar8.f455b;
            C0722b c0722b3 = cVar8.f456c;
            a(c0722b, c0722b2);
            f465i.put(c0722b3.a().f10797a, c0722b);
            f466l.put(c0722b3, c0722b2);
            f467m.put(c0722b2, c0722b3);
            C0723c a3 = c0722b2.a();
            C0723c a4 = c0722b3.a();
            j.put(c0722b3.a().f10797a, a3);
            k.put(a3.f10797a, a4);
        }
        for (EnumC1170c enumC1170c : EnumC1170c.values()) {
            C0723c c0723c18 = enumC1170c.f13035g;
            if (c0723c18 != null) {
                C0722b c0722b4 = new C0722b(c0723c18.b(), c0723c18.f10797a.f());
                z6.j d3 = enumC1170c.d();
                o6.j.d(d3, "getPrimitiveType(...)");
                C0723c a9 = z6.n.k.a(d3.f16729d);
                a(c0722b4, new C0722b(a9.b(), a9.f10797a.f()));
            } else {
                EnumC1170c.a(15);
                throw null;
            }
        }
        for (C0722b c0722b5 : AbstractC1881d.f16708a) {
            C0723c c0723c19 = new C0723c("kotlin.jvm.internal." + c0722b5.f().b() + "CompanionObject");
            a(new C0722b(c0723c19.b(), c0723c19.f10797a.f()), c0722b5.d(AbstractC0727g.f10809b));
        }
        for (int i4 = 0; i4 < 23; i4++) {
            C0723c c0723c20 = new C0723c(A.j.l("kotlin.jvm.functions.Function", i4));
            a(new C0722b(c0723c20.b(), c0723c20.f10797a.f()), new C0722b(z6.n.k, C0725e.e("Function" + i4)));
            f465i.put(new C0723c(f458b + i4).f10797a, f463g);
        }
        for (int i8 = 0; i8 < 22; i8++) {
            A6.i iVar2 = A6.i.f401c;
            f465i.put(new C0723c((iVar2.f403a + '.' + iVar2.f404b) + i8).f10797a, f463g);
        }
        C0723c c0723c21 = new C0723c("kotlin.concurrent.atomics.AtomicInt");
        C0722b d9 = d(AtomicInteger.class);
        HashMap hashMap = f465i;
        hashMap.put(c0723c21.f10797a, d9);
        hashMap.put(new C0723c("kotlin.concurrent.atomics.AtomicLong").f10797a, d(AtomicLong.class));
        hashMap.put(new C0723c("kotlin.concurrent.atomics.AtomicBoolean").f10797a, d(AtomicBoolean.class));
        hashMap.put(new C0723c("kotlin.concurrent.atomics.AtomicReference").f10797a, d(AtomicReference.class));
        hashMap.put(new C0723c("kotlin.concurrent.atomics.AtomicIntArray").f10797a, d(AtomicIntegerArray.class));
        hashMap.put(new C0723c("kotlin.concurrent.atomics.AtomicLongArray").f10797a, d(AtomicLongArray.class));
        hashMap.put(new C0723c("kotlin.concurrent.atomics.AtomicArray").f10797a, d(AtomicReferenceArray.class));
        hashMap.put(z6.m.f16764b.g().f10797a, d(Void.class));
    }

    public static void a(C0722b c0722b, C0722b c0722b2) {
        f464h.put(c0722b.a().f10797a, c0722b2);
        f465i.put(c0722b2.a().f10797a, c0722b);
    }

    public static void b(Class cls, C0723c c0723c) {
        C0722b d2 = d(cls);
        o6.j.e(c0723c, "topLevelFqName");
        a(d2, new C0722b(c0723c.b(), c0723c.f10797a.f()));
    }

    public static void c(Class cls, C0724d c0724d) {
        b(cls, c0724d.g());
    }

    public static C0722b d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            String canonicalName = cls.getCanonicalName();
            o6.j.d(canonicalName, "getCanonicalName(...)");
            C0723c c0723c = new C0723c(canonicalName);
            return new C0722b(c0723c.b(), c0723c.f10797a.f());
        }
        return d(declaringClass).d(C0725e.e(cls.getSimpleName()));
    }

    public static boolean e(C0724d c0724d, String str) {
        Integer U8;
        String str2 = c0724d.f10800a;
        if (v.a0(str2, str)) {
            String substring = str2.substring(str.length());
            o6.j.d(substring, "substring(...)");
            if (!I7.m.q0(substring, '0') && (U8 = I7.u.U(substring)) != null && U8.intValue() >= 23) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static C0722b f(C0724d c0724d) {
        o6.j.e(c0724d, "kotlinFqName");
        if (e(c0724d, f457a) || e(c0724d, f459c)) {
            return f461e;
        }
        if (e(c0724d, f458b) || e(c0724d, f460d)) {
            return f463g;
        }
        return (C0722b) f465i.get(c0724d);
    }
}
