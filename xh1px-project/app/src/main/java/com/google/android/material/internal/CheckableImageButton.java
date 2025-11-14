package com.google.android.material.internal;

import P.O;
import V.b;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.datepicker.i;
import o.C1224y;
import x5.C1791a;

/* loaded from: classes.dex */
public class CheckableImageButton extends C1224y implements Checkable {
    public static final int[] j = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    public boolean f10173g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10174h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10175i;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.buzbuz.smartautoclicker.R.attr.imageButtonStyle);
        this.f10174h = true;
        this.f10175i = true;
        O.m(this, new i(3, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f10173g;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        if (this.f10173g) {
            return View.mergeDrawableStates(super.onCreateDrawableState(i4 + 1), j);
        }
        return super.onCreateDrawableState(i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1791a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1791a c1791a = (C1791a) parcelable;
        super.onRestoreInstanceState(c1791a.f6209d);
        setChecked(c1791a.f16133f);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, x5.a, V.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new b(super.onSaveInstanceState());
        bVar.f16133f = this.f10173g;
        return bVar;
    }

    public void setCheckable(boolean z8) {
        if (this.f10174h != z8) {
            this.f10174h = z8;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z8) {
        if (this.f10174h && this.f10173g != z8) {
            this.f10173g = z8;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z8) {
        this.f10175i = z8;
    }

    @Override // android.view.View
    public void setPressed(boolean z8) {
        if (this.f10175i) {
            super.setPressed(z8);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f10173g);
    }
}
