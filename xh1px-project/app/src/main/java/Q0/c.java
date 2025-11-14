package Q0;

import a1.C0414a;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: d, reason: collision with root package name */
    public final List f4712d;

    /* renamed from: f, reason: collision with root package name */
    public C0414a f4714f = null;

    /* renamed from: g, reason: collision with root package name */
    public float f4715g = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public C0414a f4713e = a(0.0f);

    public c(List list) {
        this.f4712d = list;
    }

    public final C0414a a(float f8) {
        List list = this.f4712d;
        C0414a c0414a = (C0414a) list.get(list.size() - 1);
        if (f8 >= c0414a.b()) {
            return c0414a;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            C0414a c0414a2 = (C0414a) list.get(size);
            if (this.f4713e != c0414a2 && f8 >= c0414a2.b() && f8 < c0414a2.a()) {
                return c0414a2;
            }
        }
        return (C0414a) list.get(0);
    }

    @Override // Q0.b
    public final float b() {
        return ((C0414a) this.f4712d.get(r0.size() - 1)).a();
    }

    @Override // Q0.b
    public final boolean e(float f8) {
        C0414a c0414a = this.f4714f;
        C0414a c0414a2 = this.f4713e;
        if (c0414a == c0414a2 && this.f4715g == f8) {
            return true;
        }
        this.f4714f = c0414a2;
        this.f4715g = f8;
        return false;
    }

    @Override // Q0.b
    public final float f() {
        return ((C0414a) this.f4712d.get(0)).b();
    }

    @Override // Q0.b
    public final C0414a g() {
        return this.f4713e;
    }

    @Override // Q0.b
    public final boolean i(float f8) {
        C0414a c0414a = this.f4713e;
        if (f8 >= c0414a.b() && f8 < c0414a.a()) {
            return !this.f4713e.c();
        }
        this.f4713e = a(f8);
        return true;
    }

    @Override // Q0.b
    public final boolean isEmpty() {
        return false;
    }
}
