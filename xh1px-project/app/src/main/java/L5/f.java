package L5;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class f extends G5.g {

    /* renamed from: s, reason: collision with root package name */
    public final RectF f2946s;

    public f(G5.l lVar, RectF rectF) {
        super(lVar);
        this.f2946s = rectF;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [L5.g, G5.h, android.graphics.drawable.Drawable] */
    @Override // G5.g, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ?? hVar = new G5.h(this);
        hVar.f2948B = this;
        hVar.invalidateSelf();
        return hVar;
    }

    public f(f fVar) {
        super(fVar);
        this.f2946s = fVar.f2946s;
    }
}
