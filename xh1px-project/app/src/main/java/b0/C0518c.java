package b0;

import C5.k;
import Z.g;
import a.AbstractC0405a;
import android.view.View;

/* renamed from: b0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518c extends AbstractC0405a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9018f;

    public /* synthetic */ C0518c(int i4) {
        this.f9018f = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.AbstractC0405a
    public final float T(k kVar) {
        switch (this.f9018f) {
            case 0:
                return ((View) kVar).getAlpha();
            case 1:
                return ((View) kVar).getScaleX();
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                return ((View) kVar).getScaleY();
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                return ((View) kVar).getRotation();
            case g.LONG_FIELD_NUMBER /* 4 */:
                return ((View) kVar).getRotationX();
            default:
                return ((View) kVar).getRotationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.AbstractC0405a
    public final void w0(k kVar, float f8) {
        switch (this.f9018f) {
            case 0:
                ((View) kVar).setAlpha(f8);
                return;
            case 1:
                ((View) kVar).setScaleX(f8);
                return;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                ((View) kVar).setScaleY(f8);
                return;
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                ((View) kVar).setRotation(f8);
                return;
            case g.LONG_FIELD_NUMBER /* 4 */:
                ((View) kVar).setRotationX(f8);
                return;
            default:
                ((View) kVar).setRotationY(f8);
                return;
        }
    }
}
