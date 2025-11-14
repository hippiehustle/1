package t;

import a6.AbstractC0434i;
import java.util.Arrays;
import u.AbstractC1595a;

/* loaded from: classes.dex */
public final class k implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f14671d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ int[] f14672e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object[] f14673f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ int f14674g;

    public k(int i4) {
        int i8;
        int i9 = 4;
        while (true) {
            i8 = 40;
            if (i9 >= 32) {
                break;
            }
            int i10 = (1 << i9) - 12;
            if (40 <= i10) {
                i8 = i10;
                break;
            }
            i9++;
        }
        int i11 = i8 / 4;
        this.f14672e = new int[i11];
        this.f14673f = new Object[i11];
    }

    public final void a(int i4, Object obj) {
        int i8 = this.f14674g;
        if (i8 != 0 && i4 <= this.f14672e[i8 - 1]) {
            d(i4, obj);
            return;
        }
        if (this.f14671d && i8 >= this.f14672e.length) {
            h.a(this);
        }
        int i9 = this.f14674g;
        if (i9 >= this.f14672e.length) {
            int i10 = (i9 + 1) * 4;
            int i11 = 4;
            while (true) {
                if (i11 >= 32) {
                    break;
                }
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
            int i13 = i10 / 4;
            int[] copyOf = Arrays.copyOf(this.f14672e, i13);
            o6.j.d(copyOf, "copyOf(this, newSize)");
            this.f14672e = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f14673f, i13);
            o6.j.d(copyOf2, "copyOf(this, newSize)");
            this.f14673f = copyOf2;
        }
        this.f14672e[i9] = i4;
        this.f14673f[i9] = obj;
        this.f14674g = i9 + 1;
    }

    public final Object b(int i4) {
        Object obj;
        int a3 = AbstractC1595a.a(this.f14674g, i4, this.f14672e);
        if (a3 >= 0 && (obj = this.f14673f[a3]) != h.f14660b) {
            return obj;
        }
        return null;
    }

    public final int c(int i4) {
        if (this.f14671d) {
            h.a(this);
        }
        return this.f14672e[i4];
    }

    public final Object clone() {
        Object clone = super.clone();
        o6.j.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        k kVar = (k) clone;
        kVar.f14672e = (int[]) this.f14672e.clone();
        kVar.f14673f = (Object[]) this.f14673f.clone();
        return kVar;
    }

    public final void d(int i4, Object obj) {
        int a3 = AbstractC1595a.a(this.f14674g, i4, this.f14672e);
        if (a3 >= 0) {
            this.f14673f[a3] = obj;
            return;
        }
        int i8 = ~a3;
        int i9 = this.f14674g;
        if (i8 < i9) {
            Object[] objArr = this.f14673f;
            if (objArr[i8] == h.f14660b) {
                this.f14672e[i8] = i4;
                objArr[i8] = obj;
                return;
            }
        }
        if (this.f14671d && i9 >= this.f14672e.length) {
            h.a(this);
            i8 = ~AbstractC1595a.a(this.f14674g, i4, this.f14672e);
        }
        int i10 = this.f14674g;
        if (i10 >= this.f14672e.length) {
            int i11 = (i10 + 1) * 4;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 4;
            int[] copyOf = Arrays.copyOf(this.f14672e, i14);
            o6.j.d(copyOf, "copyOf(this, newSize)");
            this.f14672e = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f14673f, i14);
            o6.j.d(copyOf2, "copyOf(this, newSize)");
            this.f14673f = copyOf2;
        }
        int i15 = this.f14674g;
        if (i15 - i8 != 0) {
            int[] iArr = this.f14672e;
            int i16 = i8 + 1;
            AbstractC0434i.P0(i16, i8, i15, iArr, iArr);
            Object[] objArr2 = this.f14673f;
            AbstractC0434i.Q0(objArr2, objArr2, i16, i8, this.f14674g);
        }
        this.f14672e[i8] = i4;
        this.f14673f[i8] = obj;
        this.f14674g++;
    }

    public final int e() {
        if (this.f14671d) {
            h.a(this);
        }
        return this.f14674g;
    }

    public final Object f(int i4) {
        if (this.f14671d) {
            h.a(this);
        }
        return this.f14673f[i4];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f14674g * 28);
        sb.append('{');
        int i4 = this.f14674g;
        for (int i8 = 0; i8 < i4; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(c(i8));
            sb.append('=');
            Object f8 = f(i8);
            if (f8 != this) {
                sb.append(f8);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        o6.j.d(sb2, "buffer.toString()");
        return sb2;
    }
}
