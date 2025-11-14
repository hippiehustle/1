package t0;

/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    public int f14691a;

    /* renamed from: b, reason: collision with root package name */
    public int f14692b;

    /* renamed from: c, reason: collision with root package name */
    public int f14693c;

    /* renamed from: d, reason: collision with root package name */
    public int f14694d;

    /* renamed from: e, reason: collision with root package name */
    public int f14695e;

    public final boolean a() {
        int i4;
        int i8;
        int i9;
        int i10 = this.f14691a;
        int i11 = 2;
        if ((i10 & 7) != 0) {
            int i12 = this.f14694d;
            int i13 = this.f14692b;
            if (i12 > i13) {
                i9 = 1;
            } else if (i12 == i13) {
                i9 = 2;
            } else {
                i9 = 4;
            }
            if ((i9 & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 112) != 0) {
            int i14 = this.f14694d;
            int i15 = this.f14693c;
            if (i14 > i15) {
                i8 = 1;
            } else if (i14 == i15) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            if (((i8 << 4) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 1792) != 0) {
            int i16 = this.f14695e;
            int i17 = this.f14692b;
            if (i16 > i17) {
                i4 = 1;
            } else if (i16 == i17) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            if (((i4 << 8) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 28672) != 0) {
            int i18 = this.f14695e;
            int i19 = this.f14693c;
            if (i18 > i19) {
                i11 = 1;
            } else if (i18 != i19) {
                i11 = 4;
            }
            if ((i10 & (i11 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
