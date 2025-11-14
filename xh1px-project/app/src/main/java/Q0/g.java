package Q0;

import N0.I;
import a1.C0415b;

/* loaded from: classes.dex */
public final class g extends R3.r {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ R3.r f4727g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(R3.r rVar) {
        super(9);
        this.f4727g = rVar;
    }

    @Override // R3.r
    public final Object S(C0415b c0415b) {
        Float f8 = (Float) ((I) this.f4727g.f5083f);
        if (f8 == null) {
            return null;
        }
        return Float.valueOf(f8.floatValue() * 2.55f);
    }
}
