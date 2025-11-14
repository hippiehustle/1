package t;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1525c implements Iterator, Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public int f14644d;

    /* renamed from: e, reason: collision with root package name */
    public int f14645e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14646f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f14647g;

    public C1525c(e eVar) {
        this.f14647g = eVar;
        this.f14644d = eVar.f14670f - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.f14646f) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i4 = this.f14645e;
                e eVar = this.f14647g;
                if (o6.j.a(key, eVar.f(i4)) && o6.j.a(entry.getValue(), eVar.i(this.f14645e))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f14646f) {
            return this.f14647g.f(this.f14645e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f14646f) {
            return this.f14647g.i(this.f14645e);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f14645e < this.f14644d) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        if (this.f14646f) {
            int i4 = this.f14645e;
            e eVar = this.f14647g;
            Object f8 = eVar.f(i4);
            Object i8 = eVar.i(this.f14645e);
            int i9 = 0;
            if (f8 == null) {
                hashCode = 0;
            } else {
                hashCode = f8.hashCode();
            }
            if (i8 != null) {
                i9 = i8.hashCode();
            }
            return hashCode ^ i9;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f14645e++;
            this.f14646f = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f14646f) {
            this.f14647g.g(this.f14645e);
            this.f14645e--;
            this.f14644d--;
            this.f14646f = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f14646f) {
            return this.f14647g.h(this.f14645e, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
