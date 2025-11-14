package t;

import a6.AbstractC0434i;
import a6.AbstractC0436k;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import p6.InterfaceC1316b;
import p6.InterfaceC1318d;
import u.AbstractC1595a;

/* loaded from: classes.dex */
public final class f implements Collection, Set, InterfaceC1316b, InterfaceC1318d {

    /* renamed from: d, reason: collision with root package name */
    public int[] f14652d = AbstractC1595a.f15143a;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f14653e = AbstractC1595a.f15145c;

    /* renamed from: f, reason: collision with root package name */
    public int f14654f;

    public f(int i4) {
        if (i4 > 0) {
            h.b(this, i4);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i4;
        int c6;
        int i8 = this.f14654f;
        if (obj == null) {
            c6 = h.c(this, null, 0);
            i4 = 0;
        } else {
            int hashCode = obj.hashCode();
            i4 = hashCode;
            c6 = h.c(this, obj, hashCode);
        }
        if (c6 >= 0) {
            return false;
        }
        int i9 = ~c6;
        int[] iArr = this.f14652d;
        if (i8 >= iArr.length) {
            int i10 = 8;
            if (i8 >= 8) {
                i10 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i10 = 4;
            }
            Object[] objArr = this.f14653e;
            int[] iArr2 = new int[i10];
            this.f14652d = iArr2;
            this.f14653e = new Object[i10];
            if (i8 == this.f14654f) {
                if (iArr2.length != 0) {
                    AbstractC0434i.R0(iArr.length, 6, iArr, iArr2);
                    AbstractC0434i.S0(objArr, this.f14653e, 0, objArr.length, 6);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i9 < i8) {
            int[] iArr3 = this.f14652d;
            int i11 = i9 + 1;
            AbstractC0434i.P0(i11, i9, i8, iArr3, iArr3);
            Object[] objArr2 = this.f14653e;
            AbstractC0434i.Q0(objArr2, objArr2, i11, i9, i8);
        }
        int i12 = this.f14654f;
        if (i8 == i12) {
            int[] iArr4 = this.f14652d;
            if (i9 < iArr4.length) {
                iArr4[i9] = i4;
                this.f14653e[i9] = obj;
                this.f14654f = i12 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        o6.j.e(collection, "elements");
        int size = collection.size() + this.f14654f;
        int i4 = this.f14654f;
        int[] iArr = this.f14652d;
        boolean z8 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f14653e;
            int[] iArr2 = new int[size];
            this.f14652d = iArr2;
            this.f14653e = new Object[size];
            if (i4 > 0) {
                AbstractC0434i.R0(i4, 6, iArr, iArr2);
                AbstractC0434i.S0(objArr, this.f14653e, 0, this.f14654f, 6);
            }
        }
        if (this.f14654f == i4) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z8 |= add(it.next());
            }
            return z8;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f14654f != 0) {
            this.f14652d = AbstractC1595a.f15143a;
            this.f14653e = AbstractC1595a.f15145c;
            this.f14654f = 0;
        }
        if (this.f14654f == 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int c6;
        if (obj == null) {
            c6 = h.c(this, null, 0);
        } else {
            c6 = h.c(this, obj, obj.hashCode());
        }
        if (c6 < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        o6.j.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f14654f != ((Set) obj).size()) {
            return false;
        }
        try {
            int i4 = this.f14654f;
            for (int i8 = 0; i8 < i4; i8++) {
                if (!((Set) obj).contains(this.f14653e[i8])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final Object g(int i4) {
        int i8 = this.f14654f;
        Object[] objArr = this.f14653e;
        Object obj = objArr[i4];
        if (i8 <= 1) {
            clear();
            return obj;
        }
        int i9 = i8 - 1;
        int[] iArr = this.f14652d;
        int i10 = 8;
        if (iArr.length > 8 && i8 < iArr.length / 3) {
            if (i8 > 8) {
                i10 = i8 + (i8 >> 1);
            }
            int[] iArr2 = new int[i10];
            this.f14652d = iArr2;
            this.f14653e = new Object[i10];
            if (i4 > 0) {
                AbstractC0434i.R0(i4, 6, iArr, iArr2);
                AbstractC0434i.S0(objArr, this.f14653e, 0, i4, 6);
            }
            if (i4 < i9) {
                int i11 = i4 + 1;
                AbstractC0434i.P0(i4, i11, i8, iArr, this.f14652d);
                AbstractC0434i.Q0(objArr, this.f14653e, i4, i11, i8);
            }
        } else {
            if (i4 < i9) {
                int i12 = i4 + 1;
                AbstractC0434i.P0(i4, i12, i8, iArr, iArr);
                Object[] objArr2 = this.f14653e;
                AbstractC0434i.Q0(objArr2, objArr2, i4, i12, i8);
            }
            this.f14653e[i9] = null;
        }
        if (i8 == this.f14654f) {
            this.f14654f = i9;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f14652d;
        int i4 = this.f14654f;
        int i8 = 0;
        for (int i9 = 0; i9 < i4; i9++) {
            i8 += iArr[i9];
        }
        return i8;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.f14654f <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1523a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int c6;
        if (obj == null) {
            c6 = h.c(this, null, 0);
        } else {
            c6 = h.c(this, obj, obj.hashCode());
        }
        if (c6 < 0) {
            return false;
        }
        g(c6);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        o6.j.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= remove(it.next());
        }
        return z8;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        o6.j.e(collection, "elements");
        boolean z8 = false;
        for (int i4 = this.f14654f - 1; -1 < i4; i4--) {
            if (!AbstractC0436k.l0(collection, this.f14653e[i4])) {
                g(i4);
                z8 = true;
            }
        }
        return z8;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f14654f;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC0434i.T0(this.f14653e, 0, this.f14654f);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f14654f * 14);
        sb.append('{');
        int i4 = this.f14654f;
        for (int i8 = 0; i8 < i4; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object obj = this.f14653e[i8];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        o6.j.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        o6.j.e(objArr, "array");
        int i4 = this.f14654f;
        if (objArr.length < i4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
        } else if (objArr.length > i4) {
            objArr[i4] = null;
        }
        AbstractC0434i.Q0(this.f14653e, objArr, 0, 0, this.f14654f);
        return objArr;
    }
}
