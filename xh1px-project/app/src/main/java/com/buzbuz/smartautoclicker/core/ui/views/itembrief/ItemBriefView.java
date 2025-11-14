package com.buzbuz.smartautoclicker.core.ui.views.itembrief;

import A4.d;
import B1.f;
import C5.p;
import P2.a;
import Q2.b;
import Q2.c;
import Q2.e;
import Q2.h;
import Q2.k;
import Q2.l;
import Q2.m;
import Q2.o;
import Z.g;
import Z5.n;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.buzbuz.smartautoclicker.R;
import h4.AbstractC0832f;
import java.util.Objects;
import kotlin.Metadata;
import n6.InterfaceC1163b;
import o6.j;
import s3.AbstractC1492c;
import z2.AbstractC1854a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/buzbuz/smartautoclicker/core/ui/views/itembrief/ItemBriefView;", "Landroid/view/View;", "LY1/d;", "e", "LZ5/g;", "getDisplayConfigManager", "()LY1/d;", "displayConfigManager", "Lkotlin/Function1;", "Landroid/graphics/PointF;", "LZ5/y;", "h", "Ln6/b;", "getOnTouchListener", "()Ln6/b;", "setOnTouchListener", "(Ln6/b;)V", "onTouchListener", "ui_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ItemBriefView extends View {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f9790i = 0;

    /* renamed from: d, reason: collision with root package name */
    public final d f9791d;

    /* renamed from: e, reason: collision with root package name */
    public final n f9792e;

    /* renamed from: f, reason: collision with root package name */
    public p f9793f;

    /* renamed from: g, reason: collision with root package name */
    public a f9794g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public InterfaceC1163b onTouchListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemBriefView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.e(context, "context");
        this.f9792e = new n(new f(context, 2));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1854a.f16625e, R.attr.itemBriefStyle, 0);
            j.d(obtainStyledAttributes, "obtainStyledAttributes(...)");
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, 4);
            float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(6, 30);
            float dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(5, 4);
            float dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(4, 2);
            int color = obtainStyledAttributes.getColor(1, -1);
            int color2 = obtainStyledAttributes.getColor(0, 0);
            int color3 = obtainStyledAttributes.getColor(2, -65536);
            float f8 = dimensionPixelSize3 / 2.0f;
            d dVar = new d(new b(color2, AbstractC1492c.C(color3, dimensionPixelSize), AbstractC1492c.B(color, null), dimensionPixelSize2, dimensionPixelSize3), new o(color2, AbstractC1492c.B(color, Float.valueOf(f8)), AbstractC1492c.C(color3, dimensionPixelSize), AbstractC1492c.C(obtainStyledAttributes.getColor(3, -16711936), dimensionPixelSize), AbstractC1492c.B(color, null), AbstractC1492c.B(color, null), dimensionPixelSize2, dimensionPixelSize3), new l(color2, AbstractC1492c.C(color3, dimensionPixelSize), AbstractC1492c.B(color, Float.valueOf(f8)), dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3), new h(color2, color3, (int) dimensionPixelSize, dimensionPixelSize4), new e(color2, color3, dimensionPixelSize2, AbstractC1492c.C(color3, dimensionPixelSize)), 10);
            obtainStyledAttributes.recycle();
            this.f9791d = dVar;
            return;
        }
        throw new IllegalArgumentException("AttributeSet is null");
    }

    private final Y1.d getDisplayConfigManager() {
        return (Y1.d) this.f9792e.getValue();
    }

    public final void a(a aVar, boolean z8) {
        boolean z9;
        p pVar;
        if (j.a(this.f9794g, aVar)) {
            return;
        }
        a aVar2 = this.f9794g;
        this.f9794g = aVar;
        if (this.f9793f != null && aVar2 != null && aVar != null && aVar2.getClass().equals(aVar.getClass())) {
            z9 = true;
        } else {
            z9 = false;
        }
        p pVar2 = this.f9793f;
        if (pVar2 != null) {
            pVar2.p();
        }
        if (!z9) {
            a aVar3 = this.f9794g;
            boolean z10 = aVar3 instanceof c;
            d dVar = this.f9791d;
            if (z10) {
                pVar = new Q2.a(this, (b) dVar.f295e);
            } else if (aVar3 instanceof Q2.p) {
                pVar = new Q2.n(this, (o) dVar.f296f);
            } else if (aVar3 instanceof m) {
                pVar = new k(this, (l) dVar.f297g);
            } else if (aVar3 instanceof Q2.j) {
                pVar = new Q2.g(this, (h) dVar.f298h, getDisplayConfigManager());
            } else if (aVar3 instanceof Q2.f) {
                pVar = new Q2.d(this, (e) dVar.f299i);
            } else {
                pVar = null;
            }
            this.f9793f = pVar;
            Objects.toString(pVar);
        }
        p pVar3 = this.f9793f;
        if (pVar3 != null && aVar != null) {
            pVar3.o(aVar, z8);
            invalidate();
        } else {
            invalidate();
        }
    }

    public final InterfaceC1163b getOnTouchListener() {
        return this.onTouchListener;
    }

    @Override // android.view.View
    public final void invalidate() {
        p pVar = this.f9793f;
        if (pVar != null) {
            pVar.n();
        }
        super.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        j.e(canvas, "canvas");
        super.onDraw(canvas);
        p pVar = this.f9793f;
        if (pVar != null) {
            pVar.m(canvas);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i8, int i9, int i10) {
        super.onSizeChanged(i4, i8, i9, i10);
        if (i4 == i9 && i8 == i10) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC1163b interfaceC1163b;
        if (motionEvent == null || (interfaceC1163b = this.onTouchListener) == null) {
            return false;
        }
        interfaceC1163b.m(new PointF(AbstractC0832f.e(motionEvent.getX(), 0.0f, getWidth()), AbstractC0832f.e(motionEvent.getY(), 0.0f, getHeight())));
        return true;
    }

    public final void setOnTouchListener(InterfaceC1163b interfaceC1163b) {
        this.onTouchListener = interfaceC1163b;
    }
}
