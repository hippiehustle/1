package q;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1344f implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public C1341c f13866d;

    /* renamed from: e, reason: collision with root package name */
    public C1341c f13867e;

    /* renamed from: f, reason: collision with root package name */
    public final WeakHashMap f13868f = new WeakHashMap();

    /* renamed from: g, reason: collision with root package name */
    public int f13869g = 0;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((q.C1340b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1344f)) {
            return false;
        }
        C1344f c1344f = (C1344f) obj;
        if (this.f13869g != c1344f.f13869g) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c1344f.iterator();
        while (true) {
            C1340b c1340b = (C1340b) it;
            if (!c1340b.hasNext()) {
                break;
            }
            C1340b c1340b2 = (C1340b) it2;
            if (!c1340b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c1340b.next();
            Object next = c1340b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public C1341c g(Object obj) {
        C1341c c1341c = this.f13866d;
        while (c1341c != null && !c1341c.f13859d.equals(obj)) {
            c1341c = c1341c.f13861f;
        }
        return c1341c;
    }

    public Object h(Object obj) {
        C1341c g8 = g(obj);
        if (g8 == null) {
            return null;
        }
        this.f13869g--;
        WeakHashMap weakHashMap = this.f13868f;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC1343e) it.next()).a(g8);
            }
        }
        C1341c c1341c = g8.f13862g;
        if (c1341c != null) {
            c1341c.f13861f = g8.f13861f;
        } else {
            this.f13866d = g8.f13861f;
        }
        C1341c c1341c2 = g8.f13861f;
        if (c1341c2 != null) {
            c1341c2.f13862g = c1341c;
        } else {
            this.f13867e = c1341c;
        }
        g8.f13861f = null;
        g8.f13862g = null;
        return g8.f13860e;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i4 = 0;
        while (true) {
            C1340b c1340b = (C1340b) it;
            if (c1340b.hasNext()) {
                i4 += ((Map.Entry) c1340b.next()).hashCode();
            } else {
                return i4;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1340b c1340b = new C1340b(this.f13866d, this.f13867e, 0);
        this.f13868f.put(c1340b, Boolean.FALSE);
        return c1340b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C1340b c1340b = (C1340b) it;
            if (c1340b.hasNext()) {
                sb.append(((Map.Entry) c1340b.next()).toString());
                if (c1340b.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
