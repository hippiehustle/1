package com.google.android.material.textfield;

import G5.h;
import L5.s;
import L5.t;
import M5.a;
import a.AbstractC0405a;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.buzbuz.smartautoclicker.R;
import e5.AbstractC0645a;
import java.util.List;
import java.util.Locale;
import o.C1205o;
import o.E0;
import x5.p;

/* loaded from: classes.dex */
public class MaterialAutoCompleteTextView extends C1205o {

    /* renamed from: h, reason: collision with root package name */
    public final E0 f10233h;

    /* renamed from: i, reason: collision with root package name */
    public final AccessibilityManager f10234i;
    public final Rect j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final float f10235l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f10236m;

    /* renamed from: n, reason: collision with root package name */
    public int f10237n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f10238o;

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.j = new Rect();
        Context context2 = getContext();
        TypedArray h8 = p.h(context2, attributeSet, AbstractC0645a.f10649t, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (h8.hasValue(0) && h8.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.k = h8.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f10235l = h8.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (h8.hasValue(2)) {
            this.f10236m = ColorStateList.valueOf(h8.getColor(2, 0));
        }
        this.f10237n = h8.getColor(4, 0);
        this.f10238o = AbstractC0405a.C(context2, h8, 5);
        this.f10234i = (AccessibilityManager) context2.getSystemService("accessibility");
        E0 e02 = new E0(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f10233h = e02;
        e02.f13055B = true;
        e02.f13056C.setFocusable(true);
        e02.f13069r = this;
        e02.f13056C.setInputMethodMode(2);
        e02.o(getAdapter());
        e02.f13070s = new s(0, this);
        if (h8.hasValue(6)) {
            setSimpleItems(h8.getResourceId(6, 0));
        }
        h8.recycle();
    }

    public static void a(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object obj) {
        materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f10234i;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.f10233h.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f10236m;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b4 = b();
        if (b4 != null && b4.f10252H) {
            return b4.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.f10235l;
    }

    public int getSimpleItemSelectedColor() {
        return this.f10237n;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f10238o;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout b4 = b();
        if (b4 != null && b4.f10252H && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 == null) {
                str = "";
            } else {
                str = str2.toLowerCase(Locale.ENGLISH);
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10233h.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i8) {
        int selectedItemPosition;
        super.onMeasure(i4, i8);
        if (View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b4 = b();
            int i9 = 0;
            if (adapter != null && b4 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                E0 e02 = this.f10233h;
                if (!e02.f13056C.isShowing()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = e02.f13059f.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i10 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i9) {
                        view = null;
                        i9 = itemViewType;
                    }
                    view = adapter.getView(max, view, b4);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i10 = Math.max(i10, view.getMeasuredWidth());
                }
                Drawable background = e02.f13056C.getBackground();
                if (background != null) {
                    Rect rect = this.j;
                    background.getPadding(rect);
                    i10 += rect.left + rect.right;
                }
                i9 = b4.getEndIconView().getMeasuredWidth() + i10;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i9), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z8) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z8);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t8) {
        super.setAdapter(t8);
        this.f10233h.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        E0 e02 = this.f10233h;
        if (e02 != null) {
            e02.g(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i4) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i4));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f10236m = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof h) {
            ((h) dropDownBackground).m(this.f10236m);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f10233h.f13071t = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i4) {
        super.setRawInputType(i4);
        TextInputLayout b4 = b();
        if (b4 != null) {
            b4.s();
        }
    }

    public void setSimpleItemSelectedColor(int i4) {
        this.f10237n = i4;
        if (getAdapter() instanceof t) {
            ((t) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f10238o = colorStateList;
        if (getAdapter() instanceof t) {
            ((t) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i4) {
        setSimpleItems(getResources().getStringArray(i4));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f10233h.c();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new t(this, getContext(), this.k, strArr));
    }
}
