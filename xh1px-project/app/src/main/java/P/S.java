package P;

import Z7.C0399u;
import a6.AbstractC0429d;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p6.InterfaceC1315a;

/* loaded from: classes.dex */
public class S implements Iterator, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4222d;

    /* renamed from: e, reason: collision with root package name */
    public int f4223e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4224f;

    public /* synthetic */ S(int i4, Object obj) {
        this.f4222d = i4;
        this.f4224f = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4222d) {
            case 0:
                if (this.f4223e < ((ViewGroup) this.f4224f).getChildCount()) {
                    return true;
                }
                return false;
            case 1:
                if (this.f4223e > 0) {
                    return true;
                }
                return false;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                if (this.f4223e < ((byte[]) this.f4224f).length) {
                    return true;
                }
                return false;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                if (this.f4223e < ((int[]) this.f4224f).length) {
                    return true;
                }
                return false;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                if (this.f4223e < ((long[]) this.f4224f).length) {
                    return true;
                }
                return false;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                if (this.f4223e < ((short[]) this.f4224f).length) {
                    return true;
                }
                return false;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                if (this.f4223e < ((AbstractC0429d) this.f4224f).g()) {
                    return true;
                }
                return false;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                if (this.f4223e < ((Object[]) this.f4224f).length) {
                    return true;
                }
                return false;
            default:
                if (this.f4223e < ((t.k) this.f4224f).e()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4222d) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.f4224f;
                int i4 = this.f4223e;
                this.f4223e = i4 + 1;
                View childAt = viewGroup.getChildAt(i4);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                C0399u c0399u = (C0399u) this.f4224f;
                int i8 = c0399u.f7568c;
                int i9 = this.f4223e;
                this.f4223e = i9 - 1;
                return c0399u.f7570e[i8 - i9];
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                int i10 = this.f4223e;
                byte[] bArr = (byte[]) this.f4224f;
                if (i10 < bArr.length) {
                    this.f4223e = i10 + 1;
                    return new Z5.p(bArr[i10]);
                }
                throw new NoSuchElementException(String.valueOf(this.f4223e));
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                int i11 = this.f4223e;
                int[] iArr = (int[]) this.f4224f;
                if (i11 < iArr.length) {
                    this.f4223e = i11 + 1;
                    return new Z5.r(iArr[i11]);
                }
                throw new NoSuchElementException(String.valueOf(this.f4223e));
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                int i12 = this.f4223e;
                long[] jArr = (long[]) this.f4224f;
                if (i12 < jArr.length) {
                    this.f4223e = i12 + 1;
                    return new Z5.t(jArr[i12]);
                }
                throw new NoSuchElementException(String.valueOf(this.f4223e));
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                int i13 = this.f4223e;
                short[] sArr = (short[]) this.f4224f;
                if (i13 < sArr.length) {
                    this.f4223e = i13 + 1;
                    return new Z5.w(sArr[i13]);
                }
                throw new NoSuchElementException(String.valueOf(this.f4223e));
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                if (hasNext()) {
                    AbstractC0429d abstractC0429d = (AbstractC0429d) this.f4224f;
                    int i14 = this.f4223e;
                    this.f4223e = i14 + 1;
                    return abstractC0429d.get(i14);
                }
                throw new NoSuchElementException();
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                try {
                    Object[] objArr = (Object[]) this.f4224f;
                    int i15 = this.f4223e;
                    this.f4223e = i15 + 1;
                    return objArr[i15];
                } catch (ArrayIndexOutOfBoundsException e9) {
                    this.f4223e--;
                    throw new NoSuchElementException(e9.getMessage());
                }
            default:
                t.k kVar = (t.k) this.f4224f;
                int i16 = this.f4223e;
                this.f4223e = i16 + 1;
                return kVar.f(i16);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4222d) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.f4224f;
                int i4 = this.f4223e - 1;
                this.f4223e = i4;
                viewGroup.removeViewAt(i4);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public S(Object[] objArr) {
        this.f4222d = 7;
        o6.j.e(objArr, "array");
        this.f4224f = objArr;
    }

    public S(C0399u c0399u) {
        this.f4222d = 1;
        this.f4224f = c0399u;
        this.f4223e = c0399u.f7568c;
    }
}
