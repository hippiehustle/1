package M4;

import a.AbstractC0405a;
import o6.j;

/* loaded from: classes.dex */
public final class a extends AbstractC0405a {

    /* renamed from: f, reason: collision with root package name */
    public final J2.a f3482f;

    public a(J2.a aVar) {
        j.e(aVar, "type");
        this.f3482f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f3482f == ((a) obj).f3482f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3482f.hashCode();
    }

    public final String toString() {
        return "MonitoredViewClick(type=" + this.f3482f + ")";
    }
}
