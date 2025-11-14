package com.google.android.material.chip;

import M5.a;
import P.O;
import X6.r;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.buzbuz.smartautoclicker.R;
import e5.AbstractC0645a;
import g0.L;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import q5.g;
import q5.h;
import q5.i;
import q5.j;
import x5.d;
import x5.p;

/* loaded from: classes.dex */
public class ChipGroup extends d {

    /* renamed from: h, reason: collision with root package name */
    public int f10063h;

    /* renamed from: i, reason: collision with root package name */
    public int f10064i;
    public i j;
    public final r k;

    /* renamed from: l, reason: collision with root package name */
    public final int f10065l;

    /* renamed from: m, reason: collision with root package name */
    public final j f10066m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(r11, attributeSet, R.attr.chipGroupStyle);
        Context a3 = a.a(context, attributeSet, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup);
        this.f16192f = false;
        TypedArray obtainStyledAttributes = a3.getTheme().obtainStyledAttributes(attributeSet, AbstractC0645a.f10646q, 0, 0);
        this.f16190d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f16191e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        r rVar = new r(2);
        this.k = rVar;
        j jVar = new j(this);
        this.f10066m = jVar;
        TypedArray h8 = p.h(getContext(), attributeSet, AbstractC0645a.j, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = h8.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(h8.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(h8.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(h8.getBoolean(5, false));
        setSingleSelection(h8.getBoolean(6, false));
        setSelectionRequired(h8.getBoolean(4, false));
        this.f10065l = h8.getResourceId(0, -1);
        h8.recycle();
        rVar.f7039f = new L(16, this);
        super.setOnHierarchyChangeListener(jVar);
        WeakHashMap weakHashMap = O.f4214a;
        setImportantForAccessibility(1);
    }

    private int getVisibleChipCount() {
        int i4 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if ((getChildAt(i8) instanceof Chip) && getChildAt(i8).getVisibility() == 0) {
                i4++;
            }
        }
        return i4;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof g)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.k.g();
    }

    public List<Integer> getCheckedChipIds() {
        return this.k.d(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f10063h;
    }

    public int getChipSpacingVertical() {
        return this.f10064i;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i4 = this.f10065l;
        if (i4 != -1) {
            r rVar = this.k;
            x5.g gVar = (x5.g) ((HashMap) rVar.f7037d).get(Integer.valueOf(i4));
            if (gVar != null && rVar.a(gVar)) {
                rVar.h();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i4;
        int i8;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f16192f) {
            i4 = getVisibleChipCount();
        } else {
            i4 = -1;
        }
        int rowCount = getRowCount();
        if (this.k.f7035b) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(rowCount, i4, false, i8));
    }

    public void setChipSpacing(int i4) {
        setChipSpacingHorizontal(i4);
        setChipSpacingVertical(i4);
    }

    public void setChipSpacingHorizontal(int i4) {
        if (this.f10063h != i4) {
            this.f10063h = i4;
            setItemSpacing(i4);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i4) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i4));
    }

    public void setChipSpacingResource(int i4) {
        setChipSpacing(getResources().getDimensionPixelOffset(i4));
    }

    public void setChipSpacingVertical(int i4) {
        if (this.f10064i != i4) {
            this.f10064i = i4;
            setLineSpacing(i4);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i4) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i4));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i4) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(h hVar) {
        if (hVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new W5.a(26, this));
        }
    }

    public void setOnCheckedStateChangeListener(i iVar) {
        this.j = iVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f10066m.f14211a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z8) {
        this.k.f7036c = z8;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i4) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i4) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // x5.d
    public void setSingleLine(boolean z8) {
        super.setSingleLine(z8);
    }

    public void setSingleSelection(boolean z8) {
        r rVar = this.k;
        if (rVar.f7035b != z8) {
            rVar.f7035b = z8;
            boolean isEmpty = ((HashSet) rVar.f7038e).isEmpty();
            Iterator it = ((HashMap) rVar.f7037d).values().iterator();
            while (it.hasNext()) {
                rVar.j((x5.g) it.next(), false);
            }
            if (isEmpty) {
                return;
            }
            rVar.h();
        }
    }

    public void setSingleLine(int i4) {
        setSingleLine(getResources().getBoolean(i4));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setSingleSelection(int i4) {
        setSingleSelection(getResources().getBoolean(i4));
    }
}
