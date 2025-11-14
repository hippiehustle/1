package L5;

import android.content.res.TypedArray;
import android.util.SparseArray;
import g7.AbstractC0793b;
import g7.AbstractC0796e;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f2966a;

    /* renamed from: b, reason: collision with root package name */
    public int f2967b;

    /* renamed from: c, reason: collision with root package name */
    public final Cloneable f2968c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2969d;

    /* JADX WARN: Multi-variable type inference failed */
    public m(OutputStream outputStream, byte[] bArr) {
        this.f2969d = outputStream;
        this.f2968c = bArr;
        this.f2967b = 0;
        this.f2966a = bArr.length;
    }

    public static int a(int i4, int i8) {
        return c(i8) + h(i4);
    }

    public static int b(int i4, int i8) {
        return c(i8) + h(i4);
    }

    public static int c(int i4) {
        if (i4 >= 0) {
            return f(i4);
        }
        return 10;
    }

    public static int d(int i4, AbstractC0793b abstractC0793b) {
        return e(abstractC0793b) + h(i4);
    }

    public static int e(AbstractC0793b abstractC0793b) {
        int c6 = abstractC0793b.c();
        return f(c6) + c6;
    }

    public static int f(int i4) {
        if ((i4 & (-128)) == 0) {
            return 1;
        }
        if ((i4 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i4) == 0) {
            return 3;
        }
        if ((i4 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int g(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        if ((j & Long.MIN_VALUE) == 0) {
            return 9;
        }
        return 10;
    }

    public static int h(int i4) {
        return f(i4 << 3);
    }

    public static m j(OutputStream outputStream, int i4) {
        return new m(outputStream, new byte[i4]);
    }

    public void i() {
        if (((OutputStream) this.f2969d) != null) {
            k();
        }
    }

    public void k() {
        OutputStream outputStream = (OutputStream) this.f2969d;
        if (outputStream != null) {
            outputStream.write((byte[]) this.f2968c, 0, this.f2967b);
            this.f2967b = 0;
            return;
        }
        throw new IOException() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream$OutOfSpaceException
        };
    }

    public void l(int i4, int i8) {
        x(i4, 0);
        n(i8);
    }

    public void m(int i4, int i8) {
        x(i4, 0);
        n(i8);
    }

    public void n(int i4) {
        if (i4 >= 0) {
            v(i4);
        } else {
            w(i4);
        }
    }

    public void o(int i4, AbstractC0793b abstractC0793b) {
        x(i4, 2);
        p(abstractC0793b);
    }

    public void p(AbstractC0793b abstractC0793b) {
        v(abstractC0793b.c());
        abstractC0793b.f(this);
    }

    public void q(int i4) {
        byte b4 = (byte) i4;
        if (this.f2967b == this.f2966a) {
            k();
        }
        byte[] bArr = (byte[]) this.f2968c;
        int i8 = this.f2967b;
        this.f2967b = i8 + 1;
        bArr[i8] = b4;
    }

    public void r(AbstractC0796e abstractC0796e) {
        int size = abstractC0796e.size();
        byte[] bArr = (byte[]) this.f2968c;
        int i4 = this.f2967b;
        int i8 = this.f2966a;
        int i9 = i8 - i4;
        if (i9 >= size) {
            abstractC0796e.i(0, i4, size, bArr);
            this.f2967b += size;
            return;
        }
        abstractC0796e.i(0, i4, i9, bArr);
        int i10 = size - i9;
        this.f2967b = i8;
        k();
        if (i10 <= i8) {
            abstractC0796e.i(i9, 0, i10, bArr);
            this.f2967b = i10;
            return;
        }
        OutputStream outputStream = (OutputStream) this.f2969d;
        if (i9 >= 0) {
            if (i10 >= 0) {
                int i11 = i9 + i10;
                if (i11 <= abstractC0796e.size()) {
                    if (i10 > 0) {
                        abstractC0796e.t(outputStream, i9, i10);
                        return;
                    }
                    return;
                } else {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Source end offset exceeded: ");
                    sb.append(i11);
                    throw new IndexOutOfBoundsException(sb.toString());
                }
            }
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(30);
        sb3.append("Source offset < 0: ");
        sb3.append(i9);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public void s(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = (byte[]) this.f2968c;
        int i4 = this.f2967b;
        int i8 = this.f2966a;
        int i9 = i8 - i4;
        if (i9 >= length) {
            System.arraycopy(bArr, 0, bArr2, i4, length);
            this.f2967b += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i4, i9);
        int i10 = length - i9;
        this.f2967b = i8;
        k();
        if (i10 <= i8) {
            System.arraycopy(bArr, i9, bArr2, 0, i10);
            this.f2967b = i10;
        } else {
            ((OutputStream) this.f2969d).write(bArr, i9, i10);
        }
    }

    public void t(int i4) {
        q(i4 & 255);
        q((i4 >> 8) & 255);
        q((i4 >> 16) & 255);
        q((i4 >> 24) & 255);
    }

    public void u(long j) {
        q(((int) j) & 255);
        q(((int) (j >> 8)) & 255);
        q(((int) (j >> 16)) & 255);
        q(((int) (j >> 24)) & 255);
        q(((int) (j >> 32)) & 255);
        q(((int) (j >> 40)) & 255);
        q(((int) (j >> 48)) & 255);
        q(((int) (j >> 56)) & 255);
    }

    public void v(int i4) {
        while ((i4 & (-128)) != 0) {
            q((i4 & 127) | 128);
            i4 >>>= 7;
        }
        q(i4);
    }

    public void w(long j) {
        while (((-128) & j) != 0) {
            q((((int) j) & 127) | 128);
            j >>>= 7;
        }
        q((int) j);
    }

    public void x(int i4, int i8) {
        v((i4 << 3) | i8);
    }

    public m(n nVar, R.g gVar) {
        this.f2968c = new SparseArray();
        this.f2969d = nVar;
        TypedArray typedArray = (TypedArray) gVar.f4988f;
        this.f2966a = typedArray.getResourceId(28, 0);
        this.f2967b = typedArray.getResourceId(52, 0);
    }
}
