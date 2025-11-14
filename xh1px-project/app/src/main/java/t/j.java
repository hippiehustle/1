package t;

import a6.AbstractC0434i;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import u.AbstractC1595a;

/* loaded from: classes.dex */
public class j {

    /* renamed from: d, reason: collision with root package name */
    public int[] f14668d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f14669e;

    /* renamed from: f, reason: collision with root package name */
    public int f14670f;

    public j(int i4) {
        int[] iArr;
        Object[] objArr;
        if (i4 == 0) {
            iArr = AbstractC1595a.f15143a;
        } else {
            iArr = new int[i4];
        }
        this.f14668d = iArr;
        if (i4 == 0) {
            objArr = AbstractC1595a.f15145c;
        } else {
            objArr = new Object[i4 << 1];
        }
        this.f14669e = objArr;
    }

    public final int a(Object obj) {
        int i4 = this.f14670f * 2;
        Object[] objArr = this.f14669e;
        if (obj == null) {
            for (int i8 = 1; i8 < i4; i8 += 2) {
                if (objArr[i8] == null) {
                    return i8 >> 1;
                }
            }
            return -1;
        }
        for (int i9 = 1; i9 < i4; i9 += 2) {
            if (obj.equals(objArr[i9])) {
                return i9 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i4) {
        int i8 = this.f14670f;
        int[] iArr = this.f14668d;
        if (iArr.length < i4) {
            int[] copyOf = Arrays.copyOf(iArr, i4);
            o6.j.d(copyOf, "copyOf(this, newSize)");
            this.f14668d = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f14669e, i4 * 2);
            o6.j.d(copyOf2, "copyOf(this, newSize)");
            this.f14669e = copyOf2;
        }
        if (this.f14670f == i8) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i4, Object obj) {
        int i8 = this.f14670f;
        if (i8 == 0) {
            return -1;
        }
        int a3 = AbstractC1595a.a(i8, i4, this.f14668d);
        if (a3 < 0 || o6.j.a(obj, this.f14669e[a3 << 1])) {
            return a3;
        }
        int i9 = a3 + 1;
        while (i9 < i8 && this.f14668d[i9] == i4) {
            if (o6.j.a(obj, this.f14669e[i9 << 1])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = a3 - 1; i10 >= 0 && this.f14668d[i10] == i4; i10--) {
            if (o6.j.a(obj, this.f14669e[i10 << 1])) {
                return i10;
            }
        }
        return ~i9;
    }

    public final void clear() {
        if (this.f14670f > 0) {
            this.f14668d = AbstractC1595a.f15143a;
            this.f14669e = AbstractC1595a.f15145c;
            this.f14670f = 0;
        }
        if (this.f14670f <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        if (d(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(Object obj) {
        if (obj == null) {
            return e();
        }
        return c(obj.hashCode(), obj);
    }

    public final int e() {
        int i4 = this.f14670f;
        if (i4 == 0) {
            return -1;
        }
        int a3 = AbstractC1595a.a(i4, 0, this.f14668d);
        if (a3 < 0 || this.f14669e[a3 << 1] == null) {
            return a3;
        }
        int i8 = a3 + 1;
        while (i8 < i4 && this.f14668d[i8] == 0) {
            if (this.f14669e[i8 << 1] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = a3 - 1; i9 >= 0 && this.f14668d[i9] == 0; i9--) {
            if (this.f14669e[i9 << 1] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof j) {
                int i4 = this.f14670f;
                if (i4 != ((j) obj).f14670f) {
                    return false;
                }
                j jVar = (j) obj;
                for (int i8 = 0; i8 < i4; i8++) {
                    Object f8 = f(i8);
                    Object i9 = i(i8);
                    Object obj2 = jVar.get(f8);
                    if (i9 == null) {
                        if (obj2 != null || !jVar.containsKey(f8)) {
                            return false;
                        }
                    } else if (!i9.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f14670f != ((Map) obj).size()) {
                return false;
            }
            int i10 = this.f14670f;
            for (int i11 = 0; i11 < i10; i11++) {
                Object f9 = f(i11);
                Object i12 = i(i11);
                Object obj3 = ((Map) obj).get(f9);
                if (i12 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f9)) {
                        return false;
                    }
                } else if (!i12.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i4) {
        if (i4 >= 0 && i4 < this.f14670f) {
            return this.f14669e[i4 << 1];
        }
        throw new IllegalArgumentException(A.j.l("Expected index to be within 0..size()-1, but was ", i4).toString());
    }

    public final Object g(int i4) {
        int i8;
        if (i4 >= 0 && i4 < (i8 = this.f14670f)) {
            Object[] objArr = this.f14669e;
            int i9 = i4 << 1;
            Object obj = objArr[i9 + 1];
            if (i8 <= 1) {
                clear();
                return obj;
            }
            int i10 = i8 - 1;
            int[] iArr = this.f14668d;
            int i11 = 8;
            if (iArr.length > 8 && i8 < iArr.length / 3) {
                if (i8 > 8) {
                    i11 = i8 + (i8 >> 1);
                }
                int[] copyOf = Arrays.copyOf(iArr, i11);
                o6.j.d(copyOf, "copyOf(this, newSize)");
                this.f14668d = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f14669e, i11 << 1);
                o6.j.d(copyOf2, "copyOf(this, newSize)");
                this.f14669e = copyOf2;
                if (i8 == this.f14670f) {
                    if (i4 > 0) {
                        AbstractC0434i.P0(0, 0, i4, iArr, this.f14668d);
                        AbstractC0434i.Q0(objArr, this.f14669e, 0, 0, i9);
                    }
                    if (i4 < i10) {
                        int i12 = i4 + 1;
                        AbstractC0434i.P0(i4, i12, i8, iArr, this.f14668d);
                        AbstractC0434i.Q0(objArr, this.f14669e, i9, i12 << 1, i8 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i4 < i10) {
                    int i13 = i4 + 1;
                    AbstractC0434i.P0(i4, i13, i8, iArr, iArr);
                    Object[] objArr2 = this.f14669e;
                    AbstractC0434i.Q0(objArr2, objArr2, i9, i13 << 1, i8 << 1);
                }
                Object[] objArr3 = this.f14669e;
                int i14 = i10 << 1;
                objArr3[i14] = null;
                objArr3[i14 + 1] = null;
            }
            if (i8 == this.f14670f) {
                this.f14670f = i10;
                return obj;
            }
            throw new ConcurrentModificationException();
        }
        throw new IllegalArgumentException(A.j.l("Expected index to be within 0..size()-1, but was ", i4).toString());
    }

    public Object get(Object obj) {
        int d2 = d(obj);
        if (d2 >= 0) {
            return this.f14669e[(d2 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d2 = d(obj);
        if (d2 >= 0) {
            return this.f14669e[(d2 << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i4, Object obj) {
        if (i4 >= 0 && i4 < this.f14670f) {
            int i8 = (i4 << 1) + 1;
            Object[] objArr = this.f14669e;
            Object obj2 = objArr[i8];
            objArr[i8] = obj;
            return obj2;
        }
        throw new IllegalArgumentException(A.j.l("Expected index to be within 0..size()-1, but was ", i4).toString());
    }

    public final int hashCode() {
        int i4;
        int[] iArr = this.f14668d;
        Object[] objArr = this.f14669e;
        int i8 = this.f14670f;
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            Object obj = objArr[i9];
            int i12 = iArr[i10];
            if (obj != null) {
                i4 = obj.hashCode();
            } else {
                i4 = 0;
            }
            i11 += i4 ^ i12;
            i10++;
            i9 += 2;
        }
        return i11;
    }

    public final Object i(int i4) {
        if (i4 >= 0 && i4 < this.f14670f) {
            return this.f14669e[(i4 << 1) + 1];
        }
        throw new IllegalArgumentException(A.j.l("Expected index to be within 0..size()-1, but was ", i4).toString());
    }

    public final boolean isEmpty() {
        if (this.f14670f <= 0) {
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        int i4;
        int e9;
        int i8 = this.f14670f;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        if (obj != null) {
            e9 = c(i4, obj);
        } else {
            e9 = e();
        }
        if (e9 >= 0) {
            int i9 = (e9 << 1) + 1;
            Object[] objArr = this.f14669e;
            Object obj3 = objArr[i9];
            objArr[i9] = obj2;
            return obj3;
        }
        int i10 = ~e9;
        int[] iArr = this.f14668d;
        if (i8 >= iArr.length) {
            int i11 = 8;
            if (i8 >= 8) {
                i11 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i11 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i11);
            o6.j.d(copyOf, "copyOf(this, newSize)");
            this.f14668d = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f14669e, i11 << 1);
            o6.j.d(copyOf2, "copyOf(this, newSize)");
            this.f14669e = copyOf2;
            if (i8 != this.f14670f) {
                throw new ConcurrentModificationException();
            }
        }
        if (i10 < i8) {
            int[] iArr2 = this.f14668d;
            int i12 = i10 + 1;
            AbstractC0434i.P0(i12, i10, i8, iArr2, iArr2);
            Object[] objArr2 = this.f14669e;
            AbstractC0434i.Q0(objArr2, objArr2, i12 << 1, i10 << 1, this.f14670f << 1);
        }
        int i13 = this.f14670f;
        if (i8 == i13) {
            int[] iArr3 = this.f14668d;
            if (i10 < iArr3.length) {
                iArr3[i10] = i4;
                Object[] objArr3 = this.f14669e;
                int i14 = i10 << 1;
                objArr3[i14] = obj;
                objArr3[i14 + 1] = obj2;
                this.f14670f = i13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public Object remove(Object obj) {
        int d2 = d(obj);
        if (d2 >= 0) {
            return g(d2);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d2 = d(obj);
        if (d2 >= 0) {
            return h(d2, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f14670f;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f14670f * 28);
        sb.append('{');
        int i4 = this.f14670f;
        for (int i8 = 0; i8 < i4; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object f8 = f(i8);
            if (f8 != sb) {
                sb.append(f8);
            } else {
                sb.append("(this Map)");
            }
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

    public final boolean remove(Object obj, Object obj2) {
        int d2 = d(obj);
        if (d2 < 0 || !o6.j.a(obj2, i(d2))) {
            return false;
        }
        g(d2);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d2 = d(obj);
        if (d2 < 0 || !o6.j.a(obj2, i(d2))) {
            return false;
        }
        h(d2, obj3);
        return true;
    }
}
