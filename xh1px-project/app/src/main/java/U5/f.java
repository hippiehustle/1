package U5;

import R3.r;
import androidx.lifecycle.Z;
import androidx.lifecycle.b0;
import k0.AbstractC0948c;
import t7.C1594d;

/* loaded from: classes.dex */
public final class f implements b0 {

    /* renamed from: d, reason: collision with root package name */
    public static final C1594d f6165d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Y5.b f6166a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f6167b;

    /* renamed from: c, reason: collision with root package name */
    public final d f6168c;

    public f(Y5.b bVar, b0 b0Var, r rVar) {
        this.f6166a = bVar;
        this.f6167b = b0Var;
        this.f6168c = new d(0, rVar);
    }

    @Override // androidx.lifecycle.b0
    public final Z a(Class cls, AbstractC0948c abstractC0948c) {
        if (this.f6166a.containsKey(cls)) {
            return this.f6168c.a(cls, abstractC0948c);
        }
        return this.f6167b.a(cls, abstractC0948c);
    }

    @Override // androidx.lifecycle.b0
    public final Z b(Class cls) {
        if (!this.f6166a.containsKey(cls)) {
            return this.f6167b.b(cls);
        }
        this.f6168c.b(cls);
        throw null;
    }
}
