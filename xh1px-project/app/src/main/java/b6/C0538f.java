package b6;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o6.j;
import p6.InterfaceC1317c;

/* renamed from: b6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0538f implements Map, Serializable, InterfaceC1317c {

    /* renamed from: q, reason: collision with root package name */
    public static final C0538f f9225q;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f9226d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f9227e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f9228f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f9229g;

    /* renamed from: h, reason: collision with root package name */
    public int f9230h;

    /* renamed from: i, reason: collision with root package name */
    public int f9231i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f9232l;

    /* renamed from: m, reason: collision with root package name */
    public C0539g f9233m;

    /* renamed from: n, reason: collision with root package name */
    public C0540h f9234n;

    /* renamed from: o, reason: collision with root package name */
    public C0539g f9235o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9236p;

    static {
        C0538f c0538f = new C0538f(0);
        c0538f.f9236p = true;
        f9225q = c0538f;
    }

    public C0538f() {
        this(8);
    }

    public final int b(Object obj) {
        d();
        while (true) {
            int l6 = l(obj);
            int i4 = this.f9230h * 2;
            int length = this.f9229g.length / 2;
            if (i4 > length) {
                i4 = length;
            }
            int i8 = 0;
            while (true) {
                int[] iArr = this.f9229g;
                int i9 = iArr[l6];
                if (i9 <= 0) {
                    int i10 = this.f9231i;
                    Object[] objArr = this.f9226d;
                    if (i10 >= objArr.length) {
                        i(1);
                    } else {
                        int i11 = i10 + 1;
                        this.f9231i = i11;
                        objArr[i10] = obj;
                        this.f9228f[i10] = l6;
                        iArr[l6] = i11;
                        this.f9232l++;
                        this.k++;
                        if (i8 > this.f9230h) {
                            this.f9230h = i8;
                        }
                        return i10;
                    }
                } else {
                    if (j.a(this.f9226d[i9 - 1], obj)) {
                        return -i9;
                    }
                    i8++;
                    if (i8 > i4) {
                        m(this.f9229g.length * 2);
                        break;
                    }
                    int i12 = l6 - 1;
                    if (l6 == 0) {
                        l6 = this.f9229g.length - 1;
                    } else {
                        l6 = i12;
                    }
                }
            }
        }
    }

    public final C0538f c() {
        d();
        this.f9236p = true;
        if (this.f9232l > 0) {
            return this;
        }
        C0538f c0538f = f9225q;
        j.c(c0538f, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c0538f;
    }

    @Override // java.util.Map
    public final void clear() {
        d();
        int i4 = this.f9231i - 1;
        if (i4 >= 0) {
            int i8 = 0;
            while (true) {
                int[] iArr = this.f9228f;
                int i9 = iArr[i8];
                if (i9 >= 0) {
                    this.f9229g[i9] = 0;
                    iArr[i8] = -1;
                }
                if (i8 == i4) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        D2.f.H(this.f9226d, 0, this.f9231i);
        Object[] objArr = this.f9227e;
        if (objArr != null) {
            D2.f.H(objArr, 0, this.f9231i);
        }
        this.f9232l = 0;
        this.f9231i = 0;
        this.k++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (j(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (k(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final void d() {
        if (!this.f9236p) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0539g c0539g = this.f9235o;
        if (c0539g == null) {
            C0539g c0539g2 = new C0539g(this, 0);
            this.f9235o = c0539g2;
            return c0539g2;
        }
        return c0539g;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f9232l != map.size() || !g(map.entrySet())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void f(boolean z8) {
        int i4;
        Object[] objArr = this.f9227e;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i4 = this.f9231i;
            if (i8 >= i4) {
                break;
            }
            int[] iArr = this.f9228f;
            int i10 = iArr[i8];
            if (i10 >= 0) {
                Object[] objArr2 = this.f9226d;
                objArr2[i9] = objArr2[i8];
                if (objArr != null) {
                    objArr[i9] = objArr[i8];
                }
                if (z8) {
                    iArr[i9] = i10;
                    this.f9229g[i10] = i9 + 1;
                }
                i9++;
            }
            i8++;
        }
        D2.f.H(this.f9226d, i9, i4);
        if (objArr != null) {
            D2.f.H(objArr, i9, this.f9231i);
        }
        this.f9231i = i9;
    }

    public final boolean g(Collection collection) {
        j.e(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!h((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int j = j(obj);
        if (j < 0) {
            return null;
        }
        Object[] objArr = this.f9227e;
        j.b(objArr);
        return objArr[j];
    }

    public final boolean h(Map.Entry entry) {
        j.e(entry, "entry");
        int j = j(entry.getKey());
        if (j < 0) {
            return false;
        }
        Object[] objArr = this.f9227e;
        j.b(objArr);
        return j.a(objArr[j], entry.getValue());
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i4;
        int i8;
        C0536d c0536d = new C0536d(this, 0);
        int i9 = 0;
        while (c0536d.hasNext()) {
            int i10 = c0536d.f4203d;
            C0538f c0538f = (C0538f) c0536d.f4206g;
            if (i10 < c0538f.f9231i) {
                c0536d.f4203d = i10 + 1;
                c0536d.f4204e = i10;
                Object obj = c0538f.f9226d[i10];
                if (obj != null) {
                    i4 = obj.hashCode();
                } else {
                    i4 = 0;
                }
                Object[] objArr = c0538f.f9227e;
                j.b(objArr);
                Object obj2 = objArr[c0536d.f4204e];
                if (obj2 != null) {
                    i8 = obj2.hashCode();
                } else {
                    i8 = 0;
                }
                c0536d.g();
                i9 += i4 ^ i8;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i9;
    }

    public final void i(int i4) {
        Object[] objArr;
        Object[] objArr2 = this.f9226d;
        int length = objArr2.length;
        int i8 = this.f9231i;
        int i9 = length - i8;
        int i10 = i8 - this.f9232l;
        int i11 = 1;
        if (i9 < i4 && i9 + i10 >= i4 && i10 >= objArr2.length / 4) {
            f(true);
            return;
        }
        int i12 = i8 + i4;
        if (i12 >= 0) {
            if (i12 > objArr2.length) {
                int length2 = objArr2.length;
                int i13 = length2 + (length2 >> 1);
                if (i13 - i12 < 0) {
                    i13 = i12;
                }
                if (i13 - 2147483639 > 0) {
                    if (i12 > 2147483639) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = 2147483639;
                    }
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i13);
                j.d(copyOf, "copyOf(...)");
                this.f9226d = copyOf;
                Object[] objArr3 = this.f9227e;
                if (objArr3 != null) {
                    objArr = Arrays.copyOf(objArr3, i13);
                    j.d(objArr, "copyOf(...)");
                } else {
                    objArr = null;
                }
                this.f9227e = objArr;
                int[] copyOf2 = Arrays.copyOf(this.f9228f, i13);
                j.d(copyOf2, "copyOf(...)");
                this.f9228f = copyOf2;
                if (i13 >= 1) {
                    i11 = i13;
                }
                int highestOneBit = Integer.highestOneBit(i11 * 3);
                if (highestOneBit > this.f9229g.length) {
                    m(highestOneBit);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.f9232l == 0) {
            return true;
        }
        return false;
    }

    public final int j(Object obj) {
        int l6 = l(obj);
        int i4 = this.f9230h;
        while (true) {
            int i8 = this.f9229g[l6];
            if (i8 == 0) {
                return -1;
            }
            if (i8 > 0) {
                int i9 = i8 - 1;
                if (j.a(this.f9226d[i9], obj)) {
                    return i9;
                }
            }
            i4--;
            if (i4 < 0) {
                return -1;
            }
            int i10 = l6 - 1;
            if (l6 == 0) {
                l6 = this.f9229g.length - 1;
            } else {
                l6 = i10;
            }
        }
    }

    public final int k(Object obj) {
        int i4 = this.f9231i;
        while (true) {
            i4--;
            if (i4 < 0) {
                return -1;
            }
            if (this.f9228f[i4] >= 0) {
                Object[] objArr = this.f9227e;
                j.b(objArr);
                if (j.a(objArr[i4], obj)) {
                    return i4;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0539g c0539g = this.f9233m;
        if (c0539g == null) {
            C0539g c0539g2 = new C0539g(this, 1);
            this.f9233m = c0539g2;
            return c0539g2;
        }
        return c0539g;
    }

    public final int l(Object obj) {
        int i4;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        return (i4 * (-1640531527)) >>> this.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f9228f[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i4) {
        this.k++;
        int i8 = 0;
        if (this.f9231i > this.f9232l) {
            f(false);
        }
        this.f9229g = new int[i4];
        this.j = Integer.numberOfLeadingZeros(i4) + 1;
        while (i8 < this.f9231i) {
            int i9 = i8 + 1;
            int l6 = l(this.f9226d[i8]);
            int i10 = this.f9230h;
            while (true) {
                int[] iArr = this.f9229g;
                if (iArr[l6] == 0) {
                    break;
                }
                i10--;
                if (i10 >= 0) {
                    int i11 = l6 - 1;
                    if (l6 == 0) {
                        l6 = iArr.length - 1;
                    } else {
                        l6 = i11;
                    }
                } else {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i4) {
        Object[] objArr = this.f9226d;
        j.e(objArr, "<this>");
        objArr[i4] = null;
        Object[] objArr2 = this.f9227e;
        if (objArr2 != null) {
            objArr2[i4] = null;
        }
        int i8 = this.f9228f[i4];
        int i9 = this.f9230h * 2;
        int length = this.f9229g.length / 2;
        if (i9 > length) {
            i9 = length;
        }
        int i10 = i9;
        int i11 = 0;
        int i12 = i8;
        while (true) {
            int i13 = i8 - 1;
            if (i8 == 0) {
                i8 = this.f9229g.length - 1;
            } else {
                i8 = i13;
            }
            i11++;
            if (i11 > this.f9230h) {
                this.f9229g[i12] = 0;
                break;
            }
            int[] iArr = this.f9229g;
            int i14 = iArr[i8];
            if (i14 == 0) {
                iArr[i12] = 0;
                break;
            }
            if (i14 < 0) {
                iArr[i12] = -1;
            } else {
                int i15 = i14 - 1;
                int l6 = l(this.f9226d[i15]) - i8;
                int[] iArr2 = this.f9229g;
                if ((l6 & (iArr2.length - 1)) >= i11) {
                    iArr2[i12] = i14;
                    this.f9228f[i15] = i12;
                }
                i10--;
                if (i10 >= 0) {
                    this.f9229g[i12] = -1;
                    break;
                }
            }
            i12 = i8;
            i11 = 0;
            i10--;
            if (i10 >= 0) {
            }
        }
        this.f9228f[i4] = -1;
        this.f9232l--;
        this.k++;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        d();
        int b4 = b(obj);
        Object[] objArr = this.f9227e;
        if (objArr == null) {
            int length = this.f9226d.length;
            if (length >= 0) {
                objArr = new Object[length];
                this.f9227e = objArr;
            } else {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
        }
        if (b4 < 0) {
            int i4 = (-b4) - 1;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        objArr[b4] = obj2;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        j.e(map, "from");
        d();
        Set<Map.Entry> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            i(entrySet.size());
            for (Map.Entry entry : entrySet) {
                int b4 = b(entry.getKey());
                Object[] objArr = this.f9227e;
                if (objArr == null) {
                    int length = this.f9226d.length;
                    if (length >= 0) {
                        objArr = new Object[length];
                        this.f9227e = objArr;
                    } else {
                        throw new IllegalArgumentException("capacity must be non-negative.");
                    }
                }
                if (b4 >= 0) {
                    objArr[b4] = entry.getValue();
                } else {
                    int i4 = (-b4) - 1;
                    if (!j.a(entry.getValue(), objArr[i4])) {
                        objArr[i4] = entry.getValue();
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        d();
        int j = j(obj);
        if (j < 0) {
            return null;
        }
        Object[] objArr = this.f9227e;
        j.b(objArr);
        Object obj2 = objArr[j];
        n(j);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f9232l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f9232l * 3) + 2);
        sb.append("{");
        int i4 = 0;
        C0536d c0536d = new C0536d(this, 0);
        while (c0536d.hasNext()) {
            if (i4 > 0) {
                sb.append(", ");
            }
            int i8 = c0536d.f4203d;
            C0538f c0538f = (C0538f) c0536d.f4206g;
            if (i8 < c0538f.f9231i) {
                c0536d.f4203d = i8 + 1;
                c0536d.f4204e = i8;
                Object obj = c0538f.f9226d[i8];
                if (obj == c0538f) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = c0538f.f9227e;
                j.b(objArr);
                Object obj2 = objArr[c0536d.f4204e];
                if (obj2 == c0538f) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                c0536d.g();
                i4++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb.append("}");
        String sb2 = sb.toString();
        j.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        C0540h c0540h = this.f9234n;
        if (c0540h == null) {
            C0540h c0540h2 = new C0540h(this);
            this.f9234n = c0540h2;
            return c0540h2;
        }
        return c0540h;
    }

    public C0538f(int i4) {
        if (i4 >= 0) {
            Object[] objArr = new Object[i4];
            int[] iArr = new int[i4];
            int highestOneBit = Integer.highestOneBit((i4 < 1 ? 1 : i4) * 3);
            this.f9226d = objArr;
            this.f9227e = null;
            this.f9228f = iArr;
            this.f9229g = new int[highestOneBit];
            this.f9230h = 2;
            this.f9231i = 0;
            this.j = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }
}
