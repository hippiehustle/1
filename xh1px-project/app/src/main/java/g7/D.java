package g7;

import java.util.Map;

/* loaded from: classes.dex */
public final class D implements Comparable, Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final Comparable f11195d;

    /* renamed from: e, reason: collision with root package name */
    public Object f11196e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z f11197f;

    public D(z zVar, Comparable comparable, Object obj) {
        this.f11197f = zVar;
        this.f11195d = comparable;
        this.f11196e = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f11195d.compareTo(((D) obj).f11195d);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f11195d;
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
                    Object obj2 = this.f11196e;
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
        return this.f11195d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f11196e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i4 = 0;
        Comparable comparable = this.f11195d;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f11196e;
        if (obj != null) {
            i4 = obj.hashCode();
        }
        return i4 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f11197f.b();
        Object obj2 = this.f11196e;
        this.f11196e = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11195d);
        String valueOf2 = String.valueOf(this.f11196e);
        StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 1);
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
