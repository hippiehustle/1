package t6;

import h6.AbstractC0837b;
import java.util.Iterator;
import p6.InterfaceC1315a;

/* renamed from: t6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1586a implements Iterable, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public final int f15123d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15124e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15125f;

    public C1586a(int i4, int i8, int i9) {
        if (i9 != 0) {
            if (i9 != Integer.MIN_VALUE) {
                this.f15123d = i4;
                this.f15124e = AbstractC0837b.k(i4, i8, i9);
                this.f15125f = i9;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1586a) {
            if (!isEmpty() || !((C1586a) obj).isEmpty()) {
                C1586a c1586a = (C1586a) obj;
                if (this.f15123d == c1586a.f15123d && this.f15124e == c1586a.f15124e && this.f15125f == c1586a.f15125f) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f15123d * 31) + this.f15124e) * 31) + this.f15125f;
    }

    public boolean isEmpty() {
        int i4 = this.f15125f;
        int i8 = this.f15124e;
        int i9 = this.f15123d;
        if (i4 > 0) {
            if (i9 <= i8) {
                return false;
            }
            return true;
        }
        if (i9 >= i8) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1587b(this.f15123d, this.f15124e, this.f15125f);
    }

    public String toString() {
        StringBuilder sb;
        int i4 = this.f15124e;
        int i8 = this.f15123d;
        int i9 = this.f15125f;
        if (i9 > 0) {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append("..");
            sb.append(i4);
            sb.append(" step ");
            sb.append(i9);
        } else {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append(" downTo ");
            sb.append(i4);
            sb.append(" step ");
            sb.append(-i9);
        }
        return sb.toString();
    }
}
