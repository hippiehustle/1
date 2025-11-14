package K0;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: d, reason: collision with root package name */
    public G.d f2545d;

    /* renamed from: e, reason: collision with root package name */
    public float f2546e;

    /* renamed from: f, reason: collision with root package name */
    public G.d f2547f;

    /* renamed from: g, reason: collision with root package name */
    public float f2548g;

    /* renamed from: h, reason: collision with root package name */
    public float f2549h;

    /* renamed from: i, reason: collision with root package name */
    public float f2550i;
    public float j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f2551l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f2552m;

    /* renamed from: n, reason: collision with root package name */
    public float f2553n;

    @Override // K0.k
    public final boolean a() {
        if (!this.f2547f.d() && !this.f2545d.d()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // K0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z8;
        G.d dVar;
        G.d dVar2 = this.f2547f;
        boolean z9 = true;
        if (dVar2.d()) {
            ColorStateList colorStateList = (ColorStateList) dVar2.f1652d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != dVar2.f1650b) {
                dVar2.f1650b = colorForState;
                z8 = true;
                dVar = this.f2545d;
                if (dVar.d()) {
                    ColorStateList colorStateList2 = (ColorStateList) dVar.f1652d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != dVar.f1650b) {
                        dVar.f1650b = colorForState2;
                        return z8 | z9;
                    }
                }
                z9 = false;
                return z8 | z9;
            }
        }
        z8 = false;
        dVar = this.f2545d;
        if (dVar.d()) {
        }
        z9 = false;
        return z8 | z9;
    }

    public float getFillAlpha() {
        return this.f2549h;
    }

    public int getFillColor() {
        return this.f2547f.f1650b;
    }

    public float getStrokeAlpha() {
        return this.f2548g;
    }

    public int getStrokeColor() {
        return this.f2545d.f1650b;
    }

    public float getStrokeWidth() {
        return this.f2546e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.f2550i;
    }

    public void setFillAlpha(float f8) {
        this.f2549h = f8;
    }

    public void setFillColor(int i4) {
        this.f2547f.f1650b = i4;
    }

    public void setStrokeAlpha(float f8) {
        this.f2548g = f8;
    }

    public void setStrokeColor(int i4) {
        this.f2545d.f1650b = i4;
    }

    public void setStrokeWidth(float f8) {
        this.f2546e = f8;
    }

    public void setTrimPathEnd(float f8) {
        this.j = f8;
    }

    public void setTrimPathOffset(float f8) {
        this.k = f8;
    }

    public void setTrimPathStart(float f8) {
        this.f2550i = f8;
    }
}
