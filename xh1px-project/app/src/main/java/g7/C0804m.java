package g7;

/* renamed from: g7.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0804m implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f11244d;

    /* renamed from: e, reason: collision with root package name */
    public final L f11245e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11246f;

    public C0804m(int i4, L l6, boolean z8) {
        this.f11244d = i4;
        this.f11245e = l6;
        this.f11246f = z8;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f11244d - ((C0804m) obj).f11244d;
    }
}
