package C5;

import a.AbstractC0405a;

/* loaded from: classes.dex */
public final class j extends AbstractC0405a {
    @Override // a.AbstractC0405a
    public final float T(k kVar) {
        return kVar.f689r.f703b * 10000.0f;
    }

    @Override // a.AbstractC0405a
    public final void w0(k kVar, float f8) {
        kVar.f689r.f703b = f8 / 10000.0f;
        kVar.invalidateSelf();
    }
}
