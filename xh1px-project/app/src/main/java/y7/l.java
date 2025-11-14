package y7;

import C6.InterfaceC0010k;
import a6.s;
import f7.C0725e;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import q4.X;
import w7.J;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f16567a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final e f16568b = e.f16517d;

    /* renamed from: c, reason: collision with root package name */
    public static final C1842a f16569c = new C1842a(C0725e.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));

    /* renamed from: d, reason: collision with root package name */
    public static final i f16570d = c(k.CYCLIC_SUPERTYPES, new String[0]);

    /* renamed from: e, reason: collision with root package name */
    public static final i f16571e = c(k.ERROR_PROPERTY_TYPE, new String[0]);

    /* renamed from: f, reason: collision with root package name */
    public static final Set f16572f = X.T(new f());

    public static final g a(h hVar, boolean z8, String... strArr) {
        o6.j.e(strArr, "formatParams");
        if (z8) {
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            o6.j.e(strArr2, "formatParams");
            return new g(hVar, (String[]) Arrays.copyOf(strArr2, strArr2.length));
        }
        return new g(hVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final g b(h hVar, String... strArr) {
        return a(hVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final i c(k kVar, String... strArr) {
        o6.j.e(kVar, "kind");
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        o6.j.e(strArr2, "formatParams");
        return e(kVar, s.f7766d, d(kVar, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static j d(k kVar, String... strArr) {
        o6.j.e(kVar, "kind");
        o6.j.e(strArr, "formatParams");
        return new j(kVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static i e(k kVar, List list, J j, String... strArr) {
        o6.j.e(kVar, "kind");
        o6.j.e(strArr, "formatParams");
        return new i(j, b(h.f16526h, j.toString()), kVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean f(InterfaceC0010k interfaceC0010k) {
        if (interfaceC0010k != null) {
            if ((interfaceC0010k instanceof C1842a) || (interfaceC0010k.q() instanceof C1842a) || interfaceC0010k == f16568b) {
                return true;
            }
            return false;
        }
        return false;
    }
}
