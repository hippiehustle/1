package com.google.android.material.progressindicator;

import C5.d;
import C5.h;
import C5.i;
import C5.k;
import C5.m;
import G.n;
import K0.o;
import K0.p;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.buzbuz.smartautoclicker.R;

/* loaded from: classes.dex */
public class CircularProgressIndicator extends d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [C5.q, java.lang.Object, android.graphics.drawable.Drawable, C5.m] */
    /* JADX WARN: Type inference failed for: r6v1, types: [C5.e, java.lang.Object, C5.o] */
    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i iVar = this.f647d;
        ?? obj = new Object();
        obj.f705a = iVar;
        Context context2 = getContext();
        h hVar = new h(iVar);
        ?? mVar = new m(context2, iVar);
        mVar.f708o = obj;
        mVar.f709p = hVar;
        hVar.f706a = mVar;
        Resources resources = context2.getResources();
        p pVar = new p();
        ThreadLocal threadLocal = n.f1676a;
        pVar.f2544d = resources.getDrawable(R.drawable.indeterminate_static, null);
        new o(pVar.f2544d.getConstantState());
        mVar.f710q = pVar;
        setIndeterminateDrawable(mVar);
        setProgressDrawable(new k(getContext(), iVar, obj));
    }

    public int getIndicatorDirection() {
        return this.f647d.j;
    }

    public int getIndicatorInset() {
        return this.f647d.f684i;
    }

    public int getIndicatorSize() {
        return this.f647d.f683h;
    }

    public void setIndicatorDirection(int i4) {
        this.f647d.j = i4;
        invalidate();
    }

    public void setIndicatorInset(int i4) {
        i iVar = this.f647d;
        if (iVar.f684i != i4) {
            iVar.f684i = i4;
            invalidate();
        }
    }

    public void setIndicatorSize(int i4) {
        int max = Math.max(i4, getTrackThickness() * 2);
        i iVar = this.f647d;
        if (iVar.f683h != max) {
            iVar.f683h = max;
            iVar.a();
            requestLayout();
            invalidate();
        }
    }

    @Override // C5.d
    public void setTrackThickness(int i4) {
        super.setTrackThickness(i4);
        this.f647d.a();
    }
}
