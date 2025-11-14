package Z6;

import Y6.l;

/* loaded from: classes.dex */
public final class c extends D6.b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f7525g;

    public /* synthetic */ c(l lVar, int i4) {
        this.f7524f = i4;
        this.f7525g = lVar;
    }

    @Override // D6.b
    public final void J0(String[] strArr) {
        switch (this.f7524f) {
            case 0:
                if (strArr != null) {
                    ((d) this.f7525g).f7527e.f7535g = strArr;
                    return;
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
            case 1:
                if (strArr != null) {
                    ((d) this.f7525g).f7527e.f7536h = strArr;
                    return;
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
            default:
                if (strArr != null) {
                    ((f) ((W5.a) this.f7525g).f6634e).k = strArr;
                    return;
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
        }
    }
}
