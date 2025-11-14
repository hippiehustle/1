package a8;

import a6.AbstractC0436k;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import p6.InterfaceC1315a;

/* loaded from: classes.dex */
public final class u extends j implements Map<String, j>, InterfaceC1315a {
    public static final t Companion = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Map f8299d;

    public u(Map map) {
        o6.j.e(map, "content");
        this.f8299d = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j compute(String str, BiFunction<? super String, ? super j, ? extends j> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j computeIfAbsent(String str, Function<? super String, ? extends j> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j computeIfPresent(String str, BiFunction<? super String, ? super j, ? extends j> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        o6.j.e(str, "key");
        return this.f8299d.containsKey(str);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        o6.j.e(jVar, "value");
        return this.f8299d.containsValue(jVar);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, j>> entrySet() {
        return this.f8299d.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return o6.j.a(this.f8299d, obj);
    }

    @Override // java.util.Map
    public final j get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        o6.j.e(str, "key");
        return (j) this.f8299d.get(str);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f8299d.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f8299d.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f8299d.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j merge(String str, j jVar, BiFunction<? super j, ? super j, ? extends j> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j put(String str, j jVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends j> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j putIfAbsent(String str, j jVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final j remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ j replace(String str, j jVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super j, ? extends j> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f8299d.size();
    }

    public final String toString() {
        return AbstractC0436k.v0(this.f8299d.entrySet(), ",", "{", "}", new H7.o(19), 24);
    }

    @Override // java.util.Map
    public final Collection<j> values() {
        return this.f8299d.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, j jVar, j jVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
