package C6;

import a6.AbstractC0434i;
import i7.AbstractC0890e;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import q7.InterfaceC1423d;

/* renamed from: C6.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0015p {

    /* renamed from: a, reason: collision with root package name */
    public static final C0014o f754a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0014o f755b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0014o f756c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0014o f757d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0014o f758e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0014o f759f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0014o f760g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0014o f761h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0014o f762i;
    public static final C0014o j;
    public static final P k;

    /* renamed from: l, reason: collision with root package name */
    public static final P f763l;

    /* renamed from: m, reason: collision with root package name */
    public static final P f764m;

    /* renamed from: n, reason: collision with root package name */
    public static final C7.o f765n;

    /* renamed from: o, reason: collision with root package name */
    public static final HashMap f766o;

    static {
        C7.o oVar;
        b0 b0Var = b0.f734g;
        C0014o c0014o = new C0014o(b0Var, 0);
        f754a = c0014o;
        c0 c0Var = c0.f735g;
        C0014o c0014o2 = new C0014o(c0Var, 1);
        f755b = c0014o2;
        d0 d0Var = d0.f739g;
        C0014o c0014o3 = new C0014o(d0Var, 2);
        f756c = c0014o3;
        Y y4 = Y.f731g;
        C0014o c0014o4 = new C0014o(y4, 3);
        f757d = c0014o4;
        e0 e0Var = e0.f740g;
        C0014o c0014o5 = new C0014o(e0Var, 4);
        f758e = c0014o5;
        a0 a0Var = a0.f733g;
        C0014o c0014o6 = new C0014o(a0Var, 5);
        f759f = c0014o6;
        X x8 = X.f730g;
        C0014o c0014o7 = new C0014o(x8, 6);
        f760g = c0014o7;
        Z z8 = Z.f732g;
        C0014o c0014o8 = new C0014o(z8, 7);
        f761h = c0014o8;
        f0 f0Var = f0.f747g;
        C0014o c0014o9 = new C0014o(f0Var, 8);
        f762i = c0014o9;
        Collections.unmodifiableSet(AbstractC0434i.l1(new C0014o[]{c0014o, c0014o2, c0014o4, c0014o6}));
        HashMap hashMap = new HashMap(6);
        hashMap.put(c0014o2, 0);
        hashMap.put(c0014o, 0);
        hashMap.put(c0014o4, 1);
        hashMap.put(c0014o3, 1);
        hashMap.put(c0014o5, 2);
        Collections.unmodifiableMap(hashMap);
        j = c0014o5;
        k = new P(2);
        f763l = new P(3);
        f764m = new P(4);
        try {
            Iterator it = Arrays.asList(new C7.o[0]).iterator();
            if (it.hasNext()) {
                oVar = (C7.o) it.next();
            } else {
                oVar = C7.o.f817a;
            }
            f765n = oVar;
            HashMap hashMap2 = new HashMap();
            f766o = hashMap2;
            hashMap2.put(b0Var, c0014o);
            hashMap2.put(c0Var, c0014o2);
            hashMap2.put(d0Var, c0014o3);
            hashMap2.put(y4, c0014o4);
            hashMap2.put(e0Var, c0014o5);
            hashMap2.put(a0Var, c0014o6);
            hashMap2.put(x8, c0014o7);
            hashMap2.put(z8, c0014o8);
            hashMap2.put(f0Var, c0014o9);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i4) {
        String str;
        int i8;
        if (i4 != 16) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 16) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        if (i4 != 1 && i4 != 3 && i4 != 5 && i4 != 7) {
            switch (i4) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
            if (i4 == 16) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
            } else {
                objArr[1] = "toDescriptorVisibility";
            }
            switch (i4) {
                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    objArr[2] = "isVisibleIgnoringReceiver";
                    break;
                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    objArr[2] = "isVisibleWithAnyReceiver";
                    break;
                case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    objArr[2] = "inSameFile";
                    break;
                case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                case 9:
                    objArr[2] = "findInvisibleMember";
                    break;
                case 10:
                case 11:
                    objArr[2] = "compareLocal";
                    break;
                case 12:
                case 13:
                    objArr[2] = "compare";
                    break;
                case 14:
                    objArr[2] = "isPrivate";
                    break;
                case 15:
                    objArr[2] = "toDescriptorVisibility";
                    break;
                case 16:
                    break;
                default:
                    objArr[2] = "isVisible";
                    break;
            }
            String format = String.format(str, objArr);
            if (i4 == 16) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }
        objArr[0] = "from";
        if (i4 == 16) {
        }
        switch (i4) {
        }
        String format2 = String.format(str, objArr);
        if (i4 == 16) {
        }
    }

    public static Integer b(C0014o c0014o, C0014o c0014o2) {
        if (c0014o != null) {
            h0 h0Var = c0014o.f752a;
            if (c0014o2 != null) {
                h0 h0Var2 = c0014o2.f752a;
                Integer a3 = h0Var.a(h0Var2);
                if (a3 != null) {
                    return a3;
                }
                Integer a4 = h0Var2.a(h0Var);
                if (a4 == null) {
                    return null;
                }
                return Integer.valueOf(-a4.intValue());
            }
            a(13);
            throw null;
        }
        a(12);
        throw null;
    }

    public static InterfaceC0013n c(InterfaceC1423d interfaceC1423d, InterfaceC0013n interfaceC0013n, InterfaceC0010k interfaceC0010k) {
        InterfaceC0013n c6;
        if (interfaceC0013n != null) {
            if (interfaceC0010k != null) {
                for (InterfaceC0013n interfaceC0013n2 = (InterfaceC0013n) interfaceC0013n.a(); interfaceC0013n2 != null && interfaceC0013n2.d() != f759f; interfaceC0013n2 = (InterfaceC0013n) AbstractC0890e.i(interfaceC0013n2, InterfaceC0013n.class, true)) {
                    if (!interfaceC0013n2.d().a(interfaceC1423d, interfaceC0013n2, interfaceC0010k)) {
                        return interfaceC0013n2;
                    }
                }
                if (!(interfaceC0013n instanceof F6.P) || (c6 = c(interfaceC1423d, ((F6.Q) ((F6.P) interfaceC0013n)).f1508J, interfaceC0010k)) == null) {
                    return null;
                }
                return c6;
            }
            a(9);
            throw null;
        }
        a(8);
        throw null;
    }

    public static boolean d(InterfaceC0013n interfaceC0013n, InterfaceC0010k interfaceC0010k) {
        if (interfaceC0010k != null) {
            P f8 = AbstractC0890e.f(interfaceC0010k);
            if (f8 != P.f727e) {
                return f8.equals(AbstractC0890e.f(interfaceC0013n));
            }
            return false;
        }
        a(7);
        throw null;
    }

    public static boolean e(C0014o c0014o) {
        if (c0014o != null) {
            if (c0014o != f754a && c0014o != f755b) {
                return false;
            }
            return true;
        }
        a(14);
        throw null;
    }

    public static C0014o f(h0 h0Var) {
        if (h0Var != null) {
            C0014o c0014o = (C0014o) f766o.get(h0Var);
            if (c0014o != null) {
                return c0014o;
            }
            throw new IllegalArgumentException("Inapplicable visibility: " + h0Var);
        }
        a(15);
        throw null;
    }
}
