package androidx.appcompat.view.menu;

import R.g;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import n.InterfaceC1099A;
import n.l;
import n.m;
import n.o;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements l, InterfaceC1099A, AdapterView.OnItemClickListener {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f8319e = {R.attr.background, R.attr.divider};

    /* renamed from: d, reason: collision with root package name */
    public m f8320d;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        g J6 = g.J(context, attributeSet, f8319e, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) J6.f4988f;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(J6.A(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(J6.A(1));
        }
        J6.L();
    }

    @Override // n.InterfaceC1099A
    public final void b(m mVar) {
        this.f8320d = mVar;
    }

    @Override // n.l
    public final boolean c(o oVar) {
        return this.f8320d.q(oVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j) {
        c((o) getAdapter().getItem(i4));
    }
}
