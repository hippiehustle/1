package q;

import java.util.Iterator;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1340b extends AbstractC1343e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public C1341c f13856d;

    /* renamed from: e, reason: collision with root package name */
    public C1341c f13857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13858f;

    public C1340b(C1341c c1341c, C1341c c1341c2, int i4) {
        this.f13858f = i4;
        this.f13856d = c1341c2;
        this.f13857e = c1341c;
    }

    @Override // q.AbstractC1343e
    public final void a(C1341c c1341c) {
        C1341c c1341c2;
        C1341c c1341c3 = null;
        if (this.f13856d == c1341c && c1341c == this.f13857e) {
            this.f13857e = null;
            this.f13856d = null;
        }
        C1341c c1341c4 = this.f13856d;
        if (c1341c4 == c1341c) {
            switch (this.f13858f) {
                case 0:
                    c1341c2 = c1341c4.f13862g;
                    break;
                default:
                    c1341c2 = c1341c4.f13861f;
                    break;
            }
            this.f13856d = c1341c2;
        }
        C1341c c1341c5 = this.f13857e;
        if (c1341c5 == c1341c) {
            C1341c c1341c6 = this.f13856d;
            if (c1341c5 != c1341c6 && c1341c6 != null) {
                c1341c3 = b(c1341c5);
            }
            this.f13857e = c1341c3;
        }
    }

    public final C1341c b(C1341c c1341c) {
        switch (this.f13858f) {
            case 0:
                return c1341c.f13861f;
            default:
                return c1341c.f13862g;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f13857e != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1341c c1341c;
        C1341c c1341c2 = this.f13857e;
        C1341c c1341c3 = this.f13856d;
        if (c1341c2 != c1341c3 && c1341c3 != null) {
            c1341c = b(c1341c2);
        } else {
            c1341c = null;
        }
        this.f13857e = c1341c;
        return c1341c2;
    }
}
