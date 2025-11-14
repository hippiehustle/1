package F4;

/* loaded from: classes.dex */
public final class a extends E2.d {

    /* renamed from: e, reason: collision with root package name */
    public final J2.a f1378e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(J2.a aVar) {
        super(6);
        o6.j.e(aVar, "type");
        this.f1378e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f1378e == ((a) obj).f1378e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1378e.hashCode();
    }

    @Override // E2.d
    public final String toString() {
        return "MonitoredViewClicked(type=" + this.f1378e + ")";
    }
}
