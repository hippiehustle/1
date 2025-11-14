package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class E extends LinkedHashMap {

    /* renamed from: e, reason: collision with root package name */
    public static final E f8603e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8604d = true;

    static {
        E e9 = new E();
        f8603e = e9;
        e9.f8604d = false;
    }

    public final void a() {
        if (this.f8604d) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, androidx.datastore.preferences.protobuf.E] */
    public final E b() {
        if (isEmpty()) {
            return new E();
        }
        ?? linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.f8604d = true;
        return linkedHashMap;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005d A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        boolean z8;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                            } else {
                                equals = value.equals(obj2);
                            }
                            if (!equals) {
                            }
                        }
                    }
                }
                z8 = false;
                if (!z8) {
                    return true;
                }
            }
            z8 = true;
            if (!z8) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int hashCode;
        int i4 = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int i8 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                Charset charset = AbstractC0486w.f8742a;
                hashCode = bArr.length;
                for (byte b4 : bArr) {
                    hashCode = (hashCode * 31) + b4;
                }
                if (hashCode == 0) {
                    hashCode = 1;
                }
            } else {
                hashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                Charset charset2 = AbstractC0486w.f8742a;
                int length = bArr2.length;
                for (byte b9 : bArr2) {
                    length = (length * 31) + b9;
                }
                if (length != 0) {
                    i8 = length;
                }
            } else {
                i8 = value.hashCode();
            }
            i4 += hashCode ^ i8;
        }
        return i4;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        a();
        Charset charset = AbstractC0486w.f8742a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        a();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC0486w.f8742a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        a();
        return super.remove(obj);
    }
}
