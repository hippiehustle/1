package q;

import java.util.Iterator;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1342d extends AbstractC1343e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public C1341c f13863d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13864e = true;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1344f f13865f;

    public C1342d(C1344f c1344f) {
        this.f13865f = c1344f;
    }

    @Override // q.AbstractC1343e
    public final void a(C1341c c1341c) {
        boolean z8;
        C1341c c1341c2 = this.f13863d;
        if (c1341c == c1341c2) {
            C1341c c1341c3 = c1341c2.f13862g;
            this.f13863d = c1341c3;
            if (c1341c3 == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f13864e = z8;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f13864e) {
            if (this.f13865f.f13866d == null) {
                return false;
            }
            return true;
        }
        C1341c c1341c = this.f13863d;
        if (c1341c == null || c1341c.f13861f == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1341c c1341c;
        if (this.f13864e) {
            this.f13864e = false;
            this.f13863d = this.f13865f.f13866d;
        } else {
            C1341c c1341c2 = this.f13863d;
            if (c1341c2 != null) {
                c1341c = c1341c2.f13861f;
            } else {
                c1341c = null;
            }
            this.f13863d = c1341c;
        }
        return this.f13863d;
    }
}
