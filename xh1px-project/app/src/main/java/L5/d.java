package L5;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.internal.CheckableImageButton;
import f5.AbstractC0710a;
import h4.AbstractC0832f;

/* loaded from: classes.dex */
public final class d extends o {

    /* renamed from: e, reason: collision with root package name */
    public final int f2938e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2939f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f2940g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f2941h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f2942i;
    public final B2.b j;
    public final ViewOnFocusChangeListenerC0117a k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f2943l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f2944m;

    public d(n nVar) {
        super(nVar);
        this.j = new B2.b(8, this);
        this.k = new ViewOnFocusChangeListenerC0117a(this, 0);
        this.f2938e = AbstractC0832f.x(nVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f2939f = AbstractC0832f.x(nVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f2940g = AbstractC0832f.y(nVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0710a.f10766a);
        this.f2941h = AbstractC0832f.y(nVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0710a.f10769d);
    }

    @Override // L5.o
    public final void a() {
        if (this.f2991b.f2983s != null) {
            return;
        }
        t(u());
    }

    @Override // L5.o
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // L5.o
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // L5.o
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // L5.o
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // L5.o
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // L5.o
    public final void m(EditText editText) {
        this.f2942i = editText;
        this.f2990a.setEndIconVisible(u());
    }

    @Override // L5.o
    public final void p(boolean z8) {
        if (this.f2991b.f2983s == null) {
            return;
        }
        t(z8);
    }

    @Override // L5.o
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f2941h);
        ofFloat.setDuration(this.f2939f);
        final int i4 = 1;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: L5.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f2935b;

            {
                this.f2935b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i4) {
                    case 0:
                        d dVar = this.f2935b;
                        dVar.getClass();
                        dVar.f2993d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        d dVar2 = this.f2935b;
                        dVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f2993d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f2940g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i8 = this.f2938e;
        ofFloat2.setDuration(i8);
        final int i9 = 0;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: L5.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f2935b;

            {
                this.f2935b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i9) {
                    case 0:
                        d dVar = this.f2935b;
                        dVar.getClass();
                        dVar.f2993d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        d dVar2 = this.f2935b;
                        dVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f2993d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2943l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f2943l.addListener(new c(this, i9));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i8);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: L5.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f2935b;

            {
                this.f2935b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i9) {
                    case 0:
                        d dVar = this.f2935b;
                        dVar.getClass();
                        dVar.f2993d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        d dVar2 = this.f2935b;
                        dVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f2993d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        this.f2944m = ofFloat3;
        ofFloat3.addListener(new c(this, i4));
    }

    @Override // L5.o
    public final void s() {
        EditText editText = this.f2942i;
        if (editText != null) {
            editText.post(new E.a(2, this));
        }
    }

    public final void t(boolean z8) {
        boolean z9;
        if (this.f2991b.d() == z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z8 && !this.f2943l.isRunning()) {
            this.f2944m.cancel();
            this.f2943l.start();
            if (z9) {
                this.f2943l.end();
                return;
            }
            return;
        }
        if (!z8) {
            this.f2943l.cancel();
            this.f2944m.start();
            if (z9) {
                this.f2944m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.f2942i;
        if (editText != null) {
            if ((editText.hasFocus() || this.f2993d.hasFocus()) && this.f2942i.getText().length() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
