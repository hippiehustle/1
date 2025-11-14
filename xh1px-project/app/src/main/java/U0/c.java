package U0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f5943a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f5944b;

    public c(float[] fArr, int[] iArr) {
        this.f5943a = fArr;
        this.f5944b = iArr;
    }

    public final void a(c cVar) {
        int i4 = 0;
        while (true) {
            int[] iArr = cVar.f5944b;
            if (i4 < iArr.length) {
                this.f5943a[i4] = cVar.f5943a[i4];
                this.f5944b[i4] = iArr[i4];
                i4++;
            } else {
                return;
            }
        }
    }

    public final c b(float[] fArr) {
        int m6;
        int[] iArr = new int[fArr.length];
        for (int i4 = 0; i4 < fArr.length; i4++) {
            float f8 = fArr[i4];
            float[] fArr2 = this.f5943a;
            int binarySearch = Arrays.binarySearch(fArr2, f8);
            int[] iArr2 = this.f5944b;
            if (binarySearch >= 0) {
                m6 = iArr2[binarySearch];
            } else {
                int i8 = -(binarySearch + 1);
                if (i8 == 0) {
                    m6 = iArr2[0];
                } else if (i8 == iArr2.length - 1) {
                    m6 = iArr2[iArr2.length - 1];
                } else {
                    int i9 = i8 - 1;
                    float f9 = fArr2[i9];
                    m6 = E2.d.m((f8 - f9) / (fArr2[i8] - f9), iArr2[i9], iArr2[i8]);
                }
            }
            iArr[i4] = m6;
        }
        return new c(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (Arrays.equals(this.f5943a, cVar.f5943a) && Arrays.equals(this.f5944b, cVar.f5944b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5944b) + (Arrays.hashCode(this.f5943a) * 31);
    }
}
