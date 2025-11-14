package I7;

import a6.AbstractC0429d;
import a6.AbstractC0436k;
import a6.y;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class i extends AbstractC0429d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2241d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2242e;

    public /* synthetic */ i(int i4, Object obj) {
        this.f2241d = i4;
        this.f2242e = obj;
    }

    @Override // a6.AbstractC0426a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f2241d) {
            case 0:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.contains((String) obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // a6.AbstractC0426a
    public final int g() {
        switch (this.f2241d) {
            case 0:
                return ((Matcher) ((A4.a) this.f2242e).f280e).groupCount() + 1;
            default:
                return ((List) this.f2242e).size();
        }
    }

    @Override // java.util.List
    public final Object get(int i4) {
        switch (this.f2241d) {
            case 0:
                String group = ((Matcher) ((A4.a) this.f2242e).f280e).group(i4);
                if (group == null) {
                    return "";
                }
                return group;
            default:
                return ((List) this.f2242e).get(AbstractC0436k.i0(i4, this));
        }
    }

    @Override // a6.AbstractC0429d, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f2241d) {
            case 0:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.indexOf((String) obj);
            default:
                return super.indexOf(obj);
        }
    }

    @Override // a6.AbstractC0429d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f2241d) {
            case 1:
                return new y(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // a6.AbstractC0429d, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f2241d) {
            case 0:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.lastIndexOf((String) obj);
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // a6.AbstractC0429d, java.util.List
    public ListIterator listIterator() {
        switch (this.f2241d) {
            case 1:
                return new y(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // a6.AbstractC0429d, java.util.List
    public ListIterator listIterator(int i4) {
        switch (this.f2241d) {
            case 1:
                return new y(this, i4);
            default:
                return super.listIterator(i4);
        }
    }
}
