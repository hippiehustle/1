package G5;

import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class d extends AbstractC1492c {
    @Override // s3.AbstractC1492c
    public final void q(v vVar, float f8, float f9) {
        vVar.d(0.0f, f9 * f8, 180.0f, 90.0f);
        double d2 = f9;
        double d3 = f8;
        vVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d2 * d3), (float) (Math.sin(Math.toRadians(0.0f)) * d2 * d3));
    }
}
