package L5;

import P.O;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import g0.AbstractComponentCallbacksC0755y;
import g0.T;
import i.K;
import java.util.WeakHashMap;
import o.C1213s0;
import t0.AbstractC1529C;
import t0.AbstractC1537c0;
import t0.C1530D;
import t0.C1554u;
import t0.s0;

/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3046e;

    public /* synthetic */ x(int i4, Object obj) {
        this.f3045d = i4;
        this.f3046e = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        n.m mVar;
        int i4;
        int i8;
        s0 s0Var;
        int i9 = this.f3045d;
        long j = 0;
        int i10 = 0;
        Object obj = this.f3046e;
        switch (i9) {
            case 0:
                CheckableImageButton checkableImageButton = ((TextInputLayout) obj).f10274f.j;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 1:
                S.d dVar = (S.d) obj;
                C1213s0 c1213s0 = dVar.f5154f;
                S.a aVar = dVar.f5152d;
                if (dVar.f5164r) {
                    if (dVar.f5162p) {
                        dVar.f5162p = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f5146e = currentAnimationTimeMillis;
                        aVar.f5148g = -1L;
                        aVar.f5147f = currentAnimationTimeMillis;
                        aVar.f5149h = 0.5f;
                    }
                    if ((aVar.f5148g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f5148g + aVar.f5150i) || !dVar.e()) {
                        dVar.f5164r = false;
                        return;
                    }
                    if (dVar.f5163q) {
                        dVar.f5163q = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        c1213s0.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f5147f != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a3 = aVar.a(currentAnimationTimeMillis2);
                        long j5 = currentAnimationTimeMillis2 - aVar.f5147f;
                        aVar.f5147f = currentAnimationTimeMillis2;
                        dVar.f5166t.scrollListBy((int) (((float) j5) * ((a3 * 4.0f) + ((-4.0f) * a3 * a3)) * aVar.f5145d));
                        WeakHashMap weakHashMap = O.f4214a;
                        c1213s0.postOnAnimation(this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                ((W.e) obj).n(0);
                return;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                try {
                    c.l.h((c.l) obj);
                    return;
                } catch (IllegalStateException e9) {
                    if (TextUtils.equals(e9.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        return;
                    } else {
                        throw e9;
                    }
                } catch (NullPointerException e10) {
                    if (!TextUtils.equals(e10.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e10;
                    }
                    return;
                }
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                g0.r rVar = (g0.r) obj;
                rVar.f11055f0.onDismiss(rVar.f11062n0);
                return;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = (AbstractComponentCallbacksC0755y) obj;
                if (abstractComponentCallbacksC0755y.f11097N != null) {
                    abstractComponentCallbacksC0755y.h().getClass();
                    return;
                }
                return;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                ((T) obj).A(true);
                return;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                K k = (K) obj;
                Window.Callback callback = k.f11615c;
                Menu B8 = k.B();
                if (B8 instanceof n.m) {
                    mVar = (n.m) B8;
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    mVar.w();
                }
                try {
                    B8.clear();
                    if (callback.onCreatePanelMenu(0, B8)) {
                        if (!callback.onPreparePanel(0, null, B8)) {
                        }
                        if (mVar == null) {
                            mVar.v();
                            return;
                        }
                        return;
                    }
                    B8.clear();
                    if (mVar == null) {
                    }
                } catch (Throwable th) {
                    if (mVar != null) {
                        mVar.v();
                    }
                    throw th;
                }
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                H5.g gVar = (H5.g) obj;
                gVar.f2033c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) gVar.f2035e;
                W.e eVar = bottomSheetBehavior.f9947M;
                if (eVar != null && eVar.f()) {
                    gVar.a(gVar.f2032b);
                    return;
                } else {
                    if (bottomSheetBehavior.f9946L == 2) {
                        bottomSheetBehavior.J(gVar.f2032b);
                        return;
                    }
                    return;
                }
            case 9:
                C1213s0 c1213s02 = (C1213s0) obj;
                c1213s02.f13378o = null;
                c1213s02.drawableStateChanged();
                return;
            case 10:
                ((Toolbar) obj).v();
                return;
            case 11:
                C1554u c1554u = (C1554u) obj;
                ValueAnimator valueAnimator = c1554u.f15000z;
                int i11 = c1554u.f14975A;
                if (i11 != 1) {
                    if (i11 != 2) {
                        return;
                    }
                } else {
                    valueAnimator.cancel();
                }
                c1554u.f14975A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 12:
                C1530D c1530d = (C1530D) obj;
                if (c1530d.f14709c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j8 = c1530d.f14706B;
                    if (j8 != Long.MIN_VALUE) {
                        j = currentTimeMillis - j8;
                    }
                    long j9 = j;
                    AbstractC1537c0 layoutManager = c1530d.f14722r.getLayoutManager();
                    if (c1530d.f14705A == null) {
                        c1530d.f14705A = new Rect();
                    }
                    View view = c1530d.f14709c.f14950a;
                    Rect rect = c1530d.f14705A;
                    RecyclerView recyclerView = layoutManager.f14811b;
                    if (recyclerView == null) {
                        rect.set(0, 0, 0, 0);
                    } else {
                        rect.set(recyclerView.P(view));
                    }
                    if (layoutManager.d()) {
                        int i12 = (int) (c1530d.j + c1530d.f14714h);
                        int paddingLeft = (i12 - c1530d.f14705A.left) - c1530d.f14722r.getPaddingLeft();
                        float f8 = c1530d.f14714h;
                        if ((f8 < 0.0f && paddingLeft < 0) || (f8 > 0.0f && (paddingLeft = ((c1530d.f14709c.f14950a.getWidth() + i12) + c1530d.f14705A.right) - (c1530d.f14722r.getWidth() - c1530d.f14722r.getPaddingRight())) > 0)) {
                            i4 = paddingLeft;
                            if (layoutManager.e()) {
                                int i13 = (int) (c1530d.k + c1530d.f14715i);
                                int paddingTop = (i13 - c1530d.f14705A.top) - c1530d.f14722r.getPaddingTop();
                                float f9 = c1530d.f14715i;
                                if ((f9 < 0.0f && paddingTop < 0) || (f9 > 0.0f && (paddingTop = ((c1530d.f14709c.f14950a.getHeight() + i13) + c1530d.f14705A.bottom) - (c1530d.f14722r.getHeight() - c1530d.f14722r.getPaddingBottom())) > 0)) {
                                    i10 = paddingTop;
                                }
                            }
                            if (i4 != 0) {
                                AbstractC1529C abstractC1529C = c1530d.f14717m;
                                RecyclerView recyclerView2 = c1530d.f14722r;
                                int width = c1530d.f14709c.f14950a.getWidth();
                                c1530d.f14722r.getWidth();
                                i4 = abstractC1529C.d(recyclerView2, width, i4, j9);
                            }
                            i8 = i4;
                            if (i10 == 0) {
                                AbstractC1529C abstractC1529C2 = c1530d.f14717m;
                                RecyclerView recyclerView3 = c1530d.f14722r;
                                int height = c1530d.f14709c.f14950a.getHeight();
                                c1530d.f14722r.getHeight();
                                i10 = abstractC1529C2.d(recyclerView3, height, i10, j9);
                            }
                            if (i8 != 0 && i10 == 0) {
                                c1530d.f14706B = Long.MIN_VALUE;
                                return;
                            }
                            if (c1530d.f14706B == Long.MIN_VALUE) {
                                c1530d.f14706B = currentTimeMillis;
                            }
                            c1530d.f14722r.scrollBy(i8, i10);
                            s0Var = c1530d.f14709c;
                            if (s0Var != null) {
                                c1530d.o(s0Var);
                            }
                            c1530d.f14722r.removeCallbacks(c1530d.f14723s);
                            RecyclerView recyclerView4 = c1530d.f14722r;
                            WeakHashMap weakHashMap2 = O.f4214a;
                            recyclerView4.postOnAnimation(this);
                            return;
                        }
                    }
                    i4 = 0;
                    if (layoutManager.e()) {
                    }
                    if (i4 != 0) {
                    }
                    i8 = i4;
                    if (i10 == 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (c1530d.f14706B == Long.MIN_VALUE) {
                    }
                    c1530d.f14722r.scrollBy(i8, i10);
                    s0Var = c1530d.f14709c;
                    if (s0Var != null) {
                    }
                    c1530d.f14722r.removeCallbacks(c1530d.f14723s);
                    RecyclerView recyclerView42 = c1530d.f14722r;
                    WeakHashMap weakHashMap22 = O.f4214a;
                    recyclerView42.postOnAnimation(this);
                    return;
                }
                return;
            default:
                ((StaggeredGridLayoutManager) obj).I0();
                return;
        }
    }
}
