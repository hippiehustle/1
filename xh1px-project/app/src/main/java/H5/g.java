package H5;

import L5.x;
import P.O;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2031a;

    /* renamed from: b, reason: collision with root package name */
    public int f2032b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2033c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f2034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C.c f2035e;

    public g(SideSheetBehavior sideSheetBehavior) {
        this.f2031a = 0;
        this.f2035e = sideSheetBehavior;
        this.f2034d = new E.a(1, this);
    }

    public final void a(int i4) {
        int i8 = this.f2031a;
        Runnable runnable = this.f2034d;
        C.c cVar = this.f2035e;
        switch (i8) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) cVar;
                WeakReference weakReference = sideSheetBehavior.f10221p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f2032b = i4;
                    if (!this.f2033c) {
                        WeakHashMap weakHashMap = O.f4214a;
                        ((View) sideSheetBehavior.f10221p.get()).postOnAnimation((E.a) runnable);
                        this.f2033c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) cVar;
                WeakReference weakReference2 = bottomSheetBehavior.f9955U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f2032b = i4;
                    if (!this.f2033c) {
                        WeakHashMap weakHashMap2 = O.f4214a;
                        ((View) bottomSheetBehavior.f9955U.get()).postOnAnimation((x) runnable);
                        this.f2033c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public g(BottomSheetBehavior bottomSheetBehavior) {
        this.f2031a = 1;
        this.f2035e = bottomSheetBehavior;
        this.f2034d = new x(8, this);
    }
}
