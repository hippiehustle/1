package g7;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y extends AbstractC0796e {
    public static final int[] k;

    /* renamed from: e, reason: collision with root package name */
    public final int f11262e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0796e f11263f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0796e f11264g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11265h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11266i;
    public int j = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i4 = 1;
        int i8 = 1;
        while (i4 > 0) {
            arrayList.add(Integer.valueOf(i4));
            int i9 = i8 + i4;
            i8 = i4;
            i4 = i9;
        }
        arrayList.add(Integer.MAX_VALUE);
        k = new int[arrayList.size()];
        int i10 = 0;
        while (true) {
            int[] iArr = k;
            if (i10 < iArr.length) {
                iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
                i10++;
            } else {
                return;
            }
        }
    }

    public y(AbstractC0796e abstractC0796e, AbstractC0796e abstractC0796e2) {
        this.f11263f = abstractC0796e;
        this.f11264g = abstractC0796e2;
        int size = abstractC0796e.size();
        this.f11265h = size;
        this.f11262e = abstractC0796e2.size() + size;
        this.f11266i = Math.max(abstractC0796e.k(), abstractC0796e2.k()) + 1;
    }

    public final boolean equals(Object obj) {
        boolean u8;
        int q6;
        if (obj != this) {
            if (obj instanceof AbstractC0796e) {
                AbstractC0796e abstractC0796e = (AbstractC0796e) obj;
                int size = abstractC0796e.size();
                int i4 = this.f11262e;
                if (i4 == size) {
                    if (i4 != 0) {
                        if (this.j == 0 || (q6 = abstractC0796e.q()) == 0 || this.j == q6) {
                            w wVar = new w(this);
                            t next = wVar.next();
                            w wVar2 = new w(abstractC0796e);
                            t next2 = wVar2.next();
                            int i8 = 0;
                            int i9 = 0;
                            int i10 = 0;
                            while (true) {
                                int length = next.f11255e.length - i8;
                                int length2 = next2.f11255e.length - i9;
                                int min = Math.min(length, length2);
                                if (i8 == 0) {
                                    u8 = next.u(next2, i9, min);
                                } else {
                                    u8 = next2.u(next, i8, min);
                                }
                                if (!u8) {
                                    break;
                                }
                                i10 += min;
                                if (i10 >= i4) {
                                    if (i10 == i4) {
                                        return true;
                                    }
                                    throw new IllegalStateException();
                                }
                                if (min == length) {
                                    next = wVar.next();
                                    i8 = 0;
                                } else {
                                    i8 += min;
                                }
                                if (min == length2) {
                                    next2 = wVar2.next();
                                    i9 = 0;
                                } else {
                                    i9 += min;
                                }
                            }
                        }
                    } else {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4 = this.j;
        if (i4 == 0) {
            int i8 = this.f11262e;
            i4 = o(i8, 0, i8);
            if (i4 == 0) {
                i4 = 1;
            }
            this.j = i4;
        }
        return i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new x(this);
    }

    @Override // g7.AbstractC0796e
    public final void j(int i4, int i8, int i9, byte[] bArr) {
        int i10 = i4 + i9;
        AbstractC0796e abstractC0796e = this.f11263f;
        int i11 = this.f11265h;
        if (i10 <= i11) {
            abstractC0796e.j(i4, i8, i9, bArr);
            return;
        }
        AbstractC0796e abstractC0796e2 = this.f11264g;
        if (i4 >= i11) {
            abstractC0796e2.j(i4 - i11, i8, i9, bArr);
            return;
        }
        int i12 = i11 - i4;
        abstractC0796e.j(i4, i8, i12, bArr);
        abstractC0796e2.j(0, i8 + i12, i9 - i12, bArr);
    }

    @Override // g7.AbstractC0796e
    public final int k() {
        return this.f11266i;
    }

    @Override // g7.AbstractC0796e
    public final boolean l() {
        if (this.f11262e >= k[this.f11266i]) {
            return true;
        }
        return false;
    }

    @Override // g7.AbstractC0796e
    public final boolean m() {
        int p8 = this.f11263f.p(0, 0, this.f11265h);
        AbstractC0796e abstractC0796e = this.f11264g;
        if (abstractC0796e.p(p8, 0, abstractC0796e.size()) != 0) {
            return false;
        }
        return true;
    }

    @Override // g7.AbstractC0796e
    public final int o(int i4, int i8, int i9) {
        int i10 = i8 + i9;
        AbstractC0796e abstractC0796e = this.f11263f;
        int i11 = this.f11265h;
        if (i10 <= i11) {
            return abstractC0796e.o(i4, i8, i9);
        }
        AbstractC0796e abstractC0796e2 = this.f11264g;
        if (i8 >= i11) {
            return abstractC0796e2.o(i4, i8 - i11, i9);
        }
        int i12 = i11 - i8;
        return abstractC0796e2.o(abstractC0796e.o(i4, i8, i12), 0, i9 - i12);
    }

    @Override // g7.AbstractC0796e
    public final int p(int i4, int i8, int i9) {
        int i10 = i8 + i9;
        AbstractC0796e abstractC0796e = this.f11263f;
        int i11 = this.f11265h;
        if (i10 <= i11) {
            return abstractC0796e.p(i4, i8, i9);
        }
        AbstractC0796e abstractC0796e2 = this.f11264g;
        if (i8 >= i11) {
            return abstractC0796e2.p(i4, i8 - i11, i9);
        }
        int i12 = i11 - i8;
        return abstractC0796e2.p(abstractC0796e.p(i4, i8, i12), 0, i9 - i12);
    }

    @Override // g7.AbstractC0796e
    public final int q() {
        return this.j;
    }

    @Override // g7.AbstractC0796e
    public final String r() {
        byte[] bArr;
        int i4 = this.f11262e;
        if (i4 == 0) {
            bArr = q.f11252a;
        } else {
            byte[] bArr2 = new byte[i4];
            j(0, 0, i4, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // g7.AbstractC0796e
    public final int size() {
        return this.f11262e;
    }

    @Override // g7.AbstractC0796e
    public final void t(OutputStream outputStream, int i4, int i8) {
        int i9 = i4 + i8;
        AbstractC0796e abstractC0796e = this.f11263f;
        int i10 = this.f11265h;
        if (i9 <= i10) {
            abstractC0796e.t(outputStream, i4, i8);
            return;
        }
        AbstractC0796e abstractC0796e2 = this.f11264g;
        if (i4 >= i10) {
            abstractC0796e2.t(outputStream, i4 - i10, i8);
            return;
        }
        int i11 = i10 - i4;
        abstractC0796e.t(outputStream, i4, i11);
        abstractC0796e2.t(outputStream, 0, i8 - i11);
    }
}
