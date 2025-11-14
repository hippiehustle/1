package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class P extends AbstractC0466b implements RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    public static final P f8630g = new P(new Object[0], 0, false);

    /* renamed from: e, reason: collision with root package name */
    public Object[] f8631e;

    /* renamed from: f, reason: collision with root package name */
    public int f8632f;

    public P(Object[] objArr, int i4, boolean z8) {
        this.f8662d = z8;
        this.f8631e = objArr;
        this.f8632f = i4;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i4 = this.f8632f;
        Object[] objArr = this.f8631e;
        if (i4 == objArr.length) {
            this.f8631e = Arrays.copyOf(objArr, ((i4 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f8631e;
        int i8 = this.f8632f;
        this.f8632f = i8 + 1;
        objArr2[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        h(i4);
        return this.f8631e[i4];
    }

    public final void h(int i4) {
        if (i4 >= 0 && i4 < this.f8632f) {
            return;
        }
        StringBuilder j = AbstractC1149a.j(i4, "Index:", ", Size:");
        j.append(this.f8632f);
        throw new IndexOutOfBoundsException(j.toString());
    }

    public final P i(int i4) {
        if (i4 >= this.f8632f) {
            return new P(Arrays.copyOf(this.f8631e, i4), this.f8632f, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0466b, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        g();
        h(i4);
        Object[] objArr = this.f8631e;
        Object obj = objArr[i4];
        if (i4 < this.f8632f - 1) {
            System.arraycopy(objArr, i4 + 1, objArr, i4, (r2 - i4) - 1);
        }
        this.f8632f--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        g();
        h(i4);
        Object[] objArr = this.f8631e;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8632f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i8;
        g();
        if (i4 >= 0 && i4 <= (i8 = this.f8632f)) {
            Object[] objArr = this.f8631e;
            if (i8 < objArr.length) {
                System.arraycopy(objArr, i4, objArr, i4 + 1, i8 - i4);
            } else {
                Object[] objArr2 = new Object[((i8 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i4);
                System.arraycopy(this.f8631e, i4, objArr2, i4 + 1, this.f8632f - i4);
                this.f8631e = objArr2;
            }
            this.f8631e[i4] = obj;
            this.f8632f++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder j = AbstractC1149a.j(i4, "Index:", ", Size:");
        j.append(this.f8632f);
        throw new IndexOutOfBoundsException(j.toString());
    }
}
