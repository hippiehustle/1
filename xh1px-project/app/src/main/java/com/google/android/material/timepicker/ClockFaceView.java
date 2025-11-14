package com.google.android.material.timepicker;

import A.k;
import A.l;
import A.p;
import P.O;
import a.AbstractC0405a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.buzbuz.smartautoclicker.R;
import e5.AbstractC0645a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
class ClockFaceView extends e implements d {

    /* renamed from: A, reason: collision with root package name */
    public final SparseArray f10315A;

    /* renamed from: B, reason: collision with root package name */
    public final c f10316B;

    /* renamed from: C, reason: collision with root package name */
    public final int[] f10317C;

    /* renamed from: D, reason: collision with root package name */
    public final float[] f10318D;

    /* renamed from: E, reason: collision with root package name */
    public final int f10319E;

    /* renamed from: F, reason: collision with root package name */
    public final int f10320F;

    /* renamed from: G, reason: collision with root package name */
    public final int f10321G;

    /* renamed from: H, reason: collision with root package name */
    public final int f10322H;

    /* renamed from: I, reason: collision with root package name */
    public final String[] f10323I;

    /* renamed from: J, reason: collision with root package name */
    public float f10324J;
    public final ColorStateList K;

    /* renamed from: w, reason: collision with root package name */
    public final ClockHandView f10325w;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f10326x;

    /* renamed from: y, reason: collision with root package name */
    public final RectF f10327y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f10328z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10326x = new Rect();
        this.f10327y = new RectF();
        this.f10328z = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f10315A = sparseArray;
        this.f10318D = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0645a.f10641l, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList C8 = AbstractC0405a.C(context, obtainStyledAttributes, 1);
        this.K = C8;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f10325w = clockHandView;
        this.f10319E = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = C8.getColorForState(new int[]{android.R.attr.state_selected}, C8.getDefaultColor());
        this.f10317C = new int[]{colorForState, colorForState, C8.getDefaultColor()};
        clockHandView.f10331f.add(this);
        int defaultColor = AbstractC1492c.o(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList C9 = AbstractC0405a.C(context, obtainStyledAttributes, 0);
        setBackgroundColor(C9 != null ? C9.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f10316B = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f10323I = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z8 = false;
        for (int i4 = 0; i4 < Math.max(this.f10323I.length, size); i4++) {
            TextView textView = (TextView) sparseArray.get(i4);
            if (i4 >= this.f10323I.length) {
                removeView(textView);
                sparseArray.remove(i4);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i4, textView);
                    addView(textView);
                }
                textView.setText(this.f10323I[i4]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i4));
                int i8 = (i4 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i8));
                z8 = i8 > 1 ? true : z8;
                O.m(textView, this.f10316B);
                textView.setTextColor(this.K);
            }
        }
        ClockHandView clockHandView2 = this.f10325w;
        if (clockHandView2.f10330e && !z8) {
            clockHandView2.f10339p = 1;
        }
        clockHandView2.f10330e = z8;
        clockHandView2.invalidate();
        this.f10320F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f10321G = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f10322H = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.e
    public final void d() {
        int i4;
        p pVar = new p();
        pVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i9 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i9 == null) {
                    i9 = 1;
                }
                if (!hashMap.containsKey(i9)) {
                    hashMap.put(i9, new ArrayList());
                }
                ((List) hashMap.get(i9)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i4 = Math.round(this.f10346u * 0.66f);
            } else {
                i4 = this.f10346u;
            }
            Iterator it = list.iterator();
            float f8 = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer valueOf = Integer.valueOf(id);
                HashMap hashMap2 = pVar.f177c;
                if (!hashMap2.containsKey(valueOf)) {
                    hashMap2.put(Integer.valueOf(id), new k());
                }
                l lVar = ((k) hashMap2.get(Integer.valueOf(id))).f93d;
                lVar.f149w = R.id.circle_center;
                lVar.f150x = i4;
                lVar.f151y = f8;
                f8 += 360.0f / list.size();
            }
        }
        pVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f10315A;
            if (i10 < sparseArray.size()) {
                ((TextView) sparseArray.get(i10)).setVisibility(0);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        boolean z8;
        RadialGradient radialGradient;
        RectF rectF2 = this.f10325w.j;
        float f8 = Float.MAX_VALUE;
        TextView textView = null;
        int i4 = 0;
        while (true) {
            sparseArray = this.f10315A;
            int size = sparseArray.size();
            rect = this.f10326x;
            rectF = this.f10327y;
            if (i4 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i4);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f8) {
                    textView = textView2;
                    f8 = height;
                }
            }
            i4++;
        }
        for (int i8 = 0; i8 < sparseArray.size(); i8++) {
            TextView textView3 = (TextView) sparseArray.get(i8);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                textView3.setSelected(z8);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f10328z);
                rectF.inset(r8.left, r8.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f10317C, this.f10318D, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f10323I.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        super.onLayout(z8, i4, i8, i9, i10);
        e();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i4, int i8) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f10322H / Math.max(Math.max(this.f10320F / displayMetrics.heightPixels, this.f10321G / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
