package com.buzbuz.smartautoclicker.core.ui.views.clickoffset;

import M2.a;
import Z.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import com.buzbuz.smartautoclicker.R;
import kotlin.Metadata;
import n6.InterfaceC1163b;
import o6.j;
import z2.AbstractC1854a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR.\u0010\u0018\u001a\u0004\u0018\u00010\u00112\b\u0010\t\u001a\u0004\u0018\u00010\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R0\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/buzbuz/smartautoclicker/core/ui/views/clickoffset/ClickOffsetView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/util/Size;", "value", "m", "Landroid/util/Size;", "getViewSize", "()Landroid/util/Size;", "setViewSize", "(Landroid/util/Size;)V", "viewSize", "Landroid/graphics/PointF;", "n", "Landroid/graphics/PointF;", "getOffsetValue", "()Landroid/graphics/PointF;", "setOffsetValue", "(Landroid/graphics/PointF;)V", "offsetValue", "Lkotlin/Function1;", "LZ5/y;", "o", "Ln6/b;", "getOnOffsetChangedListener", "()Ln6/b;", "setOnOffsetChangedListener", "(Ln6/b;)V", "onOffsetChangedListener", "ui_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClickOffsetView extends AppCompatImageView {

    /* renamed from: g, reason: collision with root package name */
    public final a f9778g;

    /* renamed from: h, reason: collision with root package name */
    public final float f9779h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f9780i;
    public final Paint j;
    public final Paint k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f9781l;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public Size viewSize;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public PointF offsetValue;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public InterfaceC1163b onOffsetChangedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickOffsetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.e(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1854a.f16622b, R.attr.clickOffsetStyle, 0);
        j.d(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int color = obtainStyledAttributes.getColor(1, -65536);
        int color2 = obtainStyledAttributes.getColor(2, -16776961);
        int color3 = obtainStyledAttributes.getColor(0, -16777216);
        float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, 30);
        float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(3, 10);
        float dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(5, 4);
        a aVar = new a(color, color2, color3, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3);
        obtainStyledAttributes.recycle();
        this.f9778g = aVar;
        this.f9779h = dimensionPixelSize * 2;
        this.f9780i = new Paint();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        this.j = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(color2);
        paint2.setStrokeWidth(dimensionPixelSize3);
        this.k = paint2;
        this.viewSize = new Size(0, 0);
    }

    public final PointF getOffsetValue() {
        return this.offsetValue;
    }

    public final InterfaceC1163b getOnOffsetChangedListener() {
        return this.onOffsetChangedListener;
    }

    public final Size getViewSize() {
        return this.viewSize;
    }

    @Override // android.view.View
    public final void invalidate() {
        PointF pointF = this.offsetValue;
        if (pointF == null) {
            return;
        }
        PointF pointF2 = new PointF(pointF.x + (this.viewSize.getWidth() / 2), pointF.y + (this.viewSize.getHeight() / 2));
        this.f9781l = pointF2;
        int i4 = this.f9778g.f3331a;
        this.f9780i.setShader(new RadialGradient(pointF2.x, pointF2.y, this.f9779h, i4, Color.argb(0, Color.red(i4), Color.green(i4), Color.blue(i4)), Shader.TileMode.CLAMP));
        super.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        j.e(canvas, "canvas");
        super.onDraw(canvas);
        PointF pointF = this.f9781l;
        if (pointF != null) {
            canvas.drawCircle(pointF.x, pointF.y, this.f9779h, this.f9780i);
            float f8 = pointF.x;
            float f9 = pointF.y;
            a aVar = this.f9778g;
            canvas.drawCircle(f8, f9, aVar.f3332b, this.k);
            canvas.drawCircle(pointF.x, pointF.y, aVar.f3333c, this.j);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i8, int i9, int i10) {
        setViewSize(new Size(i4, i8));
        super.onSizeChanged(i4, i8, i9, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        setOffsetValue(new PointF(motionEvent.getX() - (this.viewSize.getWidth() / 2), motionEvent.getY() - (this.viewSize.getHeight() / 2)));
        InterfaceC1163b interfaceC1163b = this.onOffsetChangedListener;
        if (interfaceC1163b != null) {
            PointF pointF = this.offsetValue;
            j.b(pointF);
            interfaceC1163b.m(pointF);
            return true;
        }
        return true;
    }

    public final void setOffsetValue(PointF pointF) {
        this.offsetValue = pointF;
        invalidate();
    }

    public final void setOnOffsetChangedListener(InterfaceC1163b interfaceC1163b) {
        this.onOffsetChangedListener = interfaceC1163b;
    }

    public final void setViewSize(Size size) {
        j.e(size, "value");
        this.viewSize = size;
        invalidate();
    }
}
