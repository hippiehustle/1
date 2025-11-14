package com.buzbuz.smartautoclicker.core.ui.views.gesturerecord;

import A.i;
import B1.f;
import C1.b;
import E2.d;
import R2.e;
import S2.a;
import S2.h;
import Z.g;
import Z5.n;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.buzbuz.smartautoclicker.R;
import java.util.List;
import kotlin.Metadata;
import n6.InterfaceC1164c;
import o6.j;
import z2.AbstractC1854a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R8\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/buzbuz/smartautoclicker/core/ui/views/gesturerecord/GestureRecordView;", "LS2/a;", "LY1/d;", "d", "LZ5/g;", "getDisplayConfigManager", "()LY1/d;", "displayConfigManager", "Lkotlin/Function2;", "LO2/c;", "", "LZ5/y;", "f", "Ln6/c;", "getGestureCaptureListener", "()Ln6/c;", "setGestureCaptureListener", "(Ln6/c;)V", "gestureCaptureListener", "", "LS2/h;", "g", "Ljava/util/List;", "getViewComponents$ui_fDroidRelease", "()Ljava/util/List;", "viewComponents", "ui_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GestureRecordView extends a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f9785h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final n f9786d;

    /* renamed from: e, reason: collision with root package name */
    public final i f9787e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public InterfaceC1164c gestureCaptureListener;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final List viewComponents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestureRecordView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.e(context, "context");
        this.f9786d = new n(new f(context, 1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1854a.f16624d, R.attr.gestureRecordStyle, 0);
        j.d(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int color = obtainStyledAttributes.getColor(1, -65536);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 30);
        obtainStyledAttributes.getDimensionPixelSize(0, 100);
        obtainStyledAttributes.recycle();
        this.f9787e = new i(19, new b(5, this));
        this.viewComponents = d.y(new e(new R2.f(getDisplayConfigManager(), color, dimensionPixelSize), this));
    }

    private final Y1.d getDisplayConfigManager() {
        return (Y1.d) this.f9786d.getValue();
    }

    public final InterfaceC1164c getGestureCaptureListener() {
        return this.gestureCaptureListener;
    }

    @Override // S2.a
    public List<h> getViewComponents$ui_fDroidRelease() {
        return this.viewComponents;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            i iVar = this.f9787e;
            b bVar = (b) iVar.f88e;
            if (motionEvent.getPointerCount() > 1) {
                iVar.f89f = null;
                return true;
            }
            if (((PointF) iVar.f89f) == null) {
                if (motionEvent.getAction() == 0) {
                    PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
                    iVar.f89f = pointF;
                    bVar.l(new O2.a(pointF, 1L), Boolean.FALSE);
                    return true;
                }
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                    iVar.f89f = null;
                    return true;
                }
                PointF pointF2 = (PointF) iVar.f89f;
                if (pointF2 != null) {
                    bVar.l(i.c(pointF2, motionEvent), Boolean.FALSE);
                    return true;
                }
            } else {
                PointF pointF3 = (PointF) iVar.f89f;
                if (pointF3 != null) {
                    iVar.f89f = null;
                    bVar.l(i.c(pointF3, motionEvent), Boolean.TRUE);
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final void setGestureCaptureListener(InterfaceC1164c interfaceC1164c) {
        this.gestureCaptureListener = interfaceC1164c;
    }
}
