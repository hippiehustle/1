package I7;

import a6.AbstractC0426a;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import h4.AbstractC0832f;
import java.util.Iterator;
import java.util.regex.Matcher;
import t6.C1588c;

/* loaded from: classes.dex */
public final class j extends AbstractC0426a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A4.a f2243d;

    public j(A4.a aVar) {
        this.f2243d = aVar;
    }

    @Override // a6.AbstractC0426a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        boolean z8;
        if (obj == null) {
            z8 = true;
        } else {
            z8 = obj instanceof h;
        }
        if (!z8) {
            return false;
        }
        return super.contains((h) obj);
    }

    @Override // a6.AbstractC0426a
    public final int g() {
        return ((Matcher) this.f2243d.f280e).groupCount() + 1;
    }

    public final h h(int i4) {
        Matcher matcher = (Matcher) this.f2243d.f280e;
        C1588c G8 = AbstractC0832f.G(matcher.start(i4), matcher.end(i4));
        if (G8.f15123d >= 0) {
            String group = matcher.group(i4);
            o6.j.d(group, "group(...)");
            return new h(group, G8);
        }
        return null;
    }

    @Override // a6.AbstractC0426a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new H7.s(H7.m.W(AbstractC0436k.k0(AbstractC0437l.V(this)), new A1.h(8, this)));
    }
}
