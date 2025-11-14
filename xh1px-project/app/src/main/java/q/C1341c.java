package q;

import java.util.Map;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1341c implements Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final Object f13859d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f13860e;

    /* renamed from: f, reason: collision with root package name */
    public C1341c f13861f;

    /* renamed from: g, reason: collision with root package name */
    public C1341c f13862g;

    public C1341c(Object obj, Object obj2) {
        this.f13859d = obj;
        this.f13860e = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1341c)) {
            return false;
        }
        C1341c c1341c = (C1341c) obj;
        if (this.f13859d.equals(c1341c.f13859d) && this.f13860e.equals(c1341c.f13860e)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f13859d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f13860e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f13859d.hashCode() ^ this.f13860e.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f13859d + "=" + this.f13860e;
    }
}
