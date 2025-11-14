package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import h.AbstractC0805a;
import i.AbstractC0862a;
import n.AbstractC1106c;
import n.C1105b;
import n.l;
import n.m;
import n.o;
import n.z;
import o.C1178a0;
import o.InterfaceC1199l;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C1178a0 implements z, View.OnClickListener, InterfaceC1199l {
    public o k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f8309l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f8310m;

    /* renamed from: n, reason: collision with root package name */
    public l f8311n;

    /* renamed from: o, reason: collision with root package name */
    public C1105b f8312o;

    /* renamed from: p, reason: collision with root package name */
    public AbstractC1106c f8313p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8314q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8315r;

    /* renamed from: s, reason: collision with root package name */
    public final int f8316s;

    /* renamed from: t, reason: collision with root package name */
    public int f8317t;

    /* renamed from: u, reason: collision with root package name */
    public final int f8318u;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f8314q = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0805a.f11277c, 0, 0);
        this.f8316s = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f8318u = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f8317t = -1;
        setSaveEnabled(false);
    }

    @Override // n.z
    public final void a(o oVar) {
        int i4;
        this.k = oVar;
        setIcon(oVar.getIcon());
        setTitle(oVar.getTitleCondensed());
        setId(oVar.f12669a);
        if (oVar.isVisible()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        setVisibility(i4);
        setEnabled(oVar.isEnabled());
        if (oVar.hasSubMenu() && this.f8312o == null) {
            this.f8312o = new C1105b(this);
        }
    }

    @Override // o.InterfaceC1199l
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // o.InterfaceC1199l
    public final boolean c() {
        if (!TextUtils.isEmpty(getText()) && this.k.getIcon() == null) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i8 = configuration.screenHeightDp;
        if (i4 < 480) {
            if ((i4 < 640 || i8 < 480) && configuration.orientation != 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // n.z
    public o getItemData() {
        return this.k;
    }

    public final void h() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z8 = true;
        boolean z9 = !TextUtils.isEmpty(this.f8309l);
        if (this.f8310m != null && ((this.k.f12691y & 4) != 4 || (!this.f8314q && !this.f8315r))) {
            z8 = false;
        }
        boolean z10 = z9 & z8;
        CharSequence charSequence3 = null;
        if (z10) {
            charSequence = this.f8309l;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.k.f12683q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z10) {
                charSequence2 = null;
            } else {
                charSequence2 = this.k.f12673e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.k.f12684r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z10) {
                charSequence3 = this.k.f12673e;
            }
            AbstractC0862a.w(this, charSequence3);
            return;
        }
        AbstractC0862a.w(this, charSequence5);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.f8311n;
        if (lVar != null) {
            lVar.c(this.k);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8314q = g();
        h();
    }

    @Override // o.C1178a0, android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i8) {
        int i9;
        int i10;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i10 = this.f8317t) >= 0) {
            super.setPadding(i10, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i4, i8);
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int measuredWidth = getMeasuredWidth();
        int i11 = this.f8316s;
        if (mode == Integer.MIN_VALUE) {
            i9 = Math.min(size, i11);
        } else {
            i9 = i11;
        }
        if (mode != 1073741824 && i11 > 0 && measuredWidth < i9) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), i8);
        }
        if (isEmpty && this.f8310m != null) {
            super.setPadding((getMeasuredWidth() - this.f8310m.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1105b c1105b;
        if (this.k.hasSubMenu() && (c1105b = this.f8312o) != null && c1105b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z8) {
    }

    public void setChecked(boolean z8) {
    }

    public void setExpandedFormat(boolean z8) {
        if (this.f8315r != z8) {
            this.f8315r = z8;
            o oVar = this.k;
            if (oVar != null) {
                m mVar = oVar.f12680n;
                mVar.k = true;
                mVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f8310m = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i4 = this.f8318u;
            if (intrinsicWidth > i4) {
                intrinsicHeight = (int) (intrinsicHeight * (i4 / intrinsicWidth));
                intrinsicWidth = i4;
            }
            if (intrinsicHeight > i4) {
                intrinsicWidth = (int) (intrinsicWidth * (i4 / intrinsicHeight));
            } else {
                i4 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i4);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(l lVar) {
        this.f8311n = lVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i4, int i8, int i9, int i10) {
        this.f8317t = i4;
        super.setPadding(i4, i8, i9, i10);
    }

    public void setPopupCallback(AbstractC1106c abstractC1106c) {
        this.f8313p = abstractC1106c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f8309l = charSequence;
        h();
    }
}
