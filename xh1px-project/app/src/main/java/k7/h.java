package k7;

import C6.A;
import F6.C;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class h {
    public static b a(List list, A a3, z6.j jVar) {
        List Q02 = AbstractC0436k.Q0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = Q02.iterator();
        while (it.hasNext()) {
            g b4 = b(null, it.next());
            if (b4 != null) {
                arrayList.add(b4);
            }
        }
        if (a3 != null) {
            return new x(arrayList, a3.o().r(jVar));
        }
        return new b(arrayList, new B6.n(19, jVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [a6.s] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    public static g b(C c6, Object obj) {
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new v(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new k(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new t(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            Character ch = (Character) obj;
            ch.getClass();
            return new g(ch);
        }
        if (obj instanceof Float) {
            return new c(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new c(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            return new c(bool);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            o6.j.e(str, "value");
            return new g(str);
        }
        boolean z8 = obj instanceof byte[];
        ?? r12 = a6.s.f7766d;
        int i4 = 0;
        if (z8) {
            byte[] bArr = (byte[]) obj;
            o6.j.e(bArr, "<this>");
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    r12 = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i4 < length2) {
                        r12.add(Byte.valueOf(bArr[i4]));
                        i4++;
                    }
                } else {
                    r12 = E2.d.y(Byte.valueOf(bArr[0]));
                }
            }
            return a(r12, c6, z6.j.k);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            o6.j.e(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    r12 = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i4 < length4) {
                        r12.add(Short.valueOf(sArr[i4]));
                        i4++;
                    }
                } else {
                    r12 = E2.d.y(Short.valueOf(sArr[0]));
                }
            }
            return a(r12, c6, z6.j.f16723l);
        }
        if (obj instanceof int[]) {
            return a(AbstractC0434i.g1((int[]) obj), c6, z6.j.f16724m);
        }
        if (obj instanceof long[]) {
            return a(AbstractC0434i.h1((long[]) obj), c6, z6.j.f16726o);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            o6.j.e(cArr, "<this>");
            int length5 = cArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    r12 = new ArrayList(cArr.length);
                    int length6 = cArr.length;
                    while (i4 < length6) {
                        r12.add(Character.valueOf(cArr[i4]));
                        i4++;
                    }
                } else {
                    r12 = E2.d.y(Character.valueOf(cArr[0]));
                }
            }
            return a(r12, c6, z6.j.j);
        }
        if (obj instanceof float[]) {
            return a(AbstractC0434i.f1((float[]) obj), c6, z6.j.f16725n);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            o6.j.e(dArr, "<this>");
            int length7 = dArr.length;
            if (length7 != 0) {
                if (length7 != 1) {
                    r12 = new ArrayList(dArr.length);
                    int length8 = dArr.length;
                    while (i4 < length8) {
                        r12.add(Double.valueOf(dArr[i4]));
                        i4++;
                    }
                } else {
                    r12 = E2.d.y(Double.valueOf(dArr[0]));
                }
            }
            return a(r12, c6, z6.j.f16727p);
        }
        if (obj instanceof boolean[]) {
            return a(AbstractC0434i.j1((boolean[]) obj), c6, z6.j.f16722i);
        }
        if (obj != null) {
            return null;
        }
        return new g(null);
    }
}
