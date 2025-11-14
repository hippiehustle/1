package F7;

import B6.q;
import a6.AbstractC0436k;
import a6.s;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1634a = new Object();

    public static final void a(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final List d(ArrayList arrayList) {
        o6.j.e(arrayList, "<this>");
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                arrayList.trimToSize();
                return arrayList;
            }
            return E2.d.y(AbstractC0436k.p0(arrayList));
        }
        return s.f7766d;
    }

    public static i e() {
        return new i(0);
    }

    public static Object f(List list, a aVar, l lVar) {
        W0.c cVar = new W0.c(4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g(it.next(), aVar, cVar, lVar);
        }
        return lVar.j();
    }

    public static void g(Object obj, a aVar, W0.c cVar, l lVar) {
        if (obj != null) {
            if (!((HashSet) cVar.f6486e).add(obj) || !lVar.c(obj)) {
                return;
            }
            Iterator it = aVar.b(obj).iterator();
            while (it.hasNext()) {
                g(it.next(), aVar, cVar, lVar);
            }
            lVar.b(obj);
            return;
        }
        Object[] objArr = new Object[3];
        switch (22) {
            case 1:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (22) {
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public static Boolean h(List list, a aVar, InterfaceC1163b interfaceC1163b) {
        return (Boolean) f(list, aVar, new q(interfaceC1163b, new boolean[1], 1));
    }

    public static final boolean i(Throwable th) {
        Class<?> cls = th.getClass();
        while (!o6.j.a(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    public static void k(Object obj) {
        if (!(obj instanceof k)) {
        } else {
            throw ((k) obj).f1633a;
        }
    }

    public abstract boolean c(Object obj);

    public abstract Object j();

    public void b(Object obj) {
    }
}
