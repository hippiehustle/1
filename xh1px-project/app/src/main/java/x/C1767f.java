package x;

/* renamed from: x.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1767f implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public C1770i f16053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1768g f16054e;

    public C1767f(C1768g c1768g) {
        this.f16054e = c1768g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f16053d.f16061b - ((C1770i) obj).f16061b;
    }

    public final String toString() {
        String str = "[ ";
        if (this.f16053d != null) {
            for (int i4 = 0; i4 < 9; i4++) {
                StringBuilder a3 = AbstractC1769h.a(str);
                a3.append(this.f16053d.f16067h[i4]);
                a3.append(" ");
                str = a3.toString();
            }
        }
        return str + "] " + this.f16053d;
    }
}
