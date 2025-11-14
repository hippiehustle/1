package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import h.AbstractC0805a;
import java.lang.ref.WeakReference;
import o.r1;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: d, reason: collision with root package name */
    public int f8501d;

    /* renamed from: e, reason: collision with root package name */
    public int f8502e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f8503f;

    /* renamed from: g, reason: collision with root package name */
    public LayoutInflater f8504g;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f8501d = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0805a.f11274B, 0, 0);
        this.f8502e = obtainStyledAttributes.getResourceId(2, -1);
        this.f8501d = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f8501d != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f8504g;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f8501d, viewGroup, false);
                int i4 = this.f8502e;
                if (i4 != -1) {
                    inflate.setId(i4);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f8503f = new WeakReference(inflate);
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f8502e;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f8504g;
    }

    public int getLayoutResource() {
        return this.f8501d;
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i4) {
        this.f8502e = i4;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f8504g = layoutInflater;
    }

    public void setLayoutResource(int i4) {
        this.f8501d = i4;
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        WeakReference weakReference = this.f8503f;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i4);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i4);
        if (i4 != 0 && i4 != 4) {
            return;
        }
        a();
    }

    public void setOnInflateListener(r1 r1Var) {
    }
}
