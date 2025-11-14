package l5;

import A5.h;
import P.F;
import P.O;
import R.g;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.datepicker.i;
import g0.L;
import i.E;
import java.util.ArrayList;
import java.util.WeakHashMap;
import z5.C1872c;
import z5.InterfaceC1871b;

/* renamed from: l5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC1035e extends E {

    /* renamed from: i, reason: collision with root package name */
    public BottomSheetBehavior f12304i;
    public FrameLayout j;
    public CoordinatorLayout k;

    /* renamed from: l, reason: collision with root package name */
    public FrameLayout f12305l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12306m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12307n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12308o;

    /* renamed from: p, reason: collision with root package name */
    public C1034d f12309p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f12310q;

    /* renamed from: r, reason: collision with root package name */
    public g f12311r;

    /* renamed from: s, reason: collision with root package name */
    public final C1033c f12312s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogC1035e(Context context) {
        super(context, r0);
        int i4;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true)) {
            i4 = typedValue.resourceId;
        } else {
            i4 = R.style.Theme_Design_Light_BottomSheetDialog;
        }
        this.f12306m = true;
        this.f12307n = true;
        this.f12312s = new C1033c(this);
        d().g(1);
        this.f12310q = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
        this.f12310q = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f12304i == null) {
            f();
        }
        super.cancel();
    }

    public final void f() {
        if (this.j == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.j = frameLayout;
            this.k = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.j.findViewById(R.id.design_bottom_sheet);
            this.f12305l = frameLayout2;
            BottomSheetBehavior B8 = BottomSheetBehavior.B(frameLayout2);
            this.f12304i = B8;
            ArrayList arrayList = B8.f9957W;
            C1033c c1033c = this.f12312s;
            if (!arrayList.contains(c1033c)) {
                arrayList.add(c1033c);
            }
            this.f12304i.G(this.f12306m);
            this.f12311r = new g(this.f12304i, this.f12305l);
        }
    }

    public final FrameLayout h(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        f();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.j.findViewById(R.id.coordinator);
        if (i4 != 0 && view == null) {
            view = getLayoutInflater().inflate(i4, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f12310q) {
            FrameLayout frameLayout = this.f12305l;
            L l6 = new L(5, this);
            WeakHashMap weakHashMap = O.f4214a;
            F.l(frameLayout, l6);
        }
        this.f12305l.removeAllViews();
        if (layoutParams == null) {
            this.f12305l.addView(view);
        } else {
            this.f12305l.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new h(3, this));
        O.m(this.f12305l, new i(1, this));
        this.f12305l.setOnTouchListener(new J5.b(1));
        return this.j;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        boolean z8;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.f12310q && Color.alpha(window.getNavigationBarColor()) < 255) {
                z8 = true;
            } else {
                z8 = false;
            }
            FrameLayout frameLayout = this.j;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z8);
            }
            CoordinatorLayout coordinatorLayout = this.k;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z8);
            }
            E2.d.J(window, !z8);
            C1034d c1034d = this.f12309p;
            if (c1034d != null) {
                c1034d.e(window);
            }
        }
        g gVar = this.f12311r;
        if (gVar != null) {
            View view = (View) gVar.f4989g;
            C1872c c1872c = (C1872c) gVar.f4987e;
            if (this.f12306m) {
                if (c1872c != null) {
                    c1872c.b((InterfaceC1871b) gVar.f4988f, view, false);
                }
            } else if (c1872c != null) {
                c1872c.c(view);
            }
        }
    }

    @Override // i.E, c.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        C1872c c1872c;
        C1034d c1034d = this.f12309p;
        if (c1034d != null) {
            c1034d.e(null);
        }
        g gVar = this.f12311r;
        if (gVar != null && (c1872c = (C1872c) gVar.f4987e) != null) {
            c1872c.c((View) gVar.f4989g);
        }
    }

    @Override // c.m, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f12304i;
        if (bottomSheetBehavior != null && bottomSheetBehavior.f9946L == 5) {
            bottomSheetBehavior.I(4);
        }
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z8) {
        g gVar;
        super.setCancelable(z8);
        if (this.f12306m != z8) {
            this.f12306m = z8;
            BottomSheetBehavior bottomSheetBehavior = this.f12304i;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.G(z8);
            }
            if (getWindow() != null && (gVar = this.f12311r) != null) {
                View view = (View) gVar.f4989g;
                C1872c c1872c = (C1872c) gVar.f4987e;
                if (this.f12306m) {
                    if (c1872c != null) {
                        c1872c.b((InterfaceC1871b) gVar.f4988f, view, false);
                    }
                } else if (c1872c != null) {
                    c1872c.c(view);
                }
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z8) {
        super.setCanceledOnTouchOutside(z8);
        if (z8 && !this.f12306m) {
            this.f12306m = true;
        }
        this.f12307n = z8;
        this.f12308o = true;
    }

    @Override // i.E, c.m, android.app.Dialog
    public final void setContentView(int i4) {
        super.setContentView(h(null, i4, null));
    }

    @Override // i.E, c.m, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(h(view, 0, null));
    }

    @Override // i.E, c.m, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(h(view, 0, layoutParams));
    }
}
