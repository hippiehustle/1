package t;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p6.InterfaceC1315a;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1523a implements Iterator, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public int f14638d;

    /* renamed from: e, reason: collision with root package name */
    public int f14639e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14640f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14641g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f14642h;

    public C1523a(int i4) {
        this.f14638d = i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f14639e < this.f14638d) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f8;
        if (hasNext()) {
            int i4 = this.f14639e;
            switch (this.f14641g) {
                case 0:
                    f8 = ((e) this.f14642h).f(i4);
                    break;
                case 1:
                    f8 = ((e) this.f14642h).i(i4);
                    break;
                default:
                    f8 = ((f) this.f14642h).f14653e[i4];
                    break;
            }
            this.f14639e++;
            this.f14640f = true;
            return f8;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f14640f) {
            int i4 = this.f14639e - 1;
            this.f14639e = i4;
            switch (this.f14641g) {
                case 0:
                    ((e) this.f14642h).g(i4);
                    break;
                case 1:
                    ((e) this.f14642h).g(i4);
                    break;
                default:
                    ((f) this.f14642h).g(i4);
                    break;
            }
            this.f14638d--;
            this.f14640f = false;
            return;
        }
        throw new IllegalStateException("Call next() before removing an element.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1523a(f fVar) {
        this(fVar.f14654f);
        this.f14641g = 2;
        this.f14642h = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1523a(e eVar, int i4) {
        this(eVar.f14670f);
        this.f14641g = i4;
        switch (i4) {
            case 1:
                this.f14642h = eVar;
                this(eVar.f14670f);
                return;
            default:
                this.f14642h = eVar;
                return;
        }
    }
}
