package com.google.android.material.checkbox;

import C5.c;
import E2.d;
import H5.e;
import K0.b;
import K0.f;
import M5.a;
import R.g;
import a.AbstractC0405a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.buzbuz.smartautoclicker.R;
import e5.AbstractC0645a;
import h4.AbstractC0832f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.r;
import x5.p;

/* loaded from: classes.dex */
public class MaterialCheckBox extends r {

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f10021B = {R.attr.state_indeterminate};

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f10022C = {R.attr.state_error};

    /* renamed from: D, reason: collision with root package name */
    public static final int[][] f10023D = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: E, reason: collision with root package name */
    public static final int f10024E = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: A, reason: collision with root package name */
    public final c f10025A;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f10026h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f10027i;
    public ColorStateList j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10028l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10029m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f10030n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f10031o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f10032p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10033q;

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f10034r;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f10035s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f10036t;

    /* renamed from: u, reason: collision with root package name */
    public int f10037u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f10038v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10039w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f10040x;

    /* renamed from: y, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f10041y;

    /* renamed from: z, reason: collision with root package name */
    public final f f10042z;

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f10026h = new LinkedHashSet();
        this.f10027i = new LinkedHashSet();
        this.f10042z = f.a(getContext(), R.drawable.mtrl_checkbox_button_checked_unchecked);
        this.f10025A = new c(this, 2);
        Context context2 = getContext();
        this.f10031o = getButtonDrawable();
        this.f10034r = getSuperButtonTintList();
        setSupportButtonTintList(null);
        g i4 = p.i(context2, attributeSet, AbstractC0645a.f10655z, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArray = (TypedArray) i4.f4988f;
        this.f10032p = i4.A(2);
        if (this.f10031o != null && d.F(context2, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == f10024E && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f10031o = h4.g.k(context2, R.drawable.mtrl_checkbox_button);
                this.f10033q = true;
                if (this.f10032p == null) {
                    this.f10032p = h4.g.k(context2, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f10035s = AbstractC0405a.B(context2, i4, 3);
        this.f10036t = p.j(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.k = typedArray.getBoolean(10, false);
        this.f10028l = typedArray.getBoolean(6, true);
        this.f10029m = typedArray.getBoolean(9, false);
        this.f10030n = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        i4.L();
        a();
    }

    private String getButtonStateDescription() {
        int i4 = this.f10037u;
        if (i4 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        if (i4 == 0) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.j == null) {
            int o7 = AbstractC0832f.o(this, R.attr.colorControlActivated);
            int o8 = AbstractC0832f.o(this, R.attr.colorError);
            int o9 = AbstractC0832f.o(this, R.attr.colorSurface);
            int o10 = AbstractC0832f.o(this, R.attr.colorOnSurface);
            this.j = new ColorStateList(f10023D, new int[]{AbstractC0832f.t(1.0f, o9, o8), AbstractC0832f.t(1.0f, o9, o7), AbstractC0832f.t(0.54f, o9, o10), AbstractC0832f.t(0.38f, o9, o10), AbstractC0832f.t(0.38f, o9, o10)});
        }
        return this.j;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f10034r;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        e eVar;
        this.f10031o = h2.a.e(this.f10031o, this.f10034r, getButtonTintMode());
        this.f10032p = h2.a.e(this.f10032p, this.f10035s, this.f10036t);
        if (this.f10033q) {
            f fVar = this.f10042z;
            if (fVar != null) {
                K0.d dVar = fVar.f2539e;
                Drawable drawable = fVar.f2544d;
                c cVar = this.f10025A;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (cVar.f644a == null) {
                        cVar.f644a = new b(cVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(cVar.f644a);
                }
                ArrayList arrayList = fVar.f2542h;
                if (arrayList != null && cVar != null) {
                    arrayList.remove(cVar);
                    if (fVar.f2542h.size() == 0 && (eVar = fVar.f2541g) != null) {
                        dVar.f2534b.removeListener(eVar);
                        fVar.f2541g = null;
                    }
                }
                Drawable drawable2 = fVar.f2544d;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (cVar.f644a == null) {
                        cVar.f644a = new b(cVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(cVar.f644a);
                } else if (cVar != null) {
                    if (fVar.f2542h == null) {
                        fVar.f2542h = new ArrayList();
                    }
                    if (!fVar.f2542h.contains(cVar)) {
                        fVar.f2542h.add(cVar);
                        if (fVar.f2541g == null) {
                            fVar.f2541g = new e(3, fVar);
                        }
                        dVar.f2534b.addListener(fVar.f2541g);
                    }
                }
            }
            Drawable drawable3 = this.f10031o;
            if ((drawable3 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f10031o).addTransition(R.id.indeterminate, R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable4 = this.f10031o;
        if (drawable4 != null && (colorStateList2 = this.f10034r) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f10032p;
        if (drawable5 != null && (colorStateList = this.f10035s) != null) {
            drawable5.setTintList(colorStateList);
        }
        super.setButtonDrawable(h2.a.c(this.f10031o, this.f10032p, -1, -1));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f10031o;
    }

    public Drawable getButtonIconDrawable() {
        return this.f10032p;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f10035s;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f10036t;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f10034r;
    }

    public int getCheckedState() {
        return this.f10037u;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f10030n;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.f10037u == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.k && this.f10034r == null && this.f10035s == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f10021B);
        }
        if (this.f10029m) {
            View.mergeDrawableStates(onCreateDrawableState, f10022C);
        }
        this.f10038v = h2.a.h(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        int i4;
        if (this.f10028l && TextUtils.isEmpty(getText()) && (buttonDrawable = getButtonDrawable()) != null) {
            if (p.g(this)) {
                i4 = -1;
            } else {
                i4 = 1;
            }
            int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * i4;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = buttonDrawable.getBounds();
                getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f10029m) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f10030n));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p5.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p5.a aVar = (p5.a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        setCheckedState(aVar.f13801d);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, p5.a] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f13801d = getCheckedState();
        return baseSavedState;
    }

    @Override // o.r, android.widget.CompoundButton
    public void setButtonDrawable(int i4) {
        setButtonDrawable(h4.g.k(getContext(), i4));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f10032p = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i4) {
        setButtonIconDrawable(h4.g.k(getContext(), i4));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f10035s == colorStateList) {
            return;
        }
        this.f10035s = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f10036t == mode) {
            return;
        }
        this.f10036t = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f10034r == colorStateList) {
            return;
        }
        this.f10034r = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z8) {
        this.f10028l = z8;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z8) {
        setCheckedState(z8 ? 1 : 0);
    }

    public void setCheckedState(int i4) {
        boolean z8;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f10037u != i4) {
            this.f10037u = i4;
            if (i4 == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            super.setChecked(z8);
            refreshDrawableState();
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30 && this.f10040x == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.f10039w) {
                this.f10039w = true;
                LinkedHashSet linkedHashSet = this.f10027i;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                }
                if (this.f10037u != 2 && (onCheckedChangeListener = this.f10041y) != null) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (i8 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.f10039w = false;
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f10030n = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i4) {
        CharSequence charSequence;
        if (i4 != 0) {
            charSequence = getResources().getText(i4);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z8) {
        if (this.f10029m != z8) {
            this.f10029m = z8;
            refreshDrawableState();
            Iterator it = this.f10026h.iterator();
            if (!it.hasNext()) {
                return;
            }
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f10041y = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f10040x = charSequence;
        if (charSequence == null) {
            if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z8) {
        this.k = z8;
        if (z8) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // o.r, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f10031o = drawable;
        this.f10033q = false;
        a();
    }
}
