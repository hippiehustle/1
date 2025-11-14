package D4;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: D4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029e extends View {

    /* renamed from: d, reason: collision with root package name */
    public final Paint f949d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f950e;

    /* renamed from: f, reason: collision with root package name */
    public final int f951f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f952g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f953h;

    public C0029e(Context context) {
        super(context);
        Paint paint = new Paint();
        paint.setColor(-16711936);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(10.0f);
        this.f949d = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-65536);
        paint2.setStyle(style);
        paint2.setStrokeWidth(10.0f);
        this.f950e = paint2;
        this.f951f = 10;
        this.f952g = new ArrayList();
        this.f953h = new ArrayList();
    }

    public final void a(List list) {
        Paint paint;
        ArrayList arrayList = this.f952g;
        if (!o6.j.a(arrayList, list)) {
            arrayList.clear();
            arrayList.addAll(list);
        }
        ArrayList arrayList2 = this.f953h;
        arrayList2.clear();
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0030f c0030f = (C0030f) it.next();
                if (c0030f.f954a) {
                    paint = this.f949d;
                } else {
                    paint = this.f950e;
                }
                Rect rect = c0030f.f955b;
                int i4 = rect.left;
                int i8 = this.f951f;
                arrayList2.add(new Z5.j(paint, new Rect(i4 - i8, rect.top - i8, rect.right + i8, rect.bottom + i8)));
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o6.j.e(canvas, "canvas");
        super.onDraw(canvas);
        Iterator it = this.f953h.iterator();
        while (it.hasNext()) {
            Z5.j jVar = (Z5.j) it.next();
            canvas.drawRect((Rect) jVar.f7486e, (Paint) jVar.f7485d);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i8, int i9, int i10) {
        a(this.f952g);
        super.onSizeChanged(i4, i8, i9, i10);
    }

    public final void setResults(List<C0030f> list) {
        o6.j.e(list, "newResults");
        a(list);
        postInvalidate();
    }
}
