package b6;

import java.util.ConcurrentModificationException;
import java.util.Map;
import o6.j;
import p6.InterfaceC1315a;

/* renamed from: b6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0537e implements Map.Entry, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public final C0538f f9222d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9223e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9224f;

    public C0537e(C0538f c0538f, int i4) {
        j.e(c0538f, "map");
        this.f9222d = c0538f;
        this.f9223e = i4;
        this.f9224f = c0538f.k;
    }

    public final void b() {
        if (this.f9222d.k == this.f9224f) {
        } else {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (j.a(entry.getKey(), getKey()) && j.a(entry.getValue(), getValue())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        b();
        return this.f9222d.f9226d[this.f9223e];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        b();
        Object[] objArr = this.f9222d.f9227e;
        j.b(objArr);
        return objArr[this.f9223e];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i4;
        Object key = getKey();
        int i8 = 0;
        if (key != null) {
            i4 = key.hashCode();
        } else {
            i4 = 0;
        }
        Object value = getValue();
        if (value != null) {
            i8 = value.hashCode();
        }
        return i4 ^ i8;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        b();
        C0538f c0538f = this.f9222d;
        c0538f.d();
        Object[] objArr = c0538f.f9227e;
        if (objArr == null) {
            int length = c0538f.f9226d.length;
            if (length >= 0) {
                objArr = new Object[length];
                c0538f.f9227e = objArr;
            } else {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
        }
        int i4 = this.f9223e;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
