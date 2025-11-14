package q0;

import O7.Y;
import java.util.Iterator;
import java.util.NoSuchElementException;
import n0.AbstractC1143u;
import p6.InterfaceC1315a;
import t.k;

/* renamed from: q0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1352h implements Iterator, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public int f13908d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y f13910f;

    public C1352h(Y y4) {
        this.f13910f = y4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f13908d + 1 < ((k) this.f13910f.f4115c).e()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f13909e = true;
            k kVar = (k) this.f13910f.f4115c;
            int i4 = this.f13908d + 1;
            this.f13908d = i4;
            return (AbstractC1143u) kVar.f(i4);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f13909e) {
            k kVar = (k) this.f13910f.f4115c;
            ((AbstractC1143u) kVar.f(this.f13908d)).f12814f = null;
            int i4 = this.f13908d;
            Object[] objArr = kVar.f14673f;
            Object obj = objArr[i4];
            Object obj2 = t.h.f14660b;
            if (obj != obj2) {
                objArr[i4] = obj2;
                kVar.f14671d = true;
            }
            this.f13908d = i4 - 1;
            this.f13909e = false;
            return;
        }
        throw new IllegalStateException("You must call next() before you can remove an element");
    }
}
