package P6;

import f7.C0722b;
import f7.C0723c;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final C0723c f4595a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0722b f4596b;

    static {
        C0723c c0723c = new C0723c("kotlin.jvm.JvmField");
        f4595a = c0723c;
        E2.c.D0(c0723c);
        E2.c.D0(new C0723c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f4596b = E2.c.V("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String str) {
        o6.j.e(str, "propertyName");
        if (c(str)) {
            return str;
        }
        return "get" + E2.b.e(str);
    }

    public static final String b(String str) {
        String e9;
        StringBuilder sb = new StringBuilder("set");
        if (c(str)) {
            e9 = str.substring(2);
            o6.j.d(e9, "substring(...)");
        } else {
            e9 = E2.b.e(str);
        }
        sb.append(e9);
        return sb.toString();
    }

    public static final boolean c(String str) {
        o6.j.e(str, "name");
        if (I7.v.a0(str, "is") && str.length() != 2) {
            char charAt = str.charAt(2);
            if (o6.j.f(97, charAt) <= 0 && o6.j.f(charAt, 122) <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }
}
