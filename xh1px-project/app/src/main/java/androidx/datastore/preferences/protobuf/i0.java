package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final E2.d f8700a;

    static {
        g0 g0Var;
        if (f0.f8678e && f0.f8677d && !AbstractC0467c.a()) {
            g0Var = new g0(1);
        } else {
            g0Var = new g0(0);
        }
        f8700a = g0Var;
    }

    public static int a(String str) {
        int length = str.length();
        int i4 = 0;
        int i8 = 0;
        while (i8 < length && str.charAt(i8) < 128) {
            i8++;
        }
        int i9 = length;
        while (true) {
            if (i8 >= length) {
                break;
            }
            char charAt = str.charAt(i8);
            if (charAt < 2048) {
                i9 += (127 - charAt) >>> 31;
                i8++;
            } else {
                int length2 = str.length();
                while (i8 < length2) {
                    char charAt2 = str.charAt(i8);
                    if (charAt2 < 2048) {
                        i4 += (127 - charAt2) >>> 31;
                    } else {
                        i4 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i8) >= 65536) {
                                i8++;
                            } else {
                                throw new h0(i8, length2);
                            }
                        }
                    }
                    i8++;
                }
                i9 += i4;
            }
        }
        if (i9 >= length) {
            return i9;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i9 + 4294967296L));
    }
}
