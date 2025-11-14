package g7;

import androidx.datastore.preferences.protobuf.C0468d;
import java.io.OutputStream;
import java.util.Iterator;

/* loaded from: classes.dex */
public class t extends AbstractC0796e {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f11255e;

    /* renamed from: f, reason: collision with root package name */
    public int f11256f = 0;

    public t(byte[] bArr) {
        this.f11255e = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0796e) || size() != ((AbstractC0796e) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof t) {
            return u((t) obj, 0, size());
        }
        if (obj instanceof y) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(A.j.r(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
    }

    public final int hashCode() {
        int i4 = this.f11256f;
        if (i4 == 0) {
            int size = size();
            i4 = o(size, 0, size);
            if (i4 == 0) {
                i4 = 1;
            }
            this.f11256f = i4;
        }
        return i4;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C0468d(this);
    }

    @Override // g7.AbstractC0796e
    public void j(int i4, int i8, int i9, byte[] bArr) {
        System.arraycopy(this.f11255e, i4, bArr, i8, i9);
    }

    @Override // g7.AbstractC0796e
    public final int k() {
        return 0;
    }

    @Override // g7.AbstractC0796e
    public final boolean l() {
        return true;
    }

    @Override // g7.AbstractC0796e
    public final boolean m() {
        byte[] bArr = this.f11255e;
        if (C.c(bArr, 0, bArr.length) != 0) {
            return false;
        }
        return true;
    }

    @Override // g7.AbstractC0796e
    public final int o(int i4, int i8, int i9) {
        for (int i10 = i8; i10 < i8 + i9; i10++) {
            i4 = (i4 * 31) + this.f11255e[i10];
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
    
        if (r0[r8] > (-65)) goto L59;
     */
    @Override // g7.AbstractC0796e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int p(int i4, int i8, int i9) {
        byte b4;
        int i10;
        int i11;
        int i12 = i9 + i8;
        byte[] bArr = this.f11255e;
        if (i4 != 0) {
            if (i8 >= i12) {
                return i4;
            }
            byte b9 = (byte) i4;
            if (b9 < -32) {
                if (b9 >= -62) {
                    i11 = i8 + 1;
                }
                return -1;
            }
            if (b9 < -16) {
                byte b10 = (byte) (~(i4 >> 8));
                if (b10 == 0) {
                    int i13 = i8 + 1;
                    byte b11 = bArr[i8];
                    if (i13 >= i12) {
                        return C.a(b9, b11);
                    }
                    i8 = i13;
                    b10 = b11;
                }
                if (b10 <= -65 && ((b9 != -32 || b10 >= -96) && (b9 != -19 || b10 < -96))) {
                    i11 = i8 + 1;
                }
            } else {
                byte b12 = (byte) (~(i4 >> 8));
                if (b12 == 0) {
                    i10 = i8 + 1;
                    b12 = bArr[i8];
                    if (i10 >= i12) {
                        return C.a(b9, b12);
                    }
                    b4 = 0;
                } else {
                    b4 = (byte) (i4 >> 16);
                    i10 = i8;
                }
                if (b4 == 0) {
                    int i14 = i10 + 1;
                    byte b13 = bArr[i10];
                    if (i14 >= i12) {
                        if (b9 > -12 || b12 > -65 || b13 > -65) {
                            return -1;
                        }
                        return (b13 << 16) ^ ((b12 << 8) ^ b9);
                    }
                    b4 = b13;
                    i10 = i14;
                }
                if (b12 <= -65) {
                    if ((((b12 + 112) + (b9 << 28)) >> 30) == 0 && b4 <= -65) {
                        i8 = i10 + 1;
                    }
                }
            }
            return -1;
        }
        return C.c(bArr, i8, i12);
    }

    @Override // g7.AbstractC0796e
    public final int q() {
        return this.f11256f;
    }

    @Override // g7.AbstractC0796e
    public final String r() {
        byte[] bArr = this.f11255e;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // g7.AbstractC0796e
    public int size() {
        return this.f11255e.length;
    }

    @Override // g7.AbstractC0796e
    public final void t(OutputStream outputStream, int i4, int i8) {
        outputStream.write(this.f11255e, i4, i8);
    }

    public final boolean u(t tVar, int i4, int i8) {
        byte[] bArr = tVar.f11255e;
        int length = bArr.length;
        byte[] bArr2 = this.f11255e;
        if (i8 <= length) {
            if (i4 + i8 <= bArr.length) {
                int i9 = 0;
                while (i9 < i8) {
                    if (bArr2[i9] != bArr[i4]) {
                        return false;
                    }
                    i9++;
                    i4++;
                }
                return true;
            }
            int length2 = tVar.f11255e.length;
            StringBuilder sb = new StringBuilder(59);
            sb.append("Ran off end of other: ");
            sb.append(i4);
            sb.append(", ");
            sb.append(i8);
            sb.append(", ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int length3 = bArr2.length;
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Length too large: ");
        sb2.append(i8);
        sb2.append(length3);
        throw new IllegalArgumentException(sb2.toString());
    }
}
