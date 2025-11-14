package H5;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class d extends E2.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2026f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C.c f2027g;

    public /* synthetic */ d(C.c cVar, int i4) {
        this.f2026f = i4;
        this.f2027g = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r6.canScrollVertically(-1) != false) goto L27;
     */
    @Override // E2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E0(View view, int i4) {
        WeakReference weakReference;
        View view2;
        switch (this.f2026f) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2027g;
                if (sideSheetBehavior.f10215h == 1 || (weakReference = sideSheetBehavior.f10221p) == null || weakReference.get() != view) {
                    return false;
                }
                return true;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2027g;
                int i8 = bottomSheetBehavior.f9946L;
                if (i8 != 1 && !bottomSheetBehavior.f9963b0) {
                    if (i8 == 3 && bottomSheetBehavior.f9959Z == i4) {
                        WeakReference weakReference2 = bottomSheetBehavior.f9956V;
                        if (weakReference2 != null) {
                            view2 = (View) weakReference2.get();
                        } else {
                            view2 = null;
                        }
                        if (view2 != null) {
                            break;
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f9955U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // E2.c
    public final int K(View view, int i4) {
        switch (this.f2026f) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2027g;
                return AbstractC1492c.i(i4, sideSheetBehavior.f10208a.L(), sideSheetBehavior.f10208a.K());
            default:
                return view.getLeft();
        }
    }

    @Override // E2.c
    public final int L(View view, int i4) {
        switch (this.f2026f) {
            case 0:
                return view.getTop();
            default:
                return AbstractC1492c.i(i4, ((BottomSheetBehavior) this.f2027g).D(), b0());
        }
    }

    @Override // E2.c
    public int a0(View view) {
        switch (this.f2026f) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2027g;
                return sideSheetBehavior.f10217l + sideSheetBehavior.f10220o;
            default:
                return super.a0(view);
        }
    }

    @Override // E2.c
    public int b0() {
        switch (this.f2026f) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2027g;
                if (bottomSheetBehavior.f9944I) {
                    return bottomSheetBehavior.f9954T;
                }
                return bottomSheetBehavior.f9942G;
            default:
                return super.b0();
        }
    }

    @Override // E2.c
    public final void j0(int i4) {
        switch (this.f2026f) {
            case 0:
                if (i4 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2027g;
                    if (sideSheetBehavior.f10214g) {
                        sideSheetBehavior.x(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i4 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2027g;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.J(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // E2.c
    public final void k0(View view, int i4, int i8) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f2026f) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2027g;
                WeakReference weakReference = sideSheetBehavior.f10222q;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f10208a.J0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f10227v;
                if (!linkedHashSet.isEmpty()) {
                    sideSheetBehavior.f10208a.h(i4);
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    return;
                }
                return;
            default:
                ((BottomSheetBehavior) this.f2027g).z(i8);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r0.f9940E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r0.D()) < java.lang.Math.abs(r6.getTop() - r0.f9940E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f9939D) < java.lang.Math.abs(r7 - r0.f9942G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0113, code lost:
    
        if (r0.f10208a.c0(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f10208a.H()) < java.lang.Math.abs(r7 - r0.f10208a.I())) goto L73;
     */
    @Override // E2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l0(View view, float f8, float f9) {
        int i4;
        switch (this.f2026f) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2027g;
                if (!sideSheetBehavior.f10208a.Z(f8)) {
                    if (sideSheetBehavior.f10208a.z0(view, f8)) {
                        if (!sideSheetBehavior.f10208a.d0(f8, f9)) {
                            break;
                        }
                        i4 = 5;
                    } else {
                        if (f8 == 0.0f || Math.abs(f8) <= Math.abs(f9)) {
                            int left = view.getLeft();
                            break;
                        }
                        i4 = 5;
                    }
                    sideSheetBehavior.z(view, i4, true);
                    return;
                }
                i4 = 3;
                sideSheetBehavior.z(view, i4, true);
                return;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2027g;
                int i8 = 6;
                if (f9 < 0.0f) {
                    if (!bottomSheetBehavior.f9962b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i8 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.L(view, i8, true);
                    return;
                }
                if (bottomSheetBehavior.f9944I && bottomSheetBehavior.K(view, f9)) {
                    if (Math.abs(f8) >= Math.abs(f9) || f9 <= bottomSheetBehavior.f9966d) {
                        if (view.getTop() <= (bottomSheetBehavior.D() + bottomSheetBehavior.f9954T) / 2) {
                            if (!bottomSheetBehavior.f9962b) {
                                break;
                            }
                            i8 = 3;
                            bottomSheetBehavior.getClass();
                            bottomSheetBehavior.L(view, i8, true);
                            return;
                        }
                    }
                    i8 = 5;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.L(view, i8, true);
                    return;
                }
                if (f9 != 0.0f && Math.abs(f8) <= Math.abs(f9)) {
                    if (!bottomSheetBehavior.f9962b) {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - bottomSheetBehavior.f9940E) < Math.abs(top2 - bottomSheetBehavior.f9942G)) {
                            bottomSheetBehavior.getClass();
                        }
                    }
                    i8 = 4;
                } else {
                    int top3 = view.getTop();
                    if (bottomSheetBehavior.f9962b) {
                        break;
                    } else {
                        int i9 = bottomSheetBehavior.f9940E;
                        if (top3 < i9) {
                            if (top3 >= Math.abs(top3 - bottomSheetBehavior.f9942G)) {
                                bottomSheetBehavior.getClass();
                            }
                            i8 = 3;
                        } else {
                            if (Math.abs(top3 - i9) < Math.abs(top3 - bottomSheetBehavior.f9942G)) {
                                bottomSheetBehavior.getClass();
                            }
                            i8 = 4;
                        }
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.L(view, i8, true);
                return;
        }
    }
}
