package g7;

import androidx.datastore.preferences.protobuf.X;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class z extends AbstractMap {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f11267i = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f11268d;

    /* renamed from: e, reason: collision with root package name */
    public List f11269e = Collections.EMPTY_LIST;

    /* renamed from: f, reason: collision with root package name */
    public Map f11270f = Collections.EMPTY_MAP;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11271g;

    /* renamed from: h, reason: collision with root package name */
    public volatile X f11272h;

    public z(int i4) {
        this.f11268d = i4;
    }

    public final int a(Comparable comparable) {
        int i4;
        int size = this.f11269e.size();
        int i8 = size - 1;
        if (i8 >= 0) {
            int compareTo = comparable.compareTo(((D) this.f11269e.get(i8)).f11195d);
            if (compareTo > 0) {
                i4 = size + 1;
                return -i4;
            }
            if (compareTo == 0) {
                return i8;
            }
        }
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) / 2;
            int compareTo2 = comparable.compareTo(((D) this.f11269e.get(i10)).f11195d);
            if (compareTo2 < 0) {
                i8 = i10 - 1;
            } else if (compareTo2 > 0) {
                i9 = i10 + 1;
            } else {
                return i10;
            }
        }
        i4 = i9 + 1;
        return -i4;
    }

    public final void b() {
        if (!this.f11271g) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final Iterable c() {
        if (this.f11270f.isEmpty()) {
            return C.f11194b;
        }
        return this.f11270f.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f11269e.isEmpty()) {
            this.f11269e.clear();
        }
        if (!this.f11270f.isEmpty()) {
            this.f11270f.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.f11270f.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final SortedMap d() {
        b();
        if (this.f11270f.isEmpty() && !(this.f11270f instanceof TreeMap)) {
            this.f11270f = new TreeMap();
        }
        return (SortedMap) this.f11270f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a3 = a(comparable);
        if (a3 >= 0) {
            return ((D) this.f11269e.get(a3)).setValue(obj);
        }
        b();
        boolean isEmpty = this.f11269e.isEmpty();
        int i4 = this.f11268d;
        if (isEmpty && !(this.f11269e instanceof ArrayList)) {
            this.f11269e = new ArrayList(i4);
        }
        int i8 = -(a3 + 1);
        if (i8 >= i4) {
            return d().put(comparable, obj);
        }
        if (this.f11269e.size() == i4) {
            D d2 = (D) this.f11269e.remove(i4 - 1);
            d().put(d2.f11195d, d2.f11196e);
        }
        this.f11269e.add(i8, new D(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f11272h == null) {
            this.f11272h = new X(this, 1);
        }
        return this.f11272h;
    }

    public final Object f(int i4) {
        b();
        Object obj = ((D) this.f11269e.remove(i4)).f11196e;
        if (!this.f11270f.isEmpty()) {
            Iterator it = d().entrySet().iterator();
            List list = this.f11269e;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new D(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a3 = a(comparable);
        if (a3 >= 0) {
            return ((D) this.f11269e.get(a3)).f11196e;
        }
        return this.f11270f.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a3 = a(comparable);
        if (a3 >= 0) {
            return f(a3);
        }
        if (this.f11270f.isEmpty()) {
            return null;
        }
        return this.f11270f.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f11270f.size() + this.f11269e.size();
    }
}
