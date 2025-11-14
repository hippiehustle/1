package Q0;

import a1.C0414a;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: d, reason: collision with root package name */
    public final C0414a f4716d;

    /* renamed from: e, reason: collision with root package name */
    public float f4717e = -1.0f;

    public d(List list) {
        this.f4716d = (C0414a) list.get(0);
    }

    @Override // Q0.b
    public final float b() {
        return this.f4716d.a();
    }

    @Override // Q0.b
    public final boolean e(float f8) {
        if (this.f4717e == f8) {
            return true;
        }
        this.f4717e = f8;
        return false;
    }

    @Override // Q0.b
    public final float f() {
        return this.f4716d.b();
    }

    @Override // Q0.b
    public final C0414a g() {
        return this.f4716d;
    }

    @Override // Q0.b
    public final boolean i(float f8) {
        return !this.f4716d.c();
    }

    @Override // Q0.b
    public final boolean isEmpty() {
        return false;
    }
}
