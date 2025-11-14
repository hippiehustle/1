package p7;

import a6.AbstractC0436k;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: p7.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1324f {

    /* renamed from: c, reason: collision with root package name */
    public static final C1331m f13809c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final int f13810d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f13811e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f13812f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f13813g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f13814h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f13815i;
    public static final int j;
    public static final int k;

    /* renamed from: l, reason: collision with root package name */
    public static final int f13816l;

    /* renamed from: m, reason: collision with root package name */
    public static final C1324f f13817m;

    /* renamed from: n, reason: collision with root package name */
    public static final C1324f f13818n;

    /* renamed from: o, reason: collision with root package name */
    public static final C1324f f13819o;

    /* renamed from: p, reason: collision with root package name */
    public static final C1324f f13820p;

    /* renamed from: q, reason: collision with root package name */
    public static final C1324f f13821q;

    /* renamed from: r, reason: collision with root package name */
    public static final ArrayList f13822r;

    /* renamed from: s, reason: collision with root package name */
    public static final ArrayList f13823s;

    /* renamed from: a, reason: collision with root package name */
    public final List f13824a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13825b;

    /* JADX WARN: Type inference failed for: r0v0, types: [p7.m, java.lang.Object] */
    static {
        C1323e c1323e;
        C1324f c1324f;
        int i4 = f13810d;
        int i8 = i4 << 1;
        f13811e = i4;
        int i9 = i4 << 2;
        f13812f = i8;
        int i10 = i4 << 3;
        f13813g = i9;
        int i11 = i4 << 4;
        f13814h = i10;
        int i12 = i4 << 5;
        f13815i = i11;
        j = i12;
        f13810d = i4 << 7;
        int i13 = (i4 << 6) - 1;
        k = i13;
        int i14 = i4 | i8 | i9;
        f13816l = i14;
        f13817m = new C1324f(i13);
        f13818n = new C1324f(i11 | i12);
        new C1324f(i4);
        new C1324f(i8);
        new C1324f(i9);
        f13819o = new C1324f(i14);
        new C1324f(i10);
        f13820p = new C1324f(i11);
        f13821q = new C1324f(i12);
        new C1324f(i8 | i11 | i12);
        Field[] fields = C1324f.class.getFields();
        o6.j.d(fields, "getFields(...)");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            C1323e c1323e2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            if (obj instanceof C1324f) {
                c1324f = (C1324f) obj;
            } else {
                c1324f = null;
            }
            if (c1324f != null) {
                int i15 = c1324f.f13825b;
                String name = field2.getName();
                o6.j.d(name, "getName(...)");
                c1323e2 = new C1323e(name, i15);
            }
            if (c1323e2 != null) {
                arrayList2.add(c1323e2);
            }
        }
        f13822r = arrayList2;
        Field[] fields2 = C1324f.class.getFields();
        o6.j.d(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (o6.j.a(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field4 = (Field) it3.next();
            Object obj2 = field4.get(null);
            o6.j.c(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field4.getName();
                o6.j.d(name2, "getName(...)");
                c1323e = new C1323e(name2, intValue);
            } else {
                c1323e = null;
            }
            if (c1323e != null) {
                arrayList5.add(c1323e);
            }
        }
        f13823s = arrayList5;
    }

    public C1324f(int i4, List list) {
        o6.j.e(list, "excludes");
        this.f13824a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i4 &= ~((AbstractC1322d) it.next()).a();
        }
        this.f13825b = i4;
    }

    public final boolean a(int i4) {
        if ((i4 & this.f13825b) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C1324f.class.equals(cls)) {
            return false;
        }
        o6.j.c(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        C1324f c1324f = (C1324f) obj;
        if (o6.j.a(this.f13824a, c1324f.f13824a) && this.f13825b == c1324f.f13825b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f13824a.hashCode() * 31) + this.f13825b;
    }

    public final String toString() {
        Object obj;
        String str;
        String str2;
        Iterator it = f13822r.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C1323e) obj).f13807a == this.f13825b) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C1323e c1323e = (C1323e) obj;
        if (c1323e != null) {
            str = c1323e.f13808b;
        } else {
            str = null;
        }
        if (str == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = f13823s.iterator();
            while (it2.hasNext()) {
                C1323e c1323e2 = (C1323e) it2.next();
                if (a(c1323e2.f13807a)) {
                    str2 = c1323e2.f13808b;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            str = AbstractC0436k.v0(arrayList, " | ", null, null, null, 62);
        }
        StringBuilder s8 = A.j.s("DescriptorKindFilter(", str, ", ");
        s8.append(this.f13824a);
        s8.append(')');
        return s8.toString();
    }

    public /* synthetic */ C1324f(int i4) {
        this(i4, a6.s.f7766d);
    }
}
