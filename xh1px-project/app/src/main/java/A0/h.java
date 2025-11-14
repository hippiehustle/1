package A0;

/* loaded from: classes.dex */
public final class h implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f209d;

    /* renamed from: e, reason: collision with root package name */
    public final int f210e;

    /* renamed from: f, reason: collision with root package name */
    public final String f211f;

    /* renamed from: g, reason: collision with root package name */
    public final String f212g;

    public h(int i4, int i8, String str, String str2) {
        o6.j.e(str, "from");
        o6.j.e(str2, "to");
        this.f209d = i4;
        this.f210e = i8;
        this.f211f = str;
        this.f212g = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        o6.j.e(hVar, "other");
        int i4 = this.f209d - hVar.f209d;
        if (i4 == 0) {
            return this.f210e - hVar.f210e;
        }
        return i4;
    }
}
