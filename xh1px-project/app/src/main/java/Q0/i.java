package Q0;

import a1.C0414a;

/* loaded from: classes.dex */
public final class i extends k {
    @Override // Q0.e
    public final Object f(C0414a c0414a, float f8) {
        return Float.valueOf(m(c0414a, f8));
    }

    public final float l() {
        return m(this.f4720c.g(), c());
    }

    public final float m(C0414a c0414a, float f8) {
        float f9;
        Object obj = c0414a.f7671b;
        Object obj2 = c0414a.f7671b;
        if (obj != null && c0414a.f7672c != null) {
            R3.r rVar = this.f4722e;
            if (rVar != null) {
                f9 = f8;
                Float f10 = (Float) rVar.T(c0414a.f7676g, c0414a.f7677h.floatValue(), (Float) obj2, (Float) c0414a.f7672c, f9, d(), this.f4721d);
                if (f10 != null) {
                    return f10.floatValue();
                }
            } else {
                f9 = f8;
            }
            if (c0414a.f7678i == -3987645.8f) {
                c0414a.f7678i = ((Float) obj2).floatValue();
            }
            float f11 = c0414a.f7678i;
            if (c0414a.j == -3987645.8f) {
                c0414a.j = ((Float) c0414a.f7672c).floatValue();
            }
            return Z0.g.f(f11, c0414a.j, f9);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
