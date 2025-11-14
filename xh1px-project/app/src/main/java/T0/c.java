package T0;

import Q0.o;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: d, reason: collision with root package name */
    public final b f5487d;

    /* renamed from: e, reason: collision with root package name */
    public final b f5488e;

    public c(b bVar, b bVar2) {
        this.f5487d = bVar;
        this.f5488e = bVar2;
    }

    @Override // T0.e
    public final List B0() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // T0.e
    public final boolean E0() {
        if (this.f5487d.E0() && this.f5488e.E0()) {
            return true;
        }
        return false;
    }

    @Override // T0.e
    public final Q0.e r0() {
        return new o(this.f5487d.r0(), this.f5488e.r0());
    }
}
