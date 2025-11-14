package G5;

import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class k extends AbstractC1492c {
    @Override // s3.AbstractC1492c
    public final void q(v vVar, float f8, float f9) {
        vVar.d(0.0f, f9 * f8, 180.0f, 90.0f);
        float f10 = f9 * 2.0f * f8;
        r rVar = new r(0.0f, 0.0f, f10, f10);
        rVar.f1827f = 180.0f;
        rVar.f1828g = 90.0f;
        vVar.f1840g.add(rVar);
        p pVar = new p(rVar);
        vVar.a(180.0f);
        vVar.f1841h.add(pVar);
        vVar.f1838e = 270.0f;
        float f11 = (0.0f + f10) * 0.5f;
        float f12 = (f10 - 0.0f) / 2.0f;
        double d2 = 270.0f;
        vVar.f1836c = (((float) Math.cos(Math.toRadians(d2))) * f12) + f11;
        vVar.f1837d = (f12 * ((float) Math.sin(Math.toRadians(d2)))) + f11;
    }
}
