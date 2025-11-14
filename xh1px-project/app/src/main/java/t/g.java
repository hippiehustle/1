package t;

import a6.AbstractC0434i;
import java.util.Arrays;
import u.AbstractC1595a;

/* loaded from: classes.dex */
public final class g implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f14655d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ long[] f14656e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object[] f14657f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ int f14658g;

    public g(int i4) {
        if (i4 == 0) {
            this.f14656e = AbstractC1595a.f15144b;
            this.f14657f = AbstractC1595a.f15145c;
            return;
        }
        int i8 = i4 * 8;
        int i9 = 4;
        while (true) {
            if (i9 >= 32) {
                break;
            }
            int i10 = (1 << i9) - 12;
            if (i8 <= i10) {
                i8 = i10;
                break;
            }
            i9++;
        }
        int i11 = i8 / 8;
        this.f14656e = new long[i11];
        this.f14657f = new Object[i11];
    }

    public final void a() {
        int i4 = this.f14658g;
        Object[] objArr = this.f14657f;
        for (int i8 = 0; i8 < i4; i8++) {
            objArr[i8] = null;
        }
        this.f14658g = 0;
        this.f14655d = false;
    }

    public final boolean b(long j) {
        if (d(j) >= 0) {
            return true;
        }
        return false;
    }

    public final Object c(long j) {
        Object obj;
        int b4 = AbstractC1595a.b(this.f14656e, this.f14658g, j);
        if (b4 >= 0 && (obj = this.f14657f[b4]) != h.f14659a) {
            return obj;
        }
        return null;
    }

    public final Object clone() {
        Object clone = super.clone();
        o6.j.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        g gVar = (g) clone;
        gVar.f14656e = (long[]) this.f14656e.clone();
        gVar.f14657f = (Object[]) this.f14657f.clone();
        return gVar;
    }

    public final int d(long j) {
        if (this.f14655d) {
            int i4 = this.f14658g;
            long[] jArr = this.f14656e;
            Object[] objArr = this.f14657f;
            int i8 = 0;
            for (int i9 = 0; i9 < i4; i9++) {
                Object obj = objArr[i9];
                if (obj != h.f14659a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f14655d = false;
            this.f14658g = i8;
        }
        return AbstractC1595a.b(this.f14656e, this.f14658g, j);
    }

    public final boolean e() {
        if (h() == 0) {
            return true;
        }
        return false;
    }

    public final long f(int i4) {
        int i8;
        if (i4 >= 0 && i4 < (i8 = this.f14658g)) {
            if (this.f14655d) {
                long[] jArr = this.f14656e;
                Object[] objArr = this.f14657f;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj = objArr[i10];
                    if (obj != h.f14659a) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr[i9] = obj;
                            objArr[i10] = null;
                        }
                        i9++;
                    }
                }
                this.f14655d = false;
                this.f14658g = i9;
            }
            return this.f14656e[i4];
        }
        throw new IllegalArgumentException(A.j.l("Expected index to be within 0..size()-1, but was ", i4).toString());
    }

    public final void g(long j, Object obj) {
        Object obj2 = h.f14659a;
        int b4 = AbstractC1595a.b(this.f14656e, this.f14658g, j);
        if (b4 >= 0) {
            this.f14657f[b4] = obj;
            return;
        }
        int i4 = ~b4;
        int i8 = this.f14658g;
        if (i4 < i8) {
            Object[] objArr = this.f14657f;
            if (objArr[i4] == obj2) {
                this.f14656e[i4] = j;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.f14655d) {
            long[] jArr = this.f14656e;
            if (i8 >= jArr.length) {
                Object[] objArr2 = this.f14657f;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj3 = objArr2[i10];
                    if (obj3 != obj2) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr2[i9] = obj3;
                            objArr2[i10] = null;
                        }
                        i9++;
                    }
                }
                this.f14655d = false;
                this.f14658g = i9;
                i4 = ~AbstractC1595a.b(this.f14656e, i9, j);
            }
        }
        int i11 = this.f14658g;
        if (i11 >= this.f14656e.length) {
            int i12 = (i11 + 1) * 8;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 8;
            long[] copyOf = Arrays.copyOf(this.f14656e, i15);
            o6.j.d(copyOf, "copyOf(this, newSize)");
            this.f14656e = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f14657f, i15);
            o6.j.d(copyOf2, "copyOf(this, newSize)");
            this.f14657f = copyOf2;
        }
        int i16 = this.f14658g - i4;
        if (i16 != 0) {
            long[] jArr2 = this.f14656e;
            int i17 = i4 + 1;
            o6.j.e(jArr2, "<this>");
            System.arraycopy(jArr2, i4, jArr2, i17, i16);
            Object[] objArr3 = this.f14657f;
            AbstractC0434i.Q0(objArr3, objArr3, i17, i4, this.f14658g);
        }
        this.f14656e[i4] = j;
        this.f14657f[i4] = obj;
        this.f14658g++;
    }

    public final int h() {
        if (this.f14655d) {
            int i4 = this.f14658g;
            long[] jArr = this.f14656e;
            Object[] objArr = this.f14657f;
            int i8 = 0;
            for (int i9 = 0; i9 < i4; i9++) {
                Object obj = objArr[i9];
                if (obj != h.f14659a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f14655d = false;
            this.f14658g = i8;
        }
        return this.f14658g;
    }

    public final Object i(int i4) {
        int i8;
        if (i4 >= 0 && i4 < (i8 = this.f14658g)) {
            if (this.f14655d) {
                long[] jArr = this.f14656e;
                Object[] objArr = this.f14657f;
                int i9 = 0;
                for (int i10 = 0; i10 < i8; i10++) {
                    Object obj = objArr[i10];
                    if (obj != h.f14659a) {
                        if (i10 != i9) {
                            jArr[i9] = jArr[i10];
                            objArr[i9] = obj;
                            objArr[i10] = null;
                        }
                        i9++;
                    }
                }
                this.f14655d = false;
                this.f14658g = i9;
            }
            return this.f14657f[i4];
        }
        throw new IllegalArgumentException(A.j.l("Expected index to be within 0..size()-1, but was ", i4).toString());
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f14658g * 28);
        sb.append('{');
        int i4 = this.f14658g;
        for (int i8 = 0; i8 < i4; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(f(i8));
            sb.append('=');
            Object i9 = i(i8);
            if (i9 != sb) {
                sb.append(i9);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        o6.j.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ g(Object obj) {
        this(10);
    }
}
