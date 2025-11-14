package Z6;

/* loaded from: classes.dex */
public final class e extends D6.b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7528f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f7529g;

    public /* synthetic */ e(d dVar, int i4) {
        this.f7528f = i4;
        this.f7529g = dVar;
    }

    @Override // D6.b
    public final void J0(String[] strArr) {
        switch (this.f7528f) {
            case 0:
                if (strArr != null) {
                    this.f7529g.f7527e.f7535g = strArr;
                    return;
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
            default:
                if (strArr != null) {
                    this.f7529g.f7527e.f7536h = strArr;
                    return;
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
        }
    }
}
