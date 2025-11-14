package a6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import t6.C1586a;
import t6.C1588c;

/* renamed from: a6.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0437l extends E2.d {
    /* JADX WARN: Type inference failed for: r0v1, types: [t6.a, t6.c] */
    public static C1588c V(Collection collection) {
        o6.j.e(collection, "<this>");
        return new C1586a(0, collection.size() - 1, 1);
    }

    public static int W(List list) {
        o6.j.e(list, "<this>");
        return list.size() - 1;
    }

    public static List X(Object... objArr) {
        o6.j.e(objArr, "elements");
        if (objArr.length > 0) {
            return AbstractC0434i.K0(objArr);
        }
        return s.f7766d;
    }

    public static List Y(Object obj) {
        if (obj != null) {
            return E2.d.y(obj);
        }
        return s.f7766d;
    }

    public static ArrayList Z(Object... objArr) {
        o6.j.e(objArr, "elements");
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C0432g(objArr, true));
    }

    public static final List a0(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return list;
            }
            return E2.d.y(list.get(0));
        }
        return s.f7766d;
    }

    public static void b0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void c0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
