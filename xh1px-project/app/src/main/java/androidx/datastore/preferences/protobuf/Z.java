package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: f, reason: collision with root package name */
    public static final Z f8656f = new Z(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f8657a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f8658b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f8659c;

    /* renamed from: d, reason: collision with root package name */
    public int f8660d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8661e;

    public Z(int i4, int[] iArr, Object[] objArr, boolean z8) {
        this.f8657a = i4;
        this.f8658b = iArr;
        this.f8659c = objArr;
        this.f8661e = z8;
    }

    public final void a(int i4) {
        int[] iArr = this.f8658b;
        if (i4 > iArr.length) {
            int i8 = this.f8657a;
            int i9 = (i8 / 2) + i8;
            if (i9 >= i4) {
                i4 = i9;
            }
            if (i4 < 8) {
                i4 = 8;
            }
            this.f8658b = Arrays.copyOf(iArr, i4);
            this.f8659c = Arrays.copyOf(this.f8659c, i4);
        }
    }

    public final int b() {
        int W7;
        int Y;
        int W8;
        int i4 = this.f8660d;
        if (i4 != -1) {
            return i4;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f8657a; i9++) {
            int i10 = this.f8658b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                ((Integer) this.f8659c[i9]).getClass();
                                W8 = C0475k.W(i11) + 4;
                            } else {
                                throw new IllegalStateException(InvalidProtocolBufferException.b());
                            }
                        } else {
                            W7 = C0475k.W(i11) * 2;
                            Y = ((Z) this.f8659c[i9]).b();
                        }
                    } else {
                        W8 = C0475k.U(i11, (C0471g) this.f8659c[i9]);
                    }
                } else {
                    ((Long) this.f8659c[i9]).getClass();
                    W8 = C0475k.W(i11) + 8;
                }
                i8 = W8 + i8;
            } else {
                long longValue = ((Long) this.f8659c[i9]).longValue();
                W7 = C0475k.W(i11);
                Y = C0475k.Y(longValue);
            }
            i8 = Y + W7 + i8;
        }
        this.f8660d = i8;
        return i8;
    }

    public final void c(int i4, Object obj) {
        if (this.f8661e) {
            a(this.f8657a + 1);
            int[] iArr = this.f8658b;
            int i8 = this.f8657a;
            iArr[i8] = i4;
            this.f8659c[i8] = obj;
            this.f8657a = i8 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(B b4) {
        if (this.f8657a != 0) {
            b4.getClass();
            C0475k c0475k = (C0475k) b4.f8597a;
            for (int i4 = 0; i4 < this.f8657a; i4++) {
                int i8 = this.f8658b[i4];
                Object obj = this.f8659c[i4];
                int i9 = i8 >>> 3;
                int i10 = i8 & 7;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 5) {
                                    c0475k.g0(i9, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(InvalidProtocolBufferException.b());
                                }
                            } else {
                                c0475k.p0(i9, 3);
                                ((Z) obj).d(b4);
                                c0475k.p0(i9, 4);
                            }
                        } else {
                            c0475k.e0(i9, (C0471g) obj);
                        }
                    } else {
                        c0475k.i0(i9, ((Long) obj).longValue());
                    }
                } else {
                    c0475k.s0(i9, ((Long) obj).longValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Z)) {
            return false;
        }
        Z z8 = (Z) obj;
        int i4 = this.f8657a;
        if (i4 == z8.f8657a) {
            int[] iArr = this.f8658b;
            int[] iArr2 = z8.f8658b;
            int i8 = 0;
            while (true) {
                if (i8 < i4) {
                    if (iArr[i8] != iArr2[i8]) {
                        break;
                    }
                    i8++;
                } else {
                    Object[] objArr = this.f8659c;
                    Object[] objArr2 = z8.f8659c;
                    int i9 = this.f8657a;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (objArr[i10].equals(objArr2[i10])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f8657a;
        int i8 = (527 + i4) * 31;
        int[] iArr = this.f8658b;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i4; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = (i8 + i10) * 31;
        Object[] objArr = this.f8659c;
        int i13 = this.f8657a;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }
}
