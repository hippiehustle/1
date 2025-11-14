package a0;

import Z5.j;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import a6.x;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0407b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f7661a;

    /* renamed from: b, reason: collision with root package name */
    public final W5.a f7662b;

    public C0407b(LinkedHashMap linkedHashMap, boolean z8) {
        this.f7661a = linkedHashMap;
        this.f7662b = new W5.a(z8);
    }

    public final Map a() {
        j jVar;
        Set<Map.Entry> entrySet = this.f7661a.entrySet();
        int N02 = x.N0(AbstractC0438m.d0(entrySet, 10));
        if (N02 < 16) {
            N02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(N02);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                o6.j.d(copyOf, "copyOf(this, size)");
                jVar = new j(key, copyOf);
            } else {
                jVar = new j(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(jVar.f7485d, jVar.f7486e);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        o6.j.d(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (!((AtomicBoolean) this.f7662b.f6634e).get()) {
        } else {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(C0409d c0409d) {
        o6.j.e(c0409d, "key");
        Object obj = this.f7661a.get(c0409d);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            o6.j.d(copyOf, "copyOf(this, size)");
            return copyOf;
        }
        return obj;
    }

    public final void d(C0409d c0409d, Object obj) {
        o6.j.e(c0409d, "key");
        e(c0409d, obj);
    }

    public final void e(C0409d c0409d, Object obj) {
        o6.j.e(c0409d, "key");
        b();
        LinkedHashMap linkedHashMap = this.f7661a;
        if (obj == null) {
            b();
            linkedHashMap.remove(c0409d);
            return;
        }
        if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(AbstractC0436k.V0((Set) obj));
            o6.j.d(unmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(c0409d, unmodifiableSet);
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                o6.j.d(copyOf, "copyOf(this, size)");
                linkedHashMap.put(c0409d, copyOf);
                return;
            }
            linkedHashMap.put(c0409d, obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:10:0x002c->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z8;
        if (obj instanceof C0407b) {
            C0407b c0407b = (C0407b) obj;
            LinkedHashMap linkedHashMap = c0407b.f7661a;
            LinkedHashMap linkedHashMap2 = this.f7661a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    LinkedHashMap linkedHashMap3 = c0407b.f7661a;
                    if (!linkedHashMap3.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (value instanceof byte[]) {
                                    if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                        z8 = true;
                                    }
                                } else {
                                    z8 = o6.j.a(value, obj2);
                                }
                                if (z8) {
                                }
                            }
                            z8 = false;
                            if (z8) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Iterator it = this.f7661a.entrySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof byte[]) {
                hashCode = Arrays.hashCode((byte[]) value);
            } else {
                hashCode = value.hashCode();
            }
            i4 += hashCode;
        }
        return i4;
    }

    public final String toString() {
        return AbstractC0436k.v0(this.f7661a.entrySet(), ",\n", "{\n", "\n}", C0406a.f7660e, 24);
    }

    public /* synthetic */ C0407b(boolean z8) {
        this(new LinkedHashMap(), z8);
    }
}
