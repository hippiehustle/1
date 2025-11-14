package com.google.android.material.datepicker;

import P.O;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10067d;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        v.c(null);
        if (l.Y(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.buzbuz.smartautoclicker.R.id.cancel_button);
            setNextFocusRightId(com.buzbuz.smartautoclicker.R.id.confirm_button);
        }
        this.f10067d = l.Y(getContext(), com.buzbuz.smartautoclicker.R.attr.nestedScrollable);
        O.m(this, new S.e(3));
    }

    public final o a() {
        return (o) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (o) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((o) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        o oVar = (o) super.getAdapter();
        oVar.getClass();
        int max = Math.max(oVar.a(), getFirstVisiblePosition());
        int min = Math.min(oVar.c(), getLastVisiblePosition());
        oVar.getItem(max);
        oVar.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z8, int i4, Rect rect) {
        if (z8) {
            if (i4 == 33) {
                setSelection(((o) super.getAdapter()).c());
                return;
            } else if (i4 == 130) {
                setSelection(((o) super.getAdapter()).a());
                return;
            } else {
                super.onFocusChanged(true, i4, rect);
                return;
            }
        }
        super.onFocusChanged(false, i4, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (!super.onKeyDown(i4, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((o) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i4) {
            return false;
        }
        setSelection(((o) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i4, int i8) {
        if (this.f10067d) {
            super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i4, i8);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i4) {
        if (i4 < ((o) super.getAdapter()).a()) {
            super.setSelection(((o) super.getAdapter()).a());
        } else {
            super.setSelection(i4);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (o) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof o) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), o.class.getCanonicalName()));
    }
}
