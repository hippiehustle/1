package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class Y {
    public abstract Z a(Object obj);

    public final boolean b(int i4, C0474j c0474j, Object obj) {
        int i8 = c0474j.f8702b;
        int i9 = i8 >>> 3;
        int i10 = i8 & 7;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return false;
                        }
                        if (i10 == 5) {
                            c0474j.w(5);
                            ((Z) obj).c(5 | (i9 << 3), Integer.valueOf(c0474j.f8701a.j()));
                            return true;
                        }
                        throw InvalidProtocolBufferException.b();
                    }
                    Z z8 = new Z(0, new int[8], new Object[8], true);
                    int i11 = i9 << 3;
                    int i12 = i11 | 4;
                    int i13 = i4 + 1;
                    if (i13 >= 100) {
                        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
                    while (c0474j.a() != Integer.MAX_VALUE && b(i13, c0474j, z8)) {
                    }
                    if (i12 == c0474j.f8702b) {
                        if (z8.f8661e) {
                            z8.f8661e = false;
                        }
                        ((Z) obj).c(i11 | 3, z8);
                        return true;
                    }
                    throw new IOException("Protocol message end-group tag did not match expected tag.");
                }
                ((Z) obj).c((i9 << 3) | 2, c0474j.e());
                return true;
            }
            c0474j.w(1);
            ((Z) obj).c((i9 << 3) | 1, Long.valueOf(c0474j.f8701a.k()));
            return true;
        }
        c0474j.w(0);
        ((Z) obj).c(i9 << 3, Long.valueOf(c0474j.f8701a.n()));
        return true;
    }
}
