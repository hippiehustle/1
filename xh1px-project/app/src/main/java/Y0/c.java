package Y0;

import R3.r;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class c implements Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f7077h = new String[128];

    /* renamed from: d, reason: collision with root package name */
    public int f7078d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f7079e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f7080f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f7081g;

    static {
        for (int i4 = 0; i4 <= 31; i4++) {
            f7077h[i4] = String.format("\\u%04x", Integer.valueOf(i4));
        }
        String[] strArr = f7077h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract String B();

    public abstract int D();

    public final void I(int i4) {
        int i8 = this.f7078d;
        int[] iArr = this.f7079e;
        if (i8 == iArr.length) {
            if (i8 != 256) {
                this.f7079e = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f7080f;
                this.f7080f = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f7081g;
                this.f7081g = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new RuntimeException("Nesting too deep at " + n());
            }
        }
        int[] iArr3 = this.f7079e;
        int i9 = this.f7078d;
        this.f7078d = i9 + 1;
        iArr3[i9] = i4;
    }

    public abstract int M(r rVar);

    public abstract void N();

    public abstract void O();

    public final void P(String str) {
        throw new IOException(str + " at path " + n());
    }

    public abstract void a();

    public abstract void d();

    public abstract void e();

    public abstract void j();

    public final String n() {
        int i4 = this.f7078d;
        int[] iArr = this.f7079e;
        String[] strArr = this.f7080f;
        int[] iArr2 = this.f7081g;
        StringBuilder sb = new StringBuilder("$");
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = iArr[i8];
            if (i9 != 1 && i9 != 2) {
                if (i9 == 3 || i9 == 4 || i9 == 5) {
                    sb.append('.');
                    String str = strArr[i8];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            } else {
                sb.append('[');
                sb.append(iArr2[i8]);
                sb.append(']');
            }
        }
        return sb.toString();
    }

    public abstract boolean p();

    public abstract boolean v();

    public abstract double y();

    public abstract int z();
}
