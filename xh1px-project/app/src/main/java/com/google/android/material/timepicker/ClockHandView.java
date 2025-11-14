package com.google.android.material.timepicker;

import P.O;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.buzbuz.smartautoclicker.R;
import e5.AbstractC0645a;
import f5.AbstractC0710a;
import h4.AbstractC0832f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockHandView extends View {

    /* renamed from: d, reason: collision with root package name */
    public final ValueAnimator f10329d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10330e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f10331f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10332g;

    /* renamed from: h, reason: collision with root package name */
    public final float f10333h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f10334i;
    public final RectF j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public float f10335l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10336m;

    /* renamed from: n, reason: collision with root package name */
    public double f10337n;

    /* renamed from: o, reason: collision with root package name */
    public int f10338o;

    /* renamed from: p, reason: collision with root package name */
    public int f10339p;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f10329d = new ValueAnimator();
        this.f10331f = new ArrayList();
        Paint paint = new Paint();
        this.f10334i = paint;
        this.j = new RectF();
        this.f10339p = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0645a.f10642m, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC0832f.x(context, R.attr.motionDurationLong2, 200);
        AbstractC0832f.y(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0710a.f10767b);
        this.f10338o = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f10332g = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.k = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f10333h = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = O.f4214a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i4) {
        if (i4 == 2) {
            return Math.round(this.f10338o * 0.66f);
        }
        return this.f10338o;
    }

    public final void b(float f8) {
        ValueAnimator valueAnimator = this.f10329d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f9 = f8 % 360.0f;
        this.f10335l = f9;
        this.f10337n = Math.toRadians(f9 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float a3 = a(this.f10339p);
        float cos = (((float) Math.cos(this.f10337n)) * a3) + width;
        float sin = (a3 * ((float) Math.sin(this.f10337n))) + height;
        float f10 = this.f10332g;
        this.j.set(cos - f10, sin - f10, cos + f10, sin + f10);
        Iterator it = this.f10331f.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.f10324J - f9) > 0.001f) {
                clockFaceView.f10324J = f9;
                clockFaceView.e();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f8 = width;
        float a3 = a(this.f10339p);
        float cos = (((float) Math.cos(this.f10337n)) * a3) + f8;
        float f9 = height;
        float sin = (a3 * ((float) Math.sin(this.f10337n))) + f9;
        Paint paint = this.f10334i;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f10332g, paint);
        double sin2 = Math.sin(this.f10337n);
        paint.setStrokeWidth(this.k);
        canvas.drawLine(f8, f9, width + ((int) (Math.cos(this.f10337n) * r2)), height + ((int) (r2 * sin2)), paint);
        canvas.drawCircle(f8, f9, this.f10333h, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        super.onLayout(z8, i4, i8, i9, i10);
        if (!this.f10329d.isRunning()) {
            b(this.f10335l);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        boolean z9;
        boolean z10;
        int i4;
        int actionMasked = motionEvent.getActionMasked();
        float x8 = motionEvent.getX();
        float y4 = motionEvent.getY();
        boolean z11 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z9 = false;
                z8 = false;
            } else {
                z9 = this.f10336m;
                if (this.f10330e) {
                    if (((float) Math.hypot(x8 - (getWidth() / 2), y4 - (getHeight() / 2))) <= a(2) + TypedValue.applyDimension(1, 12, getContext().getResources().getDisplayMetrics())) {
                        i4 = 2;
                    } else {
                        i4 = 1;
                    }
                    this.f10339p = i4;
                }
                z8 = false;
            }
        } else {
            this.f10336m = false;
            z8 = true;
            z9 = false;
        }
        boolean z12 = this.f10336m;
        int degrees = (int) Math.toDegrees(Math.atan2(y4 - (getHeight() / 2), x8 - (getWidth() / 2)));
        int i8 = degrees + 90;
        if (i8 < 0) {
            i8 = degrees + 450;
        }
        float f8 = i8;
        if (this.f10335l != f8) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z8 || !z10) {
            if (z10 || z9) {
                b(f8);
            }
            this.f10336m = z12 | z11;
            return true;
        }
        z11 = true;
        this.f10336m = z12 | z11;
        return true;
    }
}
