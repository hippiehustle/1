package P6;

import C6.AbstractC0015p;
import C6.C0014o;
import C6.InterfaceC0002c;
import C6.InterfaceC0010k;
import C6.InterfaceC0013n;
import i7.AbstractC0890e;
import java.util.HashMap;
import q7.InterfaceC1423d;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final C0014o f4574a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0014o f4575b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0014o f4576c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f4577d;

    static {
        G6.a aVar = G6.a.f1842g;
        C0014o c0014o = new C0014o(aVar, 9);
        f4574a = c0014o;
        G6.c cVar = G6.c.f1844g;
        C0014o c0014o2 = new C0014o(cVar, 10);
        f4575b = c0014o2;
        G6.b bVar = G6.b.f1843g;
        C0014o c0014o3 = new C0014o(bVar, 11);
        f4576c = c0014o3;
        HashMap hashMap = new HashMap();
        f4577d = hashMap;
        hashMap.put(aVar, c0014o);
        hashMap.put(cVar, c0014o2);
        hashMap.put(bVar, c0014o3);
    }

    public static /* synthetic */ void a(int i4) {
        String str;
        int i8;
        if (i4 != 5 && i4 != 6) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 5 && i4 != 6) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
                objArr[0] = "from";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "first";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "second";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "visibility";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i4 != 5 && i4 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        if (i4 != 2 && i4 != 3) {
            if (i4 != 4) {
                if (i4 != 5 && i4 != 6) {
                    objArr[2] = "isVisibleForProtectedAndPackage";
                }
            } else {
                objArr[2] = "toDescriptorVisibility";
            }
        } else {
            objArr[2] = "areInSamePackage";
        }
        String format = String.format(str, objArr);
        if (i4 == 5 || i4 == 6) {
            throw new IllegalStateException(format);
        }
    }

    public static boolean b(InterfaceC1423d interfaceC1423d, InterfaceC0013n interfaceC0013n, InterfaceC0010k interfaceC0010k) {
        InterfaceC0013n interfaceC0013n2;
        if (interfaceC0010k != null) {
            int i4 = AbstractC0890e.f11774a;
            if (interfaceC0013n instanceof InterfaceC0002c) {
                interfaceC0013n2 = AbstractC0890e.s((InterfaceC0002c) interfaceC0013n);
            } else {
                interfaceC0013n2 = interfaceC0013n;
            }
            if (c(interfaceC0013n2, interfaceC0010k)) {
                return true;
            }
            return AbstractC0015p.f756c.a(interfaceC1423d, interfaceC0013n, interfaceC0010k);
        }
        a(1);
        throw null;
    }

    public static boolean c(InterfaceC0013n interfaceC0013n, InterfaceC0010k interfaceC0010k) {
        if (interfaceC0013n != null) {
            if (interfaceC0010k != null) {
                C6.F f8 = (C6.F) AbstractC0890e.i(interfaceC0013n, C6.F.class, false);
                C6.F f9 = (C6.F) AbstractC0890e.i(interfaceC0010k, C6.F.class, false);
                if (f9 == null || f8 == null || !((F6.E) f8).f1461i.equals(((F6.E) f9).f1461i)) {
                    return false;
                }
                return true;
            }
            a(3);
            throw null;
        }
        a(2);
        throw null;
    }
}
