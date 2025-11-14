package com.google.android.material.appbar;

import G5.h;
import P.F;
import P.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.buzbuz.smartautoclicker.R;
import e5.AbstractC0645a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import n.m;
import u6.AbstractC1638C;
import x5.p;
import x5.q;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: f0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f9905f0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: a0, reason: collision with root package name */
    public Integer f9906a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f9907b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f9908c0;

    /* renamed from: d0, reason: collision with root package name */
    public ImageView.ScaleType f9909d0;

    /* renamed from: e0, reason: collision with root package name */
    public Boolean f9910e0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(M5.a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        ColorStateList i4;
        Context context2 = getContext();
        TypedArray h8 = p.h(context2, attributeSet, AbstractC0645a.f10618G, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (h8.hasValue(2)) {
            setNavigationIconTint(h8.getColor(2, -1));
        }
        this.f9907b0 = h8.getBoolean(4, false);
        this.f9908c0 = h8.getBoolean(3, false);
        int i8 = h8.getInt(1, -1);
        if (i8 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f9905f0;
            if (i8 < scaleTypeArr.length) {
                this.f9909d0 = scaleTypeArr[i8];
            }
        }
        if (h8.hasValue(0)) {
            this.f9910e0 = Boolean.valueOf(h8.getBoolean(0, false));
        }
        h8.recycle();
        Drawable background = getBackground();
        if (background == null) {
            i4 = ColorStateList.valueOf(0);
        } else {
            i4 = h2.a.i(background);
        }
        if (i4 != null) {
            h hVar = new h();
            hVar.m(i4);
            hVar.k(context2);
            WeakHashMap weakHashMap = O.f4214a;
            hVar.l(F.e(this));
            setBackground(hVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f9909d0;
    }

    public Integer getNavigationIconTint() {
        return this.f9906a0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i4) {
        Menu menu = getMenu();
        boolean z8 = menu instanceof m;
        if (z8) {
            ((m) menu).w();
        }
        super.m(i4);
        if (z8) {
            ((m) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof h) {
            AbstractC1638C.L(this, (h) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z8, i4, i8, i9, i10);
        q qVar = p.f16218c;
        int i11 = 0;
        ImageView imageView2 = null;
        if (this.f9907b0 || this.f9908c0) {
            ArrayList f8 = p.f(this, getTitle());
            if (f8.isEmpty()) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(f8, qVar);
            }
            ArrayList f9 = p.f(this, getSubtitle());
            if (f9.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(f9, qVar);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i12 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i13 = 0; i13 < getChildCount(); i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i12 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i12 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f9907b0 && textView != null) {
                    x(textView, pair);
                }
                if (this.f9908c0 && textView2 != null) {
                    x(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i11 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i11);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i11++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f9910e0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f9909d0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        Drawable background = getBackground();
        if (background instanceof h) {
            ((h) background).l(f8);
        }
    }

    public void setLogoAdjustViewBounds(boolean z8) {
        Boolean bool = this.f9910e0;
        if (bool != null && bool.booleanValue() == z8) {
            return;
        }
        this.f9910e0 = Boolean.valueOf(z8);
        requestLayout();
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f9909d0 != scaleType) {
            this.f9909d0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f9906a0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f9906a0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i4) {
        this.f9906a0 = Integer.valueOf(i4);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z8) {
        if (this.f9908c0 != z8) {
            this.f9908c0 = z8;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z8) {
        if (this.f9907b0 != z8) {
            this.f9907b0 = z8;
            requestLayout();
        }
    }

    public final void x(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i4 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i8 = measuredWidth2 + i4;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i4, 0), Math.max(i8 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i4 += max;
            i8 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i8 - i4, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i4, textView.getTop(), i8, textView.getBottom());
    }
}
