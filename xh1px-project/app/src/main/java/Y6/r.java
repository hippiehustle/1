package Y6;

/* loaded from: classes.dex */
public final class r {
    public static final r k = new r(false, false, false, false, false, new r(false, false, false, false, false, null, false, null, null, 1023), false, null, null, 988);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7239a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7240b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7241c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7242d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7243e;

    /* renamed from: f, reason: collision with root package name */
    public final r f7244f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7245g;

    /* renamed from: h, reason: collision with root package name */
    public final r f7246h;

    /* renamed from: i, reason: collision with root package name */
    public final r f7247i;
    public final boolean j;

    public r(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, r rVar, boolean z13, r rVar2, r rVar3, int i4) {
        z8 = (i4 & 1) != 0 ? true : z8;
        z9 = (i4 & 2) != 0 ? true : z9;
        z10 = (i4 & 4) != 0 ? false : z10;
        z11 = (i4 & 8) != 0 ? false : z11;
        z12 = (i4 & 16) != 0 ? false : z12;
        rVar = (i4 & 32) != 0 ? null : rVar;
        z13 = (i4 & 64) != 0 ? true : z13;
        rVar2 = (i4 & 128) != 0 ? rVar : rVar2;
        rVar3 = (i4 & 256) != 0 ? rVar : rVar3;
        boolean z14 = (i4 & 512) == 0;
        this.f7239a = z8;
        this.f7240b = z9;
        this.f7241c = z10;
        this.f7242d = z11;
        this.f7243e = z12;
        this.f7244f = rVar;
        this.f7245g = z13;
        this.f7246h = rVar2;
        this.f7247i = rVar3;
        this.j = z14;
    }
}
