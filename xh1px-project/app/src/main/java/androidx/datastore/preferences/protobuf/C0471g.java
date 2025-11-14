package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import n1.AbstractC1149a;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0471g implements Iterable, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final C0471g f8681f = new C0471g(AbstractC0486w.f8743b);

    /* renamed from: g, reason: collision with root package name */
    public static final C0469e f8682g;

    /* renamed from: d, reason: collision with root package name */
    public int f8683d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f8684e;

    static {
        C0469e c0469e;
        if (AbstractC0467c.a()) {
            c0469e = new C0469e(1);
        } else {
            c0469e = new C0469e(0);
        }
        f8682g = c0469e;
    }

    public C0471g(byte[] bArr) {
        bArr.getClass();
        this.f8684e = bArr;
    }

    public static int h(int i4, int i8, int i9) {
        int i10 = i8 - i4;
        if ((i4 | i8 | i10 | (i9 - i8)) < 0) {
            if (i4 >= 0) {
                if (i8 < i4) {
                    throw new IndexOutOfBoundsException(A.j.i(i4, i8, "Beginning index larger than ending index: ", ", "));
                }
                throw new IndexOutOfBoundsException(A.j.i(i8, i9, "End index: ", " >= "));
            }
            throw new IndexOutOfBoundsException(A.j.j(i4, "Beginning index: ", " < 0"));
        }
        return i10;
    }

    public static C0471g i(byte[] bArr, int i4, int i8) {
        byte[] copyOfRange;
        h(i4, i4 + i8, bArr.length);
        switch (f8682g.f8670a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i4, i8 + i4);
                break;
            default:
                copyOfRange = new byte[i8];
                System.arraycopy(bArr, i4, copyOfRange, 0, i8);
                break;
        }
        return new C0471g(copyOfRange);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof C0471g) && size() == ((C0471g) obj).size()) {
                if (size() != 0) {
                    if (obj instanceof C0471g) {
                        C0471g c0471g = (C0471g) obj;
                        int i4 = this.f8683d;
                        int i8 = c0471g.f8683d;
                        if (i4 == 0 || i8 == 0 || i4 == i8) {
                            int size = size();
                            if (size <= c0471g.size()) {
                                if (size <= c0471g.size()) {
                                    byte[] bArr = c0471g.f8684e;
                                    int k = k() + size;
                                    int k6 = k();
                                    int k8 = c0471g.k();
                                    while (k6 < k) {
                                        if (this.f8684e[k6] != bArr[k8]) {
                                            return false;
                                        }
                                        k6++;
                                        k8++;
                                    }
                                    return true;
                                }
                                StringBuilder j = AbstractC1149a.j(size, "Ran off end of other: 0, ", ", ");
                                j.append(c0471g.size());
                                throw new IllegalArgumentException(j.toString());
                            }
                            throw new IllegalArgumentException("Length too large: " + size + size());
                        }
                        return false;
                    }
                    return obj.equals(this);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public byte g(int i4) {
        return this.f8684e[i4];
    }

    public final int hashCode() {
        int i4 = this.f8683d;
        if (i4 == 0) {
            int size = size();
            int k = k();
            int i8 = size;
            for (int i9 = k; i9 < k + size; i9++) {
                i8 = (i8 * 31) + this.f8684e[i9];
            }
            if (i8 == 0) {
                i8 = 1;
            }
            this.f8683d = i8;
            return i8;
        }
        return i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0468d(this);
    }

    public void j(int i4, byte[] bArr) {
        System.arraycopy(this.f8684e, 0, bArr, 0, i4);
    }

    public int k() {
        return 0;
    }

    public byte l(int i4) {
        return this.f8684e[i4];
    }

    public int size() {
        return this.f8684e.length;
    }

    public final String toString() {
        C0471g c0470f;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = E2.b.o(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int h8 = h(0, 47, size());
            if (h8 == 0) {
                c0470f = f8681f;
            } else {
                c0470f = new C0470f(this.f8684e, k(), h8);
            }
            sb2.append(E2.b.o(c0470f));
            sb2.append("...");
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return A.j.r(sb3, sb, "\">");
    }
}
