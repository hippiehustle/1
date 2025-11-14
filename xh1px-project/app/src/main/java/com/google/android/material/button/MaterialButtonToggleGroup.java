package com.google.android.material.button;

import G5.l;
import P.O;
import W5.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.datepicker.i;
import e5.AbstractC0645a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import m5.d;
import m5.e;
import m5.f;
import x5.p;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f10003n = 0;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10004d;

    /* renamed from: e, reason: collision with root package name */
    public final a f10005e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f10006f;

    /* renamed from: g, reason: collision with root package name */
    public final d f10007g;

    /* renamed from: h, reason: collision with root package name */
    public Integer[] f10008h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10009i;
    public boolean j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final int f10010l;

    /* renamed from: m, reason: collision with root package name */
    public HashSet f10011m;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(M5.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f10004d = new ArrayList();
        this.f10005e = new a(18, this);
        this.f10006f = new LinkedHashSet();
        this.f10007g = new d(0, this);
        this.f10009i = false;
        this.f10011m = new HashSet();
        TypedArray h8 = p.h(getContext(), attributeSet, AbstractC0645a.f10651v, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(h8.getBoolean(3, false));
        this.f10010l = h8.getResourceId(1, -1);
        this.k = h8.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(h8.getBoolean(0, true));
        h8.recycle();
        WeakHashMap weakHashMap = O.f4214a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (c(i4)) {
                return i4;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i4 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if ((getChildAt(i8) instanceof MaterialButton) && c(i8)) {
                i4++;
            }
        }
        return i4;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = O.f4214a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f10005e);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i4 = firstVisibleChildIndex + 1; i4 < getChildCount(); i4++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i4);
                int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i4 - 1)).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    layoutParams.setMarginEnd(0);
                    layoutParams.setMarginStart(-min);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = -min;
                    layoutParams.setMarginStart(0);
                }
                materialButton.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                } else {
                    layoutParams3.setMarginEnd(0);
                    layoutParams3.setMarginStart(0);
                    layoutParams3.leftMargin = 0;
                    layoutParams3.rightMargin = 0;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i4, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f10000r);
        l shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f10004d.add(new e(shapeAppearanceModel.f1798e, shapeAppearanceModel.f1801h, shapeAppearanceModel.f1799f, shapeAppearanceModel.f1800g));
        materialButton.setEnabled(isEnabled());
        O.m(materialButton, new i(2, this));
    }

    public final void b(int i4, boolean z8) {
        if (i4 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i4);
            return;
        }
        HashSet hashSet = new HashSet(this.f10011m);
        if (z8 && !hashSet.contains(Integer.valueOf(i4))) {
            if (this.j && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i4));
        } else if (!z8 && hashSet.contains(Integer.valueOf(i4))) {
            if (!this.k || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i4));
            }
        } else {
            return;
        }
        d(hashSet);
    }

    public final boolean c(int i4) {
        if (getChildAt(i4).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f10011m;
        this.f10011m = new HashSet(set);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            int id = ((MaterialButton) getChildAt(i4)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f10009i = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f10009i = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                boolean contains2 = set.contains(Integer.valueOf(id));
                Iterator it = this.f10006f.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).a(this, id, contains2);
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f10007g);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            treeMap.put((MaterialButton) getChildAt(i4), Integer.valueOf(i4));
        }
        this.f10008h = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        boolean z8;
        e eVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i4 = 0; i4 < childCount; i4++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i4);
            if (materialButton.getVisibility() != 8) {
                F3.f e9 = materialButton.getShapeAppearanceModel().e();
                e eVar2 = (e) this.f10004d.get(i4);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    G5.a aVar = e.f12546e;
                    if (i4 == firstVisibleChildIndex) {
                        if (z8) {
                            if (p.g(this)) {
                                eVar = new e(aVar, aVar, eVar2.f12548b, eVar2.f12549c);
                            } else {
                                eVar = new e(eVar2.f12547a, eVar2.f12550d, aVar, aVar);
                            }
                        } else {
                            eVar = new e(eVar2.f12547a, aVar, eVar2.f12548b, aVar);
                        }
                    } else if (i4 == lastVisibleChildIndex) {
                        if (z8) {
                            if (p.g(this)) {
                                eVar = new e(eVar2.f12547a, eVar2.f12550d, aVar, aVar);
                            } else {
                                eVar = new e(aVar, aVar, eVar2.f12548b, eVar2.f12549c);
                            }
                        } else {
                            eVar = new e(aVar, eVar2.f12550d, aVar, eVar2.f12549c);
                        }
                    } else {
                        eVar2 = null;
                    }
                    eVar2 = eVar;
                }
                if (eVar2 == null) {
                    e9.c(0.0f);
                } else {
                    e9.f1337i = eVar2.f12547a;
                    e9.f1338l = eVar2.f12550d;
                    e9.j = eVar2.f12548b;
                    e9.k = eVar2.f12549c;
                }
                materialButton.setShapeAppearanceModel(e9.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (this.j && !this.f10011m.isEmpty()) {
            return ((Integer) this.f10011m.iterator().next()).intValue();
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            int id = ((MaterialButton) getChildAt(i4)).getId();
            if (this.f10011m.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i4, int i8) {
        Integer[] numArr = this.f10008h;
        if (numArr != null && i8 < numArr.length) {
            return numArr[i8].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i8;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i4 = this.f10010l;
        if (i4 != -1) {
            d(Collections.singleton(Integer.valueOf(i4)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i4;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.j) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i4));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i8) {
        e();
        a();
        super.onMeasure(i4, i8);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f10004d.remove(indexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            ((MaterialButton) getChildAt(i4)).setEnabled(z8);
        }
    }

    public void setSelectionRequired(boolean z8) {
        this.k = z8;
    }

    public void setSingleSelection(boolean z8) {
        if (this.j != z8) {
            this.j = z8;
            d(new HashSet());
        }
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            ((MaterialButton) getChildAt(i4)).setA11yClassName((this.j ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i4) {
        setSingleSelection(getResources().getBoolean(i4));
    }
}
