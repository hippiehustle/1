package o;

/* loaded from: classes.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    public int f13114a;

    /* renamed from: b, reason: collision with root package name */
    public int f13115b;

    /* renamed from: c, reason: collision with root package name */
    public int f13116c;

    /* renamed from: d, reason: collision with root package name */
    public int f13117d;

    /* renamed from: e, reason: collision with root package name */
    public int f13118e;

    /* renamed from: f, reason: collision with root package name */
    public int f13119f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13120g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13121h;

    public final void a(int i4, int i8) {
        this.f13116c = i4;
        this.f13117d = i8;
        this.f13121h = true;
        if (this.f13120g) {
            if (i8 != Integer.MIN_VALUE) {
                this.f13114a = i8;
            }
            if (i4 != Integer.MIN_VALUE) {
                this.f13115b = i4;
                return;
            }
            return;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f13114a = i4;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f13115b = i8;
        }
    }
}
