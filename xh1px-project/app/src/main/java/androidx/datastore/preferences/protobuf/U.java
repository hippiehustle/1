package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class U extends AbstractMap {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f8640i = 0;

    /* renamed from: d, reason: collision with root package name */
    public List f8641d;

    /* renamed from: e, reason: collision with root package name */
    public Map f8642e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8643f;

    /* renamed from: g, reason: collision with root package name */
    public volatile X f8644g;

    /* renamed from: h, reason: collision with root package name */
    public Map f8645h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, androidx.datastore.preferences.protobuf.U] */
    public static U f() {
        ?? abstractMap = new AbstractMap();
        abstractMap.f8641d = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        abstractMap.f8642e = map;
        abstractMap.f8645h = map;
        return abstractMap;
    }

    public final int a(Comparable comparable) {
        int i4;
        int size = this.f8641d.size();
        int i8 = size - 1;
        if (i8 >= 0) {
            int compareTo = comparable.compareTo(((V) this.f8641d.get(i8)).f8646d);
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
            int compareTo2 = comparable.compareTo(((V) this.f8641d.get(i10)).f8646d);
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
        if (!this.f8643f) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i4) {
        return (Map.Entry) this.f8641d.get(i4);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f8641d.isEmpty()) {
            this.f8641d.clear();
        }
        if (!this.f8642e.isEmpty()) {
            this.f8642e.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.f8642e.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Set d() {
        if (this.f8642e.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return this.f8642e.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f8642e.isEmpty() && !(this.f8642e instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f8642e = treeMap;
            this.f8645h = treeMap.descendingMap();
        }
        return (SortedMap) this.f8642e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f8644g == null) {
            this.f8644g = new X(this, 0);
        }
        return this.f8644g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof U)) {
                return super.equals(obj);
            }
            U u8 = (U) obj;
            int size = size();
            if (size == u8.size()) {
                int size2 = this.f8641d.size();
                if (size2 != u8.f8641d.size()) {
                    return ((AbstractSet) entrySet()).equals(u8.entrySet());
                }
                for (int i4 = 0; i4 < size2; i4++) {
                    if (c(i4).equals(u8.c(i4))) {
                    }
                }
                if (size2 != size) {
                    return this.f8642e.equals(u8.f8642e);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a3 = a(comparable);
        if (a3 >= 0) {
            return ((V) this.f8641d.get(a3)).setValue(obj);
        }
        b();
        if (this.f8641d.isEmpty() && !(this.f8641d instanceof ArrayList)) {
            this.f8641d = new ArrayList(16);
        }
        int i4 = -(a3 + 1);
        if (i4 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f8641d.size() == 16) {
            V v8 = (V) this.f8641d.remove(15);
            e().put(v8.f8646d, v8.f8647e);
        }
        this.f8641d.add(i4, new V(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a3 = a(comparable);
        if (a3 >= 0) {
            return ((V) this.f8641d.get(a3)).f8647e;
        }
        return this.f8642e.get(comparable);
    }

    public final Object h(int i4) {
        b();
        Object obj = ((V) this.f8641d.remove(i4)).f8647e;
        if (!this.f8642e.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f8641d;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new V(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f8641d.size();
        int i4 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i4 += ((V) this.f8641d.get(i8)).hashCode();
        }
        if (this.f8642e.size() > 0) {
            return this.f8642e.hashCode() + i4;
        }
        return i4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a3 = a(comparable);
        if (a3 >= 0) {
            return h(a3);
        }
        if (this.f8642e.isEmpty()) {
            return null;
        }
        return this.f8642e.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f8642e.size() + this.f8641d.size();
    }
}
