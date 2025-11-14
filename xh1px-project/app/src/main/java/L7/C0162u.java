package L7;

import d6.AbstractC0615a;

/* renamed from: L7.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162u extends AbstractC0615a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0161t f3246f = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final String f3247e;

    public C0162u() {
        super(f3246f);
        this.f3247e = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0162u) && o6.j.a(this.f3247e, ((C0162u) obj).f3247e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3247e.hashCode();
    }

    public final String toString() {
        return A.j.q(new StringBuilder("CoroutineName("), this.f3247e, ')');
    }
}
