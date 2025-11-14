package Y6;

import a7.T;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import n7.EnumC1170c;
import s3.AbstractC1492c;
import s7.InterfaceC1522m;
import w7.AbstractC1741c;
import w7.AbstractC1759v;
import w7.z;

/* loaded from: classes.dex */
public final class f implements InterfaceC1522m {

    /* renamed from: b, reason: collision with root package name */
    public static final f f7219b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final f f7220c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final f f7221d = new Object();

    public static String[] a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static k b(String str) {
        EnumC1170c enumC1170c;
        o6.j.e(str, "representation");
        char charAt = str.charAt(0);
        EnumC1170c[] values = EnumC1170c.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                enumC1170c = values[i4];
                if (enumC1170c.c().charAt(0) == charAt) {
                    break;
                }
                i4++;
            } else {
                enumC1170c = null;
                break;
            }
        }
        if (enumC1170c != null) {
            return new j(enumC1170c);
        }
        if (charAt != 'V') {
            if (charAt != '[') {
                if (charAt == 'L' && str.length() > 0) {
                    AbstractC1492c.k(str.charAt(I7.m.e0(str)), ';', false);
                }
                String substring = str.substring(1, str.length() - 1);
                o6.j.d(substring, "substring(...)");
                return new i(substring);
            }
            String substring2 = str.substring(1);
            o6.j.d(substring2, "substring(...)");
            return new h(b(substring2));
        }
        return new j(null);
    }

    public static i c(String str) {
        o6.j.e(str, "internalName");
        return new i(str);
    }

    public static LinkedHashSet e(String str, String... strArr) {
        o6.j.e(str, "internalName");
        o6.j.e(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet f(String str, String... strArr) {
        o6.j.e(strArr, "signatures");
        return e("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static LinkedHashSet g(String str, String... strArr) {
        return e("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static String h(k kVar) {
        String c6;
        o6.j.e(kVar, "type");
        if (kVar instanceof h) {
            return "[" + h(((h) kVar).f7225i);
        }
        if (kVar instanceof j) {
            EnumC1170c enumC1170c = ((j) kVar).f7227i;
            if (enumC1170c != null && (c6 = enumC1170c.c()) != null) {
                return c6;
            }
            return "V";
        }
        if (kVar instanceof i) {
            return A.j.q(new StringBuilder("L"), ((i) kVar).f7226i, ';');
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // s7.InterfaceC1522m
    public AbstractC1759v d(T t8, String str, z zVar, z zVar2) {
        o6.j.e(t8, "proto");
        o6.j.e(str, "flexibleId");
        o6.j.e(zVar, "lowerBound");
        o6.j.e(zVar2, "upperBound");
        if (!str.equals("kotlin.jvm.PlatformType")) {
            return y7.l.c(y7.k.ERROR_FLEXIBLE_TYPE, str, zVar.toString(), zVar2.toString());
        }
        if (t8.l(d7.k.f10518g)) {
            return new U6.h(zVar, zVar2);
        }
        return AbstractC1741c.e(zVar, zVar2);
    }
}
