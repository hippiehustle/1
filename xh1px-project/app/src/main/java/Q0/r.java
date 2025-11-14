package Q0;

import a1.C0414a;
import java.util.Collections;

/* loaded from: classes.dex */
public final class r extends e {

    /* renamed from: i, reason: collision with root package name */
    public final Object f4765i;

    public r(R3.r rVar, Object obj) {
        super(Collections.EMPTY_LIST);
        j(rVar);
        this.f4765i = obj;
    }

    @Override // Q0.e
    public final float b() {
        return 1.0f;
    }

    @Override // Q0.e
    public final Object e() {
        R3.r rVar = this.f4722e;
        Object obj = this.f4765i;
        float f8 = this.f4721d;
        return rVar.T(0.0f, 0.0f, obj, obj, f8, f8, f8);
    }

    @Override // Q0.e
    public final Object f(C0414a c0414a, float f8) {
        return e();
    }

    @Override // Q0.e
    public final void h() {
        if (this.f4722e != null) {
            super.h();
        }
    }

    @Override // Q0.e
    public final void i(float f8) {
        this.f4721d = f8;
    }
}
