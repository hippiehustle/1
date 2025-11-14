package x0;

import I7.m;
import java.util.Locale;
import o6.j;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1772a implements D0.a {

    /* renamed from: d, reason: collision with root package name */
    public final E0.a f16079d;

    public C1772a(E0.a aVar) {
        j.e(aVar, "db");
        this.f16079d = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [x0.g, x0.e] */
    @Override // D0.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC1778g L(String str) {
        String str2;
        int i4;
        j.e(str, "sql");
        E0.a aVar = this.f16079d;
        j.e(aVar, "db");
        String upperCase = m.w0(str).toString().toUpperCase(Locale.ROOT);
        j.d(upperCase, "toUpperCase(...)");
        int length = upperCase.length() - 2;
        int i8 = -1;
        if (length >= 0) {
            int i9 = 0;
            loop0: while (i9 < length) {
                char charAt = upperCase.charAt(i9);
                if (j.f(charAt, 32) > 0) {
                    if (charAt == '-') {
                        if (upperCase.charAt(i9 + 1) == '-') {
                            i9 = m.h0(upperCase, '\n', i9 + 2, 4);
                            if (i9 < 0) {
                                break;
                            }
                        } else {
                            i8 = i9;
                            break;
                        }
                    } else {
                        if (charAt == '/') {
                            int i10 = i9 + 1;
                            if (upperCase.charAt(i10) != '*') {
                            }
                            do {
                                i10 = m.h0(upperCase, '*', i10 + 1, 4);
                                if (i10 >= 0) {
                                    i4 = i10 + 1;
                                    if (i4 >= length) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } while (upperCase.charAt(i4) != '/');
                            i9 = i10 + 2;
                        }
                        i8 = i9;
                        break;
                    }
                }
                i9++;
            }
        }
        if (i8 >= 0 && i8 <= upperCase.length()) {
            str2 = upperCase.substring(i8, Math.min(i8 + 3, upperCase.length()));
            j.d(str2, "substring(...)");
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return new C1777f(aVar, str);
        }
        int hashCode = str2.hashCode();
        if (hashCode == 79487 ? str2.equals("PRA") : !(hashCode == 81978 ? !str2.equals("SEL") : !(hashCode == 85954 && str2.equals("WIT")))) {
            ?? abstractC1778g = new AbstractC1778g(aVar, str);
            abstractC1778g.f16085g = new int[0];
            abstractC1778g.f16086h = new long[0];
            abstractC1778g.f16087i = new double[0];
            abstractC1778g.j = new String[0];
            abstractC1778g.k = new byte[0];
            return abstractC1778g;
        }
        return new C1777f(aVar, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f16079d.close();
    }
}
