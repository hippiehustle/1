package g7;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: g7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0796e implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public static final t f11223d = new t(new byte[0]);

    public static AbstractC0796e g(Iterator it, int i4) {
        if (i4 == 1) {
            return (AbstractC0796e) it.next();
        }
        int i8 = i4 >>> 1;
        return g(it, i8).h(g(it, i4 - i8));
    }

    public static C0795d n() {
        return new C0795d();
    }

    public final AbstractC0796e h(AbstractC0796e abstractC0796e) {
        y yVar;
        int size = size();
        int size2 = abstractC0796e.size();
        if (size + size2 < 2147483647L) {
            int[] iArr = y.k;
            if (this instanceof y) {
                yVar = (y) this;
            } else {
                yVar = null;
            }
            if (abstractC0796e.size() == 0) {
                return this;
            }
            if (size() == 0) {
                return abstractC0796e;
            }
            int size3 = abstractC0796e.size() + size();
            if (size3 < 128) {
                int size4 = size();
                int size5 = abstractC0796e.size();
                byte[] bArr = new byte[size4 + size5];
                i(0, 0, size4, bArr);
                abstractC0796e.i(0, size4, size5, bArr);
                return new t(bArr);
            }
            if (yVar != null) {
                AbstractC0796e abstractC0796e2 = yVar.f11264g;
                if (abstractC0796e.size() + abstractC0796e2.size() < 128) {
                    int size6 = abstractC0796e2.size();
                    int size7 = abstractC0796e.size();
                    byte[] bArr2 = new byte[size6 + size7];
                    abstractC0796e2.i(0, 0, size6, bArr2);
                    abstractC0796e.i(0, size6, size7, bArr2);
                    return new y(yVar.f11263f, new t(bArr2));
                }
            }
            if (yVar != null) {
                AbstractC0796e abstractC0796e3 = yVar.f11264g;
                AbstractC0796e abstractC0796e4 = yVar.f11263f;
                if (abstractC0796e4.k() > abstractC0796e3.k() && yVar.f11266i > abstractC0796e.k()) {
                    return new y(abstractC0796e4, new y(abstractC0796e3, abstractC0796e));
                }
            }
            if (size3 >= y.k[Math.max(k(), abstractC0796e.k()) + 1]) {
                return new y(this, abstractC0796e);
            }
            g0.L l6 = new g0.L();
            l6.T(this);
            l6.T(abstractC0796e);
            Stack stack = (Stack) l6.f10871e;
            AbstractC0796e abstractC0796e5 = (AbstractC0796e) stack.pop();
            while (!stack.isEmpty()) {
                abstractC0796e5 = new y((AbstractC0796e) stack.pop(), abstractC0796e5);
            }
            return abstractC0796e5;
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void i(int i4, int i8, int i9, byte[] bArr) {
        if (i4 >= 0) {
            if (i8 >= 0) {
                if (i9 >= 0) {
                    int i10 = i4 + i9;
                    if (i10 <= size()) {
                        int i11 = i8 + i9;
                        if (i11 <= bArr.length) {
                            if (i9 > 0) {
                                j(i4, i8, i9, bArr);
                                return;
                            }
                            return;
                        } else {
                            StringBuilder sb = new StringBuilder(34);
                            sb.append("Target end offset < 0: ");
                            sb.append(i11);
                            throw new IndexOutOfBoundsException(sb.toString());
                        }
                    }
                    StringBuilder sb2 = new StringBuilder(34);
                    sb2.append("Source end offset < 0: ");
                    sb2.append(i10);
                    throw new IndexOutOfBoundsException(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder(23);
                sb3.append("Length < 0: ");
                sb3.append(i9);
                throw new IndexOutOfBoundsException(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder(30);
            sb4.append("Target offset < 0: ");
            sb4.append(i8);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        StringBuilder sb5 = new StringBuilder(30);
        sb5.append("Source offset < 0: ");
        sb5.append(i4);
        throw new IndexOutOfBoundsException(sb5.toString());
    }

    public abstract void j(int i4, int i8, int i9, byte[] bArr);

    public abstract int k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract int o(int i4, int i8, int i9);

    public abstract int p(int i4, int i8, int i9);

    public abstract int q();

    public abstract String r();

    public final String s() {
        try {
            return r();
        } catch (UnsupportedEncodingException e9) {
            throw new RuntimeException("UTF-8 not supported?", e9);
        }
    }

    public abstract int size();

    public abstract void t(OutputStream outputStream, int i4, int i8);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
