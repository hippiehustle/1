package w5;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import f5.AbstractC0710a;

/* loaded from: classes.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f15733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f15734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f15735c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f15736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f15737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f15738f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f15739g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Matrix f15740h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f15741i;

    public e(j jVar, float f8, float f9, float f10, float f11, float f12, float f13, float f14, Matrix matrix) {
        this.f15741i = jVar;
        this.f15733a = f8;
        this.f15734b = f9;
        this.f15735c = f10;
        this.f15736d = f11;
        this.f15737e = f12;
        this.f15738f = f13;
        this.f15739g = f14;
        this.f15740h = matrix;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        j jVar = this.f15741i;
        jVar.f15776s.setAlpha(AbstractC0710a.b(this.f15733a, this.f15734b, 0.0f, 0.2f, floatValue));
        FloatingActionButton floatingActionButton = jVar.f15776s;
        float f8 = this.f15735c;
        float f9 = this.f15736d;
        floatingActionButton.setScaleX(AbstractC0710a.a(f8, f9, floatValue));
        jVar.f15776s.setScaleY(AbstractC0710a.a(this.f15737e, f9, floatValue));
        float f10 = this.f15738f;
        float f11 = this.f15739g;
        jVar.f15773p = AbstractC0710a.a(f10, f11, floatValue);
        float a3 = AbstractC0710a.a(f10, f11, floatValue);
        Matrix matrix = this.f15740h;
        jVar.a(a3, matrix);
        jVar.f15776s.setImageMatrix(matrix);
    }
}
