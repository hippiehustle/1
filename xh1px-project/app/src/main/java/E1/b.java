package E1;

import A1.e;
import H1.d;
import L5.i;
import Z.g;
import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import n6.InterfaceC1164c;
import o6.j;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1155e;

    public /* synthetic */ b(int i4, Object obj) {
        this.f1154d = i4;
        this.f1155e = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f1154d) {
            case 0:
                c cVar = (c) this.f1155e;
                j.e(view, "<unused var>");
                j.e(motionEvent, "event");
                d dVar = cVar.f1174z;
                if (dVar != null) {
                    if (dVar.f1892e) {
                        return false;
                    }
                    A4.c cVar2 = cVar.f1156A;
                    if (cVar2 != null) {
                        ViewGroup viewGroup = cVar.f1171w;
                        if (viewGroup != null) {
                            int action = motionEvent.getAction();
                            if (action != 0) {
                                if (action != 2) {
                                    return false;
                                }
                                ((e) cVar2.f291e).m(new Point((((int) motionEvent.getRawX()) - ((Point) cVar2.f293g).x) + ((Point) cVar2.f292f).x, (((int) motionEvent.getRawY()) - ((Point) cVar2.f293g).y) + ((Point) cVar2.f292f).y));
                            } else {
                                viewGroup.performHapticFeedback(0);
                                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                                j.c(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                                WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                                cVar2.f292f = new Point(layoutParams2.x, layoutParams2.y);
                                cVar2.f293g = new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                            }
                            return true;
                        }
                        j.i("menuLayout");
                        throw null;
                    }
                    j.i("moveTouchEventHandler");
                    throw null;
                }
                j.i("resizeController");
                throw null;
            case 1:
                i iVar = (i) this.f1155e;
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - iVar.f2958o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        iVar.f2956m = false;
                    }
                    iVar.u();
                    iVar.f2956m = true;
                    iVar.f2958o = System.currentTimeMillis();
                }
                return false;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                if (((GestureDetector) this.f1155e).onTouchEvent(motionEvent)) {
                    view.performClick();
                    return true;
                }
                return false;
            default:
                return ((Boolean) ((InterfaceC1164c) this.f1155e).l(view, motionEvent)).booleanValue();
        }
    }
}
