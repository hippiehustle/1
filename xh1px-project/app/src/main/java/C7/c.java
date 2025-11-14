package C7;

import java.util.Arrays;
import java.util.Iterator;
import w7.C1745g;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f789d;

    /* renamed from: e, reason: collision with root package name */
    public int f790e;

    @Override // C7.a
    public final int g() {
        return this.f790e;
    }

    @Override // C7.a
    public final Object get(int i4) {
        Object[] objArr = this.f789d;
        if (i4 >= 0 && i4 < objArr.length) {
            return objArr[i4];
        }
        return null;
    }

    @Override // C7.a
    public final void h(int i4, C1745g c1745g) {
        Object[] objArr = this.f789d;
        if (objArr.length <= i4) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i4);
            Object[] copyOf = Arrays.copyOf(this.f789d, length);
            o6.j.d(copyOf, "copyOf(...)");
            this.f789d = copyOf;
        }
        Object[] objArr2 = this.f789d;
        if (objArr2[i4] == null) {
            this.f790e++;
        }
        objArr2[i4] = c1745g;
    }

    @Override // C7.a, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this);
    }
}
