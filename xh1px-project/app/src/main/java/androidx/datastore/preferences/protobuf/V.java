package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class V implements Map.Entry, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final Comparable f8646d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U f8648f;

    public V(U u8, Comparable comparable, Object obj) {
        this.f8648f = u8;
        this.f8646d = comparable;
        this.f8647e = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f8646d.compareTo(((V) obj).f8646d);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f8646d;
                if (comparable == null) {
                    if (key == null) {
                        equals = true;
                    } else {
                        equals = false;
                    }
                } else {
                    equals = comparable.equals(key);
                }
                if (equals) {
                    Object obj2 = this.f8647e;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        if (value == null) {
                            equals2 = true;
                        } else {
                            equals2 = false;
                        }
                    } else {
                        equals2 = obj2.equals(value);
                    }
                    if (equals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8646d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8647e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i4 = 0;
        Comparable comparable = this.f8646d;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f8647e;
        if (obj != null) {
            i4 = obj.hashCode();
        }
        return i4 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f8648f.b();
        Object obj2 = this.f8647e;
        this.f8647e = obj;
        return obj2;
    }

    public final String toString() {
        return this.f8646d + "=" + this.f8647e;
    }
}
