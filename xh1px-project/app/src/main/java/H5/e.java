package H5;

import L5.i;
import P.V;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import t2.C1562a;
import x5.p;
import z5.C1875f;

/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2029b;

    public /* synthetic */ e(int i4, Object obj) {
        this.f2028a = i4;
        this.f2029b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2028a) {
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                ((V) this.f2029b).d();
                return;
            case 9:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2029b;
                actionBarOverlayLayout.f8389z = null;
                actionBarOverlayLayout.f8376m = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1562a c1562a;
        switch (this.f2028a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2029b;
                sideSheetBehavior.x(5);
                WeakReference weakReference = sideSheetBehavior.f10221p;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) sideSheetBehavior.f10221p.get()).requestLayout();
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                I5.e eVar = (I5.e) this.f2029b;
                ViewGroup e9 = p.e(eVar);
                if (e9 == null) {
                    c1562a = null;
                } else {
                    c1562a = new C1562a(e9);
                }
                Iterator it = eVar.f2155o.iterator();
                while (it.hasNext()) {
                    ((ViewOverlay) c1562a.f15048d).remove((N5.a) it.next());
                }
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                ((J0.p) this.f2029b).m();
                animator.removeListener(this);
                return;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                K0.f fVar = (K0.f) this.f2029b;
                ArrayList arrayList = new ArrayList(fVar.f2542h);
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((C5.c) arrayList.get(i4)).a(fVar);
                }
                return;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                i iVar = (i) this.f2029b;
                iVar.q();
                iVar.f2961r.start();
                return;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                ((ExpandableTransformationBehavior) this.f2029b).f10352b = null;
                return;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                ((V) this.f2029b).c();
                return;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                ((HideBottomViewOnScrollBehavior) this.f2029b).f9928h = null;
                return;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2029b;
                bottomSheetBehavior.J(5);
                WeakReference weakReference2 = bottomSheetBehavior.f9955U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) bottomSheetBehavior.f9955U.get()).requestLayout();
                    return;
                }
                return;
            case 9:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2029b;
                actionBarOverlayLayout.f8389z = null;
                actionBarOverlayLayout.f8376m = false;
                return;
            case 10:
                R.g gVar = (R.g) this.f2029b;
                if (((ValueAnimator) gVar.f4988f) == animator) {
                    gVar.f4988f = null;
                    return;
                }
                return;
            default:
                C1875f c1875f = (C1875f) this.f2029b;
                c1875f.f16686b.setTranslationY(0.0f);
                c1875f.b(0.0f);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2028a) {
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                K0.f fVar = (K0.f) this.f2029b;
                ArrayList arrayList = new ArrayList(fVar.f2542h);
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((C5.c) arrayList.get(i4)).b(fVar);
                }
                return;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                ((V) this.f2029b).F();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public e(V v8, View view) {
        this.f2028a = 6;
        this.f2029b = v8;
    }
}
