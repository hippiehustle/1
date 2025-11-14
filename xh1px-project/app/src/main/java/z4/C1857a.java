package z4;

/* renamed from: z4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1857a extends C1868l {

    /* renamed from: d, reason: collision with root package name */
    public final C1867k f16632d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, z4.k] */
    public C1857a() {
        ?? obj = new Object();
        obj.f16676b = Double.MAX_VALUE;
        obj.f16677c = Double.MIN_VALUE;
        this.f16632d = obj;
    }

    @Override // z4.C1868l
    public final void a() {
        throw null;
    }

    @Override // z4.C1868l
    public final void b(boolean z8) {
        throw new UnsupportedOperationException("You must use onProcessingEnd(Boolean, Double?)");
    }

    @Override // z4.C1868l
    public final C4.g c() {
        throw new UnsupportedOperationException("You must use toConditionProcessingDebugInfo()");
    }

    public final void d(boolean z8, Double d2) {
        super.b(z8);
        double doubleValue = d2.doubleValue();
        C1867k c1867k = this.f16632d;
        c1867k.f16675a += doubleValue;
        c1867k.f16676b = Math.min(doubleValue, c1867k.f16676b);
        c1867k.f16677c = Math.max(doubleValue, c1867k.f16677c);
    }
}
