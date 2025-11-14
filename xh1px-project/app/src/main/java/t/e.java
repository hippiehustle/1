package t;

import a6.AbstractC0434i;
import androidx.datastore.preferences.protobuf.X;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class e extends j implements Map {

    /* renamed from: g, reason: collision with root package name */
    public X f14649g;

    /* renamed from: h, reason: collision with root package name */
    public C1524b f14650h;

    /* renamed from: i, reason: collision with root package name */
    public C1526d f14651i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar) {
        super(0);
        int i4 = jVar.f14670f;
        b(this.f14670f + i4);
        if (this.f14670f == 0) {
            if (i4 > 0) {
                AbstractC0434i.P0(0, 0, i4, jVar.f14668d, this.f14668d);
                AbstractC0434i.Q0(jVar.f14669e, this.f14669e, 0, 0, i4 << 1);
                this.f14670f = i4;
                return;
            }
            return;
        }
        for (int i8 = 0; i8 < i4; i8++) {
            put(jVar.f(i8), jVar.i(i8));
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        X x8 = this.f14649g;
        if (x8 == null) {
            X x9 = new X(this, 2);
            this.f14649g = x9;
            return x9;
        }
        return x8;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i4 = this.f14670f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        if (i4 != this.f14670f) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1524b c1524b = this.f14650h;
        if (c1524b == null) {
            C1524b c1524b2 = new C1524b(this);
            this.f14650h = c1524b2;
            return c1524b2;
        }
        return c1524b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f14670f);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C1526d c1526d = this.f14651i;
        if (c1526d == null) {
            C1526d c1526d2 = new C1526d(this);
            this.f14651i = c1526d2;
            return c1526d2;
        }
        return c1526d;
    }
}
