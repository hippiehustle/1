package P;

import android.os.Build;
import android.view.View;
import b6.C0538f;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: d, reason: collision with root package name */
    public int f4203d;

    /* renamed from: e, reason: collision with root package name */
    public int f4204e;

    /* renamed from: f, reason: collision with root package name */
    public int f4205f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4206g;

    public C() {
        if (G5.e.f1749e == null) {
            G5.e.f1749e = new G5.e(19);
        }
    }

    public int b(int i4) {
        if (i4 < this.f4205f) {
            return ((ByteBuffer) this.f4206g).getShort(this.f4204e + i4);
        }
        return 0;
    }

    public void c() {
        if (((C0538f) this.f4206g).k == this.f4205f) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object d(View view);

    public abstract void f(View view, Object obj);

    public void g() {
        while (true) {
            int i4 = this.f4203d;
            C0538f c0538f = (C0538f) this.f4206g;
            if (i4 < c0538f.f9231i && c0538f.f9228f[i4] < 0) {
                this.f4203d = i4 + 1;
            } else {
                return;
            }
        }
    }

    public void h(View view, Object obj) {
        Object tag;
        C0254b c0254b;
        if (Build.VERSION.SDK_INT >= this.f4204e) {
            f(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f4204e) {
            tag = d(view);
        } else {
            tag = view.getTag(this.f4203d);
            if (!((Class) this.f4206g).isInstance(tag)) {
                tag = null;
            }
        }
        if (i(tag, obj)) {
            View.AccessibilityDelegate d2 = O.d(view);
            if (d2 == null) {
                c0254b = null;
            } else if (d2 instanceof C0253a) {
                c0254b = ((C0253a) d2).f4240a;
            } else {
                c0254b = new C0254b(d2);
            }
            if (c0254b == null) {
                c0254b = new C0254b();
            }
            O.m(view, c0254b);
            view.setTag(this.f4203d, obj);
            O.h(view, this.f4205f);
        }
    }

    public boolean hasNext() {
        if (this.f4203d < ((C0538f) this.f4206g).f9231i) {
            return true;
        }
        return false;
    }

    public abstract boolean i(Object obj, Object obj2);

    public void remove() {
        C0538f c0538f = (C0538f) this.f4206g;
        c();
        if (this.f4204e != -1) {
            c0538f.d();
            c0538f.n(this.f4204e);
            this.f4204e = -1;
            this.f4205f = c0538f.k;
            return;
        }
        throw new IllegalStateException("Call next() before removing element from the iterator.");
    }
}
