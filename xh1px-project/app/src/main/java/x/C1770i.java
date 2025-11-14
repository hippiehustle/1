package x;

import java.util.Arrays;

/* renamed from: x.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1770i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16060a;

    /* renamed from: e, reason: collision with root package name */
    public float f16064e;

    /* renamed from: l, reason: collision with root package name */
    public int f16069l;

    /* renamed from: b, reason: collision with root package name */
    public int f16061b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f16062c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f16063d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16065f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f16066g = new float[9];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f16067h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    public C1764c[] f16068i = new C1764c[16];
    public int j = 0;
    public int k = 0;

    public C1770i(int i4) {
        this.f16069l = i4;
    }

    public final void a(C1764c c1764c) {
        int i4 = 0;
        while (true) {
            int i8 = this.j;
            if (i4 < i8) {
                if (this.f16068i[i4] == c1764c) {
                    return;
                } else {
                    i4++;
                }
            } else {
                C1764c[] c1764cArr = this.f16068i;
                if (i8 >= c1764cArr.length) {
                    this.f16068i = (C1764c[]) Arrays.copyOf(c1764cArr, c1764cArr.length * 2);
                }
                C1764c[] c1764cArr2 = this.f16068i;
                int i9 = this.j;
                c1764cArr2[i9] = c1764c;
                this.j = i9 + 1;
                return;
            }
        }
    }

    public final void b(C1764c c1764c) {
        int i4 = this.j;
        int i8 = 0;
        while (i8 < i4) {
            if (this.f16068i[i8] == c1764c) {
                while (i8 < i4 - 1) {
                    C1764c[] c1764cArr = this.f16068i;
                    int i9 = i8 + 1;
                    c1764cArr[i8] = c1764cArr[i9];
                    i8 = i9;
                }
                this.j--;
                return;
            }
            i8++;
        }
    }

    public final void c() {
        this.f16069l = 5;
        this.f16063d = 0;
        this.f16061b = -1;
        this.f16062c = -1;
        this.f16064e = 0.0f;
        this.f16065f = false;
        int i4 = this.j;
        for (int i8 = 0; i8 < i4; i8++) {
            this.f16068i[i8] = null;
        }
        this.j = 0;
        this.k = 0;
        this.f16060a = false;
        Arrays.fill(this.f16067h, 0.0f);
    }

    public final void d(C1764c c1764c) {
        int i4 = this.j;
        for (int i8 = 0; i8 < i4; i8++) {
            this.f16068i[i8].h(c1764c, false);
        }
        this.j = 0;
    }

    public final String toString() {
        return "" + this.f16061b;
    }
}
