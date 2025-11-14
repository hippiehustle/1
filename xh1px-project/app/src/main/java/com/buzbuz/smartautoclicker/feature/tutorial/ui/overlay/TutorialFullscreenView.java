package com.buzbuz.smartautoclicker.feature.tutorial.ui.overlay;

import Z.g;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.buzbuz.smartautoclicker.R;
import h4.AbstractC0832f;
import kotlin.Metadata;
import n6.InterfaceC1162a;
import o6.j;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001R.\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/buzbuz/smartautoclicker/feature/tutorial/ui/overlay/TutorialFullscreenView;", "Landroid/view/View;", "Landroid/graphics/Rect;", "value", "f", "Landroid/graphics/Rect;", "getExpectedViewPosition", "()Landroid/graphics/Rect;", "setExpectedViewPosition", "(Landroid/graphics/Rect;)V", "expectedViewPosition", "Lkotlin/Function0;", "LZ5/y;", "g", "Ln6/a;", "getOnMonitoredViewClickedListener", "()Ln6/a;", "setOnMonitoredViewClickedListener", "(Ln6/a;)V", "onMonitoredViewClickedListener", "tutorial_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TutorialFullscreenView extends View {

    /* renamed from: d, reason: collision with root package name */
    public final Paint f9848d;

    /* renamed from: e, reason: collision with root package name */
    public final Path f9849e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Rect expectedViewPosition;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public InterfaceC1162a onMonitoredViewClickedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TutorialFullscreenView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.e(context, "context");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(context.getColor(R.color.tutorial_overlay_background));
        this.f9848d = paint;
        Path path = new Path();
        path.setFillType(Path.FillType.WINDING);
        this.f9849e = path;
    }

    public final Rect getExpectedViewPosition() {
        return this.expectedViewPosition;
    }

    public final InterfaceC1162a getOnMonitoredViewClickedListener() {
        return this.onMonitoredViewClickedListener;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        measure(1073741824, 1073741824);
        Path path = this.f9849e;
        path.reset();
        path.addRect(0.0f, 0.0f, getWidth(), getHeight(), Path.Direction.CW);
        Rect rect = this.expectedViewPosition;
        if (rect == null) {
            return;
        }
        double height = rect.height() * 0.5d;
        double height2 = rect.height() * 1.5d;
        double width = rect.width();
        if (height <= width && width <= height2) {
            path.addCircle(rect.centerX(), rect.centerY(), rect.height() * 0.8f, Path.Direction.CCW);
            return;
        }
        RectF rectF = new RectF(rect);
        AbstractC0832f.z(rectF, 1.05f, new PointF(rectF.centerX(), rectF.centerY()));
        path.addRoundRect(rectF, 25.0f, 25.0f, Path.Direction.CCW);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        j.e(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPath(this.f9849e, this.f9848d);
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
        boolean z8 = false;
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            Rect rect = this.expectedViewPosition;
            if (rect != null) {
                z8 = rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            }
            if (z8) {
                InterfaceC1162a interfaceC1162a = this.onMonitoredViewClickedListener;
                if (interfaceC1162a != null) {
                    interfaceC1162a.a();
                    return true;
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setExpectedViewPosition(Rect rect) {
        if (j.a(rect, this.expectedViewPosition)) {
            return;
        }
        this.expectedViewPosition = rect;
        invalidate();
    }

    public final void setOnMonitoredViewClickedListener(InterfaceC1162a interfaceC1162a) {
        this.onMonitoredViewClickedListener = interfaceC1162a;
    }
}
