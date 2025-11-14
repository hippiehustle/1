package com.google.android.material.internal;

import G.n;
import P.O;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.datepicker.i;
import i.AbstractC0862a;
import java.util.WeakHashMap;
import n.o;
import n.z;
import o.C1221w0;
import x5.e;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends e implements z {

    /* renamed from: J, reason: collision with root package name */
    public static final int[] f10176J = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public boolean f10177A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f10178B;

    /* renamed from: C, reason: collision with root package name */
    public final CheckedTextView f10179C;

    /* renamed from: D, reason: collision with root package name */
    public FrameLayout f10180D;

    /* renamed from: E, reason: collision with root package name */
    public o f10181E;

    /* renamed from: F, reason: collision with root package name */
    public ColorStateList f10182F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f10183G;

    /* renamed from: H, reason: collision with root package name */
    public Drawable f10184H;

    /* renamed from: I, reason: collision with root package name */
    public final i f10185I;

    /* renamed from: y, reason: collision with root package name */
    public int f10186y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10187z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10178B = true;
        i iVar = new i(4, this);
        this.f10185I = iVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.buzbuz.smartautoclicker.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.buzbuz.smartautoclicker.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.buzbuz.smartautoclicker.R.id.design_menu_item_text);
        this.f10179C = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        O.m(checkedTextView, iVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f10180D == null) {
                this.f10180D = (FrameLayout) ((ViewStub) findViewById(com.buzbuz.smartautoclicker.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f10180D.removeAllViews();
            this.f10180D.addView(view);
        }
    }

    @Override // n.z
    public final void a(o oVar) {
        int i4;
        StateListDrawable stateListDrawable;
        this.f10181E = oVar;
        int i8 = oVar.f12669a;
        if (i8 > 0) {
            setId(i8);
        }
        if (oVar.isVisible()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        setVisibility(i4);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.buzbuz.smartautoclicker.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f10176J, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = O.f4214a;
            setBackground(stateListDrawable);
        }
        setCheckable(oVar.isCheckable());
        setChecked(oVar.isChecked());
        setEnabled(oVar.isEnabled());
        setTitle(oVar.f12673e);
        setIcon(oVar.getIcon());
        setActionView(oVar.getActionView());
        setContentDescription(oVar.f12683q);
        AbstractC0862a.w(this, oVar.f12684r);
        o oVar2 = this.f10181E;
        CharSequence charSequence = oVar2.f12673e;
        CheckedTextView checkedTextView = this.f10179C;
        if (charSequence == null && oVar2.getIcon() == null && this.f10181E.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f10180D;
            if (frameLayout != null) {
                C1221w0 c1221w0 = (C1221w0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c1221w0).width = -1;
                this.f10180D.setLayoutParams(c1221w0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f10180D;
        if (frameLayout2 != null) {
            C1221w0 c1221w02 = (C1221w0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c1221w02).width = -2;
            this.f10180D.setLayoutParams(c1221w02);
        }
    }

    @Override // n.z
    public o getItemData() {
        return this.f10181E;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        o oVar = this.f10181E;
        if (oVar != null && oVar.isCheckable() && this.f10181E.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f10176J);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z8) {
        refreshDrawableState();
        if (this.f10177A != z8) {
            this.f10177A = z8;
            this.f10185I.h(this.f10179C, 2048);
        }
    }

    public void setChecked(boolean z8) {
        int i4;
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f10179C;
        checkedTextView.setChecked(z8);
        Typeface typeface = checkedTextView.getTypeface();
        if (z8 && this.f10178B) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        checkedTextView.setTypeface(typeface, i4);
    }

    public void setHorizontalPadding(int i4) {
        setPadding(i4, getPaddingTop(), i4, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f10183G) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f10182F);
            }
            int i4 = this.f10186y;
            drawable.setBounds(0, 0, i4, i4);
        } else if (this.f10187z) {
            if (this.f10184H == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = n.f1676a;
                Drawable drawable2 = resources.getDrawable(com.buzbuz.smartautoclicker.R.drawable.navigation_empty_icon, theme);
                this.f10184H = drawable2;
                if (drawable2 != null) {
                    int i8 = this.f10186y;
                    drawable2.setBounds(0, 0, i8, i8);
                }
            }
            drawable = this.f10184H;
        }
        this.f10179C.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i4) {
        this.f10179C.setCompoundDrawablePadding(i4);
    }

    public void setIconSize(int i4) {
        this.f10186y = i4;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z8;
        this.f10182F = colorStateList;
        if (colorStateList != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f10183G = z8;
        o oVar = this.f10181E;
        if (oVar != null) {
            setIcon(oVar.getIcon());
        }
    }

    public void setMaxLines(int i4) {
        this.f10179C.setMaxLines(i4);
    }

    public void setNeedsEmptyIcon(boolean z8) {
        this.f10187z = z8;
    }

    public void setTextAppearance(int i4) {
        this.f10179C.setTextAppearance(i4);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f10179C.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f10179C.setText(charSequence);
    }
}
