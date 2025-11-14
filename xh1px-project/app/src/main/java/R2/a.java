package R2;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import h4.AbstractC0832f;
import kotlin.NoWhenBranchMatchedException;
import n6.InterfaceC1163b;
import o6.j;

/* loaded from: classes.dex */
public final class a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S2.h f5003b;

    public /* synthetic */ a(S2.h hVar, int i4) {
        this.f5002a = i4;
        this.f5003b = hVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        float f8;
        float f9;
        float f10;
        float f11;
        S2.b bVar;
        switch (this.f5002a) {
            case 1:
                j.e(motionEvent, "e");
                g gVar = (g) this.f5003b;
                float x8 = motionEvent.getX();
                float y4 = motionEvent.getY();
                RectF rectF = gVar.f5032q;
                float f12 = gVar.f5024g;
                float f13 = gVar.f5025h;
                j.e(rectF, "viewArea");
                float f14 = rectF.left - f12;
                float f15 = rectF.top;
                if (S2.b.a(rectF, f12)) {
                    f8 = rectF.left + f13;
                } else {
                    f8 = rectF.left;
                }
                if (new RectF(f14, f15, f8, rectF.bottom).contains(x8, y4)) {
                    bVar = S2.e.f5320a;
                } else {
                    float f16 = rectF.left;
                    float f17 = rectF.top - f12;
                    float f18 = rectF.right;
                    if (S2.b.a(rectF, f12)) {
                        f9 = rectF.top + f13;
                    } else {
                        f9 = rectF.top;
                    }
                    if (new RectF(f16, f17, f18, f9).contains(x8, y4)) {
                        bVar = S2.g.f5322a;
                    } else {
                        if (S2.b.a(rectF, f12)) {
                            f10 = rectF.right - f13;
                        } else {
                            f10 = rectF.right;
                        }
                        if (new RectF(f10, rectF.top, rectF.right + f12, rectF.bottom).contains(x8, y4)) {
                            bVar = S2.f.f5321a;
                        } else {
                            float f19 = rectF.left;
                            if (S2.b.a(rectF, f12)) {
                                f11 = rectF.bottom - f13;
                            } else {
                                f11 = rectF.bottom;
                            }
                            if (new RectF(f19, f11, rectF.right, rectF.bottom + f12).contains(x8, y4)) {
                                bVar = S2.d.f5319a;
                            } else if (rectF.contains(x8, y4)) {
                                bVar = S2.c.f5318a;
                            } else {
                                bVar = null;
                            }
                        }
                    }
                }
                gVar.f5022e = bVar;
                if (bVar != null) {
                    return true;
                }
                return false;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
        switch (this.f5002a) {
            case 0:
                j.e(motionEvent2, "e2");
                c cVar = (c) this.f5003b;
                float f10 = -f8;
                float f11 = -f9;
                RectF rectF = cVar.f5011i;
                RectF rectF2 = cVar.f5325c;
                float width = rectF2.width() * 0.2f;
                float height = rectF2.height() * 0.2f;
                if (f10 > 0.0f && rectF.left + f10 > rectF2.right - width) {
                    f10 = Math.min(0.0f, f10);
                } else if (f10 < 0.0f && rectF.right + f10 < rectF2.left + width) {
                    f10 = Math.max(0.0f, f10);
                }
                if (f11 > 0.0f && rectF.top + f11 > rectF2.bottom - height) {
                    f11 = Math.min(0.0f, f11);
                } else if (f11 < 0.0f && rectF.bottom - f11 < rectF2.top + height) {
                    f11 = Math.max(0.0f, f11);
                }
                AbstractC0832f.F(rectF, f10, f11);
                N2.c cVar2 = cVar.k;
                if (cVar2 != null) {
                    cVar2.m(rectF);
                }
                cVar.a();
                return true;
            default:
                j.e(motionEvent2, "e2");
                g gVar = (g) this.f5003b;
                S2.b bVar = gVar.f5022e;
                if (bVar == null) {
                    return false;
                }
                float f12 = -f8;
                float f13 = -f9;
                RectF rectF3 = gVar.f5036u;
                PointF pointF = gVar.f5030o;
                RectF rectF4 = gVar.f5031p;
                if (bVar.equals(S2.e.f5320a)) {
                    rectF4.left = Math.min(rectF4.left + f12, rectF4.right - pointF.x);
                } else if (bVar.equals(S2.g.f5322a)) {
                    rectF4.top = Math.min(rectF4.top + f13, rectF4.bottom - pointF.y);
                } else if (bVar.equals(S2.f.f5321a)) {
                    rectF4.right = Math.max(rectF4.right + f12, rectF4.left + pointF.x);
                } else if (bVar.equals(S2.d.f5319a)) {
                    rectF4.bottom = Math.max(rectF4.bottom + f13, rectF4.top + pointF.y);
                } else if (bVar.equals(S2.c.f5318a)) {
                    rectF3.set(rectF4);
                    AbstractC0832f.F(rectF3, f12, f13);
                    if (gVar.f5325c.contains(rectF3)) {
                        rectF4.set(rectF3);
                    }
                } else {
                    if (!bVar.equals(S2.j.f5326a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return true;
                }
                gVar.g();
                InterfaceC1163b interfaceC1163b = gVar.f5035t;
                if (interfaceC1163b != null) {
                    Rect rect = new Rect();
                    rectF4.roundOut(rect);
                    interfaceC1163b.m(rect);
                }
                gVar.a();
                return true;
        }
    }
}
