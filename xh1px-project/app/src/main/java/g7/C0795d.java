package g7;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: g7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0795d extends OutputStream {

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f11217i = new byte[0];

    /* renamed from: f, reason: collision with root package name */
    public int f11220f;

    /* renamed from: h, reason: collision with root package name */
    public int f11222h;

    /* renamed from: d, reason: collision with root package name */
    public final int f11218d = 128;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f11219e = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public byte[] f11221g = new byte[128];

    public final void a(int i4) {
        this.f11219e.add(new t(this.f11221g));
        int length = this.f11220f + this.f11221g.length;
        this.f11220f = length;
        this.f11221g = new byte[Math.max(this.f11218d, Math.max(i4, length >>> 1))];
        this.f11222h = 0;
    }

    public final void d() {
        int i4 = this.f11222h;
        byte[] bArr = this.f11221g;
        int length = bArr.length;
        ArrayList arrayList = this.f11219e;
        if (i4 < length) {
            if (i4 > 0) {
                byte[] bArr2 = new byte[i4];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i4));
                arrayList.add(new t(bArr2));
            }
        } else {
            arrayList.add(new t(this.f11221g));
            this.f11221g = f11217i;
        }
        this.f11220f += this.f11222h;
        this.f11222h = 0;
    }

    public final synchronized AbstractC0796e e() {
        AbstractC0796e g8;
        d();
        ArrayList arrayList = this.f11219e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((AbstractC0796e) it.next());
            }
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            g8 = AbstractC0796e.f11223d;
        } else {
            g8 = AbstractC0796e.g(arrayList.iterator(), arrayList.size());
        }
        return g8;
    }

    public final String toString() {
        int i4;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i4 = this.f11220f + this.f11222h;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i4));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i4) {
        try {
            if (this.f11222h == this.f11221g.length) {
                a(1);
            }
            byte[] bArr = this.f11221g;
            int i8 = this.f11222h;
            this.f11222h = i8 + 1;
            bArr[i8] = (byte) i4;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i4, int i8) {
        try {
            byte[] bArr2 = this.f11221g;
            int length = bArr2.length;
            int i9 = this.f11222h;
            if (i8 <= length - i9) {
                System.arraycopy(bArr, i4, bArr2, i9, i8);
                this.f11222h += i8;
            } else {
                int length2 = bArr2.length - i9;
                System.arraycopy(bArr, i4, bArr2, i9, length2);
                int i10 = i8 - length2;
                a(i10);
                System.arraycopy(bArr, i4 + length2, this.f11221g, 0, i10);
                this.f11222h = i10;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
