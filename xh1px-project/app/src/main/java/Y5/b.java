package Y5;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b implements Map {

    /* renamed from: d, reason: collision with root package name */
    public final Map f7202d;

    public b(Map map) {
        this.f7202d = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof Class) {
            return this.f7202d.containsKey(((Class) obj).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f7202d.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof Class) {
            return this.f7202d.get(((Class) obj).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f7202d.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f7202d.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f7202d.values();
    }
}
