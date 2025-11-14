package C5;

import P.O;
import a.AbstractC0405a;
import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.buzbuz.smartautoclicker.R;
import e5.AbstractC0645a;
import h4.AbstractC0832f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class d extends ProgressBar {

    /* renamed from: d, reason: collision with root package name */
    public final i f647d;

    /* renamed from: e, reason: collision with root package name */
    public int f648e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f649f;

    /* renamed from: g, reason: collision with root package name */
    public final int f650g;

    /* renamed from: h, reason: collision with root package name */
    public final int f651h;

    /* renamed from: i, reason: collision with root package name */
    public a f652i;
    public boolean j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public final b f653l;

    /* renamed from: m, reason: collision with root package name */
    public final b f654m;

    /* renamed from: n, reason: collision with root package name */
    public final c f655n;

    /* renamed from: o, reason: collision with root package name */
    public final c f656o;

    /* JADX WARN: Type inference failed for: r10v0, types: [C5.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, C5.a] */
    public d(Context context, AttributeSet attributeSet) {
        super(M5.a.a(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, R.attr.circularProgressIndicatorStyle);
        this.j = false;
        this.k = 4;
        this.f653l = new b(this, 0);
        this.f654m = new b(this, 1);
        this.f655n = new c(this, 0);
        this.f656o = new c(this, 1);
        Context context2 = getContext();
        ?? obj = new Object();
        obj.f678c = new int[0];
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        x5.p.a(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = AbstractC0645a.f10635d;
        x5.p.b(context2, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        obj.f676a = AbstractC0405a.E(context2, obtainStyledAttributes, 9, dimensionPixelSize);
        obj.f677b = Math.min(AbstractC0405a.E(context2, obtainStyledAttributes, 8, 0), obj.f676a / 2);
        obj.f680e = obtainStyledAttributes.getInt(5, 0);
        obj.f681f = obtainStyledAttributes.getInt(1, 0);
        obj.f682g = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        if (!obtainStyledAttributes.hasValue(2)) {
            obj.f678c = new int[]{AbstractC0832f.m(context2, R.attr.colorPrimary, -1)};
        } else if (obtainStyledAttributes.peekValue(2).type != 1) {
            obj.f678c = new int[]{obtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context2.getResources().getIntArray(obtainStyledAttributes.getResourceId(2, -1));
            obj.f678c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (obtainStyledAttributes.hasValue(7)) {
            obj.f679d = obtainStyledAttributes.getColor(7, -1);
        } else {
            obj.f679d = obj.f678c[0];
            TypedArray obtainStyledAttributes2 = context2.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f8 = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            obj.f679d = AbstractC0832f.j(obj.f679d, (int) (f8 * 255.0f));
        }
        obtainStyledAttributes.recycle();
        int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        x5.p.a(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr2 = AbstractC0645a.k;
        x5.p.b(context2, attributeSet, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        obj.f683h = Math.max(AbstractC0405a.E(context2, obtainStyledAttributes3, 2, dimensionPixelSize2), obj.f676a * 2);
        obj.f684i = AbstractC0405a.E(context2, obtainStyledAttributes3, 1, dimensionPixelSize3);
        obj.j = obtainStyledAttributes3.getInt(0, 0);
        obtainStyledAttributes3.recycle();
        obj.a();
        this.f647d = obj;
        x5.p.a(context2, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        x5.p.b(context2, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        this.f650g = obtainStyledAttributes4.getInt(6, -1);
        this.f651h = Math.min(obtainStyledAttributes4.getInt(4, -1), 1000);
        obtainStyledAttributes4.recycle();
        this.f652i = new Object();
        this.f649f = true;
    }

    private o getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() != null) {
                return getIndeterminateDrawable().f708o;
            }
            return null;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f686o;
    }

    public final void a(int i4) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.f648e = i4;
                this.j = true;
                if (getIndeterminateDrawable().isVisible()) {
                    a aVar = this.f652i;
                    ContentResolver contentResolver = getContext().getContentResolver();
                    aVar.getClass();
                    if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                        h hVar = getIndeterminateDrawable().f709p;
                        ObjectAnimator objectAnimator = hVar.f670d;
                        if (objectAnimator != null && !objectAnimator.isRunning()) {
                            if (((q) hVar.f706a).isVisible()) {
                                hVar.f670d.start();
                                return;
                            }
                            ObjectAnimator objectAnimator2 = hVar.f669c;
                            if (objectAnimator2 != null) {
                                objectAnimator2.cancel();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                this.f655n.a(getIndeterminateDrawable());
                return;
            }
            return;
        }
        super.setProgress(i4);
        if (getProgressDrawable() != null) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    public final boolean b() {
        WeakHashMap weakHashMap = O.f4214a;
        if (isAttachedToWindow() && getWindowVisibility() == 0) {
            View view = this;
            while (view.getVisibility() == 0) {
                Object parent = view.getParent();
                if (parent == null) {
                    if (getWindowVisibility() == 0) {
                        return true;
                    }
                    return false;
                }
                if (!(parent instanceof View)) {
                    return true;
                }
                view = (View) parent;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return getIndeterminateDrawable();
        }
        return getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f647d.f681f;
    }

    public int[] getIndicatorColor() {
        return this.f647d.f678c;
    }

    public int getIndicatorTrackGapSize() {
        return this.f647d.f682g;
    }

    public int getShowAnimationBehavior() {
        return this.f647d.f680e;
    }

    public int getTrackColor() {
        return this.f647d.f679d;
    }

    public int getTrackCornerRadius() {
        return this.f647d.f677b;
    }

    public int getTrackThickness() {
        return this.f647d.f676a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f709p.j = this.f655n;
        }
        k progressDrawable = getProgressDrawable();
        c cVar = this.f656o;
        if (progressDrawable != null) {
            k progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f699i == null) {
                progressDrawable2.f699i = new ArrayList();
            }
            if (!progressDrawable2.f699i.contains(cVar)) {
                progressDrawable2.f699i.add(cVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            q indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f699i == null) {
                indeterminateDrawable.f699i = new ArrayList();
            }
            if (!indeterminateDrawable.f699i.contains(cVar)) {
                indeterminateDrawable.f699i.add(cVar);
            }
        }
        if (b()) {
            if (this.f651h > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f654m);
        removeCallbacks(this.f653l);
        ((m) getCurrentDrawable()).c(false, false, false);
        q indeterminateDrawable = getIndeterminateDrawable();
        c cVar = this.f656o;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().e(cVar);
            getIndeterminateDrawable().f709p.j = null;
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().e(cVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i4, int i8) {
        int d2;
        int d3;
        try {
            o currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            if (((e) currentDrawingDelegate).d() < 0) {
                d2 = View.getDefaultSize(getSuggestedMinimumWidth(), i4);
            } else {
                d2 = ((e) currentDrawingDelegate).d() + getPaddingLeft() + getPaddingRight();
            }
            if (((e) currentDrawingDelegate).d() < 0) {
                d3 = View.getDefaultSize(getSuggestedMinimumHeight(), i8);
            } else {
                d3 = ((e) currentDrawingDelegate).d() + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(d2, d3);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i4) {
        boolean z8;
        super.onVisibilityChanged(view, i4);
        if (i4 == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!this.f649f) {
            return;
        }
        ((m) getCurrentDrawable()).c(b(), false, z8);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        if (!this.f649f) {
            return;
        }
        ((m) getCurrentDrawable()).c(b(), false, false);
    }

    public void setAnimatorDurationScaleProvider(a aVar) {
        this.f652i = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f696f = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f696f = aVar;
        }
    }

    public void setHideAnimationBehavior(int i4) {
        this.f647d.f681f = i4;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z8) {
        try {
            if (z8 == isIndeterminate()) {
                return;
            }
            m mVar = (m) getCurrentDrawable();
            if (mVar != null) {
                mVar.c(false, false, false);
            }
            super.setIndeterminate(z8);
            m mVar2 = (m) getCurrentDrawable();
            if (mVar2 != null) {
                mVar2.c(b(), false, false);
            }
            if ((mVar2 instanceof q) && b()) {
                ((q) mVar2).f709p.r();
            }
            this.j = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (drawable instanceof q) {
                ((m) drawable).c(false, false, false);
                super.setIndeterminateDrawable(drawable);
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{AbstractC0832f.m(getContext(), R.attr.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f647d.f678c = iArr;
            h hVar = getIndeterminateDrawable().f709p;
            hVar.f673g = 0;
            ((n) ((ArrayList) hVar.f707b).get(0)).f704c = hVar.f672f.f678c[0];
            hVar.f675i = 0.0f;
            invalidate();
        }
    }

    public void setIndicatorTrackGapSize(int i4) {
        i iVar = this.f647d;
        if (iVar.f682g != i4) {
            iVar.f682g = i4;
            iVar.a();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i4) {
        if (isIndeterminate()) {
            return;
        }
        a(i4);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (drawable instanceof k) {
                k kVar = (k) drawable;
                kVar.c(false, false, false);
                super.setProgressDrawable(kVar);
                kVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i4) {
        this.f647d.f680e = i4;
        invalidate();
    }

    public void setTrackColor(int i4) {
        i iVar = this.f647d;
        if (iVar.f679d != i4) {
            iVar.f679d = i4;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i4) {
        i iVar = this.f647d;
        if (iVar.f677b != i4) {
            iVar.f677b = Math.min(i4, iVar.f676a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i4) {
        i iVar = this.f647d;
        if (iVar.f676a != i4) {
            iVar.f676a = i4;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i4) {
        if (i4 != 0 && i4 != 4 && i4 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.k = i4;
    }

    @Override // android.widget.ProgressBar
    public q getIndeterminateDrawable() {
        return (q) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public k getProgressDrawable() {
        return (k) super.getProgressDrawable();
    }
}
