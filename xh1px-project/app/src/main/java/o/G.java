package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.buzbuz.smartautoclicker.R;
import h.AbstractC0805a;

/* loaded from: classes.dex */
public final class G extends C1174B {

    /* renamed from: e, reason: collision with root package name */
    public final F f13079e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f13080f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f13081g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f13082h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13083i;
    public boolean j;

    public G(F f8) {
        super(f8);
        this.f13081g = null;
        this.f13082h = null;
        this.f13083i = false;
        this.j = false;
        this.f13079e = f8;
    }

    @Override // o.C1174B
    public final void b(AttributeSet attributeSet, int i4) {
        super.b(attributeSet, R.attr.seekBarStyle);
        F f8 = this.f13079e;
        Context context = f8.getContext();
        int[] iArr = AbstractC0805a.f11281g;
        R.g J6 = R.g.J(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) J6.f4988f;
        P.O.l(f8, f8.getContext(), iArr, attributeSet, (TypedArray) J6.f4988f, R.attr.seekBarStyle);
        Drawable B8 = J6.B(0);
        if (B8 != null) {
            f8.setThumb(B8);
        }
        Drawable A2 = J6.A(1);
        Drawable drawable = this.f13080f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f13080f = A2;
        if (A2 != null) {
            A2.setCallback(f8);
            A2.setLayoutDirection(f8.getLayoutDirection());
            if (A2.isStateful()) {
                A2.setState(f8.getDrawableState());
            }
            f();
        }
        f8.invalidate();
        if (typedArray.hasValue(3)) {
            this.f13082h = AbstractC1202m0.c(typedArray.getInt(3, -1), this.f13082h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f13081g = J6.z(2);
            this.f13083i = true;
        }
        J6.L();
        f();
    }

    public final void f() {
        Drawable drawable = this.f13080f;
        if (drawable != null) {
            if (this.f13083i || this.j) {
                Drawable mutate = drawable.mutate();
                this.f13080f = mutate;
                if (this.f13083i) {
                    mutate.setTintList(this.f13081g);
                }
                if (this.j) {
                    this.f13080f.setTintMode(this.f13082h);
                }
                if (this.f13080f.isStateful()) {
                    this.f13080f.setState(this.f13079e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        int i4;
        if (this.f13080f != null) {
            int max = this.f13079e.getMax();
            int i8 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f13080f.getIntrinsicWidth();
                int intrinsicHeight = this.f13080f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i4 = intrinsicWidth / 2;
                } else {
                    i4 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i8 = intrinsicHeight / 2;
                }
                this.f13080f.setBounds(-i4, -i8, i4, i8);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i9 = 0; i9 <= max; i9++) {
                    this.f13080f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
