package R2;

import S2.i;
import Z5.o;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import o6.j;

/* loaded from: classes.dex */
public final class e extends S2.h {

    /* renamed from: d, reason: collision with root package name */
    public final f f5014d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f5015e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f5016f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f5017g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f5018h;

    public e(f fVar, i iVar) {
        super(fVar, iVar);
        this.f5014d = fVar;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        int i4 = fVar.f5019f;
        paint.setColor(i4);
        paint.setStrokeWidth(fVar.f5020g * 2);
        this.f5015e = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(i4);
        this.f5016f = paint2;
        this.f5017g = new ArrayList();
        this.f5018h = new ArrayList();
    }

    @Override // S2.h
    public final void b(Canvas canvas) {
        ArrayList arrayList = this.f5018h;
        boolean isEmpty = arrayList.isEmpty();
        Paint paint = this.f5015e;
        ArrayList arrayList2 = this.f5017g;
        if (isEmpty && arrayList2.size() == 1) {
            canvas.drawRect((Rect) arrayList2.get(0), paint);
            return;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            canvas.drawRect((Rect) it.next(), this.f5016f);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            o oVar = (o) it2.next();
            canvas.drawArc((RectF) oVar.f7494d, ((Number) oVar.f7495e).floatValue(), ((Number) oVar.f7496f).floatValue(), false, paint);
        }
    }

    @Override // S2.h
    public final void c() {
        Object obj;
        int i4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f8;
        float f9;
        ArrayList arrayList = this.f5017g;
        arrayList.clear();
        ArrayList arrayList2 = this.f5018h;
        arrayList2.clear();
        f fVar = this.f5014d;
        Y1.b bVar = ((Y1.d) fVar.f1023e).f7104e;
        j.e(bVar, "<this>");
        Point point = bVar.f7094a;
        Map map = bVar.f7097d;
        if (!map.isEmpty()) {
            Iterator it = map.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((Y1.e) obj) != null) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                Y1.a aVar = Y1.a.f7089d;
                Y1.e eVar = (Y1.e) map.get(aVar);
                if (eVar != null) {
                    i4 = eVar.f7105a.y;
                } else {
                    i4 = 0;
                }
                int i15 = fVar.f5020g;
                Y1.a aVar2 = Y1.a.f7091f;
                Y1.e eVar2 = (Y1.e) map.get(aVar2);
                if (eVar2 != null) {
                    i8 = eVar2.f7105a.y;
                } else {
                    i8 = point.y;
                }
                arrayList.add(new Rect(0, i4, i15, i8));
                Y1.e eVar3 = (Y1.e) map.get(aVar);
                if (eVar3 != null) {
                    i9 = eVar3.f7105a.x;
                } else {
                    i9 = 0;
                }
                Y1.a aVar3 = Y1.a.f7090e;
                Y1.e eVar4 = (Y1.e) map.get(aVar3);
                if (eVar4 != null) {
                    i10 = eVar4.f7105a.x;
                } else {
                    i10 = point.x;
                }
                arrayList.add(new Rect(i9, 0, i10, i15));
                int i16 = point.x - i15;
                Y1.e eVar5 = (Y1.e) map.get(aVar3);
                if (eVar5 != null) {
                    i11 = eVar5.f7105a.y;
                } else {
                    i11 = 0;
                }
                int i17 = point.x;
                Y1.a aVar4 = Y1.a.f7092g;
                Y1.e eVar6 = (Y1.e) map.get(aVar4);
                if (eVar6 != null) {
                    i12 = eVar6.f7105a.y;
                } else {
                    i12 = point.y;
                }
                arrayList.add(new Rect(i16, i11, i17, i12));
                Y1.e eVar7 = (Y1.e) map.get(aVar2);
                if (eVar7 != null) {
                    i13 = eVar7.f7105a.x;
                } else {
                    i13 = 0;
                }
                int i18 = point.y - i15;
                Y1.e eVar8 = (Y1.e) map.get(aVar4);
                if (eVar8 != null) {
                    i14 = eVar8.f7105a.x;
                } else {
                    i14 = point.y;
                }
                arrayList.add(new Rect(i13, i18, i14, point.y));
                Float valueOf = Float.valueOf(90.0f);
                float f10 = point.x;
                float f11 = point.y;
                Y1.e eVar9 = (Y1.e) map.get(aVar);
                if (eVar9 != null) {
                    Point point2 = eVar9.f7105a;
                    f9 = 4.0f;
                    f8 = 2.0f;
                    int i19 = fVar.f5020g;
                    arrayList2.add(new o(new RectF(0.0f, 0.0f, (i19 * 4.0f) + (point2.x * 2.0f), (i19 * 4.0f) + (point2.y * 2.0f)), Float.valueOf(180.0f), valueOf));
                } else {
                    f8 = 2.0f;
                    f9 = 4.0f;
                }
                Y1.e eVar10 = (Y1.e) map.get(aVar3);
                if (eVar10 != null) {
                    Point point3 = eVar10.f7105a;
                    int i20 = fVar.f5020g;
                    arrayList2.add(new o(new RectF(f10 - ((i20 * f9) + ((f10 - point3.x) * f8)), 0.0f, f10, (i20 * f9) + (point3.y * f8)), Float.valueOf(270.0f), valueOf));
                }
                Y1.e eVar11 = (Y1.e) map.get(aVar4);
                if (eVar11 != null) {
                    Point point4 = eVar11.f7105a;
                    int i21 = fVar.f5020g;
                    arrayList2.add(new o(new RectF(f10 - ((i21 * f9) + ((f10 - point4.x) * f8)), f11 - ((i21 * f9) + ((f11 - point4.y) * f8)), f10, f11), Float.valueOf(0.0f), valueOf));
                }
                Y1.e eVar12 = (Y1.e) map.get(aVar2);
                if (eVar12 != null) {
                    Point point5 = eVar12.f7105a;
                    int i22 = fVar.f5020g;
                    arrayList2.add(new o(new RectF(0.0f, f11 - ((i22 * f9) + ((f11 - point5.y) * f8)), (i22 * f9) + (point5.x * f8), f11), valueOf, valueOf));
                    return;
                }
                return;
            }
        }
        arrayList.add(new Rect(0, 0, point.x, point.y));
    }
}
